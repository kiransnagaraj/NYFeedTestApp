package com.mauqah.nyfeedtestapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mauqah.nyfeedtestapp.adapter.NewsFeedAdapter;
import com.mauqah.nyfeedtestapp.model.NewsFeed;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.mauqah.nyfeedtestapp.common.Utils.KEY_BY_LINE;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_CAPTION;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_COPYRIGHT;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_DATE;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_DESCRIPTION;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_TITLE;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_URL;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private NewsFeedAdapter mNewsFeedAdapter;
    private ArrayList<NewsFeed> mNewsFeedList;
    private RequestQueue mRequestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mNewsFeedList = new ArrayList<>();

        mRequestQueue = Volley.newRequestQueue(this);
        parseJSON();
    }

    private void parseJSON() {


        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, getURl(), null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            Gson gson = new Gson();
                            NewsFeed newsFeed = gson.fromJson(response.toString(), NewsFeed.class);

                            for(int i=0;i<newsFeed.getResults().size();i++){
                                mNewsFeedList.add(new NewsFeed(newsFeed.getStatus(),newsFeed.getCopyright(),newsFeed.getNum_results(),newsFeed.getResults()));
                            }


                            mNewsFeedAdapter = new NewsFeedAdapter(MainActivity.this, mNewsFeedList);
                            mRecyclerView.setAdapter(mNewsFeedAdapter);
                            mRecyclerView.addOnItemTouchListener(
                                    new RecyclerItemClickListener(getApplicationContext(), mRecyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                                        @Override public void onItemClick(View view, int position) {
                                            NewsFeed currentItem = mNewsFeedList.get(position);
                                           Intent intent = new Intent(MainActivity.this,FeedDetailActivity.class);
                                            intent.putExtra(KEY_TITLE,currentItem.getResults().get(position).getTitle());
                                            intent.putExtra(KEY_DESCRIPTION,currentItem.getResults().get(position).get_abstract());
                                            intent.putExtra(KEY_URL,currentItem.getResults().get(position).getMedia().get(0).getMediaMetadata().get(6).getUrl());
                                            intent.putExtra(KEY_CAPTION,currentItem.getResults().get(position).getMedia().get(0).getCaption());
                                            intent.putExtra(KEY_COPYRIGHT,currentItem.getResults().get(position).getMedia().get(0).getCopyright());
                                            intent.putExtra(KEY_BY_LINE,currentItem.getResults().get(position).getByline());
                                            intent.putExtra(KEY_DATE,currentItem.getResults().get(position).getPublished_date());
                                           startActivity(intent);
                                        }

                                        @Override public void onLongItemClick(View view, int position) {

                                        }
                                    })
                            );

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        mRequestQueue.add(request);
    }

    private String getURl(){
        return "http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=SH5WbRl9kJyCxmAU6XiZJsHWIip0SNc2";
    }
}

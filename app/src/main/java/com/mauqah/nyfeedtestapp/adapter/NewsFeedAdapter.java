package com.mauqah.nyfeedtestapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.mauqah.nyfeedtestapp.R;
import com.mauqah.nyfeedtestapp.model.NewsFeed;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * The type News feed adapter.
 */
public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.NewsFeedViewHolder> {
    private Context mContext;
    private ArrayList<NewsFeed> mNewsFeedList;

    /**
     * Instantiates a new News feed adapter.
     *
     * @param context   the context
     * @param newsFeeds the news feeds
     */
    public NewsFeedAdapter(Context context, ArrayList<NewsFeed> newsFeeds) {
        mContext = context;
        mNewsFeedList = newsFeeds;
    }

    @Override
    public NewsFeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_row_layout, parent, false);
        return new NewsFeedViewHolder(v);
    }


    @Override
    public void onBindViewHolder(NewsFeedViewHolder holder, int position) {
        NewsFeed currentItem = mNewsFeedList.get(position);

        String imageUrl = currentItem.getResults().get(position).getMedia().get(0).getMediaMetadata().get(1).getUrl();
        String title  = currentItem.getResults().get(position).getTitle();
        String description = currentItem.getResults().get(position).get_abstract();
        String byName = currentItem.getResults().get(position).getByline();
        String date = currentItem.getResults().get(position).getPublished_date();


        holder.textNewsTitle.setText(title);
        holder.textNewsDescription.setText(description);
        holder.textNewsBy.setText(byName);
        holder.textNewsDate.setText(date);
        Picasso.with(mContext).load(imageUrl).fit().centerInside().into(holder.imageNewsFeed);
    }

    @Override
    public int getItemCount() {
        return mNewsFeedList.size();
    }

    /**
     * The type News feed view holder.
     */
    public class NewsFeedViewHolder extends RecyclerView.ViewHolder {
        /**
         * The Image news feed.
         */
        public ImageView imageNewsFeed;
        /**
         * The Text news title.
         */
        public TextView textNewsTitle;
        /**
         * The Text news by.
         */
        public TextView textNewsBy;
        /**
         * The Text news description.
         */
        public TextView textNewsDescription;
        /**
         * The Text news date.
         */
        public TextView textNewsDate;

        /**
         * Instantiates a new News feed view holder.
         *
         * @param itemView the item view
         */
        public NewsFeedViewHolder(View itemView) {
            super(itemView);
            imageNewsFeed = itemView.findViewById(R.id.imageViewNewsFeed);
            textNewsTitle = itemView.findViewById(R.id.textViewTitle);
            textNewsBy = itemView.findViewById(R.id.textViewBy);
            textNewsDescription = itemView.findViewById(R.id.textViewDescription);
            textNewsDate = itemView.findViewById(R.id.textViewDatePublished);
        }
    }
}
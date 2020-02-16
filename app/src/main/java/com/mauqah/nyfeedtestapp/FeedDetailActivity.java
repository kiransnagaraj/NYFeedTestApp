package com.mauqah.nyfeedtestapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.mauqah.nyfeedtestapp.common.Utils.KEY_BY_LINE;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_CAPTION;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_COPYRIGHT;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_DATE;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_DESCRIPTION;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_TITLE;
import static com.mauqah.nyfeedtestapp.common.Utils.KEY_URL;

/**
 * The type Feed detail activity.
 */
public class FeedDetailActivity extends AppCompatActivity {
    /**
     * The Text title.
     */
    TextView textTitle, /**
     * The Text description.
     */
    textDescription, /**
     * The Text copyright.
     */
    textCopyright, /**
     * The Text caption.
     */
    textCaption, /**
     * The Text by line.
     */
    textByLine, /**
     * The Text published date.
     */
    textPublishedDate;
    /**
     * The Image view.
     */
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_detail);

        Bundle bundle = getIntent().getExtras();


        textTitle = (TextView) findViewById(R.id.tvTitle);
        textDescription = (TextView) findViewById(R.id.tvDesc);
        textCopyright = (TextView) findViewById(R.id.tvCopyRight);
        textCaption = (TextView) findViewById(R.id.tvCaption);
        textByLine = (TextView) findViewById(R.id.tvBy);
        textPublishedDate = (TextView) findViewById(R.id.tvDatePublished);
        imageView = (ImageView)findViewById(R.id.imvSource);

        Log.d("Data",bundle.getString(KEY_TITLE));
        Log.d("Data",bundle.getString(KEY_DESCRIPTION));
        Log.d("Data",bundle.getString(KEY_COPYRIGHT));
        Log.d("Data",bundle.getString(KEY_CAPTION));
        Log.d("Data",bundle.getString(KEY_BY_LINE));
        Log.d("Data",bundle.getString(KEY_DATE));
        Log.d("Data",bundle.getString(KEY_URL));




        textTitle.setText(bundle.getString(KEY_TITLE));
        textDescription.setText(bundle.getString(KEY_DESCRIPTION));
        textCopyright.setText(bundle.getString(KEY_COPYRIGHT));
        textCaption.setText(bundle.getString(KEY_CAPTION));
        textByLine.setText(bundle.getString(KEY_BY_LINE));
        textPublishedDate.setText(bundle.getString(KEY_DATE));
        Picasso.with(getApplicationContext()).load(bundle.getString(KEY_URL)).fit().centerInside().into(imageView);





    }

}

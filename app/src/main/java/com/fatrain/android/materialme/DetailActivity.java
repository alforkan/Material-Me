package com.fatrain.android.materialme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //Initialize the views.
        TextView sportTitle = findViewById(R.id.titleDetail);
        ImageView sportImage = findViewById(R.id.sportsImageDetail);
        //Get the title from the incoming Intent and set it to the TextView.
        sportTitle.setText(getIntent().getStringExtra("title"));
        //Use Glide to load the image into the ImageView.
        Glide.with(this).load(getIntent().getIntExtra("image_resources", 0)).into(sportImage);

    }
}

package com.example.project2_finalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsSweetsActivity extends AppCompatActivity {

    ImageView mainImage;
    TextView name, description, price;

    String data1, data2;
    double cost;
    int image;
    int[] sliderImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_sweets);

        mainImage = findViewById(R.id.SweetsImage);
        name = findViewById(R.id.SweetsName);
        description = findViewById(R.id.SweetsText1);
        price = findViewById(R.id.SweetsPrice);

        setFadeTransition();
        getData();

        // image slider
        ViewPager viewPager = findViewById(R.id.ViewPager);
        ImageAdapter adapter = new ImageAdapter(this, sliderImages);
        viewPager.setAdapter(adapter);
    }

    private void setFadeTransition() {
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
    }

    // In-app action bar back button transition
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finishAfterTransition();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // get image name and description of corresponding Sweets food
    private void getData() {
        Intent thisIntent = getIntent();
        if (thisIntent.hasExtra("name") && thisIntent.hasExtra("description") &&
                thisIntent.hasExtra("price") && thisIntent.hasExtra("image") &&
                thisIntent.hasExtra("sliderImages")) {
            data1 = getIntent().getStringExtra("name");
            data2 = thisIntent.getStringExtra("description");
            cost = thisIntent.getDoubleExtra("price", 1);
            image = thisIntent.getIntExtra("image", 1);
            sliderImages = thisIntent.getIntArrayExtra("sliderImages");
            setData();
        } else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    // set the views to match
    private void setData() {
        name.setText(data1);
        description.setText(data2);
        String tempPrice = "Price: $" + cost;
        price.setText(tempPrice);
        mainImage.setImageResource(image);
    }
}

package com.example.project2_finalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Food> topFood = new ArrayList<>();
    EditText search_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataProvider.setSweets();
        DataProvider.setSavoury();
        DataProvider.setDrinks();
        setRecyclerView();
        setSearch_text();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        setRecyclerView();
        setSearch_text();
    }

    public void setRecyclerView() {
        // Top Picks
        recyclerView = findViewById(R.id.topRecycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        topFood = DataProvider.getTopPicks();
        TopAdapter topAdapt = new TopAdapter(this, topFood);
        recyclerView.setAdapter(topAdapt);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void setSearch_text() {
        search_text = findViewById(R.id.action_search);
        search_text.setOnEditorActionListener(editorListener);
    }

    // Sweets Section
    public void showSweetsActivity(View v) {
        Intent sweetsIntent = new Intent(this, SweetsActivity.class);
        startActivity(sweetsIntent);
    }

    // Savoury Section
    public void showSavouryActivity(View v) {
        Intent savourIntent = new Intent(this, SavouryActivity.class);
        startActivity(savourIntent);
    }

    // Drinks Section
    public void showDrinksActivity(View v) {
        Intent DrinksIntent = new Intent(this, DrinksActivity.class);
        startActivity(DrinksIntent);
    }

    // Search Activity
    public void showSearchActivity() {
        String food_text = search_text.getText().toString();
        Intent SearchIntent = new Intent(this, SearchActivity.class);
        SearchIntent.putExtra("text_string", food_text);
        startActivity(SearchIntent);
    }

    private TextView.OnEditorActionListener editorListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId == EditorInfo.IME_ACTION_DONE)
                showSearchActivity();
            return false;
        }
    };

}


package com.example.project2_finalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

// Reference: https://www.youtube.com/watch?v=sJ-Z9G0SDhc


public class SearchActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Food> Foods = new ArrayList<>();
    private MyAdapter adapter;
    public static TextView b;
    private String string1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        b = findViewById(R.id.empty_id);

        recyclerView = findViewById(R.id.recyclerView);
        Foods = DataProvider.getFoods();


        if (getIntent().hasExtra("text_string")) {
            string1 = getIntent().getStringExtra("text_string");
        }

        adapter = new MyAdapter(this, Foods);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.ItemDecoration divider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(divider); // Create dividers below each cardView
    }

    @Override
    //
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        // Activate own options menu
        inflater.inflate(R.menu.menu_search, menu);
        // Reference to action_search
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setIconified(false); // Set search view always open
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            // Filter List when submit
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            // Filter List in Real time
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }

        });
        // Pass String from Main activity to SearchActivity so it is prefilled
        searchView.setQuery(string1, false);
        searchView.clearFocus();
        return true;
    }
}
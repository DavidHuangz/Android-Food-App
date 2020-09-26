package com.example.project2_finalapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

// Reference: https://www.youtube.com/watch?v=Vyqz_-sJGFk


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements Filterable {

    private ArrayList<Food> FoodItems;
    private ArrayList<Food> FoodItems_search;
    private Context context;

    public MyAdapter(Context ct, ArrayList<Food> items) {
        this.context = ct;
        this.FoodItems = items;
        // Create new array as a copy of FoodItems to use independently
        FoodItems_search = new ArrayList<>(FoodItems);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.my_row, parent, false);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.myText1.setText(FoodItems.get(position).getName());
        holder.myText2.setText(FoodItems.get(position).getDescription());
        holder.myImage.setImageResource(FoodItems.get(position).getImage());


        holder.FoodLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodItems.get(position).increaseCount(); // increase count for top picks
                Intent intent;
                if (FoodItems.get(position).getFoodType().equals("Sweets")) {
                    intent = new Intent(context, DetailsSweetsActivity.class);
                } else if (FoodItems.get(position).getFoodType().equals("Savoury")) {
                    intent = new Intent(context, DetailsSavouryActivity.class);
                } else {
                    intent = new Intent(context, DetailsDrinksActivity.class);
                }
                intent.putExtra("name", FoodItems.get(position).getName());
                intent.putExtra("description", FoodItems.get(position).getDescription());
                intent.putExtra("price", FoodItems.get(position).getPrice());
                intent.putExtra("image", FoodItems.get(position).getImage());
                intent.putExtra("sliderImages", FoodItems.get(position).getSliderImages());

                // shared element transition of image
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        (Activity) context, holder.myImage, "foodImage");
                context.startActivity(intent, options.toBundle());
            }
        });


    }

    @Override
    public int getItemCount() {
        return FoodItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView myText1, myText2;
        ImageView myImage;
        ConstraintLayout FoodLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myImage = itemView.findViewById(R.id.myImageView);
            FoodLayout = itemView.findViewById(R.id.FoodLayout);
        }
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @NotNull
        @Override
        // PerformFiltering performs on back on thread where complex filter logic will not freeze app
        // constraint is the input data in search bar
        protected FilterResults performFiltering(CharSequence constraint) {
            // ArrayList for filtered item for search bar
            ArrayList<Food> filteredList = new ArrayList<>();

            // If empty input field, Show all results to the user
            if (constraint == null || constraint.length() == 0) {
                filteredList.clear();
                // Add copy of the full list to filteredList
                filteredList.addAll(FoodItems_search);
            } else {
                // New string with no empty space and lower case
                String filterPattern = constraint.toString().toLowerCase().trim();

                // Check if any items in our original full ArrayList matches to String filterPattern
                for (Food item : FoodItems_search) {
                    // Filters for Title and description
                    if (item.getName().toLowerCase().contains(filterPattern) || item.getDescription().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }
            // Return Filtered ArrayList to PublishResults Method
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        @SuppressWarnings("unchecked")
        protected void publishResults(CharSequence constraint, @org.jetbrains.annotations.NotNull FilterResults results) {
            FoodItems.clear();
            // Add items of filteredList to FoodItems
            FoodItems.addAll((ArrayList) results.values);

            // If FoodItems list is empty, make message visible for user to see
            if (FoodItems.isEmpty()) {
                SearchActivity.b.setVisibility(View.VISIBLE);
            } else {
                SearchActivity.b.setVisibility(View.INVISIBLE);
            }
            notifyDataSetChanged();
        }
    };
}

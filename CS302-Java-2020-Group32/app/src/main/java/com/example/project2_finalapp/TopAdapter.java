package com.example.project2_finalapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.ViewHolder> {

    ArrayList<Food> FoodItems;
    Context context;

    public TopAdapter(Context ct, ArrayList<Food> items) {
        context = ct;
        FoodItems = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.top_picks, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.Text.setText(FoodItems.get(position).getName());
        holder.Image.setImageResource(FoodItems.get(position).getImage());

        holder.Layout.setOnClickListener(new View.OnClickListener() {
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
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return FoodItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Text;
        ImageView Image;
        LinearLayout Layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Text = itemView.findViewById(R.id.topFood);
            Image = itemView.findViewById(R.id.topImage);
            Layout = itemView.findViewById(R.id.topLayout);
        }
    }
}

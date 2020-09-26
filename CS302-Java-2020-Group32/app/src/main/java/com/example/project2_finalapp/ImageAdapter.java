package com.example.project2_finalapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

// Reference: https://www.youtube.com/watch?v=Q2FPDI99-as&t=206s


public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    // Retrieve from Food --> myAdapter --> Details --> mImageIds
    private int[] mImageIds;

    // Pass SliderImages
    public ImageAdapter(Context context, int[] images) {
        mContext = context;
        mImageIds = images;
    }

    @Override
    // Return length of mImageIds
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    // Create if ImageView belongs to object identifier
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        // Show Image depending on position
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    // Removes Image when item is destroyed
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}

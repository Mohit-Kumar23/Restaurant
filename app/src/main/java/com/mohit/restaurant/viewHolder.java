package com.mohit.restaurant;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {

    public TextView rest_name,location,timing,sp_food;
    public ImageView food_img;

    public viewHolder(@NonNull View itemView) {
        super(itemView);
        rest_name=(TextView)itemView.findViewById(R.id.restaurant_name_tv);
        location=(TextView)itemView.findViewById(R.id.location_tv);
        timing=(TextView)itemView.findViewById(R.id.timing_tv);
        sp_food=(TextView)itemView.findViewById(R.id.special_food_tv);
        food_img=(ImageView)itemView.findViewById(R.id.food_img);
    }
}

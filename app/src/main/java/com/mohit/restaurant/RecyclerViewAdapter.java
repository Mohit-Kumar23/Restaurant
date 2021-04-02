package com.mohit.restaurant;

import android.annotation.SuppressLint;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<viewHolder> {

    String[]restaurant_name;
    String[] location_list;
    String[] timing_list;
    String[] sp_food_list;
    ArrayList<String> food_img_list;
    int[] image_id_list;
    Context context;

    public RecyclerViewAdapter(String[] restaurant_name, String[] location_list,
                               String[] timing_list, String[] sp_food_list,int[] image_id_list, /*ArrayList<Uri> food_img_list,*/
                               Context context)
    {
        this.restaurant_name=restaurant_name;
        this.location_list=location_list;
        this.timing_list=timing_list;
        this.sp_food_list=sp_food_list;
        this.image_id_list=image_id_list;
        //this.food_img_list=food_img_list;
        this.context=context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.single_row,parent,false);

        return new viewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.rest_name.setText(restaurant_name[position]);
        holder.location.setText(holder.location.getText().toString()+location_list[position]);
        holder.sp_food.setText(holder.sp_food.getText().toString()+sp_food_list[position]);
        holder.timing.setText(holder.timing.getText().toString()+timing_list[position]);
        holder.food_img.setImageResource(image_id_list[position]);

    }

    @Override
    public int getItemCount() {
        return restaurant_name.length;
    }
}

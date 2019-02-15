package com.hoangloc.mytemplate;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterRCV extends RecyclerView.Adapter<AdapterRCV.RecyclerViewHolder> {


    public AdapterRCV(List<Integer> data) {
//        if (data == null) {
//            this.data = new ArrayList<>();
//            return;
//        }
//        this.data = data;
    }

    public void setData(List<Integer> newData) {
//        if (newData == null)
//            return;
//        this.data = newData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_vertical, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
//        if (data == null)
//            return;

        holder.textViewMinTemp.setText("123");
        holder.textViewMaxTemp.setText("456");
//        holder.imageViewWeatherStatus.setBackgroundResource();
        holder.textViewDaysOfWeek.setText("123456");
        holder.textViewDaysOfWeek.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewDaysOfWeek, textViewMinTemp, textViewMaxTemp;
        ImageView imageViewWeatherStatus;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textViewDaysOfWeek = itemView.findViewById(R.id.textViewDaysOfWeek);
            textViewMinTemp = itemView.findViewById(R.id.textViewForecastMinTemp);
            textViewMaxTemp = itemView.findViewById(R.id.textViewForecastMaxTemp);
            imageViewWeatherStatus = itemView.findViewById(R.id.imageViewWeatherStatus);
        }
    }


}
package com.example.asssin.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.asssin.R;
import com.example.asssin.model.CatagoryModel;

import java.util.List;

public class Catagory_Adapter extends RecyclerView.Adapter<Catagory_Adapter.PlateViewholder>  {
private Context context;
private List<CatagoryModel> catagory;

    public Catagory_Adapter(Context context, List<CatagoryModel> catagory) {
        this.context = context;
        this.catagory = catagory;
    }

    @NonNull
    @Override
    public PlateViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.catagory_row,parent,false);
        return new PlateViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlateViewholder holder, int position) {
CatagoryModel catagoryModel=catagory.get(position);
holder.Cat_name.setText(catagory.get(position).getCat_title());
        Glide.with(context).load(catagoryModel.getCat_img()).placeholder(R.drawable.plate1).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return catagory.size();
    }

    public class PlateViewholder extends RecyclerView.ViewHolder {
private ImageView imageView;
private TextView Cat_name;
        public PlateViewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.Cat_image);
            Cat_name=itemView.findViewById(R.id.Cat_name);
        }
    }
}

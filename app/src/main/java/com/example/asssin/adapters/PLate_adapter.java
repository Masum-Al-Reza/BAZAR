package com.example.asssin.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.asssin.R;
import com.example.asssin.model.Plate_class;

import java.util.List;

public class PLate_adapter extends RecyclerView.Adapter<PLate_adapter.Viewholder> {

    private  List<Plate_class>plate_list;
    private Context context;

    public PLate_adapter(List<Plate_class> plate_list, Context context) {
        this.plate_list = plate_list;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plate_layout,viewGroup,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Plate_class plate_class=plate_list.get(position);
        Glide.with(context).load(plate_class.getPlate_image()).into(holder.plateimage);

    }

    @Override
    public int getItemCount() {
        return plate_list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView plateimage;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            plateimage=itemView.findViewById(R.id.plate_image);
        }
    }
}

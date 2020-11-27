package com.example.asssin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.asssin.adapters.PLate_adapter;
import com.example.asssin.model.Plate_class;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Plate_class> platelist;
    private PLate_adapter pLate_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(recyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        platelist=new ArrayList<>();
        platelist.add(new Plate_class(R.drawable.plate1));
        platelist.add(new Plate_class(R.drawable.plate1));
        platelist.add(new Plate_class(R.drawable.plate1));
        platelist.add(new Plate_class(R.drawable.plate1));
        platelist.add(new Plate_class(R.drawable.plate1));
        platelist.add(new Plate_class(R.drawable.plate1));

        pLate_adapter=new PLate_adapter(platelist,this);
        recyclerView.setAdapter(pLate_adapter);
        pLate_adapter.notifyDataSetChanged();

    }
}
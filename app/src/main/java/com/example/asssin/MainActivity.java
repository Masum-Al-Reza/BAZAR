package com.example.asssin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.asssin.adapters.PLate_adapter;
import com.example.asssin.model.Plate_class;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Plate_class> platelist;
    private PLate_adapter pLate_adapter;
    private Button skip;
    private Object Context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(recyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        skip=findViewById(R.id.skipid);
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
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Home_activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
package com.example.asssin;

import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class Golds extends Fragment  implements View.OnClickListener {
    DrawerLayout drawerLayout;
    ImageView navigationBar;


    NavigationView navigationView;
    private RelativeLayout loginsign,bookmark,gold;
    private TextView yourorder,online_ordering_help,address_book,favourite_orders,send_feedback,report_safety,rate;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.golds, container, false);
        onSetNavigationDrawerEvents();
        return view;}

    private void onSetNavigationDrawerEvents() {
        drawerLayout = (DrawerLayout) view.findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) view.findViewById(R.id.navigationView);
        loginsign = (RelativeLayout) view.findViewById(R.id.relativeLayout);
        bookmark = (RelativeLayout) view.findViewById(R.id.relativeLayout2);
        gold = (RelativeLayout) view.findViewById(R.id.relativeLayout3);
        yourorder = (TextView) view.findViewById(R.id.orderMN);
        online_ordering_help = (TextView) view.findViewById(R.id.onlineMN);
        address_book = (TextView) view.findViewById(R.id.AddressMN);
        favourite_orders = (TextView) view.findViewById(R.id.favMN);
        send_feedback = (TextView) view.findViewById(R.id.feedbackMN);
        report_safety = (TextView) view.findViewById(R.id.reportMN);
        rate = (TextView) view.findViewById(R.id.rateMN);




        navigationBar = (ImageView) view.findViewById(R.id.navigationBar);

        navigationBar.setOnClickListener(this);
        yourorder.setOnClickListener(this);
        address_book.setOnClickListener(this);
        favourite_orders.setOnClickListener(this);
        send_feedback.setOnClickListener(this);
        report_safety.setOnClickListener(this);
        rate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.navigationBar:
                drawerLayout.openDrawer(navigationView, true);
                break;
            case R.id.orderMN:
                Toast.makeText(getContext(), "one", Toast.LENGTH_SHORT).show();
                break;
            case R.id.AddressMN:
                Toast.makeText(getContext(), "two", Toast.LENGTH_SHORT).show();

                break;
            case R.id.favMN:
                Toast.makeText(getContext(), "two", Toast.LENGTH_SHORT).show();

                break;
            case R.id.feedbackMN:
                Toast.makeText(getContext(), "two", Toast.LENGTH_SHORT).show();

                break;
            case R.id.reportMN:
                Toast.makeText(getContext(), "two", Toast.LENGTH_SHORT).show();

                break;
            case R.id.rateMN:
                Toast.makeText(getContext(), "two", Toast.LENGTH_SHORT).show();

                break;




        }
    }


}
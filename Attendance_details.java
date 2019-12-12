package com.example.school_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import app.ingic.saloonik.R;

public class Attendance_details extends AppCompatActivity {

    private MyListData[] myListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_details);


         dataList();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapterR = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterR);
    }

    private void dataList()
    {
        myListData = new MyListData[]{
                new MyListData("1", "10", "2", "1", "1", "15"),
                new MyListData("3", "7", "5", "0", "1", "18"),
                new MyListData("2", "12", "2", "2", "1", "19"),
                new MyListData("4", "13", "2", "1", "1", "14"),
                new MyListData("5", "11", "2", "3", "1", "19"),
                new MyListData("6", "16", "2", "0", "1", "18"),
        };
    }
}

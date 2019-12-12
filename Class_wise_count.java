package com.example.school_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import app.ingic.saloonik.R;

public class Class_wise_count extends AppCompatActivity {

    private BarChart barChartCw;
    private BarData barDataCw;
    private BarDataSet  barDataSetCw;
    private ArrayList  barEntryCw ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_wise_count);


        barChartCw = findViewById(R.id.barchartClassWise);
        getEntriesClassWise();
        barDataSetCw = new BarDataSet(barEntryCw, "Class wise count");
        barDataCw = new BarData(barDataSetCw);
        barChartCw.setData(barDataCw);
        barDataSetCw.setColors(ColorTemplate.JOYFUL_COLORS);
        barDataSetCw.setValueTextColor(Color.BLACK);
        barDataSetCw.setValueTextSize(18f);
        barDataCw.setBarWidth(15f);

    }

    private void getEntriesClassWise() {
        barEntryCw = new ArrayList<>();
        barEntryCw.add(new BarEntry(50f, 0));
        barEntryCw.add(new BarEntry(100f, 1));
        barEntryCw.add(new BarEntry(80f, 2));
        barEntryCw.add(new BarEntry(300f, 3));
        barEntryCw.add(new BarEntry(250f, 4));

    }

}

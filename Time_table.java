package com.example.school_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import app.ingic.saloonik.R;

public class Time_table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        init();
    }
    private void init() {
        TableLayout stk = (TableLayout) findViewById(R.id.timeTable);
        stk.setShrinkAllColumns(true);
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText(" P no       ");
        tv0.setTextColor(Color.BLACK);
        tv0.setTypeface(Typeface.DEFAULT_BOLD);
        tv0.setTextSize(10);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText("Class Name     ");
        tv1.setTextColor(Color.BLACK);
        tv1.setTypeface(Typeface.DEFAULT_BOLD);
        tv1.setTextSize(10);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText(" Section Name ");
        tv2.setTextColor(Color.BLACK);
        tv2.setTypeface(Typeface.DEFAULT_BOLD);
        tv2.setTextSize(10);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(this);
        tv3.setText(" Remainder Time        ");
        tv3.setTextColor(Color.BLACK);
        tv3.setTypeface(Typeface.DEFAULT_BOLD);
        tv3.setTextSize(10);
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(this);
        tv4.setText("      End Time  ");
        tv4.setTextColor(Color.BLACK);
        tv4.setTypeface(Typeface.DEFAULT_BOLD);
        tv4.setTextSize(10);
        tbrow0.addView(tv4);
        TextView tv5 = new TextView(this);
        tv5.setText("     Remainder value ");
        tv5.setTextColor(Color.BLACK);
        tv5.setTypeface(Typeface.DEFAULT_BOLD);
        tv5.setTextSize(10);
        tbrow0.addView(tv5);
        stk.addView(tbrow0);

        String cName = "Nursery" , secName = "A" , remtime = "/Date(-2177440200000)/" , endTime= "/Date(-2177440200000)/" , remVal = "Assembly";


        for (int i = 1; i <= 30; i++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText(" "+i);
            t1v.setTextColor(Color.BLACK);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
            TextView t2v = new TextView(this);
            t2v.setText(cName);
            t2v.setTextColor(Color.BLACK);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);
            TextView t3v = new TextView(this);
            t3v.setText(secName);
            t3v.setTextColor(Color.BLACK);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);
            TextView t4v = new TextView(this);
            t4v.setText(remtime);
            t4v.setTextColor(Color.BLACK);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);
            TextView t5v = new TextView(this);
            t5v.setText("    "+endTime);
            t5v.setTextColor(Color.BLACK);
            t5v.setGravity(Gravity.CENTER);
            tbrow.addView(t5v);
            TextView t6v = new TextView(this);
            t6v.setText(remVal);
            t6v.setTextColor(Color.BLACK);
            t6v.setGravity(Gravity.CENTER);
            tbrow.addView(t6v);
            stk.addView(tbrow);
        }

    }


}

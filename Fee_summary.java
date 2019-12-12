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

public class Fee_summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_summary);
        init();
    }

    private void init() {
        TableLayout stk = (TableLayout) findViewById(R.id.feeTable);
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText(" Month               ");
        tv0.setTextColor(Color.BLACK);
        tv0.setTypeface(Typeface.DEFAULT_BOLD);
        tv0.setTextSize(15);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText(" Total                ");
        tv1.setTextColor(Color.BLACK);
        tv1.setTypeface(Typeface.DEFAULT_BOLD);
        tv1.setTextSize(15);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText(" Received           ");
        tv2.setTextColor(Color.BLACK);
        tv2.setTypeface(Typeface.DEFAULT_BOLD);
        tv2.setTextSize(15);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(this);
        tv3.setText(" Balance          ");
        tv3.setTextColor(Color.BLACK);
        tv3.setTypeface(Typeface.DEFAULT_BOLD);
        tv3.setTextSize(15);
        tbrow0.addView(tv3);
        stk.addView(tbrow0);


        for (int i = 0; i < 25; i++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText (i*1000+ " Rs");
            t1v.setTextColor(Color.BLACK);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
            TextView t2v = new TextView(this);
            t2v.setText(i*2000+ " Rs");
            t2v.setTextColor(Color.BLACK);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);
            TextView t3v = new TextView(this);
            t3v.setText(i*3000+" Rs");
            t3v.setTextColor(Color.BLACK);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);
            TextView t4v = new TextView(this);
            t4v.setText("" + i * 15 / 32 * 10+" Rs");
            t4v.setTextColor(Color.BLACK);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);
            stk.addView(tbrow);
        }

    }
}

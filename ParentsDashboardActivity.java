package com.example.school_app;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.school_app.Adapter.childListAdapter;

import app.ingic.saloonik.R;

public class ParentsDashboardActivity extends AppCompatActivity {


    private ListView list;
    private Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents_dashboard);

        myDialog = new Dialog(this);



        String[] maintitle ={
                "Title 1","Title 2",
                "Title 3","Title 4",
                "Title 5",
        };

        String[] subtitle ={
                "Sub Title 1","Sub Title 2",
                "Sub Title 3","Sub Title 4",
                "Sub Title 5",
        };

        Integer[] imgid={
                R.drawable.ic_account_circle_white_24dp,R.drawable.ic_account_circle_white_24dp,
                R.drawable.ic_account_circle_white_24dp,R.drawable.ic_account_circle_white_24dp,
                R.drawable.ic_account_circle_white_24dp,
        };




        childListAdapter adapter=new childListAdapter(this, maintitle, subtitle,imgid);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);


            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    // TODO Auto-generated method stub
                    if(position == 0) {
                        //code specific to first list item
                        Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                    }

                    else if(position == 1) {
                        //code specific to 2nd list item
                        Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                    }

                    else if(position == 2) {

                        Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                    }
                    else if(position == 3) {

                        Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                    }
                    else if(position == 4) {

                        Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }


    public void showPopup(View view) {

        TextView txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.custompopup);
       /* txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("M");
        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });*/
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();


    }
}

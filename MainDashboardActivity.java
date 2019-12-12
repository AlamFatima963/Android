package com.example.school_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.Toolbar;

import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;


import com.example.school_app.Adapter.CustomExpandableListAdapter;
import com.example.school_app.Helper.FragmentNavigationManager;
import com.example.school_app.Interface.NavigationManager;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import app.ingic.saloonik.R;

import static android.media.CamcorderProfile.get;

public class MainDashboardActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToogle;
    private String mActivityTitle;
    private String[] items;

    private ExpandableListView expandableListView;
    private ExpandableListAdapter adapter;
    private List<String> lstTitle;
    private Map<String , List<String>> lstChild;
    private NavigationManager navigationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);


        // Drawer layout navigation bar
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        expandableListView = (ExpandableListView)findViewById(R.id.navList);
        navigationManager = FragmentNavigationManager.getInstance(this);

        initItems();

        View listHeaderView = getLayoutInflater().inflate(R.layout.nav_header , null , false);
        expandableListView.addHeaderView(listHeaderView);
        
        genData();

        addDrawrItems();
        setUpDrawer();

        if(savedInstanceState == null)
        {
            selectFirstItemAsDefault();
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("School_app");

    }

    private void selectFirstItemAsDefault() {
        if(navigationManager != null)
        {
            String firstItem = lstTitle.get(0);
            navigationManager.showFragmnt(firstItem);
            getSupportActionBar().setTitle(firstItem);
        }

    }

    private void setUpDrawer() {
        mDrawerToogle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open , R.string.close)
        {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("School_app");
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu();
            }
        };

        mDrawerToogle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToogle);

    }

    private void addDrawrItems() {
        adapter = new CustomExpandableListAdapter(this,lstTitle , lstChild);
        expandableListView.setAdapter(adapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                getSupportActionBar().setTitle(lstTitle.get(groupPosition).toString()); // set title for toolbar
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                getSupportActionBar().setTitle("School_app");
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //Change fragment when click on item

                String selectedItem = ((List)(lstChild.get(lstTitle.get(groupPosition)))).get(childPosition).toString();
                 getSupportActionBar().setTitle(selectedItem);

                 if(items[0].equals(lstTitle.get(groupPosition)))
                     navigationManager.showFragmnt(selectedItem);
                 else
                     throw new IllegalArgumentException("Not Supported fragment");


                 mDrawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });
    }

    private void genData() {
        List<String> title = Arrays.asList("DashBoard" , "User" , "Fees" , "School" , "Accounts");
        List<String> childItem = Arrays.asList("test" , "test" , "test" , "test");

        lstChild = new TreeMap<>();
        for(int i = 0 ; i < title.size() ; i++)
        {
            lstChild.put(title.get(i),childItem);
        }

        lstTitle = new ArrayList<>(lstChild.keySet());


    }

    private void initItems() {
        items = new String[]{"DashBoard" , "User" , "Fees" , "School" , "Accounts"};
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }



    public void attendanceDetail(View view) {
        startActivity(new Intent(this , Attendance_details.class));
    }

    public void currentSessionDetails(View view) {
        startActivity(new Intent(this , Current_session_details.class));
    }

    public void feeSummary(View view) {
        startActivity(new Intent(this , Fee_summary.class));
    }

    public void timeTable(View view) {
        startActivity(new Intent(this , Time_table.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate((R.menu.main_menu),menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}





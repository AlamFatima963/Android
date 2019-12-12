package com.example.school_app.Helper;

import androidx.fragment.app.FragmentManager;

import com.example.school_app.Interface.NavigationManager;
import com.example.school_app.MainDashboardActivity;

public class FragmentNavigationManager implements NavigationManager {

    private static FragmentNavigationManager mInstance;
    private FragmentManager mFragmentManager;
    private MainDashboardActivity mainDashboardActivity;


    public static FragmentNavigationManager getInstance(MainDashboardActivity mainDashboardActivity)
    {
        if(mInstance == null)
            mInstance = new FragmentNavigationManager();
         mInstance.configure(mainDashboardActivity);
         return mInstance;
    }

    private void configure(MainDashboardActivity mainDashboardActivity) {
        this.mainDashboardActivity = mainDashboardActivity;
        mFragmentManager = mainDashboardActivity.getSupportFragmentManager();

    }

    @Override
    public void showFragmnt(String title) {

    }
}

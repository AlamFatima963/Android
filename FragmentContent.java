package com.example.school_app.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.ingic.saloonik.R;


public class FragmentContent extends Fragment {


    private static String Key_Title = "Content";
    public FragmentContent() {
        // Required empty public constructor
    }

    public static FragmentContent newInstance(String param1, String param2) {
        FragmentContent fragment = new FragmentContent();
        Bundle args = new Bundle();
        args.putString(Key_Title, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_content, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String title = getArguments().getString(Key_Title);
        ((TextView)view.findViewById(R.id.title)).setText(title);
    }
}

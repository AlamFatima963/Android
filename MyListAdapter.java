package com.example.school_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.ingic.saloonik.R;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    private MyListData[] listdata;


    public MyListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {

        final MyListData myListData = listdata[position];
        holder.className.setText(listdata[position].getClassName());
        holder.present.setText(listdata[position].getPresnt());
        holder.absent.setText(listdata[position].getAbsent());
        holder.leave.setText(listdata[position].getLeave());
        holder.late.setText(listdata[position].getLate());
        holder.total.setText(listdata[position].getTotal());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: ",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView className;
        TextView present;
        TextView absent;
        TextView leave;
        TextView late;
        TextView total;
        RelativeLayout relativeLayout;

        ViewHolder(View itemView) {
            super(itemView);
            this.className = (TextView) itemView.findViewById(R.id.className);
            this.present = (TextView) itemView.findViewById(R.id.presentStu);
            this.absent = (TextView) itemView.findViewById(R.id.absentStu);
            this.leave = (TextView) itemView.findViewById(R.id.leaveStu);
            this.late = (TextView) itemView.findViewById(R.id.lateStu);
            this.total = (TextView) itemView.findViewById(R.id.totalStu);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }
    }}
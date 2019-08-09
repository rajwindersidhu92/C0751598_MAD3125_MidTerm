package com.example.c0751598_mad3125_midterm;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


public class LaunchAdapter extends RecyclerView.Adapter<LaunchAdapter.ViewHolder>{

    private Launch[] launchlistdata;

        // RecyclerView recyclerView;
        public LaunchAdapter(Launch[] listdata) {
            this.launchlistdata = listdata;
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.launchitem, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final Launch launchlist = launchlistdata[position];
            System.out.println(launchlist);
            holder.launch_Name.setText(launchlistdata[position].getLaunch_Name());
            holder.launch_year.setText(launchlistdata[position].getLaunch_Year());
            holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LaunchDetailActivity.class);

                view.getContext().startActivity(intent);
                }
            });
        }


        @Override
        public int getItemCount() {
            return launchlistdata.length;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView launch_Name;
            public TextView launch_year;
            public RelativeLayout relativeLayout;
            public ViewHolder(View itemView) {
                super(itemView);
                this.launch_Name = (TextView) itemView.findViewById(R.id.launch_Name);
                this.launch_year = (TextView) itemView.findViewById(R.id.launch_year);
                relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
            }
        }
    }


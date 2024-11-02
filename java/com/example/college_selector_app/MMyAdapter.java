package com.example.college_selector_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MMyAdapter extends RecyclerView.Adapter<MMyAdapter.MYViewHolder> {

    Context context;
    ArrayList<User> list;

    public MMyAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        return  new MYViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MYViewHolder myViewHolder, int i) {
        User user=list.get(i);
        myViewHolder.firstname.setText(user.getFirstname());
        myViewHolder.lastname.setText(user.getLastname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MYViewHolder extends RecyclerView.ViewHolder{

            TextView firstname,lastname;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            firstname=itemView.findViewById(R.id.tvfirstname);
            lastname=itemView.findViewById(R.id.tvlasttname);
        }
    }
}

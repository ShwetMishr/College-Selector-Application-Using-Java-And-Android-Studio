package com.example.college_selector_app;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class BMyAdapter extends RecyclerView.Adapter<BMyAdapter.MYViewHolder> {

    int[] arr_imgs;

    String[] arr_names;

    Context context;

    int lastposition=-1;
    public BMyAdapter(int[] arr_imgs, String[] arr_names){
        this.arr_imgs=arr_imgs;
        this.arr_names=arr_names;

    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.single_item,parent,false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MYViewHolder holder, int position) {
        holder.img.setImageResource(arr_imgs[position]);
        holder.name.setText(arr_names[position]);
        rvAnimation(holder.itemView,position);

        //  holder.itemView.setOnClickListener(new View.OnClickListener() {
        //  @Override
        // public void onClick(View v) {
        //    if(position==0){
        //      Intent intent=new Intent(v.getContext(), recycler_view_onclick.class);
        // v.getContext().startActivity(intent);
        //}
        // }
        //});

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                if(position==0){
                    Toast.makeText(context, "Successfull", Toast.LENGTH_SHORT).show();
                } else if (position==1) {
                    Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();


                }
                else {
                    Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();


                }
            }
        });





    }

    @Override
    public int getItemCount() {
        return arr_imgs.length;
    }

    class MYViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView name;


        public MYViewHolder(@NonNull View itemView) {
            super(itemView);

            img=(ImageView) itemView.findViewById(R.id.imgview_two);
            name=(TextView) itemView.findViewById(R.id.name_two);
        }
    }
    public void rvAnimation(View view,int position){
        //Animation animation=  AnimationUtils.loadAnimation(context, android.R.anim.fade_in);
        //view.startAnimation(animation);


        if(position>lastposition){
            Animation animation=  AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            view.startAnimation(animation);
            lastposition=position;


        }



    }

}




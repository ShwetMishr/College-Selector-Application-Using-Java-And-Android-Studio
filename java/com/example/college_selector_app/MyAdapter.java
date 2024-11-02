package com.example.college_selector_app;

import static androidx.core.content.ContextCompat.startActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
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


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MYViewHolder> {

    int[] arr_imgs;

    String[] arr_names;

    Context context;

    int lastposition=-1;
    public MyAdapter(int[] arr_imgs, String[] arr_names){
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
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://vit.ac.in/"));
                    v1.getContext().startActivity(intent1);


                } else if (position==1) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amrita.edu/school/engineering/coimbatore/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==2) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thapar.edu/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==3) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bits-pilani.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==4) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.soa.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==5) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.srmist.edu.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==6) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amity.edu/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==6) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amity.edu/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==7) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sastra.edu/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==8) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kalasalingam.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==9) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cuchd.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==10) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ksom.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==11) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kluniversity.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==12) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ssn.edu.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==13) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lpu.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==14) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/1"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==15) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.msu.edu.in/school/school-of-health-science-&-technology"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==16) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiitb.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==17) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.manipal.edu/sciences.html"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==18) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://geu.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==19) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.psgtech.edu/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==20) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.saveetha.com/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==21) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sathyabama.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==22) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.banasthali.org/banasthali/wcms/en/home/"));
                    v1.getContext().startActivity(intent1);

                }
                else if (position==23) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiitb.ac.in/"));
                    v1.getContext().startActivity(intent1);

                }
                else {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jaipur.manipal.edu/"));
                    v1.getContext().startActivity(intent1);

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


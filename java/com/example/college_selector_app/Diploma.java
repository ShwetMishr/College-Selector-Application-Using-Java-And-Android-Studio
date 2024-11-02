package com.example.college_selector_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Diploma extends AppCompatActivity {
    RecyclerView recyclerview_two;
    String names[]={"Rahul\n" + "NIRF ' 23","Amrita School of Engineering (Coimbatore)19\n" + "NIRF ' 23","Thapar University20\n" + "NIRF ' 23","BITS Pilani - Birla Institute of Technology and Science25\n" + "NIRF ' 23","SOA University - Siksha 'O' Anusandhan27\n" + "NIRF ' 23",
            "SRM Institute of Science and Technology, Kattankulathur28\n" + "NIRF ' 23","Amity University31\n" + "NIRF ' 23, Noida","SASTRA (Deemed to be University)34\n" + "NIRF ' 23","Kalasalingam Academy of Research and Education36\n" + "NIRF ' 23","Chandigarh University (CU)38\n" + "NIRF ' 23",
            "KIIT School of Civil Engineering39\n" + "NIRF ' 23", "KL (Deemed to be University)44\n" + "NIRF ' 23", "SSN College of Engineering45\n" + "NIRF ' 23", "LPU - Lovely Professional University50\n" + "NIRF ' 23", "Birla Institute of Technology, Mesra53\n" + "NIRF ' 23",
            "School of Health Sciences and Technology, UPES54\n" + "NIRF ' 23", "International Institute of Information Technology, Hyderabad55\n" + "NIRF ' 23", "Manipal School for Information Science, Manipal, MAHE61\n" + "NIRF ' 23", "Graphic Era Deemed to be University62\n" + "NIRF ' 23", "PSGCT Coimbatore63\n" + "NIRF ' 23",
            "Saveetha Institute of Medical and Technical Sciences64\n" + "NIRF ' 23", "Sathyabama Institute of Science and Technology66\n" + "NIRF ' 23", "Banasthali Vidyapith68\n" + "NIRF ' 23", "International Institute of Information Technology, Bangalore74\n" + "NIRF ' 23", "Manipal University, Jaipur76\n" + "NIRF ' 23",};
    //int imgs[]={R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2};
    int imgs[]={R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma);
        recyclerview_two=(RecyclerView) findViewById(R.id.recyclerview_four);

        DMyAdapter myAdapter=new DMyAdapter(imgs,names);

        GridLayoutManager layoutManager=new GridLayoutManager(this,1);
        // layoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
        recyclerview_two.setLayoutManager(layoutManager);
        recyclerview_two.setAdapter(myAdapter);
    }
}
package com.example.college_selector_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Architecture extends AppCompatActivity {
    RecyclerView recyclerview_two;

    SearchView searchView;
    String names[]={"School of Planning and Architecture - [SPA], New Delhi","Birla Institute of Technology - [BIT Mesra]","BMS School of Architecture - [BMSSA], Bangalore","Manipal School of Architecture and Planning - [MSAP], Manipal","Rizvi College of Architecture, Mumbai",
            "School of Planning and Architecture, University of Mysore - [SPA] Mysore",

            "Sushant School of Art and Architecture - [SSAA], Gurgaon","Amity School of Architecture and Planning, Noida",
            "RV College of Architecture - [RVCA], Bangalore",
            "IPS Academy, Indore",

                    "Amity University, Lucknow", "Integral University, Lucknow", "Guwahati College of Architecture and Planning, Guwahati",
            "Priyadarshini Institute of Architecture and Design Studies- [PIADS], Nagpur", "AXIS Institute of Architecture - [AIA], Kanpur",

                    "Periyar Maniammai Institute of Science and Technology - [PMIST], Thanjavur", "Chitkara University, Chitkara School of Planning and Architecture - [CSPA] logo\n" +
            "Chitkara University, Chitkara School of Planning and Architecture - [CSPA], Patiala",
            "DY Patil College of Engineering and Technology - [DYPCET], Kolhapur", "Dayananda Sagar Institutions - [DSI], Bangalore", "Institute of Design Education and Architectural Studies - [IDEAS], Nagpur",
            "Mcgan's Ooty School of Architecture, Ooty", "RVS School of Architecture, Coimbatore", "CEPT University, Ahmedabad", "Sinhgad College of Architecture - [SCOA], Pune", "MEASI Academy of Architecture, Chennai",};
    //int imgs[]={R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2};
    int imgs[]={R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);
        recyclerview_two=(RecyclerView) findViewById(R.id.recyclerview_three);

        AMyAdapter myAdapter=new AMyAdapter(imgs,names);

        GridLayoutManager layoutManager=new GridLayoutManager(this,1);
        // layoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
        recyclerview_two.setLayoutManager(layoutManager);
        recyclerview_two.setAdapter(myAdapter);
    }
}
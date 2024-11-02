package com.example.college_selector_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Business extends AppCompatActivity {
    RecyclerView recyclerview_two;
    String names[]={"XLRI Xavier School of Management","Management Development Institute","Great Lakes Institute of Management, Chennai","T A Pai Management Institute, Manipal, MAHE","Symbiosis Institute of Business Management, Symbiosis Intern (Pune)",
            "S.P. Jain Institute of Management and Research, Mumbai","Pravin Dalal School of Entrepreneurship and Family Business(Mumbai)",
            "Amity University, Noida","Management Development Institute",
            "LPU - Lovely Professional University",
            "Goa Institute of Management", "IMT Ghaziabad - Institute of Management Technology", "Chandigarh University (CU)", "MICA", "UPES"
            , "IFHE Hyderabad - ICFAI Foundation For Higher Education", "T A Pai Management Institute, Manipal, MAHE", "Manipal School for Information Science, Manipal, MAHE61", "K J Somaiya Institute of Management", "Jaipuria Noida - Jaipuria Institute of Management",
            "Birla Institute of Management Technology",
            "Institute of Rural Management, Anand",
            "SOA University - Siksha 'O' Anusandhan", "Christ University", "Great Lakes Institute of Management, Gurgaon",};
    //int imgs[]={R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2,R.drawable.niks1,R.drawable.niks2,R.drawable.niks3,R.drawable.niks3,R.drawable.niks2,R.drawable.niks2};
    int imgs[]={R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,
            R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        recyclerview_two=(RecyclerView) findViewById(R.id.recyclerview_five);

        BMyAdapter myAdapter=new BMyAdapter(imgs,names);

        GridLayoutManager layoutManager=new GridLayoutManager(this,1);
        // layoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
        recyclerview_two.setLayoutManager(layoutManager);
        recyclerview_two.setAdapter(myAdapter);
    }
}
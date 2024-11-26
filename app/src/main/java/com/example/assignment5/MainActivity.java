package com.example.assignment5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.assignment5.Model.Model;
import com.example.assignment5.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] titles = {"F-7BGI", "MIG-29", "AN-32", "Bayraktar TB2", "Bell-206"};
        String[] subtitles = {"Fighter jet", "Multirole fighter jet", "Transport Aircraft", "UAV", "Rotorcraft"};
        Integer[] images = {
                R.drawable.f7bgi, R.drawable.mig29, R.drawable.an32,
                R.drawable.tb2, R.drawable.bell206
        };

        ArrayList<Model> data = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            Model model = new Model();
            model.setTitle(titles[i]);
            model.setSubtitle(subtitles[i]);
            model.setImageId(images[i]);
            data.add(model);
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}




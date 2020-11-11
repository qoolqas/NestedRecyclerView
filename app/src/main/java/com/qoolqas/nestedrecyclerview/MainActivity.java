package com.qoolqas.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvGroup;
    ArrayList<String> arrayListGroup;
    LinearLayoutManager layoutManager;
    GroupAdp groupAdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvGroup = findViewById(R.id.rv_group);

        arrayListGroup = new ArrayList<>();
        for (int i=1;i<=10;i++){
            arrayListGroup.add("Group " + i);
        }
        groupAdp = new GroupAdp(MainActivity.this,arrayListGroup);
        layoutManager = new LinearLayoutManager(this);
        rvGroup.setLayoutManager(layoutManager);
        rvGroup.setAdapter(groupAdp);

    }
}
package com.example.recyclerviewexample;

import android.text.Layout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //data
        DataModel[] myListData = new DataModel[]{
            new DataModel("Example 1", R.drawable.androidvector),
            new DataModel("Example 2", R.drawable.androidvector),
            new DataModel("Example 3", R.drawable.androidvector)
        };

        //adapter
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(myListData);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
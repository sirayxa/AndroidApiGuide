package com.example.android.apiguides;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private TopicAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new TopicAdapter();
        mRecyclerView = findViewById(R.id.recycler_view);
        // RecyclerView will show nothing if not set the LayoutManager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setData();
    }
}

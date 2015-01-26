package com.daimajia.swipedemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.daimajia.swipedemo.adapter.RecyclerAdapter;

/**
 * Created by lawrence on 15/1/26.
 */
public class RecyclerExample extends Activity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        setTitle("RecyclerExample");
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerAdapter adapter = new RecyclerAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

    }
}

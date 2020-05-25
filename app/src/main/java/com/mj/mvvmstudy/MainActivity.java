package com.mj.mvvmstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mj.mvvmstudy.adapters.RecyclerAdapter;
import com.mj.mvvmstudy.models.NicePlaces;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static  final String TAG = "MainActivity";

    private FloatingActionButton fab;
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.recycler_view);
        progressBar = findViewById(R.id.progress_bar);

        initRecyclerView();

    }

    private void initRecyclerView(){
        recyclerAdapter = new RecyclerAdapter(this, new ArrayList<NicePlaces>());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void showProgressBar() { progressBar.setVisibility(View.VISIBLE);}

    private void hideProgressBar() {progressBar.setVisibility(View.GONE);}


}

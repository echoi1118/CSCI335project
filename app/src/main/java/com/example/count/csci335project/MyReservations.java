package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MyReservations extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_reservations);

        createExampleList();
        buildRecyclerView();
    }

    public void insertItem(int position) {

        mExampleList = new ArrayList<>();

        /** Get the Intent that started this activity and extract the string */
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("key_name");
        String desc = extras.getString("key_desc");
        int pic = extras.getInt("key_img");

        mExampleList.add(position, new ExampleItem(pic, name, desc));
        mAdapter.notifyItemInserted(position);
    }

    public void createExampleList() {
        insertItem(0);


        /**
         * Code from vid:
         * mExampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Line 3", "Line 4"));
        mExampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Line 5", "Line 6"));
        mExampleList.add(new ExampleItem(R.drawable.ic_launcher_background, "Line 1", "Line 2"));*/
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    /** Bottom navigation links */
    public void goToDogDirectory(View view){
        Intent intent = new Intent(this, DogDirectory.class);
        startActivity(intent);
    }

    public void goToFavorites(View view){
        Intent intent = new Intent(this, Favorites.class);
        startActivity(intent);
    }

    public void goToOurMission(View view){
        Intent intent = new Intent(this, OurMission.class);
        startActivity(intent);
    }

    public void goToMyReservations(View view){
        Intent intent = new Intent(this, MyReservations.class);
        startActivity(intent);
    }
}

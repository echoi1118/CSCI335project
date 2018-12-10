package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyReservations extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_reservations);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ResAdapter adapter = new ResAdapter(this, DogModel.getResList());
        recyclerView.setAdapter(adapter);

        emptyCheck(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
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

    public void emptyCheck(ResAdapter adapter){
        if (adapter.getItemCount()>0){
            TextView message = findViewById(R.id.empty_mes2);
            ImageView border = findViewById(R.id.res_rounded_white_sq_bg);
            ImageView blueDog = findViewById(R.id.res_little_blue_dog);
            ImageView borderB = findViewById(R.id.res_empty_bottom_border);
            ImageView borderT = findViewById(R.id.res_empty_top_border);

            message.setVisibility(View.INVISIBLE);
            border.setVisibility(View.INVISIBLE);
            borderB.setVisibility(View.INVISIBLE);
            borderT.setVisibility(View.INVISIBLE);
            blueDog.setVisibility(View.INVISIBLE);
        }
    }
}

package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Favorites extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);



        RecyclerView recyclerView = findViewById(R.id.fav_recycler_view);
        FavAdapter adapter = new FavAdapter(this, DogModel.getFavList());
        recyclerView.setAdapter(adapter);

        emptyCheck(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

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

    public void emptyCheck(FavAdapter adapter){
        if (adapter.getItemCount()>0){
            TextView message = findViewById(R.id.empty_mes);
            ImageView border = findViewById(R.id.fav_rounded_white_sq_bg);
            ImageView blueDog = findViewById(R.id.fav_little_blue_dog);
            ImageView borderB = findViewById(R.id.fav_empty_bottom_border);
            ImageView borderT = findViewById(R.id.fav_empty_top_border);

            message.setVisibility(View.INVISIBLE);
            border.setVisibility(View.INVISIBLE);
            borderB.setVisibility(View.INVISIBLE);
            borderT.setVisibility(View.INVISIBLE);
            blueDog.setVisibility(View.INVISIBLE);
        }
    }

}
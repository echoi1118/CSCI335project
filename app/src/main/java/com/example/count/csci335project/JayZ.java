package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class JayZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jay_z);
    }

    /** Reserve Jay-Z */
    public void goToReserveJayZ(View view) {
        Intent intent = new Intent(this, ReservationActivity.class);
        startActivity(intent);
    }

    /** Bottom navigation links */
    public void goToDogDirectory(View view) {
        Intent intent = new Intent(this, DogDirectory.class);
        startActivity(intent);
    }

    public void goToFavorites(View view) {
        Intent intent = new Intent(this, Favorites.class);
        startActivity(intent);
    }

    public void goToOurMission(View view) {
        Intent intent = new Intent(this, OurMission.class);
        startActivity(intent);
    }

    public void goToMyReservations(View view) {
        Intent intent = new Intent(this, MyReservations.class);
        startActivity(intent);
    }
}
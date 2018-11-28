package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Beyonce extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Test string";//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beyonce);


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

    public void addToFavorites(){
        ImageButton button = (ImageButton) findViewById(R.id.FavoriteButton);
        button.setImageResource(R.drawable.ic_favorites);

        TextView selectedDog = findViewById(R.id.dog_name);
        String message = selectedDog.getText().toString();

    }



    /** Beyonce - Reservation button used to pass data*/
    public void passInfoToReservationActivity(View view) {
        Intent intent = new Intent(this, ReservationActivity.class);
        TextView descOfDog = findViewById(R.id.DogDescription);

        String message = descOfDog.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DogDirectory extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_directory);

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



    public void goToBeyonce(View view){
        Intent intent = new Intent(this, Beyonce.class);
        startActivity(intent);
    }

    public void goToJayZ(View view){
        Intent intent = new Intent(this, JayZ.class);
        startActivity(intent);
    }

    public void goToKim(View view) {
        Intent intent = new Intent(this, Kim.class);
        startActivity(intent);
    }

    public void goToKanye(View view){
        Intent intent = new Intent(this, Kanye.class);
        startActivity(intent);
    }

    public void goToSelena(View view){
        Intent intent = new Intent(this, Selena.class);
        startActivity(intent);
    }
    public void goToJB(View view){
        Intent intent = new Intent(this, JB.class);
        startActivity(intent);
    }



}

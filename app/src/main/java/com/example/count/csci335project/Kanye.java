package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Kanye extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanye);
    }

    /** Reserve Kanye */
    public void goToReserveKanye(View view) {
        Intent intent = new Intent(this, ReservationActivity.class);
        Bundle extras = new Bundle();

        TextView dog_name = findViewById(R.id.dog_name);
        TextView dog_desc = findViewById(R.id.dog_desc);
        //ImageView dog_img = findViewById(R.id.Jay_Z_Pic);

        extras.putString("key_name", dog_name.getText().toString());
        extras.putString("key_desc", dog_desc.getText().toString());
        //ImageView img_of_dog = dog_img;

        intent.putExtras(extras);
        startActivity(intent);
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





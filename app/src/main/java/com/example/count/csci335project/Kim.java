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

import static com.example.count.csci335project.DogModel.favoriteBool;
import static com.example.count.csci335project.DogModel.reservationBool;

public class Kim extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kim);

        if(!favoriteBool[2])
        {
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_empty_favorites);
        }
        else{
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_favorites);
        }

    }


    public void Favorites(View view){
        if(favoriteBool[2])
        {
            favoriteBool[2] = false;
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_empty_favorites);
        }
        else{
            favoriteBool[2] = true;
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_favorites);
        }

    }

    /** Reserve Kim */
    public void goToReserveKim(View view) {
        Intent intent = new Intent(this, ReservationActivity.class);
        Bundle extras = new Bundle();

        TextView dog_name = findViewById(R.id.dog_name);
        TextView dog_desc = findViewById(R.id.dog_desc);

        extras.putString("key_name", dog_name.getText().toString());
        extras.putString("key_desc", dog_desc.getText().toString());
        extras.putInt("key_img", R.drawable.dog3image);

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
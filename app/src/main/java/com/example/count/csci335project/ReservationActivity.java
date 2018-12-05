package com.example.count.csci335project;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import java.text.DateFormat;

public class ReservationActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        Button button = (Button) findViewById(R.id.date_selection_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(java.util.Calendar.YEAR, year);
        c.set(java.util.Calendar.MONTH, month);
        c.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);

        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView DateSelection = (TextView) findViewById(R.id.DateSelection);
        DateSelection.setText(currentDateString);


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
}

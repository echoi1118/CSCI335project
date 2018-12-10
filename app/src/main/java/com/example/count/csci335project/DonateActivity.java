package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme_NoActionBar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
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




    /** Called when the user clicks the "Donate" button */
    public void goToDonateSuccessScreen(View view) {
        EditText name = findViewById(R.id.cardholder_name);
        EditText cardNum = findViewById(R.id.cc_number);
        EditText csv = findViewById(R.id.csv_number);

        String nameVal = name.getText().toString();
        String cardVal = cardNum.getText().toString();
        String csvVal = csv.getText().toString();

        if(nameVal.length() == 0) {
            name.setError("Please enter a valid card holder name.");
        }
        else if(!isValidCCNumber(cardVal)) {
            cardNum.setError("Please enter a valid card number");
        }
        else if(!isValidCSVNumber(csvVal)) {
            csv.setError("Please enter a valid csv");
        }
        else {
            Intent intent = new Intent(this, DonateSuccessNotice.class);
            startActivity(intent);
        }
    }

    public final static boolean isValidCSVNumber(CharSequence number) {

        Pattern pattern;
        Matcher matcher;

        final String NUMBER_PATTERN = "^(?=.*[0-9])(?=\\S+$).{3,}$";

        pattern = Pattern.compile(NUMBER_PATTERN);
        matcher = pattern.matcher(number);

        return matcher.matches();

    }

    public final static boolean isValidCCNumber(CharSequence number) {

        Pattern pattern;
        Matcher matcher;

        final String NUMBER_PATTERN = "^(?=.*[0-9])(?=\\S+$).{12,}$";

        pattern = Pattern.compile(NUMBER_PATTERN);
        matcher = pattern.matcher(number);

        return matcher.matches();

    }

}

package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Called when the user clicks the Create an Account link */
    public void goToCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAnAccount.class);
        startActivity(intent);
    }

    public void goToDogDirectory(View view){
        EditText validation = findViewById(R.id.email_login_field);
        EditText passValid = findViewById(R.id.pw_login_field);
        if(!isValidEmail(validation.getText()))
        {
            validation.setError("Please enter a valid email.");
        }
        else if(!isValidPassword(passValid.getText()))
        {
            passValid.setError("Please enter a valid password.");
        }
        else {
            Intent intent = new Intent(this, DogDirectory.class);
            startActivity(intent);
        }

    }

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null)
            return false;

        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    public final static boolean isValidPassword(CharSequence password) {

        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }

}

package com.example.hp.pfe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        login = (Button)findViewById(R.id.welcome_login);
        signup = (Button)findViewById(R.id.welcome_signup);
        //change MainActivity to LoginActivity Intent i
        final Intent i = new Intent(this, MainActivity.class);
        final Intent j = new Intent(this,SignupActivity.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(j);
            }
        });
    }


}

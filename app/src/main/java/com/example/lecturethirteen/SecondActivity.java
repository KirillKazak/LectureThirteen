package com.example.lecturethirteen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class SecondActivity extends AppCompatActivity {

    TextView transferedVeiw;
    String transferedString;
    Intent transferedIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        transferedVeiw = findViewById(R.id.veiw);
        transferedIntent = getIntent();
        transferedString = transferedIntent.getStringExtra(MainActivity.KEY);
        transferedVeiw.setText(transferedString);

       // ((TextView)findViewById(R.id.veiw)).setText(getIntent().getStringExtra(MainActivity.KEY));
    }
}
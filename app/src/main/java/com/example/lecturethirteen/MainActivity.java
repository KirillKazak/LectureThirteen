package com.example.lecturethirteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String KEY = "KEY";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.viewha);
        findViewById(R.id.transfer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra(KEY, editText.getText().toString());
                startActivity(intent);
            }
        });

        KirillKa kirill = new KirillKa("Kirill", 26);
        KirillKa kirillKaClone = null;
        try {
            kirillKaClone = (KirillKa) kirill.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Log.d("DONTCLON", String.valueOf(kirill));
        Log.d("CLONE", String.valueOf(kirillKaClone));
        Log.d("EQUALS", String.valueOf(kirill.equals(kirillKaClone)));
        Log.d("kirillHashCode", String.valueOf(kirill.hashCode()));
        Log.d("kirillKaCloneHashCode", String.valueOf(kirillKaClone.hashCode()));

    }
}
package com.dev.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext=new Intent(getApplicationContext(), SignUp.class);
                String firstPlayer = editText.getText().toString();
                String secondPlayer = editText2.getText().toString();

                inext.putExtra("first", firstPlayer);
                inext.putExtra("second", secondPlayer);
                startActivity(inext);
                MediaPlayer music = MediaPlayer.create(getApplicationContext(), R.raw.click);
                music.start();
            }
        });
    }
}
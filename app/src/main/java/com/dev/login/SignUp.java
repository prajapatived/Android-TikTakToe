package com.dev.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    int flag = 0;
    int count = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    public TextView text, text2, winner;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, rebtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);
        winner=findViewById(R.id.winner);
        rebtn=findViewById(R.id.rebtn);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        Intent fromAct = getIntent();
        String player1 = fromAct.getStringExtra("first");
        String player2 = fromAct.getStringExtra("second");


        text.setText("Player1: " + player1);
        text2.setText("Player2: " + player2);

        rebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                winner.setText("");
                MediaPlayer music = MediaPlayer.create(getApplicationContext(), R.raw.restart);
                music.start();
            }
        });
    }
    public void WinnerString(String b){
//        winner.setText("Winner is: "+b);
        String player1=text.getText().toString();
        String player2=text2.getText().toString();
    if (b.equals("X")){
        winner.setText(player1+" wins");
        MediaPlayer music = MediaPlayer.create(getApplicationContext(), R.raw.win);
        music.start();
    }else if (b.equals("O")){
        winner.setText(player2+" wins");
        MediaPlayer music = MediaPlayer.create(getApplicationContext(), R.raw.win);
        music.start();
    }

    }


    public void Check(View view) {
        Button btnCurrent = (Button) view;
        if(btnCurrent.getText().toString().equals("")){



        if (flag == 0) {
            btnCurrent.setText("X");
            MediaPlayer music = MediaPlayer.create(getApplicationContext(), R.raw.click);
            music.start();

            flag = 1;
            count++;
        } else if (flag==1){
            btnCurrent.setText("O");
            MediaPlayer music = MediaPlayer.create(getApplicationContext(), R.raw.click);
            music.start();
            flag = 0;
            count++;
        }
        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                //1
                Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();
                WinnerString(b1);

            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                //2
                Toast.makeText(this, "Winner is :" + b4, Toast.LENGTH_SHORT).show();
                WinnerString(b4);
            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                //3
                Toast.makeText(this, "Winner is :" + b7, Toast.LENGTH_SHORT).show();
                WinnerString(b7);
            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                //4
                Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();
                WinnerString(b1);
            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                //5
                Toast.makeText(this, "Winner is :" + b3, Toast.LENGTH_SHORT).show();
                WinnerString(b3);
            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                //6
                Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();
                WinnerString(b1);
            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                //7
                Toast.makeText(this, "Winner is :" + b2, Toast.LENGTH_SHORT).show();
                WinnerString(b2);
            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                //8
                Toast.makeText(this, "Winner is :" + b3, Toast.LENGTH_SHORT).show();
                WinnerString(b3);
            }
        }
        }
    }


}




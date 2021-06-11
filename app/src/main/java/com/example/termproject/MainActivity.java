package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    //Declare Radio Group variables for the player choices and team choices
    private RadioGroup playerchoices;
    private RadioGroup teamchoices;
    //Declare the int variable that determines which choices were selected
    int playerCount;
    String teamPick;
    //Declare the Start Button Variable
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the values for the Radio Group and Radio Button Variables
        playerchoices = findViewById(R.id.Player_Choices);
        teamchoices = findViewById(R.id.Team_Choices);
        startButton = (Button) findViewById(R.id.Start_Button);
        playerCount = 1;
        teamPick = "Android";

        //Determine How many players will participate in the game
        playerchoices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.One_Player) playerCount = 1;
                else if (checkedId == R.id.Two_Players) playerCount = 2;
            }
        });

        //Determine which team the first player is on
        teamchoices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Team_Android) teamPick = "Android";
                else if (checkedId == R.id.Team_IOS) teamPick = "IOS";
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playerCount == 1 && teamPick == "Android") {
                    OnePlayerAndroid(v);
                }
                //if  1 player and team ios
                else if (playerCount == 1 && teamPick == "IOS") {
                    OnePlayerIOS(v);
                }
                //if 2 player and team android
                else if (playerCount == 2 && teamPick == "Android") {
                    TwoPlayerAndroid(v);
                }
                //if 2 player and team ios
                else if (playerCount == 2 && teamPick == "IOS") {
                    TwoPlayerIOS(v);
                }
            }
        });

    }


    public void OnePlayerAndroid(View view){
        startActivity(new Intent(this, GameScreenA.class));
    }

    public void OnePlayerIOS(View view){
        startActivity(new Intent(this, GameScreenB.class));
    }

    public void TwoPlayerAndroid(View view){
        startActivity(new Intent(this, GameScreenC.class));
    }

    public void TwoPlayerIOS(View view){
        startActivity(new Intent(this, GameScreenD.class));
    }
}

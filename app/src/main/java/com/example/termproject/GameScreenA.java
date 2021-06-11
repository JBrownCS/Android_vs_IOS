package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class GameScreenA extends AppCompatActivity implements View.OnClickListener {
    Player player1 = new Player(R.drawable.team_img_android, 0);
    Player CPU = new Player(R.drawable.team_img_ios, 0);

    Random buttonPicker = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        setButton();
    }
    //Set the OnClickListeners for each Image Button
    private void setButton(){
        findViewById(R.id.img1).setOnClickListener(this);
        findViewById(R.id.img2).setOnClickListener(this);
        findViewById(R.id.img3).setOnClickListener(this);
        findViewById(R.id.img4).setOnClickListener(this);
        findViewById(R.id.img5).setOnClickListener(this);
        findViewById(R.id.img6).setOnClickListener(this);
        findViewById(R.id.img7).setOnClickListener(this);
        findViewById(R.id.img8).setOnClickListener(this);
        findViewById(R.id.img9).setOnClickListener(this);
    }

    //This function is called when the CPU randomly selects an image
    public void PickImage(int buttonNumber) {

        if(buttonNumber == 1){
            ImageButton btn = (ImageButton)findViewById(R.id.img1);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 2){
            ImageButton btn = (ImageButton)findViewById(R.id.img2);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 3){
            ImageButton btn = (ImageButton)findViewById(R.id.img3);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 4){
            ImageButton btn = (ImageButton)findViewById(R.id.img4);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 5){
            ImageButton btn = (ImageButton)findViewById(R.id.img5);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 6){
            ImageButton btn = (ImageButton)findViewById(R.id.img6);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 7){
            ImageButton btn = (ImageButton)findViewById(R.id.img7);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 8){
            ImageButton btn = (ImageButton)findViewById(R.id.img8);
            btn.setImageResource(CPU.getTeamImageID());
        }
        if(buttonNumber == 9){
            ImageButton btn = (ImageButton)findViewById(R.id.img9);
            btn.setImageResource(CPU.getTeamImageID());
        }
    }

    @Override
    public void onClick(View v) {
        int buttonNumber = buttonPicker.nextInt(12) + 1;
        if(v.getId() == R.id.img1){
            ImageButton btn = (ImageButton)findViewById(R.id.img1);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img2){
            ImageButton btn = (ImageButton)findViewById(R.id.img2);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img3){
            ImageButton btn = (ImageButton)findViewById(R.id.img3);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img4){
            ImageButton btn = (ImageButton)findViewById(R.id.img4);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img5){
            ImageButton btn = (ImageButton)findViewById(R.id.img5);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img6){
            ImageButton btn = (ImageButton)findViewById(R.id.img6);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img7){
            ImageButton btn = (ImageButton)findViewById(R.id.img7);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img8){
            ImageButton btn = (ImageButton)findViewById(R.id.img8);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
        if(v.getId() == R.id.img9){
            ImageButton btn = (ImageButton)findViewById(R.id.img9);
            btn.setImageResource(player1.getTeamImageID());
            PickImage(buttonNumber);
        }
    }
}

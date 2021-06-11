package com.example.termproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameScreenC extends AppCompatActivity implements View.OnClickListener {
    Player player1 = new Player(R.drawable.team_img_android,0);
    Player player2 = new Player(R.drawable.team_img_ios, 0);
    TextView player1Score;
    TextView player2Score;
    int playerTurnPick = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen_c);

        player1Score = (TextView)findViewById(R.id.player1_Scoreboard);
        player2Score = (TextView)findViewById(R.id.player2_Scoreboard);
        setButton();
        setPlayer(playerTurnPick);
    }

    private void setPlayer(int playerNumber) {
        TextView playerTurn = (TextView)findViewById(R.id.Player_Turn);
        if(playerNumber == 1){
            playerTurn.setText(R.string.player1_turn);
            playerTurnPick = 1;
        }
        else if(playerNumber == 2){
            playerTurn.setText(R.string.player2_turn);
            playerTurnPick = 2;
        }
    }

    //Set the OnClickListeners for each Image Button
    private void setButton() {
        findViewById(R.id.imageButtonC1).setOnClickListener(this);
        findViewById(R.id.imageButtonC2).setOnClickListener(this);
        findViewById(R.id.imageButtonC3).setOnClickListener(this);
        findViewById(R.id.imageButtonC4).setOnClickListener(this);
        findViewById(R.id.imageButtonC5).setOnClickListener(this);
        findViewById(R.id.imageButtonC6).setOnClickListener(this);
        findViewById(R.id.imageButtonC7).setOnClickListener(this);
        findViewById(R.id.imageButtonC8).setOnClickListener(this);
        findViewById(R.id.imageButtonC9).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(playerTurnPick == 1){
            if (v.getId() == R.id.imageButtonC1) {
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC1);
                if(IfID(btn)){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC2) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC2);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC3) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC3);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC4) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC4);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC5) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC5);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC6) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC6);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC7) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC7);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC8) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC8);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
            if (v.getId() == R.id.imageButtonC9) {
                ImageButton btn = (ImageButton) findViewById(R.id.imageButtonC9);
                if(v.getContentDescription() == "IOS" || v.getContentDescription() == "default"){
                    player1.updatePlayerScore(1);
                    player1Score.setText(player1.getPlayerScore());
                    player2.updatePlayerScore(-1);
                    player2Score.setText(player2.getPlayerScore());
                }
                btn.setImageResource(player1.getTeamImageID());
                v.setContentDescription("Android");
                setPlayer(2);
            }
        }
        else if (playerTurnPick == 2){
            if(v.getId() == R.id.imageButtonC1){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC1);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC2){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC2);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC3){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC3);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC4){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC4);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC5){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC5);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC6){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC6);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC7){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC7);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC8){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC8);
                if(v.getContentDescription() == "Android" || v.getContentDescription() == "default"){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
            if(v.getId() == R.id.imageButtonC9){
                ImageButton btn = (ImageButton)findViewById(R.id.imageButtonC9);
                if(IfID(btn)){
                    player2.updatePlayerScore(1);
                    player2Score.setText(player1.getPlayerScore());
                    player1.updatePlayerScore(-1);
                    player1Score.setText(player1.getPlayerScore());
                }
                btn.setImageResource(player2.getTeamImageID());
                v.setContentDescription("IOS");
                setPlayer(1);
            }
        }

    }

    private boolean IfID(ImageButton btn) {
        CharSequence default_ID = "default";
        CharSequence android_ID = "Android";
        CharSequence ios_ID = "IOS";
        int i = 1;
        if(i == 1){
            return true;
        }
        else{
            return false;
        }
    }
}


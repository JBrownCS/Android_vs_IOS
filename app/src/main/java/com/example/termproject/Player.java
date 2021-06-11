package com.example.termproject;

import android.media.Image;
import android.widget.ImageView;

public class Player {
    /*The player class will have two variables:
        -Team Image ID
        -Player Score
     */
    private int teamImageID;  //The image drawable ID for the player's team
    private int playerScore;  //The score of the player

    //Constructor
    public Player(int imageID, int score) {
        teamImageID = imageID;
        playerScore = score;
    }

    //Get the drawable Id for the player's team image
    public int getTeamImageID() {
        return teamImageID;
    }

    //Get the player's score
    public int getPlayerScore() {
        return playerScore;
    }

    //Updates the score by a certain amount after the player fills a square with their image
    public void updatePlayerScore(int increment) {
        playerScore = playerScore + increment;
    }
}

package com.example.dicehw;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private MediaPlayer mpdevery;
    private MediaPlayer mpd1;
    private MediaPlayer mpd20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        mpdevery = MediaPlayer.create(MainActivity.this, R.raw.devery);
        mpdevery.start();
        switch (randomNumber) {
            case 1:
                mpd1 = MediaPlayer.create(MainActivity.this, R.raw.d1);
                mpd1.start();
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                break;
            case 20:
                mpd20 = MediaPlayer.create(MainActivity.this, R.raw.d20);
                mpd20.start();
                imageViewDice.setImageResource(R.drawable.dice20);
                break;
        }
    }
}

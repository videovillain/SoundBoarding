package edu.finalproject.cs50.soundboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private MediaPlayer mp;
    public String btn_1_sound_file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        btn_1_sound_file = "burn_out_the_computer";

        button1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btn_1_sound_file = "portal_gun_louder";
                Toast.makeText(view.getContext(), "Changed!", Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    public void sound1(View v) {
        int resID = this.getResources().getIdentifier(btn_1_sound_file,"raw", this.getPackageName());
        mp = MediaPlayer.create(this, resID);
        mp.start();
    }

    public void sound2(View v) {

    }

    public void sound3(View v) {

    }

    public void sound4(View v) {

    }

    public void sound5(View v) {

    }

    public void chooseSound(View v) {
        Toast.makeText(v.getContext(), "Long Clicked!", Toast.LENGTH_LONG).show();
        /*Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("media/*");
        startActivityForResult(intent, 1);*/
    }
}
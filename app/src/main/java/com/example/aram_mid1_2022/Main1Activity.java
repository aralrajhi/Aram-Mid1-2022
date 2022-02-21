
package com.example.aram_mid1_2022;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

public class Main1Activity extends AppCompatActivity {

    ImageView animalpic;
    MediaPlayer track;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("You are in Activity1");

        track = new MediaPlayer();

        track = MediaPlayer.create(this, R.raw.track1);

        playing = 0;

        track = (ImageView) findViewById(R.id.Tigerimg);

        Button act2 = findViewById(R.id.act2btn);
        Button act3 = findViewById(R.id.act3btn);


        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main1Activity.this,MainActivity2.class));
            }
        });
        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main1Activity.this,MainActivity3.class));}
        });

        animalpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing) {
                    case 0:
                        track.start();
                        playing = 1;
                        break;
                    case 1:
                        track.pause();
                        playing = 0;
                        break;
                }
            }
        });

    }
}
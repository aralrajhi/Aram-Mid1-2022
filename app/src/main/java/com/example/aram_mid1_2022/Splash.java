package com.example.aram_mid1_2022;



        import android.content.Intent;
        import android.os.Bundle;

        import java.util.Timer;
        import java.util.TimerTask;

public class Splash extends Main1Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                finish();
                startActivity(new Intent(Splash.this, Main1Activity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,6000);
    }
}
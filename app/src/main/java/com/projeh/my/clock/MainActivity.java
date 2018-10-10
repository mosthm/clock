package com.projeh.my.clock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button stopWatch;
    private Button countDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        config();
    }
    private void findView(){
        stopWatch=(Button) findViewById(R.id.stop_watch);
        countDown=(Button) findViewById(R.id.count_down);
    }
    private void config(){
        stopWatch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                StopWatch stopWatchFragement = new StopWatch();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.frag_stopWatch,stopWatchFragement)
                        .addToBackStack(null)
                        .commit();
            }
        });
        countDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                CountDown countDownFragement = new CountDown();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.frag_countDown,countDownFragement)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}

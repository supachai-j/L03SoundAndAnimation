package andriod.training.cat.com.l03soundandanimation;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Supachai.ja on 11/8/2017.
 */


public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);

        //ImageButton click to image cow
        ImageButton bt_goto_imb_cow = (ImageButton) findViewById(R.id.lo_imb_cow_sound);
        bt_goto_imb_cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer m = MediaPlayer.create(SoundActivity.this,R.raw.s_cow);
                m.start();
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(1000);


            }
        });

       //ImageButton click to image dolphin
        ImageButton bt_goto_imb_dolphin = (ImageButton) findViewById(R.id.lo_imb_dolphin_sound);
        bt_goto_imb_dolphin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
               MediaPlayer m = MediaPlayer.create(SoundActivity.this,R.raw.s_dolphin);
                m.start();
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(1000);


            }
        });

        //ImageButton click to image duck
        ImageButton bt_goto_imb_duck = (ImageButton) findViewById(R.id.lo_imb_duck_sound);
        bt_goto_imb_duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer m = MediaPlayer.create(SoundActivity.this,R.raw.s_duck);
                m.start();
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(500);


            }
        });

        //ImageButton click to image duck
        ImageButton bt_goto_imb_horse = (ImageButton) findViewById(R.id.lo_imb_horse_sound);
        bt_goto_imb_horse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer m = MediaPlayer.create(SoundActivity.this,R.raw.s_horse);
                m.start();
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(500);


            }
        });

    }
}
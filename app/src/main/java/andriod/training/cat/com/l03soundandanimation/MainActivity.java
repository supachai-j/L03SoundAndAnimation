package andriod.training.cat.com.l03soundandanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button click to animation page
        Button bt_goto_animation = (Button) findViewById(R.id.lo_bt_goto_animation);
        bt_goto_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, AnimationActivity.class));
                gotoPage(AnimationActivity.class, true);
            }
        });

        //Button click to sound page
        Button bt_goto_sound = (Button) findViewById(R.id.lo_bt_goto_sound);
        bt_goto_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, AnimationActivity.class));
                gotoPage(SoundActivity.class, true);
            }
        });

        //Button click to gif page
        Button bt_goto_gif = (Button) findViewById(R.id.lo_bt_goto_gif);
        bt_goto_gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, AnimationActivity.class));
                gotoPage(GifActivity.class, true);
            }
        });


    }
    public void gotoPage(Class dest_class, boolean transition) {
        Intent subIntent = new Intent(getApplicationContext(), dest_class);
        startActivity(subIntent);
        if (transition) overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
    }

}

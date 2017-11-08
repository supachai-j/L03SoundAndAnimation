package andriod.training.cat.com.l03soundandanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * Created by LqLconf on 11/8/2017.
 */


public class GifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);

        GifImageView gif = (GifImageView) findViewById(R.id.giv_gif);
        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GifDrawable gd = (GifDrawable) ((GifImageView) v).getDrawable();
                if (gd.isRunning()) {
                    gd.stop();
                }else{
                    gd.start();
                }
            }
        });

    }
}
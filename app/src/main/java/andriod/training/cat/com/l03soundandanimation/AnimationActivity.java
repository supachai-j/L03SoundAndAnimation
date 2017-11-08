package andriod.training.cat.com.l03soundandanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * Created by Supachai.ja on 11/8/2017.
 */


public class AnimationActivity extends AppCompatActivity {

    ImageView imv_cloud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imv_cloud = (ImageView) findViewById(R.id.lo_imv_cloud);

        TranslateAnimation animation = new TranslateAnimation(0.0f, 0.0f, 20.0f, 0.0f);
        animation.setDuration(1000);
        animation.setRepeatCount(1);
        animation.setRepeatMode(2); // reverse
        animation.setFillAfter(true);

        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
            @Override
            public void onAnimationStart(android.view.animation.Animation animation) {

            }

            @Override
            public void onAnimationEnd(android.view.animation.Animation animation) {
                imv_cloud.startAnimation(animation); // loop
            }

            @Override
            public void onAnimationRepeat(android.view.animation.Animation animation) {

            }
        });
        imv_cloud.startAnimation(animation);


    }

}
package hasancankazan.com.dpuburadaprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Windows8 on 19.4.2016.
 */
public class anasayfa extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.anasayfa);

        ImageView ımageView=(ImageView)findViewById(R.id.yemek);
        ImageView ımageView1=(ImageView)findViewById(R.id.ulas);
        ImageView ımageView2=(ImageView)findViewById(R.id.etkinlik);
        ImageView ımageView3=(ImageView)findViewById(R.id.tick);
        ımageView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anasayfa.this, yemek.class);
                anasayfa.this.startActivity(intent);
                anasayfa.this.finish();
            }
        });
        ımageView1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anasayfa.this, ulasim.class);
                anasayfa.this.startActivity(intent);
                anasayfa.this.finish();
            }
        });
        ımageView2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anasayfa.this, etkinlik.class);
                anasayfa.this.startActivity(intent);
                anasayfa.this.finish();
            }
        });
        ımageView3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(anasayfa.this, hesap.class);
                anasayfa.this.startActivity(intent);
                anasayfa.this.finish();
            }
        });

            //location iconunu küçültme animasyonunu çalıştırır.

        final ImageView iv = (ImageView)findViewById(R.id.orta);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.scale);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(an2);
                onStop();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}

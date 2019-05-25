package hasancankazan.com.dpuburadaprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Windows8 on 23.4.2016.
 */
public class yemek extends Activity {

    CalendarView calendar;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.yemek);

        calendar = (CalendarView)findViewById(R.id.calendar);


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view,int year,int month, int dayOfMonth){

                if (dayOfMonth==8) {
                    startActivity(new Intent(yemek.this, yemeklistesi.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"Liste Henüz Yüklenmedi.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

package hasancankazan.com.dpuburadaprojesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Windows8 on 29.4.2016.
 */
public class hesap extends Activity {

    EditText vizenotu,vizeyuzdesi,finalnotu,finalyuzdesi,odevnotu,odevyuzdesi;
    ImageButton hesapla;
    TextView ortalama , harfnotu;


    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    Spinner spinner7;
    Spinner spinner8;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.hesap);

        vizenotu=(EditText)findViewById(R.id.vizenotu);
        vizeyuzdesi=(EditText)findViewById(R.id.vizeyuzdesi);
        finalnotu=(EditText)findViewById(R.id.finalnotu);
        finalyuzdesi=(EditText)findViewById(R.id.finalyuzdesi);
        odevnotu=(EditText)findViewById(R.id.odevnotu);
        odevyuzdesi=(EditText)findViewById(R.id.odevyuzdesi);
        ortalama = (TextView)findViewById(R.id.ortSonuc);
        harfnotu = (TextView)findViewById(R.id.harfnotu);
        hesapla=(ImageButton)findViewById(R.id.hesapla);
        odevnotu.setText(0+"");
        odevyuzdesi.setText(0+"");

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double genelvize =(Double.parseDouble(vizenotu.getText().toString())*Double.parseDouble(vizeyuzdesi.getText().toString()))/100;
                double genelfinal =(Double.parseDouble(finalnotu.getText().toString())*Double.parseDouble(finalyuzdesi.getText().toString()))/100;
                double genelodev =(Double.parseDouble(odevnotu.getText().toString())*Double.parseDouble(odevyuzdesi.getText().toString()))/100;

                double genelort = genelvize + genelfinal + genelodev;
                ortalama.setText(genelort+"");


                if(Double.parseDouble(finalnotu.getText().toString()) < 50){
                    Toast.makeText(getApplicationContext(),"Final notu 50'den düşük olduğu için kaldınız. Daha çok çalışmalısınız.", Toast.LENGTH_LONG).show();
                    harfnotu.setText("");
                }
                else {
                    if (genelort < 40) {
                        harfnotu.setText("FF");
                    } else if (genelort < 50 && genelort >= 40) {
                        harfnotu.setText("FD");
                    } else if (genelort < 57 && genelort >= 50) {
                        harfnotu.setText("DD");
                    } else if (genelort < 64 && genelort >= 57) {
                        harfnotu.setText("DC");
                    } else if (genelort < 71 && genelort >= 64) {
                        harfnotu.setText("CC");
                    } else if (genelort < 78 && genelort >= 71) {
                        harfnotu.setText("CB");
                    } else if (genelort < 85 && genelort >= 78) {
                        harfnotu.setText("BB");
                    } else if (genelort < 92 && genelort >= 85) {
                        harfnotu.setText("BA");
                    } else {
                        harfnotu.setText("AA");
                    }
                }
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(this, R.array.HarfNotu,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] harfnotudizisi = getResources().getStringArray(R.array.HarfNotu);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

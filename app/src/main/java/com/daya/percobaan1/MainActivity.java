package com.daya.percobaan1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void hitungOnClick(View target) {
            TextView panjang = (TextView) findViewById(R.id.editPanjang);
            TextView lebar = (TextView) findViewById(R.id.editLebar);
            TextView hasil = (TextView) findViewById(R.id.textHasil);
            Double nPanjang = Double.parseDouble(panjang.getText().toString());
            Double nLebar = Double.parseDouble(lebar.getText().toString());
            Double nHasil = nPanjang * nLebar * 0.5;
            Resources res = getResources();
            hasil.setText(String.format(res.getString(R.string.lblHasil),nHasil));
        }

        public void pindahOnClick(View target){
            Intent hasil = new Intent(getApplicationContext(),hasildisini.class);
            startActivities(hasil);

        }

    }
}

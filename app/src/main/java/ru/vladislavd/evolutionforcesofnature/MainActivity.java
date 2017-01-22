package ru.vladislavd.evolutionforcesofnature;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageView imageView = (ImageView)findViewById(R.id.cards);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer random = 1 + (int)(Math.random() * 20);

                Snackbar.make(view, "Выпало " + random, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                if (random < 11) {
                    // Стабильность
                    imageView.setImageResource(R.drawable.stability);
                } else if (random < 13) {
                    // Засуха
                    imageView.setImageResource(R.drawable.drought);
                } else if (random < 15) {
                    // Урожай
                    imageView.setImageResource(R.drawable.harvest);
                } else if (random < 17) {
                    // Голод
                    imageView.setImageResource(R.drawable.hunger);
                } else if (random == 17) {
                    // Катаклизм
                    imageView.setImageResource(R.drawable.cataclysm);
                } else if (random == 18) {
                    // Скачок в эволюции
                    imageView.setImageResource(R.drawable.leap_in_evolution);
                } else if (random == 19) {
                    // Пожар
                    imageView.setImageResource(R.drawable.fire);
                } else if (random == 20) {
                    // Ледниковый период
                    imageView.setImageResource(R.drawable.ice_age);
                }

            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}

package com.example.christian.primenumbergame;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int number;
    private int score =0 ;

    private void begingame(){
        displayScore();
        displayRandomNumber();
    }

    public void onClickPrime(View view){
        if(isPrime(number)){
            score++;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else{
            score -=5;
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }
        begingame();
    }

    public void onClickComposite(View view){
        if(isPrime(number))
        {
            score-=5;
            Toast.makeText(this, "Wrong!", Toast. LENGTH_SHORT).show();
        }
        else{
            score++;
            Toast.makeText(this,"Correct", Toast. LENGTH_SHORT).show();
        }
        begingame();
    }


    private boolean isPrime(int value){
        for(int i = 2; i < value; i++){
            if (value % i ==0){
                return false;
            }
        }
        return true;
    }


    private void displayRandomNumber(){
    Random question = new Random();
        number = 2+ question.nextInt(1000);
        TextView quest = (TextView) findViewById(R.id.Number);
        quest.setText("" + number);
    }

    private void displayScore(){
    TextView dscore = (TextView) findViewById(R.id.scoreview);
        dscore.setText("Score:" + score);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
begingame();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

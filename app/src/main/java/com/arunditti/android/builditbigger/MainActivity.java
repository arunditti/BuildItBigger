package com.arunditti.android.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.arunditti.android.displayajoke.DisplayAJokeActivity;
import com.arunditti.android.javajokes.Joker;

public class MainActivity extends AppCompatActivity {

    Joker myJoker = new Joker();
    String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tellJoke(View view) {
        mJoke = myJoker.getJoke();
        Intent intentThatStartsDisplayAJokeActivity = new Intent(this, DisplayAJokeActivity.class);
        intentThatStartsDisplayAJokeActivity.putExtra(DisplayAJokeActivity.JOKE_KEY, mJoke);
        startActivity(intentThatStartsDisplayAJokeActivity);
        Toast.makeText(this, myJoker.getJoke(), Toast.LENGTH_SHORT).show();
    }
}

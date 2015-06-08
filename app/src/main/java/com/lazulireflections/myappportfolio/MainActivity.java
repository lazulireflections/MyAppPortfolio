package com.lazulireflections.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void clickApp1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.app1_toast), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clickApp2(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.app2_toast), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clickApp3(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.app3_toast), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clickApp4(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.app4_toast), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clickApp5(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.app5_toast), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clickApp6(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.app6_toast), Toast.LENGTH_SHORT);
        toast.show();
    }
}

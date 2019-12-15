package com.example.michael.homework2;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private GestureDetectorCompat mDetector;
    private static final String DEBUG_TAG = "Gestures";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(DEBUG_TAG, "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        mDetector = new GestureDetectorCompat(this,this);
        mDetector.setOnDoubleTapListener(this);
        makeMeASnackbar("Why Hello!");

        //Draw snowman
        final SnowmanView snowman = (SnowmanView) findViewById(R.id.snowmanview);
        snowman.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SnowmanView localSnowman = (SnowmanView) v;
                Log.d(DEBUG_TAG, "Clicked Snowman view");
                localSnowman.setScalar(2);
                localSnowman.invalidate();
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actions, menu);
        return true;
    }

    public void viewNumbers(View view){
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //use switch statement for each button's functionality
        //switch(item.getItemId()) {
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);

        return true;
    }

    public void makeMeASnackbar(String message) {
        //Snackbar.make(findViewById(R.id.myCoordinatorLayout), message, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.d(DEBUG_TAG, "Double Tap Called");
        makeMeASnackbar("Double Tap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.d(DEBUG_TAG, "onDown Called");
        makeMeASnackbar("onDown Called");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d(DEBUG_TAG, "onScroll Called");
        makeMeASnackbar("onScroll Called");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.d(DEBUG_TAG, "onLongPress Called");
        makeMeASnackbar("onLongPress Called");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling Called");
        makeMeASnackbar("onFling Called");
        return true;
    }

    //onDown
    //onFling
    //onLongPress
    //onScroll
    //onDoubleTap
}

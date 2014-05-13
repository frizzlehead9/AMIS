package com.issinc.amis.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.amis.R;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /***
     * Opens the configure view
     * @param view
     */
    public void configure(View view) {
        Intent intent = new Intent(this, ConfigureActivity.class);
        startActivity(intent);
    }
}

package com.doodat.gfgfadingactionbar;

import android.app.Activity;
import android.os.Bundle;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;

public class MainActivity extends Activity {  // extend the MainActivity to Activity instead of AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Adding FadingActionBar in the Activity

        FadingActionBarHelper helper = new FadingActionBarHelper()
                .actionBarBackground(R.drawable.ab_background)
                // actionBarBackground sets the background of actionBar in collapsed form
                .headerLayout(R.layout.header)
                // headerLayout sets the header layout of actionBar in expanded form
                .contentLayout(R.layout.activity_main);
                // contentLayout sets the main content below action bar
        setContentView(helper.createView(this));
        helper.initActionBar(this);

    }
}
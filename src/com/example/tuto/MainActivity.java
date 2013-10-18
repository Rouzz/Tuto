package com.example.tuto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text = null;
	private String hibou = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        hibou = getResources().getString(R.string.hello_world);
        hibou = hibou.replace("world", "les Zéros ");
        
        text = new TextView(this);
        text.setText(hibou);
        setContentView(text);
        
        //setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

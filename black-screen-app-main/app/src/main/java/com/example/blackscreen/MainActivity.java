package com.example.blackscreen;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View blackView = new View(this);
        blackView.setBackgroundColor(Color.BLACK);
        setContentView(blackView);
    }
}

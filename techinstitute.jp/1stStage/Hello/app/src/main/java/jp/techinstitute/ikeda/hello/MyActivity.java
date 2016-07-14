package jp.techinstitute.ikeda.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView v = new MyView(this);
        Intent intent = getIntent();
        int vx = intent.getIntExtra("vx", 1);
        int vy = intent.getIntExtra("vy", 1);
        v.mVX = vx;
        v.mVY = vy;
        setContentView(v);
    }
}

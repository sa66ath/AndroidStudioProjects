package jp.techinstitute.ikeda.hello;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreateが実行されました");
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        btn.setText("Hello");
        mPlayer = MediaPlayer.create(this, R.raw.music);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button)v;
                b.setText("こんにちは");
                mPlayer.start();
            }
        });
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyActivity.class);
                intent.putExtra("vx", 10);
                intent.putExtra("vy", 10);
                startActivity(intent);
            }
        });
      }

    @Override
    protected void onStop() {
        super.onStop();
        mPlayer.stop();
        Log.d("TAG", "onStopが実行されました");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroyが実行されました");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPauseが実行されました");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResumeが実行されました");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStartが実行されました");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestartが実行されました");
    }

}

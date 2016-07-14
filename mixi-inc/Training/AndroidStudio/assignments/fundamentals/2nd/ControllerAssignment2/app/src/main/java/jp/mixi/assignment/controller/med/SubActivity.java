package jp.mixi.assignment.controller.med;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * TODO: 課題2
 * 画面回転や、他のアプリ・画面の起動等で、状態遷移が起こると、それ以前の状態で持っていたデータが失われてしまいます。
 * これを防ぐため、この Activity の中で状態管理をしてください。
 * @author keishin.yokomaku
 */
public class SubActivity extends Activity implements TextWatcher {
    static final String FORM_NAME = "text";
    EditText editText;
    TextView textView;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Hint: 状態遷移が何も起こっていない場合は、savedInstanceState は null です
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        editText = (EditText) findViewById(R.id.Editor);
        textView = (TextView) findViewById(R.id.SyncedText);

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());

    }

    @Override
    protected void onStart() {
        super.onStart();

        textView.setText(editText.getText());
        editText.addTextChangedListener(this);

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    /**
     * TODO: 復帰処理はこちらか onCreate
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString(FORM_NAME));

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onResume() {
        super.onResume();

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onPause() {
        super.onPause();

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    /**
     * TODO: 保存処理はこちら
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(FORM_NAME, textView.getText().toString());

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }



    @Override
    protected void onStop() {
        super.onStop();
        EditText text = (EditText) findViewById(R.id.Editor);
        text.removeTextChangedListener(this);

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showMethodName(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void afterTextChanged(Editable s) {}

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        textView.setText(s);
    }



    private void showMethodName(String method) {
        Log.d(TAG, method);
        //++++++    Toast.makeText(this, TAG + "." + method, Toast.LENGTH_LONG).show();
    }
}
package com.example.cxy.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 用AS进行NDK及JNI的开发练习：注重流程
 */
public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    static {
        System.loadLibrary("Hello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.tvJni);
        mTextView.setText(HelloWorld.helloWorld() + "\n" + "嘿嘿");
    }
}

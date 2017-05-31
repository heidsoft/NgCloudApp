package com.heidsoft.ngcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.heidsoft.ngcloud.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user clicks the Send button
     * Intent 是指在相互独立的组件（如两个 Activity）之间提供运行时绑定功能的对象。
     * Intent 表示一个应用“执行某项操作的 Intent”。
     * 您可以将 Intent 用于各种任务，但在本课程中，Intent 用于启动另一个 Activity。
     * */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        System.out.println(message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

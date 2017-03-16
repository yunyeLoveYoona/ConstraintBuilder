package com.xkeshi.constraintbuilder;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setText("这是一个测试view");
        ConstraintBuilder.Builder(textView, (ConstraintLayout) findViewById(R.id.parent))
                .size(0.2f, 0.3f).center().top(R.id.editText).bottom().left().right().build();
    }
}

package com.example.ansam.stackviewexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.StackView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private StackView stackView;
    String[] IMAGE_NAMES= {"bella","cinderella", "rapunzel", "snow","aurora"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stackView=(StackView)findViewById(R.id.stackview);
        List<stackItem>list=new ArrayList<stackItem>();
        for(String imageName: IMAGE_NAMES) {
            list.add(new stackItem(imageName+".png", imageName));
        }
        StackAdapter adapt = new StackAdapter(this, R.layout.stack_item, list);
        stackView.setAdapter(adapt);
        stackView.setHorizontalScrollBarEnabled(true);
        stackView.setBackgroundColor(Color.rgb(230, 255, 255));


    }
}

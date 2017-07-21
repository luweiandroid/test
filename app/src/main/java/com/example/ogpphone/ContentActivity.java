package com.example.ogpphone;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.ogpphone.fragment.EventFragment;
import com.example.ogpphone.fragment.MainFragment;
import com.example.ogpphone.fragment.QRFragment;
import com.example.ogpphone.fragment.TaskFragment;

public class ContentActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private MainFragment fragment01;
    private EventFragment fragment03;
    private TaskFragment fragment02;
    private QRFragment fragment04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        radioGroup= (RadioGroup) findViewById(R.id.radiogroup);
        fragment01= (MainFragment) manager.findFragmentById(R.id.fragment01);
        fragment02= (TaskFragment) manager.findFragmentById(R.id.fragment02);
        fragment03= (EventFragment) manager.findFragmentById(R.id.fragment03);
        fragment04= (QRFragment) manager.findFragmentById(R.id.fragment04);
        radioGroup.setOnCheckedChangeListener(this);
        transaction.hide(fragment02).hide(fragment03).hide(fragment04)
                .show(fragment01);
        transaction.commit();

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        switch (checkedId){
            case R.id.frag01:
                transaction.show(fragment01).hide(fragment02)
                        .hide(fragment03).hide(fragment04).commit();
                break;
            case R.id.frag02:
                transaction.show(fragment02).hide(fragment01)
                        .hide(fragment03).hide(fragment04).commit();
                break;
            case R.id.frag03:
                transaction.show(fragment03).hide(fragment02)
                        .hide(fragment01).hide(fragment04).commit();
                break;
            case R.id.frag04:
                transaction.show(fragment04).hide(fragment02)
                        .hide(fragment03).hide(fragment01).commit();
                break;







        }





    }
}

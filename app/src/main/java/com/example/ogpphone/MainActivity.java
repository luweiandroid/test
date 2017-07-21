package com.example.ogpphone;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private ImageButton select_host;
    private static final int REQUEST_CODE_SCAN = 0x0000;
    private static final String DECODED_CONTENT_KEY = "codedContent";
    private static final String DECODED_BITMAP_KEY = "codedBitmap";
    private EditText replace;
    private Button who;
    private int kk=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSystemBar();
        replace= (EditText) findViewById(R.id.replace);
        login= (Button) findViewById(R.id.login);
        who= (Button) findViewById(R.id.who);
        select_host= (ImageButton) findViewById(R.id.set);
//        select_host.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,
//                        CaptureActivity.class);
//                startActivityForResult(intent, REQUEST_CODE_SCAN);
//            }
//        });
        who.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (kk==0){
                  replace.setVisibility(View.VISIBLE);
                  kk=1;
                  who.setText("本人上班");
              }else if(kk==1){
                    replace.setVisibility(View.GONE);
                    kk=0;
                  who.setText("代人上班");
              }
            }
        });
    }
    private void initSystemBar() {
        //判断版本
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //5.0以上要现将状态栏设置为透明才可以着色
            Window win = getWindow();
            WindowManager.LayoutParams winParams = win.getAttributes();
            //修改window的综合属性flags
            //WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS含义为状态栏透明
            winParams.flags |= WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
            win.setAttributes(winParams);
        }
        //调用开源库SystemBarTintManager进行状态栏着色 产生沉浸式效果
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);//使用状态栏着色可用
        tintManager.setStatusBarTintColor(Color.parseColor("#e73148"));//指定颜色进行着色
    }
}

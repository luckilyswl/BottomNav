package com.qingshangzuo.pagelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qingshangzuo.pagelayout.style1.Style1Activity;
import com.qingshangzuo.pagelayout.style2.Style2Activity;
import com.qingshangzuo.pagelayout.style3.Style3Activity;


/**
 *  继承 View.OnClickListener 可以减少代码量
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnStyle1;
    private Button btnStyle2;
    private Button btnStyle3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    //激活控件
    private void initView() {
        btnStyle1 = findViewById(R.id.btn_style1);
        btnStyle2 = findViewById(R.id.btn_style2);
        btnStyle3 = findViewById(R.id.btn_style3);

        //看到这样，记得 implements View.OnClickListener
        btnStyle1.setOnClickListener(this);
        btnStyle2.setOnClickListener(this);
        btnStyle3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_style1:
                startActivity(
                        new Intent(MainActivity.this, Style1Activity.class)
                );
                break;
            case R.id.btn_style2:
                startActivity(
                        new Intent(MainActivity.this, Style2Activity.class)
                );
                break;
            case R.id.btn_style3:
                startActivity(
                        new Intent(MainActivity.this, Style3Activity.class)
                );
                break;
            default:
                break;
        }
    }
}

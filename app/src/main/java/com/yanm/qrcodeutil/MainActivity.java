package com.yanm.qrcodeutil;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.yanm.qrcodeutil.zxing.QRCodeUtil;

public class MainActivity extends AppCompatActivity {
    ImageView mIvCode;
    Button mBtGenerateCode;
    EditText mEtContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvCode = findViewById(R.id.iv_code);
        mBtGenerateCode = findViewById(R.id.bt_generate_code);
        mEtContent = findViewById(R.id.et_content);
        mBtGenerateCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Bitmap code =  QRCodeUtil.createQRCodeBitmap(mEtContent.getText().toString(),320);
               mIvCode.setImageBitmap(code);
            }
        });
    }
}

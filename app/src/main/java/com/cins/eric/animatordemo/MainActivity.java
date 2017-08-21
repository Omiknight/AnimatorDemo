package com.cins.eric.animatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cins.eric.animatordemo.Model.TyingProduct;
import com.cins.eric.animatordemo.Model.TyingStatus;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button btn_change;
    public static final int SUPER_VIP = 71;
   public static final int stauts = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdsDialog dialog = new AdsDialog(this);

        btn_change = (Button) findViewById(R.id.btn_change);
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "默认Toast样式",
                        Toast.LENGTH_SHORT).show();
            }
        });

        HashMap<TyingProduct, TyingStatus> map = new HashMap<>();

        if (stauts ==2 ){
            dialog.show();
        }

    }
}

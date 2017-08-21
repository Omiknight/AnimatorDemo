package com.cins.eric.animatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cins.eric.animatordemo.Model.TyingProduct;
import com.cins.eric.animatordemo.Model.TyingStatus;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdsDialog dialog = new AdsDialog(this);


        HashMap<TyingProduct, TyingStatus> map = new HashMap<>();

        dialog.show();
    }
}

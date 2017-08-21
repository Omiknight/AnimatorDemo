package com.cins.eric.animatordemo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Eric on 2017/8/20.
 */

public class AdsDialog extends Dialog implements View.OnClickListener{
    private Context mContext;


    public AdsDialog(@NonNull Context context) {
        // 更改样式,把背景设置为透明的
        super(context, R.style.LocatonDialogStyle);
        this.mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.view_location_dialog_dong);
        ImageView imageView = (ImageView) findViewById(R.id.mm);
        imageView.setOnClickListener(this);
        initLayoutParams();

    }

    private void initLayoutParams() {
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER;
        params.alpha = 1f;
        getWindow().setAttributes(params);
        //no instance
    }
    @Override
    public void onClick(View view) {
        dismiss();
    }

}

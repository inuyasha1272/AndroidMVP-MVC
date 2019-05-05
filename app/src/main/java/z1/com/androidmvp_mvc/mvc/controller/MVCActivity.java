package z1.com.androidmvp_mvc.mvc.controller;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import z1.com.androidmvp_mvc.R;
import z1.com.androidmvp_mvc.mvc.model.DataCenter;
import z1.com.androidmvp_mvc.mvc.model.MVCDataBean;
import z1.com.androidmvp_mvc.mvc.view.MVCView;

//Controller
public class MVCActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);

        final MVCView mvcView = findViewById(R.id.mvc_view);
        final MVCDataBean data = DataCenter.getData();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mvcView.updateViewWithData(data);
            }
        }, 2000);
    }
}

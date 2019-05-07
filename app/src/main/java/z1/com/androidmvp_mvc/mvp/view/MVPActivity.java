package z1.com.androidmvp_mvc.mvp.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import z1.com.androidmvp_mvc.R;
import z1.com.androidmvp_mvc.mvp.model.MVPDataBean;
import z1.com.androidmvp_mvc.mvp.present.MVPTestPresenter;

//Controller
public class MVPActivity extends Activity implements IView<MVPDataBean>{

    private TextView mTv;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        mTv = findViewById(R.id.tv_mvc_view);
        mIv = findViewById(R.id.iv_mvc_view);

        new MVPTestPresenter(this).load();
    }

    @Override
    public void updateViews(MVPDataBean data) {
        if(data == null){
            return;
        }
        mTv.setText(data.text);
        mIv.setBackgroundColor(Color.parseColor(data.color));
    }
}

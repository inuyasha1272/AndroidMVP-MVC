package z1.com.androidmvp_mvc.mvc.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import z1.com.androidmvp_mvc.R;
import z1.com.androidmvp_mvc.mvc.model.MVCDataBean;

public class MVCView extends RelativeLayout {

    private TextView mTv;
    private ImageView mIv;

    public MVCView(Context context) {
        super(context);
    }

    public MVCView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MVCView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mTv = findViewById(R.id.tv_mvc_view);
        mIv = findViewById(R.id.iv_mvc_view);
    }

    public void updateViewWithData(MVCDataBean dataBean){
        if(dataBean == null){
            return;
        }
        mTv.setText(dataBean.text);
        mIv.setBackgroundColor(Color.parseColor(dataBean.color));
    }
}

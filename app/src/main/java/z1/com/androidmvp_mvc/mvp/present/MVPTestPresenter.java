package z1.com.androidmvp_mvc.mvp.present;

import z1.com.androidmvp_mvc.mvp.model.DataCenter;
import z1.com.androidmvp_mvc.mvp.model.MVPDataBean;
import z1.com.androidmvp_mvc.mvp.view.IView;

public class MVPTestPresenter extends Presenter {

    public MVPTestPresenter(IView view) {
        super(view);
    }

    @Override
    public void load() {
        MVPDataBean data = DataCenter.getData();
        view.updateViews(data);
    }
}

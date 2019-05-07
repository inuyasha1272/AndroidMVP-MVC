package z1.com.androidmvp_mvc.mvp.present;

import z1.com.androidmvp_mvc.mvp.view.IView;

public class TestPresenter extends Presenter {

    protected TestPresenter(IView view) {
        super(view);
    }

    @Override
    public void load() {
        // 查看继承关系的快捷键是：commend+alt+B
    }
}

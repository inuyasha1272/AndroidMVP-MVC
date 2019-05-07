package z1.com.androidmvp_mvc.mvp.present;

import z1.com.androidmvp_mvc.mvp.view.IView;

public abstract class Presenter<T extends IView> {

    protected Presenter(T view) {
        this.view = view;
    }

    protected T view;

    public abstract void load();
}

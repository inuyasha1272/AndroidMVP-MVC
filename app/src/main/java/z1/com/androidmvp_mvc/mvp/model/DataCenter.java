package z1.com.androidmvp_mvc.mvp.model;

public class DataCenter {
    public static MVPDataBean getData(){
        MVPDataBean mvcDataBean = new MVPDataBean();
        mvcDataBean.text = "hello MVP";
        mvcDataBean.color = "#ff00ff";
        return mvcDataBean;
    }
}

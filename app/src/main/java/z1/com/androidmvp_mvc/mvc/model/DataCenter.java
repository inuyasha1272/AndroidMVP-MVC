package z1.com.androidmvp_mvc.mvc.model;

public class DataCenter {
    public static MVCDataBean getData(){
        MVCDataBean mvcDataBean = new MVCDataBean();
        mvcDataBean.text = "hello MVC";
        mvcDataBean.color = "#ffff00";
        return mvcDataBean;
    }
}

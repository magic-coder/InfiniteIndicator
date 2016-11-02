package cn.lightsky.infiniteindicator;

/**
 * Created by xushuai on 2014/12/25.
 */
public class Page {
    public String data = "";
    public Object res;
    public OnPageClickListener onPageClickListener;

    public Page(Object res) {
        this.res = res;
    }

    public Page(String data, Object res) {
        this.data = data;
        this.res = res;
    }

    public Page(String data, Object url, OnPageClickListener listener) {
        this.data = data;
        this.res = url;
        this.onPageClickListener = listener;
    }

    public Page(Object url, OnPageClickListener listener) {
        this.res = url;
        this.onPageClickListener = listener;
    }
}
package com.zcn.demo.circleaddemo.util;

/**
 * Created by Administrator on 2017/9/7.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.zcn.demo.circleaddemo.activity.R;

/**
 * ImageView创建工厂
 */
public class ViewFactory {

    /**
     * 获取ImageView视图的同时加载显示url
     *
     * @param url
     * @return
     */
    public static ImageView getImageView(Context context, String url) {
        ImageView imageView = (ImageView)LayoutInflater.from(context).inflate(
                R.layout.view_banner, null);
        ImageLoader.getInstance().displayImage(url, imageView);
        return imageView;
    }
}


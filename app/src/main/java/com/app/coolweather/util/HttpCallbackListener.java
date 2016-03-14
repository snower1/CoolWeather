package com.app.coolweather.util;

/**
 * Created by hx on 2016-3-2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

package com.luck.picture.lib.app;

import android.content.Context;

import com.luck.picture.lib.engine.PictureSelectorEngine;

/**
 * @author：ko-devHong
 * @date：2023-02-06 15:14
 * @describe：IApp
 */
public interface IApp {
    /**
     * Application
     *
     * @return
     */
    Context getAppContext();

    /**
     * PictureSelectorEngine
     *
     * @return
     */
    PictureSelectorEngine getPictureSelectorEngine();
}

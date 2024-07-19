package com.luck.picture.lib;

import android.content.Context;
import android.content.ContextWrapper;

import com.luck.picture.lib.language.PictureLanguageUtils;

/**
 * @author：ko-devHong
 * @date：2023-02-06 19:34
 * @describe：ContextWrapper
 */
public class PictureContextWrapper extends ContextWrapper {

    public PictureContextWrapper(Context base) {
        super(base);
    }

    public static ContextWrapper wrap(Context context, int language) {
        PictureLanguageUtils.setAppLanguage(context, language);
        return new PictureContextWrapper(context);
    }
}

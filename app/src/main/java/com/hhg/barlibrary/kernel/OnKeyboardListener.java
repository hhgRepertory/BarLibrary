package com.hhg.barlibrary.kernel;

/**
 * author  : hhg
 * e-mail  : hhg673@foxmail.com
 * date    : 2017/11/8.
 * desc    : 软键盘监听  kernel 核心功能包
 * version : 1.0.0
 */
public interface OnKeyboardListener {
    /**
     * On keyboard change.
     *
     * @param isPopup        the is popup  是否弹出
     * @param keyboardHeight the keyboard height  软键盘高度
     */
    void onKeyboardChange(boolean isPopup, int keyboardHeight);
}

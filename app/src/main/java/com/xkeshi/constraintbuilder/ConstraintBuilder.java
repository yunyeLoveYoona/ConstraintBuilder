package com.xkeshi.constraintbuilder;

import android.support.constraint.ConstraintLayout;
import android.view.View;

/**
 * ConstraintLayout约束创建
 * Created by dell on 2017/3/16.
 */

public class ConstraintBuilder {
    private static ConstraintBuilder _this;
    private ConstraintLayout parent;
    private ConstraintLayout.LayoutParams layoutParams;
    private View child;

    private ConstraintBuilder() {

    }

    public static ConstraintBuilder Builder(View view, ConstraintLayout constraintLayout) {
        _this = new ConstraintBuilder();
        _this.child = view;
        _this.parent = constraintLayout;
        _this.layoutParams = new ConstraintLayout.LayoutParams(view.getWidth(), view.getHeight());
        return _this;
    }

    public void build() {
        _this.child.setLayoutParams(_this.layoutParams);
        _this.parent.addView(_this.child, _this.parent.getChildCount(), _this.layoutParams);
    }


    public ConstraintBuilder size(int width, int height) {
        _this.layoutParams.width = width;
        _this.layoutParams.height = height;
        return _this;
    }


    public ConstraintBuilder size(float widthPercent, float heightPercent) {
        _this.layoutParams.width = (int) (widthPercent * _this.parent.getLayoutParams().width);
        _this.layoutParams.height = (int) (heightPercent * _this.parent.getLayoutParams().height);
        return _this;
    }

    public ConstraintBuilder bias(float horizontal, float vertical) {
        _this.layoutParams.horizontalBias = horizontal;
        _this.layoutParams.verticalBias = vertical;
        return _this;
    }

    public ConstraintBuilder top(int id) {
        _this.layoutParams.topToTop = id;
        return _this;
    }

    public ConstraintBuilder top() {
        _this.layoutParams.topToTop = 0;
        return _this;
    }

    public ConstraintBuilder bottom(int id) {
        _this.layoutParams.bottomToBottom = id;
        return _this;
    }

    public ConstraintBuilder bottom() {
        _this.layoutParams.bottomToBottom = 0;
        return _this;
    }

    public ConstraintBuilder left(int id) {
        _this.layoutParams.leftToLeft = id;
        return _this;
    }

    public ConstraintBuilder left() {
        _this.layoutParams.leftToLeft = 0;
        return _this;
    }

    public ConstraintBuilder right(int id) {
        _this.layoutParams.rightToRight = id;
        return _this;
    }

    public ConstraintBuilder right() {
        _this.layoutParams.rightToRight = 0;
        return _this;
    }

    public ConstraintBuilder center() {
        _this.layoutParams.horizontalBias = 0.5f;
        _this.layoutParams.verticalBias = 0.5f;
        return _this;
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class h extends CheckBox implements android.support.v4.widget.l {

    /* renamed from: b  reason: collision with root package name */
    private final j f1025b;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.checkboxStyle);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(s0.b(context), attributeSet, i2);
        j jVar = new j(this);
        this.f1025b = jVar;
        jVar.e(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f1025b;
        return jVar != null ? jVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f1025b;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f1025b;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(t.b.d(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f1025b;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // android.support.v4.widget.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f1025b;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    @Override // android.support.v4.widget.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1025b;
        if (jVar != null) {
            jVar.h(mode);
        }
    }
}
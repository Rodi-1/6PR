package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p001v4.widget.InterfaceC0163l;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p020s.C0569a;
import p021t.C0580b;

/* renamed from: android.support.v7.widget.h */
/* loaded from: classes.dex */
public class C0267h extends CheckBox implements InterfaceC0163l {

    /* renamed from: b */
    private final C0274j f1313b;

    public C0267h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.checkboxStyle);
    }

    public C0267h(Context context, AttributeSet attributeSet, int i) {
        super(C0310s0.m1129b(context), attributeSet, i);
        C0274j c0274j = new C0274j(this);
        this.f1313b = c0274j;
        c0274j.m1263e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0274j c0274j = this.f1313b;
        return c0274j != null ? c0274j.m1266b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0274j c0274j = this.f1313b;
        if (c0274j != null) {
            return c0274j.m1265c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0274j c0274j = this.f1313b;
        if (c0274j != null) {
            return c0274j.m1264d();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0580b.m98d(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0274j c0274j = this.f1313b;
        if (c0274j != null) {
            c0274j.m1262f();
        }
    }

    @Override // android.support.p001v4.widget.InterfaceC0163l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0274j c0274j = this.f1313b;
        if (c0274j != null) {
            c0274j.m1261g(colorStateList);
        }
    }

    @Override // android.support.p001v4.widget.InterfaceC0163l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0274j c0274j = this.f1313b;
        if (c0274j != null) {
            c0274j.m1260h(mode);
        }
    }
}
package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p016o.InterfaceC0489n;
import p020s.C0569a;
import p021t.C0580b;

/* renamed from: android.support.v7.widget.q */
/* loaded from: classes.dex */
public class C0305q extends MultiAutoCompleteTextView implements InterfaceC0489n {

    /* renamed from: d */
    private static final int[] f1474d = {16843126};

    /* renamed from: b */
    private final C0259f f1475b;

    /* renamed from: c */
    private final C0329y f1476c;

    public C0305q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.autoCompleteTextViewStyle);
    }

    public C0305q(Context context, AttributeSet attributeSet, int i) {
        super(C0310s0.m1129b(context), attributeSet, i);
        C0316v0 m1108t = C0316v0.m1108t(getContext(), attributeSet, f1474d, i, 0);
        if (m1108t.m1111q(0)) {
            setDropDownBackgroundDrawable(m1108t.m1122f(0));
        }
        m1108t.m1107u();
        C0259f c0259f = new C0259f(this);
        this.f1475b = c0259f;
        c0259f.m1316e(attributeSet, i);
        C0329y m1049e = C0329y.m1049e(this);
        this.f1476c = m1049e;
        m1049e.mo1020m(attributeSet, i);
        m1049e.mo1021c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            c0259f.m1319b();
        }
        C0329y c0329y = this.f1476c;
        if (c0329y != null) {
            c0329y.mo1021c();
        }
    }

    @Override // p016o.InterfaceC0489n
    public ColorStateList getSupportBackgroundTintList() {
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            return c0259f.m1318c();
        }
        return null;
    }

    @Override // p016o.InterfaceC0489n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            return c0259f.m1317d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0292m.m1188a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            c0259f.m1315f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            c0259f.m1314g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0580b.m98d(getContext(), i));
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            c0259f.m1312i(colorStateList);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0259f c0259f = this.f1475b;
        if (c0259f != null) {
            c0259f.m1311j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0329y c0329y = this.f1476c;
        if (c0329y != null) {
            c0329y.m1039p(context, i);
        }
    }
}
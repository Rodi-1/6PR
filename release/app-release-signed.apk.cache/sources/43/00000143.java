package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p013l.C0425a;
import p016o.InterfaceC0489n;
import p020s.C0569a;

/* renamed from: android.support.v7.widget.l */
/* loaded from: classes.dex */
public class C0289l extends EditText implements InterfaceC0489n {

    /* renamed from: b */
    private final C0259f f1409b;

    /* renamed from: c */
    private final C0329y f1410c;

    public C0289l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.editTextStyle);
    }

    public C0289l(Context context, AttributeSet attributeSet, int i) {
        super(C0310s0.m1129b(context), attributeSet, i);
        C0259f c0259f = new C0259f(this);
        this.f1409b = c0259f;
        c0259f.m1316e(attributeSet, i);
        C0329y m1049e = C0329y.m1049e(this);
        this.f1410c = m1049e;
        m1049e.mo1020m(attributeSet, i);
        m1049e.mo1021c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            c0259f.m1319b();
        }
        C0329y c0329y = this.f1410c;
        if (c0329y != null) {
            c0329y.mo1021c();
        }
    }

    @Override // p016o.InterfaceC0489n
    public ColorStateList getSupportBackgroundTintList() {
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            return c0259f.m1318c();
        }
        return null;
    }

    @Override // p016o.InterfaceC0489n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            return c0259f.m1317d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return C0425a.m609a() ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0292m.m1188a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            c0259f.m1315f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            c0259f.m1314g(i);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            c0259f.m1312i(colorStateList);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0259f c0259f = this.f1409b;
        if (c0259f != null) {
            c0259f.m1311j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0329y c0329y = this.f1410c;
        if (c0329y != null) {
            c0329y.m1039p(context, i);
        }
    }
}
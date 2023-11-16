package android.support.p002v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p021t.C0580b;

/* renamed from: android.support.v7.widget.i */
/* loaded from: classes.dex */
public class C0271i extends CheckedTextView {

    /* renamed from: c */
    private static final int[] f1325c = {16843016};

    /* renamed from: b */
    private final C0329y f1326b;

    public C0271i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0271i(Context context, AttributeSet attributeSet, int i) {
        super(C0310s0.m1129b(context), attributeSet, i);
        C0329y m1049e = C0329y.m1049e(this);
        this.f1326b = m1049e;
        m1049e.mo1020m(attributeSet, i);
        m1049e.mo1021c();
        C0316v0 m1108t = C0316v0.m1108t(getContext(), attributeSet, f1325c, i, 0);
        setCheckMarkDrawable(m1108t.m1122f(0));
        m1108t.m1107u();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0329y c0329y = this.f1326b;
        if (c0329y != null) {
            c0329y.mo1021c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0292m.m1188a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0580b.m98d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0329y c0329y = this.f1326b;
        if (c0329y != null) {
            c0329y.m1039p(context, i);
        }
    }
}
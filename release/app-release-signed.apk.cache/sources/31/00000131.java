package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class i extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1037c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final y f1038b;

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public i(Context context, AttributeSet attributeSet, int i2) {
        super(s0.b(context), attributeSet, i2);
        y e2 = y.e(this);
        this.f1038b = e2;
        e2.m(attributeSet, i2);
        e2.c();
        v0 t2 = v0.t(getContext(), attributeSet, f1037c, i2, 0);
        setCheckMarkDrawable(t2.f(0));
        t2.u();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f1038b;
        if (yVar != null) {
            yVar.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(t.b.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1038b;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }
}
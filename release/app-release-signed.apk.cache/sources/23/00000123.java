package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class e extends AutoCompleteTextView implements o.n {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f996d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    private final f f997b;

    /* renamed from: c  reason: collision with root package name */
    private final y f998c;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.autoCompleteTextViewStyle);
    }

    public e(Context context, AttributeSet attributeSet, int i2) {
        super(s0.b(context), attributeSet, i2);
        v0 t2 = v0.t(getContext(), attributeSet, f996d, i2, 0);
        if (t2.q(0)) {
            setDropDownBackgroundDrawable(t2.f(0));
        }
        t2.u();
        f fVar = new f(this);
        this.f997b = fVar;
        fVar.e(attributeSet, i2);
        y e2 = y.e(this);
        this.f998c = e2;
        e2.m(attributeSet, i2);
        e2.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f997b;
        if (fVar != null) {
            fVar.b();
        }
        y yVar = this.f998c;
        if (yVar != null) {
            yVar.c();
        }
    }

    @Override // o.n
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f997b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // o.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f997b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f997b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f fVar = this.f997b;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(t.b.d(getContext(), i2));
    }

    @Override // o.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f997b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f997b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f998c;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }
}
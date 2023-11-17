package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public class l extends EditText implements o.n {

    /* renamed from: b  reason: collision with root package name */
    private final f f1107b;

    /* renamed from: c  reason: collision with root package name */
    private final y f1108c;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.editTextStyle);
    }

    public l(Context context, AttributeSet attributeSet, int i2) {
        super(s0.b(context), attributeSet, i2);
        f fVar = new f(this);
        this.f1107b = fVar;
        fVar.e(attributeSet, i2);
        y e2 = y.e(this);
        this.f1108c = e2;
        e2.m(attributeSet, i2);
        e2.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1107b;
        if (fVar != null) {
            fVar.b();
        }
        y yVar = this.f1108c;
        if (yVar != null) {
            yVar.c();
        }
    }

    @Override // o.n
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1107b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // o.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1107b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return l.a.a() ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1107b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f fVar = this.f1107b;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1107b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1107b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1108c;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }
}
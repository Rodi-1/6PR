package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* loaded from: classes.dex */
public class a0 extends TextView implements o.n, android.support.v4.widget.b {

    /* renamed from: b  reason: collision with root package name */
    private final f f957b;

    /* renamed from: c  reason: collision with root package name */
    private final y f958c;

    public a0(Context context) {
        this(context, null);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public a0(Context context, AttributeSet attributeSet, int i2) {
        super(s0.b(context), attributeSet, i2);
        f fVar = new f(this);
        this.f957b = fVar;
        fVar.e(attributeSet, i2);
        y e2 = y.e(this);
        this.f958c = e2;
        e2.m(attributeSet, i2);
        e2.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f957b;
        if (fVar != null) {
            fVar.b();
        }
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.c();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (android.support.v4.widget.b.f532a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f958c;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (android.support.v4.widget.b.f532a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f958c;
        if (yVar != null) {
            return yVar.h();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (android.support.v4.widget.b.f532a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f958c;
        if (yVar != null) {
            return yVar.i();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (android.support.v4.widget.b.f532a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f958c;
        return yVar != null ? yVar.j() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (android.support.v4.widget.b.f532a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f958c;
        if (yVar != null) {
            return yVar.k();
        }
        return 0;
    }

    @Override // o.n
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f957b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // o.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f957b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.o(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f958c;
        if (yVar == null || android.support.v4.widget.b.f532a || !yVar.l()) {
            return;
        }
        this.f958c.d();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (android.support.v4.widget.b.f532a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.r(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (android.support.v4.widget.b.f532a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.s(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (android.support.v4.widget.b.f532a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.t(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f957b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        f fVar = this.f957b;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f957b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // o.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f957b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (android.support.v4.widget.b.f532a) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f958c;
        if (yVar != null) {
            yVar.u(i2, f2);
        }
    }
}
package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p001v4.widget.InterfaceC0138b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import p016o.InterfaceC0489n;

/* renamed from: android.support.v7.widget.a0 */
/* loaded from: classes.dex */
public class C0240a0 extends TextView implements InterfaceC0489n, InterfaceC0138b {

    /* renamed from: b */
    private final C0259f f1236b;

    /* renamed from: c */
    private final C0329y f1237c;

    public C0240a0(Context context) {
        this(context, null);
    }

    public C0240a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0240a0(Context context, AttributeSet attributeSet, int i) {
        super(C0310s0.m1129b(context), attributeSet, i);
        C0259f c0259f = new C0259f(this);
        this.f1236b = c0259f;
        c0259f.m1316e(attributeSet, i);
        C0329y m1049e = C0329y.m1049e(this);
        this.f1237c = m1049e;
        m1049e.mo1020m(attributeSet, i);
        m1049e.mo1021c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            c0259f.m1319b();
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.mo1021c();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0138b.f682a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            return c0329y.m1047g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0138b.f682a) {
            return super.getAutoSizeMinTextSize();
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            return c0329y.m1046h();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0138b.f682a) {
            return super.getAutoSizeStepGranularity();
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            return c0329y.m1045i();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0138b.f682a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0329y c0329y = this.f1237c;
        return c0329y != null ? c0329y.m1044j() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0138b.f682a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            return c0329y.m1043k();
        }
        return 0;
    }

    @Override // p016o.InterfaceC0489n
    public ColorStateList getSupportBackgroundTintList() {
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            return c0259f.m1318c();
        }
        return null;
    }

    @Override // p016o.InterfaceC0489n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            return c0259f.m1317d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0292m.m1188a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.m1040o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0329y c0329y = this.f1237c;
        if (c0329y == null || InterfaceC0138b.f682a || !c0329y.m1042l()) {
            return;
        }
        this.f1237c.m1050d();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0138b.f682a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.m1037r(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0138b.f682a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.m1036s(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0138b.f682a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.m1035t(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            c0259f.m1315f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            c0259f.m1314g(i);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            c0259f.m1312i(colorStateList);
        }
    }

    @Override // p016o.InterfaceC0489n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0259f c0259f = this.f1236b;
        if (c0259f != null) {
            c0259f.m1311j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.m1039p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0138b.f682a) {
            super.setTextSize(i, f);
            return;
        }
        C0329y c0329y = this.f1237c;
        if (c0329y != null) {
            c0329y.m1034u(i, f);
        }
    }
}
package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1056a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1057b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1058c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1059d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1060e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1061f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(CompoundButton compoundButton) {
        this.f1056a = compoundButton;
    }

    void a() {
        Drawable a2 = android.support.v4.widget.c.a(this.f1056a);
        if (a2 != null) {
            if (this.f1059d || this.f1060e) {
                Drawable mutate = j.a.p(a2).mutate();
                if (this.f1059d) {
                    j.a.n(mutate, this.f1057b);
                }
                if (this.f1060e) {
                    j.a.o(mutate, this.f1058c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1056a.getDrawableState());
                }
                this.f1056a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1057b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1058c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1056a.getContext().obtainStyledAttributes(attributeSet, s.j.F0, i2, 0);
        try {
            int i3 = s.j.G0;
            if (obtainStyledAttributes.hasValue(i3) && (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) != 0) {
                CompoundButton compoundButton = this.f1056a;
                compoundButton.setButtonDrawable(t.b.d(compoundButton.getContext(), resourceId));
            }
            int i4 = s.j.H0;
            if (obtainStyledAttributes.hasValue(i4)) {
                android.support.v4.widget.c.b(this.f1056a, obtainStyledAttributes.getColorStateList(i4));
            }
            int i5 = s.j.I0;
            if (obtainStyledAttributes.hasValue(i5)) {
                android.support.v4.widget.c.c(this.f1056a, e0.d(obtainStyledAttributes.getInt(i5, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f1061f) {
            this.f1061f = false;
            return;
        }
        this.f1061f = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1057b = colorStateList;
        this.f1059d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1058c = mode;
        this.f1060e = true;
        a();
    }
}
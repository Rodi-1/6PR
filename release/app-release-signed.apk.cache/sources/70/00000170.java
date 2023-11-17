package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z extends y {

    /* renamed from: j  reason: collision with root package name */
    private t0 f1270j;

    /* renamed from: k  reason: collision with root package name */
    private t0 f1271k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(TextView textView) {
        super(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.y
    public void c() {
        super.c();
        if (this.f1270j == null && this.f1271k == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1246a.getCompoundDrawablesRelative();
        b(compoundDrawablesRelative[0], this.f1270j);
        b(compoundDrawablesRelative[2], this.f1271k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.y
    public void m(AttributeSet attributeSet, int i2) {
        super.m(attributeSet, i2);
        Context context = this.f1246a.getContext();
        k n2 = k.n();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.W, i2, 0);
        int i3 = s.j.c0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f1270j = y.f(context, n2, obtainStyledAttributes.getResourceId(i3, 0));
        }
        int i4 = s.j.d0;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f1271k = y.f(context, n2, obtainStyledAttributes.getResourceId(i4, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import p020s.C0578j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.z */
/* loaded from: classes.dex */
public class C0334z extends C0329y {

    /* renamed from: j */
    private C0312t0 f1582j;

    /* renamed from: k */
    private C0312t0 f1583k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0334z(TextView textView) {
        super(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v7.widget.C0329y
    /* renamed from: c */
    public void mo1021c() {
        super.mo1021c();
        if (this.f1582j == null && this.f1583k == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1558a.getCompoundDrawablesRelative();
        m1051b(compoundDrawablesRelative[0], this.f1582j);
        m1051b(compoundDrawablesRelative[2], this.f1583k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v7.widget.C0329y
    /* renamed from: m */
    public void mo1020m(AttributeSet attributeSet, int i) {
        super.mo1020m(attributeSet, i);
        Context context = this.f1558a.getContext();
        C0283k m1214n = C0283k.m1214n();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2509W, i, 0);
        int i2 = C0578j.f2535c0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1582j = C0329y.m1048f(context, m1214n, obtainStyledAttributes.getResourceId(i2, 0));
        }
        int i3 = C0578j.f2539d0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f1583k = C0329y.m1048f(context, m1214n, obtainStyledAttributes.getResourceId(i3, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
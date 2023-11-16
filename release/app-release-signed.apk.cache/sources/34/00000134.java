package android.support.p002v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p001v4.widget.C0139c;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p011j.C0413a;
import p020s.C0578j;
import p021t.C0580b;

/* renamed from: android.support.v7.widget.j */
/* loaded from: classes.dex */
class C0274j {

    /* renamed from: a */
    private final CompoundButton f1344a;

    /* renamed from: b */
    private ColorStateList f1345b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1346c = null;

    /* renamed from: d */
    private boolean f1347d = false;

    /* renamed from: e */
    private boolean f1348e = false;

    /* renamed from: f */
    private boolean f1349f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0274j(CompoundButton compoundButton) {
        this.f1344a = compoundButton;
    }

    /* renamed from: a */
    void m1267a() {
        Drawable m1751a = C0139c.m1751a(this.f1344a);
        if (m1751a != null) {
            if (this.f1347d || this.f1348e) {
                Drawable mutate = C0413a.m618p(m1751a).mutate();
                if (this.f1347d) {
                    C0413a.m620n(mutate, this.f1345b);
                }
                if (this.f1348e) {
                    C0413a.m619o(mutate, this.f1346c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1344a.getDrawableState());
                }
                this.f1344a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1266b(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1265c() {
        return this.f1345b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1264d() {
        return this.f1346c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1263e(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1344a.getContext().obtainStyledAttributes(attributeSet, C0578j.f2442F0, i, 0);
        try {
            int i2 = C0578j.f2446G0;
            if (obtainStyledAttributes.hasValue(i2) && (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) != 0) {
                CompoundButton compoundButton = this.f1344a;
                compoundButton.setButtonDrawable(C0580b.m98d(compoundButton.getContext(), resourceId));
            }
            int i3 = C0578j.f2450H0;
            if (obtainStyledAttributes.hasValue(i3)) {
                C0139c.m1750b(this.f1344a, obtainStyledAttributes.getColorStateList(i3));
            }
            int i4 = C0578j.f2454I0;
            if (obtainStyledAttributes.hasValue(i4)) {
                C0139c.m1749c(this.f1344a, C0258e0.m1321d(obtainStyledAttributes.getInt(i4, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1262f() {
        if (this.f1349f) {
            this.f1349f = false;
            return;
        }
        this.f1349f = true;
        m1267a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1261g(ColorStateList colorStateList) {
        this.f1345b = colorStateList;
        this.f1347d = true;
        m1267a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1260h(PorterDuff.Mode mode) {
        this.f1346c = mode;
        this.f1348e = true;
        m1267a();
    }
}
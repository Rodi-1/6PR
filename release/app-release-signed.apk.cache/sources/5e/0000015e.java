package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p009h.C0393b;
import p021t.C0580b;

/* renamed from: android.support.v7.widget.v0 */
/* loaded from: classes.dex */
public class C0316v0 {

    /* renamed from: a */
    private final Context f1505a;

    /* renamed from: b */
    private final TypedArray f1506b;

    /* renamed from: c */
    private TypedValue f1507c;

    private C0316v0(Context context, TypedArray typedArray) {
        this.f1505a = context;
        this.f1506b = typedArray;
    }

    /* renamed from: r */
    public static C0316v0 m1110r(Context context, int i, int[] iArr) {
        return new C0316v0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: s */
    public static C0316v0 m1109s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0316v0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: t */
    public static C0316v0 m1108t(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0316v0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m1127a(int i, boolean z) {
        return this.f1506b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m1126b(int i, int i2) {
        return this.f1506b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m1125c(int i) {
        int resourceId;
        ColorStateList m99c;
        return (!this.f1506b.hasValue(i) || (resourceId = this.f1506b.getResourceId(i, 0)) == 0 || (m99c = C0580b.m99c(this.f1505a, resourceId)) == null) ? this.f1506b.getColorStateList(i) : m99c;
    }

    /* renamed from: d */
    public int m1124d(int i, int i2) {
        return this.f1506b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int m1123e(int i, int i2) {
        return this.f1506b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public Drawable m1122f(int i) {
        int resourceId;
        return (!this.f1506b.hasValue(i) || (resourceId = this.f1506b.getResourceId(i, 0)) == 0) ? this.f1506b.getDrawable(i) : C0580b.m98d(this.f1505a, resourceId);
    }

    /* renamed from: g */
    public Drawable m1121g(int i) {
        int resourceId;
        if (!this.f1506b.hasValue(i) || (resourceId = this.f1506b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0283k.m1214n().m1211q(this.f1505a, resourceId, true);
    }

    /* renamed from: h */
    public float m1120h(int i, float f) {
        return this.f1506b.getFloat(i, f);
    }

    /* renamed from: i */
    public Typeface m1119i(int i, int i2, C0393b.AbstractC0394a abstractC0394a) {
        int resourceId = this.f1506b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1507c == null) {
            this.f1507c = new TypedValue();
        }
        return C0393b.m712b(this.f1505a, resourceId, this.f1507c, i2, abstractC0394a);
    }

    /* renamed from: j */
    public int m1118j(int i, int i2) {
        return this.f1506b.getInt(i, i2);
    }

    /* renamed from: k */
    public int m1117k(int i, int i2) {
        return this.f1506b.getInteger(i, i2);
    }

    /* renamed from: l */
    public int m1116l(int i, int i2) {
        return this.f1506b.getLayoutDimension(i, i2);
    }

    /* renamed from: m */
    public int m1115m(int i, int i2) {
        return this.f1506b.getResourceId(i, i2);
    }

    /* renamed from: n */
    public String m1114n(int i) {
        return this.f1506b.getString(i);
    }

    /* renamed from: o */
    public CharSequence m1113o(int i) {
        return this.f1506b.getText(i);
    }

    /* renamed from: p */
    public CharSequence[] m1112p(int i) {
        return this.f1506b.getTextArray(i);
    }

    /* renamed from: q */
    public boolean m1111q(int i) {
        return this.f1506b.hasValue(i);
    }

    /* renamed from: u */
    public void m1107u() {
        this.f1506b.recycle();
    }
}
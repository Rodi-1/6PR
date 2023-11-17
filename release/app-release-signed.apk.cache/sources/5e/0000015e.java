package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import h.b;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1197a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1198b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1199c;

    private v0(Context context, TypedArray typedArray) {
        this.f1197a = context;
        this.f1198b = typedArray;
    }

    public static v0 r(Context context, int i2, int[] iArr) {
        return new v0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static v0 s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new v0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static v0 t(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new v0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.f1198b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.f1198b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList c2;
        return (!this.f1198b.hasValue(i2) || (resourceId = this.f1198b.getResourceId(i2, 0)) == 0 || (c2 = t.b.c(this.f1197a, resourceId)) == null) ? this.f1198b.getColorStateList(i2) : c2;
    }

    public int d(int i2, int i3) {
        return this.f1198b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f1198b.getDimensionPixelSize(i2, i3);
    }

    public Drawable f(int i2) {
        int resourceId;
        return (!this.f1198b.hasValue(i2) || (resourceId = this.f1198b.getResourceId(i2, 0)) == 0) ? this.f1198b.getDrawable(i2) : t.b.d(this.f1197a, resourceId);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.f1198b.hasValue(i2) || (resourceId = this.f1198b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return k.n().q(this.f1197a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.f1198b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, b.a aVar) {
        int resourceId = this.f1198b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1199c == null) {
            this.f1199c = new TypedValue();
        }
        return h.b.b(this.f1197a, resourceId, this.f1199c, i3, aVar);
    }

    public int j(int i2, int i3) {
        return this.f1198b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f1198b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f1198b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f1198b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.f1198b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.f1198b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.f1198b.getTextArray(i2);
    }

    public boolean q(int i2) {
        return this.f1198b.hasValue(i2);
    }

    public void u() {
        this.f1198b.recycle();
    }
}
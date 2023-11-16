package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p005d.C0349c;

/* renamed from: android.support.constraint.c */
/* loaded from: classes.dex */
public class C0034c extends ViewGroup {

    /* renamed from: b */
    C0031b f217b;

    /* renamed from: android.support.constraint.c$a */
    /* loaded from: classes.dex */
    public static class C0035a extends ConstraintLayout.C0028a {

        /* renamed from: n0 */
        public float f218n0;

        /* renamed from: o0 */
        public boolean f219o0;

        /* renamed from: p0 */
        public float f220p0;

        /* renamed from: q0 */
        public float f221q0;

        /* renamed from: r0 */
        public float f222r0;

        /* renamed from: s0 */
        public float f223s0;

        /* renamed from: t0 */
        public float f224t0;

        /* renamed from: u0 */
        public float f225u0;

        /* renamed from: v0 */
        public float f226v0;

        /* renamed from: w0 */
        public float f227w0;

        /* renamed from: x0 */
        public float f228x0;

        /* renamed from: y0 */
        public float f229y0;

        /* renamed from: z0 */
        public float f230z0;

        public C0035a(int i, int i2) {
            super(i, i2);
            this.f218n0 = 1.0f;
            this.f219o0 = false;
            this.f220p0 = 0.0f;
            this.f221q0 = 0.0f;
            this.f222r0 = 0.0f;
            this.f223s0 = 0.0f;
            this.f224t0 = 1.0f;
            this.f225u0 = 1.0f;
            this.f226v0 = 0.0f;
            this.f227w0 = 0.0f;
            this.f228x0 = 0.0f;
            this.f229y0 = 0.0f;
            this.f230z0 = 0.0f;
        }

        public C0035a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.f218n0 = 1.0f;
            this.f219o0 = false;
            this.f220p0 = 0.0f;
            this.f221q0 = 0.0f;
            this.f222r0 = 0.0f;
            this.f223s0 = 0.0f;
            this.f224t0 = 1.0f;
            this.f225u0 = 1.0f;
            this.f226v0 = 0.0f;
            this.f227w0 = 0.0f;
            this.f228x0 = 0.0f;
            this.f229y0 = 0.0f;
            this.f230z0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0349c.f1713j0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0349c.f1743t0) {
                    this.f218n0 = obtainStyledAttributes.getFloat(index, this.f218n0);
                } else if (index == C0349c.f1645G0) {
                    this.f220p0 = obtainStyledAttributes.getFloat(index, this.f220p0);
                    this.f219o0 = true;
                } else if (index == C0349c.f1630B0) {
                    this.f222r0 = obtainStyledAttributes.getFloat(index, this.f222r0);
                } else if (index == C0349c.f1633C0) {
                    this.f223s0 = obtainStyledAttributes.getFloat(index, this.f223s0);
                } else if (index == C0349c.f1627A0) {
                    this.f221q0 = obtainStyledAttributes.getFloat(index, this.f221q0);
                } else if (index == C0349c.f1758y0) {
                    this.f224t0 = obtainStyledAttributes.getFloat(index, this.f224t0);
                } else if (index == C0349c.f1761z0) {
                    this.f225u0 = obtainStyledAttributes.getFloat(index, this.f225u0);
                } else if (index == C0349c.f1746u0) {
                    this.f226v0 = obtainStyledAttributes.getFloat(index, this.f226v0);
                } else if (index == C0349c.f1749v0) {
                    this.f227w0 = obtainStyledAttributes.getFloat(index, this.f227w0);
                } else {
                    if (index == C0349c.f1752w0) {
                        f = this.f228x0;
                    } else if (index == C0349c.f1755x0) {
                        this.f229y0 = obtainStyledAttributes.getFloat(index, this.f229y0);
                    } else if (index == C0349c.f1642F0) {
                        f = this.f230z0;
                    }
                    this.f228x0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0035a generateDefaultLayoutParams() {
        return new C0035a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0035a generateLayoutParams(AttributeSet attributeSet) {
        return new C0035a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0028a(layoutParams);
    }

    public C0031b getConstraintSet() {
        if (this.f217b == null) {
            this.f217b = new C0031b();
        }
        this.f217b.m2327b(this);
        return this.f217b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
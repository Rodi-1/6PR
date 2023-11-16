package p019r;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p020s.C0578j;
import p023v.AbstractC0585b;

/* renamed from: r.a */
/* loaded from: classes.dex */
public abstract class AbstractC0525a {

    /* renamed from: r.a$a */
    /* loaded from: classes.dex */
    public static class C0526a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2250a;

        public C0526a(int i, int i2) {
            super(i, i2);
            this.f2250a = 8388627;
        }

        public C0526a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2250a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2602t);
            this.f2250a = obtainStyledAttributes.getInt(C0578j.f2606u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0526a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2250a = 0;
        }

        public C0526a(C0526a c0526a) {
            super((ViewGroup.MarginLayoutParams) c0526a);
            this.f2250a = 0;
            this.f2250a = c0526a.f2250a;
        }
    }

    /* renamed from: r.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0527b {
        /* renamed from: a */
        void m293a(boolean z);
    }

    @Deprecated
    /* renamed from: r.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0528c {
        /* renamed from: a */
        public abstract CharSequence m292a();

        /* renamed from: b */
        public abstract View m291b();

        /* renamed from: c */
        public abstract Drawable m290c();

        /* renamed from: d */
        public abstract CharSequence m289d();

        /* renamed from: e */
        public abstract void m288e();
    }

    /* renamed from: g */
    public boolean m298g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo123h();

    /* renamed from: i */
    public abstract void mo122i(boolean z);

    /* renamed from: j */
    public abstract int mo121j();

    /* renamed from: k */
    public abstract Context mo120k();

    /* renamed from: l */
    public boolean m297l() {
        return false;
    }

    /* renamed from: m */
    public abstract void mo119m(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m296n() {
    }

    /* renamed from: o */
    public abstract boolean mo118o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean m295p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean m294q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo117r(boolean z);

    /* renamed from: s */
    public abstract void mo116s(boolean z);

    /* renamed from: t */
    public abstract void mo115t(CharSequence charSequence);

    /* renamed from: u */
    public abstract AbstractC0585b mo114u(AbstractC0585b.InterfaceC0586a interfaceC0586a);
}
package r;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import v.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1732a;

        public C0023a(int i2, int i3) {
            super(i2, i3);
            this.f1732a = 8388627;
        }

        public C0023a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1732a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.f1883t);
            this.f1732a = obtainStyledAttributes.getInt(s.j.f1884u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0023a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1732a = 0;
        }

        public C0023a(C0023a c0023a) {
            super((ViewGroup.MarginLayoutParams) c0023a);
            this.f1732a = 0;
            this.f1732a = c0023a.f1732a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i2, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(CharSequence charSequence);

    public abstract v.b u(b.a aVar);
}
package p016o;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: o.w */
/* loaded from: classes.dex */
public class C0517w {

    /* renamed from: a */
    private final Object f2241a;

    private C0517w(Object obj) {
        this.f2241a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Object m327f(C0517w c0517w) {
        if (c0517w == null) {
            return null;
        }
        return c0517w.f2241a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C0517w m326g(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0517w(obj);
    }

    /* renamed from: a */
    public int m332a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2241a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int m331b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2241a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m330c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2241a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m329d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2241a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public C0517w m328e(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0517w(((WindowInsets) this.f2241a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f2241a;
        Object obj3 = ((C0517w) obj).f2241a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f2241a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
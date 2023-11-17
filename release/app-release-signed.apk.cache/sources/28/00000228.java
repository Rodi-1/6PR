package o;

import android.os.Build;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1723a;

    private w(Object obj) {
        this.f1723a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(w wVar) {
        if (wVar == null) {
            return null;
        }
        return wVar.f1723a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w g(Object obj) {
        if (obj == null) {
            return null;
        }
        return new w(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1723a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1723a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1723a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1723a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public w e(int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new w(((WindowInsets) this.f1723a).replaceSystemWindowInsets(i2, i3, i4, i5));
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
        Object obj2 = this.f1723a;
        Object obj3 = ((w) obj).f1723a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f1723a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
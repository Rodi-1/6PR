package o;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    static final c f1712a;

    /* loaded from: classes.dex */
    static class a extends c {
        a() {
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // o.r.c
        public boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
            try {
                return viewParent.onNestedFling(view, f2, f3, z);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
                return false;
            }
        }

        @Override // o.r.c
        public boolean b(ViewParent viewParent, View view, float f2, float f3) {
            try {
                return viewParent.onNestedPreFling(view, f2, f3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
                return false;
            }
        }

        @Override // o.r.c
        public void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }

        @Override // o.r.c
        public void d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
            try {
                viewParent.onNestedScroll(view, i2, i3, i4, i5);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }

        @Override // o.r.c
        public void e(ViewParent viewParent, View view, View view2, int i2) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }

        @Override // o.r.c
        public boolean f(ViewParent viewParent, View view, View view2, int i2) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
                return false;
            }
        }

        @Override // o.r.c
        public void g(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
            if (viewParent instanceof k) {
                return ((k) viewParent).onNestedFling(view, f2, f3, z);
            }
            return false;
        }

        public boolean b(ViewParent viewParent, View view, float f2, float f3) {
            if (viewParent instanceof k) {
                return ((k) viewParent).onNestedPreFling(view, f2, f3);
            }
            return false;
        }

        public void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
            if (viewParent instanceof k) {
                ((k) viewParent).onNestedPreScroll(view, i2, i3, iArr);
            }
        }

        public void d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
            if (viewParent instanceof k) {
                ((k) viewParent).onNestedScroll(view, i2, i3, i4, i5);
            }
        }

        public void e(ViewParent viewParent, View view, View view2, int i2) {
            if (viewParent instanceof k) {
                ((k) viewParent).onNestedScrollAccepted(view, view2, i2);
            }
        }

        public boolean f(ViewParent viewParent, View view, View view2, int i2) {
            if (viewParent instanceof k) {
                return ((k) viewParent).onStartNestedScroll(view, view2, i2);
            }
            return false;
        }

        public void g(ViewParent viewParent, View view) {
            if (viewParent instanceof k) {
                ((k) viewParent).onStopNestedScroll(view);
            }
        }
    }

    static {
        f1712a = Build.VERSION.SDK_INT >= 21 ? new b() : new a();
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        return f1712a.a(viewParent, view, f2, f3, z);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f3) {
        return f1712a.b(viewParent, view, f2, f3);
    }

    public static void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof j) {
            ((j) viewParent).m(view, i2, i3, iArr, i4);
        } else if (i4 == 0) {
            f1712a.c(viewParent, view, i2, i3, iArr);
        }
    }

    public static void d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6) {
        if (viewParent instanceof j) {
            ((j) viewParent).k(view, i2, i3, i4, i5, i6);
        } else if (i6 == 0) {
            f1712a.d(viewParent, view, i2, i3, i4, i5);
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof j) {
            ((j) viewParent).i(view, view2, i2, i3);
        } else if (i3 == 0) {
            f1712a.e(viewParent, view, view2, i2);
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof j) {
            return ((j) viewParent).n(view, view2, i2, i3);
        }
        if (i3 == 0) {
            return f1712a.f(viewParent, view, view2, i2);
        }
        return false;
    }

    public static void g(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof j) {
            ((j) viewParent).l(view, i2);
        } else if (i2 == 0) {
            f1712a.g(viewParent, view);
        }
    }
}
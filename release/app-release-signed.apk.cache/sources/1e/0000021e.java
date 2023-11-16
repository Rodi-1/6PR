package p016o;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.r */
/* loaded from: classes.dex */
public final class C0507r {

    /* renamed from: a */
    static final C0510c f2230a;

    /* renamed from: o.r$a */
    /* loaded from: classes.dex */
    static class C0508a extends C0510c {
        C0508a() {
        }
    }

    /* renamed from: o.r$b */
    /* loaded from: classes.dex */
    static class C0509b extends C0508a {
        C0509b() {
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: a */
        public boolean mo351a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: b */
        public boolean mo350b(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: c */
        public void mo349c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: d */
        public void mo348d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: e */
        public void mo347e(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: f */
        public boolean mo346f(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }

        @Override // p016o.C0507r.C0510c
        /* renamed from: g */
        public void mo345g(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    /* renamed from: o.r$c */
    /* loaded from: classes.dex */
    static class C0510c {
        C0510c() {
        }

        /* renamed from: a */
        public boolean mo351a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof InterfaceC0486k) {
                return ((InterfaceC0486k) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo350b(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof InterfaceC0486k) {
                return ((InterfaceC0486k) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        /* renamed from: c */
        public void mo349c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof InterfaceC0486k) {
                ((InterfaceC0486k) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: d */
        public void mo348d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof InterfaceC0486k) {
                ((InterfaceC0486k) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: e */
        public void mo347e(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof InterfaceC0486k) {
                ((InterfaceC0486k) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        /* renamed from: f */
        public boolean mo346f(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof InterfaceC0486k) {
                return ((InterfaceC0486k) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        /* renamed from: g */
        public void mo345g(ViewParent viewParent, View view) {
            if (viewParent instanceof InterfaceC0486k) {
                ((InterfaceC0486k) viewParent).onStopNestedScroll(view);
            }
        }
    }

    static {
        f2230a = Build.VERSION.SDK_INT >= 21 ? new C0509b() : new C0508a();
    }

    /* renamed from: a */
    public static boolean m358a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f2230a.mo351a(viewParent, view, f, f2, z);
    }

    /* renamed from: b */
    public static boolean m357b(ViewParent viewParent, View view, float f, float f2) {
        return f2230a.mo350b(viewParent, view, f, f2);
    }

    /* renamed from: c */
    public static void m356c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0485j) {
            ((InterfaceC0485j) viewParent).m418m(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f2230a.mo349c(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: d */
    public static void m355d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof InterfaceC0485j) {
            ((InterfaceC0485j) viewParent).m420k(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f2230a.mo348d(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: e */
    public static void m354e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0485j) {
            ((InterfaceC0485j) viewParent).m421i(view, view2, i, i2);
        } else if (i2 == 0) {
            f2230a.mo347e(viewParent, view, view2, i);
        }
    }

    /* renamed from: f */
    public static boolean m353f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0485j) {
            return ((InterfaceC0485j) viewParent).m417n(view, view2, i, i2);
        }
        if (i2 == 0) {
            return f2230a.mo346f(viewParent, view, view2, i);
        }
        return false;
    }

    /* renamed from: g */
    public static void m352g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0485j) {
            ((InterfaceC0485j) viewParent).m419l(view, i);
        } else if (i == 0) {
            f2230a.mo345g(viewParent, view);
        }
    }
}
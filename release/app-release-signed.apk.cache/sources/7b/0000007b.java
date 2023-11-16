package android.support.p001v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p015n.C0445a;
import p016o.C0490o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.r */
/* loaded from: classes.dex */
public class C0110r {

    /* renamed from: a */
    private static final int[] f555a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final AbstractC0121t f556b;

    /* renamed from: c */
    private static final AbstractC0121t f557c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$a */
    /* loaded from: classes.dex */
    public static class RunnableC0111a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f558b;

        RunnableC0111a(ArrayList arrayList) {
            this.f558b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0110r.m1886F(this.f558b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$b */
    /* loaded from: classes.dex */
    public static class RunnableC0112b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f559b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0121t f560c;

        /* renamed from: d */
        final /* synthetic */ View f561d;

        /* renamed from: e */
        final /* synthetic */ ComponentCallbacksC0073g f562e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f563f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f564g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f565h;

        /* renamed from: i */
        final /* synthetic */ Object f566i;

        RunnableC0112b(Object obj, AbstractC0121t abstractC0121t, View view, ComponentCallbacksC0073g componentCallbacksC0073g, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f559b = obj;
            this.f560c = abstractC0121t;
            this.f561d = view;
            this.f562e = componentCallbacksC0073g;
            this.f563f = arrayList;
            this.f564g = arrayList2;
            this.f565h = arrayList3;
            this.f566i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f559b;
            if (obj != null) {
                this.f560c.mo1841p(obj, this.f561d);
                this.f564g.addAll(C0110r.m1869p(this.f560c, this.f559b, this.f562e, this.f563f, this.f561d));
            }
            if (this.f565h != null) {
                if (this.f566i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f561d);
                    this.f560c.mo1840q(this.f566i, this.f565h, arrayList);
                }
                this.f565h.clear();
                this.f565h.add(this.f561d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$c */
    /* loaded from: classes.dex */
    public static class RunnableC0113c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ComponentCallbacksC0073g f567b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0073g f568c;

        /* renamed from: d */
        final /* synthetic */ boolean f569d;

        /* renamed from: e */
        final /* synthetic */ C0445a f570e;

        /* renamed from: f */
        final /* synthetic */ View f571f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0121t f572g;

        /* renamed from: h */
        final /* synthetic */ Rect f573h;

        RunnableC0113c(ComponentCallbacksC0073g componentCallbacksC0073g, ComponentCallbacksC0073g componentCallbacksC0073g2, boolean z, C0445a c0445a, View view, AbstractC0121t abstractC0121t, Rect rect) {
            this.f567b = componentCallbacksC0073g;
            this.f568c = componentCallbacksC0073g2;
            this.f569d = z;
            this.f570e = c0445a;
            this.f571f = view;
            this.f572g = abstractC0121t;
            this.f573h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0110r.m1874k(this.f567b, this.f568c, this.f569d, this.f570e, false);
            View view = this.f571f;
            if (view != null) {
                this.f572g.m1846k(view, this.f573h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$d */
    /* loaded from: classes.dex */
    public static class RunnableC0114d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AbstractC0121t f574b;

        /* renamed from: c */
        final /* synthetic */ C0445a f575c;

        /* renamed from: d */
        final /* synthetic */ Object f576d;

        /* renamed from: e */
        final /* synthetic */ C0115e f577e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f578f;

        /* renamed from: g */
        final /* synthetic */ View f579g;

        /* renamed from: h */
        final /* synthetic */ ComponentCallbacksC0073g f580h;

        /* renamed from: i */
        final /* synthetic */ ComponentCallbacksC0073g f581i;

        /* renamed from: j */
        final /* synthetic */ boolean f582j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f583k;

        /* renamed from: l */
        final /* synthetic */ Object f584l;

        /* renamed from: m */
        final /* synthetic */ Rect f585m;

        RunnableC0114d(AbstractC0121t abstractC0121t, C0445a c0445a, Object obj, C0115e c0115e, ArrayList arrayList, View view, ComponentCallbacksC0073g componentCallbacksC0073g, ComponentCallbacksC0073g componentCallbacksC0073g2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f574b = abstractC0121t;
            this.f575c = c0445a;
            this.f576d = obj;
            this.f577e = c0115e;
            this.f578f = arrayList;
            this.f579g = view;
            this.f580h = componentCallbacksC0073g;
            this.f581i = componentCallbacksC0073g2;
            this.f582j = z;
            this.f583k = arrayList2;
            this.f584l = obj2;
            this.f585m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0445a m1872m = C0110r.m1872m(this.f574b, this.f575c, this.f576d, this.f577e);
            if (m1872m != null) {
                this.f578f.addAll(m1872m.values());
                this.f578f.add(this.f579g);
            }
            C0110r.m1874k(this.f580h, this.f581i, this.f582j, m1872m, false);
            Object obj = this.f576d;
            if (obj != null) {
                this.f574b.mo1831z(obj, this.f583k, this.f578f);
                View m1861x = C0110r.m1861x(m1872m, this.f577e, this.f584l, this.f582j);
                if (m1861x != null) {
                    this.f574b.m1846k(m1861x, this.f585m);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$e */
    /* loaded from: classes.dex */
    public static class C0115e {

        /* renamed from: a */
        public ComponentCallbacksC0073g f586a;

        /* renamed from: b */
        public boolean f587b;

        /* renamed from: c */
        public C0067c f588c;

        /* renamed from: d */
        public ComponentCallbacksC0073g f589d;

        /* renamed from: e */
        public boolean f590e;

        /* renamed from: f */
        public C0067c f591f;

        C0115e() {
        }
    }

    static {
        f556b = Build.VERSION.SDK_INT >= 21 ? new C0116s() : null;
        f557c = m1890B();
    }

    /* renamed from: A */
    private static void m1891A(AbstractC0121t abstractC0121t, Object obj, ComponentCallbacksC0073g componentCallbacksC0073g, ArrayList<View> arrayList) {
        if (componentCallbacksC0073g != null && obj != null && componentCallbacksC0073g.f416k && componentCallbacksC0073g.f388A && componentCallbacksC0073g.f402O) {
            componentCallbacksC0073g.m2152W0(true);
            abstractC0121t.mo1839r(obj, componentCallbacksC0073g.m2191D(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(componentCallbacksC0073g.f395H, new RunnableC0111a(arrayList));
        }
    }

    /* renamed from: B */
    private static AbstractC0121t m1890B() {
        try {
            return (AbstractC0121t) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static void m1889C(C0445a<String, String> c0445a, C0445a<String, View> c0445a2) {
        for (int size = c0445a.size() - 1; size >= 0; size--) {
            if (!c0445a2.containsKey(c0445a.m488l(size))) {
                c0445a.m490j(size);
            }
        }
    }

    /* renamed from: D */
    private static void m1888D(AbstractC0121t abstractC0121t, ViewGroup viewGroup, ComponentCallbacksC0073g componentCallbacksC0073g, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(viewGroup, new RunnableC0112b(obj, abstractC0121t, view, componentCallbacksC0073g, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: E */
    private static void m1887E(AbstractC0121t abstractC0121t, Object obj, Object obj2, C0445a<String, View> c0445a, boolean z, C0067c c0067c) {
        ArrayList<String> arrayList = c0067c.f362r;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0445a.get((z ? c0067c.f363s : c0067c.f362r).get(0));
        abstractC0121t.mo1835v(obj, view);
        if (obj2 != null) {
            abstractC0121t.mo1835v(obj2, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static void m1886F(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static void m1885G(LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m, ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (layoutInflater$Factory2C0089m.f494m < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0067c c0067c = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m1875j(c0067c, sparseArray, z);
            } else {
                m1877h(c0067c, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(layoutInflater$Factory2C0089m.f495n.m2042e());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C0445a<String, String> m1876i = m1876i(keyAt, arrayList, arrayList2, i, i2);
                C0115e c0115e = (C0115e) sparseArray.valueAt(i4);
                if (z) {
                    m1865t(layoutInflater$Factory2C0089m, keyAt, c0115e, view, m1876i);
                } else {
                    m1866s(layoutInflater$Factory2C0089m, keyAt, c0115e, view, m1876i);
                }
            }
        }
    }

    /* renamed from: f */
    private static void m1879f(ArrayList<View> arrayList, C0445a<String, View> c0445a, Collection<String> collection) {
        for (int size = c0445a.size() - 1; size >= 0; size--) {
            View m488l = c0445a.m488l(size);
            if (collection.contains(C0490o.m406f(m488l))) {
                arrayList.add(m488l);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r10.f416k != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0090, code lost:
        if (r10.f388A == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5 A[ADDED_TO_REGION] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m1878g(android.support.p001v4.app.C0067c r16, android.support.p001v4.app.C0067c.C0068a r17, android.util.SparseArray<android.support.p001v4.app.C0110r.C0115e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.app.C0110r.m1878g(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: h */
    public static void m1877h(C0067c c0067c, SparseArray<C0115e> sparseArray, boolean z) {
        int size = c0067c.f346b.size();
        for (int i = 0; i < size; i++) {
            m1878g(c0067c, c0067c.f346b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: i */
    private static C0445a<String, String> m1876i(int i, ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0445a<String, String> c0445a = new C0445a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0067c c0067c = arrayList.get(i4);
            if (c0067c.m2208j(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c0067c.f362r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0067c.f362r;
                        arrayList4 = c0067c.f363s;
                    } else {
                        ArrayList<String> arrayList6 = c0067c.f362r;
                        arrayList3 = c0067c.f363s;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0445a.remove(str2);
                        if (remove != null) {
                            c0445a.put(str, remove);
                        } else {
                            c0445a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0445a;
    }

    /* renamed from: j */
    public static void m1875j(C0067c c0067c, SparseArray<C0115e> sparseArray, boolean z) {
        if (c0067c.f345a.f496o.mo2071c()) {
            for (int size = c0067c.f346b.size() - 1; size >= 0; size--) {
                m1878g(c0067c, c0067c.f346b.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static void m1874k(ComponentCallbacksC0073g componentCallbacksC0073g, ComponentCallbacksC0073g componentCallbacksC0073g2, boolean z, C0445a<String, View> c0445a, boolean z2) {
        if (z) {
            componentCallbacksC0073g2.m2114p();
        } else {
            componentCallbacksC0073g.m2114p();
        }
    }

    /* renamed from: l */
    private static boolean m1873l(AbstractC0121t abstractC0121t, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0121t.mo1852e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static C0445a<String, View> m1872m(AbstractC0121t abstractC0121t, C0445a<String, String> c0445a, Object obj, C0115e c0115e) {
        ArrayList<String> arrayList;
        ComponentCallbacksC0073g componentCallbacksC0073g = c0115e.f586a;
        View m2191D = componentCallbacksC0073g.m2191D();
        if (c0445a.isEmpty() || obj == null || m2191D == null) {
            c0445a.clear();
            return null;
        }
        C0445a<String, View> c0445a2 = new C0445a<>();
        abstractC0121t.m1847j(c0445a2, m2191D);
        C0067c c0067c = c0115e.f588c;
        if (c0115e.f587b) {
            componentCallbacksC0073g.m2110r();
            arrayList = c0067c.f362r;
        } else {
            componentCallbacksC0073g.m2114p();
            arrayList = c0067c.f363s;
        }
        if (arrayList != null) {
            c0445a2.m558n(arrayList);
            c0445a2.m558n(c0445a.values());
        }
        m1889C(c0445a, c0445a2);
        return c0445a2;
    }

    /* renamed from: n */
    private static C0445a<String, View> m1871n(AbstractC0121t abstractC0121t, C0445a<String, String> c0445a, Object obj, C0115e c0115e) {
        ArrayList<String> arrayList;
        if (c0445a.isEmpty() || obj == null) {
            c0445a.clear();
            return null;
        }
        ComponentCallbacksC0073g componentCallbacksC0073g = c0115e.f589d;
        C0445a<String, View> c0445a2 = new C0445a<>();
        abstractC0121t.m1847j(c0445a2, componentCallbacksC0073g.m2191D());
        C0067c c0067c = c0115e.f591f;
        if (c0115e.f590e) {
            componentCallbacksC0073g.m2114p();
            arrayList = c0067c.f363s;
        } else {
            componentCallbacksC0073g.m2110r();
            arrayList = c0067c.f362r;
        }
        c0445a2.m558n(arrayList);
        c0445a.m558n(c0445a2.keySet());
        return c0445a2;
    }

    /* renamed from: o */
    private static AbstractC0121t m1870o(ComponentCallbacksC0073g componentCallbacksC0073g, ComponentCallbacksC0073g componentCallbacksC0073g2) {
        ArrayList arrayList = new ArrayList();
        if (componentCallbacksC0073g != null) {
            Object m2112q = componentCallbacksC0073g.m2112q();
            if (m2112q != null) {
                arrayList.add(m2112q);
            }
            Object m2094z = componentCallbacksC0073g.m2094z();
            if (m2094z != null) {
                arrayList.add(m2094z);
            }
            Object m2195B = componentCallbacksC0073g.m2195B();
            if (m2195B != null) {
                arrayList.add(m2195B);
            }
        }
        if (componentCallbacksC0073g2 != null) {
            Object m2116o = componentCallbacksC0073g2.m2116o();
            if (m2116o != null) {
                arrayList.add(m2116o);
            }
            Object m2098x = componentCallbacksC0073g2.m2098x();
            if (m2098x != null) {
                arrayList.add(m2098x);
            }
            Object m2197A = componentCallbacksC0073g2.m2197A();
            if (m2197A != null) {
                arrayList.add(m2197A);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0121t abstractC0121t = f556b;
        if (abstractC0121t == null || !m1873l(abstractC0121t, arrayList)) {
            AbstractC0121t abstractC0121t2 = f557c;
            if (abstractC0121t2 == null || !m1873l(abstractC0121t2, arrayList)) {
                if (abstractC0121t == null && abstractC0121t2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return abstractC0121t2;
        }
        return abstractC0121t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static ArrayList<View> m1869p(AbstractC0121t abstractC0121t, Object obj, ComponentCallbacksC0073g componentCallbacksC0073g, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View m2191D = componentCallbacksC0073g.m2191D();
            if (m2191D != null) {
                abstractC0121t.m1851f(arrayList2, m2191D);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            abstractC0121t.mo1855b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    /* renamed from: q */
    private static Object m1868q(AbstractC0121t abstractC0121t, ViewGroup viewGroup, View view, C0445a<String, String> c0445a, C0115e c0115e, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m1860y;
        C0445a<String, String> c0445a2;
        Object obj3;
        Rect rect;
        ComponentCallbacksC0073g componentCallbacksC0073g = c0115e.f586a;
        ComponentCallbacksC0073g componentCallbacksC0073g2 = c0115e.f589d;
        if (componentCallbacksC0073g == null || componentCallbacksC0073g2 == null) {
            return null;
        }
        boolean z = c0115e.f587b;
        if (c0445a.isEmpty()) {
            c0445a2 = c0445a;
            m1860y = null;
        } else {
            m1860y = m1860y(abstractC0121t, componentCallbacksC0073g, componentCallbacksC0073g2, z);
            c0445a2 = c0445a;
        }
        C0445a<String, View> m1871n = m1871n(abstractC0121t, c0445a2, m1860y, c0115e);
        if (c0445a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m1871n.values());
            obj3 = m1860y;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1874k(componentCallbacksC0073g, componentCallbacksC0073g2, z, m1871n, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0121t.mo1832y(obj3, view, arrayList);
            m1887E(abstractC0121t, obj3, obj2, m1871n, c0115e.f590e, c0115e.f591f);
            if (obj != null) {
                abstractC0121t.mo1836u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(viewGroup, new RunnableC0114d(abstractC0121t, c0445a, obj3, c0115e, arrayList2, view, componentCallbacksC0073g, componentCallbacksC0073g2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: r */
    private static Object m1867r(AbstractC0121t abstractC0121t, ViewGroup viewGroup, View view, C0445a<String, String> c0445a, C0115e c0115e, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        ComponentCallbacksC0073g componentCallbacksC0073g = c0115e.f586a;
        ComponentCallbacksC0073g componentCallbacksC0073g2 = c0115e.f589d;
        if (componentCallbacksC0073g != null) {
            componentCallbacksC0073g.m2191D().setVisibility(0);
        }
        if (componentCallbacksC0073g == null || componentCallbacksC0073g2 == null) {
            return null;
        }
        boolean z = c0115e.f587b;
        Object m1860y = c0445a.isEmpty() ? null : m1860y(abstractC0121t, componentCallbacksC0073g, componentCallbacksC0073g2, z);
        C0445a<String, View> m1871n = m1871n(abstractC0121t, c0445a, m1860y, c0115e);
        C0445a<String, View> m1872m = m1872m(abstractC0121t, c0445a, m1860y, c0115e);
        if (c0445a.isEmpty()) {
            if (m1871n != null) {
                m1871n.clear();
            }
            if (m1872m != null) {
                m1872m.clear();
            }
            obj3 = null;
        } else {
            m1879f(arrayList, m1871n, c0445a.keySet());
            m1879f(arrayList2, m1872m, c0445a.values());
            obj3 = m1860y;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1874k(componentCallbacksC0073g, componentCallbacksC0073g2, z, m1871n, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0121t.mo1832y(obj3, view, arrayList);
            m1887E(abstractC0121t, obj3, obj2, m1871n, c0115e.f590e, c0115e.f591f);
            Rect rect2 = new Rect();
            View m1861x = m1861x(m1872m, c0115e, obj, z);
            if (m1861x != null) {
                abstractC0121t.mo1836u(obj, rect2);
            }
            rect = rect2;
            view2 = m1861x;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(viewGroup, new RunnableC0113c(componentCallbacksC0073g, componentCallbacksC0073g2, z, m1872m, view2, abstractC0121t, rect));
        return obj3;
    }

    /* renamed from: s */
    private static void m1866s(LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m, int i, C0115e c0115e, View view, C0445a<String, String> c0445a) {
        ComponentCallbacksC0073g componentCallbacksC0073g;
        ComponentCallbacksC0073g componentCallbacksC0073g2;
        AbstractC0121t m1870o;
        Object obj;
        ViewGroup viewGroup = layoutInflater$Factory2C0089m.f496o.mo2071c() ? (ViewGroup) layoutInflater$Factory2C0089m.f496o.mo2072b(i) : null;
        if (viewGroup == null || (m1870o = m1870o((componentCallbacksC0073g2 = c0115e.f589d), (componentCallbacksC0073g = c0115e.f586a))) == null) {
            return;
        }
        boolean z = c0115e.f587b;
        boolean z2 = c0115e.f590e;
        Object m1863v = m1863v(m1870o, componentCallbacksC0073g, z);
        Object m1862w = m1862w(m1870o, componentCallbacksC0073g2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m1868q = m1868q(m1870o, viewGroup, view, c0445a, c0115e, arrayList, arrayList2, m1863v, m1862w);
        if (m1863v == null && m1868q == null) {
            obj = m1862w;
            if (obj == null) {
                return;
            }
        } else {
            obj = m1862w;
        }
        ArrayList<View> m1869p = m1869p(m1870o, obj, componentCallbacksC0073g2, arrayList, view);
        Object obj2 = (m1869p == null || m1869p.isEmpty()) ? null : obj;
        m1870o.mo1856a(m1863v, view);
        Object m1859z = m1859z(m1870o, m1863v, obj2, m1868q, componentCallbacksC0073g, c0115e.f587b);
        if (m1859z != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m1870o.mo1837t(m1859z, m1863v, arrayList3, obj2, m1869p, m1868q, arrayList2);
            m1888D(m1870o, viewGroup, componentCallbacksC0073g, view, arrayList2, m1863v, arrayList3, obj2, m1869p);
            m1870o.m1834w(viewGroup, arrayList2, c0445a);
            m1870o.mo1854c(viewGroup, m1859z);
            m1870o.m1838s(viewGroup, arrayList2, c0445a);
        }
    }

    /* renamed from: t */
    private static void m1865t(LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m, int i, C0115e c0115e, View view, C0445a<String, String> c0445a) {
        ComponentCallbacksC0073g componentCallbacksC0073g;
        ComponentCallbacksC0073g componentCallbacksC0073g2;
        AbstractC0121t m1870o;
        Object obj;
        ViewGroup viewGroup = layoutInflater$Factory2C0089m.f496o.mo2071c() ? (ViewGroup) layoutInflater$Factory2C0089m.f496o.mo2072b(i) : null;
        if (viewGroup == null || (m1870o = m1870o((componentCallbacksC0073g2 = c0115e.f589d), (componentCallbacksC0073g = c0115e.f586a))) == null) {
            return;
        }
        boolean z = c0115e.f587b;
        boolean z2 = c0115e.f590e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m1863v = m1863v(m1870o, componentCallbacksC0073g, z);
        Object m1862w = m1862w(m1870o, componentCallbacksC0073g2, z2);
        Object m1867r = m1867r(m1870o, viewGroup, view, c0445a, c0115e, arrayList2, arrayList, m1863v, m1862w);
        if (m1863v == null && m1867r == null) {
            obj = m1862w;
            if (obj == null) {
                return;
            }
        } else {
            obj = m1862w;
        }
        ArrayList<View> m1869p = m1869p(m1870o, obj, componentCallbacksC0073g2, arrayList2, view);
        ArrayList<View> m1869p2 = m1869p(m1870o, m1863v, componentCallbacksC0073g, arrayList, view);
        m1886F(m1869p2, 4);
        Object m1859z = m1859z(m1870o, m1863v, obj, m1867r, componentCallbacksC0073g, z);
        if (m1859z != null) {
            m1891A(m1870o, obj, componentCallbacksC0073g2, m1869p);
            ArrayList<String> m1842o = m1870o.m1842o(arrayList);
            m1870o.mo1837t(m1859z, m1863v, m1869p2, obj, m1869p, m1867r, arrayList);
            m1870o.mo1854c(viewGroup, m1859z);
            m1870o.m1833x(viewGroup, arrayList2, arrayList, m1842o, c0445a);
            m1886F(m1869p2, 0);
            m1870o.mo1831z(m1867r, arrayList2, arrayList);
        }
    }

    /* renamed from: u */
    private static C0115e m1864u(C0115e c0115e, SparseArray<C0115e> sparseArray, int i) {
        if (c0115e == null) {
            C0115e c0115e2 = new C0115e();
            sparseArray.put(i, c0115e2);
            return c0115e2;
        }
        return c0115e;
    }

    /* renamed from: v */
    private static Object m1863v(AbstractC0121t abstractC0121t, ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        if (componentCallbacksC0073g == null) {
            return null;
        }
        return abstractC0121t.mo1850g(z ? componentCallbacksC0073g.m2098x() : componentCallbacksC0073g.m2116o());
    }

    /* renamed from: w */
    private static Object m1862w(AbstractC0121t abstractC0121t, ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        if (componentCallbacksC0073g == null) {
            return null;
        }
        return abstractC0121t.mo1850g(z ? componentCallbacksC0073g.m2094z() : componentCallbacksC0073g.m2112q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static View m1861x(C0445a<String, View> c0445a, C0115e c0115e, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0067c c0067c = c0115e.f588c;
        if (obj == null || c0445a == null || (arrayList = c0067c.f362r) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0445a.get((z ? c0067c.f362r : c0067c.f363s).get(0));
    }

    /* renamed from: y */
    private static Object m1860y(AbstractC0121t abstractC0121t, ComponentCallbacksC0073g componentCallbacksC0073g, ComponentCallbacksC0073g componentCallbacksC0073g2, boolean z) {
        if (componentCallbacksC0073g == null || componentCallbacksC0073g2 == null) {
            return null;
        }
        return abstractC0121t.mo1857A(abstractC0121t.mo1850g(z ? componentCallbacksC0073g2.m2195B() : componentCallbacksC0073g.m2197A()));
    }

    /* renamed from: z */
    private static Object m1859z(AbstractC0121t abstractC0121t, Object obj, Object obj2, Object obj3, ComponentCallbacksC0073g componentCallbacksC0073g, boolean z) {
        return (obj == null || obj2 == null || componentCallbacksC0073g == null) ? true : z ? componentCallbacksC0073g.m2126j() : componentCallbacksC0073g.m2128i() ? abstractC0121t.mo1843n(obj2, obj, obj3) : abstractC0121t.mo1844m(obj2, obj, obj3);
    }
}
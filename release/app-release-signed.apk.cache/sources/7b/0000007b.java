package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f411a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final t f412b;

    /* renamed from: c  reason: collision with root package name */
    private static final t f413c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f414b;

        a(ArrayList arrayList) {
            this.f414b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.F(this.f414b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f417d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f418e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f419f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f420g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f421h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f422i;

        b(Object obj, t tVar, View view, g gVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f415b = obj;
            this.f416c = tVar;
            this.f417d = view;
            this.f418e = gVar;
            this.f419f = arrayList;
            this.f420g = arrayList2;
            this.f421h = arrayList3;
            this.f422i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f415b;
            if (obj != null) {
                this.f416c.p(obj, this.f417d);
                this.f420g.addAll(r.p(this.f416c, this.f415b, this.f418e, this.f419f, this.f417d));
            }
            if (this.f421h != null) {
                if (this.f422i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f417d);
                    this.f416c.q(this.f422i, this.f421h, arrayList);
                }
                this.f421h.clear();
                this.f421h.add(this.f417d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f424c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f425d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n.a f426e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f427f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f428g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Rect f429h;

        c(g gVar, g gVar2, boolean z, n.a aVar, View view, t tVar, Rect rect) {
            this.f423b = gVar;
            this.f424c = gVar2;
            this.f425d = z;
            this.f426e = aVar;
            this.f427f = view;
            this.f428g = tVar;
            this.f429h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.k(this.f423b, this.f424c, this.f425d, this.f426e, false);
            View view = this.f427f;
            if (view != null) {
                this.f428g.k(view, this.f429h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n.a f431c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f432d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f433e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f434f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f435g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f436h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g f437i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f438j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f439k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f440l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Rect f441m;

        d(t tVar, n.a aVar, Object obj, e eVar, ArrayList arrayList, View view, g gVar, g gVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f430b = tVar;
            this.f431c = aVar;
            this.f432d = obj;
            this.f433e = eVar;
            this.f434f = arrayList;
            this.f435g = view;
            this.f436h = gVar;
            this.f437i = gVar2;
            this.f438j = z;
            this.f439k = arrayList2;
            this.f440l = obj2;
            this.f441m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.a m2 = r.m(this.f430b, this.f431c, this.f432d, this.f433e);
            if (m2 != null) {
                this.f434f.addAll(m2.values());
                this.f434f.add(this.f435g);
            }
            r.k(this.f436h, this.f437i, this.f438j, m2, false);
            Object obj = this.f432d;
            if (obj != null) {
                this.f430b.z(obj, this.f439k, this.f434f);
                View x = r.x(m2, this.f433e, this.f440l, this.f438j);
                if (x != null) {
                    this.f430b.k(x, this.f441m);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public g f442a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f443b;

        /* renamed from: c  reason: collision with root package name */
        public android.support.v4.app.c f444c;

        /* renamed from: d  reason: collision with root package name */
        public g f445d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f446e;

        /* renamed from: f  reason: collision with root package name */
        public android.support.v4.app.c f447f;

        e() {
        }
    }

    static {
        f412b = Build.VERSION.SDK_INT >= 21 ? new s() : null;
        f413c = B();
    }

    private static void A(t tVar, Object obj, g gVar, ArrayList<View> arrayList) {
        if (gVar != null && obj != null && gVar.f289k && gVar.A && gVar.O) {
            gVar.W0(true);
            tVar.r(obj, gVar.D(), arrayList);
            w.a(gVar.H, new a(arrayList));
        }
    }

    private static t B() {
        try {
            return (t) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void C(n.a<String, String> aVar, n.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void D(t tVar, ViewGroup viewGroup, g gVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        w.a(viewGroup, new b(obj, tVar, view, gVar, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void E(t tVar, Object obj, Object obj2, n.a<String, View> aVar, boolean z, android.support.v4.app.c cVar) {
        ArrayList<String> arrayList = cVar.f256r;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? cVar.f257s : cVar.f256r).get(0));
        tVar.v(obj, view);
        if (obj2 != null) {
            tVar.v(obj2, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void G(m mVar, ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z) {
        if (mVar.f353m < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            android.support.v4.app.c cVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                j(cVar, sparseArray, z);
            } else {
                h(cVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(mVar.f354n.e());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                n.a<String, String> i6 = i(keyAt, arrayList, arrayList2, i2, i3);
                e eVar = (e) sparseArray.valueAt(i5);
                if (z) {
                    t(mVar, keyAt, eVar, view, i6);
                } else {
                    s(mVar, keyAt, eVar, view, i6);
                }
            }
        }
    }

    private static void f(ArrayList<View> arrayList, n.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l2 = aVar.l(size);
            if (collection.contains(o.o.f(l2))) {
                arrayList.add(l2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r10.f289k != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0090, code lost:
        if (r10.A == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(android.support.v4.app.c r16, android.support.v4.app.c.a r17, android.util.SparseArray<android.support.v4.app.r.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.g(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void h(android.support.v4.app.c cVar, SparseArray<e> sparseArray, boolean z) {
        int size = cVar.f240b.size();
        for (int i2 = 0; i2 < size; i2++) {
            g(cVar, cVar.f240b.get(i2), sparseArray, false, z);
        }
    }

    private static n.a<String, String> i(int i2, ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        n.a<String, String> aVar = new n.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            android.support.v4.app.c cVar = arrayList.get(i5);
            if (cVar.j(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = cVar.f256r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = cVar.f256r;
                        arrayList4 = cVar.f257s;
                    } else {
                        ArrayList<String> arrayList6 = cVar.f256r;
                        arrayList3 = cVar.f257s;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void j(android.support.v4.app.c cVar, SparseArray<e> sparseArray, boolean z) {
        if (cVar.f239a.f355o.c()) {
            for (int size = cVar.f240b.size() - 1; size >= 0; size--) {
                g(cVar, cVar.f240b.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(g gVar, g gVar2, boolean z, n.a<String, View> aVar, boolean z2) {
        if (z) {
            gVar2.p();
        } else {
            gVar.p();
        }
    }

    private static boolean l(t tVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!tVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n.a<String, View> m(t tVar, n.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        g gVar = eVar.f442a;
        View D = gVar.D();
        if (aVar.isEmpty() || obj == null || D == null) {
            aVar.clear();
            return null;
        }
        n.a<String, View> aVar2 = new n.a<>();
        tVar.j(aVar2, D);
        android.support.v4.app.c cVar = eVar.f444c;
        if (eVar.f443b) {
            gVar.r();
            arrayList = cVar.f256r;
        } else {
            gVar.p();
            arrayList = cVar.f257s;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        C(aVar, aVar2);
        return aVar2;
    }

    private static n.a<String, View> n(t tVar, n.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        g gVar = eVar.f445d;
        n.a<String, View> aVar2 = new n.a<>();
        tVar.j(aVar2, gVar.D());
        android.support.v4.app.c cVar = eVar.f447f;
        if (eVar.f446e) {
            gVar.p();
            arrayList = cVar.f257s;
        } else {
            gVar.r();
            arrayList = cVar.f256r;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static t o(g gVar, g gVar2) {
        ArrayList arrayList = new ArrayList();
        if (gVar != null) {
            Object q2 = gVar.q();
            if (q2 != null) {
                arrayList.add(q2);
            }
            Object z = gVar.z();
            if (z != null) {
                arrayList.add(z);
            }
            Object B = gVar.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (gVar2 != null) {
            Object o2 = gVar2.o();
            if (o2 != null) {
                arrayList.add(o2);
            }
            Object x = gVar2.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object A = gVar2.A();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        t tVar = f412b;
        if (tVar == null || !l(tVar, arrayList)) {
            t tVar2 = f413c;
            if (tVar2 == null || !l(tVar2, arrayList)) {
                if (tVar == null && tVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return tVar2;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<View> p(t tVar, Object obj, g gVar, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View D = gVar.D();
            if (D != null) {
                tVar.f(arrayList2, D);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            tVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object q(t tVar, ViewGroup viewGroup, View view, n.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object y;
        n.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        g gVar = eVar.f442a;
        g gVar2 = eVar.f445d;
        if (gVar == null || gVar2 == null) {
            return null;
        }
        boolean z = eVar.f443b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            y = null;
        } else {
            y = y(tVar, gVar, gVar2, z);
            aVar2 = aVar;
        }
        n.a<String, View> n2 = n(tVar, aVar2, y, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(n2.values());
            obj3 = y;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        k(gVar, gVar2, z, n2, true);
        if (obj3 != null) {
            rect = new Rect();
            tVar.y(obj3, view, arrayList);
            E(tVar, obj3, obj2, n2, eVar.f446e, eVar.f447f);
            if (obj != null) {
                tVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        w.a(viewGroup, new d(tVar, aVar, obj3, eVar, arrayList2, view, gVar, gVar2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object r(t tVar, ViewGroup viewGroup, View view, n.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        g gVar = eVar.f442a;
        g gVar2 = eVar.f445d;
        if (gVar != null) {
            gVar.D().setVisibility(0);
        }
        if (gVar == null || gVar2 == null) {
            return null;
        }
        boolean z = eVar.f443b;
        Object y = aVar.isEmpty() ? null : y(tVar, gVar, gVar2, z);
        n.a<String, View> n2 = n(tVar, aVar, y, eVar);
        n.a<String, View> m2 = m(tVar, aVar, y, eVar);
        if (aVar.isEmpty()) {
            if (n2 != null) {
                n2.clear();
            }
            if (m2 != null) {
                m2.clear();
            }
            obj3 = null;
        } else {
            f(arrayList, n2, aVar.keySet());
            f(arrayList2, m2, aVar.values());
            obj3 = y;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        k(gVar, gVar2, z, n2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            tVar.y(obj3, view, arrayList);
            E(tVar, obj3, obj2, n2, eVar.f446e, eVar.f447f);
            Rect rect2 = new Rect();
            View x = x(m2, eVar, obj, z);
            if (x != null) {
                tVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = x;
        } else {
            view2 = null;
            rect = null;
        }
        w.a(viewGroup, new c(gVar, gVar2, z, m2, view2, tVar, rect));
        return obj3;
    }

    private static void s(m mVar, int i2, e eVar, View view, n.a<String, String> aVar) {
        g gVar;
        g gVar2;
        t o2;
        Object obj;
        ViewGroup viewGroup = mVar.f355o.c() ? (ViewGroup) mVar.f355o.b(i2) : null;
        if (viewGroup == null || (o2 = o((gVar2 = eVar.f445d), (gVar = eVar.f442a))) == null) {
            return;
        }
        boolean z = eVar.f443b;
        boolean z2 = eVar.f446e;
        Object v2 = v(o2, gVar, z);
        Object w2 = w(o2, gVar2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q2 = q(o2, viewGroup, view, aVar, eVar, arrayList, arrayList2, v2, w2);
        if (v2 == null && q2 == null) {
            obj = w2;
            if (obj == null) {
                return;
            }
        } else {
            obj = w2;
        }
        ArrayList<View> p2 = p(o2, obj, gVar2, arrayList, view);
        Object obj2 = (p2 == null || p2.isEmpty()) ? null : obj;
        o2.a(v2, view);
        Object z3 = z(o2, v2, obj2, q2, gVar, eVar.f443b);
        if (z3 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            o2.t(z3, v2, arrayList3, obj2, p2, q2, arrayList2);
            D(o2, viewGroup, gVar, view, arrayList2, v2, arrayList3, obj2, p2);
            o2.w(viewGroup, arrayList2, aVar);
            o2.c(viewGroup, z3);
            o2.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void t(m mVar, int i2, e eVar, View view, n.a<String, String> aVar) {
        g gVar;
        g gVar2;
        t o2;
        Object obj;
        ViewGroup viewGroup = mVar.f355o.c() ? (ViewGroup) mVar.f355o.b(i2) : null;
        if (viewGroup == null || (o2 = o((gVar2 = eVar.f445d), (gVar = eVar.f442a))) == null) {
            return;
        }
        boolean z = eVar.f443b;
        boolean z2 = eVar.f446e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object v2 = v(o2, gVar, z);
        Object w2 = w(o2, gVar2, z2);
        Object r2 = r(o2, viewGroup, view, aVar, eVar, arrayList2, arrayList, v2, w2);
        if (v2 == null && r2 == null) {
            obj = w2;
            if (obj == null) {
                return;
            }
        } else {
            obj = w2;
        }
        ArrayList<View> p2 = p(o2, obj, gVar2, arrayList2, view);
        ArrayList<View> p3 = p(o2, v2, gVar, arrayList, view);
        F(p3, 4);
        Object z3 = z(o2, v2, obj, r2, gVar, z);
        if (z3 != null) {
            A(o2, obj, gVar2, p2);
            ArrayList<String> o3 = o2.o(arrayList);
            o2.t(z3, v2, p3, obj, p2, r2, arrayList);
            o2.c(viewGroup, z3);
            o2.x(viewGroup, arrayList2, arrayList, o3, aVar);
            F(p3, 0);
            o2.z(r2, arrayList2, arrayList);
        }
    }

    private static e u(e eVar, SparseArray<e> sparseArray, int i2) {
        if (eVar == null) {
            e eVar2 = new e();
            sparseArray.put(i2, eVar2);
            return eVar2;
        }
        return eVar;
    }

    private static Object v(t tVar, g gVar, boolean z) {
        if (gVar == null) {
            return null;
        }
        return tVar.g(z ? gVar.x() : gVar.o());
    }

    private static Object w(t tVar, g gVar, boolean z) {
        if (gVar == null) {
            return null;
        }
        return tVar.g(z ? gVar.z() : gVar.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static View x(n.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        android.support.v4.app.c cVar = eVar.f444c;
        if (obj == null || aVar == null || (arrayList = cVar.f256r) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? cVar.f256r : cVar.f257s).get(0));
    }

    private static Object y(t tVar, g gVar, g gVar2, boolean z) {
        if (gVar == null || gVar2 == null) {
            return null;
        }
        return tVar.A(tVar.g(z ? gVar2.B() : gVar.A()));
    }

    private static Object z(t tVar, Object obj, Object obj2, Object obj3, g gVar, boolean z) {
        return (obj == null || obj2 == null || gVar == null) ? true : z ? gVar.j() : gVar.i() ? tVar.n(obj2, obj, obj3) : tVar.m(obj2, obj, obj3);
    }
}
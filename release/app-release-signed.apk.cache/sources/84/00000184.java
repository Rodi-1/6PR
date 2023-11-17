package e;

import e.i;
import f.e;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: q  reason: collision with root package name */
    private static int f1356q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f1357r = 0;

    /* renamed from: c  reason: collision with root package name */
    private a f1360c;

    /* renamed from: f  reason: collision with root package name */
    b[] f1363f;

    /* renamed from: l  reason: collision with root package name */
    final c f1369l;

    /* renamed from: p  reason: collision with root package name */
    private final a f1373p;

    /* renamed from: a  reason: collision with root package name */
    int f1358a = 0;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, i> f1359b = null;

    /* renamed from: d  reason: collision with root package name */
    private int f1361d = 32;

    /* renamed from: e  reason: collision with root package name */
    private int f1362e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1364g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean[] f1365h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    int f1366i = 1;

    /* renamed from: j  reason: collision with root package name */
    int f1367j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1368k = 32;

    /* renamed from: m  reason: collision with root package name */
    private i[] f1370m = new i[f1356q];

    /* renamed from: n  reason: collision with root package name */
    private int f1371n = 0;

    /* renamed from: o  reason: collision with root package name */
    private b[] f1372o = new b[32];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        i b(e eVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    public e() {
        this.f1363f = null;
        this.f1363f = new b[32];
        D();
        c cVar = new c();
        this.f1369l = cVar;
        this.f1360c = new d(cVar);
        this.f1373p = new b(cVar);
    }

    private final int C(a aVar, boolean z) {
        for (int i2 = 0; i2 < this.f1366i; i2++) {
            this.f1365h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f1366i * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f1365h[aVar.getKey().f1378b] = true;
            }
            i b2 = aVar.b(this, this.f1365h);
            if (b2 != null) {
                boolean[] zArr = this.f1365h;
                int i4 = b2.f1378b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f1367j; i6++) {
                    b bVar = this.f1363f[i6];
                    if (bVar.f1348a.f1383g != i.a.UNRESTRICTED && !bVar.f1352e && bVar.s(b2)) {
                        float f3 = bVar.f1351d.f(b2);
                        if (f3 < 0.0f) {
                            float f4 = (-bVar.f1349b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f1363f[i5];
                    bVar2.f1348a.f1379c = -1;
                    bVar2.v(b2);
                    i iVar = bVar2.f1348a;
                    iVar.f1379c = i5;
                    iVar.f(bVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    private void D() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f1363f;
            if (i2 >= bVarArr.length) {
                return;
            }
            b bVar = bVarArr[i2];
            if (bVar != null) {
                this.f1369l.f1353a.b(bVar);
            }
            this.f1363f[i2] = null;
            i2++;
        }
    }

    private final void F(b bVar) {
        if (this.f1367j > 0) {
            bVar.f1351d.o(bVar, this.f1363f);
            if (bVar.f1351d.f1337a == 0) {
                bVar.f1352e = true;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i c2 = this.f1369l.f1354b.c();
        if (c2 == null) {
            c2 = new i(aVar, str);
        } else {
            c2.d();
        }
        c2.e(aVar, str);
        int i2 = this.f1371n;
        int i3 = f1356q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1356q = i4;
            this.f1370m = (i[]) Arrays.copyOf(this.f1370m, i4);
        }
        i[] iVarArr = this.f1370m;
        int i5 = this.f1371n;
        this.f1371n = i5 + 1;
        iVarArr[i5] = c2;
        return c2;
    }

    private void g(b bVar) {
        bVar.d(this, 0);
    }

    private final void m(b bVar) {
        b[] bVarArr = this.f1363f;
        int i2 = this.f1367j;
        if (bVarArr[i2] != null) {
            this.f1369l.f1353a.b(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f1363f;
        int i3 = this.f1367j;
        bVarArr2[i3] = bVar;
        i iVar = bVar.f1348a;
        iVar.f1379c = i3;
        this.f1367j = i3 + 1;
        iVar.f(bVar);
    }

    private void o() {
        for (int i2 = 0; i2 < this.f1367j; i2++) {
            b bVar = this.f1363f[i2];
            bVar.f1348a.f1381e = bVar.f1349b;
        }
    }

    public static b t(e eVar, i iVar, i iVar2, i iVar3, float f2, boolean z) {
        b s2 = eVar.s();
        if (z) {
            eVar.g(s2);
        }
        return s2.i(iVar, iVar2, iVar3, f2);
    }

    private int v(a aVar) {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.f1367j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f1363f;
            if (bVarArr[i2].f1348a.f1383g != i.a.UNRESTRICTED && bVarArr[i2].f1349b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3++;
                float f3 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f1367j) {
                    b bVar = this.f1363f[i4];
                    if (bVar.f1348a.f1383g != i.a.UNRESTRICTED && !bVar.f1352e && bVar.f1349b < f2) {
                        int i8 = 1;
                        while (i8 < this.f1366i) {
                            i iVar = this.f1369l.f1355c[i8];
                            float f4 = bVar.f1351d.f(iVar);
                            if (f4 > f2) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f5 = iVar.f1382f[i9] / f4;
                                    if ((f5 < f3 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f3 = f5;
                                        i5 = i4;
                                        i6 = i8;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i4++;
                    f2 = 0.0f;
                }
                if (i5 != -1) {
                    b bVar2 = this.f1363f[i5];
                    bVar2.f1348a.f1379c = -1;
                    bVar2.v(this.f1369l.f1355c[i6]);
                    i iVar2 = bVar2.f1348a;
                    iVar2.f1379c = i5;
                    iVar2.f(bVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f1366i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
            }
            return i3;
        }
        return 0;
    }

    public static f x() {
        return null;
    }

    private void z() {
        int i2 = this.f1361d * 2;
        this.f1361d = i2;
        this.f1363f = (b[]) Arrays.copyOf(this.f1363f, i2);
        c cVar = this.f1369l;
        cVar.f1355c = (i[]) Arrays.copyOf(cVar.f1355c, this.f1361d);
        int i3 = this.f1361d;
        this.f1365h = new boolean[i3];
        this.f1362e = i3;
        this.f1368k = i3;
    }

    public void A() {
        if (this.f1364g) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f1367j) {
                    z = true;
                    break;
                } else if (!this.f1363f[i2].f1352e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                o();
                return;
            }
        }
        B(this.f1360c);
    }

    void B(a aVar) {
        F((b) aVar);
        v(aVar);
        C(aVar, false);
        o();
    }

    public void E() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f1369l;
            i[] iVarArr = cVar.f1355c;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f1354b.a(this.f1370m, this.f1371n);
        this.f1371n = 0;
        Arrays.fill(this.f1369l.f1355c, (Object) null);
        HashMap<String, i> hashMap = this.f1359b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1358a = 0;
        this.f1360c.clear();
        this.f1366i = 1;
        for (int i3 = 0; i3 < this.f1367j; i3++) {
            this.f1363f[i3].f1350c = false;
        }
        D();
        this.f1367j = 0;
    }

    public void b(f.f fVar, f.f fVar2, float f2, int i2) {
        e.d dVar = e.d.LEFT;
        i r2 = r(fVar.h(dVar));
        e.d dVar2 = e.d.TOP;
        i r3 = r(fVar.h(dVar2));
        e.d dVar3 = e.d.RIGHT;
        i r4 = r(fVar.h(dVar3));
        e.d dVar4 = e.d.BOTTOM;
        i r5 = r(fVar.h(dVar4));
        i r6 = r(fVar2.h(dVar));
        i r7 = r(fVar2.h(dVar2));
        i r8 = r(fVar2.h(dVar3));
        i r9 = r(fVar2.h(dVar4));
        b s2 = s();
        double d2 = f2;
        double sin = Math.sin(d2);
        double d3 = i2;
        Double.isNaN(d3);
        s2.p(r3, r5, r7, r9, (float) (sin * d3));
        d(s2);
        b s3 = s();
        double cos = Math.cos(d2);
        Double.isNaN(d3);
        s3.p(r2, r4, r6, r8, (float) (cos * d3));
        d(s3);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        b s2 = s();
        s2.g(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 6) {
            s2.d(this, i4);
        }
        d(s2);
    }

    public void d(b bVar) {
        i u2;
        if (bVar == null) {
            return;
        }
        boolean z = true;
        if (this.f1367j + 1 >= this.f1368k || this.f1366i + 1 >= this.f1362e) {
            z();
        }
        boolean z2 = false;
        if (!bVar.f1352e) {
            F(bVar);
            if (bVar.t()) {
                return;
            }
            bVar.q();
            if (bVar.f(this)) {
                i q2 = q();
                bVar.f1348a = q2;
                m(bVar);
                this.f1373p.c(bVar);
                C(this.f1373p, true);
                if (q2.f1379c == -1) {
                    if (bVar.f1348a == q2 && (u2 = bVar.u(q2)) != null) {
                        bVar.v(u2);
                    }
                    if (!bVar.f1352e) {
                        bVar.f1348a.f(bVar);
                    }
                    this.f1367j--;
                }
            } else {
                z = false;
            }
            if (!bVar.r()) {
                return;
            }
            z2 = z;
        }
        if (z2) {
            return;
        }
        m(bVar);
    }

    public b e(i iVar, i iVar2, int i2, int i3) {
        b s2 = s();
        s2.m(iVar, iVar2, i2);
        if (i3 != 6) {
            s2.d(this, i3);
        }
        d(s2);
        return s2;
    }

    public void f(i iVar, int i2) {
        b s2;
        int i3 = iVar.f1379c;
        if (i3 != -1) {
            b bVar = this.f1363f[i3];
            if (!bVar.f1352e) {
                if (bVar.f1351d.f1337a == 0) {
                    bVar.f1352e = true;
                } else {
                    s2 = s();
                    s2.l(iVar, i2);
                }
            }
            bVar.f1349b = i2;
            return;
        }
        s2 = s();
        s2.h(iVar, i2);
        d(s2);
    }

    public void h(i iVar, i iVar2, boolean z) {
        b s2 = s();
        i u2 = u();
        u2.f1380d = 0;
        s2.n(iVar, iVar2, u2, 0);
        if (z) {
            n(s2, (int) (s2.f1351d.f(u2) * (-1.0f)), 1);
        }
        d(s2);
    }

    public void i(i iVar, i iVar2, int i2, int i3) {
        b s2 = s();
        i u2 = u();
        u2.f1380d = 0;
        s2.n(iVar, iVar2, u2, i2);
        if (i3 != 6) {
            n(s2, (int) (s2.f1351d.f(u2) * (-1.0f)), i3);
        }
        d(s2);
    }

    public void j(i iVar, i iVar2, boolean z) {
        b s2 = s();
        i u2 = u();
        u2.f1380d = 0;
        s2.o(iVar, iVar2, u2, 0);
        if (z) {
            n(s2, (int) (s2.f1351d.f(u2) * (-1.0f)), 1);
        }
        d(s2);
    }

    public void k(i iVar, i iVar2, int i2, int i3) {
        b s2 = s();
        i u2 = u();
        u2.f1380d = 0;
        s2.o(iVar, iVar2, u2, i2);
        if (i3 != 6) {
            n(s2, (int) (s2.f1351d.f(u2) * (-1.0f)), i3);
        }
        d(s2);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        b s2 = s();
        s2.j(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 6) {
            s2.d(this, i2);
        }
        d(s2);
    }

    void n(b bVar, int i2, int i3) {
        bVar.e(p(i3, null), i2);
    }

    public i p(int i2, String str) {
        if (this.f1366i + 1 >= this.f1362e) {
            z();
        }
        i a2 = a(i.a.ERROR, str);
        int i3 = this.f1358a + 1;
        this.f1358a = i3;
        this.f1366i++;
        a2.f1378b = i3;
        a2.f1380d = i2;
        this.f1369l.f1355c[i3] = a2;
        this.f1360c.a(a2);
        return a2;
    }

    public i q() {
        if (this.f1366i + 1 >= this.f1362e) {
            z();
        }
        i a2 = a(i.a.SLACK, null);
        int i2 = this.f1358a + 1;
        this.f1358a = i2;
        this.f1366i++;
        a2.f1378b = i2;
        this.f1369l.f1355c[i2] = a2;
        return a2;
    }

    public i r(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1366i + 1 >= this.f1362e) {
            z();
        }
        if (obj instanceof f.e) {
            f.e eVar = (f.e) obj;
            iVar = eVar.g();
            if (iVar == null) {
                eVar.n(this.f1369l);
                iVar = eVar.g();
            }
            int i2 = iVar.f1378b;
            if (i2 == -1 || i2 > this.f1358a || this.f1369l.f1355c[i2] == null) {
                if (i2 != -1) {
                    iVar.d();
                }
                int i3 = this.f1358a + 1;
                this.f1358a = i3;
                this.f1366i++;
                iVar.f1378b = i3;
                iVar.f1383g = i.a.UNRESTRICTED;
                this.f1369l.f1355c[i3] = iVar;
            }
        }
        return iVar;
    }

    public b s() {
        b c2 = this.f1369l.f1353a.c();
        if (c2 == null) {
            c2 = new b(this.f1369l);
        } else {
            c2.w();
        }
        i.b();
        return c2;
    }

    public i u() {
        if (this.f1366i + 1 >= this.f1362e) {
            z();
        }
        i a2 = a(i.a.SLACK, null);
        int i2 = this.f1358a + 1;
        this.f1358a = i2;
        this.f1366i++;
        a2.f1378b = i2;
        this.f1369l.f1355c[i2] = a2;
        return a2;
    }

    public c w() {
        return this.f1369l;
    }

    public int y(Object obj) {
        i g2 = ((f.e) obj).g();
        if (g2 != null) {
            return (int) (g2.f1381e + 0.5f);
        }
        return 0;
    }
}
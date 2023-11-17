package e;

import e.e;
import e.i;

/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: d  reason: collision with root package name */
    public final a f1351d;

    /* renamed from: a  reason: collision with root package name */
    i f1348a = null;

    /* renamed from: b  reason: collision with root package name */
    float f1349b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f1350c = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f1352e = false;

    public b(c cVar) {
        this.f1351d = new a(this, cVar);
    }

    @Override // e.e.a
    public void a(i iVar) {
        int i2 = iVar.f1380d;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f1351d.l(iVar, f2);
    }

    @Override // e.e.a
    public i b(e eVar, boolean[] zArr) {
        return this.f1351d.g(zArr, null);
    }

    @Override // e.e.a
    public void c(e.a aVar) {
        if (!(aVar instanceof b)) {
            return;
        }
        b bVar = (b) aVar;
        this.f1348a = null;
        this.f1351d.c();
        int i2 = 0;
        while (true) {
            a aVar2 = bVar.f1351d;
            if (i2 >= aVar2.f1337a) {
                return;
            }
            this.f1351d.a(aVar2.h(i2), bVar.f1351d.i(i2), true);
            i2++;
        }
    }

    @Override // e.e.a
    public void clear() {
        this.f1351d.c();
        this.f1348a = null;
        this.f1349b = 0.0f;
    }

    public b d(e eVar, int i2) {
        this.f1351d.l(eVar.p(i2, "ep"), 1.0f);
        this.f1351d.l(eVar.p(i2, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i2) {
        this.f1351d.l(iVar, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(e eVar) {
        boolean z;
        i b2 = this.f1351d.b(eVar);
        if (b2 == null) {
            z = true;
        } else {
            v(b2);
            z = false;
        }
        if (this.f1351d.f1337a == 0) {
            this.f1352e = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b g(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        if (iVar2 == iVar3) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar4, 1.0f);
            this.f1351d.l(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
            this.f1351d.l(iVar3, -1.0f);
            this.f1351d.l(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                f3 = (-i2) + i3;
                this.f1349b = f3;
            }
        } else {
            if (f2 <= 0.0f) {
                this.f1351d.l(iVar, -1.0f);
                this.f1351d.l(iVar2, 1.0f);
                f3 = i2;
            } else if (f2 >= 1.0f) {
                this.f1351d.l(iVar3, -1.0f);
                this.f1351d.l(iVar4, 1.0f);
                f3 = i3;
            } else {
                float f4 = 1.0f - f2;
                this.f1351d.l(iVar, f4 * 1.0f);
                this.f1351d.l(iVar2, f4 * (-1.0f));
                this.f1351d.l(iVar3, (-1.0f) * f2);
                this.f1351d.l(iVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    f3 = ((-i2) * f4) + (i3 * f2);
                }
            }
            this.f1349b = f3;
        }
        return this;
    }

    @Override // e.e.a
    public i getKey() {
        return this.f1348a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, int i2) {
        this.f1348a = iVar;
        float f2 = i2;
        iVar.f1381e = f2;
        this.f1349b = f2;
        this.f1352e = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, i iVar2, i iVar3, float f2) {
        this.f1351d.l(iVar, -1.0f);
        this.f1351d.l(iVar2, 1.0f - f2);
        this.f1351d.l(iVar3, f2);
        return this;
    }

    public b j(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f1351d.l(iVar, -1.0f);
        this.f1351d.l(iVar2, 1.0f);
        this.f1351d.l(iVar3, f2);
        this.f1351d.l(iVar4, -f2);
        return this;
    }

    public b k(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f1349b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
            this.f1351d.l(iVar4, 1.0f);
            this.f1351d.l(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f1351d.l(iVar3, 1.0f);
            this.f1351d.l(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
            this.f1351d.l(iVar4, f5);
            this.f1351d.l(iVar3, -f5);
        }
        return this;
    }

    public b l(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f1349b = i2 * (-1);
            aVar = this.f1351d;
            f2 = 1.0f;
        } else {
            this.f1349b = i2;
            aVar = this.f1351d;
            f2 = -1.0f;
        }
        aVar.l(iVar, f2);
        return this;
    }

    public b m(i iVar, i iVar2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1349b = i2;
        }
        if (z) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
        } else {
            this.f1351d.l(iVar, -1.0f);
            this.f1351d.l(iVar2, 1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1349b = i2;
        }
        if (z) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
            this.f1351d.l(iVar3, -1.0f);
        } else {
            this.f1351d.l(iVar, -1.0f);
            this.f1351d.l(iVar2, 1.0f);
            this.f1351d.l(iVar3, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1349b = i2;
        }
        if (z) {
            this.f1351d.l(iVar, 1.0f);
            this.f1351d.l(iVar2, -1.0f);
            this.f1351d.l(iVar3, 1.0f);
        } else {
            this.f1351d.l(iVar, -1.0f);
            this.f1351d.l(iVar2, 1.0f);
            this.f1351d.l(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f1351d.l(iVar3, 0.5f);
        this.f1351d.l(iVar4, 0.5f);
        this.f1351d.l(iVar, -0.5f);
        this.f1351d.l(iVar2, -0.5f);
        this.f1349b = -f2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        float f2 = this.f1349b;
        if (f2 < 0.0f) {
            this.f1349b = f2 * (-1.0f);
            this.f1351d.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        i iVar = this.f1348a;
        return iVar != null && (iVar.f1383g == i.a.UNRESTRICTED || this.f1349b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(i iVar) {
        return this.f1351d.d(iVar);
    }

    public boolean t() {
        return this.f1348a == null && this.f1349b == 0.0f && this.f1351d.f1337a == 0;
    }

    public String toString() {
        return x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i u(i iVar) {
        return this.f1351d.g(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(i iVar) {
        i iVar2 = this.f1348a;
        if (iVar2 != null) {
            this.f1351d.l(iVar2, -1.0f);
            this.f1348a = null;
        }
        float m2 = this.f1351d.m(iVar, true) * (-1.0f);
        this.f1348a = iVar;
        if (m2 == 1.0f) {
            return;
        }
        this.f1349b /= m2;
        this.f1351d.e(m2);
    }

    public void w() {
        this.f1348a = null;
        this.f1351d.c();
        this.f1349b = 0.0f;
        this.f1352e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String x() {
        /*
            r9 = this;
            e.i r0 = r9.f1348a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            e.i r1 = r9.f1348a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f1349b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f1349b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            e.a r5 = r9.f1351d
            int r5 = r5.f1337a
        L57:
            if (r2 >= r5) goto Ld4
            e.a r6 = r9.f1351d
            e.i r6 = r6.h(r2)
            if (r6 != 0) goto L62
            goto Ld1
        L62:
            e.a r7 = r9.f1351d
            float r7 = r7.i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Ld1
        L6d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La4
        L84:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lad
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        Lad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc6
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Ld1:
            int r2 = r2 + 1
            goto L57
        Ld4:
            if (r1 != 0) goto Le7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.x():java.lang.String");
    }
}
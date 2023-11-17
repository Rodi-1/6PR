package f;

import f.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    protected f f1393a;

    /* renamed from: b  reason: collision with root package name */
    protected f f1394b;

    /* renamed from: c  reason: collision with root package name */
    protected f f1395c;

    /* renamed from: d  reason: collision with root package name */
    protected f f1396d;

    /* renamed from: e  reason: collision with root package name */
    protected f f1397e;

    /* renamed from: f  reason: collision with root package name */
    protected f f1398f;

    /* renamed from: g  reason: collision with root package name */
    protected f f1399g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<f> f1400h;

    /* renamed from: i  reason: collision with root package name */
    protected int f1401i;

    /* renamed from: j  reason: collision with root package name */
    protected int f1402j;

    /* renamed from: k  reason: collision with root package name */
    protected float f1403k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    private int f1404l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1405m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f1406n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f1407o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f1408p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1409q;

    public d(f fVar, int i2, boolean z) {
        this.f1393a = fVar;
        this.f1404l = i2;
        this.f1405m = z;
    }

    private void b() {
        int i2 = this.f1404l * 2;
        f fVar = this.f1393a;
        boolean z = false;
        f fVar2 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.f1401i++;
            f[] fVarArr = fVar.r0;
            int i3 = this.f1404l;
            f fVar3 = null;
            fVarArr[i3] = null;
            fVar.q0[i3] = null;
            if (fVar.C() != 8) {
                if (this.f1394b == null) {
                    this.f1394b = fVar;
                }
                this.f1396d = fVar;
                f.b[] bVarArr = fVar.E;
                int i4 = this.f1404l;
                if (bVarArr[i4] == f.b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.f1444g;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f1402j++;
                        float[] fArr = fVar.p0;
                        float f2 = fArr[i4];
                        if (f2 > 0.0f) {
                            this.f1403k += fArr[i4];
                        }
                        if (c(fVar, i4)) {
                            if (f2 < 0.0f) {
                                this.f1406n = true;
                            } else {
                                this.f1407o = true;
                            }
                            if (this.f1400h == null) {
                                this.f1400h = new ArrayList<>();
                            }
                            this.f1400h.add(fVar);
                        }
                        if (this.f1398f == null) {
                            this.f1398f = fVar;
                        }
                        f fVar4 = this.f1399g;
                        if (fVar4 != null) {
                            fVar4.q0[this.f1404l] = fVar;
                        }
                        this.f1399g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.r0[this.f1404l] = fVar;
            }
            e eVar = fVar.C[i2 + 1].f1413d;
            if (eVar != null) {
                f fVar5 = eVar.f1411b;
                e[] eVarArr = fVar5.C;
                if (eVarArr[i2].f1413d != null && eVarArr[i2].f1413d.f1411b == fVar) {
                    fVar3 = fVar5;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar;
                z2 = true;
            }
            fVar2 = fVar;
            fVar = fVar3;
        }
        this.f1395c = fVar;
        if (this.f1404l == 0 && this.f1405m) {
            this.f1397e = fVar;
        } else {
            this.f1397e = this.f1393a;
        }
        if (this.f1407o && this.f1406n) {
            z = true;
        }
        this.f1408p = z;
    }

    private static boolean c(f fVar, int i2) {
        if (fVar.C() != 8 && fVar.E[i2] == f.b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f1444g;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f1409q) {
            b();
        }
        this.f1409q = true;
    }
}
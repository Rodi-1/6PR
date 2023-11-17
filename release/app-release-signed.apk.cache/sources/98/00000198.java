package f;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public List<f> f1468a;

    /* renamed from: b  reason: collision with root package name */
    int f1469b;

    /* renamed from: c  reason: collision with root package name */
    int f1470c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1471d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1472e;

    /* renamed from: f  reason: collision with root package name */
    List<f> f1473f;

    /* renamed from: g  reason: collision with root package name */
    List<f> f1474g;

    /* renamed from: h  reason: collision with root package name */
    HashSet<f> f1475h;

    /* renamed from: i  reason: collision with root package name */
    HashSet<f> f1476i;

    /* renamed from: j  reason: collision with root package name */
    List<f> f1477j;

    /* renamed from: k  reason: collision with root package name */
    List<f> f1478k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<f> list) {
        this.f1469b = -1;
        this.f1470c = -1;
        this.f1471d = false;
        this.f1472e = new int[]{-1, -1};
        this.f1473f = new ArrayList();
        this.f1474g = new ArrayList();
        this.f1475h = new HashSet<>();
        this.f1476i = new HashSet<>();
        this.f1477j = new ArrayList();
        this.f1478k = new ArrayList();
        this.f1468a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<f> list, boolean z) {
        this.f1469b = -1;
        this.f1470c = -1;
        this.f1471d = false;
        this.f1472e = new int[]{-1, -1};
        this.f1473f = new ArrayList();
        this.f1474g = new ArrayList();
        this.f1475h = new HashSet<>();
        this.f1476i = new HashSet<>();
        this.f1477j = new ArrayList();
        this.f1478k = new ArrayList();
        this.f1468a = list;
        this.f1471d = z;
    }

    private void e(ArrayList<f> arrayList, f fVar) {
        f fVar2;
        if (fVar.k0) {
            return;
        }
        arrayList.add(fVar);
        fVar.k0 = true;
        if (fVar.L()) {
            return;
        }
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int i2 = jVar.w0;
            for (int i3 = 0; i3 < i2; i3++) {
                e(arrayList, jVar.v0[i3]);
            }
        }
        int length = fVar.C.length;
        for (int i4 = 0; i4 < length; i4++) {
            e eVar = fVar.C[i4].f1413d;
            if (eVar != null && (fVar2 = eVar.f1411b) != fVar.u()) {
                e(arrayList, fVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(f.f r7) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f(f.f):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar, int i2) {
        HashSet<f> hashSet;
        if (i2 == 0) {
            hashSet = this.f1475h;
        } else if (i2 != 1) {
            return;
        } else {
            hashSet = this.f1476i;
        }
        hashSet.add(fVar);
    }

    public List<f> b(int i2) {
        if (i2 == 0) {
            return this.f1473f;
        }
        if (i2 == 1) {
            return this.f1474g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> c(int i2) {
        if (i2 == 0) {
            return this.f1475h;
        }
        if (i2 == 1) {
            return this.f1476i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<f> d() {
        if (this.f1477j.isEmpty()) {
            int size = this.f1468a.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f1468a.get(i2);
                if (!fVar.i0) {
                    e((ArrayList) this.f1477j, fVar);
                }
            }
            this.f1478k.clear();
            this.f1478k.addAll(this.f1468a);
            this.f1478k.removeAll(this.f1477j);
            return this.f1477j;
        }
        return this.f1477j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        int size = this.f1478k.size();
        for (int i2 = 0; i2 < size; i2++) {
            f(this.f1478k.get(i2));
        }
    }
}
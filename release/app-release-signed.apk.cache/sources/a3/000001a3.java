package f;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class q extends f {
    protected ArrayList<f> v0 = new ArrayList<>();

    @Override // f.f
    public void F0() {
        super.F0();
        ArrayList<f> arrayList = this.v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.v0.get(i2);
            fVar.n0(p(), q());
            if (!(fVar instanceof g)) {
                fVar.F0();
            }
        }
    }

    public void I0(f fVar) {
        this.v0.add(fVar);
        if (fVar.u() != null) {
            ((q) fVar.u()).L0(fVar);
        }
        fVar.p0(this);
    }

    public g J0() {
        f u2 = u();
        g gVar = this instanceof g ? (g) this : null;
        while (u2 != null) {
            f u3 = u2.u();
            if (u2 instanceof g) {
                gVar = (g) u2;
            }
            u2 = u3;
        }
        return gVar;
    }

    public void K0() {
        F0();
        ArrayList<f> arrayList = this.v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.v0.get(i2);
            if (fVar instanceof q) {
                ((q) fVar).K0();
            }
        }
    }

    public void L0(f fVar) {
        this.v0.remove(fVar);
        fVar.p0(null);
    }

    public void M0() {
        this.v0.clear();
    }

    @Override // f.f
    public void Q() {
        this.v0.clear();
        super.Q();
    }

    @Override // f.f
    public void T(e.c cVar) {
        super.T(cVar);
        int size = this.v0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.v0.get(i2).T(cVar);
        }
    }

    @Override // f.f
    public void n0(int i2, int i3) {
        super.n0(i2, i3);
        int size = this.v0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.v0.get(i4).n0(z(), A());
        }
    }
}
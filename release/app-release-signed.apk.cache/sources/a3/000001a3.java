package p007f;

import java.util.ArrayList;
import p006e.C0352c;

/* renamed from: f.q */
/* loaded from: classes.dex */
public class C0385q extends C0370f {

    /* renamed from: v0 */
    protected ArrayList<C0370f> f2019v0 = new ArrayList<>();

    @Override // p007f.C0370f
    /* renamed from: F0 */
    public void mo744F0() {
        super.mo744F0();
        ArrayList<C0370f> arrayList = this.f2019v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0370f c0370f = this.f2019v0.get(i);
            c0370f.mo736n0(m833p(), m831q());
            if (!(c0370f instanceof C0373g)) {
                c0370f.mo744F0();
            }
        }
    }

    /* renamed from: I0 */
    public void m743I0(C0370f c0370f) {
        this.f2019v0.add(c0370f);
        if (c0370f.m823u() != null) {
            ((C0385q) c0370f.m823u()).m740L0(c0370f);
        }
        c0370f.m832p0(this);
    }

    /* renamed from: J0 */
    public C0373g m742J0() {
        C0370f m823u = m823u();
        C0373g c0373g = this instanceof C0373g ? (C0373g) this : null;
        while (m823u != null) {
            C0370f m823u2 = m823u.m823u();
            if (m823u instanceof C0373g) {
                c0373g = (C0373g) m823u;
            }
            m823u = m823u2;
        }
        return c0373g;
    }

    /* renamed from: K0 */
    public void mo741K0() {
        mo744F0();
        ArrayList<C0370f> arrayList = this.f2019v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0370f c0370f = this.f2019v0.get(i);
            if (c0370f instanceof C0385q) {
                ((C0385q) c0370f).mo741K0();
            }
        }
    }

    /* renamed from: L0 */
    public void m740L0(C0370f c0370f) {
        this.f2019v0.remove(c0370f);
        c0370f.m832p0(null);
    }

    /* renamed from: M0 */
    public void m739M0() {
        this.f2019v0.clear();
    }

    @Override // p007f.C0370f
    /* renamed from: Q */
    public void mo738Q() {
        this.f2019v0.clear();
        super.mo738Q();
    }

    @Override // p007f.C0370f
    /* renamed from: T */
    public void mo737T(C0352c c0352c) {
        super.mo737T(c0352c);
        int size = this.f2019v0.size();
        for (int i = 0; i < size; i++) {
            this.f2019v0.get(i).mo737T(c0352c);
        }
    }

    @Override // p007f.C0370f
    /* renamed from: n0 */
    public void mo736n0(int i, int i2) {
        super.mo736n0(i, i2);
        int size = this.f2019v0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f2019v0.get(i3).mo736n0(m813z(), m887A());
        }
    }
}
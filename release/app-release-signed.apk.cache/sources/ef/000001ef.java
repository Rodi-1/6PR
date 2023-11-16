package p015n;

/* renamed from: n.i */
/* loaded from: classes.dex */
public class C0460i<F, S> {

    /* renamed from: a */
    public final F f2186a;

    /* renamed from: b */
    public final S f2187b;

    /* renamed from: a */
    private static boolean m501a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0460i) {
            C0460i c0460i = (C0460i) obj;
            return m501a(c0460i.f2186a, this.f2186a) && m501a(c0460i.f2187b, this.f2187b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.f2186a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f2187b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f2186a) + " " + String.valueOf(this.f2187b) + "}";
    }
}
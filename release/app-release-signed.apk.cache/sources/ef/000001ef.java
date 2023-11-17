package n;

/* loaded from: classes.dex */
public class i<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f1668a;

    /* renamed from: b  reason: collision with root package name */
    public final S f1669b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return a(iVar.f1668a, this.f1668a) && a(iVar.f1669b, this.f1669b);
        }
        return false;
    }

    public int hashCode() {
        F f2 = this.f1668a;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s2 = this.f1669b;
        return hashCode ^ (s2 != null ? s2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f1668a) + " " + String.valueOf(this.f1669b) + "}";
    }
}
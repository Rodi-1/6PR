package n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f1645a;

    /* renamed from: b  reason: collision with root package name */
    private int f1646b;

    /* renamed from: c  reason: collision with root package name */
    private int f1647c;

    /* renamed from: d  reason: collision with root package name */
    private int f1648d;

    /* renamed from: e  reason: collision with root package name */
    private int f1649e;

    /* renamed from: f  reason: collision with root package name */
    private int f1650f;

    /* renamed from: g  reason: collision with root package name */
    private int f1651g;

    /* renamed from: h  reason: collision with root package name */
    private int f1652h;

    public g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1647c = i2;
        this.f1645a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int e(K k2, V v2) {
        int f2 = f(k2, v2);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v2);
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean z, K k2, V v2, V v3) {
    }

    public final V c(K k2) {
        V put;
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v2 = this.f1645a.get(k2);
            if (v2 != null) {
                this.f1651g++;
                return v2;
            }
            this.f1652h++;
            V a2 = a(k2);
            if (a2 == null) {
                return null;
            }
            synchronized (this) {
                this.f1649e++;
                put = this.f1645a.put(k2, a2);
                if (put != null) {
                    this.f1645a.put(k2, put);
                } else {
                    this.f1646b += e(k2, a2);
                }
            }
            if (put != null) {
                b(false, k2, a2, put);
                return put;
            }
            g(this.f1647c);
            return a2;
        }
    }

    public final V d(K k2, V v2) {
        V put;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1648d++;
            this.f1646b += e(k2, v2);
            put = this.f1645a.put(k2, v2);
            if (put != null) {
                this.f1646b -= e(k2, put);
            }
        }
        if (put != null) {
            b(false, k2, put, v2);
        }
        g(this.f1647c);
        return put;
    }

    protected int f(K k2, V v2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1646b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1645a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1646b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1646b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1645a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1645a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1645a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1646b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1646b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1650f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1650f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: n.g.g(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f1651g;
        i3 = this.f1652h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1647c), Integer.valueOf(this.f1651g), Integer.valueOf(this.f1652h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
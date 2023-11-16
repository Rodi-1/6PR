package p015n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* renamed from: n.g */
/* loaded from: classes.dex */
public class C0453g<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f2163a;

    /* renamed from: b */
    private int f2164b;

    /* renamed from: c */
    private int f2165c;

    /* renamed from: d */
    private int f2166d;

    /* renamed from: e */
    private int f2167e;

    /* renamed from: f */
    private int f2168f;

    /* renamed from: g */
    private int f2169g;

    /* renamed from: h */
    private int f2170h;

    public C0453g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2165c = i;
        this.f2163a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: e */
    private int m524e(K k, V v) {
        int m523f = m523f(k, v);
        if (m523f >= 0) {
            return m523f;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m528a(K k) {
        return null;
    }

    /* renamed from: b */
    protected void m527b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final V m526c(K k) {
        V put;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f2163a.get(k);
            if (v != null) {
                this.f2169g++;
                return v;
            }
            this.f2170h++;
            V m528a = m528a(k);
            if (m528a == null) {
                return null;
            }
            synchronized (this) {
                this.f2167e++;
                put = this.f2163a.put(k, m528a);
                if (put != null) {
                    this.f2163a.put(k, put);
                } else {
                    this.f2164b += m524e(k, m528a);
                }
            }
            if (put != null) {
                m527b(false, k, m528a, put);
                return put;
            }
            m522g(this.f2165c);
            return m528a;
        }
    }

    /* renamed from: d */
    public final V m525d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2166d++;
            this.f2164b += m524e(k, v);
            put = this.f2163a.put(k, v);
            if (put != null) {
                this.f2164b -= m524e(k, put);
            }
        }
        if (put != null) {
            m527b(false, k, put, v);
        }
        m522g(this.f2165c);
        return put;
    }

    /* renamed from: f */
    protected int m523f(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m522g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f2164b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f2163a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f2164b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f2164b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f2163a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f2163a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f2163a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f2164b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m524e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f2164b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f2168f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f2168f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m527b(r3, r1, r0, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: p015n.C0453g.m522g(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f2169g;
        i2 = this.f2170h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2165c), Integer.valueOf(this.f2169g), Integer.valueOf(this.f2170h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
package p015n;

/* renamed from: n.f */
/* loaded from: classes.dex */
public class C0452f<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f2158f = new Object();

    /* renamed from: b */
    private boolean f2159b;

    /* renamed from: c */
    private long[] f2160c;

    /* renamed from: d */
    private Object[] f2161d;

    /* renamed from: e */
    private int f2162e;

    public C0452f() {
        this(10);
    }

    public C0452f(int i) {
        this.f2159b = false;
        if (i == 0) {
            this.f2160c = C0449c.f2154b;
            this.f2161d = C0449c.f2155c;
        } else {
            int m541f = C0449c.m541f(i);
            this.f2160c = new long[m541f];
            this.f2161d = new Object[m541f];
        }
        this.f2162e = 0;
    }

    /* renamed from: d */
    private void m535d() {
        int i = this.f2162e;
        long[] jArr = this.f2160c;
        Object[] objArr = this.f2161d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2158f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2159b = false;
        this.f2162e = i2;
    }

    /* renamed from: a */
    public void m538a() {
        int i = this.f2162e;
        Object[] objArr = this.f2161d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2162e = 0;
        this.f2159b = false;
    }

    /* renamed from: b */
    public C0452f<E> clone() {
        C0452f<E> c0452f;
        C0452f<E> c0452f2 = null;
        try {
            c0452f = (C0452f) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        try {
            c0452f.f2160c = (long[]) this.f2160c.clone();
            c0452f.f2161d = (Object[]) this.f2161d.clone();
            return c0452f;
        } catch (CloneNotSupportedException unused2) {
            c0452f2 = c0452f;
            return c0452f2;
        }
    }

    /* renamed from: c */
    public void m536c(long j) {
        int m545b = C0449c.m545b(this.f2160c, this.f2162e, j);
        if (m545b >= 0) {
            Object[] objArr = this.f2161d;
            Object obj = objArr[m545b];
            Object obj2 = f2158f;
            if (obj != obj2) {
                objArr[m545b] = obj2;
                this.f2159b = true;
            }
        }
    }

    /* renamed from: e */
    public E m534e(long j) {
        return m533f(j, null);
    }

    /* renamed from: f */
    public E m533f(long j, E e) {
        int m545b = C0449c.m545b(this.f2160c, this.f2162e, j);
        if (m545b >= 0) {
            Object[] objArr = this.f2161d;
            if (objArr[m545b] != f2158f) {
                return (E) objArr[m545b];
            }
        }
        return e;
    }

    /* renamed from: g */
    public long m532g(int i) {
        if (this.f2159b) {
            m535d();
        }
        return this.f2160c[i];
    }

    /* renamed from: h */
    public void m531h(long j, E e) {
        int m545b = C0449c.m545b(this.f2160c, this.f2162e, j);
        if (m545b >= 0) {
            this.f2161d[m545b] = e;
            return;
        }
        int i = m545b ^ (-1);
        int i2 = this.f2162e;
        if (i < i2) {
            Object[] objArr = this.f2161d;
            if (objArr[i] == f2158f) {
                this.f2160c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f2159b && i2 >= this.f2160c.length) {
            m535d();
            i = C0449c.m545b(this.f2160c, this.f2162e, j) ^ (-1);
        }
        int i3 = this.f2162e;
        if (i3 >= this.f2160c.length) {
            int m541f = C0449c.m541f(i3 + 1);
            long[] jArr = new long[m541f];
            Object[] objArr2 = new Object[m541f];
            long[] jArr2 = this.f2160c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2161d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2160c = jArr;
            this.f2161d = objArr2;
        }
        int i4 = this.f2162e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f2160c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f2161d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f2162e - i);
        }
        this.f2160c[i] = j;
        this.f2161d[i] = e;
        this.f2162e++;
    }

    /* renamed from: i */
    public int m530i() {
        if (this.f2159b) {
            m535d();
        }
        return this.f2162e;
    }

    /* renamed from: j */
    public E m529j(int i) {
        if (this.f2159b) {
            m535d();
        }
        return (E) this.f2161d[i];
    }

    public String toString() {
        if (m530i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2162e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2162e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m532g(i));
            sb.append('=');
            E m529j = m529j(i);
            if (m529j != this) {
                sb.append(m529j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
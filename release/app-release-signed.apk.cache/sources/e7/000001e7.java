package n;

/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1640f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1641b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f1642c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f1643d;

    /* renamed from: e  reason: collision with root package name */
    private int f1644e;

    public f() {
        this(10);
    }

    public f(int i2) {
        this.f1641b = false;
        if (i2 == 0) {
            this.f1642c = c.f1636b;
            this.f1643d = c.f1637c;
        } else {
            int f2 = c.f(i2);
            this.f1642c = new long[f2];
            this.f1643d = new Object[f2];
        }
        this.f1644e = 0;
    }

    private void d() {
        int i2 = this.f1644e;
        long[] jArr = this.f1642c;
        Object[] objArr = this.f1643d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1640f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1641b = false;
        this.f1644e = i3;
    }

    public void a() {
        int i2 = this.f1644e;
        Object[] objArr = this.f1643d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1644e = 0;
        this.f1641b = false;
    }

    /* renamed from: b */
    public f<E> clone() {
        f<E> fVar;
        f<E> fVar2 = null;
        try {
            fVar = (f) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        try {
            fVar.f1642c = (long[]) this.f1642c.clone();
            fVar.f1643d = (Object[]) this.f1643d.clone();
            return fVar;
        } catch (CloneNotSupportedException unused2) {
            fVar2 = fVar;
            return fVar2;
        }
    }

    public void c(long j2) {
        int b2 = c.b(this.f1642c, this.f1644e, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f1643d;
            Object obj = objArr[b2];
            Object obj2 = f1640f;
            if (obj != obj2) {
                objArr[b2] = obj2;
                this.f1641b = true;
            }
        }
    }

    public E e(long j2) {
        return f(j2, null);
    }

    public E f(long j2, E e2) {
        int b2 = c.b(this.f1642c, this.f1644e, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f1643d;
            if (objArr[b2] != f1640f) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public long g(int i2) {
        if (this.f1641b) {
            d();
        }
        return this.f1642c[i2];
    }

    public void h(long j2, E e2) {
        int b2 = c.b(this.f1642c, this.f1644e, j2);
        if (b2 >= 0) {
            this.f1643d[b2] = e2;
            return;
        }
        int i2 = b2 ^ (-1);
        int i3 = this.f1644e;
        if (i2 < i3) {
            Object[] objArr = this.f1643d;
            if (objArr[i2] == f1640f) {
                this.f1642c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1641b && i3 >= this.f1642c.length) {
            d();
            i2 = c.b(this.f1642c, this.f1644e, j2) ^ (-1);
        }
        int i4 = this.f1644e;
        if (i4 >= this.f1642c.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f1642c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1643d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1642c = jArr;
            this.f1643d = objArr2;
        }
        int i5 = this.f1644e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f1642c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1643d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1644e - i2);
        }
        this.f1642c[i2] = j2;
        this.f1643d[i2] = e2;
        this.f1644e++;
    }

    public int i() {
        if (this.f1641b) {
            d();
        }
        return this.f1644e;
    }

    public E j(int i2) {
        if (this.f1641b) {
            d();
        }
        return (E) this.f1643d[i2];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1644e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1644e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            E j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
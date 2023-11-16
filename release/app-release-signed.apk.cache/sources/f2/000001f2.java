package p015n;

/* renamed from: n.l */
/* loaded from: classes.dex */
public class C0463l<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f2195f = new Object();

    /* renamed from: b */
    private boolean f2196b;

    /* renamed from: c */
    private int[] f2197c;

    /* renamed from: d */
    private Object[] f2198d;

    /* renamed from: e */
    private int f2199e;

    public C0463l() {
        this(10);
    }

    public C0463l(int i) {
        this.f2196b = false;
        if (i == 0) {
            this.f2197c = C0449c.f2153a;
            this.f2198d = C0449c.f2155c;
        } else {
            int m542e = C0449c.m542e(i);
            this.f2197c = new int[m542e];
            this.f2198d = new Object[m542e];
        }
        this.f2199e = 0;
    }

    /* renamed from: e */
    private void m483e() {
        int i = this.f2199e;
        int[] iArr = this.f2197c;
        Object[] objArr = this.f2198d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2195f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2196b = false;
        this.f2199e = i2;
    }

    /* renamed from: a */
    public void m487a(int i, E e) {
        int i2 = this.f2199e;
        if (i2 != 0 && i <= this.f2197c[i2 - 1]) {
            m479i(i, e);
            return;
        }
        if (this.f2196b && i2 >= this.f2197c.length) {
            m483e();
        }
        int i3 = this.f2199e;
        if (i3 >= this.f2197c.length) {
            int m542e = C0449c.m542e(i3 + 1);
            int[] iArr = new int[m542e];
            Object[] objArr = new Object[m542e];
            int[] iArr2 = this.f2197c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2198d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2197c = iArr;
            this.f2198d = objArr;
        }
        this.f2197c[i3] = i;
        this.f2198d[i3] = e;
        this.f2199e = i3 + 1;
    }

    /* renamed from: b */
    public void m486b() {
        int i = this.f2199e;
        Object[] objArr = this.f2198d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2199e = 0;
        this.f2196b = false;
    }

    /* renamed from: c */
    public C0463l<E> clone() {
        C0463l<E> c0463l;
        C0463l<E> c0463l2 = null;
        try {
            c0463l = (C0463l) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        try {
            c0463l.f2197c = (int[]) this.f2197c.clone();
            c0463l.f2198d = (Object[]) this.f2198d.clone();
            return c0463l;
        } catch (CloneNotSupportedException unused2) {
            c0463l2 = c0463l;
            return c0463l2;
        }
    }

    /* renamed from: d */
    public void m484d(int i) {
        int m546a = C0449c.m546a(this.f2197c, this.f2199e, i);
        if (m546a >= 0) {
            Object[] objArr = this.f2198d;
            Object obj = objArr[m546a];
            Object obj2 = f2195f;
            if (obj != obj2) {
                objArr[m546a] = obj2;
                this.f2196b = true;
            }
        }
    }

    /* renamed from: f */
    public E m482f(int i) {
        return m481g(i, null);
    }

    /* renamed from: g */
    public E m481g(int i, E e) {
        int m546a = C0449c.m546a(this.f2197c, this.f2199e, i);
        if (m546a >= 0) {
            Object[] objArr = this.f2198d;
            if (objArr[m546a] != f2195f) {
                return (E) objArr[m546a];
            }
        }
        return e;
    }

    /* renamed from: h */
    public int m480h(int i) {
        if (this.f2196b) {
            m483e();
        }
        return this.f2197c[i];
    }

    /* renamed from: i */
    public void m479i(int i, E e) {
        int m546a = C0449c.m546a(this.f2197c, this.f2199e, i);
        if (m546a >= 0) {
            this.f2198d[m546a] = e;
            return;
        }
        int i2 = m546a ^ (-1);
        int i3 = this.f2199e;
        if (i2 < i3) {
            Object[] objArr = this.f2198d;
            if (objArr[i2] == f2195f) {
                this.f2197c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f2196b && i3 >= this.f2197c.length) {
            m483e();
            i2 = C0449c.m546a(this.f2197c, this.f2199e, i) ^ (-1);
        }
        int i4 = this.f2199e;
        if (i4 >= this.f2197c.length) {
            int m542e = C0449c.m542e(i4 + 1);
            int[] iArr = new int[m542e];
            Object[] objArr2 = new Object[m542e];
            int[] iArr2 = this.f2197c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2198d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2197c = iArr;
            this.f2198d = objArr2;
        }
        int i5 = this.f2199e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f2197c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2198d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2199e - i2);
        }
        this.f2197c[i2] = i;
        this.f2198d[i2] = e;
        this.f2199e++;
    }

    /* renamed from: j */
    public void m478j(int i) {
        m484d(i);
    }

    /* renamed from: k */
    public int m477k() {
        if (this.f2196b) {
            m483e();
        }
        return this.f2199e;
    }

    /* renamed from: l */
    public E m476l(int i) {
        if (this.f2196b) {
            m483e();
        }
        return (E) this.f2198d[i];
    }

    public String toString() {
        if (m477k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2199e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2199e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m480h(i));
            sb.append('=');
            E m476l = m476l(i);
            if (m476l != this) {
                sb.append(m476l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
package n;

/* loaded from: classes.dex */
public class l<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1677f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1678b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f1679c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f1680d;

    /* renamed from: e  reason: collision with root package name */
    private int f1681e;

    public l() {
        this(10);
    }

    public l(int i2) {
        this.f1678b = false;
        if (i2 == 0) {
            this.f1679c = c.f1635a;
            this.f1680d = c.f1637c;
        } else {
            int e2 = c.e(i2);
            this.f1679c = new int[e2];
            this.f1680d = new Object[e2];
        }
        this.f1681e = 0;
    }

    private void e() {
        int i2 = this.f1681e;
        int[] iArr = this.f1679c;
        Object[] objArr = this.f1680d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1677f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1678b = false;
        this.f1681e = i3;
    }

    public void a(int i2, E e2) {
        int i3 = this.f1681e;
        if (i3 != 0 && i2 <= this.f1679c[i3 - 1]) {
            i(i2, e2);
            return;
        }
        if (this.f1678b && i3 >= this.f1679c.length) {
            e();
        }
        int i4 = this.f1681e;
        if (i4 >= this.f1679c.length) {
            int e3 = c.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f1679c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1680d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1679c = iArr;
            this.f1680d = objArr;
        }
        this.f1679c[i4] = i2;
        this.f1680d[i4] = e2;
        this.f1681e = i4 + 1;
    }

    public void b() {
        int i2 = this.f1681e;
        Object[] objArr = this.f1680d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1681e = 0;
        this.f1678b = false;
    }

    /* renamed from: c */
    public l<E> clone() {
        l<E> lVar;
        l<E> lVar2 = null;
        try {
            lVar = (l) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        try {
            lVar.f1679c = (int[]) this.f1679c.clone();
            lVar.f1680d = (Object[]) this.f1680d.clone();
            return lVar;
        } catch (CloneNotSupportedException unused2) {
            lVar2 = lVar;
            return lVar2;
        }
    }

    public void d(int i2) {
        int a2 = c.a(this.f1679c, this.f1681e, i2);
        if (a2 >= 0) {
            Object[] objArr = this.f1680d;
            Object obj = objArr[a2];
            Object obj2 = f1677f;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.f1678b = true;
            }
        }
    }

    public E f(int i2) {
        return g(i2, null);
    }

    public E g(int i2, E e2) {
        int a2 = c.a(this.f1679c, this.f1681e, i2);
        if (a2 >= 0) {
            Object[] objArr = this.f1680d;
            if (objArr[a2] != f1677f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int h(int i2) {
        if (this.f1678b) {
            e();
        }
        return this.f1679c[i2];
    }

    public void i(int i2, E e2) {
        int a2 = c.a(this.f1679c, this.f1681e, i2);
        if (a2 >= 0) {
            this.f1680d[a2] = e2;
            return;
        }
        int i3 = a2 ^ (-1);
        int i4 = this.f1681e;
        if (i3 < i4) {
            Object[] objArr = this.f1680d;
            if (objArr[i3] == f1677f) {
                this.f1679c[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f1678b && i4 >= this.f1679c.length) {
            e();
            i3 = c.a(this.f1679c, this.f1681e, i2) ^ (-1);
        }
        int i5 = this.f1681e;
        if (i5 >= this.f1679c.length) {
            int e3 = c.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f1679c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1680d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1679c = iArr;
            this.f1680d = objArr2;
        }
        int i6 = this.f1681e;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f1679c;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f1680d;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f1681e - i3);
        }
        this.f1679c[i3] = i2;
        this.f1680d[i3] = e2;
        this.f1681e++;
    }

    public void j(int i2) {
        d(i2);
    }

    public int k() {
        if (this.f1678b) {
            e();
        }
        return this.f1681e;
    }

    public E l(int i2) {
        if (this.f1678b) {
            e();
        }
        return (E) this.f1680d[i2];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1681e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1681e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            E l2 = l(i2);
            if (l2 != this) {
                sb.append(l2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
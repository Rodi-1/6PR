package p015n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: n.k */
/* loaded from: classes.dex */
public class C0462k<K, V> {

    /* renamed from: e */
    static Object[] f2188e;

    /* renamed from: f */
    static int f2189f;

    /* renamed from: g */
    static Object[] f2190g;

    /* renamed from: h */
    static int f2191h;

    /* renamed from: b */
    int[] f2192b;

    /* renamed from: c */
    Object[] f2193c;

    /* renamed from: d */
    int f2194d;

    public C0462k() {
        this.f2192b = C0449c.f2153a;
        this.f2193c = C0449c.f2155c;
        this.f2194d = 0;
    }

    public C0462k(int i) {
        if (i == 0) {
            this.f2192b = C0449c.f2153a;
            this.f2193c = C0449c.f2155c;
        } else {
            m499a(i);
        }
        this.f2194d = 0;
    }

    /* renamed from: a */
    private void m499a(int i) {
        if (i == 8) {
            synchronized (C0445a.class) {
                Object[] objArr = f2190g;
                if (objArr != null) {
                    this.f2193c = objArr;
                    f2190g = (Object[]) objArr[0];
                    this.f2192b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2191h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0445a.class) {
                Object[] objArr2 = f2188e;
                if (objArr2 != null) {
                    this.f2193c = objArr2;
                    f2188e = (Object[]) objArr2[0];
                    this.f2192b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2189f--;
                    return;
                }
            }
        }
        this.f2192b = new int[i];
        this.f2193c = new Object[i << 1];
    }

    /* renamed from: b */
    private static int m498b(int[] iArr, int i, int i2) {
        try {
            return C0449c.m546a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m496d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0445a.class) {
                if (f2191h < 10) {
                    objArr[0] = f2190g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2190g = objArr;
                    f2191h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0445a.class) {
                if (f2189f < 10) {
                    objArr[0] = f2188e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2188e = objArr;
                    f2189f++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m497c(int i) {
        int i2 = this.f2194d;
        int[] iArr = this.f2192b;
        if (iArr.length < i) {
            Object[] objArr = this.f2193c;
            m499a(i);
            if (this.f2194d > 0) {
                System.arraycopy(iArr, 0, this.f2192b, 0, i2);
                System.arraycopy(objArr, 0, this.f2193c, 0, i2 << 1);
            }
            m496d(iArr, objArr, i2);
        }
        if (this.f2194d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f2194d;
        if (i > 0) {
            int[] iArr = this.f2192b;
            Object[] objArr = this.f2193c;
            this.f2192b = C0449c.f2153a;
            this.f2193c = C0449c.f2155c;
            this.f2194d = 0;
            m496d(iArr, objArr, i);
        }
        if (this.f2194d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m494f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m492h(obj) >= 0;
    }

    /* renamed from: e */
    int m495e(Object obj, int i) {
        int i2 = this.f2194d;
        if (i2 == 0) {
            return -1;
        }
        int m498b = m498b(this.f2192b, i2, i);
        if (m498b >= 0 && !obj.equals(this.f2193c[m498b << 1])) {
            int i3 = m498b + 1;
            while (i3 < i2 && this.f2192b[i3] == i) {
                if (obj.equals(this.f2193c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m498b - 1; i4 >= 0 && this.f2192b[i4] == i; i4--) {
                if (obj.equals(this.f2193c[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m498b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0462k) {
            C0462k c0462k = (C0462k) obj;
            if (size() != c0462k.size()) {
                return false;
            }
            for (int i = 0; i < this.f2194d; i++) {
                try {
                    K m491i = m491i(i);
                    V m488l = m488l(i);
                    Object obj2 = c0462k.get(m491i);
                    if (m488l == null) {
                        if (obj2 != null || !c0462k.containsKey(m491i)) {
                            return false;
                        }
                    } else if (!m488l.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2194d; i2++) {
                try {
                    K m491i2 = m491i(i2);
                    V m488l2 = m488l(i2);
                    Object obj3 = map.get(m491i2);
                    if (m488l2 == null) {
                        if (obj3 != null || !map.containsKey(m491i2)) {
                            return false;
                        }
                    } else if (!m488l2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m494f(Object obj) {
        return obj == null ? m493g() : m495e(obj, obj.hashCode());
    }

    /* renamed from: g */
    int m493g() {
        int i = this.f2194d;
        if (i == 0) {
            return -1;
        }
        int m498b = m498b(this.f2192b, i, 0);
        if (m498b >= 0 && this.f2193c[m498b << 1] != null) {
            int i2 = m498b + 1;
            while (i2 < i && this.f2192b[i2] == 0) {
                if (this.f2193c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m498b - 1; i3 >= 0 && this.f2192b[i3] == 0; i3--) {
                if (this.f2193c[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m498b;
    }

    public V get(Object obj) {
        int m494f = m494f(obj);
        if (m494f >= 0) {
            return (V) this.f2193c[(m494f << 1) + 1];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m492h(Object obj) {
        int i = this.f2194d * 2;
        Object[] objArr = this.f2193c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f2192b;
        Object[] objArr = this.f2193c;
        int i = this.f2194d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K m491i(int i) {
        return (K) this.f2193c[i << 1];
    }

    public boolean isEmpty() {
        return this.f2194d <= 0;
    }

    /* renamed from: j */
    public V m490j(int i) {
        Object[] objArr = this.f2193c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f2194d;
        int i4 = 0;
        if (i3 <= 1) {
            m496d(this.f2192b, objArr, i3);
            this.f2192b = C0449c.f2153a;
            this.f2193c = C0449c.f2155c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2192b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f2193c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f2193c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m499a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f2194d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2192b, 0, i);
                    System.arraycopy(objArr, 0, this.f2193c, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f2192b, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f2193c, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f2194d) {
            this.f2194d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: k */
    public V m489k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f2193c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: l */
    public V m488l(int i) {
        return (V) this.f2193c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int m495e;
        int i2 = this.f2194d;
        if (k == null) {
            m495e = m493g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m495e = m495e(k, hashCode);
        }
        if (m495e >= 0) {
            int i3 = (m495e << 1) + 1;
            Object[] objArr = this.f2193c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m495e ^ (-1);
        int[] iArr = this.f2192b;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f2193c;
            m499a(i5);
            if (i2 != this.f2194d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2192b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2193c, 0, objArr2.length);
            }
            m496d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f2192b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f2193c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f2194d - i4) << 1);
        }
        int i7 = this.f2194d;
        if (i2 == i7) {
            int[] iArr4 = this.f2192b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f2193c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f2194d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int m494f = m494f(obj);
        if (m494f >= 0) {
            return m490j(m494f);
        }
        return null;
    }

    public int size() {
        return this.f2194d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2194d * 28);
        sb.append('{');
        for (int i = 0; i < this.f2194d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m491i = m491i(i);
            if (m491i != this) {
                sb.append(m491i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m488l = m488l(i);
            if (m488l != this) {
                sb.append(m488l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
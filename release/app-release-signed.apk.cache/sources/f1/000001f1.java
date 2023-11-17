package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class k<K, V> {

    /* renamed from: e  reason: collision with root package name */
    static Object[] f1670e;

    /* renamed from: f  reason: collision with root package name */
    static int f1671f;

    /* renamed from: g  reason: collision with root package name */
    static Object[] f1672g;

    /* renamed from: h  reason: collision with root package name */
    static int f1673h;

    /* renamed from: b  reason: collision with root package name */
    int[] f1674b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f1675c;

    /* renamed from: d  reason: collision with root package name */
    int f1676d;

    public k() {
        this.f1674b = c.f1635a;
        this.f1675c = c.f1637c;
        this.f1676d = 0;
    }

    public k(int i2) {
        if (i2 == 0) {
            this.f1674b = c.f1635a;
            this.f1675c = c.f1637c;
        } else {
            a(i2);
        }
        this.f1676d = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (a.class) {
                Object[] objArr = f1672g;
                if (objArr != null) {
                    this.f1675c = objArr;
                    f1672g = (Object[]) objArr[0];
                    this.f1674b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1673h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (a.class) {
                Object[] objArr2 = f1670e;
                if (objArr2 != null) {
                    this.f1675c = objArr2;
                    f1670e = (Object[]) objArr2[0];
                    this.f1674b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1671f--;
                    return;
                }
            }
        }
        this.f1674b = new int[i2];
        this.f1675c = new Object[i2 << 1];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (f1673h < 10) {
                    objArr[0] = f1672g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1672g = objArr;
                    f1673h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (a.class) {
                if (f1671f < 10) {
                    objArr[0] = f1670e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1670e = objArr;
                    f1671f++;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.f1676d;
        int[] iArr = this.f1674b;
        if (iArr.length < i2) {
            Object[] objArr = this.f1675c;
            a(i2);
            if (this.f1676d > 0) {
                System.arraycopy(iArr, 0, this.f1674b, 0, i3);
                System.arraycopy(objArr, 0, this.f1675c, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.f1676d != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f1676d;
        if (i2 > 0) {
            int[] iArr = this.f1674b;
            Object[] objArr = this.f1675c;
            this.f1674b = c.f1635a;
            this.f1675c = c.f1637c;
            this.f1676d = 0;
            d(iArr, objArr, i2);
        }
        if (this.f1676d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i2) {
        int i3 = this.f1676d;
        if (i3 == 0) {
            return -1;
        }
        int b2 = b(this.f1674b, i3, i2);
        if (b2 >= 0 && !obj.equals(this.f1675c[b2 << 1])) {
            int i4 = b2 + 1;
            while (i4 < i3 && this.f1674b[i4] == i2) {
                if (obj.equals(this.f1675c[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = b2 - 1; i5 >= 0 && this.f1674b[i5] == i2; i5--) {
                if (obj.equals(this.f1675c[i5 << 1])) {
                    return i5;
                }
            }
            return i4 ^ (-1);
        }
        return b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (size() != kVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1676d; i2++) {
                try {
                    K i3 = i(i2);
                    V l2 = l(i2);
                    Object obj2 = kVar.get(i3);
                    if (l2 == null) {
                        if (obj2 != null || !kVar.containsKey(i3)) {
                            return false;
                        }
                    } else if (!l2.equals(obj2)) {
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
            for (int i4 = 0; i4 < this.f1676d; i4++) {
                try {
                    K i5 = i(i4);
                    V l3 = l(i4);
                    Object obj3 = map.get(i5);
                    if (l3 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!l3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i2 = this.f1676d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f1674b, i2, 0);
        if (b2 >= 0 && this.f1675c[b2 << 1] != null) {
            int i3 = b2 + 1;
            while (i3 < i2 && this.f1674b[i3] == 0) {
                if (this.f1675c[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = b2 - 1; i4 >= 0 && this.f1674b[i4] == 0; i4--) {
                if (this.f1675c[i4 << 1] == null) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return b2;
    }

    public V get(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return (V) this.f1675c[(f2 << 1) + 1];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i2 = this.f1676d * 2;
        Object[] objArr = this.f1675c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f1674b;
        Object[] objArr = this.f1675c;
        int i2 = this.f1676d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public K i(int i2) {
        return (K) this.f1675c[i2 << 1];
    }

    public boolean isEmpty() {
        return this.f1676d <= 0;
    }

    public V j(int i2) {
        Object[] objArr = this.f1675c;
        int i3 = i2 << 1;
        V v2 = (V) objArr[i3 + 1];
        int i4 = this.f1676d;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.f1674b, objArr, i4);
            this.f1674b = c.f1635a;
            this.f1675c = c.f1637c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f1674b;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f1675c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f1675c;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f1676d) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1674b, 0, i2);
                    System.arraycopy(objArr, 0, this.f1675c, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f1674b, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f1675c, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 == this.f1676d) {
            this.f1676d = i5;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1675c;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public V l(int i2) {
        return (V) this.f1675c[(i2 << 1) + 1];
    }

    public V put(K k2, V v2) {
        int i2;
        int e2;
        int i3 = this.f1676d;
        if (k2 == null) {
            e2 = g();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            e2 = e(k2, hashCode);
        }
        if (e2 >= 0) {
            int i4 = (e2 << 1) + 1;
            Object[] objArr = this.f1675c;
            V v3 = (V) objArr[i4];
            objArr[i4] = v2;
            return v3;
        }
        int i5 = e2 ^ (-1);
        int[] iArr = this.f1674b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f1675c;
            a(i6);
            if (i3 != this.f1676d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1674b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1675c, 0, objArr2.length);
            }
            d(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1674b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f1675c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f1676d - i5) << 1);
        }
        int i8 = this.f1676d;
        if (i3 == i8) {
            int[] iArr4 = this.f1674b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f1675c;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v2;
                this.f1676d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return j(f2);
        }
        return null;
    }

    public int size() {
        return this.f1676d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1676d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1676d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l2 = l(i2);
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
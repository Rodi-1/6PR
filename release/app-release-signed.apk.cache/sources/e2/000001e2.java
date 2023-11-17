package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f1624f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f1625g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    private static Object[] f1626h;

    /* renamed from: i  reason: collision with root package name */
    private static int f1627i;

    /* renamed from: j  reason: collision with root package name */
    private static Object[] f1628j;

    /* renamed from: k  reason: collision with root package name */
    private static int f1629k;

    /* renamed from: b  reason: collision with root package name */
    private int[] f1630b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1631c;

    /* renamed from: d  reason: collision with root package name */
    private int f1632d;

    /* renamed from: e  reason: collision with root package name */
    private h<E, E> f1633e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h<E, E> {
        a() {
        }

        @Override // n.h
        protected void a() {
            b.this.clear();
        }

        @Override // n.h
        protected Object b(int i2, int i3) {
            return b.this.f1631c[i2];
        }

        @Override // n.h
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // n.h
        protected int d() {
            return b.this.f1632d;
        }

        @Override // n.h
        protected int e(Object obj) {
            return b.this.g(obj);
        }

        @Override // n.h
        protected int f(Object obj) {
            return b.this.g(obj);
        }

        @Override // n.h
        protected void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // n.h
        protected void h(int i2) {
            b.this.j(i2);
        }

        @Override // n.h
        protected E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f1630b = f1624f;
            this.f1631c = f1625g;
        } else {
            c(i2);
        }
        this.f1632d = 0;
    }

    private void c(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1628j;
                if (objArr != null) {
                    this.f1631c = objArr;
                    f1628j = (Object[]) objArr[0];
                    this.f1630b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1629k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1626h;
                if (objArr2 != null) {
                    this.f1631c = objArr2;
                    f1626h = (Object[]) objArr2[0];
                    this.f1630b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1627i--;
                    return;
                }
            }
        }
        this.f1630b = new int[i2];
        this.f1631c = new Object[i2];
    }

    private static void e(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1629k < 10) {
                    objArr[0] = f1628j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1628j = objArr;
                    f1629k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1627i < 10) {
                    objArr[0] = f1626h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1626h = objArr;
                    f1627i++;
                }
            }
        }
    }

    private h<E, E> f() {
        if (this.f1633e == null) {
            this.f1633e = new a();
        }
        return this.f1633e;
    }

    private int h(Object obj, int i2) {
        int i3 = this.f1632d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f1630b, i3, i2);
        if (a2 >= 0 && !obj.equals(this.f1631c[a2])) {
            int i4 = a2 + 1;
            while (i4 < i3 && this.f1630b[i4] == i2) {
                if (obj.equals(this.f1631c[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f1630b[i5] == i2; i5--) {
                if (obj.equals(this.f1631c[i5])) {
                    return i5;
                }
            }
            return i4 ^ (-1);
        }
        return a2;
    }

    private int i() {
        int i2 = this.f1632d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f1630b, i2, 0);
        if (a2 >= 0 && this.f1631c[a2] != null) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.f1630b[i3] == 0) {
                if (this.f1631c[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f1630b[i4] == 0; i4--) {
                if (this.f1631c[i4] == null) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return a2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int h2;
        if (e2 == null) {
            h2 = i();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            h2 = h(e2, hashCode);
        }
        if (h2 >= 0) {
            return false;
        }
        int i3 = h2 ^ (-1);
        int i4 = this.f1632d;
        int[] iArr = this.f1630b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1631c;
            c(i5);
            int[] iArr2 = this.f1630b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1631c, 0, objArr.length);
            }
            e(iArr, objArr, this.f1632d);
        }
        int i6 = this.f1632d;
        if (i3 < i6) {
            int[] iArr3 = this.f1630b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1631c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1632d - i3);
        }
        this.f1630b[i3] = i2;
        this.f1631c[i3] = e2;
        this.f1632d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        d(this.f1632d + collection.size());
        boolean z = false;
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f1632d;
        if (i2 != 0) {
            e(this.f1630b, this.f1631c, i2);
            this.f1630b = f1624f;
            this.f1631c = f1625g;
            this.f1632d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i2) {
        int[] iArr = this.f1630b;
        if (iArr.length < i2) {
            Object[] objArr = this.f1631c;
            c(i2);
            int i3 = this.f1632d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f1630b, 0, i3);
                System.arraycopy(objArr, 0, this.f1631c, 0, this.f1632d);
            }
            e(iArr, objArr, this.f1632d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1632d; i2++) {
                try {
                    if (!set.contains(k(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int g(Object obj) {
        return obj == null ? i() : h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1630b;
        int i2 = this.f1632d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1632d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    public E j(int i2) {
        Object[] objArr = this.f1631c;
        E e2 = (E) objArr[i2];
        int i3 = this.f1632d;
        if (i3 <= 1) {
            e(this.f1630b, objArr, i3);
            this.f1630b = f1624f;
            this.f1631c = f1625g;
            this.f1632d = 0;
        } else {
            int[] iArr = this.f1630b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f1632d = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f1631c;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f1632d - i2);
                }
                this.f1631c[this.f1632d] = null;
            } else {
                c(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f1632d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1630b, 0, i2);
                    System.arraycopy(objArr, 0, this.f1631c, 0, i2);
                }
                int i6 = this.f1632d;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f1630b, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f1631c, i2, this.f1632d - i2);
                }
            }
        }
        return e2;
    }

    public E k(int i2) {
        return (E) this.f1631c[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int g2 = g(obj);
        if (g2 >= 0) {
            j(g2);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1632d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1631c[i2])) {
                j(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1632d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f1632d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1631c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1632d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1632d));
        }
        System.arraycopy(this.f1631c, 0, tArr, 0, this.f1632d);
        int length = tArr.length;
        int i2 = this.f1632d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1632d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1632d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
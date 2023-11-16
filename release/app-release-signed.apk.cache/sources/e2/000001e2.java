package p015n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C0447b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f2142f = new int[0];

    /* renamed from: g */
    private static final Object[] f2143g = new Object[0];

    /* renamed from: h */
    private static Object[] f2144h;

    /* renamed from: i */
    private static int f2145i;

    /* renamed from: j */
    private static Object[] f2146j;

    /* renamed from: k */
    private static int f2147k;

    /* renamed from: b */
    private int[] f2148b;

    /* renamed from: c */
    private Object[] f2149c;

    /* renamed from: d */
    private int f2150d;

    /* renamed from: e */
    private AbstractC0454h<E, E> f2151e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n.b$a */
    /* loaded from: classes.dex */
    public class C0448a extends AbstractC0454h<E, E> {
        C0448a() {
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: a */
        protected void mo521a() {
            C0447b.this.clear();
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: b */
        protected Object mo520b(int i, int i2) {
            return C0447b.this.f2149c[i];
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: c */
        protected Map<E, E> mo519c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: d */
        protected int mo518d() {
            return C0447b.this.f2150d;
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: e */
        protected int mo517e(Object obj) {
            return C0447b.this.m551g(obj);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: f */
        protected int mo516f(Object obj) {
            return C0447b.this.m551g(obj);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: g */
        protected void mo515g(E e, E e2) {
            C0447b.this.add(e);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: h */
        protected void mo514h(int i) {
            C0447b.this.m548j(i);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: i */
        protected E mo513i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0447b() {
        this(0);
    }

    public C0447b(int i) {
        if (i == 0) {
            this.f2148b = f2142f;
            this.f2149c = f2143g;
        } else {
            m555c(i);
        }
        this.f2150d = 0;
    }

    /* renamed from: c */
    private void m555c(int i) {
        if (i == 8) {
            synchronized (C0447b.class) {
                Object[] objArr = f2146j;
                if (objArr != null) {
                    this.f2149c = objArr;
                    f2146j = (Object[]) objArr[0];
                    this.f2148b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2147k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0447b.class) {
                Object[] objArr2 = f2144h;
                if (objArr2 != null) {
                    this.f2149c = objArr2;
                    f2144h = (Object[]) objArr2[0];
                    this.f2148b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2145i--;
                    return;
                }
            }
        }
        this.f2148b = new int[i];
        this.f2149c = new Object[i];
    }

    /* renamed from: e */
    private static void m553e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0447b.class) {
                if (f2147k < 10) {
                    objArr[0] = f2146j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2146j = objArr;
                    f2147k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0447b.class) {
                if (f2145i < 10) {
                    objArr[0] = f2144h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2144h = objArr;
                    f2145i++;
                }
            }
        }
    }

    /* renamed from: f */
    private AbstractC0454h<E, E> m552f() {
        if (this.f2151e == null) {
            this.f2151e = new C0448a();
        }
        return this.f2151e;
    }

    /* renamed from: h */
    private int m550h(Object obj, int i) {
        int i2 = this.f2150d;
        if (i2 == 0) {
            return -1;
        }
        int m546a = C0449c.m546a(this.f2148b, i2, i);
        if (m546a >= 0 && !obj.equals(this.f2149c[m546a])) {
            int i3 = m546a + 1;
            while (i3 < i2 && this.f2148b[i3] == i) {
                if (obj.equals(this.f2149c[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m546a - 1; i4 >= 0 && this.f2148b[i4] == i; i4--) {
                if (obj.equals(this.f2149c[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m546a;
    }

    /* renamed from: i */
    private int m549i() {
        int i = this.f2150d;
        if (i == 0) {
            return -1;
        }
        int m546a = C0449c.m546a(this.f2148b, i, 0);
        if (m546a >= 0 && this.f2149c[m546a] != null) {
            int i2 = m546a + 1;
            while (i2 < i && this.f2148b[i2] == 0) {
                if (this.f2149c[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m546a - 1; i3 >= 0 && this.f2148b[i3] == 0; i3--) {
                if (this.f2149c[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m546a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m550h;
        if (e == null) {
            m550h = m549i();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m550h = m550h(e, hashCode);
        }
        if (m550h >= 0) {
            return false;
        }
        int i2 = m550h ^ (-1);
        int i3 = this.f2150d;
        int[] iArr = this.f2148b;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f2149c;
            m555c(i4);
            int[] iArr2 = this.f2148b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2149c, 0, objArr.length);
            }
            m553e(iArr, objArr, this.f2150d);
        }
        int i5 = this.f2150d;
        if (i2 < i5) {
            int[] iArr3 = this.f2148b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f2149c;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f2150d - i2);
        }
        this.f2148b[i2] = i;
        this.f2149c[i2] = e;
        this.f2150d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m554d(this.f2150d + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f2150d;
        if (i != 0) {
            m553e(this.f2148b, this.f2149c, i);
            this.f2148b = f2142f;
            this.f2149c = f2143g;
            this.f2150d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m551g(obj) >= 0;
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

    /* renamed from: d */
    public void m554d(int i) {
        int[] iArr = this.f2148b;
        if (iArr.length < i) {
            Object[] objArr = this.f2149c;
            m555c(i);
            int i2 = this.f2150d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2148b, 0, i2);
                System.arraycopy(objArr, 0, this.f2149c, 0, this.f2150d);
            }
            m553e(iArr, objArr, this.f2150d);
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
            for (int i = 0; i < this.f2150d; i++) {
                try {
                    if (!set.contains(m547k(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int m551g(Object obj) {
        return obj == null ? m549i() : m550h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2148b;
        int i = this.f2150d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2150d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m552f().m509m().iterator();
    }

    /* renamed from: j */
    public E m548j(int i) {
        Object[] objArr = this.f2149c;
        E e = (E) objArr[i];
        int i2 = this.f2150d;
        if (i2 <= 1) {
            m553e(this.f2148b, objArr, i2);
            this.f2148b = f2142f;
            this.f2149c = f2143g;
            this.f2150d = 0;
        } else {
            int[] iArr = this.f2148b;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f2150d = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f2149c;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f2150d - i);
                }
                this.f2149c[this.f2150d] = null;
            } else {
                m555c(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f2150d--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2148b, 0, i);
                    System.arraycopy(objArr, 0, this.f2149c, 0, i);
                }
                int i5 = this.f2150d;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f2148b, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f2149c, i, this.f2150d - i);
                }
            }
        }
        return e;
    }

    /* renamed from: k */
    public E m547k(int i) {
        return (E) this.f2149c[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int m551g = m551g(obj);
        if (m551g >= 0) {
            m548j(m551g);
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
        for (int i = this.f2150d - 1; i >= 0; i--) {
            if (!collection.contains(this.f2149c[i])) {
                m548j(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2150d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f2150d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2149c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2150d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2150d));
        }
        System.arraycopy(this.f2149c, 0, tArr, 0, this.f2150d);
        int length = tArr.length;
        int i = this.f2150d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2150d * 14);
        sb.append('{');
        for (int i = 0; i < this.f2150d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m547k = m547k(i);
            if (m547k != this) {
                sb.append(m547k);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
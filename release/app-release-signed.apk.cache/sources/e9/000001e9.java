package p015n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n.h */
/* loaded from: classes.dex */
public abstract class AbstractC0454h<K, V> {

    /* renamed from: a */
    AbstractC0454h<K, V>.C0456b f2171a;

    /* renamed from: b */
    AbstractC0454h<K, V>.C0457c f2172b;

    /* renamed from: c */
    AbstractC0454h<K, V>.C0459e f2173c;

    /* renamed from: n.h$a */
    /* loaded from: classes.dex */
    final class C0455a<T> implements Iterator<T> {

        /* renamed from: b */
        final int f2174b;

        /* renamed from: c */
        int f2175c;

        /* renamed from: d */
        int f2176d;

        /* renamed from: e */
        boolean f2177e = false;

        C0455a(int i) {
            this.f2174b = i;
            this.f2175c = AbstractC0454h.this.mo518d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2176d < this.f2175c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0454h.this.mo520b(this.f2176d, this.f2174b);
                this.f2176d++;
                this.f2177e = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2177e) {
                throw new IllegalStateException();
            }
            int i = this.f2176d - 1;
            this.f2176d = i;
            this.f2175c--;
            this.f2177e = false;
            AbstractC0454h.this.mo514h(i);
        }
    }

    /* renamed from: n.h$b */
    /* loaded from: classes.dex */
    final class C0456b implements Set<Map.Entry<K, V>> {
        C0456b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo518d = AbstractC0454h.this.mo518d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0454h.this.mo515g(entry.getKey(), entry.getValue());
            }
            return mo518d != AbstractC0454h.this.mo518d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0454h.this.mo521a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int mo517e = AbstractC0454h.this.mo517e(entry.getKey());
                if (mo517e < 0) {
                    return false;
                }
                return C0449c.m544c(AbstractC0454h.this.mo520b(mo517e, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0454h.m511k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo518d = AbstractC0454h.this.mo518d() - 1; mo518d >= 0; mo518d--) {
                Object mo520b = AbstractC0454h.this.mo520b(mo518d, 0);
                Object mo520b2 = AbstractC0454h.this.mo520b(mo518d, 1);
                i += (mo520b == null ? 0 : mo520b.hashCode()) ^ (mo520b2 == null ? 0 : mo520b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0454h.this.mo518d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0458d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0454h.this.mo518d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n.h$c */
    /* loaded from: classes.dex */
    final class C0457c implements Set<K> {
        C0457c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0454h.this.mo521a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0454h.this.mo517e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0454h.m512j(AbstractC0454h.this.mo519c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0454h.m511k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo518d = AbstractC0454h.this.mo518d() - 1; mo518d >= 0; mo518d--) {
                Object mo520b = AbstractC0454h.this.mo520b(mo518d, 0);
                i += mo520b == null ? 0 : mo520b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0454h.this.mo518d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0455a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo517e = AbstractC0454h.this.mo517e(obj);
            if (mo517e >= 0) {
                AbstractC0454h.this.mo514h(mo517e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0454h.m507o(AbstractC0454h.this.mo519c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0454h.m506p(AbstractC0454h.this.mo519c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0454h.this.mo518d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0454h.this.m505q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0454h.this.m504r(tArr, 0);
        }
    }

    /* renamed from: n.h$d */
    /* loaded from: classes.dex */
    final class C0458d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        int f2181b;

        /* renamed from: d */
        boolean f2183d = false;

        /* renamed from: c */
        int f2182c = -1;

        C0458d() {
            this.f2181b = AbstractC0454h.this.mo518d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f2182c++;
                this.f2183d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f2183d) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C0449c.m544c(entry.getKey(), AbstractC0454h.this.mo520b(this.f2182c, 0)) && C0449c.m544c(entry.getValue(), AbstractC0454h.this.mo520b(this.f2182c, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f2183d) {
                return (K) AbstractC0454h.this.mo520b(this.f2182c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f2183d) {
                return (V) AbstractC0454h.this.mo520b(this.f2182c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2182c < this.f2181b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f2183d) {
                Object mo520b = AbstractC0454h.this.mo520b(this.f2182c, 0);
                Object mo520b2 = AbstractC0454h.this.mo520b(this.f2182c, 1);
                return (mo520b == null ? 0 : mo520b.hashCode()) ^ (mo520b2 != null ? mo520b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2183d) {
                throw new IllegalStateException();
            }
            AbstractC0454h.this.mo514h(this.f2182c);
            this.f2182c--;
            this.f2181b--;
            this.f2183d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f2183d) {
                return (V) AbstractC0454h.this.mo513i(this.f2182c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: n.h$e */
    /* loaded from: classes.dex */
    final class C0459e implements Collection<V> {
        C0459e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0454h.this.mo521a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0454h.this.mo516f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0454h.this.mo518d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0455a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo516f = AbstractC0454h.this.mo516f(obj);
            if (mo516f >= 0) {
                AbstractC0454h.this.mo514h(mo516f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo518d = AbstractC0454h.this.mo518d();
            int i = 0;
            boolean z = false;
            while (i < mo518d) {
                if (collection.contains(AbstractC0454h.this.mo520b(i, 1))) {
                    AbstractC0454h.this.mo514h(i);
                    i--;
                    mo518d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo518d = AbstractC0454h.this.mo518d();
            int i = 0;
            boolean z = false;
            while (i < mo518d) {
                if (!collection.contains(AbstractC0454h.this.mo520b(i, 1))) {
                    AbstractC0454h.this.mo514h(i);
                    i--;
                    mo518d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0454h.this.mo518d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0454h.this.m505q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0454h.this.m504r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m512j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m511k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m507o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m506p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo521a();

    /* renamed from: b */
    protected abstract Object mo520b(int i, int i2);

    /* renamed from: c */
    protected abstract Map<K, V> mo519c();

    /* renamed from: d */
    protected abstract int mo518d();

    /* renamed from: e */
    protected abstract int mo517e(Object obj);

    /* renamed from: f */
    protected abstract int mo516f(Object obj);

    /* renamed from: g */
    protected abstract void mo515g(K k, V v);

    /* renamed from: h */
    protected abstract void mo514h(int i);

    /* renamed from: i */
    protected abstract V mo513i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m510l() {
        if (this.f2171a == null) {
            this.f2171a = new C0456b();
        }
        return this.f2171a;
    }

    /* renamed from: m */
    public Set<K> m509m() {
        if (this.f2172b == null) {
            this.f2172b = new C0457c();
        }
        return this.f2172b;
    }

    /* renamed from: n */
    public Collection<V> m508n() {
        if (this.f2173c == null) {
            this.f2173c = new C0459e();
        }
        return this.f2173c;
    }

    /* renamed from: q */
    public Object[] m505q(int i) {
        int mo518d = mo518d();
        Object[] objArr = new Object[mo518d];
        for (int i2 = 0; i2 < mo518d; i2++) {
            objArr[i2] = mo520b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m504r(T[] tArr, int i) {
        int mo518d = mo518d();
        if (tArr.length < mo518d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo518d));
        }
        for (int i2 = 0; i2 < mo518d; i2++) {
            tArr[i2] = mo520b(i2, i);
        }
        if (tArr.length > mo518d) {
            tArr[mo518d] = null;
        }
        return tArr;
    }
}
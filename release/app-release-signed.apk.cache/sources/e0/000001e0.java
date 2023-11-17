package n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends k<K, V> implements Map<K, V> {

    /* renamed from: i  reason: collision with root package name */
    h<K, V> f1622i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0019a extends h<K, V> {
        C0019a() {
        }

        @Override // n.h
        protected void a() {
            a.this.clear();
        }

        @Override // n.h
        protected Object b(int i2, int i3) {
            return a.this.f1675c[(i2 << 1) + i3];
        }

        @Override // n.h
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // n.h
        protected int d() {
            return a.this.f1676d;
        }

        @Override // n.h
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // n.h
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // n.h
        protected void g(K k2, V v2) {
            a.this.put(k2, v2);
        }

        @Override // n.h
        protected void h(int i2) {
            a.this.j(i2);
        }

        @Override // n.h
        protected V i(int i2, V v2) {
            return a.this.k(i2, v2);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    private h<K, V> m() {
        if (this.f1622i == null) {
            this.f1622i = new C0019a();
        }
        return this.f1622i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f1676d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
package p015n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: n.a */
/* loaded from: classes.dex */
public class C0445a<K, V> extends C0462k<K, V> implements Map<K, V> {

    /* renamed from: i */
    AbstractC0454h<K, V> f2140i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n.a$a */
    /* loaded from: classes.dex */
    public class C0446a extends AbstractC0454h<K, V> {
        C0446a() {
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: a */
        protected void mo521a() {
            C0445a.this.clear();
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: b */
        protected Object mo520b(int i, int i2) {
            return C0445a.this.f2193c[(i << 1) + i2];
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: c */
        protected Map<K, V> mo519c() {
            return C0445a.this;
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: d */
        protected int mo518d() {
            return C0445a.this.f2194d;
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: e */
        protected int mo517e(Object obj) {
            return C0445a.this.m494f(obj);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: f */
        protected int mo516f(Object obj) {
            return C0445a.this.m492h(obj);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: g */
        protected void mo515g(K k, V v) {
            C0445a.this.put(k, v);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: h */
        protected void mo514h(int i) {
            C0445a.this.m490j(i);
        }

        @Override // p015n.AbstractC0454h
        /* renamed from: i */
        protected V mo513i(int i, V v) {
            return C0445a.this.m489k(i, v);
        }
    }

    public C0445a() {
    }

    public C0445a(int i) {
        super(i);
    }

    /* renamed from: m */
    private AbstractC0454h<K, V> m559m() {
        if (this.f2140i == null) {
            this.f2140i = new C0446a();
        }
        return this.f2140i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m559m().m510l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m559m().m509m();
    }

    /* renamed from: n */
    public boolean m558n(Collection<?> collection) {
        return AbstractC0454h.m506p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m497c(this.f2194d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m559m().m508n();
    }
}
package b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private d<K, V> f1280b;

    /* renamed from: c  reason: collision with root package name */
    private d<K, V> f1281c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHashMap<g<K, V>, Boolean> f1282d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f1283e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0012b<K, V> extends f<K, V> {
        C0012b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // b.b.f
        d<K, V> b(d<K, V> dVar) {
            return dVar.f1287e;
        }

        @Override // b.b.f
        d<K, V> c(d<K, V> dVar) {
            return dVar.f1286d;
        }
    }

    /* loaded from: classes.dex */
    private static class c<K, V> extends f<K, V> {
        c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // b.b.f
        d<K, V> b(d<K, V> dVar) {
            return dVar.f1286d;
        }

        @Override // b.b.f
        d<K, V> c(d<K, V> dVar) {
            return dVar.f1287e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final K f1284b;

        /* renamed from: c  reason: collision with root package name */
        final V f1285c;

        /* renamed from: d  reason: collision with root package name */
        d<K, V> f1286d;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f1287e;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f1284b.equals(dVar.f1284b) && this.f1285c.equals(dVar.f1285c);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1284b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1285c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1284b + "=" + this.f1285c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private d<K, V> f1288b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1289c;

        private e() {
            this.f1289c = true;
        }

        @Override // b.b.g
        public void a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f1288b;
            if (dVar == dVar2) {
                d<K, V> dVar3 = dVar2.f1287e;
                this.f1288b = dVar3;
                this.f1289c = dVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            d<K, V> dVar;
            if (this.f1289c) {
                this.f1289c = false;
                dVar = b.this.f1280b;
            } else {
                d<K, V> dVar2 = this.f1288b;
                dVar = dVar2 != null ? dVar2.f1286d : null;
            }
            this.f1288b = dVar;
            return this.f1288b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1289c) {
                return b.this.f1280b != null;
            }
            d<K, V> dVar = this.f1288b;
            return (dVar == null || dVar.f1286d == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f1291b;

        /* renamed from: c  reason: collision with root package name */
        d<K, V> f1292c;

        f(d<K, V> dVar, d<K, V> dVar2) {
            this.f1291b = dVar2;
            this.f1292c = dVar;
        }

        private d<K, V> e() {
            d<K, V> dVar = this.f1292c;
            d<K, V> dVar2 = this.f1291b;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return c(dVar);
        }

        @Override // b.b.g
        public void a(d<K, V> dVar) {
            if (this.f1291b == dVar && dVar == this.f1292c) {
                this.f1292c = null;
                this.f1291b = null;
            }
            d<K, V> dVar2 = this.f1291b;
            if (dVar2 == dVar) {
                this.f1291b = b(dVar2);
            }
            if (this.f1292c == dVar) {
                this.f1292c = e();
            }
        }

        abstract d<K, V> b(d<K, V> dVar);

        abstract d<K, V> c(d<K, V> dVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            d<K, V> dVar = this.f1292c;
            this.f1292c = e();
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1292c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g<K, V> {
        void a(d<K, V> dVar);
    }

    public Iterator<Map.Entry<K, V>> b() {
        c cVar = new c(this.f1281c, this.f1280b);
        this.f1282d.put(cVar, Boolean.FALSE);
        return cVar;
    }

    public Map.Entry<K, V> c() {
        return this.f1280b;
    }

    protected d<K, V> d(K k2) {
        d<K, V> dVar = this.f1280b;
        while (dVar != null && !dVar.f1284b.equals(k2)) {
            dVar = dVar.f1286d;
        }
        return dVar;
    }

    public b<K, V>.e e() {
        b<K, V>.e eVar = new e();
        this.f1282d.put(eVar, Boolean.FALSE);
        return eVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public Map.Entry<K, V> f() {
        return this.f1281c;
    }

    public V g(K k2) {
        d<K, V> d2 = d(k2);
        if (d2 == null) {
            return null;
        }
        this.f1283e--;
        if (!this.f1282d.isEmpty()) {
            for (g<K, V> gVar : this.f1282d.keySet()) {
                gVar.a(d2);
            }
        }
        d<K, V> dVar = d2.f1287e;
        d<K, V> dVar2 = d2.f1286d;
        if (dVar != null) {
            dVar.f1286d = dVar2;
        } else {
            this.f1280b = dVar2;
        }
        d<K, V> dVar3 = d2.f1286d;
        if (dVar3 != null) {
            dVar3.f1287e = dVar;
        } else {
            this.f1281c = dVar;
        }
        d2.f1286d = null;
        d2.f1287e = null;
        return d2.f1285c;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0012b c0012b = new C0012b(this.f1280b, this.f1281c);
        this.f1282d.put(c0012b, Boolean.FALSE);
        return c0012b;
    }

    public int size() {
        return this.f1283e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
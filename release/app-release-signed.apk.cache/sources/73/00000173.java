package p003b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: b.b */
/* loaded from: classes.dex */
public class C0337b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    private C0341d<K, V> f1592b;

    /* renamed from: c */
    private C0341d<K, V> f1593c;

    /* renamed from: d */
    private WeakHashMap<InterfaceC0344g<K, V>, Boolean> f1594d = new WeakHashMap<>();

    /* renamed from: e */
    private int f1595e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.b$b */
    /* loaded from: classes.dex */
    public static class C0339b<K, V> extends AbstractC0343f<K, V> {
        C0339b(C0341d<K, V> c0341d, C0341d<K, V> c0341d2) {
            super(c0341d, c0341d2);
        }

        @Override // p003b.C0337b.AbstractC0343f
        /* renamed from: b */
        C0341d<K, V> mo1006b(C0341d<K, V> c0341d) {
            return c0341d.f1599e;
        }

        @Override // p003b.C0337b.AbstractC0343f
        /* renamed from: c */
        C0341d<K, V> mo1005c(C0341d<K, V> c0341d) {
            return c0341d.f1598d;
        }
    }

    /* renamed from: b.b$c */
    /* loaded from: classes.dex */
    private static class C0340c<K, V> extends AbstractC0343f<K, V> {
        C0340c(C0341d<K, V> c0341d, C0341d<K, V> c0341d2) {
            super(c0341d, c0341d2);
        }

        @Override // p003b.C0337b.AbstractC0343f
        /* renamed from: b */
        C0341d<K, V> mo1006b(C0341d<K, V> c0341d) {
            return c0341d.f1598d;
        }

        @Override // p003b.C0337b.AbstractC0343f
        /* renamed from: c */
        C0341d<K, V> mo1005c(C0341d<K, V> c0341d) {
            return c0341d.f1599e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.b$d */
    /* loaded from: classes.dex */
    public static class C0341d<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f1596b;

        /* renamed from: c */
        final V f1597c;

        /* renamed from: d */
        C0341d<K, V> f1598d;

        /* renamed from: e */
        C0341d<K, V> f1599e;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0341d) {
                C0341d c0341d = (C0341d) obj;
                return this.f1596b.equals(c0341d.f1596b) && this.f1597c.equals(c0341d.f1597c);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1596b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1597c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1596b + "=" + this.f1597c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.b$e */
    /* loaded from: classes.dex */
    public class C0342e implements Iterator<Map.Entry<K, V>>, InterfaceC0344g<K, V> {

        /* renamed from: b */
        private C0341d<K, V> f1600b;

        /* renamed from: c */
        private boolean f1601c;

        private C0342e() {
            this.f1601c = true;
        }

        @Override // p003b.C0337b.InterfaceC0344g
        /* renamed from: a */
        public void mo1002a(C0341d<K, V> c0341d) {
            C0341d<K, V> c0341d2 = this.f1600b;
            if (c0341d == c0341d2) {
                C0341d<K, V> c0341d3 = c0341d2.f1599e;
                this.f1600b = c0341d3;
                this.f1601c = c0341d3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C0341d<K, V> c0341d;
            if (this.f1601c) {
                this.f1601c = false;
                c0341d = C0337b.this.f1592b;
            } else {
                C0341d<K, V> c0341d2 = this.f1600b;
                c0341d = c0341d2 != null ? c0341d2.f1598d : null;
            }
            this.f1600b = c0341d;
            return this.f1600b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1601c) {
                return C0337b.this.f1592b != null;
            }
            C0341d<K, V> c0341d = this.f1600b;
            return (c0341d == null || c0341d.f1598d == null) ? false : true;
        }
    }

    /* renamed from: b.b$f */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0343f<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC0344g<K, V> {

        /* renamed from: b */
        C0341d<K, V> f1603b;

        /* renamed from: c */
        C0341d<K, V> f1604c;

        AbstractC0343f(C0341d<K, V> c0341d, C0341d<K, V> c0341d2) {
            this.f1603b = c0341d2;
            this.f1604c = c0341d;
        }

        /* renamed from: e */
        private C0341d<K, V> m1003e() {
            C0341d<K, V> c0341d = this.f1604c;
            C0341d<K, V> c0341d2 = this.f1603b;
            if (c0341d == c0341d2 || c0341d2 == null) {
                return null;
            }
            return mo1005c(c0341d);
        }

        @Override // p003b.C0337b.InterfaceC0344g
        /* renamed from: a */
        public void mo1002a(C0341d<K, V> c0341d) {
            if (this.f1603b == c0341d && c0341d == this.f1604c) {
                this.f1604c = null;
                this.f1603b = null;
            }
            C0341d<K, V> c0341d2 = this.f1603b;
            if (c0341d2 == c0341d) {
                this.f1603b = mo1006b(c0341d2);
            }
            if (this.f1604c == c0341d) {
                this.f1604c = m1003e();
            }
        }

        /* renamed from: b */
        abstract C0341d<K, V> mo1006b(C0341d<K, V> c0341d);

        /* renamed from: c */
        abstract C0341d<K, V> mo1005c(C0341d<K, V> c0341d);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C0341d<K, V> c0341d = this.f1604c;
            this.f1604c = m1003e();
            return c0341d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1604c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.b$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0344g<K, V> {
        /* renamed from: a */
        void mo1002a(C0341d<K, V> c0341d);
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> m1013b() {
        C0340c c0340c = new C0340c(this.f1593c, this.f1592b);
        this.f1594d.put(c0340c, Boolean.FALSE);
        return c0340c;
    }

    /* renamed from: c */
    public Map.Entry<K, V> m1012c() {
        return this.f1592b;
    }

    /* renamed from: d */
    protected C0341d<K, V> mo1011d(K k) {
        C0341d<K, V> c0341d = this.f1592b;
        while (c0341d != null && !c0341d.f1596b.equals(k)) {
            c0341d = c0341d.f1598d;
        }
        return c0341d;
    }

    /* renamed from: e */
    public C0337b<K, V>.C0342e m1010e() {
        C0337b<K, V>.C0342e c0342e = new C0342e();
        this.f1594d.put(c0342e, Boolean.FALSE);
        return c0342e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0337b) {
            C0337b c0337b = (C0337b) obj;
            if (size() != c0337b.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = c0337b.iterator();
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

    /* renamed from: f */
    public Map.Entry<K, V> m1009f() {
        return this.f1593c;
    }

    /* renamed from: g */
    public V mo1008g(K k) {
        C0341d<K, V> mo1011d = mo1011d(k);
        if (mo1011d == null) {
            return null;
        }
        this.f1595e--;
        if (!this.f1594d.isEmpty()) {
            for (InterfaceC0344g<K, V> interfaceC0344g : this.f1594d.keySet()) {
                interfaceC0344g.mo1002a(mo1011d);
            }
        }
        C0341d<K, V> c0341d = mo1011d.f1599e;
        C0341d<K, V> c0341d2 = mo1011d.f1598d;
        if (c0341d != null) {
            c0341d.f1598d = c0341d2;
        } else {
            this.f1592b = c0341d2;
        }
        C0341d<K, V> c0341d3 = mo1011d.f1598d;
        if (c0341d3 != null) {
            c0341d3.f1599e = c0341d;
        } else {
            this.f1593c = c0341d;
        }
        mo1011d.f1598d = null;
        mo1011d.f1599e = null;
        return mo1011d.f1597c;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0339b c0339b = new C0339b(this.f1592b, this.f1593c);
        this.f1594d.put(c0339b, Boolean.FALSE);
        return c0339b;
    }

    public int size() {
        return this.f1595e;
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
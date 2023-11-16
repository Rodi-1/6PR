package p003b;

import java.util.HashMap;
import p003b.C0337b;

/* renamed from: b.a */
/* loaded from: classes.dex */
public class C0336a<K, V> extends C0337b<K, V> {

    /* renamed from: f */
    private HashMap<K, C0337b.C0341d<K, V>> f1591f = new HashMap<>();

    public boolean contains(K k) {
        return this.f1591f.containsKey(k);
    }

    @Override // p003b.C0337b
    /* renamed from: d */
    protected C0337b.C0341d<K, V> mo1011d(K k) {
        return this.f1591f.get(k);
    }

    @Override // p003b.C0337b
    /* renamed from: g */
    public V mo1008g(K k) {
        V v = (V) super.mo1008g(k);
        this.f1591f.remove(k);
        return v;
    }
}
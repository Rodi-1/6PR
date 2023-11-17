package b;

import b.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private HashMap<K, b.d<K, V>> f1279f = new HashMap<>();

    public boolean contains(K k2) {
        return this.f1279f.containsKey(k2);
    }

    @Override // b.b
    protected b.d<K, V> d(K k2) {
        return this.f1279f.get(k2);
    }

    @Override // b.b
    public V g(K k2) {
        V v2 = (V) super.g(k2);
        this.f1279f.remove(k2);
        return v2;
    }
}
package android.arch.lifecycle;

import android.arch.lifecycle.c;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f8a;

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void g(e eVar, c.a aVar) {
        h hVar = new h();
        for (b bVar : this.f8a) {
            bVar.a(eVar, aVar, false, hVar);
        }
        for (b bVar2 : this.f8a) {
            bVar2.a(eVar, aVar, true, hVar);
        }
    }
}
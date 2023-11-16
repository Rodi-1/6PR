package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0009c;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final InterfaceC0008b[] f8a;

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: g */
    public void mo2383g(InterfaceC0013e interfaceC0013e, AbstractC0009c.EnumC0010a enumC0010a) {
        C0018h c0018h = new C0018h();
        for (InterfaceC0008b interfaceC0008b : this.f8a) {
            interfaceC0008b.m2381a(interfaceC0013e, enumC0010a, false, c0018h);
        }
        for (InterfaceC0008b interfaceC0008b2 : this.f8a) {
            interfaceC0008b2.m2381a(interfaceC0013e, enumC0010a, true, c0018h);
        }
    }
}
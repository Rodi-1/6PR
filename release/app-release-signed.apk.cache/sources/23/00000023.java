package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.n */
/* loaded from: classes.dex */
public class C0026n {

    /* renamed from: a */
    private final HashMap<String, AbstractC0023l> f48a = new HashMap<>();

    /* renamed from: a */
    public final void m2352a() {
        for (AbstractC0023l abstractC0023l : this.f48a.values()) {
            abstractC0023l.mo2238a();
        }
        this.f48a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC0023l m2351b(String str) {
        return this.f48a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m2350c(String str, AbstractC0023l abstractC0023l) {
        AbstractC0023l abstractC0023l2 = this.f48a.get(str);
        if (abstractC0023l2 != null) {
            abstractC0023l2.mo2238a();
        }
        this.f48a.put(str, abstractC0023l);
    }
}
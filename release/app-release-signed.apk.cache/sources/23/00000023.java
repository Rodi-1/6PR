package android.arch.lifecycle;

import java.util.HashMap;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, l> f48a = new HashMap<>();

    public final void a() {
        for (l lVar : this.f48a.values()) {
            lVar.a();
        }
        this.f48a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l b(String str) {
        return this.f48a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, l lVar) {
        l lVar2 = this.f48a.get(str);
        if (lVar2 != null) {
            lVar2.a();
        }
        this.f48a.put(str, lVar);
    }
}
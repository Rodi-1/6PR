package f;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    HashSet<o> f1495a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    int f1496b = 0;

    public void a(o oVar) {
        this.f1495a.add(oVar);
    }

    public void b() {
        this.f1496b = 1;
        Iterator<o> it = this.f1495a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void c() {
        this.f1496b = 0;
        Iterator<o> it = this.f1495a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public boolean d() {
        return this.f1496b == 1;
    }

    public void e() {
        this.f1496b = 0;
        this.f1495a.clear();
    }

    public void f() {
    }
}
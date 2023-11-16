package p007f;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: f.o */
/* loaded from: classes.dex */
public class C0382o {

    /* renamed from: a */
    HashSet<C0382o> f2007a = new HashSet<>(2);

    /* renamed from: b */
    int f2008b = 0;

    /* renamed from: a */
    public void m754a(C0382o c0382o) {
        this.f2007a.add(c0382o);
    }

    /* renamed from: b */
    public void m753b() {
        this.f2008b = 1;
        Iterator<C0382o> it = this.f2007a.iterator();
        while (it.hasNext()) {
            it.next().mo749f();
        }
    }

    /* renamed from: c */
    public void m752c() {
        this.f2008b = 0;
        Iterator<C0382o> it = this.f2007a.iterator();
        while (it.hasNext()) {
            it.next().m752c();
        }
    }

    /* renamed from: d */
    public boolean m751d() {
        return this.f2008b == 1;
    }

    /* renamed from: e */
    public void mo750e() {
        this.f2008b = 0;
        this.f2007a.clear();
    }

    /* renamed from: f */
    public void mo749f() {
    }
}
package f;

import f.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private int f1497a;

    /* renamed from: b  reason: collision with root package name */
    private int f1498b;

    /* renamed from: c  reason: collision with root package name */
    private int f1499c;

    /* renamed from: d  reason: collision with root package name */
    private int f1500d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a> f1501e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private e f1502a;

        /* renamed from: b  reason: collision with root package name */
        private e f1503b;

        /* renamed from: c  reason: collision with root package name */
        private int f1504c;

        /* renamed from: d  reason: collision with root package name */
        private e.c f1505d;

        /* renamed from: e  reason: collision with root package name */
        private int f1506e;

        public a(e eVar) {
            this.f1502a = eVar;
            this.f1503b = eVar.i();
            this.f1504c = eVar.d();
            this.f1505d = eVar.h();
            this.f1506e = eVar.c();
        }

        public void a(f fVar) {
            fVar.h(this.f1502a.j()).b(this.f1503b, this.f1504c, this.f1505d, this.f1506e);
        }

        public void b(f fVar) {
            int i2;
            e h2 = fVar.h(this.f1502a.j());
            this.f1502a = h2;
            if (h2 != null) {
                this.f1503b = h2.i();
                this.f1504c = this.f1502a.d();
                this.f1505d = this.f1502a.h();
                i2 = this.f1502a.c();
            } else {
                this.f1503b = null;
                i2 = 0;
                this.f1504c = 0;
                this.f1505d = e.c.STRONG;
            }
            this.f1506e = i2;
        }
    }

    public p(f fVar) {
        this.f1497a = fVar.G();
        this.f1498b = fVar.H();
        this.f1499c = fVar.D();
        this.f1500d = fVar.r();
        ArrayList<e> i2 = fVar.i();
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f1501e.add(new a(i2.get(i3)));
        }
    }

    public void a(f fVar) {
        fVar.C0(this.f1497a);
        fVar.D0(this.f1498b);
        fVar.y0(this.f1499c);
        fVar.b0(this.f1500d);
        int size = this.f1501e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1501e.get(i2).a(fVar);
        }
    }

    public void b(f fVar) {
        this.f1497a = fVar.G();
        this.f1498b = fVar.H();
        this.f1499c = fVar.D();
        this.f1500d = fVar.r();
        int size = this.f1501e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1501e.get(i2).b(fVar);
        }
    }
}
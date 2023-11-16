package p007f;

import java.util.ArrayList;
import p007f.C0365e;

/* renamed from: f.p */
/* loaded from: classes.dex */
public class C0383p {

    /* renamed from: a */
    private int f2009a;

    /* renamed from: b */
    private int f2010b;

    /* renamed from: c */
    private int f2011c;

    /* renamed from: d */
    private int f2012d;

    /* renamed from: e */
    private ArrayList<C0384a> f2013e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.p$a */
    /* loaded from: classes.dex */
    public static class C0384a {

        /* renamed from: a */
        private C0365e f2014a;

        /* renamed from: b */
        private C0365e f2015b;

        /* renamed from: c */
        private int f2016c;

        /* renamed from: d */
        private C0365e.EnumC0368c f2017d;

        /* renamed from: e */
        private int f2018e;

        public C0384a(C0365e c0365e) {
            this.f2014a = c0365e;
            this.f2015b = c0365e.m893i();
            this.f2016c = c0365e.m898d();
            this.f2017d = c0365e.m894h();
            this.f2018e = c0365e.m899c();
        }

        /* renamed from: a */
        public void m746a(C0370f c0370f) {
            c0370f.mo776h(this.f2014a.m892j()).m900b(this.f2015b, this.f2016c, this.f2017d, this.f2018e);
        }

        /* renamed from: b */
        public void m745b(C0370f c0370f) {
            int i;
            C0365e mo776h = c0370f.mo776h(this.f2014a.m892j());
            this.f2014a = mo776h;
            if (mo776h != null) {
                this.f2015b = mo776h.m893i();
                this.f2016c = this.f2014a.m898d();
                this.f2017d = this.f2014a.m894h();
                i = this.f2014a.m899c();
            } else {
                this.f2015b = null;
                i = 0;
                this.f2016c = 0;
                this.f2017d = C0365e.EnumC0368c.STRONG;
            }
            this.f2018e = i;
        }
    }

    public C0383p(C0370f c0370f) {
        this.f2009a = c0370f.m876G();
        this.f2010b = c0370f.m875H();
        this.f2011c = c0370f.m881D();
        this.f2012d = c0370f.m829r();
        ArrayList<C0365e> mo775i = c0370f.mo775i();
        int size = mo775i.size();
        for (int i = 0; i < size; i++) {
            this.f2013e.add(new C0384a(mo775i.get(i)));
        }
    }

    /* renamed from: a */
    public void m748a(C0370f c0370f) {
        c0370f.m882C0(this.f2009a);
        c0370f.m880D0(this.f2010b);
        c0370f.m814y0(this.f2011c);
        c0370f.m855b0(this.f2012d);
        int size = this.f2013e.size();
        for (int i = 0; i < size; i++) {
            this.f2013e.get(i).m746a(c0370f);
        }
    }

    /* renamed from: b */
    public void m747b(C0370f c0370f) {
        this.f2009a = c0370f.m876G();
        this.f2010b = c0370f.m875H();
        this.f2011c = c0370f.m881D();
        this.f2012d = c0370f.m829r();
        int size = this.f2013e.size();
        for (int i = 0; i < size; i++) {
            this.f2013e.get(i).m745b(c0370f);
        }
    }
}
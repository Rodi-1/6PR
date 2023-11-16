package p007f;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: f.h */
/* loaded from: classes.dex */
public class C0374h {

    /* renamed from: a */
    public List<C0370f> f1969a;

    /* renamed from: b */
    int f1970b;

    /* renamed from: c */
    int f1971c;

    /* renamed from: d */
    public boolean f1972d;

    /* renamed from: e */
    public final int[] f1973e;

    /* renamed from: f */
    List<C0370f> f1974f;

    /* renamed from: g */
    List<C0370f> f1975g;

    /* renamed from: h */
    HashSet<C0370f> f1976h;

    /* renamed from: i */
    HashSet<C0370f> f1977i;

    /* renamed from: j */
    List<C0370f> f1978j;

    /* renamed from: k */
    List<C0370f> f1979k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0374h(List<C0370f> list) {
        this.f1970b = -1;
        this.f1971c = -1;
        this.f1972d = false;
        this.f1973e = new int[]{-1, -1};
        this.f1974f = new ArrayList();
        this.f1975g = new ArrayList();
        this.f1976h = new HashSet<>();
        this.f1977i = new HashSet<>();
        this.f1978j = new ArrayList();
        this.f1979k = new ArrayList();
        this.f1969a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0374h(List<C0370f> list, boolean z) {
        this.f1970b = -1;
        this.f1971c = -1;
        this.f1972d = false;
        this.f1973e = new int[]{-1, -1};
        this.f1974f = new ArrayList();
        this.f1975g = new ArrayList();
        this.f1976h = new HashSet<>();
        this.f1977i = new HashSet<>();
        this.f1978j = new ArrayList();
        this.f1979k = new ArrayList();
        this.f1969a = list;
        this.f1972d = z;
    }

    /* renamed from: e */
    private void m788e(ArrayList<C0370f> arrayList, C0370f c0370f) {
        C0370f c0370f2;
        if (c0370f.f1915k0) {
            return;
        }
        arrayList.add(c0370f);
        c0370f.f1915k0 = true;
        if (c0370f.m870L()) {
            return;
        }
        if (c0370f instanceof C0377j) {
            C0377j c0377j = (C0377j) c0370f;
            int i = c0377j.f1991w0;
            for (int i2 = 0; i2 < i; i2++) {
                m788e(arrayList, c0377j.f1990v0[i2]);
            }
        }
        int length = c0370f.f1870C.length;
        for (int i3 = 0; i3 < length; i3++) {
            C0365e c0365e = c0370f.f1870C[i3].f1842d;
            if (c0365e != null && (c0370f2 = c0365e.f1840b) != c0370f.m823u()) {
                m788e(arrayList, c0370f2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m787f(p007f.C0370f r7) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007f.C0374h.m787f(f.f):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m792a(C0370f c0370f, int i) {
        HashSet<C0370f> hashSet;
        if (i == 0) {
            hashSet = this.f1976h;
        } else if (i != 1) {
            return;
        } else {
            hashSet = this.f1977i;
        }
        hashSet.add(c0370f);
    }

    /* renamed from: b */
    public List<C0370f> m791b(int i) {
        if (i == 0) {
            return this.f1974f;
        }
        if (i == 1) {
            return this.f1975g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<C0370f> m790c(int i) {
        if (i == 0) {
            return this.f1976h;
        }
        if (i == 1) {
            return this.f1977i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C0370f> m789d() {
        if (this.f1978j.isEmpty()) {
            int size = this.f1969a.size();
            for (int i = 0; i < size; i++) {
                C0370f c0370f = this.f1969a.get(i);
                if (!c0370f.f1911i0) {
                    m788e((ArrayList) this.f1978j, c0370f);
                }
            }
            this.f1979k.clear();
            this.f1979k.addAll(this.f1969a);
            this.f1979k.removeAll(this.f1978j);
            return this.f1978j;
        }
        return this.f1978j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m786g() {
        int size = this.f1979k.size();
        for (int i = 0; i < size; i++) {
            m787f(this.f1979k.get(i));
        }
    }
}
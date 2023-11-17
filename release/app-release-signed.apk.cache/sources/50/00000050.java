package android.support.v4.app;

import android.support.v4.app.g;
import android.support.v4.app.m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends q implements m.k {

    /* renamed from: a  reason: collision with root package name */
    final m f239a;

    /* renamed from: c  reason: collision with root package name */
    int f241c;

    /* renamed from: d  reason: collision with root package name */
    int f242d;

    /* renamed from: e  reason: collision with root package name */
    int f243e;

    /* renamed from: f  reason: collision with root package name */
    int f244f;

    /* renamed from: g  reason: collision with root package name */
    int f245g;

    /* renamed from: h  reason: collision with root package name */
    int f246h;

    /* renamed from: i  reason: collision with root package name */
    boolean f247i;

    /* renamed from: k  reason: collision with root package name */
    String f249k;

    /* renamed from: l  reason: collision with root package name */
    boolean f250l;

    /* renamed from: n  reason: collision with root package name */
    int f252n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f253o;

    /* renamed from: p  reason: collision with root package name */
    int f254p;

    /* renamed from: q  reason: collision with root package name */
    CharSequence f255q;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<String> f256r;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<String> f257s;

    /* renamed from: u  reason: collision with root package name */
    ArrayList<Runnable> f259u;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f240b = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    boolean f248j = true;

    /* renamed from: m  reason: collision with root package name */
    int f251m = -1;

    /* renamed from: t  reason: collision with root package name */
    boolean f258t = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f260a;

        /* renamed from: b  reason: collision with root package name */
        g f261b;

        /* renamed from: c  reason: collision with root package name */
        int f262c;

        /* renamed from: d  reason: collision with root package name */
        int f263d;

        /* renamed from: e  reason: collision with root package name */
        int f264e;

        /* renamed from: f  reason: collision with root package name */
        int f265f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        a(int i2, g gVar) {
            this.f260a = i2;
            this.f261b = gVar;
        }
    }

    public c(m mVar) {
        this.f239a = mVar;
    }

    private static boolean l(a aVar) {
        g gVar = aVar.f261b;
        return (gVar == null || !gVar.f289k || gVar.I == null || gVar.B || gVar.A || !gVar.J()) ? false : true;
    }

    @Override // android.support.v4.app.m.k
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        if (m.F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f247i) {
            this.f239a.h(this);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f240b.add(aVar);
        aVar.f262c = this.f241c;
        aVar.f263d = this.f242d;
        aVar.f264e = this.f243e;
        aVar.f265f = this.f244f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i2) {
        a aVar;
        if (this.f247i) {
            if (m.F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f240b.size();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = this.f240b.get(i3).f261b;
                if (gVar != null) {
                    gVar.f295q += i2;
                    if (m.F) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f261b + " to " + aVar.f261b.f295q);
                    }
                }
            }
        }
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        e(str, printWriter, true);
    }

    public void e(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f249k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f251m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f250l);
            if (this.f245g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f245g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f246h));
            }
            if (this.f241c != 0 || this.f242d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f241c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f242d));
            }
            if (this.f243e != 0 || this.f244f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f243e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f244f));
            }
            if (this.f252n != 0 || this.f253o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f252n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f253o);
            }
            if (this.f254p != 0 || this.f255q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f254p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f255q);
            }
        }
        if (this.f240b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f240b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f240b.get(i2);
            switch (aVar.f260a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.f260a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f261b);
            if (z) {
                if (aVar.f262c != 0 || aVar.f263d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f262c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f263d));
                }
                if (aVar.f264e != 0 || aVar.f265f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f264e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f265f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        int size = this.f240b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f240b.get(i2);
            g gVar = aVar.f261b;
            if (gVar != null) {
                gVar.Z0(this.f245g, this.f246h);
            }
            switch (aVar.f260a) {
                case 1:
                    gVar.Y0(aVar.f262c);
                    this.f239a.i(gVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f260a);
                case 3:
                    gVar.Y0(aVar.f263d);
                    this.f239a.M0(gVar);
                    break;
                case 4:
                    gVar.Y0(aVar.f263d);
                    this.f239a.s0(gVar);
                    break;
                case 5:
                    gVar.Y0(aVar.f262c);
                    this.f239a.c1(gVar);
                    break;
                case 6:
                    gVar.Y0(aVar.f263d);
                    this.f239a.r(gVar);
                    break;
                case 7:
                    gVar.Y0(aVar.f262c);
                    this.f239a.l(gVar);
                    break;
                case 8:
                    this.f239a.Z0(gVar);
                    break;
                case 9:
                    this.f239a.Z0(null);
                    break;
            }
            if (!this.f258t && aVar.f260a != 1 && gVar != null) {
                this.f239a.C0(gVar);
            }
        }
        if (this.f258t) {
            return;
        }
        m mVar = this.f239a;
        mVar.D0(mVar.f353m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z) {
        for (int size = this.f240b.size() - 1; size >= 0; size--) {
            a aVar = this.f240b.get(size);
            g gVar = aVar.f261b;
            if (gVar != null) {
                gVar.Z0(m.R0(this.f245g), this.f246h);
            }
            switch (aVar.f260a) {
                case 1:
                    gVar.Y0(aVar.f265f);
                    this.f239a.M0(gVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f260a);
                case 3:
                    gVar.Y0(aVar.f264e);
                    this.f239a.i(gVar, false);
                    break;
                case 4:
                    gVar.Y0(aVar.f264e);
                    this.f239a.c1(gVar);
                    break;
                case 5:
                    gVar.Y0(aVar.f265f);
                    this.f239a.s0(gVar);
                    break;
                case 6:
                    gVar.Y0(aVar.f264e);
                    this.f239a.l(gVar);
                    break;
                case 7:
                    gVar.Y0(aVar.f265f);
                    this.f239a.r(gVar);
                    break;
                case 8:
                    this.f239a.Z0(null);
                    break;
                case 9:
                    this.f239a.Z0(gVar);
                    break;
            }
            if (!this.f258t && aVar.f260a != 3 && gVar != null) {
                this.f239a.C0(gVar);
            }
        }
        if (this.f258t || !z) {
            return;
        }
        m mVar = this.f239a;
        mVar.D0(mVar.f353m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g h(ArrayList<g> arrayList, g gVar) {
        g gVar2 = gVar;
        int i2 = 0;
        while (i2 < this.f240b.size()) {
            a aVar = this.f240b.get(i2);
            int i3 = aVar.f260a;
            if (i3 != 1) {
                if (i3 == 2) {
                    g gVar3 = aVar.f261b;
                    int i4 = gVar3.y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        g gVar4 = arrayList.get(size);
                        if (gVar4.y == i4) {
                            if (gVar4 == gVar3) {
                                z = true;
                            } else {
                                if (gVar4 == gVar2) {
                                    this.f240b.add(i2, new a(9, gVar4));
                                    i2++;
                                    gVar2 = null;
                                }
                                a aVar2 = new a(3, gVar4);
                                aVar2.f262c = aVar.f262c;
                                aVar2.f264e = aVar.f264e;
                                aVar2.f263d = aVar.f263d;
                                aVar2.f265f = aVar.f265f;
                                this.f240b.add(i2, aVar2);
                                arrayList.remove(gVar4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.f240b.remove(i2);
                        i2--;
                    } else {
                        aVar.f260a = 1;
                        arrayList.add(gVar3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f261b);
                    g gVar5 = aVar.f261b;
                    if (gVar5 == gVar2) {
                        this.f240b.add(i2, new a(9, gVar5));
                        i2++;
                        gVar2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f240b.add(i2, new a(9, gVar2));
                        i2++;
                        gVar2 = aVar.f261b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f261b);
            i2++;
        }
        return gVar2;
    }

    public String i() {
        return this.f249k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(int i2) {
        int size = this.f240b.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f240b.get(i3).f261b;
            int i4 = gVar != null ? gVar.y : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(ArrayList<c> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f240b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            g gVar = this.f240b.get(i5).f261b;
            int i6 = gVar != null ? gVar.y : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    c cVar = arrayList.get(i7);
                    int size2 = cVar.f240b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        g gVar2 = cVar.f240b.get(i8).f261b;
                        if ((gVar2 != null ? gVar2.y : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        for (int i2 = 0; i2 < this.f240b.size(); i2++) {
            if (l(this.f240b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void n() {
        ArrayList<Runnable> arrayList = this.f259u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f259u.get(i2).run();
            }
            this.f259u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(g.e eVar) {
        for (int i2 = 0; i2 < this.f240b.size(); i2++) {
            a aVar = this.f240b.get(i2);
            if (l(aVar)) {
                aVar.f261b.a1(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g p(ArrayList<g> arrayList, g gVar) {
        for (int i2 = 0; i2 < this.f240b.size(); i2++) {
            a aVar = this.f240b.get(i2);
            int i3 = aVar.f260a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case 8:
                            gVar = null;
                            break;
                        case 9:
                            gVar = aVar.f261b;
                            break;
                    }
                }
                arrayList.add(aVar.f261b);
            }
            arrayList.remove(aVar.f261b);
        }
        return gVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f251m >= 0) {
            sb.append(" #");
            sb.append(this.f251m);
        }
        if (this.f249k != null) {
            sb.append(" ");
            sb.append(this.f249k);
        }
        sb.append("}");
        return sb.toString();
    }
}
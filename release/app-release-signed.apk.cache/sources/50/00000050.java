package android.support.p001v4.app;

import android.support.p001v4.app.ComponentCallbacksC0073g;
import android.support.p001v4.app.LayoutInflater$Factory2C0089m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.c */
/* loaded from: classes.dex */
public final class C0067c extends AbstractC0109q implements LayoutInflater$Factory2C0089m.InterfaceC0102k {

    /* renamed from: a */
    final LayoutInflater$Factory2C0089m f345a;

    /* renamed from: c */
    int f347c;

    /* renamed from: d */
    int f348d;

    /* renamed from: e */
    int f349e;

    /* renamed from: f */
    int f350f;

    /* renamed from: g */
    int f351g;

    /* renamed from: h */
    int f352h;

    /* renamed from: i */
    boolean f353i;

    /* renamed from: k */
    String f355k;

    /* renamed from: l */
    boolean f356l;

    /* renamed from: n */
    int f358n;

    /* renamed from: o */
    CharSequence f359o;

    /* renamed from: p */
    int f360p;

    /* renamed from: q */
    CharSequence f361q;

    /* renamed from: r */
    ArrayList<String> f362r;

    /* renamed from: s */
    ArrayList<String> f363s;

    /* renamed from: u */
    ArrayList<Runnable> f365u;

    /* renamed from: b */
    ArrayList<C0068a> f346b = new ArrayList<>();

    /* renamed from: j */
    boolean f354j = true;

    /* renamed from: m */
    int f357m = -1;

    /* renamed from: t */
    boolean f364t = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.c$a */
    /* loaded from: classes.dex */
    public static final class C0068a {

        /* renamed from: a */
        int f366a;

        /* renamed from: b */
        ComponentCallbacksC0073g f367b;

        /* renamed from: c */
        int f368c;

        /* renamed from: d */
        int f369d;

        /* renamed from: e */
        int f370e;

        /* renamed from: f */
        int f371f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0068a() {
        }

        C0068a(int i, ComponentCallbacksC0073g componentCallbacksC0073g) {
            this.f366a = i;
            this.f367b = componentCallbacksC0073g;
        }
    }

    public C0067c(LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m) {
        this.f345a = layoutInflater$Factory2C0089m;
    }

    /* renamed from: l */
    private static boolean m2206l(C0068a c0068a) {
        ComponentCallbacksC0073g componentCallbacksC0073g = c0068a.f367b;
        return (componentCallbacksC0073g == null || !componentCallbacksC0073g.f416k || componentCallbacksC0073g.f396I == null || componentCallbacksC0073g.f389B || componentCallbacksC0073g.f388A || !componentCallbacksC0073g.m2179J()) ? false : true;
    }

    @Override // android.support.p001v4.app.LayoutInflater$Factory2C0089m.InterfaceC0102k
    /* renamed from: a */
    public boolean mo1907a(ArrayList<C0067c> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflater$Factory2C0089m.f472F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f353i) {
            this.f345a.m1945h(this);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2216b(C0068a c0068a) {
        this.f346b.add(c0068a);
        c0068a.f368c = this.f347c;
        c0068a.f369d = this.f348d;
        c0068a.f370e = this.f349e;
        c0068a.f371f = this.f350f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2215c(int i) {
        C0068a c0068a;
        if (this.f353i) {
            if (LayoutInflater$Factory2C0089m.f472F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f346b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0073g componentCallbacksC0073g = this.f346b.get(i2).f367b;
                if (componentCallbacksC0073g != null) {
                    componentCallbacksC0073g.f422q += i;
                    if (LayoutInflater$Factory2C0089m.f472F) {
                        Log.v("FragmentManager", "Bump nesting of " + c0068a.f367b + " to " + c0068a.f367b.f422q);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m2214d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m2213e(str, printWriter, true);
    }

    /* renamed from: e */
    public void m2213e(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f355k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f357m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f356l);
            if (this.f351g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f351g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f352h));
            }
            if (this.f347c != 0 || this.f348d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f347c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f348d));
            }
            if (this.f349e != 0 || this.f350f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f349e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f350f));
            }
            if (this.f358n != 0 || this.f359o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f358n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f359o);
            }
            if (this.f360p != 0 || this.f361q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f360p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f361q);
            }
        }
        if (this.f346b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f346b.size();
        for (int i = 0; i < size; i++) {
            C0068a c0068a = this.f346b.get(i);
            switch (c0068a.f366a) {
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
                    str2 = "cmd=" + c0068a.f366a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0068a.f367b);
            if (z) {
                if (c0068a.f368c != 0 || c0068a.f369d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0068a.f368c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0068a.f369d));
                }
                if (c0068a.f370e != 0 || c0068a.f371f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0068a.f370e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0068a.f371f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2212f() {
        int size = this.f346b.size();
        for (int i = 0; i < size; i++) {
            C0068a c0068a = this.f346b.get(i);
            ComponentCallbacksC0073g componentCallbacksC0073g = c0068a.f367b;
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2146Z0(this.f351g, this.f352h);
            }
            switch (c0068a.f366a) {
                case 1:
                    componentCallbacksC0073g.m2148Y0(c0068a.f368c);
                    this.f345a.m1943i(componentCallbacksC0073g, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0068a.f366a);
                case 3:
                    componentCallbacksC0073g.m2148Y0(c0068a.f369d);
                    this.f345a.m1992M0(componentCallbacksC0073g);
                    break;
                case 4:
                    componentCallbacksC0073g.m2148Y0(c0068a.f369d);
                    this.f345a.m1922s0(componentCallbacksC0073g);
                    break;
                case 5:
                    componentCallbacksC0073g.m2148Y0(c0068a.f368c);
                    this.f345a.m1957c1(componentCallbacksC0073g);
                    break;
                case 6:
                    componentCallbacksC0073g.m2148Y0(c0068a.f369d);
                    this.f345a.m1925r(componentCallbacksC0073g);
                    break;
                case 7:
                    componentCallbacksC0073g.m2148Y0(c0068a.f368c);
                    this.f345a.m1937l(componentCallbacksC0073g);
                    break;
                case 8:
                    this.f345a.m1966Z0(componentCallbacksC0073g);
                    break;
                case 9:
                    this.f345a.m1966Z0(null);
                    break;
            }
            if (!this.f364t && c0068a.f366a != 1 && componentCallbacksC0073g != null) {
                this.f345a.m2012C0(componentCallbacksC0073g);
            }
        }
        if (this.f364t) {
            return;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f345a;
        layoutInflater$Factory2C0089m.m2010D0(layoutInflater$Factory2C0089m.f494m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2211g(boolean z) {
        for (int size = this.f346b.size() - 1; size >= 0; size--) {
            C0068a c0068a = this.f346b.get(size);
            ComponentCallbacksC0073g componentCallbacksC0073g = c0068a.f367b;
            if (componentCallbacksC0073g != null) {
                componentCallbacksC0073g.m2146Z0(LayoutInflater$Factory2C0089m.m1982R0(this.f351g), this.f352h);
            }
            switch (c0068a.f366a) {
                case 1:
                    componentCallbacksC0073g.m2148Y0(c0068a.f371f);
                    this.f345a.m1992M0(componentCallbacksC0073g);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0068a.f366a);
                case 3:
                    componentCallbacksC0073g.m2148Y0(c0068a.f370e);
                    this.f345a.m1943i(componentCallbacksC0073g, false);
                    break;
                case 4:
                    componentCallbacksC0073g.m2148Y0(c0068a.f370e);
                    this.f345a.m1957c1(componentCallbacksC0073g);
                    break;
                case 5:
                    componentCallbacksC0073g.m2148Y0(c0068a.f371f);
                    this.f345a.m1922s0(componentCallbacksC0073g);
                    break;
                case 6:
                    componentCallbacksC0073g.m2148Y0(c0068a.f370e);
                    this.f345a.m1937l(componentCallbacksC0073g);
                    break;
                case 7:
                    componentCallbacksC0073g.m2148Y0(c0068a.f371f);
                    this.f345a.m1925r(componentCallbacksC0073g);
                    break;
                case 8:
                    this.f345a.m1966Z0(null);
                    break;
                case 9:
                    this.f345a.m1966Z0(componentCallbacksC0073g);
                    break;
            }
            if (!this.f364t && c0068a.f366a != 3 && componentCallbacksC0073g != null) {
                this.f345a.m2012C0(componentCallbacksC0073g);
            }
        }
        if (this.f364t || !z) {
            return;
        }
        LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m = this.f345a;
        layoutInflater$Factory2C0089m.m2010D0(layoutInflater$Factory2C0089m.f494m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ComponentCallbacksC0073g m2210h(ArrayList<ComponentCallbacksC0073g> arrayList, ComponentCallbacksC0073g componentCallbacksC0073g) {
        ComponentCallbacksC0073g componentCallbacksC0073g2 = componentCallbacksC0073g;
        int i = 0;
        while (i < this.f346b.size()) {
            C0068a c0068a = this.f346b.get(i);
            int i2 = c0068a.f366a;
            if (i2 != 1) {
                if (i2 == 2) {
                    ComponentCallbacksC0073g componentCallbacksC0073g3 = c0068a.f367b;
                    int i3 = componentCallbacksC0073g3.f430y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ComponentCallbacksC0073g componentCallbacksC0073g4 = arrayList.get(size);
                        if (componentCallbacksC0073g4.f430y == i3) {
                            if (componentCallbacksC0073g4 == componentCallbacksC0073g3) {
                                z = true;
                            } else {
                                if (componentCallbacksC0073g4 == componentCallbacksC0073g2) {
                                    this.f346b.add(i, new C0068a(9, componentCallbacksC0073g4));
                                    i++;
                                    componentCallbacksC0073g2 = null;
                                }
                                C0068a c0068a2 = new C0068a(3, componentCallbacksC0073g4);
                                c0068a2.f368c = c0068a.f368c;
                                c0068a2.f370e = c0068a.f370e;
                                c0068a2.f369d = c0068a.f369d;
                                c0068a2.f371f = c0068a.f371f;
                                this.f346b.add(i, c0068a2);
                                arrayList.remove(componentCallbacksC0073g4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f346b.remove(i);
                        i--;
                    } else {
                        c0068a.f366a = 1;
                        arrayList.add(componentCallbacksC0073g3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c0068a.f367b);
                    ComponentCallbacksC0073g componentCallbacksC0073g5 = c0068a.f367b;
                    if (componentCallbacksC0073g5 == componentCallbacksC0073g2) {
                        this.f346b.add(i, new C0068a(9, componentCallbacksC0073g5));
                        i++;
                        componentCallbacksC0073g2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f346b.add(i, new C0068a(9, componentCallbacksC0073g2));
                        i++;
                        componentCallbacksC0073g2 = c0068a.f367b;
                    }
                }
                i++;
            }
            arrayList.add(c0068a.f367b);
            i++;
        }
        return componentCallbacksC0073g2;
    }

    /* renamed from: i */
    public String m2209i() {
        return this.f355k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m2208j(int i) {
        int size = this.f346b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f346b.get(i2).f367b;
            int i3 = componentCallbacksC0073g != null ? componentCallbacksC0073g.f430y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m2207k(ArrayList<C0067c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f346b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            ComponentCallbacksC0073g componentCallbacksC0073g = this.f346b.get(i4).f367b;
            int i5 = componentCallbacksC0073g != null ? componentCallbacksC0073g.f430y : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0067c c0067c = arrayList.get(i6);
                    int size2 = c0067c.f346b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ComponentCallbacksC0073g componentCallbacksC0073g2 = c0067c.f346b.get(i7).f367b;
                        if ((componentCallbacksC0073g2 != null ? componentCallbacksC0073g2.f430y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m2205m() {
        for (int i = 0; i < this.f346b.size(); i++) {
            if (m2206l(this.f346b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m2204n() {
        ArrayList<Runnable> arrayList = this.f365u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f365u.get(i).run();
            }
            this.f365u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2203o(ComponentCallbacksC0073g.InterfaceC0078e interfaceC0078e) {
        for (int i = 0; i < this.f346b.size(); i++) {
            C0068a c0068a = this.f346b.get(i);
            if (m2206l(c0068a)) {
                c0068a.f367b.m2144a1(interfaceC0078e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public ComponentCallbacksC0073g m2202p(ArrayList<ComponentCallbacksC0073g> arrayList, ComponentCallbacksC0073g componentCallbacksC0073g) {
        for (int i = 0; i < this.f346b.size(); i++) {
            C0068a c0068a = this.f346b.get(i);
            int i2 = c0068a.f366a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            componentCallbacksC0073g = null;
                            break;
                        case 9:
                            componentCallbacksC0073g = c0068a.f367b;
                            break;
                    }
                }
                arrayList.add(c0068a.f367b);
            }
            arrayList.remove(c0068a.f367b);
        }
        return componentCallbacksC0073g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f357m >= 0) {
            sb.append(" #");
            sb.append(this.f357m);
        }
        if (this.f355k != null) {
            sb.append(" ");
            sb.append(this.f355k);
        }
        sb.append("}");
        return sb.toString();
    }
}
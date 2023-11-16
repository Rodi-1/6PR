package p016o;

import android.os.Build;
import android.view.ViewGroup;
import p004c.C0345a;

/* renamed from: o.q */
/* loaded from: classes.dex */
public final class C0503q {

    /* renamed from: a */
    static final C0506c f2229a;

    /* renamed from: o.q$a */
    /* loaded from: classes.dex */
    static class C0504a extends C0506c {
        C0504a() {
        }
    }

    /* renamed from: o.q$b */
    /* loaded from: classes.dex */
    static class C0505b extends C0504a {
        C0505b() {
        }

        @Override // p016o.C0503q.C0506c
        /* renamed from: a */
        public boolean mo359a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* renamed from: o.q$c */
    /* loaded from: classes.dex */
    static class C0506c {
        C0506c() {
        }

        /* renamed from: a */
        public boolean mo359a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0345a.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0490o.m406f(viewGroup) == null) ? false : true;
        }
    }

    static {
        f2229a = Build.VERSION.SDK_INT >= 21 ? new C0505b() : new C0504a();
    }

    /* renamed from: a */
    public static boolean m360a(ViewGroup viewGroup) {
        return f2229a.mo359a(viewGroup);
    }
}
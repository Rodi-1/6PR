package o;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    static final c f1711a;

    /* loaded from: classes.dex */
    static class a extends c {
        a() {
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // o.q.c
        public boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public boolean a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(c.a.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && o.f(viewGroup) == null) ? false : true;
        }
    }

    static {
        f1711a = Build.VERSION.SDK_INT >= 21 ? new b() : new a();
    }

    public static boolean a(ViewGroup viewGroup) {
        return f1711a.a(viewGroup);
    }
}
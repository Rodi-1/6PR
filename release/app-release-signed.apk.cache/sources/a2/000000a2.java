package android.support.v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final b f547a;

    /* loaded from: classes.dex */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.widget.f.b
        public void a(EdgeEffect edgeEffect, float f2, float f3) {
            edgeEffect.onPull(f2, f3);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        public void a(EdgeEffect edgeEffect, float f2, float f3) {
            edgeEffect.onPull(f2);
        }
    }

    static {
        f547a = Build.VERSION.SDK_INT >= 21 ? new a() : new b();
    }

    public static void a(EdgeEffect edgeEffect, float f2, float f3) {
        f547a.a(edgeEffect, f2, f3);
    }
}
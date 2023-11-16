package android.support.p001v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.f */
/* loaded from: classes.dex */
public final class C0148f {

    /* renamed from: a */
    private static final C0150b f697a;

    /* renamed from: android.support.v4.widget.f$a */
    /* loaded from: classes.dex */
    static class C0149a extends C0150b {
        C0149a() {
        }

        @Override // android.support.p001v4.widget.C0148f.C0150b
        /* renamed from: a */
        public void mo1741a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: android.support.v4.widget.f$b */
    /* loaded from: classes.dex */
    static class C0150b {
        C0150b() {
        }

        /* renamed from: a */
        public void mo1741a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    static {
        f697a = Build.VERSION.SDK_INT >= 21 ? new C0149a() : new C0150b();
    }

    /* renamed from: a */
    public static void m1742a(EdgeEffect edgeEffect, float f, float f2) {
        f697a.mo1741a(edgeEffect, f, f2);
    }
}
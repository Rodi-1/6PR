package android.support.p001v4.app;

import android.app.Activity;
import android.content.Intent;
import p008g.C0386a;

/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
public class C0060a extends C0386a {

    /* renamed from: b */
    private static InterfaceC0061a f341b;

    /* renamed from: android.support.v4.app.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0061a {
        /* renamed from: a */
        boolean m2225a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: d */
    public static void m2227d(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: e */
    public static InterfaceC0061a m2226e() {
        return f341b;
    }
}
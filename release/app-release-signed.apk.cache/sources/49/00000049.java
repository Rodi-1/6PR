package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public class a extends g.a {

    /* renamed from: b  reason: collision with root package name */
    private static InterfaceC0004a f235b;

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0004a {
        boolean a(Activity activity, int i2, int i3, Intent intent);
    }

    public static void d(Activity activity) {
        activity.finishAffinity();
    }

    public static InterfaceC0004a e() {
        return f235b;
    }
}
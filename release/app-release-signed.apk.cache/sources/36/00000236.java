package r;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b  reason: collision with root package name */
    private static int f1736b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1737c = false;

    public static d e(Activity activity, c cVar) {
        return g(activity, activity.getWindow(), cVar);
    }

    public static d f(Dialog dialog, c cVar) {
        return g(dialog.getContext(), dialog.getWindow(), cVar);
    }

    private static d g(Context context, Window window, c cVar) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 24 ? new f(context, window, cVar) : i2 >= 23 ? new h(context, window, cVar) : new g(context, window, cVar);
    }

    public static int i() {
        return f1736b;
    }

    public static boolean n() {
        return f1737c;
    }

    public abstract void A(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public abstract <T extends View> T h(int i2);

    public abstract MenuInflater j();

    public abstract a k();

    public abstract void l();

    public abstract void m();

    public abstract void o(Configuration configuration);

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v();

    public abstract boolean w(int i2);

    public abstract void x(int i2);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);
}
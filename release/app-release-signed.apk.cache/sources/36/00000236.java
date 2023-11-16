package p019r;

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

/* renamed from: r.d */
/* loaded from: classes.dex */
public abstract class AbstractC0531d {

    /* renamed from: b */
    private static int f2254b = -1;

    /* renamed from: c */
    private static boolean f2255c = false;

    /* renamed from: e */
    public static AbstractC0531d m276e(Activity activity, InterfaceC0530c interfaceC0530c) {
        return m274g(activity, activity.getWindow(), interfaceC0530c);
    }

    /* renamed from: f */
    public static AbstractC0531d m275f(Dialog dialog, InterfaceC0530c interfaceC0530c) {
        return m274g(dialog.getContext(), dialog.getWindow(), interfaceC0530c);
    }

    /* renamed from: g */
    private static AbstractC0531d m274g(Context context, Window window, InterfaceC0530c interfaceC0530c) {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 ? new C0535f(context, window, interfaceC0530c) : i >= 23 ? new C0541h(context, window, interfaceC0530c) : new C0537g(context, window, interfaceC0530c);
    }

    /* renamed from: i */
    public static int m273i() {
        return f2254b;
    }

    /* renamed from: n */
    public static boolean m272n() {
        return f2255c;
    }

    /* renamed from: A */
    public abstract void mo271A(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo226c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public abstract boolean mo260d();

    /* renamed from: h */
    public abstract <T extends View> T mo220h(int i);

    /* renamed from: j */
    public abstract MenuInflater mo265j();

    /* renamed from: k */
    public abstract AbstractC0525a mo264k();

    /* renamed from: l */
    public abstract void mo215l();

    /* renamed from: m */
    public abstract void mo213m();

    /* renamed from: o */
    public abstract void mo210o(Configuration configuration);

    /* renamed from: p */
    public abstract void mo208p(Bundle bundle);

    /* renamed from: q */
    public abstract void mo206q();

    /* renamed from: r */
    public abstract void mo204r(Bundle bundle);

    /* renamed from: s */
    public abstract void mo202s();

    /* renamed from: t */
    public abstract void mo259t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo258u();

    /* renamed from: v */
    public abstract void mo198v();

    /* renamed from: w */
    public abstract boolean mo196w(int i);

    /* renamed from: x */
    public abstract void mo195x(int i);

    /* renamed from: y */
    public abstract void mo194y(View view);

    /* renamed from: z */
    public abstract void mo193z(View view, ViewGroup.LayoutParams layoutParams);
}
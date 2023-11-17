package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.j;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public interface d0 {
    boolean a();

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f(Menu menu, j.a aVar);

    boolean g();

    CharSequence getTitle();

    void h();

    void i(o0 o0Var);

    o.s j(int i2, long j2);

    int k();

    void l(int i2);

    void m();

    boolean n();

    void o(int i2);

    ViewGroup p();

    void q(boolean z);

    void r();

    void s(boolean z);

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    Context t();

    void u(int i2);

    int v();
}
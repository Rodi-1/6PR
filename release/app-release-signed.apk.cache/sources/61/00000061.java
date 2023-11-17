package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final k<?> f336a;

    private j(k<?> kVar) {
        this.f336a = kVar;
    }

    public static j b(k<?> kVar) {
        return new j(kVar);
    }

    public Parcelable A() {
        return this.f336a.f341e.S0();
    }

    public void a(g gVar) {
        k<?> kVar = this.f336a;
        kVar.f341e.k(kVar, kVar, gVar);
    }

    public void c() {
        this.f336a.f341e.s();
    }

    public void d(Configuration configuration) {
        this.f336a.f341e.t(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f336a.f341e.u(menuItem);
    }

    public void f() {
        this.f336a.f341e.v();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f336a.f341e.w(menu, menuInflater);
    }

    public void h() {
        this.f336a.f341e.x();
    }

    public void i() {
        this.f336a.f341e.z();
    }

    public void j(boolean z) {
        this.f336a.f341e.A(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f336a.f341e.P(menuItem);
    }

    public void l(Menu menu) {
        this.f336a.f341e.Q(menu);
    }

    public void m() {
        this.f336a.f341e.R();
    }

    public void n(boolean z) {
        this.f336a.f341e.S(z);
    }

    public boolean o(Menu menu) {
        return this.f336a.f341e.T(menu);
    }

    public void p() {
        this.f336a.f341e.U();
    }

    public void q() {
        this.f336a.f341e.V();
    }

    public void r() {
        this.f336a.f341e.W();
    }

    public void s() {
        this.f336a.f341e.Y();
    }

    public boolean t() {
        return this.f336a.f341e.d0();
    }

    public g u(String str) {
        return this.f336a.f341e.j0(str);
    }

    public l v() {
        return this.f336a.f();
    }

    public void w() {
        this.f336a.f341e.G0();
    }

    public View x(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f336a.f341e.onCreateView(view, str, context, attributeSet);
    }

    public void y(Parcelable parcelable, n nVar) {
        this.f336a.f341e.P0(parcelable, nVar);
    }

    public n z() {
        return this.f336a.f341e.Q0();
    }
}
package v;

import android.content.Context;
import android.support.v7.view.menu.e;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import v.b;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: d  reason: collision with root package name */
    private Context f1901d;

    /* renamed from: e  reason: collision with root package name */
    private ActionBarContextView f1902e;

    /* renamed from: f  reason: collision with root package name */
    private b.a f1903f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f1904g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1905h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1906i;

    /* renamed from: j  reason: collision with root package name */
    private android.support.v7.view.menu.e f1907j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f1901d = context;
        this.f1902e = actionBarContextView;
        this.f1903f = aVar;
        android.support.v7.view.menu.e S = new android.support.v7.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f1907j = S;
        S.R(this);
        this.f1906i = z;
    }

    @Override // android.support.v7.view.menu.e.a
    public void a(android.support.v7.view.menu.e eVar) {
        k();
        this.f1902e.l();
    }

    @Override // android.support.v7.view.menu.e.a
    public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        return this.f1903f.d(this, menuItem);
    }

    @Override // v.b
    public void c() {
        if (this.f1905h) {
            return;
        }
        this.f1905h = true;
        this.f1902e.sendAccessibilityEvent(32);
        this.f1903f.b(this);
    }

    @Override // v.b
    public View d() {
        WeakReference<View> weakReference = this.f1904g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // v.b
    public Menu e() {
        return this.f1907j;
    }

    @Override // v.b
    public MenuInflater f() {
        return new g(this.f1902e.getContext());
    }

    @Override // v.b
    public CharSequence g() {
        return this.f1902e.getSubtitle();
    }

    @Override // v.b
    public CharSequence i() {
        return this.f1902e.getTitle();
    }

    @Override // v.b
    public void k() {
        this.f1903f.c(this, this.f1907j);
    }

    @Override // v.b
    public boolean l() {
        return this.f1902e.j();
    }

    @Override // v.b
    public void m(View view) {
        this.f1902e.setCustomView(view);
        this.f1904g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // v.b
    public void n(int i2) {
        o(this.f1901d.getString(i2));
    }

    @Override // v.b
    public void o(CharSequence charSequence) {
        this.f1902e.setSubtitle(charSequence);
    }

    @Override // v.b
    public void q(int i2) {
        r(this.f1901d.getString(i2));
    }

    @Override // v.b
    public void r(CharSequence charSequence) {
        this.f1902e.setTitle(charSequence);
    }

    @Override // v.b
    public void s(boolean z) {
        super.s(z);
        this.f1902e.setTitleOptional(z);
    }
}
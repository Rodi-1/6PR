package p023v;

import android.content.Context;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p023v.AbstractC0585b;

/* renamed from: v.e */
/* loaded from: classes.dex */
public class C0589e extends AbstractC0585b implements C0192e.InterfaceC0193a {

    /* renamed from: d */
    private Context f2644d;

    /* renamed from: e */
    private ActionBarContextView f2645e;

    /* renamed from: f */
    private AbstractC0585b.InterfaceC0586a f2646f;

    /* renamed from: g */
    private WeakReference<View> f2647g;

    /* renamed from: h */
    private boolean f2648h;

    /* renamed from: i */
    private boolean f2649i;

    /* renamed from: j */
    private C0192e f2650j;

    public C0589e(Context context, ActionBarContextView actionBarContextView, AbstractC0585b.InterfaceC0586a interfaceC0586a, boolean z) {
        this.f2644d = context;
        this.f2645e = actionBarContextView;
        this.f2646f = interfaceC0586a;
        C0192e m1638S = new C0192e(actionBarContextView.getContext()).m1638S(1);
        this.f2650j = m1638S;
        m1638S.mo1540R(this);
        this.f2649i = z;
    }

    @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
    /* renamed from: a */
    public void mo75a(C0192e c0192e) {
        mo67k();
        this.f2645e.m1527l();
    }

    @Override // android.support.p002v7.view.menu.C0192e.InterfaceC0193a
    /* renamed from: b */
    public boolean mo74b(C0192e c0192e, MenuItem menuItem) {
        return this.f2646f.mo56d(this, menuItem);
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: c */
    public void mo73c() {
        if (this.f2648h) {
            return;
        }
        this.f2648h = true;
        this.f2645e.sendAccessibilityEvent(32);
        this.f2646f.mo58b(this);
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: d */
    public View mo72d() {
        WeakReference<View> weakReference = this.f2647g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: e */
    public Menu mo71e() {
        return this.f2650j;
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: f */
    public MenuInflater mo70f() {
        return new C0592g(this.f2645e.getContext());
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: g */
    public CharSequence mo69g() {
        return this.f2645e.getSubtitle();
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: i */
    public CharSequence mo68i() {
        return this.f2645e.getTitle();
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: k */
    public void mo67k() {
        this.f2646f.mo57c(this, this.f2650j);
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: l */
    public boolean mo66l() {
        return this.f2645e.m1529j();
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: m */
    public void mo65m(View view) {
        this.f2645e.setCustomView(view);
        this.f2647g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: n */
    public void mo64n(int i) {
        mo63o(this.f2644d.getString(i));
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: o */
    public void mo63o(CharSequence charSequence) {
        this.f2645e.setSubtitle(charSequence);
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: q */
    public void mo62q(int i) {
        mo61r(this.f2644d.getString(i));
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: r */
    public void mo61r(CharSequence charSequence) {
        this.f2645e.setTitle(charSequence);
    }

    @Override // p023v.AbstractC0585b
    /* renamed from: s */
    public void mo60s(boolean z) {
        super.mo60s(z);
        this.f2645e.setTitleOptional(z);
    }
}
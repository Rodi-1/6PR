package android.support.p001v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.j */
/* loaded from: classes.dex */
public class C0084j {

    /* renamed from: a */
    private final AbstractC0085k<?> f466a;

    private C0084j(AbstractC0085k<?> abstractC0085k) {
        this.f466a = abstractC0085k;
    }

    /* renamed from: b */
    public static C0084j m2068b(AbstractC0085k<?> abstractC0085k) {
        return new C0084j(abstractC0085k);
    }

    /* renamed from: A */
    public Parcelable m2070A() {
        return this.f466a.f471e.m1980S0();
    }

    /* renamed from: a */
    public void m2069a(ComponentCallbacksC0073g componentCallbacksC0073g) {
        AbstractC0085k<?> abstractC0085k = this.f466a;
        abstractC0085k.f471e.m1939k(abstractC0085k, abstractC0085k, componentCallbacksC0073g);
    }

    /* renamed from: c */
    public void m2067c() {
        this.f466a.f471e.m1923s();
    }

    /* renamed from: d */
    public void m2066d(Configuration configuration) {
        this.f466a.f471e.m1921t(configuration);
    }

    /* renamed from: e */
    public boolean m2065e(MenuItem menuItem) {
        return this.f466a.f471e.m1919u(menuItem);
    }

    /* renamed from: f */
    public void m2064f() {
        this.f466a.f471e.m1917v();
    }

    /* renamed from: g */
    public boolean m2063g(Menu menu, MenuInflater menuInflater) {
        return this.f466a.f471e.m1915w(menu, menuInflater);
    }

    /* renamed from: h */
    public void m2062h() {
        this.f466a.f471e.m1913x();
    }

    /* renamed from: i */
    public void m2061i() {
        this.f466a.f471e.m1909z();
    }

    /* renamed from: j */
    public void m2060j(boolean z) {
        this.f466a.f471e.m2017A(z);
    }

    /* renamed from: k */
    public boolean m2059k(MenuItem menuItem) {
        return this.f466a.f471e.m1987P(menuItem);
    }

    /* renamed from: l */
    public void m2058l(Menu menu) {
        this.f466a.f471e.m1985Q(menu);
    }

    /* renamed from: m */
    public void m2057m() {
        this.f466a.f471e.m1983R();
    }

    /* renamed from: n */
    public void m2056n(boolean z) {
        this.f466a.f471e.m1981S(z);
    }

    /* renamed from: o */
    public boolean m2055o(Menu menu) {
        return this.f466a.f471e.m1979T(menu);
    }

    /* renamed from: p */
    public void m2054p() {
        this.f466a.f471e.m1977U();
    }

    /* renamed from: q */
    public void m2053q() {
        this.f466a.f471e.m1975V();
    }

    /* renamed from: r */
    public void m2052r() {
        this.f466a.f471e.m1973W();
    }

    /* renamed from: s */
    public void m2051s() {
        this.f466a.f471e.m1969Y();
    }

    /* renamed from: t */
    public boolean m2050t() {
        return this.f466a.f471e.m1955d0();
    }

    /* renamed from: u */
    public ComponentCallbacksC0073g m2049u(String str) {
        return this.f466a.f471e.m1940j0(str);
    }

    /* renamed from: v */
    public AbstractC0086l m2048v() {
        return this.f466a.m2041f();
    }

    /* renamed from: w */
    public void m2047w() {
        this.f466a.f471e.m2004G0();
    }

    /* renamed from: x */
    public View m2046x(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f466a.f471e.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: y */
    public void m2045y(Parcelable parcelable, C0104n c0104n) {
        this.f466a.f471e.m1986P0(parcelable, c0104n);
    }

    /* renamed from: z */
    public C0104n m2044z() {
        return this.f466a.f471e.m1984Q0();
    }
}
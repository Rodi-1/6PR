package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: b  reason: collision with root package name */
    protected Context f667b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f668c;

    /* renamed from: d  reason: collision with root package name */
    protected e f669d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f670e;

    /* renamed from: f  reason: collision with root package name */
    protected LayoutInflater f671f;

    /* renamed from: g  reason: collision with root package name */
    private j.a f672g;

    /* renamed from: h  reason: collision with root package name */
    private int f673h;

    /* renamed from: i  reason: collision with root package name */
    private int f674i;

    /* renamed from: j  reason: collision with root package name */
    protected k f675j;

    /* renamed from: k  reason: collision with root package name */
    private int f676k;

    public a(Context context, int i2, int i3) {
        this.f667b = context;
        this.f670e = LayoutInflater.from(context);
        this.f673h = i2;
        this.f674i = i3;
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.f672g;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        j.a aVar = this.f672g;
        if (aVar != null) {
            return aVar.b(mVar);
        }
        return false;
    }

    protected void c(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f675j).addView(view, i2);
    }

    public abstract void d(g gVar, k.a aVar);

    @Override // android.support.v7.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    public k.a f(ViewGroup viewGroup) {
        return (k.a) this.f670e.inflate(this.f674i, viewGroup, false);
    }

    @Override // android.support.v7.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void i(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f675j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f669d;
        int i2 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f669d.E();
            int size = E.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = E.get(i4);
                if (q(i3, gVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n2 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n2.setPressed(false);
                        n2.jumpDrawablesToCurrentState();
                    }
                    if (n2 != childAt) {
                        c(n2, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    @Override // android.support.v7.view.menu.j
    public void j(j.a aVar) {
        this.f672g = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public void k(Context context, e eVar) {
        this.f668c = context;
        this.f671f = LayoutInflater.from(context);
        this.f669d = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public j.a m() {
        return this.f672g;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a f2 = view instanceof k.a ? (k.a) view : f(viewGroup);
        d(gVar, f2);
        return (View) f2;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f675j == null) {
            k kVar = (k) this.f670e.inflate(this.f673h, viewGroup, false);
            this.f675j = kVar;
            kVar.b(this.f669d);
            i(true);
        }
        return this.f675j;
    }

    public void p(int i2) {
        this.f676k = i2;
    }

    public abstract boolean q(int i2, g gVar);
}
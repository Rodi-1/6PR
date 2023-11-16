package android.support.p002v7.view.menu;

import android.content.Context;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0182a implements InterfaceC0201j {

    /* renamed from: b */
    protected Context f858b;

    /* renamed from: c */
    protected Context f859c;

    /* renamed from: d */
    protected C0192e f860d;

    /* renamed from: e */
    protected LayoutInflater f861e;

    /* renamed from: f */
    protected LayoutInflater f862f;

    /* renamed from: g */
    private InterfaceC0201j.InterfaceC0202a f863g;

    /* renamed from: h */
    private int f864h;

    /* renamed from: i */
    private int f865i;

    /* renamed from: j */
    protected InterfaceC0203k f866j;

    /* renamed from: k */
    private int f867k;

    public AbstractC0182a(Context context, int i, int i2) {
        this.f858b = context;
        this.f861e = LayoutInflater.from(context);
        this.f864h = i;
        this.f865i = i2;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: a */
    public void mo1347a(C0192e c0192e, boolean z) {
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f863g;
        if (interfaceC0202a != null) {
            interfaceC0202a.mo184a(c0192e, z);
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: b */
    public boolean mo1346b(SubMenuC0208m subMenuC0208m) {
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f863g;
        if (interfaceC0202a != null) {
            return interfaceC0202a.mo183b(subMenuC0208m);
        }
        return false;
    }

    /* renamed from: c */
    protected void m1674c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f866j).addView(view, i);
    }

    /* renamed from: d */
    public abstract void mo1345d(C0196g c0196g, InterfaceC0203k.InterfaceC0204a interfaceC0204a);

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: e */
    public boolean mo1413e(C0192e c0192e, C0196g c0196g) {
        return false;
    }

    /* renamed from: f */
    public InterfaceC0203k.InterfaceC0204a m1673f(ViewGroup viewGroup) {
        return (InterfaceC0203k.InterfaceC0204a) this.f861e.inflate(this.f865i, viewGroup, false);
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: h */
    public boolean mo1412h(C0192e c0192e, C0196g c0196g) {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: i */
    public void mo1343i(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f866j;
        if (viewGroup == null) {
            return;
        }
        C0192e c0192e = this.f860d;
        int i = 0;
        if (c0192e != null) {
            c0192e.m1612r();
            ArrayList<C0196g> m1648E = this.f860d.m1648E();
            int size = m1648E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0196g c0196g = m1648E.get(i3);
                if (mo1338q(i2, c0196g)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0196g itemData = childAt instanceof InterfaceC0203k.InterfaceC0204a ? ((InterfaceC0203k.InterfaceC0204a) childAt).getItemData() : null;
                    View mo1340n = mo1340n(c0196g, childAt, viewGroup);
                    if (c0196g != itemData) {
                        mo1340n.setPressed(false);
                        mo1340n.jumpDrawablesToCurrentState();
                    }
                    if (mo1340n != childAt) {
                        m1674c(mo1340n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo1341l(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: j */
    public void mo1554j(InterfaceC0201j.InterfaceC0202a interfaceC0202a) {
        this.f863g = interfaceC0202a;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j
    /* renamed from: k */
    public void mo1342k(Context context, C0192e c0192e) {
        this.f859c = context;
        this.f862f = LayoutInflater.from(context);
        this.f860d = c0192e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1341l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0201j.InterfaceC0202a m1672m() {
        return this.f863g;
    }

    /* renamed from: n */
    public View mo1340n(C0196g c0196g, View view, ViewGroup viewGroup) {
        InterfaceC0203k.InterfaceC0204a m1673f = view instanceof InterfaceC0203k.InterfaceC0204a ? (InterfaceC0203k.InterfaceC0204a) view : m1673f(viewGroup);
        mo1345d(c0196g, m1673f);
        return (View) m1673f;
    }

    /* renamed from: o */
    public InterfaceC0203k mo1339o(ViewGroup viewGroup) {
        if (this.f866j == null) {
            InterfaceC0203k interfaceC0203k = (InterfaceC0203k) this.f861e.inflate(this.f864h, viewGroup, false);
            this.f866j = interfaceC0203k;
            interfaceC0203k.mo1499b(this.f860d);
            mo1343i(true);
        }
        return this.f866j;
    }

    /* renamed from: p */
    public void m1671p(int i) {
        this.f867k = i;
    }

    /* renamed from: q */
    public abstract boolean mo1338q(int i, C0196g c0196g);
}
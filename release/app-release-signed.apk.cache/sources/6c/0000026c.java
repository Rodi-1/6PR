package p023v;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: v.b */
/* loaded from: classes.dex */
public abstract class AbstractC0585b {

    /* renamed from: b */
    private Object f2637b;

    /* renamed from: c */
    private boolean f2638c;

    /* renamed from: v.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0586a {
        /* renamed from: a */
        boolean mo59a(AbstractC0585b abstractC0585b, Menu menu);

        /* renamed from: b */
        void mo58b(AbstractC0585b abstractC0585b);

        /* renamed from: c */
        boolean mo57c(AbstractC0585b abstractC0585b, Menu menu);

        /* renamed from: d */
        boolean mo56d(AbstractC0585b abstractC0585b, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo73c();

    /* renamed from: d */
    public abstract View mo72d();

    /* renamed from: e */
    public abstract Menu mo71e();

    /* renamed from: f */
    public abstract MenuInflater mo70f();

    /* renamed from: g */
    public abstract CharSequence mo69g();

    /* renamed from: h */
    public Object m81h() {
        return this.f2637b;
    }

    /* renamed from: i */
    public abstract CharSequence mo68i();

    /* renamed from: j */
    public boolean m80j() {
        return this.f2638c;
    }

    /* renamed from: k */
    public abstract void mo67k();

    /* renamed from: l */
    public abstract boolean mo66l();

    /* renamed from: m */
    public abstract void mo65m(View view);

    /* renamed from: n */
    public abstract void mo64n(int i);

    /* renamed from: o */
    public abstract void mo63o(CharSequence charSequence);

    /* renamed from: p */
    public void m79p(Object obj) {
        this.f2637b = obj;
    }

    /* renamed from: q */
    public abstract void mo62q(int i);

    /* renamed from: r */
    public abstract void mo61r(CharSequence charSequence);

    /* renamed from: s */
    public void mo60s(boolean z) {
        this.f2638c = z;
    }
}
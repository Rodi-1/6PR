package p023v;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p012k.InterfaceMenuC0422a;
import p012k.InterfaceMenuItemC0423b;
import p015n.C0462k;
import p023v.AbstractC0585b;
import p024w.C0608f;

/* renamed from: v.f */
/* loaded from: classes.dex */
public class C0590f extends ActionMode {

    /* renamed from: a */
    final Context f2651a;

    /* renamed from: b */
    final AbstractC0585b f2652b;

    /* renamed from: v.f$a */
    /* loaded from: classes.dex */
    public static class C0591a implements AbstractC0585b.InterfaceC0586a {

        /* renamed from: a */
        final ActionMode.Callback f2653a;

        /* renamed from: b */
        final Context f2654b;

        /* renamed from: c */
        final ArrayList<C0590f> f2655c = new ArrayList<>();

        /* renamed from: d */
        final C0462k<Menu, Menu> f2656d = new C0462k<>();

        public C0591a(Context context, ActionMode.Callback callback) {
            this.f2654b = context;
            this.f2653a = callback;
        }

        /* renamed from: f */
        private Menu m54f(Menu menu) {
            Menu menu2 = this.f2656d.get(menu);
            if (menu2 == null) {
                Menu m6a = C0608f.m6a(this.f2654b, (InterfaceMenuC0422a) menu);
                this.f2656d.put(menu, m6a);
                return m6a;
            }
            return menu2;
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: a */
        public boolean mo59a(AbstractC0585b abstractC0585b, Menu menu) {
            return this.f2653a.onCreateActionMode(m55e(abstractC0585b), m54f(menu));
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: b */
        public void mo58b(AbstractC0585b abstractC0585b) {
            this.f2653a.onDestroyActionMode(m55e(abstractC0585b));
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: c */
        public boolean mo57c(AbstractC0585b abstractC0585b, Menu menu) {
            return this.f2653a.onPrepareActionMode(m55e(abstractC0585b), m54f(menu));
        }

        @Override // p023v.AbstractC0585b.InterfaceC0586a
        /* renamed from: d */
        public boolean mo56d(AbstractC0585b abstractC0585b, MenuItem menuItem) {
            return this.f2653a.onActionItemClicked(m55e(abstractC0585b), C0608f.m5b(this.f2654b, (InterfaceMenuItemC0423b) menuItem));
        }

        /* renamed from: e */
        public ActionMode m55e(AbstractC0585b abstractC0585b) {
            int size = this.f2655c.size();
            for (int i = 0; i < size; i++) {
                C0590f c0590f = this.f2655c.get(i);
                if (c0590f != null && c0590f.f2652b == abstractC0585b) {
                    return c0590f;
                }
            }
            C0590f c0590f2 = new C0590f(this.f2654b, abstractC0585b);
            this.f2655c.add(c0590f2);
            return c0590f2;
        }
    }

    public C0590f(Context context, AbstractC0585b abstractC0585b) {
        this.f2651a = context;
        this.f2652b = abstractC0585b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2652b.mo73c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2652b.mo72d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0608f.m6a(this.f2651a, (InterfaceMenuC0422a) this.f2652b.mo71e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2652b.mo70f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2652b.mo69g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2652b.m81h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2652b.mo68i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2652b.m80j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2652b.mo67k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2652b.mo66l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2652b.mo65m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f2652b.mo64n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2652b.mo63o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2652b.m79p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f2652b.mo62q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2652b.mo61r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f2652b.mo60s(z);
    }
}
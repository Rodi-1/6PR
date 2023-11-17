package v;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import n.k;
import v.b;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f1908a;

    /* renamed from: b  reason: collision with root package name */
    final b f1909b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f1910a;

        /* renamed from: b  reason: collision with root package name */
        final Context f1911b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f1912c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final k<Menu, Menu> f1913d = new k<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1911b = context;
            this.f1910a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f1913d.get(menu);
            if (menu2 == null) {
                Menu a2 = w.f.a(this.f1911b, (k.a) menu);
                this.f1913d.put(menu, a2);
                return a2;
            }
            return menu2;
        }

        @Override // v.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f1910a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // v.b.a
        public void b(b bVar) {
            this.f1910a.onDestroyActionMode(e(bVar));
        }

        @Override // v.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f1910a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // v.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f1910a.onActionItemClicked(e(bVar), w.f.b(this.f1911b, (k.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f1912c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f1912c.get(i2);
                if (fVar != null && fVar.f1909b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1911b, bVar);
            this.f1912c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f1908a = context;
        this.f1909b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1909b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1909b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return w.f.a(this.f1908a, (k.a) this.f1909b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1909b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1909b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1909b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1909b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1909b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1909b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1909b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1909b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f1909b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1909b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1909b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f1909b.q(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1909b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1909b.s(z);
    }
}
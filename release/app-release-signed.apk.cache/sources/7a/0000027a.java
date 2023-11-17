package w;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class b<T> extends c<T> {

    /* renamed from: b  reason: collision with root package name */
    final Context f1978b;

    /* renamed from: c  reason: collision with root package name */
    private Map<k.b, MenuItem> f1979c;

    /* renamed from: d  reason: collision with root package name */
    private Map<k.c, SubMenu> f1980d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, T t2) {
        super(t2);
        this.f1978b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof k.b) {
            k.b bVar = (k.b) menuItem;
            if (this.f1979c == null) {
                this.f1979c = new n.a();
            }
            MenuItem menuItem2 = this.f1979c.get(menuItem);
            if (menuItem2 == null) {
                MenuItem b2 = f.b(this.f1978b, bVar);
                this.f1979c.put(bVar, b2);
                return b2;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof k.c) {
            k.c cVar = (k.c) subMenu;
            if (this.f1980d == null) {
                this.f1980d = new n.a();
            }
            SubMenu subMenu2 = this.f1980d.get(cVar);
            if (subMenu2 == null) {
                SubMenu c2 = f.c(this.f1978b, cVar);
                this.f1980d.put(cVar, c2);
                return c2;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Map<k.b, MenuItem> map = this.f1979c;
        if (map != null) {
            map.clear();
        }
        Map<k.c, SubMenu> map2 = this.f1980d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i2) {
        Map<k.b, MenuItem> map = this.f1979c;
        if (map == null) {
            return;
        }
        Iterator<k.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i2 == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i2) {
        Map<k.b, MenuItem> map = this.f1979c;
        if (map == null) {
            return;
        }
        Iterator<k.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i2 == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
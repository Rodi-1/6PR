package p024w;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p012k.InterfaceMenuItemC0423b;
import p012k.InterfaceSubMenuC0424c;
import p015n.C0445a;

/* renamed from: w.b */
/* loaded from: classes.dex */
abstract class AbstractC0599b<T> extends C0600c<T> {

    /* renamed from: b */
    final Context f2730b;

    /* renamed from: c */
    private Map<InterfaceMenuItemC0423b, MenuItem> f2731c;

    /* renamed from: d */
    private Map<InterfaceSubMenuC0424c, SubMenu> f2732d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0599b(Context context, T t) {
        super(t);
        this.f2730b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m24c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC0423b) {
            InterfaceMenuItemC0423b interfaceMenuItemC0423b = (InterfaceMenuItemC0423b) menuItem;
            if (this.f2731c == null) {
                this.f2731c = new C0445a();
            }
            MenuItem menuItem2 = this.f2731c.get(menuItem);
            if (menuItem2 == null) {
                MenuItem m5b = C0608f.m5b(this.f2730b, interfaceMenuItemC0423b);
                this.f2731c.put(interfaceMenuItemC0423b, m5b);
                return m5b;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m23d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC0424c) {
            InterfaceSubMenuC0424c interfaceSubMenuC0424c = (InterfaceSubMenuC0424c) subMenu;
            if (this.f2732d == null) {
                this.f2732d = new C0445a();
            }
            SubMenu subMenu2 = this.f2732d.get(interfaceSubMenuC0424c);
            if (subMenu2 == null) {
                SubMenu m4c = C0608f.m4c(this.f2730b, interfaceSubMenuC0424c);
                this.f2732d.put(interfaceSubMenuC0424c, m4c);
                return m4c;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m22e() {
        Map<InterfaceMenuItemC0423b, MenuItem> map = this.f2731c;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuC0424c, SubMenu> map2 = this.f2732d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m21f(int i) {
        Map<InterfaceMenuItemC0423b, MenuItem> map = this.f2731c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0423b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m20g(int i) {
        Map<InterfaceMenuItemC0423b, MenuItem> map = this.f2731c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0423b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
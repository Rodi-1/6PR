package android.support.p002v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.C0192e;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.m */
/* loaded from: classes.dex */
public class SubMenuC0208m extends C0192e implements SubMenu {

    /* renamed from: B */
    private C0192e f1024B;

    /* renamed from: C */
    private C0196g f1025C;

    public SubMenuC0208m(Context context, C0192e c0192e, C0196g c0196g) {
        super(context);
        this.f1024B = c0192e;
        this.f1025C = c0196g;
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: D */
    public C0192e mo1544D() {
        return this.f1024B.mo1544D();
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: F */
    public boolean mo1543F() {
        return this.f1024B.mo1543F();
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: G */
    public boolean mo1542G() {
        return this.f1024B.mo1542G();
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: H */
    public boolean mo1541H() {
        return this.f1024B.mo1541H();
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: R */
    public void mo1540R(C0192e.InterfaceC0193a interfaceC0193a) {
        this.f1024B.mo1540R(interfaceC0193a);
    }

    /* renamed from: e0 */
    public Menu m1539e0() {
        return this.f1024B;
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: f */
    public boolean mo1538f(C0196g c0196g) {
        return this.f1024B.mo1538f(c0196g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1025C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: h */
    public boolean mo1537h(C0192e c0192e, MenuItem menuItem) {
        return super.mo1537h(c0192e, menuItem) || this.f1024B.mo1537h(c0192e, menuItem);
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: k */
    public boolean mo1536k(C0196g c0196g) {
        return this.f1024B.mo1536k(c0196g);
    }

    @Override // android.support.p002v7.view.menu.C0192e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1024B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m1636U(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m1635V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m1633X(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m1632Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m1631Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1025C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1025C.setIcon(drawable);
        return this;
    }

    @Override // android.support.p002v7.view.menu.C0192e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1024B.setQwertyMode(z);
    }

    @Override // android.support.p002v7.view.menu.C0192e
    /* renamed from: t */
    public String mo1535t() {
        C0196g c0196g = this.f1025C;
        int itemId = c0196g != null ? c0196g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1535t() + ":" + itemId;
    }
}
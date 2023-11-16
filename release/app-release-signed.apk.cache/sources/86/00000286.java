package p024w;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p012k.InterfaceSubMenuC0424c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.i */
/* loaded from: classes.dex */
public class SubMenuC0611i extends MenuC0609g implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0611i(Context context, InterfaceSubMenuC0424c interfaceSubMenuC0424c) {
        super(context, interfaceSubMenuC0424c);
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m0h().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m24c(m0h().getItem());
    }

    /* renamed from: h */
    public InterfaceSubMenuC0424c m0h() {
        return (InterfaceSubMenuC0424c) this.f2733a;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m0h().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m0h().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m0h().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m0h().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m0h().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        m0h().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        m0h().setIcon(drawable);
        return this;
    }
}
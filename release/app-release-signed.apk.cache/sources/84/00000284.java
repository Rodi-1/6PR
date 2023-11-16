package p024w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p012k.InterfaceMenuC0422a;

/* renamed from: w.g */
/* loaded from: classes.dex */
class MenuC0609g extends AbstractC0599b<InterfaceMenuC0422a> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuC0609g(Context context, InterfaceMenuC0422a interfaceMenuC0422a) {
        super(context, interfaceMenuC0422a);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m24c(((InterfaceMenuC0422a) this.f2733a).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m24c(((InterfaceMenuC0422a) this.f2733a).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m24c(((InterfaceMenuC0422a) this.f2733a).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m24c(((InterfaceMenuC0422a) this.f2733a).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((InterfaceMenuC0422a) this.f2733a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m24c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m23d(((InterfaceMenuC0422a) this.f2733a).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m23d(((InterfaceMenuC0422a) this.f2733a).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m23d(((InterfaceMenuC0422a) this.f2733a).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m23d(((InterfaceMenuC0422a) this.f2733a).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m22e();
        ((InterfaceMenuC0422a) this.f2733a).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuC0422a) this.f2733a).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m24c(((InterfaceMenuC0422a) this.f2733a).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m24c(((InterfaceMenuC0422a) this.f2733a).getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuC0422a) this.f2733a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((InterfaceMenuC0422a) this.f2733a).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((InterfaceMenuC0422a) this.f2733a).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((InterfaceMenuC0422a) this.f2733a).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m21f(i);
        ((InterfaceMenuC0422a) this.f2733a).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m20g(i);
        ((InterfaceMenuC0422a) this.f2733a).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((InterfaceMenuC0422a) this.f2733a).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((InterfaceMenuC0422a) this.f2733a).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((InterfaceMenuC0422a) this.f2733a).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((InterfaceMenuC0422a) this.f2733a).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuC0422a) this.f2733a).size();
    }
}
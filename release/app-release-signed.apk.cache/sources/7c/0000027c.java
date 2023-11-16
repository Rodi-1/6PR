package p024w;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p012k.InterfaceMenuItemC0423b;
import p016o.AbstractC0471c;
import p023v.InterfaceC0587c;

/* renamed from: w.d */
/* loaded from: classes.dex */
public class MenuItemC0601d extends AbstractC0599b<InterfaceMenuItemC0423b> implements MenuItem {

    /* renamed from: e */
    private Method f2734e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.d$a */
    /* loaded from: classes.dex */
    public class C0602a extends AbstractC0471c {

        /* renamed from: d */
        final ActionProvider f2735d;

        public C0602a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2735d = actionProvider;
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: a */
        public boolean mo18a() {
            return this.f2735d.hasSubMenu();
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: c */
        public View mo17c() {
            return this.f2735d.onCreateActionView();
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: e */
        public boolean mo16e() {
            return this.f2735d.onPerformDefaultAction();
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: f */
        public void mo15f(SubMenu subMenu) {
            this.f2735d.onPrepareSubMenu(MenuItemC0601d.this.m23d(subMenu));
        }
    }

    /* renamed from: w.d$b */
    /* loaded from: classes.dex */
    static class C0603b extends FrameLayout implements InterfaceC0587c {

        /* renamed from: b */
        final CollapsibleActionView f2737b;

        C0603b(View view) {
            super(view.getContext());
            this.f2737b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p023v.InterfaceC0587c
        /* renamed from: a */
        public void mo14a() {
            this.f2737b.onActionViewExpanded();
        }

        /* renamed from: b */
        View m13b() {
            return (View) this.f2737b;
        }

        @Override // p023v.InterfaceC0587c
        /* renamed from: d */
        public void mo12d() {
            this.f2737b.onActionViewCollapsed();
        }
    }

    /* renamed from: w.d$c */
    /* loaded from: classes.dex */
    private class MenuItem$OnActionExpandListenerC0604c extends C0600c<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        MenuItem$OnActionExpandListenerC0604c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2733a).onMenuItemActionCollapse(MenuItemC0601d.this.m24c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2733a).onMenuItemActionExpand(MenuItemC0601d.this.m24c(menuItem));
        }
    }

    /* renamed from: w.d$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0605d extends C0600c<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerC0605d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f2733a).onMenuItemClick(MenuItemC0601d.this.m24c(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemC0601d(Context context, InterfaceMenuItemC0423b interfaceMenuItemC0423b) {
        super(context, interfaceMenuItemC0423b);
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((InterfaceMenuItemC0423b) this.f2733a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((InterfaceMenuItemC0423b) this.f2733a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0471c mo29b = ((InterfaceMenuItemC0423b) this.f2733a).mo29b();
        if (mo29b instanceof C0602a) {
            return ((C0602a) mo29b).f2735d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((InterfaceMenuItemC0423b) this.f2733a).getActionView();
        return actionView instanceof C0603b ? ((C0603b) actionView).m13b() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m23d(((InterfaceMenuItemC0423b) this.f2733a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((InterfaceMenuItemC0423b) this.f2733a).getTooltipText();
    }

    /* renamed from: h */
    C0602a mo11h(ActionProvider actionProvider) {
        return new C0602a(this.f2730b, actionProvider);
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((InterfaceMenuItemC0423b) this.f2733a).hasSubMenu();
    }

    /* renamed from: i */
    public void m19i(boolean z) {
        try {
            if (this.f2734e == null) {
                this.f2734e = ((InterfaceMenuItemC0423b) this.f2733a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f2734e.invoke(this.f2733a, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((InterfaceMenuItemC0423b) this.f2733a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((InterfaceMenuItemC0423b) this.f2733a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((InterfaceMenuItemC0423b) this.f2733a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((InterfaceMenuItemC0423b) this.f2733a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((InterfaceMenuItemC0423b) this.f2733a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((InterfaceMenuItemC0423b) this.f2733a).mo30a(actionProvider != null ? mo11h(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setActionView(i);
        View actionView = ((InterfaceMenuItemC0423b) this.f2733a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((InterfaceMenuItemC0423b) this.f2733a).setActionView(new C0603b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0603b(view);
        }
        ((InterfaceMenuItemC0423b) this.f2733a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        ((InterfaceMenuItemC0423b) this.f2733a).setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((InterfaceMenuItemC0423b) this.f2733a).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((InterfaceMenuItemC0423b) this.f2733a).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((InterfaceMenuItemC0423b) this.f2733a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((InterfaceMenuItemC0423b) this.f2733a).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((InterfaceMenuItemC0423b) this.f2733a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((InterfaceMenuItemC0423b) this.f2733a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((InterfaceMenuItemC0423b) this.f2733a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((InterfaceMenuItemC0423b) this.f2733a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        ((InterfaceMenuItemC0423b) this.f2733a).setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((InterfaceMenuItemC0423b) this.f2733a).setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC0604c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((InterfaceMenuItemC0423b) this.f2733a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0605d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        ((InterfaceMenuItemC0423b) this.f2733a).setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((InterfaceMenuItemC0423b) this.f2733a).setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((InterfaceMenuItemC0423b) this.f2733a).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((InterfaceMenuItemC0423b) this.f2733a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((InterfaceMenuItemC0423b) this.f2733a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((InterfaceMenuItemC0423b) this.f2733a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((InterfaceMenuItemC0423b) this.f2733a).setVisible(z);
    }
}
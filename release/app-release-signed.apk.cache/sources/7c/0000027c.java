package w;

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

/* loaded from: classes.dex */
public class d extends w.b<k.b> implements MenuItem {

    /* renamed from: e  reason: collision with root package name */
    private Method f1982e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends o.c {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f1983d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1983d = actionProvider;
        }

        @Override // o.c
        public boolean a() {
            return this.f1983d.hasSubMenu();
        }

        @Override // o.c
        public View c() {
            return this.f1983d.onCreateActionView();
        }

        @Override // o.c
        public boolean e() {
            return this.f1983d.onPerformDefaultAction();
        }

        @Override // o.c
        public void f(SubMenu subMenu) {
            this.f1983d.onPrepareSubMenu(d.this.d(subMenu));
        }
    }

    /* loaded from: classes.dex */
    static class b extends FrameLayout implements v.c {

        /* renamed from: b  reason: collision with root package name */
        final CollapsibleActionView f1985b;

        b(View view) {
            super(view.getContext());
            this.f1985b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // v.c
        public void a() {
            this.f1985b.onActionViewExpanded();
        }

        View b() {
            return (View) this.f1985b;
        }

        @Override // v.c
        public void d() {
            this.f1985b.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    private class c extends w.c<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1981a).onMenuItemActionCollapse(d.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1981a).onMenuItemActionExpand(d.this.c(menuItem));
        }
    }

    /* renamed from: w.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0025d extends w.c<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerC0025d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1981a).onMenuItemClick(d.this.c(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, k.b bVar) {
        super(context, bVar);
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((k.b) this.f1981a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((k.b) this.f1981a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        o.c b2 = ((k.b) this.f1981a).b();
        if (b2 instanceof a) {
            return ((a) b2).f1983d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((k.b) this.f1981a).getActionView();
        return actionView instanceof b ? ((b) actionView).b() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((k.b) this.f1981a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((k.b) this.f1981a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((k.b) this.f1981a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((k.b) this.f1981a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((k.b) this.f1981a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((k.b) this.f1981a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((k.b) this.f1981a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((k.b) this.f1981a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((k.b) this.f1981a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((k.b) this.f1981a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((k.b) this.f1981a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((k.b) this.f1981a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((k.b) this.f1981a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(((k.b) this.f1981a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((k.b) this.f1981a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((k.b) this.f1981a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((k.b) this.f1981a).getTooltipText();
    }

    a h(ActionProvider actionProvider) {
        return new a(this.f1978b, actionProvider);
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((k.b) this.f1981a).hasSubMenu();
    }

    public void i(boolean z) {
        try {
            if (this.f1982e == null) {
                this.f1982e = ((k.b) this.f1981a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1982e.invoke(this.f1981a, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((k.b) this.f1981a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((k.b) this.f1981a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((k.b) this.f1981a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((k.b) this.f1981a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((k.b) this.f1981a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((k.b) this.f1981a).a(actionProvider != null ? h(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        ((k.b) this.f1981a).setActionView(i2);
        View actionView = ((k.b) this.f1981a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((k.b) this.f1981a).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((k.b) this.f1981a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((k.b) this.f1981a).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        ((k.b) this.f1981a).setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((k.b) this.f1981a).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((k.b) this.f1981a).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((k.b) this.f1981a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((k.b) this.f1981a).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        ((k.b) this.f1981a).setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((k.b) this.f1981a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((k.b) this.f1981a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((k.b) this.f1981a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((k.b) this.f1981a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((k.b) this.f1981a).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        ((k.b) this.f1981a).setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((k.b) this.f1981a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((k.b) this.f1981a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0025d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((k.b) this.f1981a).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        ((k.b) this.f1981a).setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        ((k.b) this.f1981a).setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        ((k.b) this.f1981a).setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        ((k.b) this.f1981a).setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((k.b) this.f1981a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((k.b) this.f1981a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((k.b) this.f1981a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((k.b) this.f1981a).setVisible(z);
    }
}
package p024w;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p008g.C0386a;
import p011j.C0413a;
import p012k.InterfaceMenuItemC0423b;
import p016o.AbstractC0471c;

/* renamed from: w.a */
/* loaded from: classes.dex */
public class C0598a implements InterfaceMenuItemC0423b {

    /* renamed from: a */
    private final int f2708a;

    /* renamed from: b */
    private final int f2709b;

    /* renamed from: c */
    private final int f2710c;

    /* renamed from: d */
    private final int f2711d;

    /* renamed from: e */
    private CharSequence f2712e;

    /* renamed from: f */
    private CharSequence f2713f;

    /* renamed from: g */
    private Intent f2714g;

    /* renamed from: h */
    private char f2715h;

    /* renamed from: j */
    private char f2717j;

    /* renamed from: l */
    private Drawable f2719l;

    /* renamed from: n */
    private Context f2721n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f2722o;

    /* renamed from: p */
    private CharSequence f2723p;

    /* renamed from: q */
    private CharSequence f2724q;

    /* renamed from: i */
    private int f2716i = 4096;

    /* renamed from: k */
    private int f2718k = 4096;

    /* renamed from: m */
    private int f2720m = 0;

    /* renamed from: r */
    private ColorStateList f2725r = null;

    /* renamed from: s */
    private PorterDuff.Mode f2726s = null;

    /* renamed from: t */
    private boolean f2727t = false;

    /* renamed from: u */
    private boolean f2728u = false;

    /* renamed from: v */
    private int f2729v = 16;

    public C0598a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2721n = context;
        this.f2708a = i2;
        this.f2709b = i;
        this.f2710c = i3;
        this.f2711d = i4;
        this.f2712e = charSequence;
    }

    /* renamed from: c */
    private void m28c() {
        Drawable drawable = this.f2719l;
        if (drawable != null) {
            if (this.f2727t || this.f2728u) {
                Drawable m618p = C0413a.m618p(drawable);
                this.f2719l = m618p;
                Drawable mutate = m618p.mutate();
                this.f2719l = mutate;
                if (this.f2727t) {
                    C0413a.m620n(mutate, this.f2725r);
                }
                if (this.f2728u) {
                    C0413a.m619o(this.f2719l, this.f2726s);
                }
            }
        }
    }

    @Override // p012k.InterfaceMenuItemC0423b
    /* renamed from: a */
    public InterfaceMenuItemC0423b mo30a(AbstractC0471c abstractC0471c) {
        throw new UnsupportedOperationException();
    }

    @Override // p012k.InterfaceMenuItemC0423b
    /* renamed from: b */
    public AbstractC0471c mo29b() {
        return null;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    /* renamed from: d */
    public InterfaceMenuItemC0423b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    /* renamed from: e */
    public InterfaceMenuItemC0423b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    /* renamed from: f */
    public InterfaceMenuItemC0423b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2718k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2717j;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2723p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2709b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2719l;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2725r;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2726s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2714g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2708a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2716i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2715h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2711d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2712e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2713f;
        return charSequence != null ? charSequence : this.f2712e;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2724q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2729v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2729v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2729v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2729v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f2717j = Character.toLowerCase(c);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2717j = Character.toLowerCase(c);
        this.f2718k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f2729v = (z ? 1 : 0) | (this.f2729v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f2729v = (z ? 2 : 0) | (this.f2729v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0423b setContentDescription(CharSequence charSequence) {
        this.f2723p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f2729v = (z ? 16 : 0) | (this.f2729v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2720m = i;
        this.f2719l = C0386a.m734b(this.f2721n, i);
        m28c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2719l = drawable;
        this.f2720m = 0;
        m28c();
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2725r = colorStateList;
        this.f2727t = true;
        m28c();
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2726s = mode;
        this.f2728u = true;
        m28c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2714g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f2715h = c;
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f2715h = c;
        this.f2716i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2722o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2715h = c;
        this.f2717j = Character.toLowerCase(c2);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2715h = c;
        this.f2716i = KeyEvent.normalizeMetaState(i);
        this.f2717j = Character.toLowerCase(c2);
        this.f2718k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f2712e = this.f2721n.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2712e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2713f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0423b setTooltipText(CharSequence charSequence) {
        this.f2724q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f2729v = (this.f2729v & 8) | (z ? 0 : 8);
        return this;
    }
}
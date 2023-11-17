package w;

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

/* loaded from: classes.dex */
public class a implements k.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f1956a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1957b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1958c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1959d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1960e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1961f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1962g;

    /* renamed from: h  reason: collision with root package name */
    private char f1963h;

    /* renamed from: j  reason: collision with root package name */
    private char f1965j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1967l;

    /* renamed from: n  reason: collision with root package name */
    private Context f1969n;

    /* renamed from: o  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1970o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f1971p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f1972q;

    /* renamed from: i  reason: collision with root package name */
    private int f1964i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f1966k = 4096;

    /* renamed from: m  reason: collision with root package name */
    private int f1968m = 0;

    /* renamed from: r  reason: collision with root package name */
    private ColorStateList f1973r = null;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuff.Mode f1974s = null;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1975t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1976u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f1977v = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f1969n = context;
        this.f1956a = i3;
        this.f1957b = i2;
        this.f1958c = i4;
        this.f1959d = i5;
        this.f1960e = charSequence;
    }

    private void c() {
        Drawable drawable = this.f1967l;
        if (drawable != null) {
            if (this.f1975t || this.f1976u) {
                Drawable p2 = j.a.p(drawable);
                this.f1967l = p2;
                Drawable mutate = p2.mutate();
                this.f1967l = mutate;
                if (this.f1975t) {
                    j.a.n(mutate, this.f1973r);
                }
                if (this.f1976u) {
                    j.a.o(this.f1967l, this.f1974s);
                }
            }
        }
    }

    @Override // k.b
    public k.b a(o.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // k.b
    public o.c b() {
        return null;
    }

    @Override // k.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // k.b, android.view.MenuItem
    /* renamed from: d */
    public k.b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // k.b, android.view.MenuItem
    /* renamed from: e */
    public k.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // k.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // k.b, android.view.MenuItem
    /* renamed from: f */
    public k.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // k.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // k.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1966k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1965j;
    }

    @Override // k.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1971p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1957b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1967l;
    }

    @Override // k.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1973r;
    }

    @Override // k.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1974s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1962g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1956a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // k.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1964i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1963h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1959d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1960e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1961f;
        return charSequence != null ? charSequence : this.f1960e;
    }

    @Override // k.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1972q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // k.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1977v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1977v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1977v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1977v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1965j = Character.toLowerCase(c2);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1965j = Character.toLowerCase(c2);
        this.f1966k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1977v = (z ? 1 : 0) | (this.f1977v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1977v = (z ? 2 : 0) | (this.f1977v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public k.b setContentDescription(CharSequence charSequence) {
        this.f1971p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1977v = (z ? 16 : 0) | (this.f1977v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f1968m = i2;
        this.f1967l = g.a.b(this.f1969n, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1967l = drawable;
        this.f1968m = 0;
        c();
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1973r = colorStateList;
        this.f1975t = true;
        c();
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1974s = mode;
        this.f1976u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1962g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f1963h = c2;
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1963h = c2;
        this.f1964i = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1970o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1963h = c2;
        this.f1965j = Character.toLowerCase(c3);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1963h = c2;
        this.f1964i = KeyEvent.normalizeMetaState(i2);
        this.f1965j = Character.toLowerCase(c3);
        this.f1966k = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f1960e = this.f1969n.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1960e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1961f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public k.b setTooltipText(CharSequence charSequence) {
        this.f1972q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1977v = (this.f1977v & 8) | (z ? 0 : 8);
        return this;
    }
}
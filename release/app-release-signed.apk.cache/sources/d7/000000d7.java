package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.k;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.c;

/* loaded from: classes.dex */
public final class g implements k.b {
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    private View A;
    private o.c B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f752a;

    /* renamed from: b  reason: collision with root package name */
    private final int f753b;

    /* renamed from: c  reason: collision with root package name */
    private final int f754c;

    /* renamed from: d  reason: collision with root package name */
    private final int f755d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f756e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f757f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f758g;

    /* renamed from: h  reason: collision with root package name */
    private char f759h;

    /* renamed from: j  reason: collision with root package name */
    private char f761j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f763l;

    /* renamed from: n  reason: collision with root package name */
    e f765n;

    /* renamed from: o  reason: collision with root package name */
    private m f766o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f767p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f768q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f769r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f770s;
    private int z;

    /* renamed from: i  reason: collision with root package name */
    private int f760i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f762k = 4096;

    /* renamed from: m  reason: collision with root package name */
    private int f764m = 0;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f771t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f772u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f773v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f774w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements c.b {
        a() {
        }

        @Override // o.c.b
        public void onActionProviderVisibilityChanged(boolean z) {
            g gVar = g.this;
            gVar.f765n.J(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f765n = eVar;
        this.f752a = i3;
        this.f753b = i2;
        this.f754c = i4;
        this.f755d = i5;
        this.f756e = charSequence;
        this.z = i6;
    }

    private Drawable d(Drawable drawable) {
        if (drawable != null && this.x && (this.f773v || this.f774w)) {
            drawable = j.a.p(drawable).mutate();
            if (this.f773v) {
                j.a.n(drawable, this.f771t);
            }
            if (this.f774w) {
                j.a.o(drawable, this.f772u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // k.b
    public k.b a(o.c cVar) {
        o.c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.h();
        }
        this.A = null;
        this.B = cVar;
        this.f765n.K(true);
        o.c cVar3 = this.B;
        if (cVar3 != null) {
            cVar3.j(new a());
        }
        return this;
    }

    @Override // k.b
    public o.c b() {
        return this.B;
    }

    public void c() {
        this.f765n.I(this);
    }

    @Override // k.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f765n.f(this);
        }
        return false;
    }

    public int e() {
        return this.f755d;
    }

    @Override // k.b, android.view.MenuItem
    public boolean expandActionView() {
        if (i()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f765n.k(this);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char f() {
        return this.f765n.G() ? this.f761j : this.f759h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        String str;
        char f2 = f();
        if (f2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(F);
        if (f2 == '\b') {
            str = H;
        } else if (f2 == '\n') {
            str = G;
        } else if (f2 != ' ') {
            sb.append(f2);
            return sb.toString();
        } else {
            str = I;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // k.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        o.c cVar = this.B;
        if (cVar != null) {
            View d2 = cVar.d(this);
            this.A = d2;
            return d2;
        }
        return null;
    }

    @Override // k.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f762k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f761j;
    }

    @Override // k.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f769r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f753b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f763l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.f764m != 0) {
            Drawable d2 = t.b.d(this.f765n.u(), this.f764m);
            this.f764m = 0;
            this.f763l = d2;
            return d(d2);
        }
        return null;
    }

    @Override // k.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f771t;
    }

    @Override // k.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f772u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f758g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f752a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // k.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f760i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f759h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f754c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f766o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f756e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f757f;
        return charSequence != null ? charSequence : this.f756e;
    }

    @Override // k.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f770s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence h(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f766o != null;
    }

    public boolean i() {
        o.c cVar;
        if ((this.z & 8) != 0) {
            if (this.A == null && (cVar = this.B) != null) {
                this.A = cVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    @Override // k.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        o.c cVar = this.B;
        return (cVar == null || !cVar.g()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f768q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f765n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f767p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f758g != null) {
                try {
                    this.f765n.u().startActivity(this.f758g);
                    return true;
                } catch (ActivityNotFoundException e2) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                }
            }
            o.c cVar = this.B;
            return cVar != null && cVar.e();
        }
        return true;
    }

    public boolean k() {
        return (this.y & 32) == 32;
    }

    public boolean l() {
        return (this.y & 4) != 0;
    }

    public boolean m() {
        return (this.z & 1) == 1;
    }

    @Override // k.b, android.view.MenuItem
    /* renamed from: n */
    public k.b setActionView(int i2) {
        Context u2 = this.f765n.u();
        setActionView(LayoutInflater.from(u2).inflate(i2, (ViewGroup) new LinearLayout(u2), false));
        return this;
    }

    @Override // k.b, android.view.MenuItem
    /* renamed from: o */
    public k.b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f752a) > 0) {
            view.setId(i2);
        }
        this.f765n.I(this);
        return this;
    }

    public void p(boolean z) {
        this.D = z;
        this.f765n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.y = i3;
        if (i2 != i3) {
            this.f765n.K(false);
        }
    }

    public void r(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public boolean requiresActionButton() {
        return (this.z & 2) == 2;
    }

    public void s(boolean z) {
        this.y = z ? this.y | 32 : this.y & (-33);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f761j == c2) {
            return this;
        }
        this.f761j = Character.toLowerCase(c2);
        this.f765n.K(false);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f761j == c2 && this.f762k == i2) {
            return this;
        }
        this.f761j = Character.toLowerCase(c2);
        this.f762k = KeyEvent.normalizeMetaState(i2);
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.y = i3;
        if (i2 != i3) {
            this.f765n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.f765n.T(this);
        } else {
            q(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public k.b setContentDescription(CharSequence charSequence) {
        this.f769r = charSequence;
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.y = z ? this.y | 16 : this.y & (-17);
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f763l = null;
        this.f764m = i2;
        this.x = true;
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f764m = 0;
        this.f763l = drawable;
        this.x = true;
        this.f765n.K(false);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f771t = colorStateList;
        this.f773v = true;
        this.x = true;
        this.f765n.K(false);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f772u = mode;
        this.f774w = true;
        this.x = true;
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f758g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f759h == c2) {
            return this;
        }
        this.f759h = c2;
        this.f765n.K(false);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f759h == c2 && this.f760i == i2) {
            return this;
        }
        this.f759h = c2;
        this.f760i = KeyEvent.normalizeMetaState(i2);
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f768q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f759h = c2;
        this.f761j = Character.toLowerCase(c3);
        this.f765n.K(false);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f759h = c2;
        this.f760i = KeyEvent.normalizeMetaState(i2);
        this.f761j = Character.toLowerCase(c3);
        this.f762k = KeyEvent.normalizeMetaState(i3);
        this.f765n.K(false);
        return this;
    }

    @Override // k.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i2;
        this.f765n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f765n.u().getString(i2));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f756e = charSequence;
        this.f765n.K(false);
        m mVar = this.f766o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f757f = charSequence;
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public k.b setTooltipText(CharSequence charSequence) {
        this.f770s = charSequence;
        this.f765n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (w(z)) {
            this.f765n.J(this);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public String toString() {
        CharSequence charSequence = this.f756e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // k.b, android.view.MenuItem
    /* renamed from: u */
    public k.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void v(m mVar) {
        this.f766o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.y = i3;
        return i2 != i3;
    }

    public boolean x() {
        return this.f765n.A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        return this.f765n.H() && f() != 0;
    }

    public boolean z() {
        return (this.z & 4) == 4;
    }
}
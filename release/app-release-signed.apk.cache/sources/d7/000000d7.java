package android.support.p002v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.InterfaceC0203k;
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
import p011j.C0413a;
import p012k.InterfaceMenuItemC0423b;
import p016o.AbstractC0471c;
import p021t.C0580b;

/* renamed from: android.support.v7.view.menu.g */
/* loaded from: classes.dex */
public final class C0196g implements InterfaceMenuItemC0423b {

    /* renamed from: F */
    private static String f952F;

    /* renamed from: G */
    private static String f953G;

    /* renamed from: H */
    private static String f954H;

    /* renamed from: I */
    private static String f955I;

    /* renamed from: A */
    private View f956A;

    /* renamed from: B */
    private AbstractC0471c f957B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f958C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f960E;

    /* renamed from: a */
    private final int f961a;

    /* renamed from: b */
    private final int f962b;

    /* renamed from: c */
    private final int f963c;

    /* renamed from: d */
    private final int f964d;

    /* renamed from: e */
    private CharSequence f965e;

    /* renamed from: f */
    private CharSequence f966f;

    /* renamed from: g */
    private Intent f967g;

    /* renamed from: h */
    private char f968h;

    /* renamed from: j */
    private char f970j;

    /* renamed from: l */
    private Drawable f972l;

    /* renamed from: n */
    C0192e f974n;

    /* renamed from: o */
    private SubMenuC0208m f975o;

    /* renamed from: p */
    private Runnable f976p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f977q;

    /* renamed from: r */
    private CharSequence f978r;

    /* renamed from: s */
    private CharSequence f979s;

    /* renamed from: z */
    private int f986z;

    /* renamed from: i */
    private int f969i = 4096;

    /* renamed from: k */
    private int f971k = 4096;

    /* renamed from: m */
    private int f973m = 0;

    /* renamed from: t */
    private ColorStateList f980t = null;

    /* renamed from: u */
    private PorterDuff.Mode f981u = null;

    /* renamed from: v */
    private boolean f982v = false;

    /* renamed from: w */
    private boolean f983w = false;

    /* renamed from: x */
    private boolean f984x = false;

    /* renamed from: y */
    private int f985y = 16;

    /* renamed from: D */
    private boolean f959D = false;

    /* renamed from: android.support.v7.view.menu.g$a */
    /* loaded from: classes.dex */
    class C0197a implements AbstractC0471c.InterfaceC0473b {
        C0197a() {
        }

        @Override // p016o.AbstractC0471c.InterfaceC0473b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0196g c0196g = C0196g.this;
            c0196g.f974n.m1646J(c0196g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0196g(C0192e c0192e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f974n = c0192e;
        this.f961a = i2;
        this.f962b = i;
        this.f963c = i3;
        this.f964d = i4;
        this.f965e = charSequence;
        this.f986z = i5;
    }

    /* renamed from: d */
    private Drawable m1601d(Drawable drawable) {
        if (drawable != null && this.f984x && (this.f982v || this.f983w)) {
            drawable = C0413a.m618p(drawable).mutate();
            if (this.f982v) {
                C0413a.m620n(drawable, this.f980t);
            }
            if (this.f983w) {
                C0413a.m619o(drawable, this.f981u);
            }
            this.f984x = false;
        }
        return drawable;
    }

    @Override // p012k.InterfaceMenuItemC0423b
    /* renamed from: a */
    public InterfaceMenuItemC0423b mo30a(AbstractC0471c abstractC0471c) {
        AbstractC0471c abstractC0471c2 = this.f957B;
        if (abstractC0471c2 != null) {
            abstractC0471c2.m458h();
        }
        this.f956A = null;
        this.f957B = abstractC0471c;
        this.f974n.m1645K(true);
        AbstractC0471c abstractC0471c3 = this.f957B;
        if (abstractC0471c3 != null) {
            abstractC0471c3.mo7j(new C0197a());
        }
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b
    /* renamed from: b */
    public AbstractC0471c mo29b() {
        return this.f957B;
    }

    /* renamed from: c */
    public void m1602c() {
        this.f974n.m1647I(this);
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f986z & 8) == 0) {
            return false;
        }
        if (this.f956A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f958C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f974n.mo1538f(this);
        }
        return false;
    }

    /* renamed from: e */
    public int m1600e() {
        return this.f964d;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public boolean expandActionView() {
        if (m1596i()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f958C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f974n.mo1536k(this);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public char m1599f() {
        return this.f974n.mo1542G() ? this.f970j : this.f968h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m1598g() {
        String str;
        char m1599f = m1599f();
        if (m1599f == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f952F);
        if (m1599f == '\b') {
            str = f954H;
        } else if (m1599f == '\n') {
            str = f953G;
        } else if (m1599f != ' ') {
            sb.append(m1599f);
            return sb.toString();
        } else {
            str = f955I;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public View getActionView() {
        View view = this.f956A;
        if (view != null) {
            return view;
        }
        AbstractC0471c abstractC0471c = this.f957B;
        if (abstractC0471c != null) {
            View mo9d = abstractC0471c.mo9d(this);
            this.f956A = mo9d;
            return mo9d;
        }
        return null;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f971k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f970j;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f978r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f962b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f972l;
        if (drawable != null) {
            return m1601d(drawable);
        }
        if (this.f973m != 0) {
            Drawable m98d = C0580b.m98d(this.f974n.m1610u(), this.f973m);
            this.f973m = 0;
            this.f972l = m98d;
            return m1601d(m98d);
        }
        return null;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f980t;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f981u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f967g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f961a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f960E;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f969i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f968h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f963c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f975o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f965e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f966f;
        return charSequence != null ? charSequence : this.f965e;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f979s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public CharSequence m1597h(InterfaceC0203k.InterfaceC0204a interfaceC0204a) {
        return (interfaceC0204a == null || !interfaceC0204a.mo1559c()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f975o != null;
    }

    /* renamed from: i */
    public boolean m1596i() {
        AbstractC0471c abstractC0471c;
        if ((this.f986z & 8) != 0) {
            if (this.f956A == null && (abstractC0471c = this.f957B) != null) {
                this.f956A = abstractC0471c.mo9d(this);
            }
            return this.f956A != null;
        }
        return false;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f959D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f985y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f985y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f985y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0471c abstractC0471c = this.f957B;
        return (abstractC0471c == null || !abstractC0471c.mo8g()) ? (this.f985y & 8) == 0 : (this.f985y & 8) == 0 && this.f957B.mo10b();
    }

    /* renamed from: j */
    public boolean m1595j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f977q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C0192e c0192e = this.f974n;
            if (c0192e.mo1537h(c0192e, this)) {
                return true;
            }
            Runnable runnable = this.f976p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f967g != null) {
                try {
                    this.f974n.m1610u().startActivity(this.f967g);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            AbstractC0471c abstractC0471c = this.f957B;
            return abstractC0471c != null && abstractC0471c.mo16e();
        }
        return true;
    }

    /* renamed from: k */
    public boolean m1594k() {
        return (this.f985y & 32) == 32;
    }

    /* renamed from: l */
    public boolean m1593l() {
        return (this.f985y & 4) != 0;
    }

    /* renamed from: m */
    public boolean m1592m() {
        return (this.f986z & 1) == 1;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    /* renamed from: n */
    public InterfaceMenuItemC0423b setActionView(int i) {
        Context m1610u = this.f974n.m1610u();
        setActionView(LayoutInflater.from(m1610u).inflate(i, (ViewGroup) new LinearLayout(m1610u), false));
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    /* renamed from: o */
    public InterfaceMenuItemC0423b setActionView(View view) {
        int i;
        this.f956A = view;
        this.f957B = null;
        if (view != null && view.getId() == -1 && (i = this.f961a) > 0) {
            view.setId(i);
        }
        this.f974n.m1647I(this);
        return this;
    }

    /* renamed from: p */
    public void m1589p(boolean z) {
        this.f959D = z;
        this.f974n.m1645K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1588q(boolean z) {
        int i = this.f985y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f985y = i2;
        if (i != i2) {
            this.f974n.m1645K(false);
        }
    }

    /* renamed from: r */
    public void m1587r(boolean z) {
        this.f985y = (z ? 4 : 0) | (this.f985y & (-5));
    }

    public boolean requiresActionButton() {
        return (this.f986z & 2) == 2;
    }

    /* renamed from: s */
    public void m1586s(boolean z) {
        this.f985y = z ? this.f985y | 32 : this.f985y & (-33);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f970j == c) {
            return this;
        }
        this.f970j = Character.toLowerCase(c);
        this.f974n.m1645K(false);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f970j == c && this.f971k == i) {
            return this;
        }
        this.f970j = Character.toLowerCase(c);
        this.f971k = KeyEvent.normalizeMetaState(i);
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f985y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f985y = i2;
        if (i != i2) {
            this.f974n.m1645K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f985y & 4) != 0) {
            this.f974n.m1637T(this);
        } else {
            m1588q(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0423b setContentDescription(CharSequence charSequence) {
        this.f978r = charSequence;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f985y = z ? this.f985y | 16 : this.f985y & (-17);
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f972l = null;
        this.f973m = i;
        this.f984x = true;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f973m = 0;
        this.f972l = drawable;
        this.f984x = true;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f980t = colorStateList;
        this.f982v = true;
        this.f984x = true;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f981u = mode;
        this.f983w = true;
        this.f984x = true;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f967g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f968h == c) {
            return this;
        }
        this.f968h = c;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f968h == c && this.f969i == i) {
            return this;
        }
        this.f968h = c;
        this.f969i = KeyEvent.normalizeMetaState(i);
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f958C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f977q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f968h = c;
        this.f970j = Character.toLowerCase(c2);
        this.f974n.m1645K(false);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f968h = c;
        this.f969i = KeyEvent.normalizeMetaState(i);
        this.f970j = Character.toLowerCase(c2);
        this.f971k = KeyEvent.normalizeMetaState(i2);
        this.f974n.m1645K(false);
        return this;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f986z = i;
        this.f974n.m1647I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f974n.m1610u().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f965e = charSequence;
        this.f974n.m1645K(false);
        SubMenuC0208m subMenuC0208m = this.f975o;
        if (subMenuC0208m != null) {
            subMenuC0208m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f966f = charSequence;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0423b setTooltipText(CharSequence charSequence) {
        this.f979s = charSequence;
        this.f974n.m1645K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m1582w(z)) {
            this.f974n.m1646J(this);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1585t(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f960E = contextMenuInfo;
    }

    public String toString() {
        CharSequence charSequence = this.f965e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p012k.InterfaceMenuItemC0423b, android.view.MenuItem
    /* renamed from: u */
    public InterfaceMenuItemC0423b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: v */
    public void m1583v(SubMenuC0208m subMenuC0208m) {
        this.f975o = subMenuC0208m;
        subMenuC0208m.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m1582w(boolean z) {
        int i = this.f985y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f985y = i2;
        return i != i2;
    }

    /* renamed from: x */
    public boolean m1581x() {
        return this.f974n.m1651A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m1580y() {
        return this.f974n.mo1541H() && m1599f() != 0;
    }

    /* renamed from: z */
    public boolean m1579z() {
        return (this.f986z & 4) == 4;
    }
}
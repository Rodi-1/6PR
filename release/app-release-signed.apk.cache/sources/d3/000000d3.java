package android.support.p002v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p008g.C0386a;
import p012k.InterfaceMenuC0422a;
import p020s.C0570b;

/* renamed from: android.support.v7.view.menu.e */
/* loaded from: classes.dex */
public class C0192e implements InterfaceMenuC0422a {

    /* renamed from: A */
    private static final int[] f921A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f922a;

    /* renamed from: b */
    private final Resources f923b;

    /* renamed from: c */
    private boolean f924c;

    /* renamed from: d */
    private boolean f925d;

    /* renamed from: e */
    private InterfaceC0193a f926e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f934m;

    /* renamed from: n */
    CharSequence f935n;

    /* renamed from: o */
    Drawable f936o;

    /* renamed from: p */
    View f937p;

    /* renamed from: x */
    private C0196g f945x;

    /* renamed from: z */
    private boolean f947z;

    /* renamed from: l */
    private int f933l = 0;

    /* renamed from: q */
    private boolean f938q = false;

    /* renamed from: r */
    private boolean f939r = false;

    /* renamed from: s */
    private boolean f940s = false;

    /* renamed from: t */
    private boolean f941t = false;

    /* renamed from: u */
    private boolean f942u = false;

    /* renamed from: v */
    private ArrayList<C0196g> f943v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0201j>> f944w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f946y = false;

    /* renamed from: f */
    private ArrayList<C0196g> f927f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0196g> f928g = new ArrayList<>();

    /* renamed from: h */
    private boolean f929h = true;

    /* renamed from: i */
    private ArrayList<C0196g> f930i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0196g> f931j = new ArrayList<>();

    /* renamed from: k */
    private boolean f932k = true;

    /* renamed from: android.support.v7.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0193a {
        /* renamed from: a */
        void mo75a(C0192e c0192e);

        /* renamed from: b */
        boolean mo74b(C0192e c0192e, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0194b {
        /* renamed from: c */
        boolean mo1498c(C0196g c0196g);
    }

    public C0192e(Context context) {
        this.f922a = context;
        this.f923b = context.getResources();
        m1627b0(true);
    }

    /* renamed from: B */
    private static int m1650B(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f921A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m1642N(int i, boolean z) {
        if (i < 0 || i >= this.f927f.size()) {
            return;
        }
        this.f927f.remove(i);
        if (z) {
            m1645K(true);
        }
    }

    /* renamed from: W */
    private void m1634W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m1649C = m1649C();
        if (view != null) {
            this.f937p = view;
            this.f935n = null;
            this.f936o = null;
        } else {
            if (i > 0) {
                this.f935n = m1649C.getText(i);
            } else if (charSequence != null) {
                this.f935n = charSequence;
            }
            if (i2 > 0) {
                this.f936o = C0386a.m734b(m1610u(), i2);
            } else if (drawable != null) {
                this.f936o = drawable;
            }
            this.f937p = null;
        }
        m1645K(false);
    }

    /* renamed from: b0 */
    private void m1627b0(boolean z) {
        boolean z2 = true;
        this.f925d = (z && this.f923b.getConfiguration().keyboard != 1 && this.f923b.getBoolean(C0570b.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : false;
    }

    /* renamed from: g */
    private C0196g m1621g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0196g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m1620i(boolean z) {
        if (this.f944w.isEmpty()) {
            return;
        }
        m1623d0();
        Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0201j> next = it.next();
            InterfaceC0201j interfaceC0201j = next.get();
            if (interfaceC0201j == null) {
                this.f944w.remove(next);
            } else {
                interfaceC0201j.mo1343i(z);
            }
        }
        m1625c0();
    }

    /* renamed from: j */
    private boolean m1619j(SubMenuC0208m subMenuC0208m, InterfaceC0201j interfaceC0201j) {
        if (this.f944w.isEmpty()) {
            return false;
        }
        boolean mo1346b = interfaceC0201j != null ? interfaceC0201j.mo1346b(subMenuC0208m) : false;
        Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0201j> next = it.next();
            InterfaceC0201j interfaceC0201j2 = next.get();
            if (interfaceC0201j2 == null) {
                this.f944w.remove(next);
            } else if (!mo1346b) {
                mo1346b = interfaceC0201j2.mo1346b(subMenuC0208m);
            }
        }
        return mo1346b;
    }

    /* renamed from: n */
    private static int m1616n(ArrayList<C0196g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m1600e() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m1651A() {
        return this.f941t;
    }

    /* renamed from: C */
    Resources m1649C() {
        return this.f923b;
    }

    /* renamed from: D */
    public C0192e mo1544D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0196g> m1648E() {
        if (this.f929h) {
            this.f928g.clear();
            int size = this.f927f.size();
            for (int i = 0; i < size; i++) {
                C0196g c0196g = this.f927f.get(i);
                if (c0196g.isVisible()) {
                    this.f928g.add(c0196g);
                }
            }
            this.f929h = false;
            this.f932k = true;
            return this.f928g;
        }
        return this.f928g;
    }

    /* renamed from: F */
    public boolean mo1543F() {
        return this.f946y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo1542G() {
        return this.f924c;
    }

    /* renamed from: H */
    public boolean mo1541H() {
        return this.f925d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m1647I(C0196g c0196g) {
        this.f932k = true;
        m1645K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m1646J(C0196g c0196g) {
        this.f929h = true;
        m1645K(true);
    }

    /* renamed from: K */
    public void m1645K(boolean z) {
        if (this.f938q) {
            this.f939r = true;
            if (z) {
                this.f940s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f929h = true;
            this.f932k = true;
        }
        m1620i(z);
    }

    /* renamed from: L */
    public boolean m1644L(MenuItem menuItem, int i) {
        return m1643M(menuItem, null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        m1622e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return r1;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1643M(android.view.MenuItem r7, android.support.p002v7.view.menu.InterfaceC0201j r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.g r7 = (android.support.p002v7.view.menu.C0196g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.m1595j()
            o.c r2 = r7.mo29b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.mo18a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.m1596i()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.m1622e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.m1622e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            android.support.v7.view.menu.m r9 = new android.support.v7.view.menu.m
            android.content.Context r0 = r6.m1610u()
            r9.<init>(r0, r6, r7)
            r7.m1583v(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.m r7 = (android.support.p002v7.view.menu.SubMenuC0208m) r7
            if (r4 == 0) goto L63
            r2.mo15f(r7)
        L63:
            boolean r7 = r6.m1619j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.view.menu.C0192e.m1643M(android.view.MenuItem, android.support.v7.view.menu.j, int):boolean");
    }

    /* renamed from: O */
    public void m1641O(InterfaceC0201j interfaceC0201j) {
        Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0201j> next = it.next();
            InterfaceC0201j interfaceC0201j2 = next.get();
            if (interfaceC0201j2 == null || interfaceC0201j2 == interfaceC0201j) {
                this.f944w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m1640P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1535t());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0208m) item.getSubMenu()).m1640P(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: Q */
    public void m1639Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0208m) item.getSubMenu()).m1639Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1535t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo1540R(InterfaceC0193a interfaceC0193a) {
        this.f926e = interfaceC0193a;
    }

    /* renamed from: S */
    public C0192e m1638S(int i) {
        this.f933l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m1637T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f927f.size();
        m1623d0();
        for (int i = 0; i < size; i++) {
            C0196g c0196g = this.f927f.get(i);
            if (c0196g.getGroupId() == groupId && c0196g.m1593l() && c0196g.isCheckable()) {
                c0196g.m1588q(c0196g == menuItem);
            }
        }
        m1625c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public C0192e m1636U(int i) {
        m1634W(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public C0192e m1635V(Drawable drawable) {
        m1634W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public C0192e m1633X(int i) {
        m1634W(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0192e m1632Y(CharSequence charSequence) {
        m1634W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0192e m1631Z(View view) {
        m1634W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m1630a(int i, int i2, int i3, CharSequence charSequence) {
        int m1650B = m1650B(i3);
        C0196g m1621g = m1621g(i, i2, i3, m1650B, charSequence, this.f933l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f934m;
        if (contextMenuInfo != null) {
            m1621g.m1585t(contextMenuInfo);
        }
        ArrayList<C0196g> arrayList = this.f927f;
        arrayList.add(m1616n(arrayList, m1650B), m1621g);
        m1645K(true);
        return m1621g;
    }

    /* renamed from: a0 */
    public void m1629a0(boolean z) {
        this.f947z = z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m1630a(0, 0, 0, this.f923b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m1630a(i, i2, i3, this.f923b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1630a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1630a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f922a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f923b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f923b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0196g c0196g = (C0196g) m1630a(i, i2, i3, charSequence);
        SubMenuC0208m subMenuC0208m = new SubMenuC0208m(this.f922a, this, c0196g);
        c0196g.m1583v(subMenuC0208m);
        return subMenuC0208m;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m1628b(InterfaceC0201j interfaceC0201j) {
        m1626c(interfaceC0201j, this.f922a);
    }

    /* renamed from: c */
    public void m1626c(InterfaceC0201j interfaceC0201j, Context context) {
        this.f944w.add(new WeakReference<>(interfaceC0201j));
        interfaceC0201j.mo1342k(context, this);
        this.f932k = true;
    }

    /* renamed from: c0 */
    public void m1625c0() {
        this.f938q = false;
        if (this.f939r) {
            this.f939r = false;
            m1645K(this.f940s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0196g c0196g = this.f945x;
        if (c0196g != null) {
            mo1538f(c0196g);
        }
        this.f927f.clear();
        m1645K(true);
    }

    public void clearHeader() {
        this.f936o = null;
        this.f935n = null;
        this.f937p = null;
        m1645K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m1622e(true);
    }

    /* renamed from: d */
    public void m1624d() {
        InterfaceC0193a interfaceC0193a = this.f926e;
        if (interfaceC0193a != null) {
            interfaceC0193a.mo75a(this);
        }
    }

    /* renamed from: d0 */
    public void m1623d0() {
        if (this.f938q) {
            return;
        }
        this.f938q = true;
        this.f939r = false;
        this.f940s = false;
    }

    /* renamed from: e */
    public final void m1622e(boolean z) {
        if (this.f942u) {
            return;
        }
        this.f942u = true;
        Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0201j> next = it.next();
            InterfaceC0201j interfaceC0201j = next.get();
            if (interfaceC0201j == null) {
                this.f944w.remove(next);
            } else {
                interfaceC0201j.mo1347a(this, z);
            }
        }
        this.f942u = false;
    }

    /* renamed from: f */
    public boolean mo1538f(C0196g c0196g) {
        boolean z = false;
        if (!this.f944w.isEmpty() && this.f945x == c0196g) {
            m1623d0();
            Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0201j> next = it.next();
                InterfaceC0201j interfaceC0201j = next.get();
                if (interfaceC0201j == null) {
                    this.f944w.remove(next);
                } else {
                    z = interfaceC0201j.mo1412h(this, c0196g);
                    if (z) {
                        break;
                    }
                }
            }
            m1625c0();
            if (z) {
                this.f945x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0196g c0196g = this.f927f.get(i2);
            if (c0196g.getItemId() == i) {
                return c0196g;
            }
            if (c0196g.hasSubMenu() && (findItem = c0196g.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f927f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1537h(C0192e c0192e, MenuItem menuItem) {
        InterfaceC0193a interfaceC0193a = this.f926e;
        return interfaceC0193a != null && interfaceC0193a.mo74b(c0192e, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f947z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f927f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m1614p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo1536k(C0196g c0196g) {
        boolean z = false;
        if (this.f944w.isEmpty()) {
            return false;
        }
        m1623d0();
        Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0201j> next = it.next();
            InterfaceC0201j interfaceC0201j = next.get();
            if (interfaceC0201j == null) {
                this.f944w.remove(next);
            } else {
                z = interfaceC0201j.mo1413e(this, c0196g);
                if (z) {
                    break;
                }
            }
        }
        m1625c0();
        if (z) {
            this.f945x = c0196g;
        }
        return z;
    }

    /* renamed from: l */
    public int m1618l(int i) {
        return m1617m(i, 0);
    }

    /* renamed from: m */
    public int m1617m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f927f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m1615o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f927f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C0196g m1614p(int i, KeyEvent keyEvent) {
        ArrayList<C0196g> arrayList = this.f943v;
        arrayList.clear();
        m1613q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo1542G = mo1542G();
        for (int i2 = 0; i2 < size; i2++) {
            C0196g c0196g = arrayList.get(i2);
            char alphabeticShortcut = mo1542G ? c0196g.getAlphabeticShortcut() : c0196g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (mo1542G && alphabeticShortcut == '\b' && i == 67))) {
                return c0196g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m1644L(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0196g m1614p = m1614p(i, keyEvent);
        boolean m1644L = m1614p != null ? m1644L(m1614p, i2) : false;
        if ((i2 & 2) != 0) {
            m1622e(true);
        }
        return m1644L;
    }

    /* renamed from: q */
    void m1613q(List<C0196g> list, int i, KeyEvent keyEvent) {
        boolean mo1542G = mo1542G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f927f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0196g c0196g = this.f927f.get(i2);
                if (c0196g.hasSubMenu()) {
                    ((C0192e) c0196g.getSubMenu()).m1613q(list, i, keyEvent);
                }
                char alphabeticShortcut = mo1542G ? c0196g.getAlphabeticShortcut() : c0196g.getNumericShortcut();
                if (((modifiers & 69647) == ((mo1542G ? c0196g.getAlphabeticModifiers() : c0196g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo1542G && alphabeticShortcut == '\b' && i == 67)) && c0196g.isEnabled()) {
                        list.add(c0196g);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m1612r() {
        ArrayList<C0196g> m1648E = m1648E();
        if (this.f932k) {
            Iterator<WeakReference<InterfaceC0201j>> it = this.f944w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0201j> next = it.next();
                InterfaceC0201j interfaceC0201j = next.get();
                if (interfaceC0201j == null) {
                    this.f944w.remove(next);
                } else {
                    z |= interfaceC0201j.mo1344g();
                }
            }
            if (z) {
                this.f930i.clear();
                this.f931j.clear();
                int size = m1648E.size();
                for (int i = 0; i < size; i++) {
                    C0196g c0196g = m1648E.get(i);
                    (c0196g.m1594k() ? this.f930i : this.f931j).add(c0196g);
                }
            } else {
                this.f930i.clear();
                this.f931j.clear();
                this.f931j.addAll(m1648E());
            }
            this.f932k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m1618l = m1618l(i);
        if (m1618l >= 0) {
            int size = this.f927f.size() - m1618l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f927f.get(m1618l).getGroupId() != i) {
                    break;
                }
                m1642N(m1618l, false);
                i2 = i3;
            }
            m1645K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m1642N(m1615o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0196g> m1611s() {
        m1612r();
        return this.f930i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f927f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0196g c0196g = this.f927f.get(i2);
            if (c0196g.getGroupId() == i) {
                c0196g.m1587r(z2);
                c0196g.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f946y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f927f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0196g c0196g = this.f927f.get(i2);
            if (c0196g.getGroupId() == i) {
                c0196g.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f927f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0196g c0196g = this.f927f.get(i2);
            if (c0196g.getGroupId() == i && c0196g.m1582w(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m1645K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f924c = z;
        m1645K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f927f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public String mo1535t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m1610u() {
        return this.f922a;
    }

    /* renamed from: v */
    public C0196g m1609v() {
        return this.f945x;
    }

    /* renamed from: w */
    public Drawable m1608w() {
        return this.f936o;
    }

    /* renamed from: x */
    public CharSequence m1607x() {
        return this.f935n;
    }

    /* renamed from: y */
    public View m1606y() {
        return this.f937p;
    }

    /* renamed from: z */
    public ArrayList<C0196g> m1605z() {
        m1612r();
        return this.f931j;
    }
}
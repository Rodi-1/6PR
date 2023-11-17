package android.support.v7.view.menu;

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

/* loaded from: classes.dex */
public class e implements k.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f725a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f726b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f727c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f728d;

    /* renamed from: e  reason: collision with root package name */
    private a f729e;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f737m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f738n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f739o;

    /* renamed from: p  reason: collision with root package name */
    View f740p;
    private g x;
    private boolean z;

    /* renamed from: l  reason: collision with root package name */
    private int f736l = 0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f741q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f742r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f743s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f744t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f745u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<g> f746v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f747w = new CopyOnWriteArrayList<>();
    private boolean y = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f730f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f731g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f732h = true;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f733i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f734j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private boolean f735k = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);

        boolean b(e eVar, MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean c(g gVar);
    }

    public e(Context context) {
        this.f725a = context;
        this.f726b = context.getResources();
        b0(true);
    }

    private static int B(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f730f.size()) {
            return;
        }
        this.f730f.remove(i2);
        if (z) {
            K(true);
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f740p = view;
            this.f738n = null;
            this.f739o = null;
        } else {
            if (i2 > 0) {
                this.f738n = C.getText(i2);
            } else if (charSequence != null) {
                this.f738n = charSequence;
            }
            if (i3 > 0) {
                this.f739o = g.a.b(u(), i3);
            } else if (drawable != null) {
                this.f739o = drawable;
            }
            this.f740p = null;
        }
        K(false);
    }

    private void b0(boolean z) {
        boolean z2 = true;
        this.f728d = (z && this.f726b.getConfiguration().keyboard != 1 && this.f726b.getBoolean(s.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : false;
    }

    private g g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new g(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z) {
        if (this.f747w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f747w.remove(next);
            } else {
                jVar.i(z);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f747w.isEmpty()) {
            return false;
        }
        boolean b2 = jVar != null ? jVar.b(mVar) : false;
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f747w.remove(next);
            } else if (!b2) {
                b2 = jVar2.b(mVar);
            }
        }
        return b2;
    }

    private static int n(ArrayList<g> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).e() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f744t;
    }

    Resources C() {
        return this.f726b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (this.f732h) {
            this.f731g.clear();
            int size = this.f730f.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.f730f.get(i2);
                if (gVar.isVisible()) {
                    this.f731g.add(gVar);
                }
            }
            this.f732h = false;
            this.f735k = true;
            return this.f731g;
        }
        return this.f731g;
    }

    public boolean F() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.f727c;
    }

    public boolean H() {
        return this.f728d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(g gVar) {
        this.f735k = true;
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f732h = true;
        K(true);
    }

    public void K(boolean z) {
        if (this.f741q) {
            this.f742r = true;
            if (z) {
                this.f743s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f732h = true;
            this.f735k = true;
        }
        i(z);
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        e(true);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean M(android.view.MenuItem r7, android.support.v7.view.menu.j r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.g r7 = (android.support.v7.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.j()
            o.c r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.i()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
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
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            android.support.v7.view.menu.m r9 = new android.support.v7.view.menu.m
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.v(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.m r7 = (android.support.v7.view.menu.m) r7
            if (r4 == 0) goto L63
            r2.f(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.e.M(android.view.MenuItem, android.support.v7.view.menu.j, int):boolean");
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f747w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
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
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f729e = aVar;
    }

    public e S(int i2) {
        this.f736l = i2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f730f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f730f.get(i2);
            if (gVar.getGroupId() == groupId && gVar.l() && gVar.isCheckable()) {
                gVar.q(gVar == menuItem);
            }
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int B = B(i4);
        g g2 = g(i2, i3, i4, B, charSequence, this.f736l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f737m;
        if (contextMenuInfo != null) {
            g2.t(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f730f;
        arrayList.add(n(arrayList, B), g2);
        K(true);
        return g2;
    }

    public void a0(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f726b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f726b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f725a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f726b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f726b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        g gVar = (g) a(i2, i3, i4, charSequence);
        m mVar = new m(this.f725a, this, gVar);
        gVar.v(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f725a);
    }

    public void c(j jVar, Context context) {
        this.f747w.add(new WeakReference<>(jVar));
        jVar.k(context, this);
        this.f735k = true;
    }

    public void c0() {
        this.f741q = false;
        if (this.f742r) {
            this.f742r = false;
            K(this.f743s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.x;
        if (gVar != null) {
            f(gVar);
        }
        this.f730f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f739o = null;
        this.f738n = null;
        this.f740p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f729e;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void d0() {
        if (this.f741q) {
            return;
        }
        this.f741q = true;
        this.f742r = false;
        this.f743s = false;
    }

    public final void e(boolean z) {
        if (this.f745u) {
            return;
        }
        this.f745u = true;
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f747w.remove(next);
            } else {
                jVar.a(this, z);
            }
        }
        this.f745u = false;
    }

    public boolean f(g gVar) {
        boolean z = false;
        if (!this.f747w.isEmpty() && this.x == gVar) {
            d0();
            Iterator<WeakReference<j>> it = this.f747w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f747w.remove(next);
                } else {
                    z = jVar.h(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            c0();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f730f.get(i3);
            if (gVar.getItemId() == i2) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f730f.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f729e;
        return aVar != null && aVar.b(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f730f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z = false;
        if (this.f747w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f747w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f747w.remove(next);
            } else {
                z = jVar.e(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        c0();
        if (z) {
            this.x = gVar;
        }
        return z;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f730f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f730f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    g p(int i2, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f746v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
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
        boolean G = G();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = arrayList.get(i3);
            char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i2 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        g p2 = p(i2, keyEvent);
        boolean L = p2 != null ? L(p2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<g> list, int i2, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f730f.size();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = this.f730f.get(i3);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i2 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f735k) {
            Iterator<WeakReference<j>> it = this.f747w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f747w.remove(next);
                } else {
                    z |= jVar.g();
                }
            }
            if (z) {
                this.f733i.clear();
                this.f734j.clear();
                int size = E.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g gVar = E.get(i2);
                    (gVar.k() ? this.f733i : this.f734j).add(gVar);
                }
            } else {
                this.f733i.clear();
                this.f734j.clear();
                this.f734j.addAll(E());
            }
            this.f735k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int l2 = l(i2);
        if (l2 >= 0) {
            int size = this.f730f.size() - l2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f730f.get(l2).getGroupId() != i2) {
                    break;
                }
                N(l2, false);
                i3 = i4;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f733i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f730f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f730f.get(i3);
            if (gVar.getGroupId() == i2) {
                gVar.r(z2);
                gVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f730f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f730f.get(i3);
            if (gVar.getGroupId() == i2) {
                gVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f730f.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f730f.get(i3);
            if (gVar.getGroupId() == i2 && gVar.w(z)) {
                z2 = true;
            }
        }
        if (z2) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f727c = z;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f730f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f725a;
    }

    public g v() {
        return this.x;
    }

    public Drawable w() {
        return this.f739o;
    }

    public CharSequence x() {
        return this.f738n;
    }

    public View y() {
        return this.f740p;
    }

    public ArrayList<g> z() {
        r();
        return this.f734j;
    }
}
package p023v;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.p002v7.view.menu.C0196g;
import android.support.p002v7.widget.C0258e0;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p012k.InterfaceMenuC0422a;
import p016o.AbstractC0471c;
import p016o.C0479g;
import p020s.C0578j;
import p024w.MenuItemC0601d;

/* renamed from: v.g */
/* loaded from: classes.dex */
public class C0592g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f2657e;

    /* renamed from: f */
    static final Class<?>[] f2658f;

    /* renamed from: a */
    final Object[] f2659a;

    /* renamed from: b */
    final Object[] f2660b;

    /* renamed from: c */
    Context f2661c;

    /* renamed from: d */
    private Object f2662d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v.g$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC0593a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f2663c = {MenuItem.class};

        /* renamed from: a */
        private Object f2664a;

        /* renamed from: b */
        private Method f2665b;

        public MenuItem$OnMenuItemClickListenerC0593a(Object obj, String str) {
            this.f2664a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2665b = cls.getMethod(str, f2663c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2665b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2665b.invoke(this.f2664a, menuItem)).booleanValue();
                }
                this.f2665b.invoke(this.f2664a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v.g$b */
    /* loaded from: classes.dex */
    public class C0594b {

        /* renamed from: A */
        AbstractC0471c f2666A;

        /* renamed from: B */
        private CharSequence f2667B;

        /* renamed from: C */
        private CharSequence f2668C;

        /* renamed from: D */
        private ColorStateList f2669D = null;

        /* renamed from: E */
        private PorterDuff.Mode f2670E = null;

        /* renamed from: a */
        private Menu f2672a;

        /* renamed from: b */
        private int f2673b;

        /* renamed from: c */
        private int f2674c;

        /* renamed from: d */
        private int f2675d;

        /* renamed from: e */
        private int f2676e;

        /* renamed from: f */
        private boolean f2677f;

        /* renamed from: g */
        private boolean f2678g;

        /* renamed from: h */
        private boolean f2679h;

        /* renamed from: i */
        private int f2680i;

        /* renamed from: j */
        private int f2681j;

        /* renamed from: k */
        private CharSequence f2682k;

        /* renamed from: l */
        private CharSequence f2683l;

        /* renamed from: m */
        private int f2684m;

        /* renamed from: n */
        private char f2685n;

        /* renamed from: o */
        private int f2686o;

        /* renamed from: p */
        private char f2687p;

        /* renamed from: q */
        private int f2688q;

        /* renamed from: r */
        private int f2689r;

        /* renamed from: s */
        private boolean f2690s;

        /* renamed from: t */
        private boolean f2691t;

        /* renamed from: u */
        private boolean f2692u;

        /* renamed from: v */
        private int f2693v;

        /* renamed from: w */
        private int f2694w;

        /* renamed from: x */
        private String f2695x;

        /* renamed from: y */
        private String f2696y;

        /* renamed from: z */
        private String f2697z;

        public C0594b(Menu menu) {
            this.f2672a = menu;
            m43h();
        }

        /* renamed from: c */
        private char m48c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m46e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0592g.this.f2661c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m42i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f2690s).setVisible(this.f2691t).setEnabled(this.f2692u).setCheckable(this.f2689r >= 1).setTitleCondensed(this.f2683l).setIcon(this.f2684m);
            int i = this.f2693v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f2697z != null) {
                if (C0592g.this.f2661c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0593a(C0592g.this.m52b(), this.f2697z));
            }
            boolean z2 = menuItem instanceof C0196g;
            if (z2) {
                C0196g c0196g = (C0196g) menuItem;
            }
            if (this.f2689r >= 2) {
                if (z2) {
                    ((C0196g) menuItem).m1587r(true);
                } else if (menuItem instanceof MenuItemC0601d) {
                    ((MenuItemC0601d) menuItem).m19i(true);
                }
            }
            String str = this.f2695x;
            if (str != null) {
                menuItem.setActionView((View) m46e(str, C0592g.f2657e, C0592g.this.f2659a));
                z = true;
            }
            int i2 = this.f2694w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC0471c abstractC0471c = this.f2666A;
            if (abstractC0471c != null) {
                C0479g.m450a(menuItem, abstractC0471c);
            }
            C0479g.m448c(menuItem, this.f2667B);
            C0479g.m444g(menuItem, this.f2668C);
            C0479g.m449b(menuItem, this.f2685n, this.f2686o);
            C0479g.m445f(menuItem, this.f2687p, this.f2688q);
            PorterDuff.Mode mode = this.f2670E;
            if (mode != null) {
                C0479g.m446e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f2669D;
            if (colorStateList != null) {
                C0479g.m447d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m50a() {
            this.f2679h = true;
            m42i(this.f2672a.add(this.f2673b, this.f2680i, this.f2681j, this.f2682k));
        }

        /* renamed from: b */
        public SubMenu m49b() {
            this.f2679h = true;
            SubMenu addSubMenu = this.f2672a.addSubMenu(this.f2673b, this.f2680i, this.f2681j, this.f2682k);
            m42i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m47d() {
            return this.f2679h;
        }

        /* renamed from: f */
        public void m45f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0592g.this.f2661c.obtainStyledAttributes(attributeSet, C0578j.f2544e1);
            this.f2673b = obtainStyledAttributes.getResourceId(C0578j.f2552g1, 0);
            this.f2674c = obtainStyledAttributes.getInt(C0578j.f2560i1, 0);
            this.f2675d = obtainStyledAttributes.getInt(C0578j.f2564j1, 0);
            this.f2676e = obtainStyledAttributes.getInt(C0578j.f2568k1, 0);
            this.f2677f = obtainStyledAttributes.getBoolean(C0578j.f2556h1, true);
            this.f2678g = obtainStyledAttributes.getBoolean(C0578j.f2548f1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m44g(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0592g.this.f2661c.obtainStyledAttributes(attributeSet, C0578j.f2572l1);
            this.f2680i = obtainStyledAttributes.getResourceId(C0578j.f2584o1, 0);
            this.f2681j = (obtainStyledAttributes.getInt(C0578j.f2596r1, this.f2674c) & (-65536)) | (obtainStyledAttributes.getInt(C0578j.f2600s1, this.f2675d) & 65535);
            this.f2682k = obtainStyledAttributes.getText(C0578j.f2604t1);
            this.f2683l = obtainStyledAttributes.getText(C0578j.f2608u1);
            this.f2684m = obtainStyledAttributes.getResourceId(C0578j.f2576m1, 0);
            this.f2685n = m48c(obtainStyledAttributes.getString(C0578j.f2612v1));
            this.f2686o = obtainStyledAttributes.getInt(C0578j.f2431C1, 4096);
            this.f2687p = m48c(obtainStyledAttributes.getString(C0578j.f2616w1));
            this.f2688q = obtainStyledAttributes.getInt(C0578j.f2447G1, 4096);
            int i = C0578j.f2620x1;
            this.f2689r = obtainStyledAttributes.hasValue(i) ? obtainStyledAttributes.getBoolean(i, false) : this.f2676e;
            this.f2690s = obtainStyledAttributes.getBoolean(C0578j.f2588p1, false);
            this.f2691t = obtainStyledAttributes.getBoolean(C0578j.f2592q1, this.f2677f);
            this.f2692u = obtainStyledAttributes.getBoolean(C0578j.f2580n1, this.f2678g);
            this.f2693v = obtainStyledAttributes.getInt(C0578j.f2451H1, -1);
            this.f2697z = obtainStyledAttributes.getString(C0578j.f2624y1);
            this.f2694w = obtainStyledAttributes.getResourceId(C0578j.f2628z1, 0);
            this.f2695x = obtainStyledAttributes.getString(C0578j.f2427B1);
            String string = obtainStyledAttributes.getString(C0578j.f2423A1);
            this.f2696y = string;
            boolean z = string != null;
            if (z && this.f2694w == 0 && this.f2695x == null) {
                this.f2666A = (AbstractC0471c) m46e(string, C0592g.f2658f, C0592g.this.f2660b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2666A = null;
            }
            this.f2667B = obtainStyledAttributes.getText(C0578j.f2435D1);
            this.f2668C = obtainStyledAttributes.getText(C0578j.f2455I1);
            int i2 = C0578j.f2443F1;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.f2670E = C0258e0.m1321d(obtainStyledAttributes.getInt(i2, -1), this.f2670E);
            } else {
                this.f2670E = null;
            }
            int i3 = C0578j.f2439E1;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.f2669D = obtainStyledAttributes.getColorStateList(i3);
            } else {
                this.f2669D = null;
            }
            obtainStyledAttributes.recycle();
            this.f2679h = false;
        }

        /* renamed from: h */
        public void m43h() {
            this.f2673b = 0;
            this.f2674c = 0;
            this.f2675d = 0;
            this.f2676e = 0;
            this.f2677f = true;
            this.f2678g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f2657e = clsArr;
        f2658f = clsArr;
    }

    public C0592g(Context context) {
        super(context);
        this.f2661c = context;
        Object[] objArr = {context};
        this.f2659a = objArr;
        this.f2660b = objArr;
    }

    /* renamed from: a */
    private Object m53a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m53a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.m43h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.m47d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.f2666A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.mo18a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.m49b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.m50a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.m45f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.m44g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        m51c(r13, r14, r0.m49b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m51c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            v.g$b r0 = new v.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m43h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m47d()
            if (r15 != 0) goto Lb9
            o.c r15 = r0.f2666A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo18a()
            if (r15 == 0) goto L82
            r0.m49b()
            goto Lb9
        L82:
            r0.m50a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m45f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m44g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m49b()
            r12.m51c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p023v.C0592g.m51c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m52b() {
        if (this.f2662d == null) {
            this.f2662d = m53a(this.f2661c);
        }
        return this.f2662d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0422a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2661c.getResources().getLayout(i);
                    m51c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
package v;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v7.widget.e0;
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
import s.j;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f1914e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f1915f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f1916a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f1917b;

    /* renamed from: c  reason: collision with root package name */
    Context f1918c;

    /* renamed from: d  reason: collision with root package name */
    private Object f1919d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f1920c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f1921a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1922b;

        public a(Object obj, String str) {
            this.f1921a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1922b = cls.getMethod(str, f1920c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1922b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1922b.invoke(this.f1921a, menuItem)).booleanValue();
                }
                this.f1922b.invoke(this.f1921a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        o.c A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f1923a;

        /* renamed from: b  reason: collision with root package name */
        private int f1924b;

        /* renamed from: c  reason: collision with root package name */
        private int f1925c;

        /* renamed from: d  reason: collision with root package name */
        private int f1926d;

        /* renamed from: e  reason: collision with root package name */
        private int f1927e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1928f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1929g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1930h;

        /* renamed from: i  reason: collision with root package name */
        private int f1931i;

        /* renamed from: j  reason: collision with root package name */
        private int f1932j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f1933k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f1934l;

        /* renamed from: m  reason: collision with root package name */
        private int f1935m;

        /* renamed from: n  reason: collision with root package name */
        private char f1936n;

        /* renamed from: o  reason: collision with root package name */
        private int f1937o;

        /* renamed from: p  reason: collision with root package name */
        private char f1938p;

        /* renamed from: q  reason: collision with root package name */
        private int f1939q;

        /* renamed from: r  reason: collision with root package name */
        private int f1940r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f1941s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f1942t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f1943u;

        /* renamed from: v  reason: collision with root package name */
        private int f1944v;

        /* renamed from: w  reason: collision with root package name */
        private int f1945w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f1923a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.f1918c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f1941s).setVisible(this.f1942t).setEnabled(this.f1943u).setCheckable(this.f1940r >= 1).setTitleCondensed(this.f1934l).setIcon(this.f1935m);
            int i2 = this.f1944v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (g.this.f1918c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            boolean z2 = menuItem instanceof android.support.v7.view.menu.g;
            if (z2) {
                android.support.v7.view.menu.g gVar = (android.support.v7.view.menu.g) menuItem;
            }
            if (this.f1940r >= 2) {
                if (z2) {
                    ((android.support.v7.view.menu.g) menuItem).r(true);
                } else if (menuItem instanceof w.d) {
                    ((w.d) menuItem).i(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f1914e, g.this.f1916a));
                z = true;
            }
            int i3 = this.f1945w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            o.c cVar = this.A;
            if (cVar != null) {
                o.g.a(menuItem, cVar);
            }
            o.g.c(menuItem, this.B);
            o.g.g(menuItem, this.C);
            o.g.b(menuItem, this.f1936n, this.f1937o);
            o.g.f(menuItem, this.f1938p, this.f1939q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                o.g.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                o.g.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1930h = true;
            i(this.f1923a.add(this.f1924b, this.f1931i, this.f1932j, this.f1933k));
        }

        public SubMenu b() {
            this.f1930h = true;
            SubMenu addSubMenu = this.f1923a.addSubMenu(this.f1924b, this.f1931i, this.f1932j, this.f1933k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f1930h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f1918c.obtainStyledAttributes(attributeSet, j.e1);
            this.f1924b = obtainStyledAttributes.getResourceId(j.g1, 0);
            this.f1925c = obtainStyledAttributes.getInt(j.i1, 0);
            this.f1926d = obtainStyledAttributes.getInt(j.j1, 0);
            this.f1927e = obtainStyledAttributes.getInt(j.k1, 0);
            this.f1928f = obtainStyledAttributes.getBoolean(j.h1, true);
            this.f1929g = obtainStyledAttributes.getBoolean(j.f1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f1918c.obtainStyledAttributes(attributeSet, j.l1);
            this.f1931i = obtainStyledAttributes.getResourceId(j.o1, 0);
            this.f1932j = (obtainStyledAttributes.getInt(j.r1, this.f1925c) & (-65536)) | (obtainStyledAttributes.getInt(j.s1, this.f1926d) & 65535);
            this.f1933k = obtainStyledAttributes.getText(j.t1);
            this.f1934l = obtainStyledAttributes.getText(j.u1);
            this.f1935m = obtainStyledAttributes.getResourceId(j.m1, 0);
            this.f1936n = c(obtainStyledAttributes.getString(j.v1));
            this.f1937o = obtainStyledAttributes.getInt(j.C1, 4096);
            this.f1938p = c(obtainStyledAttributes.getString(j.w1));
            this.f1939q = obtainStyledAttributes.getInt(j.G1, 4096);
            int i2 = j.x1;
            this.f1940r = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getBoolean(i2, false) : this.f1927e;
            this.f1941s = obtainStyledAttributes.getBoolean(j.p1, false);
            this.f1942t = obtainStyledAttributes.getBoolean(j.q1, this.f1928f);
            this.f1943u = obtainStyledAttributes.getBoolean(j.n1, this.f1929g);
            this.f1944v = obtainStyledAttributes.getInt(j.H1, -1);
            this.z = obtainStyledAttributes.getString(j.y1);
            this.f1945w = obtainStyledAttributes.getResourceId(j.z1, 0);
            this.x = obtainStyledAttributes.getString(j.B1);
            String string = obtainStyledAttributes.getString(j.A1);
            this.y = string;
            boolean z = string != null;
            if (z && this.f1945w == 0 && this.x == null) {
                this.A = (o.c) e(string, g.f1915f, g.this.f1917b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = obtainStyledAttributes.getText(j.D1);
            this.C = obtainStyledAttributes.getText(j.I1);
            int i3 = j.F1;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.E = e0.d(obtainStyledAttributes.getInt(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = j.E1;
            if (obtainStyledAttributes.hasValue(i4)) {
                this.D = obtainStyledAttributes.getColorStateList(i4);
            } else {
                this.D = null;
            }
            obtainStyledAttributes.recycle();
            this.f1930h = false;
        }

        public void h() {
            this.f1924b = 0;
            this.f1925c = 0;
            this.f1926d = 0;
            this.f1927e = 0;
            this.f1928f = true;
            this.f1929g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1914e = clsArr;
        f1915f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f1918c = context;
        Object[] objArr = {context};
        this.f1916a = objArr;
        this.f1917b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
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
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
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
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
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
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            o.c r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
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
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
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
        throw new UnsupportedOperationException("Method not decompiled: v.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f1919d == null) {
            this.f1919d = a(this.f1918c);
        }
        return this.f1919d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof k.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1918c.getResources().getLayout(i2);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
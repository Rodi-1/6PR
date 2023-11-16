package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.graphics.drawable.C0039b;
import android.support.graphics.drawable.C0050h;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p008g.C0386a;
import p010i.C0398a;
import p011j.C0413a;
import p015n.C0445a;
import p015n.C0452f;
import p015n.C0453g;
import p015n.C0463l;
import p020s.C0569a;
import p020s.C0573e;

/* renamed from: android.support.v7.widget.k */
/* loaded from: classes.dex */
public final class C0283k {

    /* renamed from: i */
    private static C0283k f1394i;

    /* renamed from: a */
    private WeakHashMap<Context, C0463l<ColorStateList>> f1402a;

    /* renamed from: b */
    private C0445a<String, InterfaceC0286c> f1403b;

    /* renamed from: c */
    private C0463l<String> f1404c;

    /* renamed from: d */
    private final Object f1405d = new Object();

    /* renamed from: e */
    private final WeakHashMap<Context, C0452f<WeakReference<Drawable.ConstantState>>> f1406e = new WeakHashMap<>(0);

    /* renamed from: f */
    private TypedValue f1407f;

    /* renamed from: g */
    private boolean f1408g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1393h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final C0285b f1395j = new C0285b(6);

    /* renamed from: k */
    private static final int[] f1396k = {C0573e.abc_textfield_search_default_mtrl_alpha, C0573e.abc_textfield_default_mtrl_alpha, C0573e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: l */
    private static final int[] f1397l = {C0573e.abc_ic_commit_search_api_mtrl_alpha, C0573e.abc_seekbar_tick_mark_material, C0573e.abc_ic_menu_share_mtrl_alpha, C0573e.abc_ic_menu_copy_mtrl_am_alpha, C0573e.abc_ic_menu_cut_mtrl_alpha, C0573e.abc_ic_menu_selectall_mtrl_alpha, C0573e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: m */
    private static final int[] f1398m = {C0573e.abc_textfield_activated_mtrl_alpha, C0573e.abc_textfield_search_activated_mtrl_alpha, C0573e.abc_cab_background_top_mtrl_alpha, C0573e.abc_text_cursor_material, C0573e.abc_text_select_handle_left_mtrl_dark, C0573e.abc_text_select_handle_middle_mtrl_dark, C0573e.abc_text_select_handle_right_mtrl_dark, C0573e.abc_text_select_handle_left_mtrl_light, C0573e.abc_text_select_handle_middle_mtrl_light, C0573e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: n */
    private static final int[] f1399n = {C0573e.abc_popup_background_mtrl_mult, C0573e.abc_cab_background_internal_bg, C0573e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: o */
    private static final int[] f1400o = {C0573e.abc_tab_indicator_material, C0573e.abc_textfield_search_material};

    /* renamed from: p */
    private static final int[] f1401p = {C0573e.abc_btn_check_material, C0573e.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.k$a */
    /* loaded from: classes.dex */
    public static class C0284a implements InterfaceC0286c {
        C0284a() {
        }

        @Override // android.support.p002v7.widget.C0283k.InterfaceC0286c
        /* renamed from: a */
        public Drawable mo1198a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0039b.m2310a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.k$b */
    /* loaded from: classes.dex */
    public static class C0285b extends C0453g<Integer, PorterDuffColorFilter> {
        public C0285b(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m1201h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: i */
        PorterDuffColorFilter m1200i(int i, PorterDuff.Mode mode) {
            return m526c(Integer.valueOf(m1201h(i, mode)));
        }

        /* renamed from: j */
        PorterDuffColorFilter m1199j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m525d(Integer.valueOf(m1201h(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.k$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0286c {
        /* renamed from: a */
        Drawable mo1198a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.k$d */
    /* loaded from: classes.dex */
    public static class C0287d implements InterfaceC0286c {
        C0287d() {
        }

        @Override // android.support.p002v7.widget.C0283k.InterfaceC0286c
        /* renamed from: a */
        public Drawable mo1198a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0050h.m2275c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: A */
    private static void m1231A(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0258e0.m1324a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1393h;
        }
        drawable.setColorFilter(m1210r(i, mode));
    }

    /* renamed from: B */
    private Drawable m1230B(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m1209s = m1209s(context, i);
        if (m1209s != null) {
            if (C0258e0.m1324a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m618p = C0413a.m618p(drawable);
            C0413a.m620n(m618p, m1209s);
            PorterDuff.Mode m1207u = m1207u(i);
            if (m1207u != null) {
                C0413a.m619o(m618p, m1207u);
                return m618p;
            }
            return m618p;
        } else if (i == C0573e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int i2 = C0569a.colorControlNormal;
            int m1140b = C0306q0.m1140b(context, i2);
            PorterDuff.Mode mode = f1393h;
            m1231A(findDrawableByLayerId, m1140b, mode);
            m1231A(layerDrawable.findDrawableByLayerId(16908303), C0306q0.m1140b(context, i2), mode);
            m1231A(layerDrawable.findDrawableByLayerId(16908301), C0306q0.m1140b(context, C0569a.colorControlActivated), mode);
            return drawable;
        } else if (i != C0573e.abc_ratingbar_material && i != C0573e.abc_ratingbar_indicator_material && i != C0573e.abc_ratingbar_small_material) {
            if (m1228D(context, i, drawable) || !z) {
                return drawable;
            }
            return null;
        } else {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int m1141a = C0306q0.m1141a(context, C0569a.colorControlNormal);
            PorterDuff.Mode mode2 = f1393h;
            m1231A(findDrawableByLayerId2, m1141a, mode2);
            Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
            int i3 = C0569a.colorControlActivated;
            m1231A(findDrawableByLayerId3, C0306q0.m1140b(context, i3), mode2);
            m1231A(layerDrawable2.findDrawableByLayerId(16908301), C0306q0.m1140b(context, i3), mode2);
            return drawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m1229C(Drawable drawable, C0312t0 c0312t0, int[] iArr) {
        if (C0258e0.m1324a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = c0312t0.f1501d;
        if (z || c0312t0.f1500c) {
            drawable.setColorFilter(m1215m(z ? c0312t0.f1498a : null, c0312t0.f1500c ? c0312t0.f1499b : f1393h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[RETURN] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1228D(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = android.support.p002v7.widget.C0283k.f1393h
            int[] r1 = android.support.p002v7.widget.C0283k.f1396k
            boolean r1 = m1224d(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = p020s.C0569a.colorControlNormal
        L12:
            r7 = -1
        L13:
            r1 = 1
            goto L42
        L15:
            int[] r1 = android.support.p002v7.widget.C0283k.f1398m
            boolean r1 = m1224d(r1, r7)
            if (r1 == 0) goto L20
            int r2 = p020s.C0569a.colorControlActivated
            goto L12
        L20:
            int[] r1 = android.support.p002v7.widget.C0283k.f1399n
            boolean r1 = m1224d(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = p020s.C0573e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L13
        L3a:
            int r1 = p020s.C0573e.abc_dialog_material_background
            if (r7 != r1) goto L3f
            goto L12
        L3f:
            r7 = -1
            r1 = 0
            r2 = 0
        L42:
            if (r1 == 0) goto L5f
            boolean r1 = android.support.p002v7.widget.C0258e0.m1324a(r8)
            if (r1 == 0) goto L4e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L4e:
            int r6 = android.support.p002v7.widget.C0306q0.m1140b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m1210r(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L5e
            r8.setAlpha(r7)
        L5e:
            return r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0283k.m1228D(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private void m1227a(String str, InterfaceC0286c interfaceC0286c) {
        if (this.f1403b == null) {
            this.f1403b = new C0445a<>();
        }
        this.f1403b.put(str, interfaceC0286c);
    }

    /* renamed from: b */
    private boolean m1226b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.f1405d) {
                C0452f<WeakReference<Drawable.ConstantState>> c0452f = this.f1406e.get(context);
                if (c0452f == null) {
                    c0452f = new C0452f<>();
                    this.f1406e.put(context, c0452f);
                }
                c0452f.m531h(j, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m1225c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1402a == null) {
            this.f1402a = new WeakHashMap<>();
        }
        C0463l<ColorStateList> c0463l = this.f1402a.get(context);
        if (c0463l == null) {
            c0463l = new C0463l<>();
            this.f1402a.put(context, c0463l);
        }
        c0463l.m487a(i, colorStateList);
    }

    /* renamed from: d */
    private static boolean m1224d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m1223e(Context context) {
        if (this.f1408g) {
            return;
        }
        this.f1408g = true;
        Drawable m1212p = m1212p(context, C0573e.abc_vector_test);
        if (m1212p == null || !m1205w(m1212p)) {
            this.f1408g = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: f */
    private ColorStateList m1222f(Context context) {
        return m1221g(context, 0);
    }

    /* renamed from: g */
    private ColorStateList m1221g(Context context, int i) {
        int m1140b = C0306q0.m1140b(context, C0569a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0306q0.f1478b, C0306q0.f1481e, C0306q0.f1479c, C0306q0.f1485i}, new int[]{C0306q0.m1141a(context, C0569a.colorButtonNormal), C0398a.m695b(m1140b, i), C0398a.m695b(m1140b, i), i});
    }

    /* renamed from: h */
    private static long m1220h(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: i */
    private ColorStateList m1219i(Context context) {
        return m1221g(context, C0306q0.m1140b(context, C0569a.colorAccent));
    }

    /* renamed from: j */
    private ColorStateList m1218j(Context context) {
        return m1221g(context, C0306q0.m1140b(context, C0569a.colorButtonNormal));
    }

    /* renamed from: k */
    private Drawable m1217k(Context context, int i) {
        if (this.f1407f == null) {
            this.f1407f = new TypedValue();
        }
        TypedValue typedValue = this.f1407f;
        context.getResources().getValue(i, typedValue, true);
        long m1220h = m1220h(typedValue);
        Drawable m1213o = m1213o(context, m1220h);
        if (m1213o != null) {
            return m1213o;
        }
        if (i == C0573e.abc_cab_background_top_material) {
            m1213o = new LayerDrawable(new Drawable[]{m1212p(context, C0573e.abc_cab_background_internal_bg), m1212p(context, C0573e.abc_cab_background_top_mtrl_alpha)});
        }
        if (m1213o != null) {
            m1213o.setChangingConfigurations(typedValue.changingConfigurations);
            m1226b(context, m1220h, m1213o);
        }
        return m1213o;
    }

    /* renamed from: l */
    private ColorStateList m1216l(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        int i = C0569a.colorSwitchThumbNormal;
        ColorStateList m1138d = C0306q0.m1138d(context, i);
        if (m1138d == null || !m1138d.isStateful()) {
            iArr[0] = C0306q0.f1478b;
            iArr2[0] = C0306q0.m1141a(context, i);
            iArr[1] = C0306q0.f1482f;
            iArr2[1] = C0306q0.m1140b(context, C0569a.colorControlActivated);
            iArr[2] = C0306q0.f1485i;
            iArr2[2] = C0306q0.m1140b(context, i);
        } else {
            iArr[0] = C0306q0.f1478b;
            iArr2[0] = m1138d.getColorForState(iArr[0], 0);
            iArr[1] = C0306q0.f1482f;
            iArr2[1] = C0306q0.m1140b(context, C0569a.colorControlActivated);
            iArr[2] = C0306q0.f1485i;
            iArr2[2] = m1138d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: m */
    private static PorterDuffColorFilter m1215m(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1210r(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: n */
    public static C0283k m1214n() {
        if (f1394i == null) {
            C0283k c0283k = new C0283k();
            f1394i = c0283k;
            m1206v(c0283k);
        }
        return f1394i;
    }

    /* renamed from: o */
    private Drawable m1213o(Context context, long j) {
        synchronized (this.f1405d) {
            C0452f<WeakReference<Drawable.ConstantState>> c0452f = this.f1406e.get(context);
            if (c0452f == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> m534e = c0452f.m534e(j);
            if (m534e != null) {
                Drawable.ConstantState constantState = m534e.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                c0452f.m536c(j);
            }
            return null;
        }
    }

    /* renamed from: r */
    public static PorterDuffColorFilter m1210r(int i, PorterDuff.Mode mode) {
        C0285b c0285b = f1395j;
        PorterDuffColorFilter m1200i = c0285b.m1200i(i, mode);
        if (m1200i == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            c0285b.m1199j(i, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return m1200i;
    }

    /* renamed from: t */
    private ColorStateList m1208t(Context context, int i) {
        C0463l<ColorStateList> c0463l;
        WeakHashMap<Context, C0463l<ColorStateList>> weakHashMap = this.f1402a;
        if (weakHashMap == null || (c0463l = weakHashMap.get(context)) == null) {
            return null;
        }
        return c0463l.m482f(i);
    }

    /* renamed from: u */
    static PorterDuff.Mode m1207u(int i) {
        if (i == C0573e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: v */
    private static void m1206v(C0283k c0283k) {
        if (Build.VERSION.SDK_INT < 24) {
            c0283k.m1227a("vector", new C0287d());
            c0283k.m1227a("animated-vector", new C0284a());
        }
    }

    /* renamed from: w */
    private static boolean m1205w(Drawable drawable) {
        return (drawable instanceof C0050h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: x */
    private Drawable m1204x(Context context, int i) {
        int next;
        C0445a<String, InterfaceC0286c> c0445a = this.f1403b;
        if (c0445a == null || c0445a.isEmpty()) {
            return null;
        }
        C0463l<String> c0463l = this.f1404c;
        if (c0463l != null) {
            String m482f = c0463l.m482f(i);
            if ("appcompat_skip_skip".equals(m482f) || (m482f != null && this.f1403b.get(m482f) == null)) {
                return null;
            }
        } else {
            this.f1404c = new C0463l<>();
        }
        if (this.f1407f == null) {
            this.f1407f = new TypedValue();
        }
        TypedValue typedValue = this.f1407f;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m1220h = m1220h(typedValue);
        Drawable m1213o = m1213o(context, m1220h);
        if (m1213o != null) {
            return m1213o;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1404c.m487a(i, name);
                InterfaceC0286c interfaceC0286c = this.f1403b.get(name);
                if (interfaceC0286c != null) {
                    m1213o = interfaceC0286c.mo1198a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m1213o != null) {
                    m1213o.setChangingConfigurations(typedValue.changingConfigurations);
                    m1226b(context, m1220h, m1213o);
                }
            } catch (Exception e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        if (m1213o == null) {
            this.f1404c.m487a(i, "appcompat_skip_skip");
        }
        return m1213o;
    }

    /* renamed from: p */
    public Drawable m1212p(Context context, int i) {
        return m1211q(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public Drawable m1211q(Context context, int i, boolean z) {
        m1223e(context);
        Drawable m1204x = m1204x(context, i);
        if (m1204x == null) {
            m1204x = m1217k(context, i);
        }
        if (m1204x == null) {
            m1204x = C0386a.m734b(context, i);
        }
        if (m1204x != null) {
            m1204x = m1230B(context, i, z, m1204x);
        }
        if (m1204x != null) {
            C0258e0.m1323b(m1204x);
        }
        return m1204x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.res.ColorStateList m1209s(android.content.Context r3, int r4) {
        /*
            r2 = this;
            android.content.res.ColorStateList r0 = r2.m1208t(r3, r4)
            if (r0 != 0) goto L7a
            int r1 = p020s.C0573e.abc_edit_text_material
            if (r4 != r1) goto L12
            int r0 = p020s.C0571c.abc_tint_edittext
        Lc:
            android.content.res.ColorStateList r0 = p021t.C0580b.m99c(r3, r0)
            goto L75
        L12:
            int r1 = p020s.C0573e.abc_switch_track_mtrl_alpha
            if (r4 != r1) goto L19
            int r0 = p020s.C0571c.abc_tint_switch_track
            goto Lc
        L19:
            int r1 = p020s.C0573e.abc_switch_thumb_material
            if (r4 != r1) goto L22
            android.content.res.ColorStateList r0 = r2.m1216l(r3)
            goto L75
        L22:
            int r1 = p020s.C0573e.abc_btn_default_mtrl_shape
            if (r4 != r1) goto L2b
            android.content.res.ColorStateList r0 = r2.m1218j(r3)
            goto L75
        L2b:
            int r1 = p020s.C0573e.abc_btn_borderless_material
            if (r4 != r1) goto L34
            android.content.res.ColorStateList r0 = r2.m1222f(r3)
            goto L75
        L34:
            int r1 = p020s.C0573e.abc_btn_colored_material
            if (r4 != r1) goto L3d
            android.content.res.ColorStateList r0 = r2.m1219i(r3)
            goto L75
        L3d:
            int r1 = p020s.C0573e.abc_spinner_mtrl_am_alpha
            if (r4 == r1) goto L72
            int r1 = p020s.C0573e.abc_spinner_textfield_background_material
            if (r4 != r1) goto L46
            goto L72
        L46:
            int[] r1 = android.support.p002v7.widget.C0283k.f1397l
            boolean r1 = m1224d(r1, r4)
            if (r1 == 0) goto L55
            int r0 = p020s.C0569a.colorControlNormal
            android.content.res.ColorStateList r0 = android.support.p002v7.widget.C0306q0.m1138d(r3, r0)
            goto L75
        L55:
            int[] r1 = android.support.p002v7.widget.C0283k.f1400o
            boolean r1 = m1224d(r1, r4)
            if (r1 == 0) goto L60
            int r0 = p020s.C0571c.abc_tint_default
            goto Lc
        L60:
            int[] r1 = android.support.p002v7.widget.C0283k.f1401p
            boolean r1 = m1224d(r1, r4)
            if (r1 == 0) goto L6b
            int r0 = p020s.C0571c.abc_tint_btn_checkable
            goto Lc
        L6b:
            int r1 = p020s.C0573e.abc_seekbar_thumb_material
            if (r4 != r1) goto L75
            int r0 = p020s.C0571c.abc_tint_seek_thumb
            goto Lc
        L72:
            int r0 = p020s.C0571c.abc_tint_spinner
            goto Lc
        L75:
            if (r0 == 0) goto L7a
            r2.m1225c(r3, r4, r0)
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0283k.m1209s(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: y */
    public void m1203y(Context context) {
        synchronized (this.f1405d) {
            C0452f<WeakReference<Drawable.ConstantState>> c0452f = this.f1406e.get(context);
            if (c0452f != null) {
                c0452f.m538a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public Drawable m1202z(Context context, C0241a1 c0241a1, int i) {
        Drawable m1204x = m1204x(context, i);
        if (m1204x == null) {
            m1204x = c0241a1.m1397b(i);
        }
        if (m1204x != null) {
            return m1230B(context, i, false, m1204x);
        }
        return null;
    }
}
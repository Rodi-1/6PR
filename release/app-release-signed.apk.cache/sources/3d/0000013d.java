package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: i  reason: collision with root package name */
    private static k f1092i;

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, n.l<ColorStateList>> f1100a;

    /* renamed from: b  reason: collision with root package name */
    private n.a<String, c> f1101b;

    /* renamed from: c  reason: collision with root package name */
    private n.l<String> f1102c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f1103d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final WeakHashMap<Context, n.f<WeakReference<Drawable.ConstantState>>> f1104e = new WeakHashMap<>(0);

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f1105f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1106g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1091h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final b f1093j = new b(6);

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f1094k = {s.e.abc_textfield_search_default_mtrl_alpha, s.e.abc_textfield_default_mtrl_alpha, s.e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f1095l = {s.e.abc_ic_commit_search_api_mtrl_alpha, s.e.abc_seekbar_tick_mark_material, s.e.abc_ic_menu_share_mtrl_alpha, s.e.abc_ic_menu_copy_mtrl_am_alpha, s.e.abc_ic_menu_cut_mtrl_alpha, s.e.abc_ic_menu_selectall_mtrl_alpha, s.e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f1096m = {s.e.abc_textfield_activated_mtrl_alpha, s.e.abc_textfield_search_activated_mtrl_alpha, s.e.abc_cab_background_top_mtrl_alpha, s.e.abc_text_cursor_material, s.e.abc_text_select_handle_left_mtrl_dark, s.e.abc_text_select_handle_middle_mtrl_dark, s.e.abc_text_select_handle_right_mtrl_dark, s.e.abc_text_select_handle_left_mtrl_light, s.e.abc_text_select_handle_middle_mtrl_light, s.e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f1097n = {s.e.abc_popup_background_mtrl_mult, s.e.abc_cab_background_internal_bg, s.e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f1098o = {s.e.abc_tab_indicator_material, s.e.abc_textfield_search_material};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f1099p = {s.e.abc_btn_check_material, s.e.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements c {
        a() {
        }

        @Override // android.support.v7.widget.k.c
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return android.support.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends n.g<Integer, PorterDuffColorFilter> {
        public b(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i2, mode)));
        }

        PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements c {
        d() {
        }

        @Override // android.support.v7.widget.k.c
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return android.support.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private static void A(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1091h;
        }
        drawable.setColorFilter(r(i2, mode));
    }

    private Drawable B(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList s2 = s(context, i2);
        if (s2 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable p2 = j.a.p(drawable);
            j.a.n(p2, s2);
            PorterDuff.Mode u2 = u(i2);
            if (u2 != null) {
                j.a.o(p2, u2);
                return p2;
            }
            return p2;
        } else if (i2 == s.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int i3 = s.a.colorControlNormal;
            int b2 = q0.b(context, i3);
            PorterDuff.Mode mode = f1091h;
            A(findDrawableByLayerId, b2, mode);
            A(layerDrawable.findDrawableByLayerId(16908303), q0.b(context, i3), mode);
            A(layerDrawable.findDrawableByLayerId(16908301), q0.b(context, s.a.colorControlActivated), mode);
            return drawable;
        } else if (i2 != s.e.abc_ratingbar_material && i2 != s.e.abc_ratingbar_indicator_material && i2 != s.e.abc_ratingbar_small_material) {
            if (D(context, i2, drawable) || !z) {
                return drawable;
            }
            return null;
        } else {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int a2 = q0.a(context, s.a.colorControlNormal);
            PorterDuff.Mode mode2 = f1091h;
            A(findDrawableByLayerId2, a2, mode2);
            Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
            int i4 = s.a.colorControlActivated;
            A(findDrawableByLayerId3, q0.b(context, i4), mode2);
            A(layerDrawable2.findDrawableByLayerId(16908301), q0.b(context, i4), mode2);
            return drawable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(Drawable drawable, t0 t0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = t0Var.f1193d;
        if (z || t0Var.f1192c) {
            drawable.setColorFilter(m(z ? t0Var.f1190a : null, t0Var.f1192c ? t0Var.f1191b : f1091h, iArr));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean D(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = android.support.v7.widget.k.f1091h
            int[] r1 = android.support.v7.widget.k.f1094k
            boolean r1 = d(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = s.a.colorControlNormal
        L12:
            r7 = -1
        L13:
            r1 = 1
            goto L42
        L15:
            int[] r1 = android.support.v7.widget.k.f1096m
            boolean r1 = d(r1, r7)
            if (r1 == 0) goto L20
            int r2 = s.a.colorControlActivated
            goto L12
        L20:
            int[] r1 = android.support.v7.widget.k.f1097n
            boolean r1 = d(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = s.e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L13
        L3a:
            int r1 = s.e.abc_dialog_material_background
            if (r7 != r1) goto L3f
            goto L12
        L3f:
            r7 = -1
            r1 = 0
            r2 = 0
        L42:
            if (r1 == 0) goto L5f
            boolean r1 = android.support.v7.widget.e0.a(r8)
            if (r1 == 0) goto L4e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L4e:
            int r6 = android.support.v7.widget.q0.b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = r(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L5e
            r8.setAlpha(r7)
        L5e:
            return r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.k.D(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void a(String str, c cVar) {
        if (this.f1101b == null) {
            this.f1101b = new n.a<>();
        }
        this.f1101b.put(str, cVar);
    }

    private boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.f1103d) {
                n.f<WeakReference<Drawable.ConstantState>> fVar = this.f1104e.get(context);
                if (fVar == null) {
                    fVar = new n.f<>();
                    this.f1104e.put(context, fVar);
                }
                fVar.h(j2, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f1100a == null) {
            this.f1100a = new WeakHashMap<>();
        }
        n.l<ColorStateList> lVar = this.f1100a.get(context);
        if (lVar == null) {
            lVar = new n.l<>();
            this.f1100a.put(context, lVar);
        }
        lVar.a(i2, colorStateList);
    }

    private static boolean d(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void e(Context context) {
        if (this.f1106g) {
            return;
        }
        this.f1106g = true;
        Drawable p2 = p(context, s.e.abc_vector_test);
        if (p2 == null || !w(p2)) {
            this.f1106g = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private ColorStateList f(Context context) {
        return g(context, 0);
    }

    private ColorStateList g(Context context, int i2) {
        int b2 = q0.b(context, s.a.colorControlHighlight);
        return new ColorStateList(new int[][]{q0.f1170b, q0.f1173e, q0.f1171c, q0.f1177i}, new int[]{q0.a(context, s.a.colorButtonNormal), i.a.b(b2, i2), i.a.b(b2, i2), i2});
    }

    private static long h(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private ColorStateList i(Context context) {
        return g(context, q0.b(context, s.a.colorAccent));
    }

    private ColorStateList j(Context context) {
        return g(context, q0.b(context, s.a.colorButtonNormal));
    }

    private Drawable k(Context context, int i2) {
        if (this.f1105f == null) {
            this.f1105f = new TypedValue();
        }
        TypedValue typedValue = this.f1105f;
        context.getResources().getValue(i2, typedValue, true);
        long h2 = h(typedValue);
        Drawable o2 = o(context, h2);
        if (o2 != null) {
            return o2;
        }
        if (i2 == s.e.abc_cab_background_top_material) {
            o2 = new LayerDrawable(new Drawable[]{p(context, s.e.abc_cab_background_internal_bg), p(context, s.e.abc_cab_background_top_mtrl_alpha)});
        }
        if (o2 != null) {
            o2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, h2, o2);
        }
        return o2;
    }

    private ColorStateList l(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        int i2 = s.a.colorSwitchThumbNormal;
        ColorStateList d2 = q0.d(context, i2);
        if (d2 == null || !d2.isStateful()) {
            iArr[0] = q0.f1170b;
            iArr2[0] = q0.a(context, i2);
            iArr[1] = q0.f1174f;
            iArr2[1] = q0.b(context, s.a.colorControlActivated);
            iArr[2] = q0.f1177i;
            iArr2[2] = q0.b(context, i2);
        } else {
            iArr[0] = q0.f1170b;
            iArr2[0] = d2.getColorForState(iArr[0], 0);
            iArr[1] = q0.f1174f;
            iArr2[1] = q0.b(context, s.a.colorControlActivated);
            iArr[2] = q0.f1177i;
            iArr2[2] = d2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter m(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return r(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static k n() {
        if (f1092i == null) {
            k kVar = new k();
            f1092i = kVar;
            v(kVar);
        }
        return f1092i;
    }

    private Drawable o(Context context, long j2) {
        synchronized (this.f1103d) {
            n.f<WeakReference<Drawable.ConstantState>> fVar = this.f1104e.get(context);
            if (fVar == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> e2 = fVar.e(j2);
            if (e2 != null) {
                Drawable.ConstantState constantState = e2.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                fVar.c(j2);
            }
            return null;
        }
    }

    public static PorterDuffColorFilter r(int i2, PorterDuff.Mode mode) {
        b bVar = f1093j;
        PorterDuffColorFilter i3 = bVar.i(i2, mode);
        if (i3 == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            bVar.j(i2, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return i3;
    }

    private ColorStateList t(Context context, int i2) {
        n.l<ColorStateList> lVar;
        WeakHashMap<Context, n.l<ColorStateList>> weakHashMap = this.f1100a;
        if (weakHashMap == null || (lVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return lVar.f(i2);
    }

    static PorterDuff.Mode u(int i2) {
        if (i2 == s.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    private static void v(k kVar) {
        if (Build.VERSION.SDK_INT < 24) {
            kVar.a("vector", new d());
            kVar.a("animated-vector", new a());
        }
    }

    private static boolean w(Drawable drawable) {
        return (drawable instanceof android.support.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable x(Context context, int i2) {
        int next;
        n.a<String, c> aVar = this.f1101b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        n.l<String> lVar = this.f1102c;
        if (lVar != null) {
            String f2 = lVar.f(i2);
            if ("appcompat_skip_skip".equals(f2) || (f2 != null && this.f1101b.get(f2) == null)) {
                return null;
            }
        } else {
            this.f1102c = new n.l<>();
        }
        if (this.f1105f == null) {
            this.f1105f = new TypedValue();
        }
        TypedValue typedValue = this.f1105f;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long h2 = h(typedValue);
        Drawable o2 = o(context, h2);
        if (o2 != null) {
            return o2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
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
                this.f1102c.a(i2, name);
                c cVar = this.f1101b.get(name);
                if (cVar != null) {
                    o2 = cVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (o2 != null) {
                    o2.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, h2, o2);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (o2 == null) {
            this.f1102c.a(i2, "appcompat_skip_skip");
        }
        return o2;
    }

    public Drawable p(Context context, int i2) {
        return q(context, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable q(Context context, int i2, boolean z) {
        e(context);
        Drawable x = x(context, i2);
        if (x == null) {
            x = k(context, i2);
        }
        if (x == null) {
            x = g.a.b(context, i2);
        }
        if (x != null) {
            x = B(context, i2, z, x);
        }
        if (x != null) {
            e0.b(x);
        }
        return x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.res.ColorStateList s(android.content.Context r3, int r4) {
        /*
            r2 = this;
            android.content.res.ColorStateList r0 = r2.t(r3, r4)
            if (r0 != 0) goto L7a
            int r1 = s.e.abc_edit_text_material
            if (r4 != r1) goto L12
            int r0 = s.c.abc_tint_edittext
        Lc:
            android.content.res.ColorStateList r0 = t.b.c(r3, r0)
            goto L75
        L12:
            int r1 = s.e.abc_switch_track_mtrl_alpha
            if (r4 != r1) goto L19
            int r0 = s.c.abc_tint_switch_track
            goto Lc
        L19:
            int r1 = s.e.abc_switch_thumb_material
            if (r4 != r1) goto L22
            android.content.res.ColorStateList r0 = r2.l(r3)
            goto L75
        L22:
            int r1 = s.e.abc_btn_default_mtrl_shape
            if (r4 != r1) goto L2b
            android.content.res.ColorStateList r0 = r2.j(r3)
            goto L75
        L2b:
            int r1 = s.e.abc_btn_borderless_material
            if (r4 != r1) goto L34
            android.content.res.ColorStateList r0 = r2.f(r3)
            goto L75
        L34:
            int r1 = s.e.abc_btn_colored_material
            if (r4 != r1) goto L3d
            android.content.res.ColorStateList r0 = r2.i(r3)
            goto L75
        L3d:
            int r1 = s.e.abc_spinner_mtrl_am_alpha
            if (r4 == r1) goto L72
            int r1 = s.e.abc_spinner_textfield_background_material
            if (r4 != r1) goto L46
            goto L72
        L46:
            int[] r1 = android.support.v7.widget.k.f1095l
            boolean r1 = d(r1, r4)
            if (r1 == 0) goto L55
            int r0 = s.a.colorControlNormal
            android.content.res.ColorStateList r0 = android.support.v7.widget.q0.d(r3, r0)
            goto L75
        L55:
            int[] r1 = android.support.v7.widget.k.f1098o
            boolean r1 = d(r1, r4)
            if (r1 == 0) goto L60
            int r0 = s.c.abc_tint_default
            goto Lc
        L60:
            int[] r1 = android.support.v7.widget.k.f1099p
            boolean r1 = d(r1, r4)
            if (r1 == 0) goto L6b
            int r0 = s.c.abc_tint_btn_checkable
            goto Lc
        L6b:
            int r1 = s.e.abc_seekbar_thumb_material
            if (r4 != r1) goto L75
            int r0 = s.c.abc_tint_seek_thumb
            goto Lc
        L72:
            int r0 = s.c.abc_tint_spinner
            goto Lc
        L75:
            if (r0 == 0) goto L7a
            r2.c(r3, r4, r0)
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.k.s(android.content.Context, int):android.content.res.ColorStateList");
    }

    public void y(Context context) {
        synchronized (this.f1103d) {
            n.f<WeakReference<Drawable.ConstantState>> fVar = this.f1104e.get(context);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable z(Context context, a1 a1Var, int i2) {
        Drawable x = x(context, i2);
        if (x == null) {
            x = a1Var.b(i2);
        }
        if (x != null) {
            return B(context, i2, false, x);
        }
        return null;
    }
}
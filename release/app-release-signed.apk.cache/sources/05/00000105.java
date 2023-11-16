package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.C0196g;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.support.p002v7.view.menu.SubMenuC0208m;
import android.support.p002v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p016o.AbstractC0464a;
import p016o.C0474d;
import p016o.C0478f;
import p016o.C0490o;
import p019r.AbstractC0525a;
import p020s.C0569a;
import p020s.C0578j;
import p021t.C0580b;
import p023v.C0592g;
import p023v.InterfaceC0587c;

/* renamed from: android.support.v7.widget.Toolbar */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1170A;

    /* renamed from: B */
    private int f1171B;

    /* renamed from: C */
    private boolean f1172C;

    /* renamed from: D */
    private boolean f1173D;

    /* renamed from: E */
    private final ArrayList<View> f1174E;

    /* renamed from: F */
    private final ArrayList<View> f1175F;

    /* renamed from: G */
    private final int[] f1176G;

    /* renamed from: H */
    InterfaceC0234f f1177H;

    /* renamed from: I */
    private final ActionMenuView.InterfaceC0219e f1178I;

    /* renamed from: J */
    private C0318w0 f1179J;

    /* renamed from: K */
    private C0248d f1180K;

    /* renamed from: L */
    private C0232d f1181L;

    /* renamed from: M */
    private InterfaceC0201j.InterfaceC0202a f1182M;

    /* renamed from: N */
    private C0192e.InterfaceC0193a f1183N;

    /* renamed from: O */
    private boolean f1184O;

    /* renamed from: P */
    private final Runnable f1185P;

    /* renamed from: b */
    private ActionMenuView f1186b;

    /* renamed from: c */
    private TextView f1187c;

    /* renamed from: d */
    private TextView f1188d;

    /* renamed from: e */
    private ImageButton f1189e;

    /* renamed from: f */
    private ImageView f1190f;

    /* renamed from: g */
    private Drawable f1191g;

    /* renamed from: h */
    private CharSequence f1192h;

    /* renamed from: i */
    ImageButton f1193i;

    /* renamed from: j */
    View f1194j;

    /* renamed from: k */
    private Context f1195k;

    /* renamed from: l */
    private int f1196l;

    /* renamed from: m */
    private int f1197m;

    /* renamed from: n */
    private int f1198n;

    /* renamed from: o */
    int f1199o;

    /* renamed from: p */
    private int f1200p;

    /* renamed from: q */
    private int f1201q;

    /* renamed from: r */
    private int f1202r;

    /* renamed from: s */
    private int f1203s;

    /* renamed from: t */
    private int f1204t;

    /* renamed from: u */
    private C0295n0 f1205u;

    /* renamed from: v */
    private int f1206v;

    /* renamed from: w */
    private int f1207w;

    /* renamed from: x */
    private int f1208x;

    /* renamed from: y */
    private CharSequence f1209y;

    /* renamed from: z */
    private CharSequence f1210z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0229a implements ActionMenuView.InterfaceC0219e {
        C0229a() {
        }

        @Override // android.support.p002v7.widget.ActionMenuView.InterfaceC0219e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0234f interfaceC0234f = Toolbar.this.f1177H;
            if (interfaceC0234f != null) {
                return interfaceC0234f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0230b implements Runnable {
        RunnableC0230b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m1440M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0231c implements View.OnClickListener {
        View$OnClickListenerC0231c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m1435e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0232d implements InterfaceC0201j {

        /* renamed from: b */
        C0192e f1214b;

        /* renamed from: c */
        C0196g f1215c;

        C0232d() {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: a */
        public void mo1347a(C0192e c0192e, boolean z) {
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: b */
        public boolean mo1346b(SubMenuC0208m subMenuC0208m) {
            return false;
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: e */
        public boolean mo1413e(C0192e c0192e, C0196g c0196g) {
            Toolbar.this.m1433g();
            ViewParent parent = Toolbar.this.f1193i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1193i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1193i);
            }
            Toolbar.this.f1194j = c0196g.getActionView();
            this.f1215c = c0196g;
            ViewParent parent2 = Toolbar.this.f1194j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1194j);
                }
                C0233e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2250a = 8388611 | (toolbar4.f1199o & C0578j.f2591q0);
                generateDefaultLayoutParams.f1217b = 2;
                toolbar4.f1194j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1194j);
            }
            Toolbar.this.m1447F();
            Toolbar.this.requestLayout();
            c0196g.m1589p(true);
            View view = Toolbar.this.f1194j;
            if (view instanceof InterfaceC0587c) {
                ((InterfaceC0587c) view).mo14a();
            }
            return true;
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: g */
        public boolean mo1344g() {
            return false;
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: h */
        public boolean mo1412h(C0192e c0192e, C0196g c0196g) {
            View view = Toolbar.this.f1194j;
            if (view instanceof InterfaceC0587c) {
                ((InterfaceC0587c) view).mo12d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1194j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1193i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1194j = null;
            toolbar3.m1439a();
            this.f1215c = null;
            Toolbar.this.requestLayout();
            c0196g.m1589p(false);
            return true;
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: i */
        public void mo1343i(boolean z) {
            if (this.f1215c != null) {
                C0192e c0192e = this.f1214b;
                boolean z2 = false;
                if (c0192e != null) {
                    int size = c0192e.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1214b.getItem(i) == this.f1215c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                mo1412h(this.f1214b, this.f1215c);
            }
        }

        @Override // android.support.p002v7.view.menu.InterfaceC0201j
        /* renamed from: k */
        public void mo1342k(Context context, C0192e c0192e) {
            C0196g c0196g;
            C0192e c0192e2 = this.f1214b;
            if (c0192e2 != null && (c0196g = this.f1215c) != null) {
                c0192e2.mo1538f(c0196g);
            }
            this.f1214b = c0192e;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0233e extends AbstractC0525a.C0526a {

        /* renamed from: b */
        int f1217b;

        public C0233e(int i, int i2) {
            super(i, i2);
            this.f1217b = 0;
            this.f2250a = 8388627;
        }

        public C0233e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1217b = 0;
        }

        public C0233e(C0233e c0233e) {
            super((AbstractC0525a.C0526a) c0233e);
            this.f1217b = 0;
            this.f1217b = c0233e.f1217b;
        }

        public C0233e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1217b = 0;
        }

        public C0233e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1217b = 0;
            m1411a(marginLayoutParams);
        }

        public C0233e(AbstractC0525a.C0526a c0526a) {
            super(c0526a);
            this.f1217b = 0;
        }

        /* renamed from: a */
        void m1411a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0234f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0235g extends AbstractC0464a {
        public static final Parcelable.Creator<C0235g> CREATOR = new C0236a();

        /* renamed from: d */
        int f1218d;

        /* renamed from: e */
        boolean f1219e;

        /* renamed from: android.support.v7.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        static class C0236a implements Parcelable.ClassLoaderCreator<C0235g> {
            C0236a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0235g createFromParcel(Parcel parcel) {
                return new C0235g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0235g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0235g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0235g[] newArray(int i) {
                return new C0235g[i];
            }
        }

        public C0235g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1218d = parcel.readInt();
            this.f1219e = parcel.readInt() != 0;
        }

        public C0235g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p016o.AbstractC0464a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1218d);
            parcel.writeInt(this.f1219e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1208x = 8388627;
        this.f1174E = new ArrayList<>();
        this.f1175F = new ArrayList<>();
        this.f1176G = new int[2];
        this.f1178I = new C0229a();
        this.f1185P = new RunnableC0230b();
        C0316v0 m1108t = C0316v0.m1108t(getContext(), attributeSet, C0578j.f2581n2, i, 0);
        this.f1197m = m1108t.m1115m(C0578j.f2480O2, 0);
        this.f1198n = m1108t.m1115m(C0578j.f2444F2, 0);
        this.f1208x = m1108t.m1117k(C0578j.f2585o2, this.f1208x);
        this.f1199o = m1108t.m1117k(C0578j.f2589p2, 48);
        int m1124d = m1108t.m1124d(C0578j.f2456I2, 0);
        int i2 = C0578j.f2476N2;
        m1124d = m1108t.m1111q(i2) ? m1108t.m1124d(i2, m1124d) : m1124d;
        this.f1204t = m1124d;
        this.f1203s = m1124d;
        this.f1202r = m1124d;
        this.f1201q = m1124d;
        int m1124d2 = m1108t.m1124d(C0578j.f2468L2, -1);
        if (m1124d2 >= 0) {
            this.f1201q = m1124d2;
        }
        int m1124d3 = m1108t.m1124d(C0578j.f2464K2, -1);
        if (m1124d3 >= 0) {
            this.f1202r = m1124d3;
        }
        int m1124d4 = m1108t.m1124d(C0578j.f2472M2, -1);
        if (m1124d4 >= 0) {
            this.f1203s = m1124d4;
        }
        int m1124d5 = m1108t.m1124d(C0578j.f2460J2, -1);
        if (m1124d5 >= 0) {
            this.f1204t = m1124d5;
        }
        this.f1200p = m1108t.m1123e(C0578j.f2424A2, -1);
        int m1124d6 = m1108t.m1124d(C0578j.f2617w2, Integer.MIN_VALUE);
        int m1124d7 = m1108t.m1124d(C0578j.f2601s2, Integer.MIN_VALUE);
        int m1123e = m1108t.m1123e(C0578j.f2609u2, 0);
        int m1123e2 = m1108t.m1123e(C0578j.f2613v2, 0);
        m1432h();
        this.f1205u.m1183e(m1123e, m1123e2);
        if (m1124d6 != Integer.MIN_VALUE || m1124d7 != Integer.MIN_VALUE) {
            this.f1205u.m1181g(m1124d6, m1124d7);
        }
        this.f1206v = m1108t.m1124d(C0578j.f2621x2, Integer.MIN_VALUE);
        this.f1207w = m1108t.m1124d(C0578j.f2605t2, Integer.MIN_VALUE);
        this.f1191g = m1108t.m1122f(C0578j.f2597r2);
        this.f1192h = m1108t.m1113o(C0578j.f2593q2);
        CharSequence m1113o = m1108t.m1113o(C0578j.f2452H2);
        if (!TextUtils.isEmpty(m1113o)) {
            setTitle(m1113o);
        }
        CharSequence m1113o2 = m1108t.m1113o(C0578j.f2440E2);
        if (!TextUtils.isEmpty(m1113o2)) {
            setSubtitle(m1113o2);
        }
        this.f1195k = getContext();
        setPopupTheme(m1108t.m1115m(C0578j.f2436D2, 0));
        Drawable m1122f = m1108t.m1122f(C0578j.f2432C2);
        if (m1122f != null) {
            setNavigationIcon(m1122f);
        }
        CharSequence m1113o3 = m1108t.m1113o(C0578j.f2428B2);
        if (!TextUtils.isEmpty(m1113o3)) {
            setNavigationContentDescription(m1113o3);
        }
        Drawable m1122f2 = m1108t.m1122f(C0578j.f2625y2);
        if (m1122f2 != null) {
            setLogo(m1122f2);
        }
        CharSequence m1113o4 = m1108t.m1113o(C0578j.f2629z2);
        if (!TextUtils.isEmpty(m1113o4)) {
            setLogoDescription(m1113o4);
        }
        int i3 = C0578j.f2484P2;
        if (m1108t.m1111q(i3)) {
            setTitleTextColor(m1108t.m1126b(i3, -1));
        }
        int i4 = C0578j.f2448G2;
        if (m1108t.m1111q(i4)) {
            setSubtitleTextColor(m1108t.m1126b(i4, -1));
        }
        m1108t.m1107u();
    }

    /* renamed from: A */
    private int m1452A(View view, int i, int[] iArr, int i2) {
        C0233e c0233e = (C0233e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0233e).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m1423q = m1423q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1423q, max + measuredWidth, view.getMeasuredHeight() + m1423q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0233e).rightMargin;
    }

    /* renamed from: B */
    private int m1451B(View view, int i, int[] iArr, int i2) {
        C0233e c0233e = (C0233e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0233e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m1423q = m1423q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1423q, max, view.getMeasuredHeight() + m1423q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0233e).leftMargin);
    }

    /* renamed from: C */
    private int m1450C(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: D */
    private void m1449D(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: E */
    private void m1448E() {
        removeCallbacks(this.f1185P);
        post(this.f1185P);
    }

    /* renamed from: K */
    private boolean m1442K() {
        if (this.f1184O) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (m1441L(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private boolean m1441L(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1438b(List<View> list, int i) {
        boolean z = C0490o.m408d(this) == 1;
        int childCount = getChildCount();
        int m456a = C0474d.m456a(i, C0490o.m408d(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0233e c0233e = (C0233e) childAt.getLayoutParams();
                if (c0233e.f1217b == 0 && m1441L(childAt) && m1424p(c0233e.f2250a) == m456a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0233e c0233e2 = (C0233e) childAt2.getLayoutParams();
            if (c0233e2.f1217b == 0 && m1441L(childAt2) && m1424p(c0233e2.f2250a) == m456a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1437c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0233e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0233e) layoutParams;
        generateDefaultLayoutParams.f1217b = 1;
        if (!z || this.f1194j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f1175F.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0592g(getContext());
    }

    /* renamed from: h */
    private void m1432h() {
        if (this.f1205u == null) {
            this.f1205u = new C0295n0();
        }
    }

    /* renamed from: i */
    private void m1431i() {
        if (this.f1190f == null) {
            this.f1190f = new C0302p(getContext());
        }
    }

    /* renamed from: j */
    private void m1430j() {
        m1429k();
        if (this.f1186b.m1502L() == null) {
            C0192e c0192e = (C0192e) this.f1186b.getMenu();
            if (this.f1181L == null) {
                this.f1181L = new C0232d();
            }
            this.f1186b.setExpandedActionViewsExclusive(true);
            c0192e.m1626c(this.f1181L, this.f1195k);
        }
    }

    /* renamed from: k */
    private void m1429k() {
        if (this.f1186b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1186b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1196l);
            this.f1186b.setOnMenuItemClickListener(this.f1178I);
            this.f1186b.m1501M(this.f1182M, this.f1183N);
            C0233e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2250a = 8388613 | (this.f1199o & C0578j.f2591q0);
            this.f1186b.setLayoutParams(generateDefaultLayoutParams);
            m1437c(this.f1186b, false);
        }
    }

    /* renamed from: l */
    private void m1428l() {
        if (this.f1189e == null) {
            this.f1189e = new C0294n(getContext(), null, C0569a.toolbarNavigationButtonStyle);
            C0233e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2250a = 8388611 | (this.f1199o & C0578j.f2591q0);
            this.f1189e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: p */
    private int m1424p(int i) {
        int m408d = C0490o.m408d(this);
        int m456a = C0474d.m456a(i, m408d) & 7;
        return (m456a == 1 || m456a == 3 || m456a == 5) ? m456a : m408d == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m1423q(View view, int i) {
        C0233e c0233e = (C0233e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m1422r = m1422r(c0233e.f2250a);
        if (m1422r != 48) {
            if (m1422r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) c0233e).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) c0233e).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0233e).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: r */
    private int m1422r(int i) {
        int i2 = i & C0578j.f2591q0;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1208x & C0578j.f2591q0;
    }

    /* renamed from: s */
    private int m1421s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0478f.m451b(marginLayoutParams) + C0478f.m452a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m1420t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m1419u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0233e c0233e = (C0233e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0233e).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c0233e).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: x */
    private boolean m1416x(View view) {
        return view.getParent() == this || this.f1175F.contains(view);
    }

    /* renamed from: F */
    void m1447F() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0233e) childAt.getLayoutParams()).f1217b != 2 && childAt != this.f1186b) {
                removeViewAt(childCount);
                this.f1175F.add(childAt);
            }
        }
    }

    /* renamed from: G */
    public void m1446G(int i, int i2) {
        m1432h();
        this.f1205u.m1181g(i, i2);
    }

    /* renamed from: H */
    public void m1445H(C0192e c0192e, C0248d c0248d) {
        if (c0192e == null && this.f1186b == null) {
            return;
        }
        m1429k();
        C0192e m1502L = this.f1186b.m1502L();
        if (m1502L == c0192e) {
            return;
        }
        if (m1502L != null) {
            m1502L.m1641O(this.f1180K);
            m1502L.m1641O(this.f1181L);
        }
        if (this.f1181L == null) {
            this.f1181L = new C0232d();
        }
        c0248d.m1352F(true);
        if (c0192e != null) {
            c0192e.m1626c(c0248d, this.f1195k);
            c0192e.m1626c(this.f1181L, this.f1195k);
        } else {
            c0248d.mo1342k(this.f1195k, null);
            this.f1181L.mo1342k(this.f1195k, null);
            c0248d.mo1343i(true);
            this.f1181L.mo1343i(true);
        }
        this.f1186b.setPopupTheme(this.f1196l);
        this.f1186b.setPresenter(c0248d);
        this.f1180K = c0248d;
    }

    /* renamed from: I */
    public void m1444I(Context context, int i) {
        this.f1198n = i;
        TextView textView = this.f1188d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: J */
    public void m1443J(Context context, int i) {
        this.f1197m = i;
        TextView textView = this.f1187c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: M */
    public boolean m1440M() {
        ActionMenuView actionMenuView = this.f1186b;
        return actionMenuView != null && actionMenuView.m1500N();
    }

    /* renamed from: a */
    void m1439a() {
        for (int size = this.f1175F.size() - 1; size >= 0; size--) {
            addView(this.f1175F.get(size));
        }
        this.f1175F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0233e);
    }

    /* renamed from: d */
    public boolean m1436d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1186b) != null && actionMenuView.m1505I();
    }

    /* renamed from: e */
    public void m1435e() {
        C0232d c0232d = this.f1181L;
        C0196g c0196g = c0232d == null ? null : c0232d.f1215c;
        if (c0196g != null) {
            c0196g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m1434f() {
        ActionMenuView actionMenuView = this.f1186b;
        if (actionMenuView != null) {
            actionMenuView.m1497z();
        }
    }

    /* renamed from: g */
    void m1433g() {
        if (this.f1193i == null) {
            C0294n c0294n = new C0294n(getContext(), null, C0569a.toolbarNavigationButtonStyle);
            this.f1193i = c0294n;
            c0294n.setImageDrawable(this.f1191g);
            this.f1193i.setContentDescription(this.f1192h);
            C0233e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2250a = 8388611 | (this.f1199o & C0578j.f2591q0);
            generateDefaultLayoutParams.f1217b = 2;
            this.f1193i.setLayoutParams(generateDefaultLayoutParams);
            this.f1193i.setOnClickListener(new View$OnClickListenerC0231c());
        }
    }

    public int getContentInsetEnd() {
        C0295n0 c0295n0 = this.f1205u;
        if (c0295n0 != null) {
            return c0295n0.m1187a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1207w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0295n0 c0295n0 = this.f1205u;
        if (c0295n0 != null) {
            return c0295n0.m1186b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0295n0 c0295n0 = this.f1205u;
        if (c0295n0 != null) {
            return c0295n0.m1185c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0295n0 c0295n0 = this.f1205u;
        if (c0295n0 != null) {
            return c0295n0.m1184d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1206v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0192e m1502L;
        ActionMenuView actionMenuView = this.f1186b;
        return actionMenuView != null && (m1502L = actionMenuView.m1502L()) != null && m1502L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1207w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0490o.m408d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0490o.m408d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1206v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1190f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1190f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1430j();
        return this.f1186b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1189e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1189e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0248d getOuterActionMenuPresenter() {
        return this.f1180K;
    }

    public Drawable getOverflowIcon() {
        m1430j();
        return this.f1186b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1195k;
    }

    public int getPopupTheme() {
        return this.f1196l;
    }

    public CharSequence getSubtitle() {
        return this.f1210z;
    }

    public CharSequence getTitle() {
        return this.f1209y;
    }

    public int getTitleMarginBottom() {
        return this.f1204t;
    }

    public int getTitleMarginEnd() {
        return this.f1202r;
    }

    public int getTitleMarginStart() {
        return this.f1201q;
    }

    public int getTitleMarginTop() {
        return this.f1203s;
    }

    public InterfaceC0256d0 getWrapper() {
        if (this.f1179J == null) {
            this.f1179J = new C0318w0(this, true);
        }
        return this.f1179J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0233e generateDefaultLayoutParams() {
        return new C0233e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0233e generateLayoutParams(AttributeSet attributeSet) {
        return new C0233e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0233e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0233e ? new C0233e((C0233e) layoutParams) : layoutParams instanceof AbstractC0525a.C0526a ? new C0233e((AbstractC0525a.C0526a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0233e((ViewGroup.MarginLayoutParams) layoutParams) : new C0233e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1185P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1173D = false;
        }
        if (!this.f1173D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1173D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1173D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1176G;
        boolean m1369b = C0244b1.m1369b(this);
        int i10 = !m1369b ? 1 : 0;
        if (m1441L(this.f1189e)) {
            m1449D(this.f1189e, i, 0, i2, 0, this.f1200p);
            i3 = this.f1189e.getMeasuredWidth() + m1421s(this.f1189e);
            i4 = Math.max(0, this.f1189e.getMeasuredHeight() + m1420t(this.f1189e));
            i5 = View.combineMeasuredStates(0, this.f1189e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m1441L(this.f1193i)) {
            m1449D(this.f1193i, i, 0, i2, 0, this.f1200p);
            i3 = this.f1193i.getMeasuredWidth() + m1421s(this.f1193i);
            i4 = Math.max(i4, this.f1193i.getMeasuredHeight() + m1420t(this.f1193i));
            i5 = View.combineMeasuredStates(i5, this.f1193i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[m1369b ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (m1441L(this.f1186b)) {
            m1449D(this.f1186b, i, max, i2, 0, this.f1200p);
            i6 = this.f1186b.getMeasuredWidth() + m1421s(this.f1186b);
            i4 = Math.max(i4, this.f1186b.getMeasuredHeight() + m1420t(this.f1186b));
            i5 = View.combineMeasuredStates(i5, this.f1186b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (m1441L(this.f1194j)) {
            max2 += m1450C(this.f1194j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1194j.getMeasuredHeight() + m1420t(this.f1194j));
            i5 = View.combineMeasuredStates(i5, this.f1194j.getMeasuredState());
        }
        if (m1441L(this.f1190f)) {
            max2 += m1450C(this.f1190f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1190f.getMeasuredHeight() + m1420t(this.f1190f));
            i5 = View.combineMeasuredStates(i5, this.f1190f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0233e) childAt.getLayoutParams()).f1217b == 0 && m1441L(childAt)) {
                max2 += m1450C(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1420t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1203s + this.f1204t;
        int i13 = this.f1201q + this.f1202r;
        if (m1441L(this.f1187c)) {
            m1450C(this.f1187c, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1187c.getMeasuredWidth() + m1421s(this.f1187c);
            i9 = this.f1187c.getMeasuredHeight() + m1420t(this.f1187c);
            i7 = View.combineMeasuredStates(i5, this.f1187c.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m1441L(this.f1188d)) {
            i8 = Math.max(i8, m1450C(this.f1188d, i, max2 + i13, i2, i9 + i12, iArr));
            i9 += this.f1188d.getMeasuredHeight() + m1420t(this.f1188d);
            i7 = View.combineMeasuredStates(i7, this.f1188d.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), m1442K() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0235g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0235g c0235g = (C0235g) parcelable;
        super.onRestoreInstanceState(c0235g.m475a());
        ActionMenuView actionMenuView = this.f1186b;
        C0192e m1502L = actionMenuView != null ? actionMenuView.m1502L() : null;
        int i = c0235g.f1218d;
        if (i != 0 && this.f1181L != null && m1502L != null && (findItem = m1502L.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0235g.f1219e) {
            m1448E();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1432h();
        this.f1205u.m1182f(i == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0196g c0196g;
        C0235g c0235g = new C0235g(super.onSaveInstanceState());
        C0232d c0232d = this.f1181L;
        if (c0232d != null && (c0196g = c0232d.f1215c) != null) {
            c0235g.f1218d = c0196g.getItemId();
        }
        c0235g.f1219e = m1414z();
        return c0235g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1172C = false;
        }
        if (!this.f1172C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1172C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1172C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f1184O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1207w) {
            this.f1207w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1206v) {
            this.f1206v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0580b.m98d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1431i();
            if (!m1416x(this.f1190f)) {
                m1437c(this.f1190f, true);
            }
        } else {
            ImageView imageView = this.f1190f;
            if (imageView != null && m1416x(imageView)) {
                removeView(this.f1190f);
                this.f1175F.remove(this.f1190f);
            }
        }
        ImageView imageView2 = this.f1190f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1431i();
        }
        ImageView imageView = this.f1190f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1428l();
        }
        ImageButton imageButton = this.f1189e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0580b.m98d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1428l();
            if (!m1416x(this.f1189e)) {
                m1437c(this.f1189e, true);
            }
        } else {
            ImageButton imageButton = this.f1189e;
            if (imageButton != null && m1416x(imageButton)) {
                removeView(this.f1189e);
                this.f1175F.remove(this.f1189e);
            }
        }
        ImageButton imageButton2 = this.f1189e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1428l();
        this.f1189e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0234f interfaceC0234f) {
        this.f1177H = interfaceC0234f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1430j();
        this.f1186b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1196l != i) {
            this.f1196l = i;
            if (i == 0) {
                this.f1195k = getContext();
            } else {
                this.f1195k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1188d;
            if (textView != null && m1416x(textView)) {
                removeView(this.f1188d);
                this.f1175F.remove(this.f1188d);
            }
        } else {
            if (this.f1188d == null) {
                Context context = getContext();
                C0240a0 c0240a0 = new C0240a0(context);
                this.f1188d = c0240a0;
                c0240a0.setSingleLine();
                this.f1188d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1198n;
                if (i != 0) {
                    this.f1188d.setTextAppearance(context, i);
                }
                int i2 = this.f1171B;
                if (i2 != 0) {
                    this.f1188d.setTextColor(i2);
                }
            }
            if (!m1416x(this.f1188d)) {
                m1437c(this.f1188d, true);
            }
        }
        TextView textView2 = this.f1188d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1210z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f1171B = i;
        TextView textView = this.f1188d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1187c;
            if (textView != null && m1416x(textView)) {
                removeView(this.f1187c);
                this.f1175F.remove(this.f1187c);
            }
        } else {
            if (this.f1187c == null) {
                Context context = getContext();
                C0240a0 c0240a0 = new C0240a0(context);
                this.f1187c = c0240a0;
                c0240a0.setSingleLine();
                this.f1187c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1197m;
                if (i != 0) {
                    this.f1187c.setTextAppearance(context, i);
                }
                int i2 = this.f1170A;
                if (i2 != 0) {
                    this.f1187c.setTextColor(i2);
                }
            }
            if (!m1416x(this.f1187c)) {
                m1437c(this.f1187c, true);
            }
        }
        TextView textView2 = this.f1187c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1209y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1204t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1202r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1201q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1203s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f1170A = i;
        TextView textView = this.f1187c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: v */
    public boolean m1418v() {
        C0232d c0232d = this.f1181L;
        return (c0232d == null || c0232d.f1215c == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m1417w() {
        ActionMenuView actionMenuView = this.f1186b;
        return actionMenuView != null && actionMenuView.m1508F();
    }

    /* renamed from: y */
    public boolean m1415y() {
        ActionMenuView actionMenuView = this.f1186b;
        return actionMenuView != null && actionMenuView.m1507G();
    }

    /* renamed from: z */
    public boolean m1414z() {
        ActionMenuView actionMenuView = this.f1186b;
        return actionMenuView != null && actionMenuView.m1506H();
    }
}
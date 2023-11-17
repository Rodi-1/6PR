package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionMenuView;
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
import r.a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private w0 J;
    private android.support.v7.widget.d K;
    private d L;
    private j.a M;
    private e.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    private ActionMenuView f910b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f911c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f912d;

    /* renamed from: e  reason: collision with root package name */
    private ImageButton f913e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f914f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f915g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f916h;

    /* renamed from: i  reason: collision with root package name */
    ImageButton f917i;

    /* renamed from: j  reason: collision with root package name */
    View f918j;

    /* renamed from: k  reason: collision with root package name */
    private Context f919k;

    /* renamed from: l  reason: collision with root package name */
    private int f920l;

    /* renamed from: m  reason: collision with root package name */
    private int f921m;

    /* renamed from: n  reason: collision with root package name */
    private int f922n;

    /* renamed from: o  reason: collision with root package name */
    int f923o;

    /* renamed from: p  reason: collision with root package name */
    private int f924p;

    /* renamed from: q  reason: collision with root package name */
    private int f925q;

    /* renamed from: r  reason: collision with root package name */
    private int f926r;

    /* renamed from: s  reason: collision with root package name */
    private int f927s;

    /* renamed from: t  reason: collision with root package name */
    private int f928t;

    /* renamed from: u  reason: collision with root package name */
    private n0 f929u;

    /* renamed from: v  reason: collision with root package name */
    private int f930v;

    /* renamed from: w  reason: collision with root package name */
    private int f931w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // android.support.v7.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements android.support.v7.view.menu.j {

        /* renamed from: b  reason: collision with root package name */
        android.support.v7.view.menu.e f935b;

        /* renamed from: c  reason: collision with root package name */
        android.support.v7.view.menu.g f936c;

        d() {
        }

        @Override // android.support.v7.view.menu.j
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.j
        public boolean b(android.support.v7.view.menu.m mVar) {
            return false;
        }

        @Override // android.support.v7.view.menu.j
        public boolean e(android.support.v7.view.menu.e eVar, android.support.v7.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f917i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f917i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f917i);
            }
            Toolbar.this.f918j = gVar.getActionView();
            this.f936c = gVar;
            ViewParent parent2 = Toolbar.this.f918j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f918j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1732a = 8388611 | (toolbar4.f923o & s.j.q0);
                generateDefaultLayoutParams.f938b = 2;
                toolbar4.f918j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f918j);
            }
            Toolbar.this.F();
            Toolbar.this.requestLayout();
            gVar.p(true);
            View view = Toolbar.this.f918j;
            if (view instanceof v.c) {
                ((v.c) view).a();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // android.support.v7.view.menu.j
        public boolean h(android.support.v7.view.menu.e eVar, android.support.v7.view.menu.g gVar) {
            View view = Toolbar.this.f918j;
            if (view instanceof v.c) {
                ((v.c) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f918j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f917i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f918j = null;
            toolbar3.a();
            this.f936c = null;
            Toolbar.this.requestLayout();
            gVar.p(false);
            return true;
        }

        @Override // android.support.v7.view.menu.j
        public void i(boolean z) {
            if (this.f936c != null) {
                android.support.v7.view.menu.e eVar = this.f935b;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f935b.getItem(i2) == this.f936c) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                h(this.f935b, this.f936c);
            }
        }

        @Override // android.support.v7.view.menu.j
        public void k(Context context, android.support.v7.view.menu.e eVar) {
            android.support.v7.view.menu.g gVar;
            android.support.v7.view.menu.e eVar2 = this.f935b;
            if (eVar2 != null && (gVar = this.f936c) != null) {
                eVar2.f(gVar);
            }
            this.f935b = eVar;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0023a {

        /* renamed from: b  reason: collision with root package name */
        int f938b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f938b = 0;
            this.f1732a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f938b = 0;
        }

        public e(e eVar) {
            super((a.C0023a) eVar);
            this.f938b = 0;
            this.f938b = eVar.f938b;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f938b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f938b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0023a c0023a) {
            super(c0023a);
            this.f938b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends o.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f939d;

        /* renamed from: e  reason: collision with root package name */
        boolean f940e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f939d = parcel.readInt();
            this.f940e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f939d);
            parcel.writeInt(this.f940e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        v0 t2 = v0.t(getContext(), attributeSet, s.j.n2, i2, 0);
        this.f921m = t2.m(s.j.O2, 0);
        this.f922n = t2.m(s.j.F2, 0);
        this.x = t2.k(s.j.o2, this.x);
        this.f923o = t2.k(s.j.p2, 48);
        int d2 = t2.d(s.j.I2, 0);
        int i3 = s.j.N2;
        d2 = t2.q(i3) ? t2.d(i3, d2) : d2;
        this.f928t = d2;
        this.f927s = d2;
        this.f926r = d2;
        this.f925q = d2;
        int d3 = t2.d(s.j.L2, -1);
        if (d3 >= 0) {
            this.f925q = d3;
        }
        int d4 = t2.d(s.j.K2, -1);
        if (d4 >= 0) {
            this.f926r = d4;
        }
        int d5 = t2.d(s.j.M2, -1);
        if (d5 >= 0) {
            this.f927s = d5;
        }
        int d6 = t2.d(s.j.J2, -1);
        if (d6 >= 0) {
            this.f928t = d6;
        }
        this.f924p = t2.e(s.j.A2, -1);
        int d7 = t2.d(s.j.w2, Integer.MIN_VALUE);
        int d8 = t2.d(s.j.s2, Integer.MIN_VALUE);
        int e2 = t2.e(s.j.u2, 0);
        int e3 = t2.e(s.j.v2, 0);
        h();
        this.f929u.e(e2, e3);
        if (d7 != Integer.MIN_VALUE || d8 != Integer.MIN_VALUE) {
            this.f929u.g(d7, d8);
        }
        this.f930v = t2.d(s.j.x2, Integer.MIN_VALUE);
        this.f931w = t2.d(s.j.t2, Integer.MIN_VALUE);
        this.f915g = t2.f(s.j.r2);
        this.f916h = t2.o(s.j.q2);
        CharSequence o2 = t2.o(s.j.H2);
        if (!TextUtils.isEmpty(o2)) {
            setTitle(o2);
        }
        CharSequence o3 = t2.o(s.j.E2);
        if (!TextUtils.isEmpty(o3)) {
            setSubtitle(o3);
        }
        this.f919k = getContext();
        setPopupTheme(t2.m(s.j.D2, 0));
        Drawable f2 = t2.f(s.j.C2);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o4 = t2.o(s.j.B2);
        if (!TextUtils.isEmpty(o4)) {
            setNavigationContentDescription(o4);
        }
        Drawable f3 = t2.f(s.j.y2);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o5 = t2.o(s.j.z2);
        if (!TextUtils.isEmpty(o5)) {
            setLogoDescription(o5);
        }
        int i4 = s.j.P2;
        if (t2.q(i4)) {
            setTitleTextColor(t2.b(i4, -1));
        }
        int i5 = s.j.G2;
        if (t2.q(i5)) {
            setSubtitleTextColor(t2.b(i5, -1));
        }
        t2.u();
    }

    private int A(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q2, max + measuredWidth, view.getMeasuredHeight() + q2);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q2, max, view.getMeasuredHeight() + q2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int C(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void D(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void E() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean K() {
        if (this.O) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (L(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean L(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z = o.o.d(this) == 1;
        int childCount = getChildCount();
        int a2 = o.d.a(i2, o.o.d(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f938b == 0 && L(childAt) && p(eVar.f1732a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f938b == 0 && L(childAt2) && p(eVar2.f1732a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f938b = 1;
        if (!z || this.f918j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.F.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new v.g(getContext());
    }

    private void h() {
        if (this.f929u == null) {
            this.f929u = new n0();
        }
    }

    private void i() {
        if (this.f914f == null) {
            this.f914f = new p(getContext());
        }
    }

    private void j() {
        k();
        if (this.f910b.L() == null) {
            android.support.v7.view.menu.e eVar = (android.support.v7.view.menu.e) this.f910b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f910b.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.f919k);
        }
    }

    private void k() {
        if (this.f910b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f910b = actionMenuView;
            actionMenuView.setPopupTheme(this.f920l);
            this.f910b.setOnMenuItemClickListener(this.I);
            this.f910b.M(this.M, this.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1732a = 8388613 | (this.f923o & s.j.q0);
            this.f910b.setLayoutParams(generateDefaultLayoutParams);
            c(this.f910b, false);
        }
    }

    private void l() {
        if (this.f913e == null) {
            this.f913e = new n(getContext(), null, s.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1732a = 8388611 | (this.f923o & s.j.q0);
            this.f913e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int d2 = o.o.d(this);
        int a2 = o.d.a(i2, d2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : d2 == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r2 = r(eVar.f1732a);
        if (r2 != 48) {
            if (r2 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    private int r(int i2) {
        int i3 = i2 & s.j.q0;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.x & s.j.q0;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return o.f.b(marginLayoutParams) + o.f.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean x(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    void F() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f938b != 2 && childAt != this.f910b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void G(int i2, int i3) {
        h();
        this.f929u.g(i2, i3);
    }

    public void H(android.support.v7.view.menu.e eVar, android.support.v7.widget.d dVar) {
        if (eVar == null && this.f910b == null) {
            return;
        }
        k();
        android.support.v7.view.menu.e L = this.f910b.L();
        if (L == eVar) {
            return;
        }
        if (L != null) {
            L.O(this.K);
            L.O(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        dVar.F(true);
        if (eVar != null) {
            eVar.c(dVar, this.f919k);
            eVar.c(this.L, this.f919k);
        } else {
            dVar.k(this.f919k, null);
            this.L.k(this.f919k, null);
            dVar.i(true);
            this.L.i(true);
        }
        this.f910b.setPopupTheme(this.f920l);
        this.f910b.setPresenter(dVar);
        this.K = dVar;
    }

    public void I(Context context, int i2) {
        this.f922n = i2;
        TextView textView = this.f912d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void J(Context context, int i2) {
        this.f921m = i2;
        TextView textView = this.f911c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean M() {
        ActionMenuView actionMenuView = this.f910b;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f910b) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.L;
        android.support.v7.view.menu.g gVar = dVar == null ? null : dVar.f936c;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f910b;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f917i == null) {
            n nVar = new n(getContext(), null, s.a.toolbarNavigationButtonStyle);
            this.f917i = nVar;
            nVar.setImageDrawable(this.f915g);
            this.f917i.setContentDescription(this.f916h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1732a = 8388611 | (this.f923o & s.j.q0);
            generateDefaultLayoutParams.f938b = 2;
            this.f917i.setLayoutParams(generateDefaultLayoutParams);
            this.f917i.setOnClickListener(new c());
        }
    }

    public int getContentInsetEnd() {
        n0 n0Var = this.f929u;
        if (n0Var != null) {
            return n0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f931w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        n0 n0Var = this.f929u;
        if (n0Var != null) {
            return n0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        n0 n0Var = this.f929u;
        if (n0Var != null) {
            return n0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        n0 n0Var = this.f929u;
        if (n0Var != null) {
            return n0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f930v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        android.support.v7.view.menu.e L;
        ActionMenuView actionMenuView = this.f910b;
        return actionMenuView != null && (L = actionMenuView.L()) != null && L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f931w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return o.o.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return o.o.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f930v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f914f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f914f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f910b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f913e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f913e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    android.support.v7.widget.d getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f910b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f919k;
    }

    public int getPopupTheme() {
        return this.f920l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.f928t;
    }

    public int getTitleMarginEnd() {
        return this.f926r;
    }

    public int getTitleMarginStart() {
        return this.f925q;
    }

    public int getTitleMarginTop() {
        return this.f927s;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new w0(this, true);
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0023a ? new e((a.C0023a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        boolean b2 = b1.b(this);
        int i11 = !b2 ? 1 : 0;
        if (L(this.f913e)) {
            D(this.f913e, i2, 0, i3, 0, this.f924p);
            i4 = this.f913e.getMeasuredWidth() + s(this.f913e);
            i5 = Math.max(0, this.f913e.getMeasuredHeight() + t(this.f913e));
            i6 = View.combineMeasuredStates(0, this.f913e.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (L(this.f917i)) {
            D(this.f917i, i2, 0, i3, 0, this.f924p);
            i4 = this.f917i.getMeasuredWidth() + s(this.f917i);
            i5 = Math.max(i5, this.f917i.getMeasuredHeight() + t(this.f917i));
            i6 = View.combineMeasuredStates(i6, this.f917i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i4);
        iArr[b2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i4);
        if (L(this.f910b)) {
            D(this.f910b, i2, max, i3, 0, this.f924p);
            i7 = this.f910b.getMeasuredWidth() + s(this.f910b);
            i5 = Math.max(i5, this.f910b.getMeasuredHeight() + t(this.f910b));
            i6 = View.combineMeasuredStates(i6, this.f910b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (L(this.f918j)) {
            max2 += C(this.f918j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f918j.getMeasuredHeight() + t(this.f918j));
            i6 = View.combineMeasuredStates(i6, this.f918j.getMeasuredState());
        }
        if (L(this.f914f)) {
            max2 += C(this.f914f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f914f.getMeasuredHeight() + t(this.f914f));
            i6 = View.combineMeasuredStates(i6, this.f914f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f938b == 0 && L(childAt)) {
                max2 += C(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i13 = this.f927s + this.f928t;
        int i14 = this.f925q + this.f926r;
        if (L(this.f911c)) {
            C(this.f911c, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f911c.getMeasuredWidth() + s(this.f911c);
            i10 = this.f911c.getMeasuredHeight() + t(this.f911c);
            i8 = View.combineMeasuredStates(i6, this.f911c.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i8 = i6;
            i9 = 0;
            i10 = 0;
        }
        if (L(this.f912d)) {
            i9 = Math.max(i9, C(this.f912d, i2, max2 + i14, i3, i10 + i13, iArr));
            i10 += this.f912d.getMeasuredHeight() + t(this.f912d);
            i8 = View.combineMeasuredStates(i8, this.f912d.getMeasuredState());
        }
        int max3 = Math.max(i5, i10);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i9 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & i8), K() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i8 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f910b;
        android.support.v7.view.menu.e L = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = gVar.f939d;
        if (i2 != 0 && this.L != null && L != null && (findItem = L.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f940e) {
            E();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        h();
        this.f929u.f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        android.support.v7.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (gVar = dVar.f936c) != null) {
            gVar2.f939d = gVar.getItemId();
        }
        gVar2.f940e = z();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f931w) {
            this.f931w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f930v) {
            this.f930v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(t.b.d(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!x(this.f914f)) {
                c(this.f914f, true);
            }
        } else {
            ImageView imageView = this.f914f;
            if (imageView != null && x(imageView)) {
                removeView(this.f914f);
                this.F.remove(this.f914f);
            }
        }
        ImageView imageView2 = this.f914f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f914f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f913e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(t.b.d(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!x(this.f913e)) {
                c(this.f913e, true);
            }
        } else {
            ImageButton imageButton = this.f913e;
            if (imageButton != null && x(imageButton)) {
                removeView(this.f913e);
                this.F.remove(this.f913e);
            }
        }
        ImageButton imageButton2 = this.f913e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f913e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f910b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f920l != i2) {
            this.f920l = i2;
            if (i2 == 0) {
                this.f919k = getContext();
            } else {
                this.f919k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f912d;
            if (textView != null && x(textView)) {
                removeView(this.f912d);
                this.F.remove(this.f912d);
            }
        } else {
            if (this.f912d == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f912d = a0Var;
                a0Var.setSingleLine();
                this.f912d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f922n;
                if (i2 != 0) {
                    this.f912d.setTextAppearance(context, i2);
                }
                int i3 = this.B;
                if (i3 != 0) {
                    this.f912d.setTextColor(i3);
                }
            }
            if (!x(this.f912d)) {
                c(this.f912d, true);
            }
        }
        TextView textView2 = this.f912d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        this.B = i2;
        TextView textView = this.f912d;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f911c;
            if (textView != null && x(textView)) {
                removeView(this.f911c);
                this.F.remove(this.f911c);
            }
        } else {
            if (this.f911c == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f911c = a0Var;
                a0Var.setSingleLine();
                this.f911c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f921m;
                if (i2 != 0) {
                    this.f911c.setTextAppearance(context, i2);
                }
                int i3 = this.A;
                if (i3 != 0) {
                    this.f911c.setTextColor(i3);
                }
            }
            if (!x(this.f911c)) {
                c(this.f911c, true);
            }
        }
        TextView textView2 = this.f911c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f928t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f926r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f925q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f927s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        this.A = i2;
        TextView textView = this.f911c;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f936c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f910b;
        return actionMenuView != null && actionMenuView.F();
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f910b;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f910b;
        return actionMenuView != null && actionMenuView.H();
    }
}
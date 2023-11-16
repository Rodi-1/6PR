package android.support.p002v7.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.C0272i0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p019r.AbstractC0525a;
import p020s.C0569a;
import p023v.C0584a;

/* renamed from: android.support.v7.widget.o0 */
/* loaded from: classes.dex */
public class C0297o0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k */
    private static final Interpolator f1432k = new DecelerateInterpolator();

    /* renamed from: b */
    Runnable f1433b;

    /* renamed from: c */
    private View$OnClickListenerC0300c f1434c;

    /* renamed from: d */
    C0272i0 f1435d;

    /* renamed from: e */
    private Spinner f1436e;

    /* renamed from: f */
    private boolean f1437f;

    /* renamed from: g */
    int f1438g;

    /* renamed from: h */
    int f1439h;

    /* renamed from: i */
    private int f1440i;

    /* renamed from: j */
    private int f1441j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.o0$a */
    /* loaded from: classes.dex */
    public class RunnableC0298a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1442b;

        RunnableC0298a(View view) {
            this.f1442b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0297o0.this.smoothScrollTo(this.f1442b.getLeft() - ((C0297o0.this.getWidth() - this.f1442b.getWidth()) / 2), 0);
            C0297o0.this.f1433b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.o0$b */
    /* loaded from: classes.dex */
    public class C0299b extends BaseAdapter {
        C0299b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0297o0.this.f1435d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0301d) C0297o0.this.f1435d.getChildAt(i)).m1163b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0297o0.this.m1168c((AbstractC0525a.AbstractC0528c) getItem(i), true);
            }
            ((C0301d) view).m1164a((AbstractC0525a.AbstractC0528c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.o0$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0300c implements View.OnClickListener {
        View$OnClickListenerC0300c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C0301d) view).m1163b().m288e();
            int childCount = C0297o0.this.f1435d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0297o0.this.f1435d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.o0$d */
    /* loaded from: classes.dex */
    public class C0301d extends LinearLayout {

        /* renamed from: b */
        private final int[] f1446b;

        /* renamed from: c */
        private AbstractC0525a.AbstractC0528c f1447c;

        /* renamed from: d */
        private TextView f1448d;

        /* renamed from: e */
        private ImageView f1449e;

        /* renamed from: f */
        private View f1450f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C0301d(android.content.Context r6, p019r.AbstractC0525a.AbstractC0528c r7, boolean r8) {
            /*
                r4 = this;
                android.support.p002v7.widget.C0297o0.this = r5
                int r5 = p020s.C0569a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1446b = r1
                r4.f1447c = r7
                android.support.v7.widget.v0 r5 = android.support.p002v7.widget.C0316v0.m1108t(r6, r0, r1, r5, r3)
                boolean r6 = r5.m1111q(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.m1122f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.m1107u()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.m1162c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0297o0.C0301d.<init>(android.support.v7.widget.o0, android.content.Context, r.a$c, boolean):void");
        }

        /* renamed from: a */
        public void m1164a(AbstractC0525a.AbstractC0528c abstractC0528c) {
            this.f1447c = abstractC0528c;
            m1162c();
        }

        /* renamed from: b */
        public AbstractC0525a.AbstractC0528c m1163b() {
            return this.f1447c;
        }

        /* renamed from: c */
        public void m1162c() {
            AbstractC0525a.AbstractC0528c abstractC0528c = this.f1447c;
            View m291b = abstractC0528c.m291b();
            if (m291b != null) {
                ViewParent parent = m291b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m291b);
                    }
                    addView(m291b);
                }
                this.f1450f = m291b;
                TextView textView = this.f1448d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1449e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1449e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1450f;
            if (view != null) {
                removeView(view);
                this.f1450f = null;
            }
            Drawable m290c = abstractC0528c.m290c();
            CharSequence m289d = abstractC0528c.m289d();
            if (m290c != null) {
                if (this.f1449e == null) {
                    C0302p c0302p = new C0302p(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0302p.setLayoutParams(layoutParams);
                    addView(c0302p, 0);
                    this.f1449e = c0302p;
                }
                this.f1449e.setImageDrawable(m290c);
                this.f1449e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1449e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1449e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m289d);
            if (z) {
                if (this.f1448d == null) {
                    C0240a0 c0240a0 = new C0240a0(getContext(), null, C0569a.actionBarTabTextStyle);
                    c0240a0.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0240a0.setLayoutParams(layoutParams2);
                    addView(c0240a0);
                    this.f1448d = c0240a0;
                }
                this.f1448d.setText(m289d);
                this.f1448d.setVisibility(0);
            } else {
                TextView textView2 = this.f1448d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1448d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1449e;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0528c.m292a());
            }
            C0328x0.m1053a(this, z ? null : abstractC0528c.m292a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0525a.AbstractC0528c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0525a.AbstractC0528c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0297o0.this.f1438g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0297o0.this.f1438g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m1169b() {
        C0321x c0321x = new C0321x(getContext(), null, C0569a.actionDropDownStyle);
        c0321x.setLayoutParams(new C0272i0.C0273a(-2, -1));
        c0321x.setOnItemSelectedListener(this);
        return c0321x;
    }

    /* renamed from: d */
    private boolean m1167d() {
        Spinner spinner = this.f1436e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m1166e() {
        if (m1167d()) {
            return;
        }
        if (this.f1436e == null) {
            this.f1436e = m1169b();
        }
        removeView(this.f1435d);
        addView(this.f1436e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1436e.getAdapter() == null) {
            this.f1436e.setAdapter((SpinnerAdapter) new C0299b());
        }
        Runnable runnable = this.f1433b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1433b = null;
        }
        this.f1436e.setSelection(this.f1441j);
    }

    /* renamed from: f */
    private boolean m1165f() {
        if (m1167d()) {
            removeView(this.f1436e);
            addView(this.f1435d, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1436e.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m1170a(int i) {
        View childAt = this.f1435d.getChildAt(i);
        Runnable runnable = this.f1433b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0298a runnableC0298a = new RunnableC0298a(childAt);
        this.f1433b = runnableC0298a;
        post(runnableC0298a);
    }

    /* renamed from: c */
    C0301d m1168c(AbstractC0525a.AbstractC0528c abstractC0528c, boolean z) {
        C0301d c0301d = new C0301d(getContext(), abstractC0528c, z);
        if (z) {
            c0301d.setBackgroundDrawable(null);
            c0301d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1440i));
        } else {
            c0301d.setFocusable(true);
            if (this.f1434c == null) {
                this.f1434c = new View$OnClickListenerC0300c();
            }
            c0301d.setOnClickListener(this.f1434c);
        }
        return c0301d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1433b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0584a m88b = C0584a.m88b(getContext());
        setContentHeight(m88b.m84f());
        this.f1439h = m88b.m85e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1433b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0301d) view).m1163b().m288e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1435d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1438g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1438g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1438g, this.f1439h);
        }
        this.f1438g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1440i, 1073741824);
        if ((z2 || !this.f1437f) ? false : false) {
            this.f1435d.measure(0, makeMeasureSpec);
            if (this.f1435d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1166e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1441j);
                return;
            }
        }
        m1165f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1437f = z;
    }

    public void setContentHeight(int i) {
        this.f1440i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1441j = i;
        int childCount = this.f1435d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1435d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m1170a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1436e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
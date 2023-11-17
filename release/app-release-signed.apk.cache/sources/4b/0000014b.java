package android.support.v7.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.i0;
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
import r.a;

/* loaded from: classes.dex */
public class o0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k  reason: collision with root package name */
    private static final Interpolator f1128k = new DecelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    Runnable f1129b;

    /* renamed from: c  reason: collision with root package name */
    private c f1130c;

    /* renamed from: d  reason: collision with root package name */
    i0 f1131d;

    /* renamed from: e  reason: collision with root package name */
    private Spinner f1132e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1133f;

    /* renamed from: g  reason: collision with root package name */
    int f1134g;

    /* renamed from: h  reason: collision with root package name */
    int f1135h;

    /* renamed from: i  reason: collision with root package name */
    private int f1136i;

    /* renamed from: j  reason: collision with root package name */
    private int f1137j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1138b;

        a(View view) {
            this.f1138b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.smoothScrollTo(this.f1138b.getLeft() - ((o0.this.getWidth() - this.f1138b.getWidth()) / 2), 0);
            o0.this.f1129b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return o0.this.f1131d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) o0.this.f1131d.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return o0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = o0.this.f1131d.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = o0.this.f1131d.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1142b;

        /* renamed from: c  reason: collision with root package name */
        private a.c f1143c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f1144d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f1145e;

        /* renamed from: f  reason: collision with root package name */
        private View f1146f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, r.a.c r7, boolean r8) {
            /*
                r4 = this;
                android.support.v7.widget.o0.this = r5
                int r5 = s.a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1142b = r1
                r4.f1143c = r7
                android.support.v7.widget.v0 r5 = android.support.v7.widget.v0.t(r6, r0, r1, r5, r3)
                boolean r6 = r5.q(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.u()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.o0.d.<init>(android.support.v7.widget.o0, android.content.Context, r.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1143c = cVar;
            c();
        }

        public a.c b() {
            return this.f1143c;
        }

        public void c() {
            a.c cVar = this.f1143c;
            View b2 = cVar.b();
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f1146f = b2;
                TextView textView = this.f1144d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1145e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1145e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1146f;
            if (view != null) {
                removeView(view);
                this.f1146f = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f1145e == null) {
                    p pVar = new p(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    pVar.setLayoutParams(layoutParams);
                    addView(pVar, 0);
                    this.f1145e = pVar;
                }
                this.f1145e.setImageDrawable(c2);
                this.f1145e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1145e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1145e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f1144d == null) {
                    a0 a0Var = new a0(getContext(), null, s.a.actionBarTabTextStyle);
                    a0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    a0Var.setLayoutParams(layoutParams2);
                    addView(a0Var);
                    this.f1144d = a0Var;
                }
                this.f1144d.setText(d2);
                this.f1144d.setVisibility(0);
            } else {
                TextView textView2 = this.f1144d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1144d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1145e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            x0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (o0.this.f1134g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = o0.this.f1134g;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
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

    private Spinner b() {
        x xVar = new x(getContext(), null, s.a.actionDropDownStyle);
        xVar.setLayoutParams(new i0.a(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    private boolean d() {
        Spinner spinner = this.f1132e;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1132e == null) {
            this.f1132e = b();
        }
        removeView(this.f1131d);
        addView(this.f1132e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1132e.getAdapter() == null) {
            this.f1132e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1129b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1129b = null;
        }
        this.f1132e.setSelection(this.f1137j);
    }

    private boolean f() {
        if (d()) {
            removeView(this.f1132e);
            addView(this.f1131d, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1132e.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void a(int i2) {
        View childAt = this.f1131d.getChildAt(i2);
        Runnable runnable = this.f1129b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1129b = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1136i));
        } else {
            dVar.setFocusable(true);
            if (this.f1130c == null) {
                this.f1130c = new c();
            }
            dVar.setOnClickListener(this.f1130c);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1129b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v.a b2 = v.a.b(getContext());
        setContentHeight(b2.f());
        this.f1135h = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1129b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1131d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.f1134g = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f1134g = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.f1134g, this.f1135h);
        }
        this.f1134g = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1136i, 1073741824);
        if ((z2 || !this.f1133f) ? false : false) {
            this.f1131d.measure(0, makeMeasureSpec);
            if (this.f1131d.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1137j);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1133f = z;
    }

    public void setContentHeight(int i2) {
        this.f1136i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1137j = i2;
        int childCount = this.f1131d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f1131d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f1132e;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}
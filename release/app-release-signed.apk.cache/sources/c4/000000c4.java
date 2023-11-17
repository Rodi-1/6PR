package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.k;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.a0;
import android.support.v7.widget.h0;
import android.support.v7.widget.x0;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class ActionMenuItemView extends a0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: d  reason: collision with root package name */
    g f634d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f635e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f636f;

    /* renamed from: g  reason: collision with root package name */
    e.b f637g;

    /* renamed from: h  reason: collision with root package name */
    private h0 f638h;

    /* renamed from: i  reason: collision with root package name */
    b f639i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f640j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f641k;

    /* renamed from: l  reason: collision with root package name */
    private int f642l;

    /* renamed from: m  reason: collision with root package name */
    private int f643m;

    /* renamed from: n  reason: collision with root package name */
    private int f644n;

    /* loaded from: classes.dex */
    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.h0
        public w.h b() {
            b bVar = ActionMenuItemView.this.f639i;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // android.support.v7.widget.h0
        protected boolean c() {
            w.h b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f637g;
            return bVar != null && bVar.c(actionMenuItemView.f634d) && (b2 = b()) != null && b2.c();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract w.h a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f640j = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.f1885v, i2, 0);
        this.f642l = obtainStyledAttributes.getDimensionPixelSize(s.j.f1886w, 0);
        obtainStyledAttributes.recycle();
        this.f644n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f643m = -1;
        setSaveEnabled(false);
    }

    private boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f635e);
        if (this.f636f != null && (!this.f634d.z() || (!this.f640j && !this.f641k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f635e : null);
        CharSequence contentDescription = this.f634d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f634d.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f634d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            x0.a(this, z3 ? null : this.f634d.getTitle());
        } else {
            x0.a(this, tooltipText);
        }
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean a() {
        return e() && this.f634d.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean b() {
        return e();
    }

    @Override // android.support.v7.view.menu.k.a
    public boolean c() {
        return true;
    }

    @Override // android.support.v7.view.menu.k.a
    public void d(g gVar, int i2) {
        this.f634d = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.h(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f638h == null) {
            this.f638h = new a();
        }
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.v7.view.menu.k.a
    public g getItemData() {
        return this.f634d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f637g;
        if (bVar != null) {
            bVar.c(this.f634d);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f640j = f();
        g();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean e2 = e();
        if (e2 && (i4 = this.f643m) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f642l) : this.f642l;
        if (mode != 1073741824 && this.f642l > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (e2 || this.f636f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f636f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (this.f634d.hasSubMenu() && (h0Var = this.f638h) != null && h0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f641k != z) {
            this.f641k = z;
            g gVar = this.f634d;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f636f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f644n;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(e.b bVar) {
        this.f637g = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f643m = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f639i = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f635e = charSequence;
        g();
    }
}
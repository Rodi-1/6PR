package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.C0240a0;
import android.support.p002v7.widget.C0328x0;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p020s.C0578j;
import p024w.InterfaceC0610h;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
/* loaded from: classes.dex */
public class ActionMenuItemView extends C0240a0 implements InterfaceC0203k.InterfaceC0204a, View.OnClickListener, ActionMenuView.InterfaceC0215a {

    /* renamed from: d */
    C0196g f825d;

    /* renamed from: e */
    private CharSequence f826e;

    /* renamed from: f */
    private Drawable f827f;

    /* renamed from: g */
    C0192e.InterfaceC0194b f828g;

    /* renamed from: h */
    private AbstractView$OnTouchListenerC0268h0 f829h;

    /* renamed from: i */
    AbstractC0181b f830i;

    /* renamed from: j */
    private boolean f831j;

    /* renamed from: k */
    private boolean f832k;

    /* renamed from: l */
    private int f833l;

    /* renamed from: m */
    private int f834m;

    /* renamed from: n */
    private int f835n;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0180a extends AbstractView$OnTouchListenerC0268h0 {
        public C0180a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
        /* renamed from: b */
        public InterfaceC0610h mo1061b() {
            AbstractC0181b abstractC0181b = ActionMenuItemView.this.f830i;
            if (abstractC0181b != null) {
                return abstractC0181b.mo1328a();
            }
            return null;
        }

        @Override // android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0
        /* renamed from: c */
        protected boolean mo1060c() {
            InterfaceC0610h mo1061b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0192e.InterfaceC0194b interfaceC0194b = actionMenuItemView.f828g;
            return interfaceC0194b != null && interfaceC0194b.mo1498c(actionMenuItemView.f825d) && (mo1061b = mo1061b()) != null && mo1061b.mo3c();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0181b {
        /* renamed from: a */
        public abstract InterfaceC0610h mo1328a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f831j = m1682f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2610v, i, 0);
        this.f833l = obtainStyledAttributes.getDimensionPixelSize(C0578j.f2614w, 0);
        obtainStyledAttributes.recycle();
        this.f835n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f834m = -1;
        setSaveEnabled(false);
    }

    /* renamed from: f */
    private boolean m1682f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: g */
    private void m1681g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f826e);
        if (this.f827f != null && (!this.f825d.m1579z() || (!this.f831j && !this.f832k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f826e : null);
        CharSequence contentDescription = this.f825d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f825d.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f825d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0328x0.m1053a(this, z3 ? null : this.f825d.getTitle());
        } else {
            C0328x0.m1053a(this, tooltipText);
        }
    }

    @Override // android.support.p002v7.widget.ActionMenuView.InterfaceC0215a
    /* renamed from: a */
    public boolean mo1327a() {
        return m1683e() && this.f825d.getIcon() == null;
    }

    @Override // android.support.p002v7.widget.ActionMenuView.InterfaceC0215a
    /* renamed from: b */
    public boolean mo1326b() {
        return m1683e();
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k.InterfaceC0204a
    /* renamed from: c */
    public boolean mo1559c() {
        return true;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k.InterfaceC0204a
    /* renamed from: d */
    public void mo1558d(C0196g c0196g, int i) {
        this.f825d = c0196g;
        setIcon(c0196g.getIcon());
        setTitle(c0196g.m1597h(this));
        setId(c0196g.getItemId());
        setVisibility(c0196g.isVisible() ? 0 : 8);
        setEnabled(c0196g.isEnabled());
        if (c0196g.hasSubMenu() && this.f829h == null) {
            this.f829h = new C0180a();
        }
    }

    /* renamed from: e */
    public boolean m1683e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k.InterfaceC0204a
    public C0196g getItemData() {
        return this.f825d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0192e.InterfaceC0194b interfaceC0194b = this.f828g;
        if (interfaceC0194b != null) {
            interfaceC0194b.mo1498c(this.f825d);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f831j = m1682f();
        m1681g();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean m1683e = m1683e();
        if (m1683e && (i3 = this.f834m) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f833l) : this.f833l;
        if (mode != 1073741824 && this.f833l > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m1683e || this.f827f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f827f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0268h0 abstractView$OnTouchListenerC0268h0;
        if (this.f825d.hasSubMenu() && (abstractView$OnTouchListenerC0268h0 = this.f829h) != null && abstractView$OnTouchListenerC0268h0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f832k != z) {
            this.f832k = z;
            C0196g c0196g = this.f825d;
            if (c0196g != null) {
                c0196g.m1602c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f827f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f835n;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1681g();
    }

    public void setItemInvoker(C0192e.InterfaceC0194b interfaceC0194b) {
        this.f828g = interfaceC0194b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f834m = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0181b abstractC0181b) {
        this.f830i = abstractC0181b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f826e = charSequence;
        m1681g();
    }
}
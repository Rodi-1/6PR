package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v7.view.menu.InterfaceC0203k;
import android.support.p002v7.widget.C0316v0;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p016o.C0490o;
import p020s.C0569a;
import p020s.C0574f;
import p020s.C0575g;
import p020s.C0578j;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0203k.InterfaceC0204a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private C0196g f840b;

    /* renamed from: c */
    private ImageView f841c;

    /* renamed from: d */
    private RadioButton f842d;

    /* renamed from: e */
    private TextView f843e;

    /* renamed from: f */
    private CheckBox f844f;

    /* renamed from: g */
    private TextView f845g;

    /* renamed from: h */
    private ImageView f846h;

    /* renamed from: i */
    private ImageView f847i;

    /* renamed from: j */
    private LinearLayout f848j;

    /* renamed from: k */
    private Drawable f849k;

    /* renamed from: l */
    private int f850l;

    /* renamed from: m */
    private Context f851m;

    /* renamed from: n */
    private boolean f852n;

    /* renamed from: o */
    private Drawable f853o;

    /* renamed from: p */
    private boolean f854p;

    /* renamed from: q */
    private int f855q;

    /* renamed from: r */
    private LayoutInflater f856r;

    /* renamed from: s */
    private boolean f857s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0316v0 m1108t = C0316v0.m1108t(getContext(), attributeSet, C0578j.f2459J1, i, 0);
        this.f849k = m1108t.m1122f(C0578j.f2467L1);
        this.f850l = m1108t.m1115m(C0578j.f2463K1, -1);
        this.f852n = m1108t.m1127a(C0578j.f2471M1, false);
        this.f851m = context;
        this.f853o = m1108t.m1122f(C0578j.f2475N1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0569a.dropDownListViewStyle, 0);
        this.f854p = obtainStyledAttributes.hasValue(0);
        m1108t.m1107u();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m1680a(View view) {
        m1679b(view, -1);
    }

    /* renamed from: b */
    private void m1679b(View view, int i) {
        LinearLayout linearLayout = this.f848j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: e */
    private void m1678e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0575g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f844f = checkBox;
        m1680a(checkBox);
    }

    /* renamed from: f */
    private void m1677f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0575g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f841c = imageView;
        m1679b(imageView, 0);
    }

    /* renamed from: g */
    private void m1676g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0575g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f842d = radioButton;
        m1680a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f856r == null) {
            this.f856r = LayoutInflater.from(getContext());
        }
        return this.f856r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f846h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f847i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f847i.getLayoutParams();
        rect.top += this.f847i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k.InterfaceC0204a
    /* renamed from: c */
    public boolean mo1559c() {
        return false;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k.InterfaceC0204a
    /* renamed from: d */
    public void mo1558d(C0196g c0196g, int i) {
        this.f840b = c0196g;
        this.f855q = i;
        setVisibility(c0196g.isVisible() ? 0 : 8);
        setTitle(c0196g.m1597h(this));
        setCheckable(c0196g.isCheckable());
        m1675h(c0196g.m1580y(), c0196g.m1599f());
        setIcon(c0196g.getIcon());
        setEnabled(c0196g.isEnabled());
        setSubMenuArrowVisible(c0196g.hasSubMenu());
        setContentDescription(c0196g.getContentDescription());
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0203k.InterfaceC0204a
    public C0196g getItemData() {
        return this.f840b;
    }

    /* renamed from: h */
    public void m1675h(boolean z, char c) {
        int i = (z && this.f840b.m1580y()) ? 0 : 8;
        if (i == 0) {
            this.f845g.setText(this.f840b.m1598g());
        }
        if (this.f845g.getVisibility() != i) {
            this.f845g.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0490o.m394r(this, this.f849k);
        TextView textView = (TextView) findViewById(C0574f.title);
        this.f843e = textView;
        int i = this.f850l;
        if (i != -1) {
            textView.setTextAppearance(this.f851m, i);
        }
        this.f845g = (TextView) findViewById(C0574f.shortcut);
        ImageView imageView = (ImageView) findViewById(C0574f.submenuarrow);
        this.f846h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f853o);
        }
        this.f847i = (ImageView) findViewById(C0574f.group_divider);
        this.f848j = (LinearLayout) findViewById(C0574f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f841c != null && this.f852n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f841c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f842d == null && this.f844f == null) {
            return;
        }
        if (this.f840b.m1593l()) {
            if (this.f842d == null) {
                m1676g();
            }
            compoundButton = this.f842d;
            compoundButton2 = this.f844f;
        } else {
            if (this.f844f == null) {
                m1678e();
            }
            compoundButton = this.f844f;
            compoundButton2 = this.f842d;
        }
        if (!z) {
            CheckBox checkBox = this.f844f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f842d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.f840b.isChecked());
        int i = z ? 0 : 8;
        if (compoundButton.getVisibility() != i) {
            compoundButton.setVisibility(i);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f840b.m1593l()) {
            if (this.f842d == null) {
                m1676g();
            }
            compoundButton = this.f842d;
        } else {
            if (this.f844f == null) {
                m1678e();
            }
            compoundButton = this.f844f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f857s = z;
        this.f852n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f847i;
        if (imageView != null) {
            imageView.setVisibility((this.f854p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f840b.m1581x() || this.f857s;
        if (z || this.f852n) {
            ImageView imageView = this.f841c;
            if (imageView == null && drawable == null && !this.f852n) {
                return;
            }
            if (imageView == null) {
                m1677f();
            }
            if (drawable == null && !this.f852n) {
                this.f841c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f841c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f841c.getVisibility() != 0) {
                this.f841c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f843e.setText(charSequence);
            if (this.f843e.getVisibility() == 0) {
                return;
            }
            textView = this.f843e;
            i = 0;
        } else {
            i = 8;
            if (this.f843e.getVisibility() == 8) {
                return;
            }
            textView = this.f843e;
        }
        textView.setVisibility(i);
    }
}
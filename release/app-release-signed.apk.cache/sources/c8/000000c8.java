package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.k;
import android.support.v7.widget.v0;
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
import o.o;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    private g f649b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f650c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f651d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f652e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f653f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f654g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f655h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f656i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f657j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f658k;

    /* renamed from: l  reason: collision with root package name */
    private int f659l;

    /* renamed from: m  reason: collision with root package name */
    private Context f660m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f661n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f662o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f663p;

    /* renamed from: q  reason: collision with root package name */
    private int f664q;

    /* renamed from: r  reason: collision with root package name */
    private LayoutInflater f665r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f666s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        v0 t2 = v0.t(getContext(), attributeSet, s.j.J1, i2, 0);
        this.f658k = t2.f(s.j.L1);
        this.f659l = t2.m(s.j.K1, -1);
        this.f661n = t2.a(s.j.M1, false);
        this.f660m = context;
        this.f662o = t2.f(s.j.N1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, s.a.dropDownListViewStyle, 0);
        this.f663p = obtainStyledAttributes.hasValue(0);
        t2.u();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.f657j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(s.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f653f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(s.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f650c = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(s.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f651d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f665r == null) {
            this.f665r = LayoutInflater.from(getContext());
        }
        return this.f665r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f655h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f656i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f656i.getLayoutParams();
        rect.top += this.f656i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.support.v7.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // android.support.v7.view.menu.k.a
    public void d(g gVar, int i2) {
        this.f649b = gVar;
        this.f664q = i2;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.h(this));
        setCheckable(gVar.isCheckable());
        h(gVar.y(), gVar.f());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // android.support.v7.view.menu.k.a
    public g getItemData() {
        return this.f649b;
    }

    public void h(boolean z, char c2) {
        int i2 = (z && this.f649b.y()) ? 0 : 8;
        if (i2 == 0) {
            this.f654g.setText(this.f649b.g());
        }
        if (this.f654g.getVisibility() != i2) {
            this.f654g.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        o.r(this, this.f658k);
        TextView textView = (TextView) findViewById(s.f.title);
        this.f652e = textView;
        int i2 = this.f659l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f660m, i2);
        }
        this.f654g = (TextView) findViewById(s.f.shortcut);
        ImageView imageView = (ImageView) findViewById(s.f.submenuarrow);
        this.f655h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f662o);
        }
        this.f656i = (ImageView) findViewById(s.f.group_divider);
        this.f657j = (LinearLayout) findViewById(s.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f650c != null && this.f661n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f650c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f651d == null && this.f653f == null) {
            return;
        }
        if (this.f649b.l()) {
            if (this.f651d == null) {
                g();
            }
            compoundButton = this.f651d;
            compoundButton2 = this.f653f;
        } else {
            if (this.f653f == null) {
                e();
            }
            compoundButton = this.f653f;
            compoundButton2 = this.f651d;
        }
        if (!z) {
            CheckBox checkBox = this.f653f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f651d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.f649b.isChecked());
        int i2 = z ? 0 : 8;
        if (compoundButton.getVisibility() != i2) {
            compoundButton.setVisibility(i2);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f649b.l()) {
            if (this.f651d == null) {
                g();
            }
            compoundButton = this.f651d;
        } else {
            if (this.f653f == null) {
                e();
            }
            compoundButton = this.f653f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f666s = z;
        this.f661n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f656i;
        if (imageView != null) {
            imageView.setVisibility((this.f663p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f649b.x() || this.f666s;
        if (z || this.f661n) {
            ImageView imageView = this.f650c;
            if (imageView == null && drawable == null && !this.f661n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f661n) {
                this.f650c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f650c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f650c.getVisibility() != 0) {
                this.f650c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        if (charSequence != null) {
            this.f652e.setText(charSequence);
            if (this.f652e.getVisibility() == 0) {
                return;
            }
            textView = this.f652e;
            i2 = 0;
        } else {
            i2 = 8;
            if (this.f652e.getVisibility() == 8) {
                return;
            }
            textView = this.f652e;
        }
        textView.setVisibility(i2);
    }
}
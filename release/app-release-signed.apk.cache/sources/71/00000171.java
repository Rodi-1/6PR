package android.support.p002v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p020s.C0572d;
import p020s.C0574f;
import p020s.C0575g;
import p020s.C0577i;

/* renamed from: android.support.v7.widget.z0 */
/* loaded from: classes.dex */
class C0335z0 {

    /* renamed from: a */
    private final Context f1584a;

    /* renamed from: b */
    private final View f1585b;

    /* renamed from: c */
    private final TextView f1586c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1587d;

    /* renamed from: e */
    private final Rect f1588e;

    /* renamed from: f */
    private final int[] f1589f;

    /* renamed from: g */
    private final int[] f1590g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0335z0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1587d = layoutParams;
        this.f1588e = new Rect();
        this.f1589f = new int[2];
        this.f1590g = new int[2];
        this.f1584a = context;
        View inflate = LayoutInflater.from(context).inflate(C0575g.abc_tooltip, (ViewGroup) null);
        this.f1585b = inflate;
        this.f1586c = (TextView) inflate.findViewById(C0574f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0577i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1019a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1584a.getResources().getDimensionPixelOffset(C0572d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1584a.getResources().getDimensionPixelOffset(C0572d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1584a.getResources().getDimensionPixelOffset(z ? C0572d.tooltip_y_offset_touch : C0572d.tooltip_y_offset_non_touch);
        View m1018b = m1018b(view);
        if (m1018b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m1018b.getWindowVisibleDisplayFrame(this.f1588e);
        Rect rect = this.f1588e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1584a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1588e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m1018b.getLocationOnScreen(this.f1590g);
        view.getLocationOnScreen(this.f1589f);
        int[] iArr = this.f1589f;
        int i4 = iArr[0];
        int[] iArr2 = this.f1590g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m1018b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1585b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1585b.getMeasuredHeight();
        int[] iArr3 = this.f1589f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f1588e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m1018b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1017c() {
        if (m1016d()) {
            ((WindowManager) this.f1584a.getSystemService("window")).removeView(this.f1585b);
        }
    }

    /* renamed from: d */
    boolean m1016d() {
        return this.f1585b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1015e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m1016d()) {
            m1017c();
        }
        this.f1586c.setText(charSequence);
        m1019a(view, i, i2, z, this.f1587d);
        ((WindowManager) this.f1584a.getSystemService("window")).addView(this.f1585b, this.f1587d);
    }
}
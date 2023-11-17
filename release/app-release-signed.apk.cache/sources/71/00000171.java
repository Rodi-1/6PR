package android.support.v7.widget;

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

/* loaded from: classes.dex */
class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1272a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1273b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1274c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1275d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1276e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1277f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1278g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1275d = layoutParams;
        this.f1276e = new Rect();
        this.f1277f = new int[2];
        this.f1278g = new int[2];
        this.f1272a = context;
        View inflate = LayoutInflater.from(context).inflate(s.g.abc_tooltip, (ViewGroup) null);
        this.f1273b = inflate;
        this.f1274c = (TextView) inflate.findViewById(s.f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = s.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1272a.getResources().getDimensionPixelOffset(s.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1272a.getResources().getDimensionPixelOffset(s.d.tooltip_precise_anchor_extra_offset);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1272a.getResources().getDimensionPixelOffset(z ? s.d.tooltip_y_offset_touch : s.d.tooltip_y_offset_non_touch);
        View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.f1276e);
        Rect rect = this.f1276e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1272a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1276e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.f1278g);
        view.getLocationOnScreen(this.f1277f);
        int[] iArr = this.f1277f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1278g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (b2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1273b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1273b.getMeasuredHeight();
        int[] iArr3 = this.f1277f;
        int i6 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 <= this.f1276e.height() : i6 < 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    private static View b(View view) {
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
    public void c() {
        if (d()) {
            ((WindowManager) this.f1272a.getSystemService("window")).removeView(this.f1273b);
        }
    }

    boolean d() {
        return this.f1273b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i2, int i3, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1274c.setText(charSequence);
        a(view, i2, i3, z, this.f1275d);
        ((WindowManager) this.f1272a.getSystemService("window")).addView(this.f1273b, this.f1275d);
    }
}
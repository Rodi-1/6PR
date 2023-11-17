package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: k  reason: collision with root package name */
    private static final RectF f961k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f962l = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f963a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f964b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f965c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f966d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f967e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f968f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f969g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f970h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f971i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f972j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(TextView textView) {
        this.f971i = textView;
        this.f972j = textView.getContext();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f963a = 0;
        this.f966d = -1.0f;
        this.f967e = -1.0f;
        this.f965c = -1.0f;
        this.f968f = new int[0];
        this.f964b = false;
    }

    private StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m(this.f971i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f970h, i2).setAlignment(alignment).setLineSpacing(this.f971i.getLineSpacingExtra(), this.f971i.getLineSpacingMultiplier()).setIncludePad(this.f971i.getIncludeFontPadding()).setBreakStrategy(this.f971i.getBreakStrategy()).setHyphenationFrequency(this.f971i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f970h, i2, alignment, this.f971i.getLineSpacingMultiplier(), this.f971i.getLineSpacingExtra(), this.f971i.getIncludeFontPadding());
    }

    private int f(RectF rectF) {
        int length = this.f968f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (x(this.f968f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f968f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private Method l(String str) {
        try {
            Method method = f962l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f962l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private <T> T m(Object obj, String str, T t2) {
        try {
            return (T) l(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t2;
        }
    }

    private void s(float f2) {
        if (f2 != this.f971i.getPaint().getTextSize()) {
            this.f971i.getPaint().setTextSize(f2);
            boolean isInLayout = this.f971i.isInLayout();
            if (this.f971i.getLayout() != null) {
                this.f964b = false;
                try {
                    Method l2 = l("nullLayouts");
                    if (l2 != null) {
                        l2.invoke(this.f971i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.f971i.forceLayout();
                } else {
                    this.f971i.requestLayout();
                }
                this.f971i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f963a == 1) {
            if (!this.f969g || this.f968f.length == 0) {
                float round = Math.round(this.f966d);
                int i2 = 1;
                while (Math.round(this.f965c + round) <= Math.round(this.f967e)) {
                    i2++;
                    round += this.f965c;
                }
                int[] iArr = new int[i2];
                float f2 = this.f966d;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.f965c;
                }
                this.f968f = b(iArr);
            }
            this.f964b = true;
        } else {
            this.f964b = false;
        }
        return this.f964b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f968f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f968f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f969g = z;
        if (z) {
            this.f963a = 1;
            this.f966d = iArr[0];
            this.f967e = iArr[length - 1];
            this.f965c = -1.0f;
        }
        return z;
    }

    private boolean x(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f971i.getText();
        TransformationMethod transformationMethod = this.f971i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f971i)) != null) {
            text = transformation;
        }
        int i3 = Build.VERSION.SDK_INT;
        int maxLines = this.f971i.getMaxLines();
        TextPaint textPaint = this.f970h;
        if (textPaint == null) {
            this.f970h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f970h.set(this.f971i.getPaint());
        this.f970h.setTextSize(i2);
        Layout.Alignment alignment = (Layout.Alignment) m(this.f971i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout d2 = i3 >= 23 ? d(text, alignment, Math.round(rectF.right), maxLines) : e(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (d2.getLineCount() <= maxLines && d2.getLineEnd(d2.getLineCount() - 1) == text.length())) && ((float) d2.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f971i instanceof l);
    }

    private void z(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        } else {
            this.f963a = 1;
            this.f966d = f2;
            this.f967e = f3;
            this.f965c = f4;
            this.f969g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (n()) {
            if (this.f964b) {
                if (this.f971i.getMeasuredHeight() <= 0 || this.f971i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) m(this.f971i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f971i.getMeasuredWidth() - this.f971i.getTotalPaddingLeft()) - this.f971i.getTotalPaddingRight();
                int height = (this.f971i.getHeight() - this.f971i.getCompoundPaddingBottom()) - this.f971i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f961k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float f2 = f(rectF);
                    if (f2 != this.f971i.getTextSize()) {
                        t(0, f2);
                    }
                }
            }
            this.f964b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f967e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f966d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return Math.round(this.f965c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] j() {
        return this.f968f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f963a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return y() && this.f963a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f972j.obtainStyledAttributes(attributeSet, s.j.e0, i2, 0);
        int i3 = s.j.j0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f963a = obtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = s.j.i0;
        float dimension = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = s.j.g0;
        float dimension2 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = s.j.f0;
        float dimension3 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = s.j.h0;
        if (obtainStyledAttributes.hasValue(i7) && (resourceId = obtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f963a = 0;
        } else if (this.f963a == 1) {
            if (!this.f969g) {
                DisplayMetrics displayMetrics = this.f972j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i2, int i3, int i4, int i5) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f972j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int[] iArr, int i2) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f972j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f968f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f969g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i2) {
        if (y()) {
            if (i2 == 0) {
                c();
            } else if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            } else {
                DisplayMetrics displayMetrics = this.f972j.getResources().getDisplayMetrics();
                z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (u()) {
                    a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i2, float f2) {
        Context context = this.f972j;
        s(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
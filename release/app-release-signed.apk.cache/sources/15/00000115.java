package android.support.p002v7.widget;

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
import p020s.C0578j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.b0 */
/* loaded from: classes.dex */
public class C0243b0 {

    /* renamed from: k */
    private static final RectF f1240k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1241l = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1242a = 0;

    /* renamed from: b */
    private boolean f1243b = false;

    /* renamed from: c */
    private float f1244c = -1.0f;

    /* renamed from: d */
    private float f1245d = -1.0f;

    /* renamed from: e */
    private float f1246e = -1.0f;

    /* renamed from: f */
    private int[] f1247f = new int[0];

    /* renamed from: g */
    private boolean f1248g = false;

    /* renamed from: h */
    private TextPaint f1249h;

    /* renamed from: i */
    private final TextView f1250i;

    /* renamed from: j */
    private final Context f1251j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0243b0(TextView textView) {
        this.f1250i = textView;
        this.f1251j = textView.getContext();
    }

    /* renamed from: b */
    private int[] m1395b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m1394c() {
        this.f1242a = 0;
        this.f1245d = -1.0f;
        this.f1246e = -1.0f;
        this.f1244c = -1.0f;
        this.f1247f = new int[0];
        this.f1243b = false;
    }

    /* renamed from: d */
    private StaticLayout m1393d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m1384m(this.f1250i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1249h, i).setAlignment(alignment).setLineSpacing(this.f1250i.getLineSpacingExtra(), this.f1250i.getLineSpacingMultiplier()).setIncludePad(this.f1250i.getIncludeFontPadding()).setBreakStrategy(this.f1250i.getBreakStrategy()).setHyphenationFrequency(this.f1250i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: e */
    private StaticLayout m1392e(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1249h, i, alignment, this.f1250i.getLineSpacingMultiplier(), this.f1250i.getLineSpacingExtra(), this.f1250i.getIncludeFontPadding());
    }

    /* renamed from: f */
    private int m1391f(RectF rectF) {
        int length = this.f1247f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1373x(this.f1247f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1247f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: l */
    private Method m1385l(String str) {
        try {
            Method method = f1241l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1241l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: m */
    private <T> T m1384m(Object obj, String str, T t) {
        try {
            return (T) m1385l(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: s */
    private void m1378s(float f) {
        if (f != this.f1250i.getPaint().getTextSize()) {
            this.f1250i.getPaint().setTextSize(f);
            boolean isInLayout = this.f1250i.isInLayout();
            if (this.f1250i.getLayout() != null) {
                this.f1243b = false;
                try {
                    Method m1385l = m1385l("nullLayouts");
                    if (m1385l != null) {
                        m1385l.invoke(this.f1250i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.f1250i.forceLayout();
                } else {
                    this.f1250i.requestLayout();
                }
                this.f1250i.invalidate();
            }
        }
    }

    /* renamed from: u */
    private boolean m1376u() {
        if (m1372y() && this.f1242a == 1) {
            if (!this.f1248g || this.f1247f.length == 0) {
                float round = Math.round(this.f1245d);
                int i = 1;
                while (Math.round(this.f1244c + round) <= Math.round(this.f1246e)) {
                    i++;
                    round += this.f1244c;
                }
                int[] iArr = new int[i];
                float f = this.f1245d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f1244c;
                }
                this.f1247f = m1395b(iArr);
            }
            this.f1243b = true;
        } else {
            this.f1243b = false;
        }
        return this.f1243b;
    }

    /* renamed from: v */
    private void m1375v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1247f = m1395b(iArr);
            m1374w();
        }
    }

    /* renamed from: w */
    private boolean m1374w() {
        int[] iArr = this.f1247f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1248g = z;
        if (z) {
            this.f1242a = 1;
            this.f1245d = iArr[0];
            this.f1246e = iArr[length - 1];
            this.f1244c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    private boolean m1373x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1250i.getText();
        TransformationMethod transformationMethod = this.f1250i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1250i)) != null) {
            text = transformation;
        }
        int i2 = Build.VERSION.SDK_INT;
        int maxLines = this.f1250i.getMaxLines();
        TextPaint textPaint = this.f1249h;
        if (textPaint == null) {
            this.f1249h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1249h.set(this.f1250i.getPaint());
        this.f1249h.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) m1384m(this.f1250i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout m1393d = i2 >= 23 ? m1393d(text, alignment, Math.round(rectF.right), maxLines) : m1392e(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (m1393d.getLineCount() <= maxLines && m1393d.getLineEnd(m1393d.getLineCount() - 1) == text.length())) && ((float) m1393d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: y */
    private boolean m1372y() {
        return !(this.f1250i instanceof C0289l);
    }

    /* renamed from: z */
    private void m1371z(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1242a = 1;
            this.f1245d = f;
            this.f1246e = f2;
            this.f1244c = f3;
            this.f1248g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1396a() {
        if (m1383n()) {
            if (this.f1243b) {
                if (this.f1250i.getMeasuredHeight() <= 0 || this.f1250i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) m1384m(this.f1250i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1250i.getMeasuredWidth() - this.f1250i.getTotalPaddingLeft()) - this.f1250i.getTotalPaddingRight();
                int height = (this.f1250i.getHeight() - this.f1250i.getCompoundPaddingBottom()) - this.f1250i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1240k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m1391f = m1391f(rectF);
                    if (m1391f != this.f1250i.getTextSize()) {
                        m1377t(0, m1391f);
                    }
                }
            }
            this.f1243b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1390g() {
        return Math.round(this.f1246e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m1389h() {
        return Math.round(this.f1245d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1388i() {
        return Math.round(this.f1244c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m1387j() {
        return this.f1247f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m1386k() {
        return this.f1242a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m1383n() {
        return m1372y() && this.f1242a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m1382o(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1251j.obtainStyledAttributes(attributeSet, C0578j.f2543e0, i, 0);
        int i2 = C0578j.f2563j0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1242a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C0578j.f2559i0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C0578j.f2551g0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C0578j.f2547f0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C0578j.f2555h0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1375v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1372y()) {
            this.f1242a = 0;
        } else if (this.f1242a == 1) {
            if (!this.f1248g) {
                DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1371z(dimension2, dimension3, dimension);
            }
            m1376u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1381p(int i, int i2, int i3, int i4) {
        if (m1372y()) {
            DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
            m1371z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m1376u()) {
                m1396a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1380q(int[] iArr, int i) {
        if (m1372y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1247f = m1395b(iArr2);
                if (!m1374w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1248g = false;
            }
            if (m1376u()) {
                m1396a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1379r(int i) {
        if (m1372y()) {
            if (i == 0) {
                m1394c();
            } else if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            } else {
                DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
                m1371z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (m1376u()) {
                    m1396a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1377t(int i, float f) {
        Context context = this.f1251j;
        m1378s(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
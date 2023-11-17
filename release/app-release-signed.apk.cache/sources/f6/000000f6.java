package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f878b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f879c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f880d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f881e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f882f;

    /* renamed from: g  reason: collision with root package name */
    private TypedValue f883g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f884h;

    /* renamed from: i  reason: collision with root package name */
    private a f885i;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f884h = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f884h.set(i2, i3, i4, i5);
        if (o.o.k(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f882f == null) {
            this.f882f = new TypedValue();
        }
        return this.f882f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f883g == null) {
            this.f883g = new TypedValue();
        }
        return this.f883g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f880d == null) {
            this.f880d = new TypedValue();
        }
        return this.f880d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f881e == null) {
            this.f881e = new TypedValue();
        }
        return this.f881e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f878b == null) {
            this.f878b = new TypedValue();
        }
        return this.f878b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f879c == null) {
            this.f879c = new TypedValue();
        }
        return this.f879c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f885i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f885i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f885i = aVar;
    }
}
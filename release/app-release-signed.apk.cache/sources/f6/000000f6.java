package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p016o.C0490o;

/* renamed from: android.support.v7.widget.ContentFrameLayout */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    private TypedValue f1103b;

    /* renamed from: c */
    private TypedValue f1104c;

    /* renamed from: d */
    private TypedValue f1105d;

    /* renamed from: e */
    private TypedValue f1106e;

    /* renamed from: f */
    private TypedValue f1107f;

    /* renamed from: g */
    private TypedValue f1108g;

    /* renamed from: h */
    private final Rect f1109h;

    /* renamed from: i */
    private InterfaceC0220a f1110i;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0220a {
        /* renamed from: a */
        void mo190a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1109h = new Rect();
    }

    /* renamed from: a */
    public void m1490a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m1489b(int i, int i2, int i3, int i4) {
        this.f1109h.set(i, i2, i3, i4);
        if (C0490o.m401k(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1107f == null) {
            this.f1107f = new TypedValue();
        }
        return this.f1107f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1108g == null) {
            this.f1108g = new TypedValue();
        }
        return this.f1108g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1105d == null) {
            this.f1105d = new TypedValue();
        }
        return this.f1105d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1106e == null) {
            this.f1106e = new TypedValue();
        }
        return this.f1106e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1103b == null) {
            this.f1103b = new TypedValue();
        }
        return this.f1103b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1104c == null) {
            this.f1104c = new TypedValue();
        }
        return this.f1104c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0220a interfaceC0220a = this.f1110i;
        if (interfaceC0220a != null) {
            interfaceC0220a.mo190a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0220a interfaceC0220a = this.f1110i;
        if (interfaceC0220a != null) {
            interfaceC0220a.onDetachedFromWindow();
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0220a interfaceC0220a) {
        this.f1110i = interfaceC0220a;
    }
}
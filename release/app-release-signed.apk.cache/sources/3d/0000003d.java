package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009h.C0393b;
import p009h.C0397c;
import p010i.C0399b;
import p011j.C0413a;
import p015n.C0445a;

/* renamed from: android.support.graphics.drawable.h */
/* loaded from: classes.dex */
public class C0050h extends AbstractC0049g {

    /* renamed from: l */
    static final PorterDuff.Mode f264l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0056f f265c;

    /* renamed from: d */
    private PorterDuffColorFilter f266d;

    /* renamed from: e */
    private ColorFilter f267e;

    /* renamed from: f */
    private boolean f268f;

    /* renamed from: g */
    private boolean f269g;

    /* renamed from: h */
    private Drawable.ConstantState f270h;

    /* renamed from: i */
    private final float[] f271i;

    /* renamed from: j */
    private final Matrix f272j;

    /* renamed from: k */
    private final Rect f273k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.h$a */
    /* loaded from: classes.dex */
    public static class C0051a extends C0054d {
        public C0051a() {
        }

        public C0051a(C0051a c0051a) {
            super(c0051a);
        }

        /* renamed from: d */
        private void m2267d(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f301b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f300a = C0399b.m689d(string2);
            }
        }

        @Override // android.support.graphics.drawable.C0050h.C0054d
        /* renamed from: a */
        public boolean mo2257a() {
            return true;
        }

        /* renamed from: c */
        public void m2268c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0397c.m699g(xmlPullParser, "pathData")) {
                TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f237d);
                m2267d(m698h);
                m698h.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.h$b */
    /* loaded from: classes.dex */
    public static class C0052b extends C0054d {

        /* renamed from: d */
        private int[] f274d;

        /* renamed from: e */
        int f275e;

        /* renamed from: f */
        float f276f;

        /* renamed from: g */
        int f277g;

        /* renamed from: h */
        float f278h;

        /* renamed from: i */
        int f279i;

        /* renamed from: j */
        float f280j;

        /* renamed from: k */
        float f281k;

        /* renamed from: l */
        float f282l;

        /* renamed from: m */
        float f283m;

        /* renamed from: n */
        Paint.Cap f284n;

        /* renamed from: o */
        Paint.Join f285o;

        /* renamed from: p */
        float f286p;

        public C0052b() {
            this.f275e = 0;
            this.f276f = 0.0f;
            this.f277g = 0;
            this.f278h = 1.0f;
            this.f279i = 0;
            this.f280j = 1.0f;
            this.f281k = 0.0f;
            this.f282l = 1.0f;
            this.f283m = 0.0f;
            this.f284n = Paint.Cap.BUTT;
            this.f285o = Paint.Join.MITER;
            this.f286p = 4.0f;
        }

        public C0052b(C0052b c0052b) {
            super(c0052b);
            this.f275e = 0;
            this.f276f = 0.0f;
            this.f277g = 0;
            this.f278h = 1.0f;
            this.f279i = 0;
            this.f280j = 1.0f;
            this.f281k = 0.0f;
            this.f282l = 1.0f;
            this.f283m = 0.0f;
            this.f284n = Paint.Cap.BUTT;
            this.f285o = Paint.Join.MITER;
            this.f286p = 4.0f;
            this.f274d = c0052b.f274d;
            this.f275e = c0052b.f275e;
            this.f276f = c0052b.f276f;
            this.f278h = c0052b.f278h;
            this.f277g = c0052b.f277g;
            this.f279i = c0052b.f279i;
            this.f280j = c0052b.f280j;
            this.f281k = c0052b.f281k;
            this.f282l = c0052b.f282l;
            this.f283m = c0052b.f283m;
            this.f284n = c0052b.f284n;
            this.f285o = c0052b.f285o;
            this.f286p = c0052b.f286p;
        }

        /* renamed from: c */
        private Paint.Cap m2266c(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: d */
        private Paint.Join m2265d(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: f */
        private void m2263f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f274d = null;
            if (C0397c.m699g(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f301b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f300a = C0399b.m689d(string2);
                }
                this.f277g = C0397c.m704b(typedArray, xmlPullParser, "fillColor", 1, this.f277g);
                this.f280j = C0397c.m703c(typedArray, xmlPullParser, "fillAlpha", 12, this.f280j);
                this.f284n = m2266c(C0397c.m702d(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f284n);
                this.f285o = m2265d(C0397c.m702d(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f285o);
                this.f286p = C0397c.m703c(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f286p);
                this.f275e = C0397c.m704b(typedArray, xmlPullParser, "strokeColor", 3, this.f275e);
                this.f278h = C0397c.m703c(typedArray, xmlPullParser, "strokeAlpha", 11, this.f278h);
                this.f276f = C0397c.m703c(typedArray, xmlPullParser, "strokeWidth", 4, this.f276f);
                this.f282l = C0397c.m703c(typedArray, xmlPullParser, "trimPathEnd", 6, this.f282l);
                this.f283m = C0397c.m703c(typedArray, xmlPullParser, "trimPathOffset", 7, this.f283m);
                this.f281k = C0397c.m703c(typedArray, xmlPullParser, "trimPathStart", 5, this.f281k);
                this.f279i = C0397c.m702d(typedArray, xmlPullParser, "fillType", 13, this.f279i);
            }
        }

        /* renamed from: e */
        public void m2264e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f236c);
            m2263f(m698h, xmlPullParser);
            m698h.recycle();
        }

        float getFillAlpha() {
            return this.f280j;
        }

        int getFillColor() {
            return this.f277g;
        }

        float getStrokeAlpha() {
            return this.f278h;
        }

        int getStrokeColor() {
            return this.f275e;
        }

        float getStrokeWidth() {
            return this.f276f;
        }

        float getTrimPathEnd() {
            return this.f282l;
        }

        float getTrimPathOffset() {
            return this.f283m;
        }

        float getTrimPathStart() {
            return this.f281k;
        }

        void setFillAlpha(float f) {
            this.f280j = f;
        }

        void setFillColor(int i) {
            this.f277g = i;
        }

        void setStrokeAlpha(float f) {
            this.f278h = f;
        }

        void setStrokeColor(int i) {
            this.f275e = i;
        }

        void setStrokeWidth(float f) {
            this.f276f = f;
        }

        void setTrimPathEnd(float f) {
            this.f282l = f;
        }

        void setTrimPathOffset(float f) {
            this.f283m = f;
        }

        void setTrimPathStart(float f) {
            this.f281k = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.h$c */
    /* loaded from: classes.dex */
    public static class C0053c {

        /* renamed from: a */
        private final Matrix f287a;

        /* renamed from: b */
        final ArrayList<Object> f288b;

        /* renamed from: c */
        float f289c;

        /* renamed from: d */
        private float f290d;

        /* renamed from: e */
        private float f291e;

        /* renamed from: f */
        private float f292f;

        /* renamed from: g */
        private float f293g;

        /* renamed from: h */
        private float f294h;

        /* renamed from: i */
        private float f295i;

        /* renamed from: j */
        private final Matrix f296j;

        /* renamed from: k */
        int f297k;

        /* renamed from: l */
        private int[] f298l;

        /* renamed from: m */
        private String f299m;

        public C0053c() {
            this.f287a = new Matrix();
            this.f288b = new ArrayList<>();
            this.f289c = 0.0f;
            this.f290d = 0.0f;
            this.f291e = 0.0f;
            this.f292f = 1.0f;
            this.f293g = 1.0f;
            this.f294h = 0.0f;
            this.f295i = 0.0f;
            this.f296j = new Matrix();
            this.f299m = null;
        }

        public C0053c(C0053c c0053c, C0445a<String, Object> c0445a) {
            C0054d c0051a;
            this.f287a = new Matrix();
            this.f288b = new ArrayList<>();
            this.f289c = 0.0f;
            this.f290d = 0.0f;
            this.f291e = 0.0f;
            this.f292f = 1.0f;
            this.f293g = 1.0f;
            this.f294h = 0.0f;
            this.f295i = 0.0f;
            Matrix matrix = new Matrix();
            this.f296j = matrix;
            this.f299m = null;
            this.f289c = c0053c.f289c;
            this.f290d = c0053c.f290d;
            this.f291e = c0053c.f291e;
            this.f292f = c0053c.f292f;
            this.f293g = c0053c.f293g;
            this.f294h = c0053c.f294h;
            this.f295i = c0053c.f295i;
            this.f298l = c0053c.f298l;
            String str = c0053c.f299m;
            this.f299m = str;
            this.f297k = c0053c.f297k;
            if (str != null) {
                c0445a.put(str, this);
            }
            matrix.set(c0053c.f296j);
            ArrayList<Object> arrayList = c0053c.f288b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0053c) {
                    this.f288b.add(new C0053c((C0053c) obj, c0445a));
                } else {
                    if (obj instanceof C0052b) {
                        c0051a = new C0052b((C0052b) obj);
                    } else if (!(obj instanceof C0051a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        c0051a = new C0051a((C0051a) obj);
                    }
                    this.f288b.add(c0051a);
                    String str2 = c0051a.f301b;
                    if (str2 != null) {
                        c0445a.put(str2, c0051a);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m2259d() {
            this.f296j.reset();
            this.f296j.postTranslate(-this.f290d, -this.f291e);
            this.f296j.postScale(this.f292f, this.f293g);
            this.f296j.postRotate(this.f289c, 0.0f, 0.0f);
            this.f296j.postTranslate(this.f294h + this.f290d, this.f295i + this.f291e);
        }

        /* renamed from: e */
        private void m2258e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f298l = null;
            this.f289c = C0397c.m703c(typedArray, xmlPullParser, "rotation", 5, this.f289c);
            this.f290d = typedArray.getFloat(1, this.f290d);
            this.f291e = typedArray.getFloat(2, this.f291e);
            this.f292f = C0397c.m703c(typedArray, xmlPullParser, "scaleX", 3, this.f292f);
            this.f293g = C0397c.m703c(typedArray, xmlPullParser, "scaleY", 4, this.f293g);
            this.f294h = C0397c.m703c(typedArray, xmlPullParser, "translateX", 6, this.f294h);
            this.f295i = C0397c.m703c(typedArray, xmlPullParser, "translateY", 7, this.f295i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f299m = string;
            }
            m2259d();
        }

        /* renamed from: c */
        public void m2260c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f235b);
            m2258e(m698h, xmlPullParser);
            m698h.recycle();
        }

        public String getGroupName() {
            return this.f299m;
        }

        public Matrix getLocalMatrix() {
            return this.f296j;
        }

        public float getPivotX() {
            return this.f290d;
        }

        public float getPivotY() {
            return this.f291e;
        }

        public float getRotation() {
            return this.f289c;
        }

        public float getScaleX() {
            return this.f292f;
        }

        public float getScaleY() {
            return this.f293g;
        }

        public float getTranslateX() {
            return this.f294h;
        }

        public float getTranslateY() {
            return this.f295i;
        }

        public void setPivotX(float f) {
            if (f != this.f290d) {
                this.f290d = f;
                m2259d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f291e) {
                this.f291e = f;
                m2259d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f289c) {
                this.f289c = f;
                m2259d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f292f) {
                this.f292f = f;
                m2259d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f293g) {
                this.f293g = f;
                m2259d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f294h) {
                this.f294h = f;
                m2259d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f295i) {
                this.f295i = f;
                m2259d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.h$d */
    /* loaded from: classes.dex */
    public static class C0054d {

        /* renamed from: a */
        protected C0399b.C0401b[] f300a;

        /* renamed from: b */
        String f301b;

        /* renamed from: c */
        int f302c;

        public C0054d() {
            this.f300a = null;
        }

        public C0054d(C0054d c0054d) {
            this.f300a = null;
            this.f301b = c0054d.f301b;
            this.f302c = c0054d.f302c;
            this.f300a = C0399b.m687f(c0054d.f300a);
        }

        /* renamed from: a */
        public boolean mo2257a() {
            return false;
        }

        /* renamed from: b */
        public void m2256b(Path path) {
            path.reset();
            C0399b.C0401b[] c0401bArr = this.f300a;
            if (c0401bArr != null) {
                C0399b.C0401b.m678e(c0401bArr, path);
            }
        }

        public C0399b.C0401b[] getPathData() {
            return this.f300a;
        }

        public String getPathName() {
            return this.f301b;
        }

        public void setPathData(C0399b.C0401b[] c0401bArr) {
            if (C0399b.m691b(this.f300a, c0401bArr)) {
                C0399b.m683j(this.f300a, c0401bArr);
            } else {
                this.f300a = C0399b.m687f(c0401bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.h$e */
    /* loaded from: classes.dex */
    public static class C0055e {

        /* renamed from: p */
        private static final Matrix f303p = new Matrix();

        /* renamed from: a */
        private final Path f304a;

        /* renamed from: b */
        private final Path f305b;

        /* renamed from: c */
        private final Matrix f306c;

        /* renamed from: d */
        private Paint f307d;

        /* renamed from: e */
        private Paint f308e;

        /* renamed from: f */
        private PathMeasure f309f;

        /* renamed from: g */
        private int f310g;

        /* renamed from: h */
        final C0053c f311h;

        /* renamed from: i */
        float f312i;

        /* renamed from: j */
        float f313j;

        /* renamed from: k */
        float f314k;

        /* renamed from: l */
        float f315l;

        /* renamed from: m */
        int f316m;

        /* renamed from: n */
        String f317n;

        /* renamed from: o */
        final C0445a<String, Object> f318o;

        public C0055e() {
            this.f306c = new Matrix();
            this.f312i = 0.0f;
            this.f313j = 0.0f;
            this.f314k = 0.0f;
            this.f315l = 0.0f;
            this.f316m = 255;
            this.f317n = null;
            this.f318o = new C0445a<>();
            this.f311h = new C0053c();
            this.f304a = new Path();
            this.f305b = new Path();
        }

        public C0055e(C0055e c0055e) {
            this.f306c = new Matrix();
            this.f312i = 0.0f;
            this.f313j = 0.0f;
            this.f314k = 0.0f;
            this.f315l = 0.0f;
            this.f316m = 255;
            this.f317n = null;
            C0445a<String, Object> c0445a = new C0445a<>();
            this.f318o = c0445a;
            this.f311h = new C0053c(c0055e.f311h, c0445a);
            this.f304a = new Path(c0055e.f304a);
            this.f305b = new Path(c0055e.f305b);
            this.f312i = c0055e.f312i;
            this.f313j = c0055e.f313j;
            this.f314k = c0055e.f314k;
            this.f315l = c0055e.f315l;
            this.f310g = c0055e.f310g;
            this.f316m = c0055e.f316m;
            this.f317n = c0055e.f317n;
            String str = c0055e.f317n;
            if (str != null) {
                c0445a.put(str, this);
            }
        }

        /* renamed from: e */
        private static float m2251e(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: g */
        private void m2249g(C0053c c0053c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0053c.f287a.set(matrix);
            c0053c.f287a.preConcat(c0053c.f296j);
            canvas.save();
            for (int i3 = 0; i3 < c0053c.f288b.size(); i3++) {
                Object obj = c0053c.f288b.get(i3);
                if (obj instanceof C0053c) {
                    m2249g((C0053c) obj, c0053c.f287a, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0054d) {
                    m2248h(c0053c, (C0054d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: h */
        private void m2248h(C0053c c0053c, C0054d c0054d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f314k;
            float f2 = i2 / this.f315l;
            float min = Math.min(f, f2);
            Matrix matrix = c0053c.f287a;
            this.f306c.set(matrix);
            this.f306c.postScale(f, f2);
            float m2247i = m2247i(matrix);
            if (m2247i == 0.0f) {
                return;
            }
            c0054d.m2256b(this.f304a);
            Path path = this.f304a;
            this.f305b.reset();
            if (c0054d.mo2257a()) {
                this.f305b.addPath(path, this.f306c);
                canvas.clipPath(this.f305b);
                return;
            }
            C0052b c0052b = (C0052b) c0054d;
            float f3 = c0052b.f281k;
            if (f3 != 0.0f || c0052b.f282l != 1.0f) {
                float f4 = c0052b.f283m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c0052b.f282l + f4) % 1.0f;
                if (this.f309f == null) {
                    this.f309f = new PathMeasure();
                }
                this.f309f.setPath(this.f304a, false);
                float length = this.f309f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f309f.getSegment(f7, length, path, true);
                    this.f309f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f309f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f305b.addPath(path, this.f306c);
            if (c0052b.f277g != 0) {
                if (this.f308e == null) {
                    Paint paint = new Paint();
                    this.f308e = paint;
                    paint.setStyle(Paint.Style.FILL);
                    this.f308e.setAntiAlias(true);
                }
                Paint paint2 = this.f308e;
                paint2.setColor(C0050h.m2277a(c0052b.f277g, c0052b.f280j));
                paint2.setColorFilter(colorFilter);
                this.f305b.setFillType(c0052b.f279i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f305b, paint2);
            }
            if (c0052b.f275e != 0) {
                if (this.f307d == null) {
                    Paint paint3 = new Paint();
                    this.f307d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                    this.f307d.setAntiAlias(true);
                }
                Paint paint4 = this.f307d;
                Paint.Join join = c0052b.f285o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c0052b.f284n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c0052b.f286p);
                paint4.setColor(C0050h.m2277a(c0052b.f275e, c0052b.f278h));
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c0052b.f276f * min * m2247i);
                canvas.drawPath(this.f305b, paint4);
            }
        }

        /* renamed from: i */
        private float m2247i(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m2251e = m2251e(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(m2251e) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public void m2250f(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m2249g(this.f311h, f303p, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f316m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f316m = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.h$f */
    /* loaded from: classes.dex */
    public static class C0056f extends Drawable.ConstantState {

        /* renamed from: a */
        int f319a;

        /* renamed from: b */
        C0055e f320b;

        /* renamed from: c */
        ColorStateList f321c;

        /* renamed from: d */
        PorterDuff.Mode f322d;

        /* renamed from: e */
        boolean f323e;

        /* renamed from: f */
        Bitmap f324f;

        /* renamed from: g */
        ColorStateList f325g;

        /* renamed from: h */
        PorterDuff.Mode f326h;

        /* renamed from: i */
        int f327i;

        /* renamed from: j */
        boolean f328j;

        /* renamed from: k */
        boolean f329k;

        /* renamed from: l */
        Paint f330l;

        public C0056f() {
            this.f321c = null;
            this.f322d = C0050h.f264l;
            this.f320b = new C0055e();
        }

        public C0056f(C0056f c0056f) {
            this.f321c = null;
            this.f322d = C0050h.f264l;
            if (c0056f != null) {
                this.f319a = c0056f.f319a;
                this.f320b = new C0055e(c0056f.f320b);
                if (c0056f.f320b.f308e != null) {
                    this.f320b.f308e = new Paint(c0056f.f320b.f308e);
                }
                if (c0056f.f320b.f307d != null) {
                    this.f320b.f307d = new Paint(c0056f.f320b.f307d);
                }
                this.f321c = c0056f.f321c;
                this.f322d = c0056f.f322d;
                this.f323e = c0056f.f323e;
            }
        }

        /* renamed from: a */
        public boolean m2246a(int i, int i2) {
            return i == this.f324f.getWidth() && i2 == this.f324f.getHeight();
        }

        /* renamed from: b */
        public boolean m2245b() {
            return !this.f329k && this.f325g == this.f321c && this.f326h == this.f322d && this.f328j == this.f323e && this.f327i == this.f320b.getRootAlpha();
        }

        /* renamed from: c */
        public void m2244c(int i, int i2) {
            if (this.f324f == null || !m2246a(i, i2)) {
                this.f324f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f329k = true;
            }
        }

        /* renamed from: d */
        public void m2243d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f324f, (Rect) null, rect, m2242e(colorFilter));
        }

        /* renamed from: e */
        public Paint m2242e(ColorFilter colorFilter) {
            if (m2241f() || colorFilter != null) {
                if (this.f330l == null) {
                    Paint paint = new Paint();
                    this.f330l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f330l.setAlpha(this.f320b.getRootAlpha());
                this.f330l.setColorFilter(colorFilter);
                return this.f330l;
            }
            return null;
        }

        /* renamed from: f */
        public boolean m2241f() {
            return this.f320b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public void m2240g() {
            this.f325g = this.f321c;
            this.f326h = this.f322d;
            this.f327i = this.f320b.getRootAlpha();
            this.f328j = this.f323e;
            this.f329k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f319a;
        }

        /* renamed from: h */
        public void m2239h(int i, int i2) {
            this.f324f.eraseColor(0);
            this.f320b.m2250f(new Canvas(this.f324f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0050h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0050h(this);
        }
    }

    /* renamed from: android.support.graphics.drawable.h$g */
    /* loaded from: classes.dex */
    private static class C0057g extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f331a;

        public C0057g(Drawable.ConstantState constantState) {
            this.f331a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f331a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f331a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0050h c0050h = new C0050h();
            c0050h.f263b = (VectorDrawable) this.f331a.newDrawable();
            return c0050h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0050h c0050h = new C0050h();
            c0050h.f263b = (VectorDrawable) this.f331a.newDrawable(resources);
            return c0050h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0050h c0050h = new C0050h();
            c0050h.f263b = (VectorDrawable) this.f331a.newDrawable(resources, theme);
            return c0050h;
        }
    }

    C0050h() {
        this.f269g = true;
        this.f271i = new float[9];
        this.f272j = new Matrix();
        this.f273k = new Rect();
        this.f265c = new C0056f();
    }

    C0050h(C0056f c0056f) {
        this.f269g = true;
        this.f271i = new float[9];
        this.f272j = new Matrix();
        this.f273k = new Rect();
        this.f265c = c0056f;
        this.f266d = updateTintFilter(this.f266d, c0056f.f321c, c0056f.f322d);
    }

    /* renamed from: a */
    static int m2277a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C0050h m2276b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0050h c0050h = new C0050h();
            c0050h.f263b = C0393b.m713a(resources, i, theme);
            c0050h.f270h = new C0057g(c0050h.f263b.getConstantState());
            return c0050h;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m2275c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    /* renamed from: c */
    public static C0050h m2275c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0050h c0050h = new C0050h();
        c0050h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0050h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m2273e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C0051a c0051a;
        C0056f c0056f = this.f265c;
        C0055e c0055e = c0056f.f320b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0055e.f311h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0053c c0053c = (C0053c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0052b c0052b = new C0052b();
                    c0052b.m2264e(resources, attributeSet, theme, xmlPullParser);
                    c0053c.f288b.add(c0052b);
                    if (c0052b.getPathName() != null) {
                        c0055e.f318o.put(c0052b.getPathName(), c0052b);
                    }
                    z = false;
                    c0051a = c0052b;
                } else if ("clip-path".equals(name)) {
                    C0051a c0051a2 = new C0051a();
                    c0051a2.m2268c(resources, attributeSet, theme, xmlPullParser);
                    c0053c.f288b.add(c0051a2);
                    String pathName = c0051a2.getPathName();
                    c0051a = c0051a2;
                    if (pathName != null) {
                        c0055e.f318o.put(c0051a2.getPathName(), c0051a2);
                        c0051a = c0051a2;
                    }
                } else if ("group".equals(name)) {
                    C0053c c0053c2 = new C0053c();
                    c0053c2.m2260c(resources, attributeSet, theme, xmlPullParser);
                    c0053c.f288b.add(c0053c2);
                    arrayDeque.push(c0053c2);
                    if (c0053c2.getGroupName() != null) {
                        c0055e.f318o.put(c0053c2.getGroupName(), c0053c2);
                    }
                    i = c0056f.f319a;
                    i2 = c0053c2.f297k;
                    c0056f.f319a = i2 | i;
                }
                i = c0056f.f319a;
                i2 = c0051a.f302c;
                c0056f.f319a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m2272f() {
        return isAutoMirrored() && C0413a.m629e(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m2271g(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: i */
    private void m2269i(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0056f c0056f = this.f265c;
        C0055e c0055e = c0056f.f320b;
        c0056f.f322d = m2271g(C0397c.m702d(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0056f.f321c = colorStateList;
        }
        c0056f.f323e = C0397c.m705a(typedArray, xmlPullParser, "autoMirrored", 5, c0056f.f323e);
        c0055e.f314k = C0397c.m703c(typedArray, xmlPullParser, "viewportWidth", 7, c0055e.f314k);
        float m703c = C0397c.m703c(typedArray, xmlPullParser, "viewportHeight", 8, c0055e.f315l);
        c0055e.f315l = m703c;
        if (c0055e.f314k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (m703c <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0055e.f312i = typedArray.getDimension(3, c0055e.f312i);
            float dimension = typedArray.getDimension(2, c0055e.f313j);
            c0055e.f313j = dimension;
            if (c0055e.f312i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0055e.setAlpha(C0397c.m703c(typedArray, xmlPullParser, "alpha", 4, c0055e.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c0055e.f317n = string;
                    c0055e.f318o.put(string, c0055e);
                }
            }
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m632b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m2274d(String str) {
        return this.f265c.f320b.f318o.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f273k);
        if (this.f273k.width() <= 0 || this.f273k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f267e;
        if (colorFilter == null) {
            colorFilter = this.f266d;
        }
        canvas.getMatrix(this.f272j);
        this.f272j.getValues(this.f271i);
        float abs = Math.abs(this.f271i[0]);
        float abs2 = Math.abs(this.f271i[4]);
        float abs3 = Math.abs(this.f271i[1]);
        float abs4 = Math.abs(this.f271i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f273k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f273k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f273k;
        canvas.translate(rect.left, rect.top);
        if (m2272f()) {
            canvas.translate(this.f273k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f273k.offsetTo(0, 0);
        this.f265c.m2244c(min, min2);
        if (!this.f269g) {
            this.f265c.m2239h(min, min2);
        } else if (!this.f265c.m2245b()) {
            this.f265c.m2239h(min, min2);
            this.f265c.m2240g();
        }
        this.f265c.m2243d(canvas, colorFilter, this.f273k);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f263b;
        return drawable != null ? C0413a.m631c(drawable) : this.f265c.f320b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f265c.getChangingConfigurations();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f263b == null || Build.VERSION.SDK_INT < 24) {
            this.f265c.f319a = getChangingConfigurations();
            return this.f265c;
        }
        return new C0057g(this.f263b.getConstantState());
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f265c.f320b.f313j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f265c.f320b.f312i;
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2270h(boolean z) {
        this.f269g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m628f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0056f c0056f = this.f265c;
        c0056f.f320b = new C0055e();
        TypedArray m698h = C0397c.m698h(resources, theme, attributeSet, C0038a.f234a);
        m2269i(m698h, xmlPullParser);
        m698h.recycle();
        c0056f.f319a = getChangingConfigurations();
        c0056f.f329k = true;
        m2273e(resources, xmlPullParser, attributeSet, theme);
        this.f266d = updateTintFilter(this.f266d, c0056f.f321c, c0056f.f322d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f263b;
        return drawable != null ? C0413a.m627g(drawable) : this.f265c.f323e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0056f c0056f;
        ColorStateList colorStateList;
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || !((c0056f = this.f265c) == null || (colorStateList = c0056f.f321c) == null || !colorStateList.isStateful());
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f268f && super.mutate() == this) {
            this.f265c = new C0056f(this.f265c);
            this.f268f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f263b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0056f c0056f = this.f265c;
        ColorStateList colorStateList = c0056f.f321c;
        if (colorStateList == null || (mode = c0056f.f322d) == null) {
            return false;
        }
        this.f266d = updateTintFilter(this.f266d, colorStateList, mode);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f265c.f320b.getRootAlpha() != i) {
            this.f265c.f320b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m625i(drawable, z);
        } else {
            this.f265c.f323e = z;
        }
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f267e = colorFilter;
        invalidateSelf();
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.graphics.drawable.AbstractC0049g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTint(int i) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m621m(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m620n(drawable, colorStateList);
            return;
        }
        C0056f c0056f = this.f265c;
        if (c0056f.f321c != colorStateList) {
            c0056f.f321c = colorStateList;
            this.f266d = updateTintFilter(this.f266d, colorStateList, c0056f.f322d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p011j.InterfaceC0414b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            C0413a.m619o(drawable, mode);
            return;
        }
        C0056f c0056f = this.f265c;
        if (c0056f.f322d != mode) {
            c0056f.f322d = mode;
            this.f266d = updateTintFilter(this.f266d, c0056f.f321c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f263b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f263b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
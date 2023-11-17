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
import i.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h extends android.support.graphics.drawable.g {

    /* renamed from: l  reason: collision with root package name */
    static final PorterDuff.Mode f158l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private f f159c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffColorFilter f160d;

    /* renamed from: e  reason: collision with root package name */
    private ColorFilter f161e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f162f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f163g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable.ConstantState f164h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f165i;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f166j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f167k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends d {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        private void d(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f195b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f194a = i.b.d(string2);
            }
        }

        @Override // android.support.graphics.drawable.h.d
        public boolean a() {
            return true;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (h.c.g(xmlPullParser, "pathData")) {
                TypedArray h2 = h.c.h(resources, theme, attributeSet, android.support.graphics.drawable.a.f131d);
                d(h2);
                h2.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: d  reason: collision with root package name */
        private int[] f168d;

        /* renamed from: e  reason: collision with root package name */
        int f169e;

        /* renamed from: f  reason: collision with root package name */
        float f170f;

        /* renamed from: g  reason: collision with root package name */
        int f171g;

        /* renamed from: h  reason: collision with root package name */
        float f172h;

        /* renamed from: i  reason: collision with root package name */
        int f173i;

        /* renamed from: j  reason: collision with root package name */
        float f174j;

        /* renamed from: k  reason: collision with root package name */
        float f175k;

        /* renamed from: l  reason: collision with root package name */
        float f176l;

        /* renamed from: m  reason: collision with root package name */
        float f177m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f178n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f179o;

        /* renamed from: p  reason: collision with root package name */
        float f180p;

        public b() {
            this.f169e = 0;
            this.f170f = 0.0f;
            this.f171g = 0;
            this.f172h = 1.0f;
            this.f173i = 0;
            this.f174j = 1.0f;
            this.f175k = 0.0f;
            this.f176l = 1.0f;
            this.f177m = 0.0f;
            this.f178n = Paint.Cap.BUTT;
            this.f179o = Paint.Join.MITER;
            this.f180p = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f169e = 0;
            this.f170f = 0.0f;
            this.f171g = 0;
            this.f172h = 1.0f;
            this.f173i = 0;
            this.f174j = 1.0f;
            this.f175k = 0.0f;
            this.f176l = 1.0f;
            this.f177m = 0.0f;
            this.f178n = Paint.Cap.BUTT;
            this.f179o = Paint.Join.MITER;
            this.f180p = 4.0f;
            this.f168d = bVar.f168d;
            this.f169e = bVar.f169e;
            this.f170f = bVar.f170f;
            this.f172h = bVar.f172h;
            this.f171g = bVar.f171g;
            this.f173i = bVar.f173i;
            this.f174j = bVar.f174j;
            this.f175k = bVar.f175k;
            this.f176l = bVar.f176l;
            this.f177m = bVar.f177m;
            this.f178n = bVar.f178n;
            this.f179o = bVar.f179o;
            this.f180p = bVar.f180p;
        }

        private Paint.Cap c(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join d(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f168d = null;
            if (h.c.g(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f195b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f194a = i.b.d(string2);
                }
                this.f171g = h.c.b(typedArray, xmlPullParser, "fillColor", 1, this.f171g);
                this.f174j = h.c.c(typedArray, xmlPullParser, "fillAlpha", 12, this.f174j);
                this.f178n = c(h.c.d(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f178n);
                this.f179o = d(h.c.d(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f179o);
                this.f180p = h.c.c(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f180p);
                this.f169e = h.c.b(typedArray, xmlPullParser, "strokeColor", 3, this.f169e);
                this.f172h = h.c.c(typedArray, xmlPullParser, "strokeAlpha", 11, this.f172h);
                this.f170f = h.c.c(typedArray, xmlPullParser, "strokeWidth", 4, this.f170f);
                this.f176l = h.c.c(typedArray, xmlPullParser, "trimPathEnd", 6, this.f176l);
                this.f177m = h.c.c(typedArray, xmlPullParser, "trimPathOffset", 7, this.f177m);
                this.f175k = h.c.c(typedArray, xmlPullParser, "trimPathStart", 5, this.f175k);
                this.f173i = h.c.d(typedArray, xmlPullParser, "fillType", 13, this.f173i);
            }
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray h2 = h.c.h(resources, theme, attributeSet, android.support.graphics.drawable.a.f130c);
            f(h2, xmlPullParser);
            h2.recycle();
        }

        float getFillAlpha() {
            return this.f174j;
        }

        int getFillColor() {
            return this.f171g;
        }

        float getStrokeAlpha() {
            return this.f172h;
        }

        int getStrokeColor() {
            return this.f169e;
        }

        float getStrokeWidth() {
            return this.f170f;
        }

        float getTrimPathEnd() {
            return this.f176l;
        }

        float getTrimPathOffset() {
            return this.f177m;
        }

        float getTrimPathStart() {
            return this.f175k;
        }

        void setFillAlpha(float f2) {
            this.f174j = f2;
        }

        void setFillColor(int i2) {
            this.f171g = i2;
        }

        void setStrokeAlpha(float f2) {
            this.f172h = f2;
        }

        void setStrokeColor(int i2) {
            this.f169e = i2;
        }

        void setStrokeWidth(float f2) {
            this.f170f = f2;
        }

        void setTrimPathEnd(float f2) {
            this.f176l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.f177m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f175k = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Matrix f181a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<Object> f182b;

        /* renamed from: c  reason: collision with root package name */
        float f183c;

        /* renamed from: d  reason: collision with root package name */
        private float f184d;

        /* renamed from: e  reason: collision with root package name */
        private float f185e;

        /* renamed from: f  reason: collision with root package name */
        private float f186f;

        /* renamed from: g  reason: collision with root package name */
        private float f187g;

        /* renamed from: h  reason: collision with root package name */
        private float f188h;

        /* renamed from: i  reason: collision with root package name */
        private float f189i;

        /* renamed from: j  reason: collision with root package name */
        private final Matrix f190j;

        /* renamed from: k  reason: collision with root package name */
        int f191k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f192l;

        /* renamed from: m  reason: collision with root package name */
        private String f193m;

        public c() {
            this.f181a = new Matrix();
            this.f182b = new ArrayList<>();
            this.f183c = 0.0f;
            this.f184d = 0.0f;
            this.f185e = 0.0f;
            this.f186f = 1.0f;
            this.f187g = 1.0f;
            this.f188h = 0.0f;
            this.f189i = 0.0f;
            this.f190j = new Matrix();
            this.f193m = null;
        }

        public c(c cVar, n.a<String, Object> aVar) {
            d aVar2;
            this.f181a = new Matrix();
            this.f182b = new ArrayList<>();
            this.f183c = 0.0f;
            this.f184d = 0.0f;
            this.f185e = 0.0f;
            this.f186f = 1.0f;
            this.f187g = 1.0f;
            this.f188h = 0.0f;
            this.f189i = 0.0f;
            Matrix matrix = new Matrix();
            this.f190j = matrix;
            this.f193m = null;
            this.f183c = cVar.f183c;
            this.f184d = cVar.f184d;
            this.f185e = cVar.f185e;
            this.f186f = cVar.f186f;
            this.f187g = cVar.f187g;
            this.f188h = cVar.f188h;
            this.f189i = cVar.f189i;
            this.f192l = cVar.f192l;
            String str = cVar.f193m;
            this.f193m = str;
            this.f191k = cVar.f191k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f190j);
            ArrayList<Object> arrayList = cVar.f182b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof c) {
                    this.f182b.add(new c((c) obj, aVar));
                } else {
                    if (obj instanceof b) {
                        aVar2 = new b((b) obj);
                    } else if (!(obj instanceof a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        aVar2 = new a((a) obj);
                    }
                    this.f182b.add(aVar2);
                    String str2 = aVar2.f195b;
                    if (str2 != null) {
                        aVar.put(str2, aVar2);
                    }
                }
            }
        }

        private void d() {
            this.f190j.reset();
            this.f190j.postTranslate(-this.f184d, -this.f185e);
            this.f190j.postScale(this.f186f, this.f187g);
            this.f190j.postRotate(this.f183c, 0.0f, 0.0f);
            this.f190j.postTranslate(this.f188h + this.f184d, this.f189i + this.f185e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f192l = null;
            this.f183c = h.c.c(typedArray, xmlPullParser, "rotation", 5, this.f183c);
            this.f184d = typedArray.getFloat(1, this.f184d);
            this.f185e = typedArray.getFloat(2, this.f185e);
            this.f186f = h.c.c(typedArray, xmlPullParser, "scaleX", 3, this.f186f);
            this.f187g = h.c.c(typedArray, xmlPullParser, "scaleY", 4, this.f187g);
            this.f188h = h.c.c(typedArray, xmlPullParser, "translateX", 6, this.f188h);
            this.f189i = h.c.c(typedArray, xmlPullParser, "translateY", 7, this.f189i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f193m = string;
            }
            d();
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray h2 = h.c.h(resources, theme, attributeSet, android.support.graphics.drawable.a.f129b);
            e(h2, xmlPullParser);
            h2.recycle();
        }

        public String getGroupName() {
            return this.f193m;
        }

        public Matrix getLocalMatrix() {
            return this.f190j;
        }

        public float getPivotX() {
            return this.f184d;
        }

        public float getPivotY() {
            return this.f185e;
        }

        public float getRotation() {
            return this.f183c;
        }

        public float getScaleX() {
            return this.f186f;
        }

        public float getScaleY() {
            return this.f187g;
        }

        public float getTranslateX() {
            return this.f188h;
        }

        public float getTranslateY() {
            return this.f189i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f184d) {
                this.f184d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f185e) {
                this.f185e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f183c) {
                this.f183c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f186f) {
                this.f186f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f187g) {
                this.f187g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f188h) {
                this.f188h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f189i) {
                this.f189i = f2;
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        protected b.C0016b[] f194a;

        /* renamed from: b  reason: collision with root package name */
        String f195b;

        /* renamed from: c  reason: collision with root package name */
        int f196c;

        public d() {
            this.f194a = null;
        }

        public d(d dVar) {
            this.f194a = null;
            this.f195b = dVar.f195b;
            this.f196c = dVar.f196c;
            this.f194a = i.b.f(dVar.f194a);
        }

        public boolean a() {
            return false;
        }

        public void b(Path path) {
            path.reset();
            b.C0016b[] c0016bArr = this.f194a;
            if (c0016bArr != null) {
                b.C0016b.e(c0016bArr, path);
            }
        }

        public b.C0016b[] getPathData() {
            return this.f194a;
        }

        public String getPathName() {
            return this.f195b;
        }

        public void setPathData(b.C0016b[] c0016bArr) {
            if (i.b.b(this.f194a, c0016bArr)) {
                i.b.j(this.f194a, c0016bArr);
            } else {
                this.f194a = i.b.f(c0016bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: p  reason: collision with root package name */
        private static final Matrix f197p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f198a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f199b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f200c;

        /* renamed from: d  reason: collision with root package name */
        private Paint f201d;

        /* renamed from: e  reason: collision with root package name */
        private Paint f202e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f203f;

        /* renamed from: g  reason: collision with root package name */
        private int f204g;

        /* renamed from: h  reason: collision with root package name */
        final c f205h;

        /* renamed from: i  reason: collision with root package name */
        float f206i;

        /* renamed from: j  reason: collision with root package name */
        float f207j;

        /* renamed from: k  reason: collision with root package name */
        float f208k;

        /* renamed from: l  reason: collision with root package name */
        float f209l;

        /* renamed from: m  reason: collision with root package name */
        int f210m;

        /* renamed from: n  reason: collision with root package name */
        String f211n;

        /* renamed from: o  reason: collision with root package name */
        final n.a<String, Object> f212o;

        public e() {
            this.f200c = new Matrix();
            this.f206i = 0.0f;
            this.f207j = 0.0f;
            this.f208k = 0.0f;
            this.f209l = 0.0f;
            this.f210m = 255;
            this.f211n = null;
            this.f212o = new n.a<>();
            this.f205h = new c();
            this.f198a = new Path();
            this.f199b = new Path();
        }

        public e(e eVar) {
            this.f200c = new Matrix();
            this.f206i = 0.0f;
            this.f207j = 0.0f;
            this.f208k = 0.0f;
            this.f209l = 0.0f;
            this.f210m = 255;
            this.f211n = null;
            n.a<String, Object> aVar = new n.a<>();
            this.f212o = aVar;
            this.f205h = new c(eVar.f205h, aVar);
            this.f198a = new Path(eVar.f198a);
            this.f199b = new Path(eVar.f199b);
            this.f206i = eVar.f206i;
            this.f207j = eVar.f207j;
            this.f208k = eVar.f208k;
            this.f209l = eVar.f209l;
            this.f204g = eVar.f204g;
            this.f210m = eVar.f210m;
            this.f211n = eVar.f211n;
            String str = eVar.f211n;
            if (str != null) {
                aVar.put(str, this);
            }
        }

        private static float e(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void g(c cVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            cVar.f181a.set(matrix);
            cVar.f181a.preConcat(cVar.f190j);
            canvas.save();
            for (int i4 = 0; i4 < cVar.f182b.size(); i4++) {
                Object obj = cVar.f182b.get(i4);
                if (obj instanceof c) {
                    g((c) obj, cVar.f181a, canvas, i2, i3, colorFilter);
                } else if (obj instanceof d) {
                    h(cVar, (d) obj, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void h(c cVar, d dVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f208k;
            float f3 = i3 / this.f209l;
            float min = Math.min(f2, f3);
            Matrix matrix = cVar.f181a;
            this.f200c.set(matrix);
            this.f200c.postScale(f2, f3);
            float i4 = i(matrix);
            if (i4 == 0.0f) {
                return;
            }
            dVar.b(this.f198a);
            Path path = this.f198a;
            this.f199b.reset();
            if (dVar.a()) {
                this.f199b.addPath(path, this.f200c);
                canvas.clipPath(this.f199b);
                return;
            }
            b bVar = (b) dVar;
            float f4 = bVar.f175k;
            if (f4 != 0.0f || bVar.f176l != 1.0f) {
                float f5 = bVar.f177m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (bVar.f176l + f5) % 1.0f;
                if (this.f203f == null) {
                    this.f203f = new PathMeasure();
                }
                this.f203f.setPath(this.f198a, false);
                float length = this.f203f.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f203f.getSegment(f8, length, path, true);
                    this.f203f.getSegment(0.0f, f9, path, true);
                } else {
                    this.f203f.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f199b.addPath(path, this.f200c);
            if (bVar.f171g != 0) {
                if (this.f202e == null) {
                    Paint paint = new Paint();
                    this.f202e = paint;
                    paint.setStyle(Paint.Style.FILL);
                    this.f202e.setAntiAlias(true);
                }
                Paint paint2 = this.f202e;
                paint2.setColor(h.a(bVar.f171g, bVar.f174j));
                paint2.setColorFilter(colorFilter);
                this.f199b.setFillType(bVar.f173i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f199b, paint2);
            }
            if (bVar.f169e != 0) {
                if (this.f201d == null) {
                    Paint paint3 = new Paint();
                    this.f201d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                    this.f201d.setAntiAlias(true);
                }
                Paint paint4 = this.f201d;
                Paint.Join join = bVar.f179o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = bVar.f178n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(bVar.f180p);
                paint4.setColor(h.a(bVar.f169e, bVar.f172h));
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(bVar.f170f * min * i4);
                canvas.drawPath(this.f199b, paint4);
            }
        }

        private float i(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float e2 = e(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(e2) / max;
            }
            return 0.0f;
        }

        public void f(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            g(this.f205h, f197p, canvas, i2, i3, colorFilter);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f210m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f210m = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f213a;

        /* renamed from: b  reason: collision with root package name */
        e f214b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f215c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f216d;

        /* renamed from: e  reason: collision with root package name */
        boolean f217e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f218f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f219g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f220h;

        /* renamed from: i  reason: collision with root package name */
        int f221i;

        /* renamed from: j  reason: collision with root package name */
        boolean f222j;

        /* renamed from: k  reason: collision with root package name */
        boolean f223k;

        /* renamed from: l  reason: collision with root package name */
        Paint f224l;

        public f() {
            this.f215c = null;
            this.f216d = h.f158l;
            this.f214b = new e();
        }

        public f(f fVar) {
            this.f215c = null;
            this.f216d = h.f158l;
            if (fVar != null) {
                this.f213a = fVar.f213a;
                this.f214b = new e(fVar.f214b);
                if (fVar.f214b.f202e != null) {
                    this.f214b.f202e = new Paint(fVar.f214b.f202e);
                }
                if (fVar.f214b.f201d != null) {
                    this.f214b.f201d = new Paint(fVar.f214b.f201d);
                }
                this.f215c = fVar.f215c;
                this.f216d = fVar.f216d;
                this.f217e = fVar.f217e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f218f.getWidth() && i3 == this.f218f.getHeight();
        }

        public boolean b() {
            return !this.f223k && this.f219g == this.f215c && this.f220h == this.f216d && this.f222j == this.f217e && this.f221i == this.f214b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f218f == null || !a(i2, i3)) {
                this.f218f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f223k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f218f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f224l == null) {
                    Paint paint = new Paint();
                    this.f224l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f224l.setAlpha(this.f214b.getRootAlpha());
                this.f224l.setColorFilter(colorFilter);
                return this.f224l;
            }
            return null;
        }

        public boolean f() {
            return this.f214b.getRootAlpha() < 255;
        }

        public void g() {
            this.f219g = this.f215c;
            this.f220h = this.f216d;
            this.f221i = this.f214b.getRootAlpha();
            this.f222j = this.f217e;
            this.f223k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f213a;
        }

        public void h(int i2, int i3) {
            this.f218f.eraseColor(0);
            this.f214b.f(new Canvas(this.f218f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    /* loaded from: classes.dex */
    private static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f225a;

        public g(Drawable.ConstantState constantState) {
            this.f225a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f225a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f225a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f157b = (VectorDrawable) this.f225a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f157b = (VectorDrawable) this.f225a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f157b = (VectorDrawable) this.f225a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f163g = true;
        this.f165i = new float[9];
        this.f166j = new Matrix();
        this.f167k = new Rect();
        this.f159c = new f();
    }

    h(f fVar) {
        this.f163g = true;
        this.f165i = new float[9];
        this.f166j = new Matrix();
        this.f167k = new Rect();
        this.f159c = fVar;
        this.f160d = updateTintFilter(this.f160d, fVar.f215c, fVar.f216d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f157b = h.b.a(resources, i2, theme);
            hVar.f164h = new g(hVar.f157b.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        a aVar;
        f fVar = this.f159c;
        e eVar = fVar.f214b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(eVar.f205h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    cVar.f182b.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.f212o.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    aVar = bVar;
                } else if ("clip-path".equals(name)) {
                    a aVar2 = new a();
                    aVar2.c(resources, attributeSet, theme, xmlPullParser);
                    cVar.f182b.add(aVar2);
                    String pathName = aVar2.getPathName();
                    aVar = aVar2;
                    if (pathName != null) {
                        eVar.f212o.put(aVar2.getPathName(), aVar2);
                        aVar = aVar2;
                    }
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    cVar2.c(resources, attributeSet, theme, xmlPullParser);
                    cVar.f182b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.f212o.put(cVar2.getGroupName(), cVar2);
                    }
                    i2 = fVar.f213a;
                    i3 = cVar2.f191k;
                    fVar.f213a = i3 | i2;
                }
                i2 = fVar.f213a;
                i3 = aVar.f196c;
                fVar.f213a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && j.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
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

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser) {
        f fVar = this.f159c;
        e eVar = fVar.f214b;
        fVar.f216d = g(h.c.d(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f215c = colorStateList;
        }
        fVar.f217e = h.c.a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f217e);
        eVar.f208k = h.c.c(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f208k);
        float c2 = h.c.c(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f209l);
        eVar.f209l = c2;
        if (eVar.f208k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            eVar.f206i = typedArray.getDimension(3, eVar.f206i);
            float dimension = typedArray.getDimension(2, eVar.f207j);
            eVar.f207j = dimension;
            if (eVar.f206i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                eVar.setAlpha(h.c.c(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    eVar.f211n = string;
                    eVar.f212o.put(string, eVar);
                }
            }
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f159c.f214b.f212o.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f167k);
        if (this.f167k.width() <= 0 || this.f167k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f161e;
        if (colorFilter == null) {
            colorFilter = this.f160d;
        }
        canvas.getMatrix(this.f166j);
        this.f166j.getValues(this.f165i);
        float abs = Math.abs(this.f165i[0]);
        float abs2 = Math.abs(this.f165i[4]);
        float abs3 = Math.abs(this.f165i[1]);
        float abs4 = Math.abs(this.f165i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f167k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f167k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f167k;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f167k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f167k.offsetTo(0, 0);
        this.f159c.c(min, min2);
        if (!this.f163g) {
            this.f159c.h(min, min2);
        } else if (!this.f159c.b()) {
            this.f159c.h(min, min2);
            this.f159c.g();
        }
        this.f159c.d(canvas, colorFilter, this.f167k);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f157b;
        return drawable != null ? j.a.c(drawable) : this.f159c.f214b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f159c.getChangingConfigurations();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f157b == null || Build.VERSION.SDK_INT < 24) {
            this.f159c.f213a = getChangingConfigurations();
            return this.f159c;
        }
        return new g(this.f157b.getConstantState());
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f159c.f214b.f207j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f159c.f214b.f206i;
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z) {
        this.f163g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f fVar = this.f159c;
        fVar.f214b = new e();
        TypedArray h2 = h.c.h(resources, theme, attributeSet, android.support.graphics.drawable.a.f128a);
        i(h2, xmlPullParser);
        h2.recycle();
        fVar.f213a = getChangingConfigurations();
        fVar.f223k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f160d = updateTintFilter(this.f160d, fVar.f215c, fVar.f216d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f157b;
        return drawable != null ? j.a.g(drawable) : this.f159c.f217e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || !((fVar = this.f159c) == null || (colorStateList = fVar.f215c) == null || !colorStateList.isStateful());
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f162f && super.mutate() == this) {
            this.f159c = new f(this.f159c);
            this.f162f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f157b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        f fVar = this.f159c;
        ColorStateList colorStateList = fVar.f215c;
        if (colorStateList == null || (mode = fVar.f216d) == null) {
            return false;
        }
        this.f160d = updateTintFilter(this.f160d, colorStateList, mode);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f159c.f214b.getRootAlpha() != i2) {
            this.f159c.f214b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.i(drawable, z);
        } else {
            this.f159c.f217e = z;
        }
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f161e = colorFilter;
        invalidateSelf();
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.support.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTint(int i2) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.n(drawable, colorStateList);
            return;
        }
        f fVar = this.f159c;
        if (fVar.f215c != colorStateList) {
            fVar.f215c = colorStateList;
            this.f160d = updateTintFilter(this.f160d, colorStateList, fVar.f216d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, j.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f157b;
        if (drawable != null) {
            j.a.o(drawable, mode);
            return;
        }
        f fVar = this.f159c;
        if (fVar.f216d != mode) {
            fVar.f216d = mode;
            this.f160d = updateTintFilter(this.f160d, fVar.f215c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f157b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f157b;
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
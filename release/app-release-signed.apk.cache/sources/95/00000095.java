package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import o.o;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: s  reason: collision with root package name */
    private static final int f502s = ViewConfiguration.getTapTimeout();

    /* renamed from: d  reason: collision with root package name */
    final View f505d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f506e;

    /* renamed from: h  reason: collision with root package name */
    private int f509h;

    /* renamed from: i  reason: collision with root package name */
    private int f510i;

    /* renamed from: m  reason: collision with root package name */
    private boolean f514m;

    /* renamed from: n  reason: collision with root package name */
    boolean f515n;

    /* renamed from: o  reason: collision with root package name */
    boolean f516o;

    /* renamed from: p  reason: collision with root package name */
    boolean f517p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f518q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f519r;

    /* renamed from: b  reason: collision with root package name */
    final C0005a f503b = new C0005a();

    /* renamed from: c  reason: collision with root package name */
    private final Interpolator f504c = new AccelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    private float[] f507f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    private float[] f508g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j  reason: collision with root package name */
    private float[] f511j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f512k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    private float[] f513l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0005a {

        /* renamed from: a  reason: collision with root package name */
        private int f520a;

        /* renamed from: b  reason: collision with root package name */
        private int f521b;

        /* renamed from: c  reason: collision with root package name */
        private float f522c;

        /* renamed from: d  reason: collision with root package name */
        private float f523d;

        /* renamed from: j  reason: collision with root package name */
        private float f529j;

        /* renamed from: k  reason: collision with root package name */
        private int f530k;

        /* renamed from: e  reason: collision with root package name */
        private long f524e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f528i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f525f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f526g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f527h = 0;

        C0005a() {
        }

        private float e(long j2) {
            long j3 = this.f524e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f528i;
            if (j4 < 0 || j2 < j4) {
                return a.e(((float) (j2 - j3)) / this.f520a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f529j;
            return (1.0f - f2) + (f2 * a.e(((float) (j2 - j4)) / this.f530k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f525f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g2 = g(e(currentAnimationTimeMillis));
            this.f525f = currentAnimationTimeMillis;
            float f2 = ((float) (currentAnimationTimeMillis - this.f525f)) * g2;
            this.f526g = (int) (this.f522c * f2);
            this.f527h = (int) (f2 * this.f523d);
        }

        public int b() {
            return this.f526g;
        }

        public int c() {
            return this.f527h;
        }

        public int d() {
            float f2 = this.f522c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f523d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f528i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f528i + ((long) this.f530k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f530k = a.f((int) (currentAnimationTimeMillis - this.f524e), 0, this.f521b);
            this.f529j = e(currentAnimationTimeMillis);
            this.f528i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f521b = i2;
        }

        public void k(int i2) {
            this.f520a = i2;
        }

        public void l(float f2, float f3) {
            this.f522c = f2;
            this.f523d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f524e = currentAnimationTimeMillis;
            this.f528i = -1L;
            this.f525f = currentAnimationTimeMillis;
            this.f529j = 0.5f;
            this.f526g = 0;
            this.f527h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f517p) {
                if (aVar.f515n) {
                    aVar.f515n = false;
                    aVar.f503b.m();
                }
                C0005a c0005a = a.this.f503b;
                if (c0005a.h() || !a.this.u()) {
                    a.this.f517p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f516o) {
                    aVar2.f516o = false;
                    aVar2.c();
                }
                c0005a.a();
                a.this.j(c0005a.b(), c0005a.c());
                o.n(a.this.f505d, this);
            }
        }
    }

    public a(View view) {
        this.f505d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f502s);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f507f[i2], f3, this.f508g[i2], f2);
        if (h2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f511j[i2];
        float f6 = this.f512k[i2];
        float f7 = this.f513l[i2];
        float f8 = f5 * f4;
        return h2 > 0.0f ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f509h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f517p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            interpolation = -this.f504c.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f504c.getInterpolation(g2);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f515n) {
            this.f517p = false;
        } else {
            this.f503b.i();
        }
    }

    private void v() {
        int i2;
        if (this.f506e == null) {
            this.f506e = new b();
        }
        this.f517p = true;
        this.f515n = true;
        if (this.f514m || (i2 = this.f510i) <= 0) {
            this.f506e.run();
        } else {
            o.o(this.f505d, this.f506e, i2);
        }
        this.f514m = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f505d.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f510i = i2;
        return this;
    }

    public a l(int i2) {
        this.f509h = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.f518q && !z) {
            i();
        }
        this.f518q = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f508g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f513l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f518q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f516o = r2
            r5.f514m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f505d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f505d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            android.support.v4.widget.a$a r7 = r5.f503b
            r7.l(r0, r6)
            boolean r6 = r5.f517p
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f519r
            if (r6 == 0) goto L61
            boolean r6 = r5.f517p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.f512k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f503b.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f503b.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f507f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f511j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0005a c0005a = this.f503b;
        int f2 = c0005a.f();
        int d2 = c0005a.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
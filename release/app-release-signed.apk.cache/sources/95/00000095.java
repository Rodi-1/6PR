package android.support.p001v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p016o.C0490o;

/* renamed from: android.support.v4.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0135a implements View.OnTouchListener {

    /* renamed from: s */
    private static final int f652s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final View f655d;

    /* renamed from: e */
    private Runnable f656e;

    /* renamed from: h */
    private int f659h;

    /* renamed from: i */
    private int f660i;

    /* renamed from: m */
    private boolean f664m;

    /* renamed from: n */
    boolean f665n;

    /* renamed from: o */
    boolean f666o;

    /* renamed from: p */
    boolean f667p;

    /* renamed from: q */
    private boolean f668q;

    /* renamed from: r */
    private boolean f669r;

    /* renamed from: b */
    final C0136a f653b = new C0136a();

    /* renamed from: c */
    private final Interpolator f654c = new AccelerateInterpolator();

    /* renamed from: f */
    private float[] f657f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f658g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private float[] f661j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f662k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f663l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0136a {

        /* renamed from: a */
        private int f670a;

        /* renamed from: b */
        private int f671b;

        /* renamed from: c */
        private float f672c;

        /* renamed from: d */
        private float f673d;

        /* renamed from: j */
        private float f679j;

        /* renamed from: k */
        private int f680k;

        /* renamed from: e */
        private long f674e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f678i = -1;

        /* renamed from: f */
        private long f675f = 0;

        /* renamed from: g */
        private int f676g = 0;

        /* renamed from: h */
        private int f677h = 0;

        C0136a() {
        }

        /* renamed from: e */
        private float m1760e(long j) {
            long j2 = this.f674e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f678i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC0135a.m1781e(((float) (j - j2)) / this.f670a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f679j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0135a.m1781e(((float) (j - j3)) / this.f680k, 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m1758g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void m1764a() {
            if (this.f675f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m1758g = m1758g(m1760e(currentAnimationTimeMillis));
            this.f675f = currentAnimationTimeMillis;
            float f = ((float) (currentAnimationTimeMillis - this.f675f)) * m1758g;
            this.f676g = (int) (this.f672c * f);
            this.f677h = (int) (f * this.f673d);
        }

        /* renamed from: b */
        public int m1763b() {
            return this.f676g;
        }

        /* renamed from: c */
        public int m1762c() {
            return this.f677h;
        }

        /* renamed from: d */
        public int m1761d() {
            float f = this.f672c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int m1759f() {
            float f = this.f673d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean m1757h() {
            return this.f678i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f678i + ((long) this.f680k);
        }

        /* renamed from: i */
        public void m1756i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f680k = AbstractView$OnTouchListenerC0135a.m1780f((int) (currentAnimationTimeMillis - this.f674e), 0, this.f671b);
            this.f679j = m1760e(currentAnimationTimeMillis);
            this.f678i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m1755j(int i) {
            this.f671b = i;
        }

        /* renamed from: k */
        public void m1754k(int i) {
            this.f670a = i;
        }

        /* renamed from: l */
        public void m1753l(float f, float f2) {
            this.f672c = f;
            this.f673d = f2;
        }

        /* renamed from: m */
        public void m1752m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f674e = currentAnimationTimeMillis;
            this.f678i = -1L;
            this.f675f = currentAnimationTimeMillis;
            this.f679j = 0.5f;
            this.f676g = 0;
            this.f677h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC0137b implements Runnable {
        RunnableC0137b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0135a abstractView$OnTouchListenerC0135a = AbstractView$OnTouchListenerC0135a.this;
            if (abstractView$OnTouchListenerC0135a.f667p) {
                if (abstractView$OnTouchListenerC0135a.f665n) {
                    abstractView$OnTouchListenerC0135a.f665n = false;
                    abstractView$OnTouchListenerC0135a.f653b.m1752m();
                }
                C0136a c0136a = AbstractView$OnTouchListenerC0135a.this.f653b;
                if (c0136a.m1757h() || !AbstractView$OnTouchListenerC0135a.this.m1766u()) {
                    AbstractView$OnTouchListenerC0135a.this.f667p = false;
                    return;
                }
                AbstractView$OnTouchListenerC0135a abstractView$OnTouchListenerC0135a2 = AbstractView$OnTouchListenerC0135a.this;
                if (abstractView$OnTouchListenerC0135a2.f666o) {
                    abstractView$OnTouchListenerC0135a2.f666o = false;
                    abstractView$OnTouchListenerC0135a2.m1783c();
                }
                c0136a.m1764a();
                AbstractView$OnTouchListenerC0135a.this.mo1730j(c0136a.m1763b(), c0136a.m1762c());
                C0490o.m398n(AbstractView$OnTouchListenerC0135a.this.f655d, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC0135a(View view) {
        this.f655d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m1772o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m1771p(f3, f3);
        m1775l(1);
        m1773n(Float.MAX_VALUE, Float.MAX_VALUE);
        m1768s(0.2f, 0.2f);
        m1767t(1.0f, 1.0f);
        m1776k(f652s);
        m1769r(500);
        m1770q(500);
    }

    /* renamed from: d */
    private float m1782d(int i, float f, float f2, float f3) {
        float m1778h = m1778h(this.f657f[i], f2, this.f658g[i], f);
        if (m1778h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f661j[i];
        float f5 = this.f662k[i];
        float f6 = this.f663l[i];
        float f7 = f4 * f3;
        return m1778h > 0.0f ? m1781e(m1778h * f7, f5, f6) : -m1781e((-m1778h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m1781e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m1780f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m1779g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f659h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f667p && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m1778h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m1781e = m1781e(f * f2, 0.0f, f3);
        float m1779g = m1779g(f2 - f4, m1781e) - m1779g(f4, m1781e);
        if (m1779g < 0.0f) {
            interpolation = -this.f654c.getInterpolation(-m1779g);
        } else if (m1779g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f654c.getInterpolation(m1779g);
        }
        return m1781e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m1777i() {
        if (this.f665n) {
            this.f667p = false;
        } else {
            this.f653b.m1756i();
        }
    }

    /* renamed from: v */
    private void m1765v() {
        int i;
        if (this.f656e == null) {
            this.f656e = new RunnableC0137b();
        }
        this.f667p = true;
        this.f665n = true;
        if (this.f664m || (i = this.f660i) <= 0) {
            this.f656e.run();
        } else {
            C0490o.m397o(this.f655d, this.f656e, i);
        }
        this.f664m = true;
    }

    /* renamed from: a */
    public abstract boolean mo1732a(int i);

    /* renamed from: b */
    public abstract boolean mo1731b(int i);

    /* renamed from: c */
    void m1783c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f655d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo1730j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC0135a m1776k(int i) {
        this.f660i = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC0135a m1775l(int i) {
        this.f659h = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC0135a m1774m(boolean z) {
        if (this.f668q && !z) {
            m1777i();
        }
        this.f668q = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC0135a m1773n(float f, float f2) {
        float[] fArr = this.f658g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC0135a m1772o(float f, float f2) {
        float[] fArr = this.f663l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
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
            boolean r0 = r5.f668q
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
            r5.m1777i()
            goto L58
        L1a:
            r5.f666o = r2
            r5.f664m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f655d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1782d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f655d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1782d(r2, r7, r6, r3)
            android.support.v4.widget.a$a r7 = r5.f653b
            r7.m1753l(r0, r6)
            boolean r6 = r5.f667p
            if (r6 != 0) goto L58
            boolean r6 = r5.m1766u()
            if (r6 == 0) goto L58
            r5.m1765v()
        L58:
            boolean r6 = r5.f669r
            if (r6 == 0) goto L61
            boolean r6 = r5.f667p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.AbstractView$OnTouchListenerC0135a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC0135a m1771p(float f, float f2) {
        float[] fArr = this.f662k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC0135a m1770q(int i) {
        this.f653b.m1755j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC0135a m1769r(int i) {
        this.f653b.m1754k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC0135a m1768s(float f, float f2) {
        float[] fArr = this.f657f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC0135a m1767t(float f, float f2) {
        float[] fArr = this.f661j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m1766u() {
        C0136a c0136a = this.f653b;
        int m1759f = c0136a.m1759f();
        int m1761d = c0136a.m1761d();
        return (m1759f != 0 && mo1731b(m1759f)) || (m1761d != 0 && mo1732a(m1761d));
    }
}
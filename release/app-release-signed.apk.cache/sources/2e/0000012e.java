package android.support.p002v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p024w.InterfaceC0610h;

/* renamed from: android.support.v7.widget.h0 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0268h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final float f1314b;

    /* renamed from: c */
    private final int f1315c;

    /* renamed from: d */
    private final int f1316d;

    /* renamed from: e */
    final View f1317e;

    /* renamed from: f */
    private Runnable f1318f;

    /* renamed from: g */
    private Runnable f1319g;

    /* renamed from: h */
    private boolean f1320h;

    /* renamed from: i */
    private int f1321i;

    /* renamed from: j */
    private final int[] f1322j = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.h0$a */
    /* loaded from: classes.dex */
    public class RunnableC0269a implements Runnable {
        RunnableC0269a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0268h0.this.f1317e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.h0$b */
    /* loaded from: classes.dex */
    public class RunnableC0270b implements Runnable {
        RunnableC0270b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0268h0.this.m1294e();
        }
    }

    public AbstractView$OnTouchListenerC0268h0(View view) {
        this.f1317e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1314b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1315c = tapTimeout;
        this.f1316d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1296a() {
        Runnable runnable = this.f1319g;
        if (runnable != null) {
            this.f1317e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1318f;
        if (runnable2 != null) {
            this.f1317e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1293f(MotionEvent motionEvent) {
        C0260f0 c0260f0;
        View view = this.f1317e;
        InterfaceC0610h mo1061b = mo1061b();
        if (mo1061b == null || !mo1061b.mo3c() || (c0260f0 = (C0260f0) mo1061b.mo2d()) == null || !c0260f0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1290i(view, obtainNoHistory);
        m1289j(c0260f0, obtainNoHistory);
        boolean mo1189f = c0260f0.mo1189f(obtainNoHistory, this.f1321i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo1189f && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1292g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1317e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1321i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1314b
            boolean r6 = m1291h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m1296a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m1296a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1321i = r6
            java.lang.Runnable r6 = r5.f1318f
            if (r6 != 0) goto L52
            android.support.v7.widget.h0$a r6 = new android.support.v7.widget.h0$a
            r6.<init>()
            r5.f1318f = r6
        L52:
            java.lang.Runnable r6 = r5.f1318f
            int r1 = r5.f1315c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1319g
            if (r6 != 0) goto L65
            android.support.v7.widget.h0$b r6 = new android.support.v7.widget.h0$b
            r6.<init>()
            r5.f1319g = r6
        L65:
            java.lang.Runnable r6 = r5.f1319g
            int r1 = r5.f1316d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.AbstractView$OnTouchListenerC0268h0.m1292g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1291h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m1290i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1322j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1289j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1322j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC0610h mo1061b();

    /* renamed from: c */
    protected abstract boolean mo1060c();

    /* renamed from: d */
    protected boolean mo1295d() {
        InterfaceC0610h mo1061b = mo1061b();
        if (mo1061b == null || !mo1061b.mo3c()) {
            return true;
        }
        mo1061b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m1294e() {
        m1296a();
        View view = this.f1317e;
        if (view.isEnabled() && !view.isLongClickable() && mo1060c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1320h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1320h;
        if (z2) {
            z = m1293f(motionEvent) || !mo1295d();
        } else {
            z = m1292g(motionEvent) && mo1060c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1317e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1320h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1320h = false;
        this.f1321i = -1;
        Runnable runnable = this.f1318f;
        if (runnable != null) {
            this.f1317e.removeCallbacks(runnable);
        }
    }
}
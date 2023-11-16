package android.support.p002v7.widget;

/* renamed from: android.support.v7.widget.n0 */
/* loaded from: classes.dex */
class C0295n0 {

    /* renamed from: a */
    private int f1420a = 0;

    /* renamed from: b */
    private int f1421b = 0;

    /* renamed from: c */
    private int f1422c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1423d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1424e = 0;

    /* renamed from: f */
    private int f1425f = 0;

    /* renamed from: g */
    private boolean f1426g = false;

    /* renamed from: h */
    private boolean f1427h = false;

    /* renamed from: a */
    public int m1187a() {
        return this.f1426g ? this.f1420a : this.f1421b;
    }

    /* renamed from: b */
    public int m1186b() {
        return this.f1420a;
    }

    /* renamed from: c */
    public int m1185c() {
        return this.f1421b;
    }

    /* renamed from: d */
    public int m1184d() {
        return this.f1426g ? this.f1421b : this.f1420a;
    }

    /* renamed from: e */
    public void m1183e(int i, int i2) {
        this.f1427h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1424e = i;
            this.f1420a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1425f = i2;
            this.f1421b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1182f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1426g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1426g = r2
            boolean r0 = r1.f1427h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1423d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1424e
        L16:
            r1.f1420a = r2
            int r2 = r1.f1422c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1422c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1424e
        L24:
            r1.f1420a = r2
            int r2 = r1.f1423d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1424e
            r1.f1420a = r2
        L2f:
            int r2 = r1.f1425f
        L31:
            r1.f1421b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.C0295n0.m1182f(boolean):void");
    }

    /* renamed from: g */
    public void m1181g(int i, int i2) {
        this.f1422c = i;
        this.f1423d = i2;
        this.f1427h = true;
        if (this.f1426g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1420a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1421b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1420a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1421b = i2;
        }
    }
}
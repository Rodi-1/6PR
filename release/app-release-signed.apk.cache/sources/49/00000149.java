package android.support.v7.widget;

/* loaded from: classes.dex */
class n0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1116a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1117b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1118c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1119d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1120e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1121f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1122g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1123h = false;

    public int a() {
        return this.f1122g ? this.f1116a : this.f1117b;
    }

    public int b() {
        return this.f1116a;
    }

    public int c() {
        return this.f1117b;
    }

    public int d() {
        return this.f1122g ? this.f1117b : this.f1116a;
    }

    public void e(int i2, int i3) {
        this.f1123h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1120e = i2;
            this.f1116a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1121f = i3;
            this.f1117b = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1122g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1122g = r2
            boolean r0 = r1.f1123h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1119d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1120e
        L16:
            r1.f1116a = r2
            int r2 = r1.f1118c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1118c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1120e
        L24:
            r1.f1116a = r2
            int r2 = r1.f1119d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1120e
            r1.f1116a = r2
        L2f:
            int r2 = r1.f1121f
        L31:
            r1.f1117b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.n0.f(boolean):void");
    }

    public void g(int i2, int i3) {
        this.f1118c = i2;
        this.f1119d = i3;
        this.f1123h = true;
        if (this.f1122g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1116a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1117b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1116a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1117b = i3;
        }
    }
}
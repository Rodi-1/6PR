package r;

/* loaded from: classes.dex */
class m {

    /* renamed from: d  reason: collision with root package name */
    private static m f1819d;

    /* renamed from: a  reason: collision with root package name */
    public long f1820a;

    /* renamed from: b  reason: collision with root package name */
    public long f1821b;

    /* renamed from: c  reason: collision with root package name */
    public int f1822c;

    m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m b() {
        if (f1819d == null) {
            f1819d = new m();
        }
        return f1819d;
    }

    public void a(long j2, double d2, double d3) {
        float f2;
        float f3 = ((float) (j2 - 946728000000L)) / 8.64E7f;
        double d4 = (0.01720197f * f3) + 6.24006f;
        Double.isNaN(d4);
        double sin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = f3 - 9.0E-4f;
        Double.isNaN(d6);
        double round = ((float) Math.round(d6 - d5)) + 9.0E-4f;
        Double.isNaN(round);
        double sin2 = round + d5 + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(asin))) / (Math.cos(d7) * Math.cos(asin));
        if (sin3 >= 1.0d) {
            this.f1822c = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            Double.isNaN(acos);
            this.f1820a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1821b = round2;
            if (round2 >= j2 || this.f1820a <= j2) {
                this.f1822c = 1;
                return;
            } else {
                this.f1822c = 0;
                return;
            }
        } else {
            this.f1822c = 0;
        }
        this.f1820a = -1L;
        this.f1821b = -1L;
    }
}
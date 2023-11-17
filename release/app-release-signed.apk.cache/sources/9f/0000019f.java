package f;

/* loaded from: classes.dex */
public class n extends o {

    /* renamed from: c  reason: collision with root package name */
    float f1494c = 0.0f;

    @Override // f.o
    public void e() {
        super.e();
        this.f1494c = 0.0f;
    }

    public void g() {
        this.f1496b = 2;
    }

    public void h(int i2) {
        int i3 = this.f1496b;
        if (i3 == 0 || this.f1494c != i2) {
            this.f1494c = i2;
            if (i3 == 1) {
                c();
            }
            b();
        }
    }
}
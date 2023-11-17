package e;

import java.util.Arrays;

/* loaded from: classes.dex */
public class i {

    /* renamed from: k  reason: collision with root package name */
    private static int f1376k = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f1377a;

    /* renamed from: e  reason: collision with root package name */
    public float f1381e;

    /* renamed from: g  reason: collision with root package name */
    a f1383g;

    /* renamed from: b  reason: collision with root package name */
    public int f1378b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f1379c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1380d = 0;

    /* renamed from: f  reason: collision with root package name */
    float[] f1382f = new float[7];

    /* renamed from: h  reason: collision with root package name */
    b[] f1384h = new b[8];

    /* renamed from: i  reason: collision with root package name */
    int f1385i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1386j = 0;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f1383g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        f1376k++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1385i;
            if (i2 >= i3) {
                b[] bVarArr = this.f1384h;
                if (i3 >= bVarArr.length) {
                    this.f1384h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1384h;
                int i4 = this.f1385i;
                bVarArr2[i4] = bVar;
                this.f1385i = i4 + 1;
                return;
            } else if (this.f1384h[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f1385i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f1384h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.f1384h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.f1385i--;
                return;
            }
        }
    }

    public void d() {
        this.f1377a = null;
        this.f1383g = a.UNKNOWN;
        this.f1380d = 0;
        this.f1378b = -1;
        this.f1379c = -1;
        this.f1381e = 0.0f;
        this.f1385i = 0;
        this.f1386j = 0;
    }

    public void e(a aVar, String str) {
        this.f1383g = aVar;
    }

    public final void f(b bVar) {
        int i2 = this.f1385i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.f1384h;
            bVarArr[i3].f1351d.n(bVarArr[i3], bVar, false);
        }
        this.f1385i = 0;
    }

    public String toString() {
        return "" + this.f1377a;
    }
}
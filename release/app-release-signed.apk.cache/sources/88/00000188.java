package e;

/* loaded from: classes.dex */
class h<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1374a;

    /* renamed from: b  reason: collision with root package name */
    private int f1375b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1374a = new Object[i2];
    }

    @Override // e.g
    public void a(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t2 = tArr[i3];
            int i4 = this.f1375b;
            Object[] objArr = this.f1374a;
            if (i4 < objArr.length) {
                objArr[i4] = t2;
                this.f1375b = i4 + 1;
            }
        }
    }

    @Override // e.g
    public boolean b(T t2) {
        int i2 = this.f1375b;
        Object[] objArr = this.f1374a;
        if (i2 < objArr.length) {
            objArr[i2] = t2;
            this.f1375b = i2 + 1;
            return true;
        }
        return false;
    }

    @Override // e.g
    public T c() {
        int i2 = this.f1375b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = this.f1374a;
            T t2 = (T) objArr[i3];
            objArr[i3] = null;
            this.f1375b = i2 - 1;
            return t2;
        }
        return null;
    }
}
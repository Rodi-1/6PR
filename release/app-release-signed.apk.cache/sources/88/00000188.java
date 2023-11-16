package p006e;

/* renamed from: e.h */
/* loaded from: classes.dex */
class C0358h<T> implements InterfaceC0357g<T> {

    /* renamed from: a */
    private final Object[] f1800a;

    /* renamed from: b */
    private int f1801b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0358h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1800a = new Object[i];
    }

    @Override // p006e.InterfaceC0357g
    /* renamed from: a */
    public void mo929a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f1801b;
            Object[] objArr = this.f1800a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f1801b = i3 + 1;
            }
        }
    }

    @Override // p006e.InterfaceC0357g
    /* renamed from: b */
    public boolean mo928b(T t) {
        int i = this.f1801b;
        Object[] objArr = this.f1800a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f1801b = i + 1;
            return true;
        }
        return false;
    }

    @Override // p006e.InterfaceC0357g
    /* renamed from: c */
    public T mo927c() {
        int i = this.f1801b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f1800a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f1801b = i - 1;
            return t;
        }
        return null;
    }
}
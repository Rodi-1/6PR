package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f1683b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f1682c = new C0020a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: o.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0020a extends a {
        C0020a() {
            super((C0020a) null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f1682c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f1683b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1683b = readParcelable == null ? f1682c : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1683b = parcelable == f1682c ? null : parcelable;
    }

    /* synthetic */ a(C0020a c0020a) {
        this();
    }

    public final Parcelable a() {
        return this.f1683b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1683b, i2);
    }
}
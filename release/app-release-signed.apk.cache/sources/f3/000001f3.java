package p016o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.a */
/* loaded from: classes.dex */
public abstract class AbstractC0464a implements Parcelable {

    /* renamed from: b */
    private final Parcelable f2201b;

    /* renamed from: c */
    public static final AbstractC0464a f2200c = new C0465a();
    public static final Parcelable.Creator<AbstractC0464a> CREATOR = new C0466b();

    /* renamed from: o.a$a */
    /* loaded from: classes.dex */
    static class C0465a extends AbstractC0464a {
        C0465a() {
            super((C0465a) null);
        }
    }

    /* renamed from: o.a$b */
    /* loaded from: classes.dex */
    static class C0466b implements Parcelable.ClassLoaderCreator<AbstractC0464a> {
        C0466b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbstractC0464a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbstractC0464a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0464a.f2200c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbstractC0464a[] newArray(int i) {
            return new AbstractC0464a[i];
        }
    }

    private AbstractC0464a() {
        this.f2201b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0464a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2201b = readParcelable == null ? f2200c : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0464a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2201b = parcelable == f2200c ? null : parcelable;
    }

    /* synthetic */ AbstractC0464a(C0465a c0465a) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m475a() {
        return this.f2201b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2201b, i);
    }
}
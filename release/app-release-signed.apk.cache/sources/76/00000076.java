package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    p[] f394b;

    /* renamed from: c  reason: collision with root package name */
    int[] f395c;

    /* renamed from: d  reason: collision with root package name */
    d[] f396d;

    /* renamed from: e  reason: collision with root package name */
    int f397e;

    /* renamed from: f  reason: collision with root package name */
    int f398f;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public o[] newArray(int i2) {
            return new o[i2];
        }
    }

    public o() {
        this.f397e = -1;
    }

    public o(Parcel parcel) {
        this.f397e = -1;
        this.f394b = (p[]) parcel.createTypedArray(p.CREATOR);
        this.f395c = parcel.createIntArray();
        this.f396d = (d[]) parcel.createTypedArray(d.CREATOR);
        this.f397e = parcel.readInt();
        this.f398f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f394b, i2);
        parcel.writeIntArray(this.f395c);
        parcel.writeTypedArray(this.f396d, i2);
        parcel.writeInt(this.f397e);
        parcel.writeInt(this.f398f);
    }
}
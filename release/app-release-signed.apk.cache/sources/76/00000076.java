package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.o */
/* loaded from: classes.dex */
public final class C0105o implements Parcelable {
    public static final Parcelable.Creator<C0105o> CREATOR = new C0106a();

    /* renamed from: b */
    C0107p[] f538b;

    /* renamed from: c */
    int[] f539c;

    /* renamed from: d */
    C0069d[] f540d;

    /* renamed from: e */
    int f541e;

    /* renamed from: f */
    int f542f;

    /* renamed from: android.support.v4.app.o$a */
    /* loaded from: classes.dex */
    static class C0106a implements Parcelable.Creator<C0105o> {
        C0106a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0105o createFromParcel(Parcel parcel) {
            return new C0105o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0105o[] newArray(int i) {
            return new C0105o[i];
        }
    }

    public C0105o() {
        this.f541e = -1;
    }

    public C0105o(Parcel parcel) {
        this.f541e = -1;
        this.f538b = (C0107p[]) parcel.createTypedArray(C0107p.CREATOR);
        this.f539c = parcel.createIntArray();
        this.f540d = (C0069d[]) parcel.createTypedArray(C0069d.CREATOR);
        this.f541e = parcel.readInt();
        this.f542f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f538b, i);
        parcel.writeIntArray(this.f539c);
        parcel.writeTypedArray(this.f540d, i);
        parcel.writeInt(this.f541e);
        parcel.writeInt(this.f542f);
    }
}
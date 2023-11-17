package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int[] f266b;

    /* renamed from: c  reason: collision with root package name */
    final int f267c;

    /* renamed from: d  reason: collision with root package name */
    final int f268d;

    /* renamed from: e  reason: collision with root package name */
    final String f269e;

    /* renamed from: f  reason: collision with root package name */
    final int f270f;

    /* renamed from: g  reason: collision with root package name */
    final int f271g;

    /* renamed from: h  reason: collision with root package name */
    final CharSequence f272h;

    /* renamed from: i  reason: collision with root package name */
    final int f273i;

    /* renamed from: j  reason: collision with root package name */
    final CharSequence f274j;

    /* renamed from: k  reason: collision with root package name */
    final ArrayList<String> f275k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<String> f276l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f277m;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public d(Parcel parcel) {
        this.f266b = parcel.createIntArray();
        this.f267c = parcel.readInt();
        this.f268d = parcel.readInt();
        this.f269e = parcel.readString();
        this.f270f = parcel.readInt();
        this.f271g = parcel.readInt();
        this.f272h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f273i = parcel.readInt();
        this.f274j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f275k = parcel.createStringArrayList();
        this.f276l = parcel.createStringArrayList();
        this.f277m = parcel.readInt() != 0;
    }

    public d(c cVar) {
        int size = cVar.f240b.size();
        this.f266b = new int[size * 6];
        if (!cVar.f247i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c.a aVar = cVar.f240b.get(i3);
            int[] iArr = this.f266b;
            int i4 = i2 + 1;
            iArr[i2] = aVar.f260a;
            int i5 = i4 + 1;
            g gVar = aVar.f261b;
            iArr[i4] = gVar != null ? gVar.f283e : -1;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f262c;
            int i7 = i6 + 1;
            iArr[i6] = aVar.f263d;
            int i8 = i7 + 1;
            iArr[i7] = aVar.f264e;
            i2 = i8 + 1;
            iArr[i8] = aVar.f265f;
        }
        this.f267c = cVar.f245g;
        this.f268d = cVar.f246h;
        this.f269e = cVar.f249k;
        this.f270f = cVar.f251m;
        this.f271g = cVar.f252n;
        this.f272h = cVar.f253o;
        this.f273i = cVar.f254p;
        this.f274j = cVar.f255q;
        this.f275k = cVar.f256r;
        this.f276l = cVar.f257s;
        this.f277m = cVar.f258t;
    }

    public c a(m mVar) {
        c cVar = new c(mVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f266b.length) {
            c.a aVar = new c.a();
            int i4 = i2 + 1;
            aVar.f260a = this.f266b[i2];
            if (m.F) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i3 + " base fragment #" + this.f266b[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.f266b[i4];
            aVar.f261b = i6 >= 0 ? mVar.f346f.get(i6) : null;
            int[] iArr = this.f266b;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar.f262c = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar.f263d = i10;
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            aVar.f264e = i12;
            int i13 = iArr[i11];
            aVar.f265f = i13;
            cVar.f241c = i8;
            cVar.f242d = i10;
            cVar.f243e = i12;
            cVar.f244f = i13;
            cVar.b(aVar);
            i3++;
            i2 = i11 + 1;
        }
        cVar.f245g = this.f267c;
        cVar.f246h = this.f268d;
        cVar.f249k = this.f269e;
        cVar.f251m = this.f270f;
        cVar.f247i = true;
        cVar.f252n = this.f271g;
        cVar.f253o = this.f272h;
        cVar.f254p = this.f273i;
        cVar.f255q = this.f274j;
        cVar.f256r = this.f275k;
        cVar.f257s = this.f276l;
        cVar.f258t = this.f277m;
        cVar.c(1);
        return cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f266b);
        parcel.writeInt(this.f267c);
        parcel.writeInt(this.f268d);
        parcel.writeString(this.f269e);
        parcel.writeInt(this.f270f);
        parcel.writeInt(this.f271g);
        TextUtils.writeToParcel(this.f272h, parcel, 0);
        parcel.writeInt(this.f273i);
        TextUtils.writeToParcel(this.f274j, parcel, 0);
        parcel.writeStringList(this.f275k);
        parcel.writeStringList(this.f276l);
        parcel.writeInt(this.f277m ? 1 : 0);
    }
}
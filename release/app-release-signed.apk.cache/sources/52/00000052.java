package android.support.p001v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.app.C0067c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.d */
/* loaded from: classes.dex */
public final class C0069d implements Parcelable {
    public static final Parcelable.Creator<C0069d> CREATOR = new C0070a();

    /* renamed from: b */
    final int[] f372b;

    /* renamed from: c */
    final int f373c;

    /* renamed from: d */
    final int f374d;

    /* renamed from: e */
    final String f375e;

    /* renamed from: f */
    final int f376f;

    /* renamed from: g */
    final int f377g;

    /* renamed from: h */
    final CharSequence f378h;

    /* renamed from: i */
    final int f379i;

    /* renamed from: j */
    final CharSequence f380j;

    /* renamed from: k */
    final ArrayList<String> f381k;

    /* renamed from: l */
    final ArrayList<String> f382l;

    /* renamed from: m */
    final boolean f383m;

    /* renamed from: android.support.v4.app.d$a */
    /* loaded from: classes.dex */
    static class C0070a implements Parcelable.Creator<C0069d> {
        C0070a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0069d createFromParcel(Parcel parcel) {
            return new C0069d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0069d[] newArray(int i) {
            return new C0069d[i];
        }
    }

    public C0069d(Parcel parcel) {
        this.f372b = parcel.createIntArray();
        this.f373c = parcel.readInt();
        this.f374d = parcel.readInt();
        this.f375e = parcel.readString();
        this.f376f = parcel.readInt();
        this.f377g = parcel.readInt();
        this.f378h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f379i = parcel.readInt();
        this.f380j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f381k = parcel.createStringArrayList();
        this.f382l = parcel.createStringArrayList();
        this.f383m = parcel.readInt() != 0;
    }

    public C0069d(C0067c c0067c) {
        int size = c0067c.f346b.size();
        this.f372b = new int[size * 6];
        if (!c0067c.f353i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0067c.C0068a c0068a = c0067c.f346b.get(i2);
            int[] iArr = this.f372b;
            int i3 = i + 1;
            iArr[i] = c0068a.f366a;
            int i4 = i3 + 1;
            ComponentCallbacksC0073g componentCallbacksC0073g = c0068a.f367b;
            iArr[i3] = componentCallbacksC0073g != null ? componentCallbacksC0073g.f410e : -1;
            int i5 = i4 + 1;
            iArr[i4] = c0068a.f368c;
            int i6 = i5 + 1;
            iArr[i5] = c0068a.f369d;
            int i7 = i6 + 1;
            iArr[i6] = c0068a.f370e;
            i = i7 + 1;
            iArr[i7] = c0068a.f371f;
        }
        this.f373c = c0067c.f351g;
        this.f374d = c0067c.f352h;
        this.f375e = c0067c.f355k;
        this.f376f = c0067c.f357m;
        this.f377g = c0067c.f358n;
        this.f378h = c0067c.f359o;
        this.f379i = c0067c.f360p;
        this.f380j = c0067c.f361q;
        this.f381k = c0067c.f362r;
        this.f382l = c0067c.f363s;
        this.f383m = c0067c.f364t;
    }

    /* renamed from: a */
    public C0067c m2201a(LayoutInflater$Factory2C0089m layoutInflater$Factory2C0089m) {
        C0067c c0067c = new C0067c(layoutInflater$Factory2C0089m);
        int i = 0;
        int i2 = 0;
        while (i < this.f372b.length) {
            C0067c.C0068a c0068a = new C0067c.C0068a();
            int i3 = i + 1;
            c0068a.f366a = this.f372b[i];
            if (LayoutInflater$Factory2C0089m.f472F) {
                Log.v("FragmentManager", "Instantiate " + c0067c + " op #" + i2 + " base fragment #" + this.f372b[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f372b[i3];
            c0068a.f367b = i5 >= 0 ? layoutInflater$Factory2C0089m.f487f.get(i5) : null;
            int[] iArr = this.f372b;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            c0068a.f368c = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            c0068a.f369d = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            c0068a.f370e = i11;
            int i12 = iArr[i10];
            c0068a.f371f = i12;
            c0067c.f347c = i7;
            c0067c.f348d = i9;
            c0067c.f349e = i11;
            c0067c.f350f = i12;
            c0067c.m2216b(c0068a);
            i2++;
            i = i10 + 1;
        }
        c0067c.f351g = this.f373c;
        c0067c.f352h = this.f374d;
        c0067c.f355k = this.f375e;
        c0067c.f357m = this.f376f;
        c0067c.f353i = true;
        c0067c.f358n = this.f377g;
        c0067c.f359o = this.f378h;
        c0067c.f360p = this.f379i;
        c0067c.f361q = this.f380j;
        c0067c.f362r = this.f381k;
        c0067c.f363s = this.f382l;
        c0067c.f364t = this.f383m;
        c0067c.m2215c(1);
        return c0067c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f372b);
        parcel.writeInt(this.f373c);
        parcel.writeInt(this.f374d);
        parcel.writeString(this.f375e);
        parcel.writeInt(this.f376f);
        parcel.writeInt(this.f377g);
        TextUtils.writeToParcel(this.f378h, parcel, 0);
        parcel.writeInt(this.f379i);
        TextUtils.writeToParcel(this.f380j, parcel, 0);
        parcel.writeStringList(this.f381k);
        parcel.writeStringList(this.f382l);
        parcel.writeInt(this.f383m ? 1 : 0);
    }
}
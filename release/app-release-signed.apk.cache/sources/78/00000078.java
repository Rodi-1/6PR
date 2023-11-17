package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final String f399b;

    /* renamed from: c  reason: collision with root package name */
    final int f400c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f401d;

    /* renamed from: e  reason: collision with root package name */
    final int f402e;

    /* renamed from: f  reason: collision with root package name */
    final int f403f;

    /* renamed from: g  reason: collision with root package name */
    final String f404g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f405h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f406i;

    /* renamed from: j  reason: collision with root package name */
    final Bundle f407j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f408k;

    /* renamed from: l  reason: collision with root package name */
    Bundle f409l;

    /* renamed from: m  reason: collision with root package name */
    g f410m;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    p(Parcel parcel) {
        this.f399b = parcel.readString();
        this.f400c = parcel.readInt();
        this.f401d = parcel.readInt() != 0;
        this.f402e = parcel.readInt();
        this.f403f = parcel.readInt();
        this.f404g = parcel.readString();
        this.f405h = parcel.readInt() != 0;
        this.f406i = parcel.readInt() != 0;
        this.f407j = parcel.readBundle();
        this.f408k = parcel.readInt() != 0;
        this.f409l = parcel.readBundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(g gVar) {
        this.f399b = gVar.getClass().getName();
        this.f400c = gVar.f283e;
        this.f401d = gVar.f291m;
        this.f402e = gVar.x;
        this.f403f = gVar.y;
        this.f404g = gVar.z;
        this.f405h = gVar.C;
        this.f406i = gVar.B;
        this.f407j = gVar.f285g;
        this.f408k = gVar.A;
    }

    public g a(k kVar, i iVar, g gVar, n nVar, android.arch.lifecycle.n nVar2) {
        if (this.f410m == null) {
            Context e2 = kVar.e();
            Bundle bundle = this.f407j;
            if (bundle != null) {
                bundle.setClassLoader(e2.getClassLoader());
            }
            this.f410m = iVar != null ? iVar.a(e2, this.f399b, this.f407j) : g.F(e2, this.f399b, this.f407j);
            Bundle bundle2 = this.f409l;
            if (bundle2 != null) {
                bundle2.setClassLoader(e2.getClassLoader());
                this.f410m.f281c = this.f409l;
            }
            this.f410m.X0(this.f400c, gVar);
            g gVar2 = this.f410m;
            gVar2.f291m = this.f401d;
            gVar2.f293o = true;
            gVar2.x = this.f402e;
            gVar2.y = this.f403f;
            gVar2.z = this.f404g;
            gVar2.C = this.f405h;
            gVar2.B = this.f406i;
            gVar2.A = this.f408k;
            gVar2.f296r = kVar.f341e;
            if (m.F) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f410m);
            }
        }
        g gVar3 = this.f410m;
        gVar3.f299u = nVar;
        gVar3.f300v = nVar2;
        return gVar3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f399b);
        parcel.writeInt(this.f400c);
        parcel.writeInt(this.f401d ? 1 : 0);
        parcel.writeInt(this.f402e);
        parcel.writeInt(this.f403f);
        parcel.writeString(this.f404g);
        parcel.writeInt(this.f405h ? 1 : 0);
        parcel.writeInt(this.f406i ? 1 : 0);
        parcel.writeBundle(this.f407j);
        parcel.writeInt(this.f408k ? 1 : 0);
        parcel.writeBundle(this.f409l);
    }
}
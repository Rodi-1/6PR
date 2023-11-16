package android.support.p001v4.app;

import android.arch.lifecycle.C0026n;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.p */
/* loaded from: classes.dex */
public final class C0107p implements Parcelable {
    public static final Parcelable.Creator<C0107p> CREATOR = new C0108a();

    /* renamed from: b */
    final String f543b;

    /* renamed from: c */
    final int f544c;

    /* renamed from: d */
    final boolean f545d;

    /* renamed from: e */
    final int f546e;

    /* renamed from: f */
    final int f547f;

    /* renamed from: g */
    final String f548g;

    /* renamed from: h */
    final boolean f549h;

    /* renamed from: i */
    final boolean f550i;

    /* renamed from: j */
    final Bundle f551j;

    /* renamed from: k */
    final boolean f552k;

    /* renamed from: l */
    Bundle f553l;

    /* renamed from: m */
    ComponentCallbacksC0073g f554m;

    /* renamed from: android.support.v4.app.p$a */
    /* loaded from: classes.dex */
    static class C0108a implements Parcelable.Creator<C0107p> {
        C0108a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0107p createFromParcel(Parcel parcel) {
            return new C0107p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0107p[] newArray(int i) {
            return new C0107p[i];
        }
    }

    C0107p(Parcel parcel) {
        this.f543b = parcel.readString();
        this.f544c = parcel.readInt();
        this.f545d = parcel.readInt() != 0;
        this.f546e = parcel.readInt();
        this.f547f = parcel.readInt();
        this.f548g = parcel.readString();
        this.f549h = parcel.readInt() != 0;
        this.f550i = parcel.readInt() != 0;
        this.f551j = parcel.readBundle();
        this.f552k = parcel.readInt() != 0;
        this.f553l = parcel.readBundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0107p(ComponentCallbacksC0073g componentCallbacksC0073g) {
        this.f543b = componentCallbacksC0073g.getClass().getName();
        this.f544c = componentCallbacksC0073g.f410e;
        this.f545d = componentCallbacksC0073g.f418m;
        this.f546e = componentCallbacksC0073g.f429x;
        this.f547f = componentCallbacksC0073g.f430y;
        this.f548g = componentCallbacksC0073g.f431z;
        this.f549h = componentCallbacksC0073g.f390C;
        this.f550i = componentCallbacksC0073g.f389B;
        this.f551j = componentCallbacksC0073g.f412g;
        this.f552k = componentCallbacksC0073g.f388A;
    }

    /* renamed from: a */
    public ComponentCallbacksC0073g m1894a(AbstractC0085k abstractC0085k, AbstractC0083i abstractC0083i, ComponentCallbacksC0073g componentCallbacksC0073g, C0104n c0104n, C0026n c0026n) {
        if (this.f554m == null) {
            Context m2042e = abstractC0085k.m2042e();
            Bundle bundle = this.f551j;
            if (bundle != null) {
                bundle.setClassLoader(m2042e.getClassLoader());
            }
            this.f554m = abstractC0083i != null ? abstractC0083i.mo2073a(m2042e, this.f543b, this.f551j) : ComponentCallbacksC0073g.m2187F(m2042e, this.f543b, this.f551j);
            Bundle bundle2 = this.f553l;
            if (bundle2 != null) {
                bundle2.setClassLoader(m2042e.getClassLoader());
                this.f554m.f408c = this.f553l;
            }
            this.f554m.m2150X0(this.f544c, componentCallbacksC0073g);
            ComponentCallbacksC0073g componentCallbacksC0073g2 = this.f554m;
            componentCallbacksC0073g2.f418m = this.f545d;
            componentCallbacksC0073g2.f420o = true;
            componentCallbacksC0073g2.f429x = this.f546e;
            componentCallbacksC0073g2.f430y = this.f547f;
            componentCallbacksC0073g2.f431z = this.f548g;
            componentCallbacksC0073g2.f390C = this.f549h;
            componentCallbacksC0073g2.f389B = this.f550i;
            componentCallbacksC0073g2.f388A = this.f552k;
            componentCallbacksC0073g2.f423r = abstractC0085k.f471e;
            if (LayoutInflater$Factory2C0089m.f472F) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f554m);
            }
        }
        ComponentCallbacksC0073g componentCallbacksC0073g3 = this.f554m;
        componentCallbacksC0073g3.f426u = c0104n;
        componentCallbacksC0073g3.f427v = c0026n;
        return componentCallbacksC0073g3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f543b);
        parcel.writeInt(this.f544c);
        parcel.writeInt(this.f545d ? 1 : 0);
        parcel.writeInt(this.f546e);
        parcel.writeInt(this.f547f);
        parcel.writeString(this.f548g);
        parcel.writeInt(this.f549h ? 1 : 0);
        parcel.writeInt(this.f550i ? 1 : 0);
        parcel.writeBundle(this.f551j);
        parcel.writeInt(this.f552k ? 1 : 0);
        parcel.writeBundle(this.f553l);
    }
}
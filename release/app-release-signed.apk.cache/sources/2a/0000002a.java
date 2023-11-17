package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f98b = {0, 4, 8};

    /* renamed from: c  reason: collision with root package name */
    private static SparseIntArray f99c;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, C0002b> f100a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.constraint.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a  reason: collision with root package name */
        boolean f101a;
        public float a0;

        /* renamed from: b  reason: collision with root package name */
        public int f102b;
        public float b0;

        /* renamed from: c  reason: collision with root package name */
        public int f103c;
        public float c0;

        /* renamed from: d  reason: collision with root package name */
        int f104d;
        public float d0;

        /* renamed from: e  reason: collision with root package name */
        public int f105e;
        public float e0;

        /* renamed from: f  reason: collision with root package name */
        public int f106f;
        public float f0;

        /* renamed from: g  reason: collision with root package name */
        public float f107g;
        public float g0;

        /* renamed from: h  reason: collision with root package name */
        public int f108h;
        public boolean h0;

        /* renamed from: i  reason: collision with root package name */
        public int f109i;
        public boolean i0;

        /* renamed from: j  reason: collision with root package name */
        public int f110j;
        public int j0;

        /* renamed from: k  reason: collision with root package name */
        public int f111k;
        public int k0;

        /* renamed from: l  reason: collision with root package name */
        public int f112l;
        public int l0;

        /* renamed from: m  reason: collision with root package name */
        public int f113m;
        public int m0;

        /* renamed from: n  reason: collision with root package name */
        public int f114n;
        public int n0;

        /* renamed from: o  reason: collision with root package name */
        public int f115o;
        public int o0;

        /* renamed from: p  reason: collision with root package name */
        public int f116p;
        public float p0;

        /* renamed from: q  reason: collision with root package name */
        public int f117q;
        public float q0;

        /* renamed from: r  reason: collision with root package name */
        public int f118r;
        public boolean r0;

        /* renamed from: s  reason: collision with root package name */
        public int f119s;
        public int s0;

        /* renamed from: t  reason: collision with root package name */
        public int f120t;
        public int t0;

        /* renamed from: u  reason: collision with root package name */
        public float f121u;
        public int[] u0;

        /* renamed from: v  reason: collision with root package name */
        public float f122v;
        public String v0;

        /* renamed from: w  reason: collision with root package name */
        public String f123w;
        public int x;
        public int y;
        public float z;

        private C0002b() {
            this.f101a = false;
            this.f105e = -1;
            this.f106f = -1;
            this.f107g = -1.0f;
            this.f108h = -1;
            this.f109i = -1;
            this.f110j = -1;
            this.f111k = -1;
            this.f112l = -1;
            this.f113m = -1;
            this.f114n = -1;
            this.f115o = -1;
            this.f116p = -1;
            this.f117q = -1;
            this.f118r = -1;
            this.f119s = -1;
            this.f120t = -1;
            this.f121u = 0.5f;
            this.f122v = 0.5f;
            this.f123w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.a0 = 1.0f;
            this.b0 = 1.0f;
            this.c0 = Float.NaN;
            this.d0 = Float.NaN;
            this.e0 = 0.0f;
            this.f0 = 0.0f;
            this.g0 = 0.0f;
            this.h0 = false;
            this.i0 = false;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 1.0f;
            this.q0 = 1.0f;
            this.r0 = false;
            this.s0 = -1;
            this.t0 = -1;
        }

        private void e(int i2, ConstraintLayout.a aVar) {
            this.f104d = i2;
            this.f108h = aVar.f71d;
            this.f109i = aVar.f72e;
            this.f110j = aVar.f73f;
            this.f111k = aVar.f74g;
            this.f112l = aVar.f75h;
            this.f113m = aVar.f76i;
            this.f114n = aVar.f77j;
            this.f115o = aVar.f78k;
            this.f116p = aVar.f79l;
            this.f117q = aVar.f83p;
            this.f118r = aVar.f84q;
            this.f119s = aVar.f85r;
            this.f120t = aVar.f86s;
            this.f121u = aVar.z;
            this.f122v = aVar.A;
            this.f123w = aVar.B;
            this.x = aVar.f80m;
            this.y = aVar.f81n;
            this.z = aVar.f82o;
            this.A = aVar.Q;
            this.B = aVar.R;
            this.C = aVar.S;
            this.f107g = aVar.f70c;
            this.f105e = aVar.f68a;
            this.f106f = aVar.f69b;
            this.f102b = ((ViewGroup.MarginLayoutParams) aVar).width;
            this.f103c = ((ViewGroup.MarginLayoutParams) aVar).height;
            this.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            this.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            this.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            this.Q = aVar.F;
            this.R = aVar.E;
            this.T = aVar.H;
            this.S = aVar.G;
            boolean z = aVar.T;
            this.i0 = aVar.U;
            this.j0 = aVar.I;
            this.k0 = aVar.J;
            this.h0 = z;
            this.l0 = aVar.M;
            this.m0 = aVar.N;
            this.n0 = aVar.K;
            this.o0 = aVar.L;
            this.p0 = aVar.O;
            this.q0 = aVar.P;
            this.H = aVar.getMarginEnd();
            this.I = aVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i2, c.a aVar) {
            e(i2, aVar);
            this.U = aVar.n0;
            this.X = aVar.q0;
            this.Y = aVar.r0;
            this.Z = aVar.s0;
            this.a0 = aVar.t0;
            this.b0 = aVar.u0;
            this.c0 = aVar.v0;
            this.d0 = aVar.w0;
            this.e0 = aVar.x0;
            this.f0 = aVar.y0;
            this.g0 = aVar.z0;
            this.W = aVar.p0;
            this.V = aVar.o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(android.support.constraint.a aVar, int i2, c.a aVar2) {
            f(i2, aVar2);
            if (aVar instanceof d.a) {
                this.t0 = 1;
                d.a aVar3 = (d.a) aVar;
                this.s0 = aVar3.getType();
                this.u0 = aVar3.getReferencedIds();
            }
        }

        public void c(ConstraintLayout.a aVar) {
            aVar.f71d = this.f108h;
            aVar.f72e = this.f109i;
            aVar.f73f = this.f110j;
            aVar.f74g = this.f111k;
            aVar.f75h = this.f112l;
            aVar.f76i = this.f113m;
            aVar.f77j = this.f114n;
            aVar.f78k = this.f115o;
            aVar.f79l = this.f116p;
            aVar.f83p = this.f117q;
            aVar.f84q = this.f118r;
            aVar.f85r = this.f119s;
            aVar.f86s = this.f120t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = this.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = this.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = this.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.f121u;
            aVar.A = this.f122v;
            aVar.f80m = this.x;
            aVar.f81n = this.y;
            aVar.f82o = this.z;
            aVar.B = this.f123w;
            aVar.Q = this.A;
            aVar.R = this.B;
            aVar.F = this.Q;
            aVar.E = this.R;
            aVar.H = this.T;
            aVar.G = this.S;
            aVar.T = this.h0;
            aVar.U = this.i0;
            aVar.I = this.j0;
            aVar.J = this.k0;
            aVar.M = this.l0;
            aVar.N = this.m0;
            aVar.K = this.n0;
            aVar.L = this.o0;
            aVar.O = this.p0;
            aVar.P = this.q0;
            aVar.S = this.C;
            aVar.f70c = this.f107g;
            aVar.f68a = this.f105e;
            aVar.f69b = this.f106f;
            ((ViewGroup.MarginLayoutParams) aVar).width = this.f102b;
            ((ViewGroup.MarginLayoutParams) aVar).height = this.f103c;
            aVar.setMarginStart(this.I);
            aVar.setMarginEnd(this.H);
            aVar.a();
        }

        /* renamed from: d */
        public C0002b clone() {
            C0002b c0002b = new C0002b();
            c0002b.f101a = this.f101a;
            c0002b.f102b = this.f102b;
            c0002b.f103c = this.f103c;
            c0002b.f105e = this.f105e;
            c0002b.f106f = this.f106f;
            c0002b.f107g = this.f107g;
            c0002b.f108h = this.f108h;
            c0002b.f109i = this.f109i;
            c0002b.f110j = this.f110j;
            c0002b.f111k = this.f111k;
            c0002b.f112l = this.f112l;
            c0002b.f113m = this.f113m;
            c0002b.f114n = this.f114n;
            c0002b.f115o = this.f115o;
            c0002b.f116p = this.f116p;
            c0002b.f117q = this.f117q;
            c0002b.f118r = this.f118r;
            c0002b.f119s = this.f119s;
            c0002b.f120t = this.f120t;
            c0002b.f121u = this.f121u;
            c0002b.f122v = this.f122v;
            c0002b.f123w = this.f123w;
            c0002b.A = this.A;
            c0002b.B = this.B;
            c0002b.f121u = this.f121u;
            c0002b.f121u = this.f121u;
            c0002b.f121u = this.f121u;
            c0002b.f121u = this.f121u;
            c0002b.f121u = this.f121u;
            c0002b.C = this.C;
            c0002b.D = this.D;
            c0002b.E = this.E;
            c0002b.F = this.F;
            c0002b.G = this.G;
            c0002b.H = this.H;
            c0002b.I = this.I;
            c0002b.J = this.J;
            c0002b.K = this.K;
            c0002b.L = this.L;
            c0002b.M = this.M;
            c0002b.N = this.N;
            c0002b.O = this.O;
            c0002b.P = this.P;
            c0002b.Q = this.Q;
            c0002b.R = this.R;
            c0002b.S = this.S;
            c0002b.T = this.T;
            c0002b.U = this.U;
            c0002b.V = this.V;
            c0002b.W = this.W;
            c0002b.X = this.X;
            c0002b.Y = this.Y;
            c0002b.Z = this.Z;
            c0002b.a0 = this.a0;
            c0002b.b0 = this.b0;
            c0002b.c0 = this.c0;
            c0002b.d0 = this.d0;
            c0002b.e0 = this.e0;
            c0002b.f0 = this.f0;
            c0002b.g0 = this.g0;
            c0002b.h0 = this.h0;
            c0002b.i0 = this.i0;
            c0002b.j0 = this.j0;
            c0002b.k0 = this.k0;
            c0002b.l0 = this.l0;
            c0002b.m0 = this.m0;
            c0002b.n0 = this.n0;
            c0002b.o0 = this.o0;
            c0002b.p0 = this.p0;
            c0002b.q0 = this.q0;
            c0002b.s0 = this.s0;
            c0002b.t0 = this.t0;
            int[] iArr = this.u0;
            if (iArr != null) {
                c0002b.u0 = Arrays.copyOf(iArr, iArr.length);
            }
            c0002b.x = this.x;
            c0002b.y = this.y;
            c0002b.z = this.z;
            c0002b.r0 = this.r0;
            return c0002b;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f99c = sparseIntArray;
        sparseIntArray.append(d.c.h1, 25);
        f99c.append(d.c.i1, 26);
        f99c.append(d.c.k1, 29);
        f99c.append(d.c.l1, 30);
        f99c.append(d.c.q1, 36);
        f99c.append(d.c.p1, 35);
        f99c.append(d.c.P0, 4);
        f99c.append(d.c.O0, 3);
        f99c.append(d.c.M0, 1);
        f99c.append(d.c.y1, 6);
        f99c.append(d.c.z1, 7);
        f99c.append(d.c.W0, 17);
        f99c.append(d.c.X0, 18);
        f99c.append(d.c.Y0, 19);
        f99c.append(d.c.k0, 27);
        f99c.append(d.c.m1, 32);
        f99c.append(d.c.n1, 33);
        f99c.append(d.c.V0, 10);
        f99c.append(d.c.U0, 9);
        f99c.append(d.c.C1, 13);
        f99c.append(d.c.F1, 16);
        f99c.append(d.c.D1, 14);
        f99c.append(d.c.A1, 11);
        f99c.append(d.c.E1, 15);
        f99c.append(d.c.B1, 12);
        f99c.append(d.c.t1, 40);
        f99c.append(d.c.f1, 39);
        f99c.append(d.c.e1, 41);
        f99c.append(d.c.s1, 42);
        f99c.append(d.c.d1, 20);
        f99c.append(d.c.r1, 37);
        f99c.append(d.c.T0, 5);
        f99c.append(d.c.g1, 75);
        f99c.append(d.c.o1, 75);
        f99c.append(d.c.j1, 75);
        f99c.append(d.c.N0, 75);
        f99c.append(d.c.L0, 75);
        f99c.append(d.c.p0, 24);
        f99c.append(d.c.r0, 28);
        f99c.append(d.c.D0, 31);
        f99c.append(d.c.E0, 8);
        f99c.append(d.c.q0, 34);
        f99c.append(d.c.s0, 2);
        f99c.append(d.c.n0, 23);
        f99c.append(d.c.o0, 21);
        f99c.append(d.c.m0, 22);
        f99c.append(d.c.t0, 43);
        f99c.append(d.c.G0, 44);
        f99c.append(d.c.B0, 45);
        f99c.append(d.c.C0, 46);
        f99c.append(d.c.A0, 60);
        f99c.append(d.c.y0, 47);
        f99c.append(d.c.z0, 48);
        f99c.append(d.c.u0, 49);
        f99c.append(d.c.v0, 50);
        f99c.append(d.c.w0, 51);
        f99c.append(d.c.x0, 52);
        f99c.append(d.c.F0, 53);
        f99c.append(d.c.u1, 54);
        f99c.append(d.c.Z0, 55);
        f99c.append(d.c.v1, 56);
        f99c.append(d.c.a1, 57);
        f99c.append(d.c.w1, 58);
        f99c.append(d.c.b1, 59);
        f99c.append(d.c.Q0, 61);
        f99c.append(d.c.S0, 62);
        f99c.append(d.c.R0, 63);
        f99c.append(d.c.l0, 38);
        f99c.append(d.c.x1, 69);
        f99c.append(d.c.c1, 70);
        f99c.append(d.c.J0, 71);
        f99c.append(d.c.I0, 72);
        f99c.append(d.c.K0, 73);
        f99c.append(d.c.H0, 74);
    }

    private int[] c(View view, String str) {
        int i2;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = d.b.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i2 = ((Integer) c2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private C0002b d(Context context, AttributeSet attributeSet) {
        C0002b c0002b = new C0002b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.c.j0);
        g(c0002b, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0002b;
    }

    private static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void g(C0002b c0002b, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = f99c.get(index);
            switch (i3) {
                case 1:
                    c0002b.f116p = f(typedArray, index, c0002b.f116p);
                    break;
                case 2:
                    c0002b.G = typedArray.getDimensionPixelSize(index, c0002b.G);
                    break;
                case 3:
                    c0002b.f115o = f(typedArray, index, c0002b.f115o);
                    break;
                case 4:
                    c0002b.f114n = f(typedArray, index, c0002b.f114n);
                    break;
                case 5:
                    c0002b.f123w = typedArray.getString(index);
                    break;
                case 6:
                    c0002b.A = typedArray.getDimensionPixelOffset(index, c0002b.A);
                    break;
                case 7:
                    c0002b.B = typedArray.getDimensionPixelOffset(index, c0002b.B);
                    break;
                case 8:
                    c0002b.H = typedArray.getDimensionPixelSize(index, c0002b.H);
                    break;
                case 9:
                    c0002b.f120t = f(typedArray, index, c0002b.f120t);
                    break;
                case 10:
                    c0002b.f119s = f(typedArray, index, c0002b.f119s);
                    break;
                case 11:
                    c0002b.N = typedArray.getDimensionPixelSize(index, c0002b.N);
                    break;
                case 12:
                    c0002b.O = typedArray.getDimensionPixelSize(index, c0002b.O);
                    break;
                case 13:
                    c0002b.K = typedArray.getDimensionPixelSize(index, c0002b.K);
                    break;
                case 14:
                    c0002b.M = typedArray.getDimensionPixelSize(index, c0002b.M);
                    break;
                case 15:
                    c0002b.P = typedArray.getDimensionPixelSize(index, c0002b.P);
                    break;
                case 16:
                    c0002b.L = typedArray.getDimensionPixelSize(index, c0002b.L);
                    break;
                case 17:
                    c0002b.f105e = typedArray.getDimensionPixelOffset(index, c0002b.f105e);
                    break;
                case 18:
                    c0002b.f106f = typedArray.getDimensionPixelOffset(index, c0002b.f106f);
                    break;
                case 19:
                    c0002b.f107g = typedArray.getFloat(index, c0002b.f107g);
                    break;
                case 20:
                    c0002b.f121u = typedArray.getFloat(index, c0002b.f121u);
                    break;
                case 21:
                    c0002b.f103c = typedArray.getLayoutDimension(index, c0002b.f103c);
                    break;
                case 22:
                    int i4 = typedArray.getInt(index, c0002b.J);
                    c0002b.J = i4;
                    c0002b.J = f98b[i4];
                    break;
                case 23:
                    c0002b.f102b = typedArray.getLayoutDimension(index, c0002b.f102b);
                    break;
                case 24:
                    c0002b.D = typedArray.getDimensionPixelSize(index, c0002b.D);
                    break;
                case 25:
                    c0002b.f108h = f(typedArray, index, c0002b.f108h);
                    break;
                case 26:
                    c0002b.f109i = f(typedArray, index, c0002b.f109i);
                    break;
                case 27:
                    c0002b.C = typedArray.getInt(index, c0002b.C);
                    break;
                case 28:
                    c0002b.E = typedArray.getDimensionPixelSize(index, c0002b.E);
                    break;
                case 29:
                    c0002b.f110j = f(typedArray, index, c0002b.f110j);
                    break;
                case 30:
                    c0002b.f111k = f(typedArray, index, c0002b.f111k);
                    break;
                case d.c.F /* 31 */:
                    c0002b.I = typedArray.getDimensionPixelSize(index, c0002b.I);
                    break;
                case d.c.G /* 32 */:
                    c0002b.f117q = f(typedArray, index, c0002b.f117q);
                    break;
                case 33:
                    c0002b.f118r = f(typedArray, index, c0002b.f118r);
                    break;
                case 34:
                    c0002b.F = typedArray.getDimensionPixelSize(index, c0002b.F);
                    break;
                case 35:
                    c0002b.f113m = f(typedArray, index, c0002b.f113m);
                    break;
                case 36:
                    c0002b.f112l = f(typedArray, index, c0002b.f112l);
                    break;
                case 37:
                    c0002b.f122v = typedArray.getFloat(index, c0002b.f122v);
                    break;
                case 38:
                    c0002b.f104d = typedArray.getResourceId(index, c0002b.f104d);
                    break;
                case 39:
                    c0002b.R = typedArray.getFloat(index, c0002b.R);
                    break;
                case 40:
                    c0002b.Q = typedArray.getFloat(index, c0002b.Q);
                    break;
                case 41:
                    c0002b.S = typedArray.getInt(index, c0002b.S);
                    break;
                case 42:
                    c0002b.T = typedArray.getInt(index, c0002b.T);
                    break;
                case 43:
                    c0002b.U = typedArray.getFloat(index, c0002b.U);
                    break;
                case 44:
                    c0002b.V = true;
                    c0002b.W = typedArray.getDimension(index, c0002b.W);
                    break;
                case 45:
                    c0002b.Y = typedArray.getFloat(index, c0002b.Y);
                    break;
                case 46:
                    c0002b.Z = typedArray.getFloat(index, c0002b.Z);
                    break;
                case 47:
                    c0002b.a0 = typedArray.getFloat(index, c0002b.a0);
                    break;
                case 48:
                    c0002b.b0 = typedArray.getFloat(index, c0002b.b0);
                    break;
                case 49:
                    c0002b.c0 = typedArray.getFloat(index, c0002b.c0);
                    break;
                case 50:
                    c0002b.d0 = typedArray.getFloat(index, c0002b.d0);
                    break;
                case 51:
                    c0002b.e0 = typedArray.getDimension(index, c0002b.e0);
                    break;
                case 52:
                    c0002b.f0 = typedArray.getDimension(index, c0002b.f0);
                    break;
                case 53:
                    c0002b.g0 = typedArray.getDimension(index, c0002b.g0);
                    break;
                default:
                    switch (i3) {
                        case d.c.m1 /* 60 */:
                            c0002b.X = typedArray.getFloat(index, c0002b.X);
                            continue;
                        case d.c.n1 /* 61 */:
                            c0002b.x = f(typedArray, index, c0002b.x);
                            continue;
                        case d.c.o1 /* 62 */:
                            c0002b.y = typedArray.getDimensionPixelSize(index, c0002b.y);
                            continue;
                        case d.c.p1 /* 63 */:
                            c0002b.z = typedArray.getFloat(index, c0002b.z);
                            continue;
                        default:
                            switch (i3) {
                                case d.c.v1 /* 69 */:
                                    c0002b.p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case d.c.w1 /* 70 */:
                                    c0002b.q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case d.c.x1 /* 71 */:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case d.c.y1 /* 72 */:
                                    c0002b.s0 = typedArray.getInt(index, c0002b.s0);
                                    break;
                                case d.c.z1 /* 73 */:
                                    c0002b.v0 = typedArray.getString(index);
                                    break;
                                case d.c.A1 /* 74 */:
                                    c0002b.r0 = typedArray.getBoolean(index, c0002b.r0);
                                    break;
                                case d.c.B1 /* 75 */:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f99c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f99c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                            }
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f100a.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f100a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0002b c0002b = this.f100a.get(Integer.valueOf(id));
                if (childAt instanceof d.a) {
                    c0002b.t0 = 1;
                }
                int i3 = c0002b.t0;
                if (i3 != -1 && i3 == 1) {
                    d.a aVar = (d.a) childAt;
                    aVar.setId(id);
                    aVar.setType(c0002b.s0);
                    aVar.setAllowsGoneWidget(c0002b.r0);
                    int[] iArr = c0002b.u0;
                    if (iArr != null) {
                        aVar.setReferencedIds(iArr);
                    } else {
                        String str = c0002b.v0;
                        if (str != null) {
                            int[] c2 = c(aVar, str);
                            c0002b.u0 = c2;
                            aVar.setReferencedIds(c2);
                        }
                    }
                }
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                c0002b.c(aVar2);
                childAt.setLayoutParams(aVar2);
                childAt.setVisibility(c0002b.J);
                int i4 = Build.VERSION.SDK_INT;
                childAt.setAlpha(c0002b.U);
                childAt.setRotation(c0002b.X);
                childAt.setRotationX(c0002b.Y);
                childAt.setRotationY(c0002b.Z);
                childAt.setScaleX(c0002b.a0);
                childAt.setScaleY(c0002b.b0);
                if (!Float.isNaN(c0002b.c0)) {
                    childAt.setPivotX(c0002b.c0);
                }
                if (!Float.isNaN(c0002b.d0)) {
                    childAt.setPivotY(c0002b.d0);
                }
                childAt.setTranslationX(c0002b.e0);
                childAt.setTranslationY(c0002b.f0);
                if (i4 >= 21) {
                    childAt.setTranslationZ(c0002b.g0);
                    if (c0002b.V) {
                        childAt.setElevation(c0002b.W);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0002b c0002b2 = this.f100a.get(num);
            int i5 = c0002b2.t0;
            if (i5 != -1 && i5 == 1) {
                d.a aVar3 = new d.a(constraintLayout.getContext());
                aVar3.setId(num.intValue());
                int[] iArr2 = c0002b2.u0;
                if (iArr2 != null) {
                    aVar3.setReferencedIds(iArr2);
                } else {
                    String str2 = c0002b2.v0;
                    if (str2 != null) {
                        int[] c3 = c(aVar3, str2);
                        c0002b2.u0 = c3;
                        aVar3.setReferencedIds(c3);
                    }
                }
                aVar3.setType(c0002b2.s0);
                ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar3.f();
                c0002b2.c(generateDefaultLayoutParams);
                constraintLayout.addView(aVar3, generateDefaultLayoutParams);
            }
            if (c0002b2.f101a) {
                View dVar = new d(constraintLayout.getContext());
                dVar.setId(num.intValue());
                ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0002b2.c(generateDefaultLayoutParams2);
                constraintLayout.addView(dVar, generateDefaultLayoutParams2);
            }
        }
    }

    public void b(c cVar) {
        int childCount = cVar.getChildCount();
        this.f100a.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = cVar.getChildAt(i2);
            c.a aVar = (c.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f100a.containsKey(Integer.valueOf(id))) {
                this.f100a.put(Integer.valueOf(id), new C0002b());
            }
            C0002b c0002b = this.f100a.get(Integer.valueOf(id));
            if (childAt instanceof android.support.constraint.a) {
                c0002b.g((android.support.constraint.a) childAt, id, aVar);
            }
            c0002b.f(id, aVar);
        }
    }

    public void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0002b d2 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f101a = true;
                    }
                    this.f100a.put(Integer.valueOf(d2.f104d), d2);
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
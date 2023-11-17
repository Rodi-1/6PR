package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import f.f;
import f.g;
import f.i;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    SparseArray<View> f49b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<android.support.constraint.a> f50c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<f> f51d;

    /* renamed from: e  reason: collision with root package name */
    g f52e;

    /* renamed from: f  reason: collision with root package name */
    private int f53f;

    /* renamed from: g  reason: collision with root package name */
    private int f54g;

    /* renamed from: h  reason: collision with root package name */
    private int f55h;

    /* renamed from: i  reason: collision with root package name */
    private int f56i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57j;

    /* renamed from: k  reason: collision with root package name */
    private int f58k;

    /* renamed from: l  reason: collision with root package name */
    private b f59l;

    /* renamed from: m  reason: collision with root package name */
    private int f60m;

    /* renamed from: n  reason: collision with root package name */
    private HashMap<String, Integer> f61n;

    /* renamed from: o  reason: collision with root package name */
    private int f62o;

    /* renamed from: p  reason: collision with root package name */
    private int f63p;

    /* renamed from: q  reason: collision with root package name */
    int f64q;

    /* renamed from: r  reason: collision with root package name */
    int f65r;

    /* renamed from: s  reason: collision with root package name */
    int f66s;

    /* renamed from: t  reason: collision with root package name */
    int f67t;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f68a;
        boolean a0;

        /* renamed from: b  reason: collision with root package name */
        public int f69b;
        int b0;

        /* renamed from: c  reason: collision with root package name */
        public float f70c;
        int c0;

        /* renamed from: d  reason: collision with root package name */
        public int f71d;
        int d0;

        /* renamed from: e  reason: collision with root package name */
        public int f72e;
        int e0;

        /* renamed from: f  reason: collision with root package name */
        public int f73f;
        int f0;

        /* renamed from: g  reason: collision with root package name */
        public int f74g;
        int g0;

        /* renamed from: h  reason: collision with root package name */
        public int f75h;
        float h0;

        /* renamed from: i  reason: collision with root package name */
        public int f76i;
        int i0;

        /* renamed from: j  reason: collision with root package name */
        public int f77j;
        int j0;

        /* renamed from: k  reason: collision with root package name */
        public int f78k;
        float k0;

        /* renamed from: l  reason: collision with root package name */
        public int f79l;
        f l0;

        /* renamed from: m  reason: collision with root package name */
        public int f80m;
        public boolean m0;

        /* renamed from: n  reason: collision with root package name */
        public int f81n;

        /* renamed from: o  reason: collision with root package name */
        public float f82o;

        /* renamed from: p  reason: collision with root package name */
        public int f83p;

        /* renamed from: q  reason: collision with root package name */
        public int f84q;

        /* renamed from: r  reason: collision with root package name */
        public int f85r;

        /* renamed from: s  reason: collision with root package name */
        public int f86s;

        /* renamed from: t  reason: collision with root package name */
        public int f87t;

        /* renamed from: u  reason: collision with root package name */
        public int f88u;

        /* renamed from: v  reason: collision with root package name */
        public int f89v;

        /* renamed from: w  reason: collision with root package name */
        public int f90w;
        public int x;
        public int y;
        public float z;

        /* renamed from: android.support.constraint.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0001a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f91a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f91a = sparseIntArray;
                sparseIntArray.append(d.c.I, 8);
                sparseIntArray.append(d.c.J, 9);
                sparseIntArray.append(d.c.L, 10);
                sparseIntArray.append(d.c.M, 11);
                sparseIntArray.append(d.c.R, 12);
                sparseIntArray.append(d.c.Q, 13);
                sparseIntArray.append(d.c.f1330q, 14);
                sparseIntArray.append(d.c.f1329p, 15);
                sparseIntArray.append(d.c.f1327n, 16);
                sparseIntArray.append(d.c.f1331r, 2);
                sparseIntArray.append(d.c.f1333t, 3);
                sparseIntArray.append(d.c.f1332s, 4);
                sparseIntArray.append(d.c.Z, 49);
                sparseIntArray.append(d.c.a0, 50);
                sparseIntArray.append(d.c.x, 5);
                sparseIntArray.append(d.c.y, 6);
                sparseIntArray.append(d.c.z, 7);
                sparseIntArray.append(d.c.f1315b, 1);
                sparseIntArray.append(d.c.N, 17);
                sparseIntArray.append(d.c.O, 18);
                sparseIntArray.append(d.c.f1336w, 19);
                sparseIntArray.append(d.c.f1335v, 20);
                sparseIntArray.append(d.c.d0, 21);
                sparseIntArray.append(d.c.g0, 22);
                sparseIntArray.append(d.c.e0, 23);
                sparseIntArray.append(d.c.b0, 24);
                sparseIntArray.append(d.c.f0, 25);
                sparseIntArray.append(d.c.c0, 26);
                sparseIntArray.append(d.c.E, 29);
                sparseIntArray.append(d.c.S, 30);
                sparseIntArray.append(d.c.f1334u, 44);
                sparseIntArray.append(d.c.G, 45);
                sparseIntArray.append(d.c.U, 46);
                sparseIntArray.append(d.c.F, 47);
                sparseIntArray.append(d.c.T, 48);
                sparseIntArray.append(d.c.f1325l, 27);
                sparseIntArray.append(d.c.f1324k, 28);
                sparseIntArray.append(d.c.V, 31);
                sparseIntArray.append(d.c.A, 32);
                sparseIntArray.append(d.c.X, 33);
                sparseIntArray.append(d.c.W, 34);
                sparseIntArray.append(d.c.Y, 35);
                sparseIntArray.append(d.c.C, 36);
                sparseIntArray.append(d.c.B, 37);
                sparseIntArray.append(d.c.D, 38);
                sparseIntArray.append(d.c.H, 39);
                sparseIntArray.append(d.c.P, 40);
                sparseIntArray.append(d.c.K, 41);
                sparseIntArray.append(d.c.f1328o, 42);
                sparseIntArray.append(d.c.f1326m, 43);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f68a = -1;
            this.f69b = -1;
            this.f70c = -1.0f;
            this.f71d = -1;
            this.f72e = -1;
            this.f73f = -1;
            this.f74g = -1;
            this.f75h = -1;
            this.f76i = -1;
            this.f77j = -1;
            this.f78k = -1;
            this.f79l = -1;
            this.f80m = -1;
            this.f81n = 0;
            this.f82o = 0.0f;
            this.f83p = -1;
            this.f84q = -1;
            this.f85r = -1;
            this.f86s = -1;
            this.f87t = -1;
            this.f88u = -1;
            this.f89v = -1;
            this.f90w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new f();
            this.m0 = false;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i2;
            float parseFloat;
            this.f68a = -1;
            this.f69b = -1;
            this.f70c = -1.0f;
            this.f71d = -1;
            this.f72e = -1;
            this.f73f = -1;
            this.f74g = -1;
            this.f75h = -1;
            this.f76i = -1;
            this.f77j = -1;
            this.f78k = -1;
            this.f79l = -1;
            this.f80m = -1;
            this.f81n = 0;
            this.f82o = 0.0f;
            this.f83p = -1;
            this.f84q = -1;
            this.f85r = -1;
            this.f86s = -1;
            this.f87t = -1;
            this.f88u = -1;
            this.f89v = -1;
            this.f90w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new f();
            this.m0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.c.f1314a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = C0001a.f91a.get(index);
                switch (i4) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f80m);
                        this.f80m = resourceId;
                        if (resourceId == -1) {
                            this.f80m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f81n = obtainStyledAttributes.getDimensionPixelSize(index, this.f81n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.f82o) % 360.0f;
                        this.f82o = f2;
                        if (f2 < 0.0f) {
                            this.f82o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f68a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f68a);
                        continue;
                    case 6:
                        this.f69b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f69b);
                        continue;
                    case 7:
                        this.f70c = obtainStyledAttributes.getFloat(index, this.f70c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f71d);
                        this.f71d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f71d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f72e);
                        this.f72e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f72e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f73f);
                        this.f73f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f73f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f74g);
                        this.f74g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f74g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f75h);
                        this.f75h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f75h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f76i);
                        this.f76i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f76i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f77j);
                        this.f77j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f77j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f78k);
                        this.f78k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f78k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f79l);
                        this.f79l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f79l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f83p);
                        this.f83p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f83p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f84q);
                        this.f84q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f84q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f85r);
                        this.f85r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f85r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f86s);
                        this.f86s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f86s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f87t = obtainStyledAttributes.getDimensionPixelSize(index, this.f87t);
                        continue;
                    case 22:
                        this.f88u = obtainStyledAttributes.getDimensionPixelSize(index, this.f88u);
                        continue;
                    case 23:
                        this.f89v = obtainStyledAttributes.getDimensionPixelSize(index, this.f89v);
                        continue;
                    case 24:
                        this.f90w = obtainStyledAttributes.getDimensionPixelSize(index, this.f90w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case d.c.F /* 31 */:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case d.c.G /* 32 */:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.J = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        continue;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.C = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f68a = -1;
            this.f69b = -1;
            this.f70c = -1.0f;
            this.f71d = -1;
            this.f72e = -1;
            this.f73f = -1;
            this.f74g = -1;
            this.f75h = -1;
            this.f76i = -1;
            this.f77j = -1;
            this.f78k = -1;
            this.f79l = -1;
            this.f80m = -1;
            this.f81n = 0;
            this.f82o = 0.0f;
            this.f83p = -1;
            this.f84q = -1;
            this.f85r = -1;
            this.f86s = -1;
            this.f87t = -1;
            this.f88u = -1;
            this.f89v = -1;
            this.f90w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new f();
            this.m0 = false;
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f70c == -1.0f && this.f68a == -1 && this.f69b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.l0 instanceof i)) {
                this.l0 = new i();
            }
            ((i) this.l0).M0(this.S);
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d2, code lost:
            if (r1 > 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d4, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r6).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
            if (r1 > 0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49b = new SparseArray<>();
        this.f50c = new ArrayList<>(4);
        this.f51d = new ArrayList<>(100);
        this.f52e = new g();
        this.f53f = 0;
        this.f54g = 0;
        this.f55h = Integer.MAX_VALUE;
        this.f56i = Integer.MAX_VALUE;
        this.f57j = true;
        this.f58k = 7;
        this.f59l = null;
        this.f60m = -1;
        this.f61n = new HashMap<>();
        this.f62o = -1;
        this.f63p = -1;
        this.f64q = -1;
        this.f65r = -1;
        this.f66s = 0;
        this.f67t = 0;
        g(attributeSet);
    }

    private final f d(int i2) {
        if (i2 == 0) {
            return this.f52e;
        }
        View view = this.f49b.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f52e;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).l0;
    }

    private void g(AttributeSet attributeSet) {
        this.f52e.W(this);
        this.f49b.put(getId(), this);
        this.f59l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c.f1314a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == d.c.f1318e) {
                    this.f53f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53f);
                } else if (index == d.c.f1319f) {
                    this.f54g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f54g);
                } else if (index == d.c.f1316c) {
                    this.f55h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f55h);
                } else if (index == d.c.f1317d) {
                    this.f56i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f56i);
                } else if (index == d.c.h0) {
                    this.f58k = obtainStyledAttributes.getInt(index, this.f58k);
                } else if (index == d.c.f1322i) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar = new b();
                        this.f59l = bVar;
                        bVar.e(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f59l = null;
                    }
                    this.f60m = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f52e.c1(this.f58k);
    }

    private void h(int i2, int i3) {
        boolean z;
        boolean z2;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                f fVar = aVar.l0;
                if (!aVar.Y && !aVar.Z) {
                    fVar.x0(childAt.getVisibility());
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    int i6 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    boolean z4 = aVar.V;
                    if (z4 || (z3 = aVar.W) || (!z4 && aVar.I == 1) || i5 == -1 || (!z3 && (aVar.J == 1 || i6 == -1))) {
                        if (i5 == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, -2);
                            z = true;
                        } else if (i5 == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, -1);
                            z = false;
                        } else {
                            z = i5 == -2;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, i5);
                        }
                        if (i6 == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
                            z2 = true;
                        } else if (i6 == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingTop, -1);
                            z2 = false;
                        } else {
                            z2 = i6 == -2;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, paddingTop, i6);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        fVar.z0(i5 == -2);
                        fVar.c0(i6 == -2);
                        i5 = childAt.getMeasuredWidth();
                        i6 = childAt.getMeasuredHeight();
                    } else {
                        z = false;
                        z2 = false;
                    }
                    fVar.y0(i5);
                    fVar.b0(i6);
                    if (z) {
                        fVar.B0(i5);
                    }
                    if (z2) {
                        fVar.A0(i6);
                    }
                    if (aVar.X && (baseline = childAt.getBaseline()) != -1) {
                        fVar.V(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0299 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.i(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0358  */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.support.constraint.ConstraintLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.j():void");
    }

    private void l(int i2, int i3) {
        int i4;
        f.b bVar;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        f.b bVar2 = f.b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = f.b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                i4 = Math.min(this.f55h, size) - paddingLeft;
                bVar = bVar2;
            }
            i4 = 0;
        } else {
            i4 = size;
            bVar = f.b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = f.b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f56i, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            bVar2 = f.b.WRAP_CONTENT;
        }
        this.f52e.m0(0);
        this.f52e.l0(0);
        this.f52e.g0(bVar);
        this.f52e.y0(i4);
        this.f52e.u0(bVar2);
        this.f52e.b0(size2);
        this.f52e.m0((this.f53f - getPaddingLeft()) - getPaddingRight());
        this.f52e.l0((this.f54g - getPaddingTop()) - getPaddingBottom());
    }

    private void n() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            this.f51d.clear();
            j();
        }
    }

    private void o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof e) {
                ((e) childAt).a(this);
            }
        }
        int size = this.f50c.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                this.f50c.get(i3).d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public Object c(int i2, Object obj) {
        if (i2 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f61n;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f61n.get(str);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public View e(int i2) {
        return this.f49b.get(i2);
    }

    public final f f(View view) {
        if (view == this) {
            return this.f52e;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).l0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f56i;
    }

    public int getMaxWidth() {
        return this.f55h;
    }

    public int getMinHeight() {
        return this.f54g;
    }

    public int getMinWidth() {
        return this.f53f;
    }

    public int getOptimizationLevel() {
        return this.f52e.R0();
    }

    public void k(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f61n == null) {
                this.f61n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f61n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void m(String str) {
        this.f52e.K0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            f fVar = aVar.l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.a0) {
                int p2 = fVar.p();
                int q2 = fVar.q();
                int D = fVar.D() + p2;
                int r2 = fVar.r() + q2;
                childAt.layout(p2, q2, D, r2);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(p2, q2, D, r2);
                }
            }
        }
        int size = this.f50c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f50c.get(i7).c(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        f f2 = f(view);
        if ((view instanceof d) && !(f2 instanceof i)) {
            a aVar = (a) view.getLayoutParams();
            i iVar = new i();
            aVar.l0 = iVar;
            aVar.Y = true;
            iVar.M0(aVar.S);
        }
        if (view instanceof android.support.constraint.a) {
            android.support.constraint.a aVar2 = (android.support.constraint.a) view;
            aVar2.f();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f50c.contains(aVar2)) {
                this.f50c.add(aVar2);
            }
        }
        this.f49b.put(view.getId(), view);
        this.f57j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f49b.remove(view.getId());
        f f2 = f(view);
        this.f52e.L0(f2);
        this.f50c.remove(view);
        this.f51d.remove(f2);
        this.f57j = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f57j = true;
        this.f62o = -1;
        this.f63p = -1;
        this.f64q = -1;
        this.f65r = -1;
        this.f66s = 0;
        this.f67t = 0;
    }

    public void setConstraintSet(b bVar) {
        this.f59l = bVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f49b.remove(getId());
        super.setId(i2);
        this.f49b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f56i) {
            return;
        }
        this.f56i = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f55h) {
            return;
        }
        this.f55h = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f54g) {
            return;
        }
        this.f54g = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f53f) {
            return;
        }
        this.f53f = i2;
        requestLayout();
    }

    public void setOptimizationLevel(int i2) {
        this.f52e.c1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
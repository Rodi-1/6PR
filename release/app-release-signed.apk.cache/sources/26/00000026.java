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
import java.util.ArrayList;
import java.util.HashMap;
import p005d.C0349c;
import p007f.C0370f;
import p007f.C0373g;
import p007f.C0375i;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    SparseArray<View> f49b;

    /* renamed from: c */
    private ArrayList<AbstractC0030a> f50c;

    /* renamed from: d */
    private final ArrayList<C0370f> f51d;

    /* renamed from: e */
    C0373g f52e;

    /* renamed from: f */
    private int f53f;

    /* renamed from: g */
    private int f54g;

    /* renamed from: h */
    private int f55h;

    /* renamed from: i */
    private int f56i;

    /* renamed from: j */
    private boolean f57j;

    /* renamed from: k */
    private int f58k;

    /* renamed from: l */
    private C0031b f59l;

    /* renamed from: m */
    private int f60m;

    /* renamed from: n */
    private HashMap<String, Integer> f61n;

    /* renamed from: o */
    private int f62o;

    /* renamed from: p */
    private int f63p;

    /* renamed from: q */
    int f64q;

    /* renamed from: r */
    int f65r;

    /* renamed from: s */
    int f66s;

    /* renamed from: t */
    int f67t;

    /* renamed from: android.support.constraint.ConstraintLayout$a */
    /* loaded from: classes.dex */
    public static class C0028a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f68A;

        /* renamed from: B */
        public String f69B;

        /* renamed from: C */
        float f70C;

        /* renamed from: D */
        int f71D;

        /* renamed from: E */
        public float f72E;

        /* renamed from: F */
        public float f73F;

        /* renamed from: G */
        public int f74G;

        /* renamed from: H */
        public int f75H;

        /* renamed from: I */
        public int f76I;

        /* renamed from: J */
        public int f77J;

        /* renamed from: K */
        public int f78K;

        /* renamed from: L */
        public int f79L;

        /* renamed from: M */
        public int f80M;

        /* renamed from: N */
        public int f81N;

        /* renamed from: O */
        public float f82O;

        /* renamed from: P */
        public float f83P;

        /* renamed from: Q */
        public int f84Q;

        /* renamed from: R */
        public int f85R;

        /* renamed from: S */
        public int f86S;

        /* renamed from: T */
        public boolean f87T;

        /* renamed from: U */
        public boolean f88U;

        /* renamed from: V */
        boolean f89V;

        /* renamed from: W */
        boolean f90W;

        /* renamed from: X */
        boolean f91X;

        /* renamed from: Y */
        boolean f92Y;

        /* renamed from: Z */
        boolean f93Z;

        /* renamed from: a */
        public int f94a;

        /* renamed from: a0 */
        boolean f95a0;

        /* renamed from: b */
        public int f96b;

        /* renamed from: b0 */
        int f97b0;

        /* renamed from: c */
        public float f98c;

        /* renamed from: c0 */
        int f99c0;

        /* renamed from: d */
        public int f100d;

        /* renamed from: d0 */
        int f101d0;

        /* renamed from: e */
        public int f102e;

        /* renamed from: e0 */
        int f103e0;

        /* renamed from: f */
        public int f104f;

        /* renamed from: f0 */
        int f105f0;

        /* renamed from: g */
        public int f106g;

        /* renamed from: g0 */
        int f107g0;

        /* renamed from: h */
        public int f108h;

        /* renamed from: h0 */
        float f109h0;

        /* renamed from: i */
        public int f110i;

        /* renamed from: i0 */
        int f111i0;

        /* renamed from: j */
        public int f112j;

        /* renamed from: j0 */
        int f113j0;

        /* renamed from: k */
        public int f114k;

        /* renamed from: k0 */
        float f115k0;

        /* renamed from: l */
        public int f116l;

        /* renamed from: l0 */
        C0370f f117l0;

        /* renamed from: m */
        public int f118m;

        /* renamed from: m0 */
        public boolean f119m0;

        /* renamed from: n */
        public int f120n;

        /* renamed from: o */
        public float f121o;

        /* renamed from: p */
        public int f122p;

        /* renamed from: q */
        public int f123q;

        /* renamed from: r */
        public int f124r;

        /* renamed from: s */
        public int f125s;

        /* renamed from: t */
        public int f126t;

        /* renamed from: u */
        public int f127u;

        /* renamed from: v */
        public int f128v;

        /* renamed from: w */
        public int f129w;

        /* renamed from: x */
        public int f130x;

        /* renamed from: y */
        public int f131y;

        /* renamed from: z */
        public float f132z;

        /* renamed from: android.support.constraint.ConstraintLayout$a$a */
        /* loaded from: classes.dex */
        private static class C0029a {

            /* renamed from: a */
            public static final SparseIntArray f133a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f133a = sparseIntArray;
                sparseIntArray.append(C0349c.f1649I, 8);
                sparseIntArray.append(C0349c.f1651J, 9);
                sparseIntArray.append(C0349c.f1655L, 10);
                sparseIntArray.append(C0349c.f1657M, 11);
                sparseIntArray.append(C0349c.f1667R, 12);
                sparseIntArray.append(C0349c.f1665Q, 13);
                sparseIntArray.append(C0349c.f1733q, 14);
                sparseIntArray.append(C0349c.f1730p, 15);
                sparseIntArray.append(C0349c.f1724n, 16);
                sparseIntArray.append(C0349c.f1736r, 2);
                sparseIntArray.append(C0349c.f1742t, 3);
                sparseIntArray.append(C0349c.f1739s, 4);
                sparseIntArray.append(C0349c.f1683Z, 49);
                sparseIntArray.append(C0349c.f1686a0, 50);
                sparseIntArray.append(C0349c.f1754x, 5);
                sparseIntArray.append(C0349c.f1757y, 6);
                sparseIntArray.append(C0349c.f1760z, 7);
                sparseIntArray.append(C0349c.f1688b, 1);
                sparseIntArray.append(C0349c.f1659N, 17);
                sparseIntArray.append(C0349c.f1661O, 18);
                sparseIntArray.append(C0349c.f1751w, 19);
                sparseIntArray.append(C0349c.f1748v, 20);
                sparseIntArray.append(C0349c.f1695d0, 21);
                sparseIntArray.append(C0349c.f1704g0, 22);
                sparseIntArray.append(C0349c.f1698e0, 23);
                sparseIntArray.append(C0349c.f1689b0, 24);
                sparseIntArray.append(C0349c.f1701f0, 25);
                sparseIntArray.append(C0349c.f1692c0, 26);
                sparseIntArray.append(C0349c.f1638E, 29);
                sparseIntArray.append(C0349c.f1669S, 30);
                sparseIntArray.append(C0349c.f1745u, 44);
                sparseIntArray.append(C0349c.f1644G, 45);
                sparseIntArray.append(C0349c.f1673U, 46);
                sparseIntArray.append(C0349c.f1641F, 47);
                sparseIntArray.append(C0349c.f1671T, 48);
                sparseIntArray.append(C0349c.f1718l, 27);
                sparseIntArray.append(C0349c.f1715k, 28);
                sparseIntArray.append(C0349c.f1675V, 31);
                sparseIntArray.append(C0349c.f1626A, 32);
                sparseIntArray.append(C0349c.f1679X, 33);
                sparseIntArray.append(C0349c.f1677W, 34);
                sparseIntArray.append(C0349c.f1681Y, 35);
                sparseIntArray.append(C0349c.f1632C, 36);
                sparseIntArray.append(C0349c.f1629B, 37);
                sparseIntArray.append(C0349c.f1635D, 38);
                sparseIntArray.append(C0349c.f1647H, 39);
                sparseIntArray.append(C0349c.f1663P, 40);
                sparseIntArray.append(C0349c.f1653K, 41);
                sparseIntArray.append(C0349c.f1727o, 42);
                sparseIntArray.append(C0349c.f1721m, 43);
            }
        }

        public C0028a(int i, int i2) {
            super(i, i2);
            this.f94a = -1;
            this.f96b = -1;
            this.f98c = -1.0f;
            this.f100d = -1;
            this.f102e = -1;
            this.f104f = -1;
            this.f106g = -1;
            this.f108h = -1;
            this.f110i = -1;
            this.f112j = -1;
            this.f114k = -1;
            this.f116l = -1;
            this.f118m = -1;
            this.f120n = 0;
            this.f121o = 0.0f;
            this.f122p = -1;
            this.f123q = -1;
            this.f124r = -1;
            this.f125s = -1;
            this.f126t = -1;
            this.f127u = -1;
            this.f128v = -1;
            this.f129w = -1;
            this.f130x = -1;
            this.f131y = -1;
            this.f132z = 0.5f;
            this.f68A = 0.5f;
            this.f69B = null;
            this.f70C = 0.0f;
            this.f71D = 1;
            this.f72E = -1.0f;
            this.f73F = -1.0f;
            this.f74G = 0;
            this.f75H = 0;
            this.f76I = 0;
            this.f77J = 0;
            this.f78K = 0;
            this.f79L = 0;
            this.f80M = 0;
            this.f81N = 0;
            this.f82O = 1.0f;
            this.f83P = 1.0f;
            this.f84Q = -1;
            this.f85R = -1;
            this.f86S = -1;
            this.f87T = false;
            this.f88U = false;
            this.f89V = true;
            this.f90W = true;
            this.f91X = false;
            this.f92Y = false;
            this.f93Z = false;
            this.f95a0 = false;
            this.f97b0 = -1;
            this.f99c0 = -1;
            this.f101d0 = -1;
            this.f103e0 = -1;
            this.f105f0 = -1;
            this.f107g0 = -1;
            this.f109h0 = 0.5f;
            this.f117l0 = new C0370f();
            this.f119m0 = false;
        }

        public C0028a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            float parseFloat;
            this.f94a = -1;
            this.f96b = -1;
            this.f98c = -1.0f;
            this.f100d = -1;
            this.f102e = -1;
            this.f104f = -1;
            this.f106g = -1;
            this.f108h = -1;
            this.f110i = -1;
            this.f112j = -1;
            this.f114k = -1;
            this.f116l = -1;
            this.f118m = -1;
            this.f120n = 0;
            this.f121o = 0.0f;
            this.f122p = -1;
            this.f123q = -1;
            this.f124r = -1;
            this.f125s = -1;
            this.f126t = -1;
            this.f127u = -1;
            this.f128v = -1;
            this.f129w = -1;
            this.f130x = -1;
            this.f131y = -1;
            this.f132z = 0.5f;
            this.f68A = 0.5f;
            this.f69B = null;
            this.f70C = 0.0f;
            this.f71D = 1;
            this.f72E = -1.0f;
            this.f73F = -1.0f;
            this.f74G = 0;
            this.f75H = 0;
            this.f76I = 0;
            this.f77J = 0;
            this.f78K = 0;
            this.f79L = 0;
            this.f80M = 0;
            this.f81N = 0;
            this.f82O = 1.0f;
            this.f83P = 1.0f;
            this.f84Q = -1;
            this.f85R = -1;
            this.f86S = -1;
            this.f87T = false;
            this.f88U = false;
            this.f89V = true;
            this.f90W = true;
            this.f91X = false;
            this.f92Y = false;
            this.f93Z = false;
            this.f95a0 = false;
            this.f97b0 = -1;
            this.f99c0 = -1;
            this.f101d0 = -1;
            this.f103e0 = -1;
            this.f105f0 = -1;
            this.f107g0 = -1;
            this.f109h0 = 0.5f;
            this.f117l0 = new C0370f();
            this.f119m0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0349c.f1685a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0029a.f133a.get(index);
                switch (i3) {
                    case 1:
                        this.f86S = obtainStyledAttributes.getInt(index, this.f86S);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f118m);
                        this.f118m = resourceId;
                        if (resourceId == -1) {
                            this.f118m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f120n = obtainStyledAttributes.getDimensionPixelSize(index, this.f120n);
                        continue;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f121o) % 360.0f;
                        this.f121o = f;
                        if (f < 0.0f) {
                            this.f121o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f94a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f94a);
                        continue;
                    case 6:
                        this.f96b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f96b);
                        continue;
                    case 7:
                        this.f98c = obtainStyledAttributes.getFloat(index, this.f98c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f100d);
                        this.f100d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f100d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f102e);
                        this.f102e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f102e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f104f);
                        this.f104f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f104f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f106g);
                        this.f106g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f106g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f108h);
                        this.f108h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f108h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f110i);
                        this.f110i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f110i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f112j);
                        this.f112j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f112j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f114k);
                        this.f114k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f114k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f116l);
                        this.f116l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f116l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f122p);
                        this.f122p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f122p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f123q);
                        this.f123q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f123q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f124r);
                        this.f124r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f124r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f125s);
                        this.f125s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f125s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f126t = obtainStyledAttributes.getDimensionPixelSize(index, this.f126t);
                        continue;
                    case 22:
                        this.f127u = obtainStyledAttributes.getDimensionPixelSize(index, this.f127u);
                        continue;
                    case 23:
                        this.f128v = obtainStyledAttributes.getDimensionPixelSize(index, this.f128v);
                        continue;
                    case 24:
                        this.f129w = obtainStyledAttributes.getDimensionPixelSize(index, this.f129w);
                        continue;
                    case 25:
                        this.f130x = obtainStyledAttributes.getDimensionPixelSize(index, this.f130x);
                        continue;
                    case 26:
                        this.f131y = obtainStyledAttributes.getDimensionPixelSize(index, this.f131y);
                        continue;
                    case 27:
                        this.f87T = obtainStyledAttributes.getBoolean(index, this.f87T);
                        continue;
                    case 28:
                        this.f88U = obtainStyledAttributes.getBoolean(index, this.f88U);
                        continue;
                    case 29:
                        this.f132z = obtainStyledAttributes.getFloat(index, this.f132z);
                        continue;
                    case 30:
                        this.f68A = obtainStyledAttributes.getFloat(index, this.f68A);
                        continue;
                    case C0349c.f1641F /* 31 */:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f76I = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case C0349c.f1644G /* 32 */:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f77J = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.f78K = obtainStyledAttributes.getDimensionPixelSize(index, this.f78K);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f78K) == -2) {
                                this.f78K = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f80M = obtainStyledAttributes.getDimensionPixelSize(index, this.f80M);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f80M) == -2) {
                                this.f80M = -2;
                            }
                        }
                    case 35:
                        this.f82O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f82O));
                        continue;
                    case 36:
                        try {
                            this.f79L = obtainStyledAttributes.getDimensionPixelSize(index, this.f79L);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f79L) == -2) {
                                this.f79L = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f81N = obtainStyledAttributes.getDimensionPixelSize(index, this.f81N);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f81N) == -2) {
                                this.f81N = -2;
                            }
                        }
                    case 38:
                        this.f83P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f83P));
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f69B = string;
                                this.f70C = Float.NaN;
                                this.f71D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f69B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f69B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f71D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f71D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f69B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f69B.substring(i, indexOf2);
                                        String substring3 = this.f69B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.f71D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f69B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.f70C = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f72E = obtainStyledAttributes.getFloat(index, this.f72E);
                                continue;
                            case 46:
                                this.f73F = obtainStyledAttributes.getFloat(index, this.f73F);
                                continue;
                            case 47:
                                this.f74G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f75H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f84Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f84Q);
                                continue;
                            case 50:
                                this.f85R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f85R);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            m2334a();
        }

        public C0028a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f94a = -1;
            this.f96b = -1;
            this.f98c = -1.0f;
            this.f100d = -1;
            this.f102e = -1;
            this.f104f = -1;
            this.f106g = -1;
            this.f108h = -1;
            this.f110i = -1;
            this.f112j = -1;
            this.f114k = -1;
            this.f116l = -1;
            this.f118m = -1;
            this.f120n = 0;
            this.f121o = 0.0f;
            this.f122p = -1;
            this.f123q = -1;
            this.f124r = -1;
            this.f125s = -1;
            this.f126t = -1;
            this.f127u = -1;
            this.f128v = -1;
            this.f129w = -1;
            this.f130x = -1;
            this.f131y = -1;
            this.f132z = 0.5f;
            this.f68A = 0.5f;
            this.f69B = null;
            this.f70C = 0.0f;
            this.f71D = 1;
            this.f72E = -1.0f;
            this.f73F = -1.0f;
            this.f74G = 0;
            this.f75H = 0;
            this.f76I = 0;
            this.f77J = 0;
            this.f78K = 0;
            this.f79L = 0;
            this.f80M = 0;
            this.f81N = 0;
            this.f82O = 1.0f;
            this.f83P = 1.0f;
            this.f84Q = -1;
            this.f85R = -1;
            this.f86S = -1;
            this.f87T = false;
            this.f88U = false;
            this.f89V = true;
            this.f90W = true;
            this.f91X = false;
            this.f92Y = false;
            this.f93Z = false;
            this.f95a0 = false;
            this.f97b0 = -1;
            this.f99c0 = -1;
            this.f101d0 = -1;
            this.f103e0 = -1;
            this.f105f0 = -1;
            this.f107g0 = -1;
            this.f109h0 = 0.5f;
            this.f117l0 = new C0370f();
            this.f119m0 = false;
        }

        /* renamed from: a */
        public void m2334a() {
            this.f92Y = false;
            this.f89V = true;
            this.f90W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f87T) {
                this.f89V = false;
                this.f76I = 1;
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f88U) {
                this.f90W = false;
                this.f77J = 1;
            }
            if (i == 0 || i == -1) {
                this.f89V = false;
                if (i == 0 && this.f76I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f87T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f90W = false;
                if (i2 == 0 && this.f77J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f88U = true;
                }
            }
            if (this.f98c == -1.0f && this.f94a == -1 && this.f96b == -1) {
                return;
            }
            this.f92Y = true;
            this.f89V = true;
            this.f90W = true;
            if (!(this.f117l0 instanceof C0375i)) {
                this.f117l0 = new C0375i();
            }
            ((C0375i) this.f117l0).m780M0(this.f86S);
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
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.C0028a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49b = new SparseArray<>();
        this.f50c = new ArrayList<>(4);
        this.f51d = new ArrayList<>(100);
        this.f52e = new C0373g();
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
        m2343g(attributeSet);
    }

    /* renamed from: d */
    private final C0370f m2346d(int i) {
        if (i == 0) {
            return this.f52e;
        }
        View view = this.f49b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f52e;
        }
        if (view == null) {
            return null;
        }
        return ((C0028a) view.getLayoutParams()).f117l0;
    }

    /* renamed from: g */
    private void m2343g(AttributeSet attributeSet) {
        this.f52e.m861W(this);
        this.f49b.put(getId(), this);
        this.f59l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0349c.f1685a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0349c.f1697e) {
                    this.f53f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f53f);
                } else if (index == C0349c.f1700f) {
                    this.f54g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f54g);
                } else if (index == C0349c.f1691c) {
                    this.f55h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f55h);
                } else if (index == C0349c.f1694d) {
                    this.f56i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f56i);
                } else if (index == C0349c.f1707h0) {
                    this.f58k = obtainStyledAttributes.getInt(index, this.f58k);
                } else if (index == C0349c.f1709i) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0031b c0031b = new C0031b();
                        this.f59l = c0031b;
                        c0031b.m2324e(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f59l = null;
                    }
                    this.f60m = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f52e.m796c1(this.f58k);
    }

    /* renamed from: h */
    private void m2342h(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0028a c0028a = (C0028a) childAt.getLayoutParams();
                C0370f c0370f = c0028a.f117l0;
                if (!c0028a.f92Y && !c0028a.f93Z) {
                    c0370f.m816x0(childAt.getVisibility());
                    int i4 = ((ViewGroup.MarginLayoutParams) c0028a).width;
                    int i5 = ((ViewGroup.MarginLayoutParams) c0028a).height;
                    boolean z4 = c0028a.f89V;
                    if (z4 || (z3 = c0028a.f90W) || (!z4 && c0028a.f76I == 1) || i4 == -1 || (!z3 && (c0028a.f77J == 1 || i5 == -1))) {
                        if (i4 == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, -2);
                            z = true;
                        } else if (i4 == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, -1);
                            z = false;
                        } else {
                            z = i4 == -2;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, i4);
                        }
                        if (i5 == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                            z2 = true;
                        } else if (i5 == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -1);
                            z2 = false;
                        } else {
                            z2 = i5 == -2;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, i5);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        c0370f.m812z0(i4 == -2);
                        c0370f.m854c0(i5 == -2);
                        i4 = childAt.getMeasuredWidth();
                        i5 = childAt.getMeasuredHeight();
                    } else {
                        z = false;
                        z2 = false;
                    }
                    c0370f.m814y0(i4);
                    c0370f.m855b0(i5);
                    if (z) {
                        c0370f.m884B0(i4);
                    }
                    if (z2) {
                        c0370f.m886A0(i5);
                    }
                    if (c0028a.f91X && (baseline = childAt.getBaseline()) != -1) {
                        c0370f.m862V(baseline);
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
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2341i(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m2341i(int, int):void");
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
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2340j() {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m2340j():void");
    }

    /* renamed from: l */
    private void m2338l(int i, int i2) {
        int i3;
        C0370f.EnumC0372b enumC0372b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0370f.EnumC0372b enumC0372b2 = C0370f.EnumC0372b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                enumC0372b = C0370f.EnumC0372b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                enumC0372b = enumC0372b2;
            } else {
                i3 = Math.min(this.f55h, size) - paddingLeft;
                enumC0372b = enumC0372b2;
            }
            i3 = 0;
        } else {
            i3 = size;
            enumC0372b = C0370f.EnumC0372b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                enumC0372b2 = C0370f.EnumC0372b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f56i, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            enumC0372b2 = C0370f.EnumC0372b.WRAP_CONTENT;
        }
        this.f52e.m837m0(0);
        this.f52e.m839l0(0);
        this.f52e.m847g0(enumC0372b);
        this.f52e.m814y0(i3);
        this.f52e.m822u0(enumC0372b2);
        this.f52e.m855b0(size2);
        this.f52e.m837m0((this.f53f - getPaddingLeft()) - getPaddingRight());
        this.f52e.m839l0((this.f54g - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: n */
    private void m2336n() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f51d.clear();
            m2340j();
        }
    }

    /* renamed from: o */
    private void m2335o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0037e) {
                ((C0037e) childAt).m2312a(this);
            }
        }
        int size = this.f50c.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f50c.get(i2).m2331d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0028a generateDefaultLayoutParams() {
        return new C0028a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0028a generateLayoutParams(AttributeSet attributeSet) {
        return new C0028a(getContext(), attributeSet);
    }

    /* renamed from: c */
    public Object m2347c(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
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
        return layoutParams instanceof C0028a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((parseInt / 1080.0f) * width);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i2;
                        float f2 = i3;
                        float f3 = i2 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public View m2345e(int i) {
        return this.f49b.get(i);
    }

    /* renamed from: f */
    public final C0370f m2344f(View view) {
        if (view == this) {
            return this.f52e;
        }
        if (view == null) {
            return null;
        }
        return ((C0028a) view.getLayoutParams()).f117l0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0028a(layoutParams);
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
        return this.f52e.m807R0();
    }

    /* renamed from: k */
    public void m2339k(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
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

    /* renamed from: m */
    protected void m2337m(String str) {
        this.f52e.mo741K0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0028a c0028a = (C0028a) childAt.getLayoutParams();
            C0370f c0370f = c0028a.f117l0;
            if ((childAt.getVisibility() != 8 || c0028a.f92Y || c0028a.f93Z || isInEditMode) && !c0028a.f95a0) {
                int m833p = c0370f.m833p();
                int m831q = c0370f.m831q();
                int m881D = c0370f.m881D() + m833p;
                int m829r = c0370f.m829r() + m831q;
                childAt.layout(m833p, m831q, m881D, m829r);
                if ((childAt instanceof C0037e) && (content = ((C0037e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m833p, m831q, m881D, m829r);
                }
            }
        }
        int size = this.f50c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f50c.get(i6).m2332c(this);
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
        C0370f m2344f = m2344f(view);
        if ((view instanceof C0036d) && !(m2344f instanceof C0375i)) {
            C0028a c0028a = (C0028a) view.getLayoutParams();
            C0375i c0375i = new C0375i();
            c0028a.f117l0 = c0375i;
            c0028a.f92Y = true;
            c0375i.m780M0(c0028a.f86S);
        }
        if (view instanceof AbstractC0030a) {
            AbstractC0030a abstractC0030a = (AbstractC0030a) view;
            abstractC0030a.m2329f();
            ((C0028a) view.getLayoutParams()).f93Z = true;
            if (!this.f50c.contains(abstractC0030a)) {
                this.f50c.add(abstractC0030a);
            }
        }
        this.f49b.put(view.getId(), view);
        this.f57j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f49b.remove(view.getId());
        C0370f m2344f = m2344f(view);
        this.f52e.m740L0(m2344f);
        this.f50c.remove(view);
        this.f51d.remove(m2344f);
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

    public void setConstraintSet(C0031b c0031b) {
        this.f59l = c0031b;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f49b.remove(getId());
        super.setId(i);
        this.f49b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f56i) {
            return;
        }
        this.f56i = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f55h) {
            return;
        }
        this.f55h = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f54g) {
            return;
        }
        this.f54g = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f53f) {
            return;
        }
        this.f53f = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.f52e.m796c1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
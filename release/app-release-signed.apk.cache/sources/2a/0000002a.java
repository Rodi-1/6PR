package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.C0034c;
import android.support.constraint.ConstraintLayout;
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
import p005d.C0347a;
import p005d.C0348b;
import p005d.C0349c;

/* renamed from: android.support.constraint.b */
/* loaded from: classes.dex */
public class C0031b {

    /* renamed from: b */
    private static final int[] f140b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f141c;

    /* renamed from: a */
    private HashMap<Integer, C0033b> f142a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.constraint.b$b */
    /* loaded from: classes.dex */
    public static class C0033b {

        /* renamed from: A */
        public int f143A;

        /* renamed from: B */
        public int f144B;

        /* renamed from: C */
        public int f145C;

        /* renamed from: D */
        public int f146D;

        /* renamed from: E */
        public int f147E;

        /* renamed from: F */
        public int f148F;

        /* renamed from: G */
        public int f149G;

        /* renamed from: H */
        public int f150H;

        /* renamed from: I */
        public int f151I;

        /* renamed from: J */
        public int f152J;

        /* renamed from: K */
        public int f153K;

        /* renamed from: L */
        public int f154L;

        /* renamed from: M */
        public int f155M;

        /* renamed from: N */
        public int f156N;

        /* renamed from: O */
        public int f157O;

        /* renamed from: P */
        public int f158P;

        /* renamed from: Q */
        public float f159Q;

        /* renamed from: R */
        public float f160R;

        /* renamed from: S */
        public int f161S;

        /* renamed from: T */
        public int f162T;

        /* renamed from: U */
        public float f163U;

        /* renamed from: V */
        public boolean f164V;

        /* renamed from: W */
        public float f165W;

        /* renamed from: X */
        public float f166X;

        /* renamed from: Y */
        public float f167Y;

        /* renamed from: Z */
        public float f168Z;

        /* renamed from: a */
        boolean f169a;

        /* renamed from: a0 */
        public float f170a0;

        /* renamed from: b */
        public int f171b;

        /* renamed from: b0 */
        public float f172b0;

        /* renamed from: c */
        public int f173c;

        /* renamed from: c0 */
        public float f174c0;

        /* renamed from: d */
        int f175d;

        /* renamed from: d0 */
        public float f176d0;

        /* renamed from: e */
        public int f177e;

        /* renamed from: e0 */
        public float f178e0;

        /* renamed from: f */
        public int f179f;

        /* renamed from: f0 */
        public float f180f0;

        /* renamed from: g */
        public float f181g;

        /* renamed from: g0 */
        public float f182g0;

        /* renamed from: h */
        public int f183h;

        /* renamed from: h0 */
        public boolean f184h0;

        /* renamed from: i */
        public int f185i;

        /* renamed from: i0 */
        public boolean f186i0;

        /* renamed from: j */
        public int f187j;

        /* renamed from: j0 */
        public int f188j0;

        /* renamed from: k */
        public int f189k;

        /* renamed from: k0 */
        public int f190k0;

        /* renamed from: l */
        public int f191l;

        /* renamed from: l0 */
        public int f192l0;

        /* renamed from: m */
        public int f193m;

        /* renamed from: m0 */
        public int f194m0;

        /* renamed from: n */
        public int f195n;

        /* renamed from: n0 */
        public int f196n0;

        /* renamed from: o */
        public int f197o;

        /* renamed from: o0 */
        public int f198o0;

        /* renamed from: p */
        public int f199p;

        /* renamed from: p0 */
        public float f200p0;

        /* renamed from: q */
        public int f201q;

        /* renamed from: q0 */
        public float f202q0;

        /* renamed from: r */
        public int f203r;

        /* renamed from: r0 */
        public boolean f204r0;

        /* renamed from: s */
        public int f205s;

        /* renamed from: s0 */
        public int f206s0;

        /* renamed from: t */
        public int f207t;

        /* renamed from: t0 */
        public int f208t0;

        /* renamed from: u */
        public float f209u;

        /* renamed from: u0 */
        public int[] f210u0;

        /* renamed from: v */
        public float f211v;

        /* renamed from: v0 */
        public String f212v0;

        /* renamed from: w */
        public String f213w;

        /* renamed from: x */
        public int f214x;

        /* renamed from: y */
        public int f215y;

        /* renamed from: z */
        public float f216z;

        private C0033b() {
            this.f169a = false;
            this.f177e = -1;
            this.f179f = -1;
            this.f181g = -1.0f;
            this.f183h = -1;
            this.f185i = -1;
            this.f187j = -1;
            this.f189k = -1;
            this.f191l = -1;
            this.f193m = -1;
            this.f195n = -1;
            this.f197o = -1;
            this.f199p = -1;
            this.f201q = -1;
            this.f203r = -1;
            this.f205s = -1;
            this.f207t = -1;
            this.f209u = 0.5f;
            this.f211v = 0.5f;
            this.f213w = null;
            this.f214x = -1;
            this.f215y = 0;
            this.f216z = 0.0f;
            this.f143A = -1;
            this.f144B = -1;
            this.f145C = -1;
            this.f146D = -1;
            this.f147E = -1;
            this.f148F = -1;
            this.f149G = -1;
            this.f150H = -1;
            this.f151I = -1;
            this.f152J = 0;
            this.f153K = -1;
            this.f154L = -1;
            this.f155M = -1;
            this.f156N = -1;
            this.f157O = -1;
            this.f158P = -1;
            this.f159Q = 0.0f;
            this.f160R = 0.0f;
            this.f161S = 0;
            this.f162T = 0;
            this.f163U = 1.0f;
            this.f164V = false;
            this.f165W = 0.0f;
            this.f166X = 0.0f;
            this.f167Y = 0.0f;
            this.f168Z = 0.0f;
            this.f170a0 = 1.0f;
            this.f172b0 = 1.0f;
            this.f174c0 = Float.NaN;
            this.f176d0 = Float.NaN;
            this.f178e0 = 0.0f;
            this.f180f0 = 0.0f;
            this.f182g0 = 0.0f;
            this.f184h0 = false;
            this.f186i0 = false;
            this.f188j0 = 0;
            this.f190k0 = 0;
            this.f192l0 = -1;
            this.f194m0 = -1;
            this.f196n0 = -1;
            this.f198o0 = -1;
            this.f200p0 = 1.0f;
            this.f202q0 = 1.0f;
            this.f204r0 = false;
            this.f206s0 = -1;
            this.f208t0 = -1;
        }

        /* renamed from: e */
        private void m2317e(int i, ConstraintLayout.C0028a c0028a) {
            this.f175d = i;
            this.f183h = c0028a.f100d;
            this.f185i = c0028a.f102e;
            this.f187j = c0028a.f104f;
            this.f189k = c0028a.f106g;
            this.f191l = c0028a.f108h;
            this.f193m = c0028a.f110i;
            this.f195n = c0028a.f112j;
            this.f197o = c0028a.f114k;
            this.f199p = c0028a.f116l;
            this.f201q = c0028a.f122p;
            this.f203r = c0028a.f123q;
            this.f205s = c0028a.f124r;
            this.f207t = c0028a.f125s;
            this.f209u = c0028a.f132z;
            this.f211v = c0028a.f68A;
            this.f213w = c0028a.f69B;
            this.f214x = c0028a.f118m;
            this.f215y = c0028a.f120n;
            this.f216z = c0028a.f121o;
            this.f143A = c0028a.f84Q;
            this.f144B = c0028a.f85R;
            this.f145C = c0028a.f86S;
            this.f181g = c0028a.f98c;
            this.f177e = c0028a.f94a;
            this.f179f = c0028a.f96b;
            this.f171b = ((ViewGroup.MarginLayoutParams) c0028a).width;
            this.f173c = ((ViewGroup.MarginLayoutParams) c0028a).height;
            this.f146D = ((ViewGroup.MarginLayoutParams) c0028a).leftMargin;
            this.f147E = ((ViewGroup.MarginLayoutParams) c0028a).rightMargin;
            this.f148F = ((ViewGroup.MarginLayoutParams) c0028a).topMargin;
            this.f149G = ((ViewGroup.MarginLayoutParams) c0028a).bottomMargin;
            this.f159Q = c0028a.f73F;
            this.f160R = c0028a.f72E;
            this.f162T = c0028a.f75H;
            this.f161S = c0028a.f74G;
            boolean z = c0028a.f87T;
            this.f186i0 = c0028a.f88U;
            this.f188j0 = c0028a.f76I;
            this.f190k0 = c0028a.f77J;
            this.f184h0 = z;
            this.f192l0 = c0028a.f80M;
            this.f194m0 = c0028a.f81N;
            this.f196n0 = c0028a.f78K;
            this.f198o0 = c0028a.f79L;
            this.f200p0 = c0028a.f82O;
            this.f202q0 = c0028a.f83P;
            this.f150H = c0028a.getMarginEnd();
            this.f151I = c0028a.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m2316f(int i, C0034c.C0035a c0035a) {
            m2317e(i, c0035a);
            this.f163U = c0035a.f218n0;
            this.f166X = c0035a.f221q0;
            this.f167Y = c0035a.f222r0;
            this.f168Z = c0035a.f223s0;
            this.f170a0 = c0035a.f224t0;
            this.f172b0 = c0035a.f225u0;
            this.f174c0 = c0035a.f226v0;
            this.f176d0 = c0035a.f227w0;
            this.f178e0 = c0035a.f228x0;
            this.f180f0 = c0035a.f229y0;
            this.f182g0 = c0035a.f230z0;
            this.f165W = c0035a.f220p0;
            this.f164V = c0035a.f219o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m2315g(AbstractC0030a abstractC0030a, int i, C0034c.C0035a c0035a) {
            m2316f(i, c0035a);
            if (abstractC0030a instanceof C0347a) {
                this.f208t0 = 1;
                C0347a c0347a = (C0347a) abstractC0030a;
                this.f206s0 = c0347a.getType();
                this.f210u0 = c0347a.getReferencedIds();
            }
        }

        /* renamed from: c */
        public void m2319c(ConstraintLayout.C0028a c0028a) {
            c0028a.f100d = this.f183h;
            c0028a.f102e = this.f185i;
            c0028a.f104f = this.f187j;
            c0028a.f106g = this.f189k;
            c0028a.f108h = this.f191l;
            c0028a.f110i = this.f193m;
            c0028a.f112j = this.f195n;
            c0028a.f114k = this.f197o;
            c0028a.f116l = this.f199p;
            c0028a.f122p = this.f201q;
            c0028a.f123q = this.f203r;
            c0028a.f124r = this.f205s;
            c0028a.f125s = this.f207t;
            ((ViewGroup.MarginLayoutParams) c0028a).leftMargin = this.f146D;
            ((ViewGroup.MarginLayoutParams) c0028a).rightMargin = this.f147E;
            ((ViewGroup.MarginLayoutParams) c0028a).topMargin = this.f148F;
            ((ViewGroup.MarginLayoutParams) c0028a).bottomMargin = this.f149G;
            c0028a.f130x = this.f158P;
            c0028a.f131y = this.f157O;
            c0028a.f132z = this.f209u;
            c0028a.f68A = this.f211v;
            c0028a.f118m = this.f214x;
            c0028a.f120n = this.f215y;
            c0028a.f121o = this.f216z;
            c0028a.f69B = this.f213w;
            c0028a.f84Q = this.f143A;
            c0028a.f85R = this.f144B;
            c0028a.f73F = this.f159Q;
            c0028a.f72E = this.f160R;
            c0028a.f75H = this.f162T;
            c0028a.f74G = this.f161S;
            c0028a.f87T = this.f184h0;
            c0028a.f88U = this.f186i0;
            c0028a.f76I = this.f188j0;
            c0028a.f77J = this.f190k0;
            c0028a.f80M = this.f192l0;
            c0028a.f81N = this.f194m0;
            c0028a.f78K = this.f196n0;
            c0028a.f79L = this.f198o0;
            c0028a.f82O = this.f200p0;
            c0028a.f83P = this.f202q0;
            c0028a.f86S = this.f145C;
            c0028a.f98c = this.f181g;
            c0028a.f94a = this.f177e;
            c0028a.f96b = this.f179f;
            ((ViewGroup.MarginLayoutParams) c0028a).width = this.f171b;
            ((ViewGroup.MarginLayoutParams) c0028a).height = this.f173c;
            c0028a.setMarginStart(this.f151I);
            c0028a.setMarginEnd(this.f150H);
            c0028a.m2334a();
        }

        /* renamed from: d */
        public C0033b clone() {
            C0033b c0033b = new C0033b();
            c0033b.f169a = this.f169a;
            c0033b.f171b = this.f171b;
            c0033b.f173c = this.f173c;
            c0033b.f177e = this.f177e;
            c0033b.f179f = this.f179f;
            c0033b.f181g = this.f181g;
            c0033b.f183h = this.f183h;
            c0033b.f185i = this.f185i;
            c0033b.f187j = this.f187j;
            c0033b.f189k = this.f189k;
            c0033b.f191l = this.f191l;
            c0033b.f193m = this.f193m;
            c0033b.f195n = this.f195n;
            c0033b.f197o = this.f197o;
            c0033b.f199p = this.f199p;
            c0033b.f201q = this.f201q;
            c0033b.f203r = this.f203r;
            c0033b.f205s = this.f205s;
            c0033b.f207t = this.f207t;
            c0033b.f209u = this.f209u;
            c0033b.f211v = this.f211v;
            c0033b.f213w = this.f213w;
            c0033b.f143A = this.f143A;
            c0033b.f144B = this.f144B;
            c0033b.f209u = this.f209u;
            c0033b.f209u = this.f209u;
            c0033b.f209u = this.f209u;
            c0033b.f209u = this.f209u;
            c0033b.f209u = this.f209u;
            c0033b.f145C = this.f145C;
            c0033b.f146D = this.f146D;
            c0033b.f147E = this.f147E;
            c0033b.f148F = this.f148F;
            c0033b.f149G = this.f149G;
            c0033b.f150H = this.f150H;
            c0033b.f151I = this.f151I;
            c0033b.f152J = this.f152J;
            c0033b.f153K = this.f153K;
            c0033b.f154L = this.f154L;
            c0033b.f155M = this.f155M;
            c0033b.f156N = this.f156N;
            c0033b.f157O = this.f157O;
            c0033b.f158P = this.f158P;
            c0033b.f159Q = this.f159Q;
            c0033b.f160R = this.f160R;
            c0033b.f161S = this.f161S;
            c0033b.f162T = this.f162T;
            c0033b.f163U = this.f163U;
            c0033b.f164V = this.f164V;
            c0033b.f165W = this.f165W;
            c0033b.f166X = this.f166X;
            c0033b.f167Y = this.f167Y;
            c0033b.f168Z = this.f168Z;
            c0033b.f170a0 = this.f170a0;
            c0033b.f172b0 = this.f172b0;
            c0033b.f174c0 = this.f174c0;
            c0033b.f176d0 = this.f176d0;
            c0033b.f178e0 = this.f178e0;
            c0033b.f180f0 = this.f180f0;
            c0033b.f182g0 = this.f182g0;
            c0033b.f184h0 = this.f184h0;
            c0033b.f186i0 = this.f186i0;
            c0033b.f188j0 = this.f188j0;
            c0033b.f190k0 = this.f190k0;
            c0033b.f192l0 = this.f192l0;
            c0033b.f194m0 = this.f194m0;
            c0033b.f196n0 = this.f196n0;
            c0033b.f198o0 = this.f198o0;
            c0033b.f200p0 = this.f200p0;
            c0033b.f202q0 = this.f202q0;
            c0033b.f206s0 = this.f206s0;
            c0033b.f208t0 = this.f208t0;
            int[] iArr = this.f210u0;
            if (iArr != null) {
                c0033b.f210u0 = Arrays.copyOf(iArr, iArr.length);
            }
            c0033b.f214x = this.f214x;
            c0033b.f215y = this.f215y;
            c0033b.f216z = this.f216z;
            c0033b.f204r0 = this.f204r0;
            return c0033b;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f141c = sparseIntArray;
        sparseIntArray.append(C0349c.f1708h1, 25);
        f141c.append(C0349c.f1711i1, 26);
        f141c.append(C0349c.f1717k1, 29);
        f141c.append(C0349c.f1720l1, 30);
        f141c.append(C0349c.f1735q1, 36);
        f141c.append(C0349c.f1732p1, 35);
        f141c.append(C0349c.f1664P0, 4);
        f141c.append(C0349c.f1662O0, 3);
        f141c.append(C0349c.f1658M0, 1);
        f141c.append(C0349c.f1759y1, 6);
        f141c.append(C0349c.f1762z1, 7);
        f141c.append(C0349c.f1678W0, 17);
        f141c.append(C0349c.f1680X0, 18);
        f141c.append(C0349c.f1682Y0, 19);
        f141c.append(C0349c.f1716k0, 27);
        f141c.append(C0349c.f1723m1, 32);
        f141c.append(C0349c.f1726n1, 33);
        f141c.append(C0349c.f1676V0, 10);
        f141c.append(C0349c.f1674U0, 9);
        f141c.append(C0349c.f1634C1, 13);
        f141c.append(C0349c.f1643F1, 16);
        f141c.append(C0349c.f1637D1, 14);
        f141c.append(C0349c.f1628A1, 11);
        f141c.append(C0349c.f1640E1, 15);
        f141c.append(C0349c.f1631B1, 12);
        f141c.append(C0349c.f1744t1, 40);
        f141c.append(C0349c.f1702f1, 39);
        f141c.append(C0349c.f1699e1, 41);
        f141c.append(C0349c.f1741s1, 42);
        f141c.append(C0349c.f1696d1, 20);
        f141c.append(C0349c.f1738r1, 37);
        f141c.append(C0349c.f1672T0, 5);
        f141c.append(C0349c.f1705g1, 75);
        f141c.append(C0349c.f1729o1, 75);
        f141c.append(C0349c.f1714j1, 75);
        f141c.append(C0349c.f1660N0, 75);
        f141c.append(C0349c.f1656L0, 75);
        f141c.append(C0349c.f1731p0, 24);
        f141c.append(C0349c.f1737r0, 28);
        f141c.append(C0349c.f1636D0, 31);
        f141c.append(C0349c.f1639E0, 8);
        f141c.append(C0349c.f1734q0, 34);
        f141c.append(C0349c.f1740s0, 2);
        f141c.append(C0349c.f1725n0, 23);
        f141c.append(C0349c.f1728o0, 21);
        f141c.append(C0349c.f1722m0, 22);
        f141c.append(C0349c.f1743t0, 43);
        f141c.append(C0349c.f1645G0, 44);
        f141c.append(C0349c.f1630B0, 45);
        f141c.append(C0349c.f1633C0, 46);
        f141c.append(C0349c.f1627A0, 60);
        f141c.append(C0349c.f1758y0, 47);
        f141c.append(C0349c.f1761z0, 48);
        f141c.append(C0349c.f1746u0, 49);
        f141c.append(C0349c.f1749v0, 50);
        f141c.append(C0349c.f1752w0, 51);
        f141c.append(C0349c.f1755x0, 52);
        f141c.append(C0349c.f1642F0, 53);
        f141c.append(C0349c.f1747u1, 54);
        f141c.append(C0349c.f1684Z0, 55);
        f141c.append(C0349c.f1750v1, 56);
        f141c.append(C0349c.f1687a1, 57);
        f141c.append(C0349c.f1753w1, 58);
        f141c.append(C0349c.f1690b1, 59);
        f141c.append(C0349c.f1666Q0, 61);
        f141c.append(C0349c.f1670S0, 62);
        f141c.append(C0349c.f1668R0, 63);
        f141c.append(C0349c.f1719l0, 38);
        f141c.append(C0349c.f1756x1, 69);
        f141c.append(C0349c.f1693c1, 70);
        f141c.append(C0349c.f1652J0, 71);
        f141c.append(C0349c.f1650I0, 72);
        f141c.append(C0349c.f1654K0, 73);
        f141c.append(C0349c.f1648H0, 74);
    }

    /* renamed from: c */
    private int[] m2326c(View view, String str) {
        int i;
        Object m2347c;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0348b.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m2347c = ((ConstraintLayout) view.getParent()).m2347c(0, trim)) != null && (m2347c instanceof Integer)) {
                i = ((Integer) m2347c).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: d */
    private C0033b m2325d(Context context, AttributeSet attributeSet) {
        C0033b c0033b = new C0033b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0349c.f1713j0);
        m2322g(c0033b, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0033b;
    }

    /* renamed from: f */
    private static int m2323f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: g */
    private void m2322g(C0033b c0033b, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f141c.get(index);
            switch (i2) {
                case 1:
                    c0033b.f199p = m2323f(typedArray, index, c0033b.f199p);
                    break;
                case 2:
                    c0033b.f149G = typedArray.getDimensionPixelSize(index, c0033b.f149G);
                    break;
                case 3:
                    c0033b.f197o = m2323f(typedArray, index, c0033b.f197o);
                    break;
                case 4:
                    c0033b.f195n = m2323f(typedArray, index, c0033b.f195n);
                    break;
                case 5:
                    c0033b.f213w = typedArray.getString(index);
                    break;
                case 6:
                    c0033b.f143A = typedArray.getDimensionPixelOffset(index, c0033b.f143A);
                    break;
                case 7:
                    c0033b.f144B = typedArray.getDimensionPixelOffset(index, c0033b.f144B);
                    break;
                case 8:
                    c0033b.f150H = typedArray.getDimensionPixelSize(index, c0033b.f150H);
                    break;
                case 9:
                    c0033b.f207t = m2323f(typedArray, index, c0033b.f207t);
                    break;
                case 10:
                    c0033b.f205s = m2323f(typedArray, index, c0033b.f205s);
                    break;
                case 11:
                    c0033b.f156N = typedArray.getDimensionPixelSize(index, c0033b.f156N);
                    break;
                case 12:
                    c0033b.f157O = typedArray.getDimensionPixelSize(index, c0033b.f157O);
                    break;
                case 13:
                    c0033b.f153K = typedArray.getDimensionPixelSize(index, c0033b.f153K);
                    break;
                case 14:
                    c0033b.f155M = typedArray.getDimensionPixelSize(index, c0033b.f155M);
                    break;
                case 15:
                    c0033b.f158P = typedArray.getDimensionPixelSize(index, c0033b.f158P);
                    break;
                case 16:
                    c0033b.f154L = typedArray.getDimensionPixelSize(index, c0033b.f154L);
                    break;
                case 17:
                    c0033b.f177e = typedArray.getDimensionPixelOffset(index, c0033b.f177e);
                    break;
                case 18:
                    c0033b.f179f = typedArray.getDimensionPixelOffset(index, c0033b.f179f);
                    break;
                case 19:
                    c0033b.f181g = typedArray.getFloat(index, c0033b.f181g);
                    break;
                case 20:
                    c0033b.f209u = typedArray.getFloat(index, c0033b.f209u);
                    break;
                case 21:
                    c0033b.f173c = typedArray.getLayoutDimension(index, c0033b.f173c);
                    break;
                case 22:
                    int i3 = typedArray.getInt(index, c0033b.f152J);
                    c0033b.f152J = i3;
                    c0033b.f152J = f140b[i3];
                    break;
                case 23:
                    c0033b.f171b = typedArray.getLayoutDimension(index, c0033b.f171b);
                    break;
                case 24:
                    c0033b.f146D = typedArray.getDimensionPixelSize(index, c0033b.f146D);
                    break;
                case 25:
                    c0033b.f183h = m2323f(typedArray, index, c0033b.f183h);
                    break;
                case 26:
                    c0033b.f185i = m2323f(typedArray, index, c0033b.f185i);
                    break;
                case 27:
                    c0033b.f145C = typedArray.getInt(index, c0033b.f145C);
                    break;
                case 28:
                    c0033b.f147E = typedArray.getDimensionPixelSize(index, c0033b.f147E);
                    break;
                case 29:
                    c0033b.f187j = m2323f(typedArray, index, c0033b.f187j);
                    break;
                case 30:
                    c0033b.f189k = m2323f(typedArray, index, c0033b.f189k);
                    break;
                case C0349c.f1641F /* 31 */:
                    c0033b.f151I = typedArray.getDimensionPixelSize(index, c0033b.f151I);
                    break;
                case C0349c.f1644G /* 32 */:
                    c0033b.f201q = m2323f(typedArray, index, c0033b.f201q);
                    break;
                case 33:
                    c0033b.f203r = m2323f(typedArray, index, c0033b.f203r);
                    break;
                case 34:
                    c0033b.f148F = typedArray.getDimensionPixelSize(index, c0033b.f148F);
                    break;
                case 35:
                    c0033b.f193m = m2323f(typedArray, index, c0033b.f193m);
                    break;
                case 36:
                    c0033b.f191l = m2323f(typedArray, index, c0033b.f191l);
                    break;
                case 37:
                    c0033b.f211v = typedArray.getFloat(index, c0033b.f211v);
                    break;
                case 38:
                    c0033b.f175d = typedArray.getResourceId(index, c0033b.f175d);
                    break;
                case 39:
                    c0033b.f160R = typedArray.getFloat(index, c0033b.f160R);
                    break;
                case 40:
                    c0033b.f159Q = typedArray.getFloat(index, c0033b.f159Q);
                    break;
                case 41:
                    c0033b.f161S = typedArray.getInt(index, c0033b.f161S);
                    break;
                case 42:
                    c0033b.f162T = typedArray.getInt(index, c0033b.f162T);
                    break;
                case 43:
                    c0033b.f163U = typedArray.getFloat(index, c0033b.f163U);
                    break;
                case 44:
                    c0033b.f164V = true;
                    c0033b.f165W = typedArray.getDimension(index, c0033b.f165W);
                    break;
                case 45:
                    c0033b.f167Y = typedArray.getFloat(index, c0033b.f167Y);
                    break;
                case 46:
                    c0033b.f168Z = typedArray.getFloat(index, c0033b.f168Z);
                    break;
                case 47:
                    c0033b.f170a0 = typedArray.getFloat(index, c0033b.f170a0);
                    break;
                case 48:
                    c0033b.f172b0 = typedArray.getFloat(index, c0033b.f172b0);
                    break;
                case 49:
                    c0033b.f174c0 = typedArray.getFloat(index, c0033b.f174c0);
                    break;
                case 50:
                    c0033b.f176d0 = typedArray.getFloat(index, c0033b.f176d0);
                    break;
                case 51:
                    c0033b.f178e0 = typedArray.getDimension(index, c0033b.f178e0);
                    break;
                case 52:
                    c0033b.f180f0 = typedArray.getDimension(index, c0033b.f180f0);
                    break;
                case 53:
                    c0033b.f182g0 = typedArray.getDimension(index, c0033b.f182g0);
                    break;
                default:
                    switch (i2) {
                        case C0349c.f1723m1 /* 60 */:
                            c0033b.f166X = typedArray.getFloat(index, c0033b.f166X);
                            continue;
                        case C0349c.f1726n1 /* 61 */:
                            c0033b.f214x = m2323f(typedArray, index, c0033b.f214x);
                            continue;
                        case C0349c.f1729o1 /* 62 */:
                            c0033b.f215y = typedArray.getDimensionPixelSize(index, c0033b.f215y);
                            continue;
                        case C0349c.f1732p1 /* 63 */:
                            c0033b.f216z = typedArray.getFloat(index, c0033b.f216z);
                            continue;
                        default:
                            switch (i2) {
                                case C0349c.f1750v1 /* 69 */:
                                    c0033b.f200p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case C0349c.f1753w1 /* 70 */:
                                    c0033b.f202q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case C0349c.f1756x1 /* 71 */:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case C0349c.f1759y1 /* 72 */:
                                    c0033b.f206s0 = typedArray.getInt(index, c0033b.f206s0);
                                    break;
                                case C0349c.f1762z1 /* 73 */:
                                    c0033b.f212v0 = typedArray.getString(index);
                                    break;
                                case C0349c.f1628A1 /* 74 */:
                                    c0033b.f204r0 = typedArray.getBoolean(index, c0033b.f204r0);
                                    break;
                                case C0349c.f1631B1 /* 75 */:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f141c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f141c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                            }
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2328a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f142a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f142a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0033b c0033b = this.f142a.get(Integer.valueOf(id));
                if (childAt instanceof C0347a) {
                    c0033b.f208t0 = 1;
                }
                int i2 = c0033b.f208t0;
                if (i2 != -1 && i2 == 1) {
                    C0347a c0347a = (C0347a) childAt;
                    c0347a.setId(id);
                    c0347a.setType(c0033b.f206s0);
                    c0347a.setAllowsGoneWidget(c0033b.f204r0);
                    int[] iArr = c0033b.f210u0;
                    if (iArr != null) {
                        c0347a.setReferencedIds(iArr);
                    } else {
                        String str = c0033b.f212v0;
                        if (str != null) {
                            int[] m2326c = m2326c(c0347a, str);
                            c0033b.f210u0 = m2326c;
                            c0347a.setReferencedIds(m2326c);
                        }
                    }
                }
                ConstraintLayout.C0028a c0028a = (ConstraintLayout.C0028a) childAt.getLayoutParams();
                c0033b.m2319c(c0028a);
                childAt.setLayoutParams(c0028a);
                childAt.setVisibility(c0033b.f152J);
                int i3 = Build.VERSION.SDK_INT;
                childAt.setAlpha(c0033b.f163U);
                childAt.setRotation(c0033b.f166X);
                childAt.setRotationX(c0033b.f167Y);
                childAt.setRotationY(c0033b.f168Z);
                childAt.setScaleX(c0033b.f170a0);
                childAt.setScaleY(c0033b.f172b0);
                if (!Float.isNaN(c0033b.f174c0)) {
                    childAt.setPivotX(c0033b.f174c0);
                }
                if (!Float.isNaN(c0033b.f176d0)) {
                    childAt.setPivotY(c0033b.f176d0);
                }
                childAt.setTranslationX(c0033b.f178e0);
                childAt.setTranslationY(c0033b.f180f0);
                if (i3 >= 21) {
                    childAt.setTranslationZ(c0033b.f182g0);
                    if (c0033b.f164V) {
                        childAt.setElevation(c0033b.f165W);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0033b c0033b2 = this.f142a.get(num);
            int i4 = c0033b2.f208t0;
            if (i4 != -1 && i4 == 1) {
                C0347a c0347a2 = new C0347a(constraintLayout.getContext());
                c0347a2.setId(num.intValue());
                int[] iArr2 = c0033b2.f210u0;
                if (iArr2 != null) {
                    c0347a2.setReferencedIds(iArr2);
                } else {
                    String str2 = c0033b2.f212v0;
                    if (str2 != null) {
                        int[] m2326c2 = m2326c(c0347a2, str2);
                        c0033b2.f210u0 = m2326c2;
                        c0347a2.setReferencedIds(m2326c2);
                    }
                }
                c0347a2.setType(c0033b2.f206s0);
                ConstraintLayout.C0028a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                c0347a2.m2329f();
                c0033b2.m2319c(generateDefaultLayoutParams);
                constraintLayout.addView(c0347a2, generateDefaultLayoutParams);
            }
            if (c0033b2.f169a) {
                View c0036d = new C0036d(constraintLayout.getContext());
                c0036d.setId(num.intValue());
                ConstraintLayout.C0028a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0033b2.m2319c(generateDefaultLayoutParams2);
                constraintLayout.addView(c0036d, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: b */
    public void m2327b(C0034c c0034c) {
        int childCount = c0034c.getChildCount();
        this.f142a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c0034c.getChildAt(i);
            C0034c.C0035a c0035a = (C0034c.C0035a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f142a.containsKey(Integer.valueOf(id))) {
                this.f142a.put(Integer.valueOf(id), new C0033b());
            }
            C0033b c0033b = this.f142a.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0030a) {
                c0033b.m2315g((AbstractC0030a) childAt, id, c0035a);
            }
            c0033b.m2316f(id, c0035a);
        }
    }

    /* renamed from: e */
    public void m2324e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0033b m2325d = m2325d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m2325d.f169a = true;
                    }
                    this.f142a.put(Integer.valueOf(m2325d.f175d), m2325d);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
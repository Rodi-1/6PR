package p005d;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.AbstractC0030a;
import android.util.AttributeSet;
import p007f.C0362b;

/* renamed from: d.a */
/* loaded from: classes.dex */
public class C0347a extends AbstractC0030a {

    /* renamed from: h */
    private int f1623h;

    /* renamed from: i */
    private int f1624i;

    /* renamed from: j */
    private C0362b f1625j;

    public C0347a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.AbstractC0030a
    /* renamed from: b */
    public void mo1001b(AttributeSet attributeSet) {
        super.mo1001b(attributeSet);
        this.f1625j = new C0362b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0349c.f1685a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0349c.f1706h) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0349c.f1703g) {
                    this.f1625j.m908K0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f137e = this.f1625j;
        m2329f();
    }

    public int getType() {
        return this.f1623h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1625j.m908K0(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r5 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r5 == 6) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setType(int r5) {
        /*
            r4 = this;
            r4.f1623h = r5
            r4.f1624i = r5
            android.content.res.Resources r5 = r4.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.getLayoutDirection()
            r0 = 0
            r1 = 1
            if (r1 != r5) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            r2 = 6
            r3 = 5
            if (r5 == 0) goto L25
            int r5 = r4.f1623h
            if (r5 != r3) goto L22
        L1f:
            r4.f1624i = r1
            goto L2f
        L22:
            if (r5 != r2) goto L2f
            goto L29
        L25:
            int r5 = r4.f1623h
            if (r5 != r3) goto L2c
        L29:
            r4.f1624i = r0
            goto L2f
        L2c:
            if (r5 != r2) goto L2f
            goto L1f
        L2f:
            f.b r5 = r4.f1625j
            int r0 = r4.f1624i
            r5.m907L0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005d.C0347a.setType(int):void");
    }
}
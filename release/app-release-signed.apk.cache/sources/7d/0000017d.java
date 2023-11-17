package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends android.support.constraint.a {

    /* renamed from: h  reason: collision with root package name */
    private int f1311h;

    /* renamed from: i  reason: collision with root package name */
    private int f1312i;

    /* renamed from: j  reason: collision with root package name */
    private f.b f1313j;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.a
    public void b(AttributeSet attributeSet) {
        super.b(attributeSet);
        this.f1313j = new f.b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f1314a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == c.f1321h) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.f1320g) {
                    this.f1313j.K0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f95e = this.f1313j;
        f();
    }

    public int getType() {
        return this.f1311h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1313j.K0(z);
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
            r4.f1311h = r5
            r4.f1312i = r5
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
            int r5 = r4.f1311h
            if (r5 != r3) goto L22
        L1f:
            r4.f1312i = r1
            goto L2f
        L22:
            if (r5 != r2) goto L2f
            goto L29
        L25:
            int r5 = r4.f1311h
            if (r5 != r3) goto L2c
        L29:
            r4.f1312i = r0
            goto L2f
        L2c:
            if (r5 != r2) goto L2f
            goto L1f
        L2f:
            f.b r5 = r4.f1313j
            int r0 = r4.f1312i
            r5.L0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.setType(int):void");
    }
}
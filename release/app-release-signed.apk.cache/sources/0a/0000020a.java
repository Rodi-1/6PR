package o;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f1701a;

    /* renamed from: b  reason: collision with root package name */
    private int f1702b;

    public l(ViewGroup viewGroup) {
        this.f1701a = viewGroup;
    }

    public int a() {
        return this.f1702b;
    }

    public void b(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    public void c(View view, View view2, int i2, int i3) {
        this.f1702b = i2;
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i2) {
        this.f1702b = 0;
    }
}
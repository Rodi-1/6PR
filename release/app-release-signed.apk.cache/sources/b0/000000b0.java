package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class k extends d {

    /* renamed from: j  reason: collision with root package name */
    private int f554j;

    /* renamed from: k  reason: collision with root package name */
    private int f555k;

    /* renamed from: l  reason: collision with root package name */
    private LayoutInflater f556l;

    @Deprecated
    public k(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f555k = i2;
        this.f554j = i2;
        this.f556l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.d
    public View c(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f556l.inflate(this.f555k, viewGroup, false);
    }

    @Override // android.support.v4.widget.d
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f556l.inflate(this.f554j, viewGroup, false);
    }
}
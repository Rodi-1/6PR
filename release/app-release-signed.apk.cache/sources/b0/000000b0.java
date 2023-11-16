package android.support.p001v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.k */
/* loaded from: classes.dex */
public abstract class AbstractC0162k extends AbstractC0143d {

    /* renamed from: j */
    private int f704j;

    /* renamed from: k */
    private int f705k;

    /* renamed from: l */
    private LayoutInflater f706l;

    @Deprecated
    public AbstractC0162k(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f705k = i;
        this.f704j = i;
        this.f706l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.p001v4.widget.AbstractC0143d
    /* renamed from: c */
    public View mo1722c(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f706l.inflate(this.f705k, viewGroup, false);
    }

    @Override // android.support.p001v4.widget.AbstractC0143d
    /* renamed from: d */
    public View mo1160d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f706l.inflate(this.f704j, viewGroup, false);
    }
}
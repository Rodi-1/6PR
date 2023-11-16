package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p002v7.widget.InterfaceC0265g0;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0265g0 {

    /* renamed from: b */
    private InterfaceC0265g0.InterfaceC0266a f1112b;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0265g0.InterfaceC0266a interfaceC0266a = this.f1112b;
        if (interfaceC0266a != null) {
            interfaceC0266a.mo191a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.support.p002v7.widget.InterfaceC0265g0
    public void setOnFitSystemWindowsListener(InterfaceC0265g0.InterfaceC0266a interfaceC0266a) {
        this.f1112b = interfaceC0266a;
    }
}
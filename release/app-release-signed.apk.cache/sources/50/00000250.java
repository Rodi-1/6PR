package p019r;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import p020s.C0569a;
import p023v.AbstractC0585b;

/* renamed from: r.j */
/* loaded from: classes.dex */
public class DialogC0557j extends Dialog implements InterfaceC0530c {

    /* renamed from: b */
    private AbstractC0531d f2348b;

    public DialogC0557j(Context context, int i) {
        super(context, m181b(context, i));
        m182a().mo208p(null);
        m182a().mo260d();
    }

    /* renamed from: b */
    private static int m181b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0569a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    /* renamed from: a */
    public AbstractC0531d m182a() {
        if (this.f2348b == null) {
            this.f2348b = AbstractC0531d.m275f(this, this);
        }
        return this.f2348b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m182a().mo226c(view, layoutParams);
    }

    @Override // p019r.InterfaceC0530c
    /* renamed from: c */
    public void mo180c(AbstractC0585b abstractC0585b) {
    }

    @Override // p019r.InterfaceC0530c
    /* renamed from: d */
    public void mo179d(AbstractC0585b abstractC0585b) {
    }

    @Override // p019r.InterfaceC0530c
    /* renamed from: e */
    public AbstractC0585b mo178e(AbstractC0585b.InterfaceC0586a interfaceC0586a) {
        return null;
    }

    /* renamed from: f */
    public boolean m177f(int i) {
        return m182a().mo196w(i);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m182a().mo220h(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m182a().mo213m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m182a().mo215l();
        super.onCreate(bundle);
        m182a().mo208p(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m182a().mo198v();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m182a().mo195x(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m182a().mo194y(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m182a().mo193z(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m182a().mo271A(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m182a().mo271A(charSequence);
    }
}
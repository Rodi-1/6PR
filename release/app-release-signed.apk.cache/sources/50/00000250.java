package r;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import v.b;

/* loaded from: classes.dex */
public class j extends Dialog implements c {

    /* renamed from: b  reason: collision with root package name */
    private d f1801b;

    public j(Context context, int i2) {
        super(context, b(context, i2));
        a().p(null);
        a().d();
    }

    private static int b(Context context, int i2) {
        if (i2 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(s.a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i2;
    }

    public d a() {
        if (this.f1801b == null) {
            this.f1801b = d.f(this, this);
        }
        return this.f1801b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    @Override // r.c
    public void c(v.b bVar) {
    }

    @Override // r.c
    public void d(v.b bVar) {
    }

    @Override // r.c
    public v.b e(b.a aVar) {
        return null;
    }

    public boolean f(int i2) {
        return a().w(i2);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().h(i2);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().p(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().v();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().x(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().y(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().z(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().A(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().A(charSequence);
    }
}
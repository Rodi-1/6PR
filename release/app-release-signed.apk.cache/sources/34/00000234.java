package r;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.a0;
import android.support.v4.app.v;
import android.support.v7.widget.a1;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import v.b;

/* loaded from: classes.dex */
public class b extends android.support.v4.app.h implements c, a0.a {

    /* renamed from: p  reason: collision with root package name */
    private d f1733p;

    /* renamed from: q  reason: collision with root package name */
    private int f1734q = 0;

    /* renamed from: r  reason: collision with root package name */
    private Resources f1735r;

    private boolean y(int i2, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public boolean A(Intent intent) {
        return v.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s().c(view, layoutParams);
    }

    @Override // r.c
    public void c(v.b bVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a t2 = t();
        if (getWindow().hasFeature(0)) {
            if (t2 == null || !t2.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // r.c
    public void d(v.b bVar) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a t2 = t();
        if (keyCode == 82 && t2 != null && t2.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // r.c
    public v.b e(b.a aVar) {
        return null;
    }

    @Override // android.support.v4.app.a0.a
    public Intent f() {
        return v.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) s().h(i2);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return s().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1735r == null && a1.a()) {
            this.f1735r = new a1(this, super.getResources());
        }
        Resources resources = this.f1735r;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        s().m();
    }

    @Override // android.support.v4.app.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s().o(configuration);
        if (this.f1735r != null) {
            this.f1735r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.h, android.support.v4.app.z, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i2;
        d s2 = s();
        s2.l();
        s2.p(bundle);
        if (s2.d() && (i2 = this.f1734q) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1734q, false);
            } else {
                setTheme(i2);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.h, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s().q();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (y(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.support.v4.app.h, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a t2 = t();
        if (menuItem.getItemId() != 16908332 || t2 == null || (t2.j() & 4) == 0) {
            return false;
        }
        return x();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // android.support.v4.app.h, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        s().r(bundle);
    }

    @Override // android.support.v4.app.h, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        s().s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.h, android.support.v4.app.z, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        s().t(bundle);
    }

    @Override // android.support.v4.app.h, android.app.Activity
    protected void onStart() {
        super.onStart();
        s().u();
    }

    @Override // android.support.v4.app.h, android.app.Activity
    protected void onStop() {
        super.onStop();
        s().v();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        s().A(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a t2 = t();
        if (getWindow().hasFeature(0)) {
            if (t2 == null || !t2.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.support.v4.app.h
    public void r() {
        s().m();
    }

    public d s() {
        if (this.f1733p == null) {
            this.f1733p = d.e(this, this);
        }
        return this.f1733p;
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        s().x(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        s().y(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s().z(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        this.f1734q = i2;
    }

    public a t() {
        return s().k();
    }

    public void u(a0 a0Var) {
        a0Var.b(this);
    }

    public void v(a0 a0Var) {
    }

    @Deprecated
    public void w() {
    }

    public boolean x() {
        Intent f2 = f();
        if (f2 != null) {
            if (!A(f2)) {
                z(f2);
                return true;
            }
            a0 d2 = a0.d(this);
            u(d2);
            v(d2);
            d2.e();
            try {
                android.support.v4.app.a.d(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public void z(Intent intent) {
        v.e(this, intent);
    }
}
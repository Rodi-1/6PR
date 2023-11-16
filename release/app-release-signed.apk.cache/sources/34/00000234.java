package p019r;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.app.ActivityC0079h;
import android.support.p001v4.app.C0060a;
import android.support.p001v4.app.C0062a0;
import android.support.p001v4.app.C0126v;
import android.support.p002v7.widget.C0241a1;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p023v.AbstractC0585b;

/* renamed from: r.b */
/* loaded from: classes.dex */
public class ActivityC0529b extends ActivityC0079h implements InterfaceC0530c, C0062a0.InterfaceC0063a {

    /* renamed from: p */
    private AbstractC0531d f2251p;

    /* renamed from: q */
    private int f2252q = 0;

    /* renamed from: r */
    private Resources f2253r;

    /* renamed from: y */
    private boolean m278y(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* renamed from: A */
    public boolean m287A(Intent intent) {
        return C0126v.m1822f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m284s().mo226c(view, layoutParams);
    }

    @Override // p019r.InterfaceC0530c
    /* renamed from: c */
    public void mo180c(AbstractC0585b abstractC0585b) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0525a m283t = m283t();
        if (getWindow().hasFeature(0)) {
            if (m283t == null || !m283t.m298g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p019r.InterfaceC0530c
    /* renamed from: d */
    public void mo179d(AbstractC0585b abstractC0585b) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0525a m283t = m283t();
        if (keyCode == 82 && m283t != null && m283t.m295p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p019r.InterfaceC0530c
    /* renamed from: e */
    public AbstractC0585b mo178e(AbstractC0585b.InterfaceC0586a interfaceC0586a) {
        return null;
    }

    @Override // android.support.p001v4.app.C0062a0.InterfaceC0063a
    /* renamed from: f */
    public Intent mo286f() {
        return C0126v.m1827a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m284s().mo220h(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m284s().mo265j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f2253r == null && C0241a1.m1398a()) {
            this.f2253r = new C0241a1(this, super.getResources());
        }
        Resources resources = this.f2253r;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m284s().mo213m();
    }

    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m284s().mo210o(configuration);
        if (this.f2253r != null) {
            this.f2253r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m280w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0079h, android.support.p001v4.app.ActivityC0130z, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        AbstractC0531d m284s = m284s();
        m284s.mo215l();
        m284s.mo208p(bundle);
        if (m284s.mo260d() && (i = this.f2252q) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2252q, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m284s().mo206q();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m278y(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0525a m283t = m283t();
        if (menuItem.getItemId() != 16908332 || m283t == null || (m283t.mo121j() & 4) == 0) {
            return false;
        }
        return m279x();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m284s().mo204r(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m284s().mo202s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0079h, android.support.p001v4.app.ActivityC0130z, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m284s().mo259t(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity
    public void onStart() {
        super.onStart();
        m284s().mo258u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.ActivityC0079h, android.app.Activity
    public void onStop() {
        super.onStop();
        m284s().mo198v();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m284s().mo271A(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0525a m283t = m283t();
        if (getWindow().hasFeature(0)) {
            if (m283t == null || !m283t.m294q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.support.p001v4.app.ActivityC0079h
    /* renamed from: r */
    public void mo285r() {
        m284s().mo213m();
    }

    /* renamed from: s */
    public AbstractC0531d m284s() {
        if (this.f2251p == null) {
            this.f2251p = AbstractC0531d.m276e(this, this);
        }
        return this.f2251p;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m284s().mo195x(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m284s().mo194y(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m284s().mo193z(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f2252q = i;
    }

    /* renamed from: t */
    public AbstractC0525a m283t() {
        return m284s().mo264k();
    }

    /* renamed from: u */
    public void m282u(C0062a0 c0062a0) {
        c0062a0.m2223b(this);
    }

    /* renamed from: v */
    public void m281v(C0062a0 c0062a0) {
    }

    @Deprecated
    /* renamed from: w */
    public void m280w() {
    }

    /* renamed from: x */
    public boolean m279x() {
        Intent mo286f = mo286f();
        if (mo286f != null) {
            if (!m287A(mo286f)) {
                m277z(mo286f);
                return true;
            }
            C0062a0 m2221d = C0062a0.m2221d(this);
            m282u(m2221d);
            m281v(m2221d);
            m2221d.m2220e();
            try {
                C0060a.m2227d(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void m277z(Intent intent) {
        C0126v.m1823e(this, intent);
    }
}
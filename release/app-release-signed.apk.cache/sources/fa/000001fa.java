package p016o;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.c */
/* loaded from: classes.dex */
public abstract class AbstractC0471c {

    /* renamed from: a */
    private final Context f2207a;

    /* renamed from: b */
    private InterfaceC0472a f2208b;

    /* renamed from: c */
    private InterfaceC0473b f2209c;

    /* renamed from: o.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0472a {
    }

    /* renamed from: o.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0473b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0471c(Context context) {
        this.f2207a = context;
    }

    /* renamed from: a */
    public boolean mo18a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo10b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo17c();

    /* renamed from: d */
    public View mo9d(MenuItem menuItem) {
        return mo17c();
    }

    /* renamed from: e */
    public boolean mo16e() {
        return false;
    }

    /* renamed from: f */
    public void mo15f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo8g() {
        return false;
    }

    /* renamed from: h */
    public void m458h() {
        this.f2209c = null;
        this.f2208b = null;
    }

    /* renamed from: i */
    public void m457i(InterfaceC0472a interfaceC0472a) {
        this.f2208b = interfaceC0472a;
    }

    /* renamed from: j */
    public void mo7j(InterfaceC0473b interfaceC0473b) {
        if (this.f2209c != null && interfaceC0473b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2209c = interfaceC0473b;
    }
}
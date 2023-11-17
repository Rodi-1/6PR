package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.a;
import android.support.v7.view.menu.j;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: b  reason: collision with root package name */
    private e f748b;

    /* renamed from: c  reason: collision with root package name */
    private android.support.v7.app.a f749c;

    /* renamed from: d  reason: collision with root package name */
    c f750d;

    /* renamed from: e  reason: collision with root package name */
    private j.a f751e;

    public f(e eVar) {
        this.f748b = eVar;
    }

    @Override // android.support.v7.view.menu.j.a
    public void a(e eVar, boolean z) {
        if (z || eVar == this.f748b) {
            c();
        }
        j.a aVar = this.f751e;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.f751e;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        android.support.v7.app.a aVar = this.f749c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f748b;
        a.C0007a c0007a = new a.C0007a(eVar.u());
        c cVar = new c(c0007a.b(), s.g.abc_list_menu_item_layout);
        this.f750d = cVar;
        cVar.j(this);
        this.f748b.b(this.f750d);
        c0007a.c(this.f750d.c(), this);
        View y = eVar.y();
        if (y != null) {
            c0007a.d(y);
        } else {
            c0007a.e(eVar.w()).g(eVar.x());
        }
        c0007a.f(this);
        android.support.v7.app.a a2 = c0007a.a();
        this.f749c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f749c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f749c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f748b.L((g) this.f750d.c().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f750d.a(this.f748b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f749c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f749c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f748b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f748b.performShortcut(i2, keyEvent, 0);
    }
}
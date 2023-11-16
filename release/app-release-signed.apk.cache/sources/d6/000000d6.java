package android.support.p002v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p002v7.app.DialogC0178a;
import android.support.p002v7.view.menu.InterfaceC0201j;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p020s.C0575g;

/* renamed from: android.support.v7.view.menu.f */
/* loaded from: classes.dex */
class DialogInterface$OnKeyListenerC0195f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0201j.InterfaceC0202a {

    /* renamed from: b */
    private C0192e f948b;

    /* renamed from: c */
    private DialogC0178a f949c;

    /* renamed from: d */
    C0189c f950d;

    /* renamed from: e */
    private InterfaceC0201j.InterfaceC0202a f951e;

    public DialogInterface$OnKeyListenerC0195f(C0192e c0192e) {
        this.f948b = c0192e;
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
    /* renamed from: a */
    public void mo184a(C0192e c0192e, boolean z) {
        if (z || c0192e == this.f948b) {
            m1604c();
        }
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f951e;
        if (interfaceC0202a != null) {
            interfaceC0202a.mo184a(c0192e, z);
        }
    }

    @Override // android.support.p002v7.view.menu.InterfaceC0201j.InterfaceC0202a
    /* renamed from: b */
    public boolean mo183b(C0192e c0192e) {
        InterfaceC0201j.InterfaceC0202a interfaceC0202a = this.f951e;
        if (interfaceC0202a != null) {
            return interfaceC0202a.mo183b(c0192e);
        }
        return false;
    }

    /* renamed from: c */
    public void m1604c() {
        DialogC0178a dialogC0178a = this.f949c;
        if (dialogC0178a != null) {
            dialogC0178a.dismiss();
        }
    }

    /* renamed from: d */
    public void m1603d(IBinder iBinder) {
        C0192e c0192e = this.f948b;
        DialogC0178a.C0179a c0179a = new DialogC0178a.C0179a(c0192e.m1610u());
        C0189c c0189c = new C0189c(c0179a.m1689b(), C0575g.abc_list_menu_item_layout);
        this.f950d = c0189c;
        c0189c.mo1554j(this);
        this.f948b.m1628b(this.f950d);
        c0179a.m1688c(this.f950d.m1659c(), this);
        View m1606y = c0192e.m1606y();
        if (m1606y != null) {
            c0179a.m1687d(m1606y);
        } else {
            c0179a.m1686e(c0192e.m1608w()).m1684g(c0192e.m1607x());
        }
        c0179a.m1685f(this);
        DialogC0178a m1690a = c0179a.m1690a();
        this.f949c = m1690a;
        m1690a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f949c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f949c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f948b.m1644L((C0196g) this.f950d.m1659c().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f950d.mo1347a(this.f948b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f949c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f949c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f948b.m1622e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f948b.performShortcut(i, keyEvent, 0);
    }
}
package p019r;

import android.content.Context;
import android.support.p002v7.view.menu.C0192e;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;
import p019r.C0541h;
import p019r.LayoutInflater$Factory2C0543i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.f */
/* loaded from: classes.dex */
public class C0535f extends C0541h {

    /* renamed from: r.f$a */
    /* loaded from: classes.dex */
    class C0536a extends C0541h.C0542a {
        C0536a(Window.Callback callback) {
            super(callback);
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0192e c0192e;
            LayoutInflater$Factory2C0543i.C0555j m228a0 = C0535f.this.m228a0(0, true);
            if (m228a0 == null || (c0192e = m228a0.f2337j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c0192e, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0535f(Context context, Window window, InterfaceC0530c interfaceC0530c) {
        super(context, window, interfaceC0530c);
    }

    @Override // p019r.C0541h, p019r.C0537g, p019r.AbstractC0532e
    /* renamed from: M */
    Window.Callback mo249M(Window.Callback callback) {
        return new C0536a(callback);
    }
}
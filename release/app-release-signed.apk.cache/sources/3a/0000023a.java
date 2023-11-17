package r;

import android.content.Context;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;
import r.h;
import r.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends h {

    /* loaded from: classes.dex */
    class a extends h.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // v.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            android.support.v7.view.menu.e eVar;
            i.j a0 = f.this.a0(0, true);
            if (a0 == null || (eVar = a0.f1790j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, Window window, c cVar) {
        super(context, window, cVar);
    }

    @Override // r.h, r.g, r.e
    Window.Callback M(Window.Callback callback) {
        return new a(callback);
    }
}
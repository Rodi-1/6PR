package r;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;
import r.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {
    private final UiModeManager Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        @Override // r.g.a, v.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // v.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (h.this.y0() && i2 == 0) ? a(callback) : super.onWindowStartingActionMode(callback, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.Z = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // r.g, r.e
    Window.Callback M(Window.Callback callback) {
        return new a(callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // r.g
    public int z0(int i2) {
        if (i2 == 0 && this.Z.getNightMode() == 0) {
            return -1;
        }
        return super.z0(i2);
    }
}
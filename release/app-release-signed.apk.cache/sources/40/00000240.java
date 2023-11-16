package p019r;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;
import p019r.C0537g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.h */
/* loaded from: classes.dex */
public class C0541h extends C0537g {

    /* renamed from: Z */
    private final UiModeManager f2288Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.h$a */
    /* loaded from: classes.dex */
    public class C0542a extends C0537g.C0538a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0542a(Window.Callback callback) {
            super(callback);
        }

        @Override // p019r.C0537g.C0538a, p023v.Window$CallbackC0597i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // p023v.Window$CallbackC0597i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (C0541h.this.m255y0() && i == 0) ? m254a(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0541h(Context context, Window window, InterfaceC0530c interfaceC0530c) {
        super(context, window, interfaceC0530c);
        this.f2288Z = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // p019r.C0537g, p019r.AbstractC0532e
    /* renamed from: M */
    Window.Callback mo249M(Window.Callback callback) {
        return new C0542a(callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p019r.C0537g
    /* renamed from: z0 */
    public int mo248z0(int i) {
        if (i == 0 && this.f2288Z.getNightMode() == 0) {
            return -1;
        }
        return super.mo248z0(i);
    }
}
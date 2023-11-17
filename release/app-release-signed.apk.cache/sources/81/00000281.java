package w;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import o.c;
import w.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends d {

    /* loaded from: classes.dex */
    class a extends d.a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        c.b f1988f;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // o.c
        public boolean b() {
            return this.f1983d.isVisible();
        }

        @Override // o.c
        public View d(MenuItem menuItem) {
            return this.f1983d.onCreateActionView(menuItem);
        }

        @Override // o.c
        public boolean g() {
            return this.f1983d.overridesItemVisibility();
        }

        @Override // o.c
        public void j(c.b bVar) {
            this.f1988f = bVar;
            this.f1983d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            c.b bVar = this.f1988f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, k.b bVar) {
        super(context, bVar);
    }

    @Override // w.d
    d.a h(ActionProvider actionProvider) {
        return new a(this.f1978b, actionProvider);
    }
}
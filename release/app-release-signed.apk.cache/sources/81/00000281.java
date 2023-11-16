package p024w;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p012k.InterfaceMenuItemC0423b;
import p016o.AbstractC0471c;
import p024w.MenuItemC0601d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.e */
/* loaded from: classes.dex */
public class C0606e extends MenuItemC0601d {

    /* renamed from: w.e$a */
    /* loaded from: classes.dex */
    class ActionProvider$VisibilityListenerC0607a extends MenuItemC0601d.C0602a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        AbstractC0471c.InterfaceC0473b f2740f;

        public ActionProvider$VisibilityListenerC0607a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: b */
        public boolean mo10b() {
            return this.f2735d.isVisible();
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: d */
        public View mo9d(MenuItem menuItem) {
            return this.f2735d.onCreateActionView(menuItem);
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: g */
        public boolean mo8g() {
            return this.f2735d.overridesItemVisibility();
        }

        @Override // p016o.AbstractC0471c
        /* renamed from: j */
        public void mo7j(AbstractC0471c.InterfaceC0473b interfaceC0473b) {
            this.f2740f = interfaceC0473b;
            this.f2735d.setVisibilityListener(interfaceC0473b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0471c.InterfaceC0473b interfaceC0473b = this.f2740f;
            if (interfaceC0473b != null) {
                interfaceC0473b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0606e(Context context, InterfaceMenuItemC0423b interfaceMenuItemC0423b) {
        super(context, interfaceMenuItemC0423b);
    }

    @Override // p024w.MenuItemC0601d
    /* renamed from: h */
    MenuItemC0601d.C0602a mo11h(ActionProvider actionProvider) {
        return new ActionProvider$VisibilityListenerC0607a(this.f2730b, actionProvider);
    }
}
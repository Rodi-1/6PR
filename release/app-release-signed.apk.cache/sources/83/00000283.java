package p024w;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p012k.InterfaceMenuC0422a;
import p012k.InterfaceMenuItemC0423b;
import p012k.InterfaceSubMenuC0424c;

/* renamed from: w.f */
/* loaded from: classes.dex */
public final class C0608f {
    /* renamed from: a */
    public static Menu m6a(Context context, InterfaceMenuC0422a interfaceMenuC0422a) {
        return new MenuC0609g(context, interfaceMenuC0422a);
    }

    /* renamed from: b */
    public static MenuItem m5b(Context context, InterfaceMenuItemC0423b interfaceMenuItemC0423b) {
        return new C0606e(context, interfaceMenuItemC0423b);
    }

    /* renamed from: c */
    public static SubMenu m4c(Context context, InterfaceSubMenuC0424c interfaceSubMenuC0424c) {
        return new SubMenuC0611i(context, interfaceSubMenuC0424c);
    }
}
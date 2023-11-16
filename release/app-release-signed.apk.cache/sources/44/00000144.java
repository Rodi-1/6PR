package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.view.menu.C0191d;
import android.support.p002v7.view.menu.C0192e;
import android.support.p002v7.view.menu.C0196g;
import android.support.p002v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.l0 */
/* loaded from: classes.dex */
public class C0290l0 extends C0275j0 implements InterfaceC0288k0 {

    /* renamed from: M */
    private static Method f1411M;

    /* renamed from: L */
    private InterfaceC0288k0 f1412L;

    /* renamed from: android.support.v7.widget.l0$a */
    /* loaded from: classes.dex */
    public static class C0291a extends C0260f0 {

        /* renamed from: p */
        final int f1413p;

        /* renamed from: q */
        final int f1414q;

        /* renamed from: r */
        private InterfaceC0288k0 f1415r;

        /* renamed from: s */
        private MenuItem f1416s;

        public C0291a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1413p = 21;
                this.f1414q = 22;
                return;
            }
            this.f1413p = 22;
            this.f1414q = 21;
        }

        @Override // android.support.p002v7.widget.C0260f0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ int mo1190e(int i, int i2, int i3, int i4, int i5) {
            return super.mo1190e(i, i2, i3, i4, i5);
        }

        @Override // android.support.p002v7.widget.C0260f0
        /* renamed from: f */
        public /* bridge */ /* synthetic */ boolean mo1189f(MotionEvent motionEvent, int i) {
            return super.mo1189f(motionEvent, i);
        }

        @Override // android.support.p002v7.widget.C0260f0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.p002v7.widget.C0260f0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.p002v7.widget.C0260f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.p002v7.widget.C0260f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.support.p002v7.widget.C0260f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1415r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0191d c0191d = (C0191d) adapter;
                C0196g c0196g = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0191d.getCount()) {
                    c0196g = c0191d.getItem(i2);
                }
                MenuItem menuItem = this.f1416s;
                if (menuItem != c0196g) {
                    C0192e m1654b = c0191d.m1654b();
                    if (menuItem != null) {
                        this.f1415r.mo1192b(m1654b, menuItem);
                    }
                    this.f1416s = c0196g;
                    if (c0196g != null) {
                        this.f1415r.mo1193a(m1654b, c0196g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1413p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1414q) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0191d) getAdapter()).m1654b().m1622e(false);
                return true;
            }
        }

        @Override // android.support.p002v7.widget.C0260f0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0288k0 interfaceC0288k0) {
            this.f1415r = interfaceC0288k0;
        }

        @Override // android.support.p002v7.widget.C0260f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f1411M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0290l0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: J */
    public void m1197J(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1360H.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: K */
    public void m1196K(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1360H.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: L */
    public void m1195L(InterfaceC0288k0 interfaceC0288k0) {
        this.f1412L = interfaceC0288k0;
    }

    /* renamed from: M */
    public void m1194M(boolean z) {
        Method method = f1411M;
        if (method != null) {
            try {
                method.invoke(this.f1360H, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.p002v7.widget.InterfaceC0288k0
    /* renamed from: a */
    public void mo1193a(C0192e c0192e, MenuItem menuItem) {
        InterfaceC0288k0 interfaceC0288k0 = this.f1412L;
        if (interfaceC0288k0 != null) {
            interfaceC0288k0.mo1193a(c0192e, menuItem);
        }
    }

    @Override // android.support.p002v7.widget.InterfaceC0288k0
    /* renamed from: b */
    public void mo1192b(C0192e c0192e, MenuItem menuItem) {
        InterfaceC0288k0 interfaceC0288k0 = this.f1412L;
        if (interfaceC0288k0 != null) {
            interfaceC0288k0.mo1192b(c0192e, menuItem);
        }
    }

    @Override // android.support.p002v7.widget.C0275j0
    /* renamed from: h */
    C0260f0 mo1191h(Context context, boolean z) {
        C0291a c0291a = new C0291a(context, z);
        c0291a.setHoverListener(this);
        return c0291a;
    }
}
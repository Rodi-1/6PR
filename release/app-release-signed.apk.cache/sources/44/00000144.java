package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ListMenuItemView;
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

/* loaded from: classes.dex */
public class l0 extends j0 implements k0 {
    private static Method M;
    private k0 L;

    /* loaded from: classes.dex */
    public static class a extends f0 {

        /* renamed from: p  reason: collision with root package name */
        final int f1109p;

        /* renamed from: q  reason: collision with root package name */
        final int f1110q;

        /* renamed from: r  reason: collision with root package name */
        private k0 f1111r;

        /* renamed from: s  reason: collision with root package name */
        private MenuItem f1112s;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1109p = 21;
                this.f1110q = 22;
                return;
            }
            this.f1109p = 22;
            this.f1110q = 21;
        }

        @Override // android.support.v7.widget.f0
        public /* bridge */ /* synthetic */ int e(int i2, int i3, int i4, int i5, int i6) {
            return super.e(i2, i3, i4, i5, i6);
        }

        @Override // android.support.v7.widget.f0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i2) {
            return super.f(motionEvent, i2);
        }

        @Override // android.support.v7.widget.f0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.v7.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.v7.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.v7.widget.f0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.support.v7.widget.f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            int pointToPosition;
            int i3;
            if (this.f1111r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                }
                android.support.v7.view.menu.d dVar = (android.support.v7.view.menu.d) adapter;
                android.support.v7.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < dVar.getCount()) {
                    gVar = dVar.getItem(i3);
                }
                MenuItem menuItem = this.f1112s;
                if (menuItem != gVar) {
                    android.support.v7.view.menu.e b2 = dVar.b();
                    if (menuItem != null) {
                        this.f1111r.b(b2, menuItem);
                    }
                    this.f1112s = gVar;
                    if (gVar != null) {
                        this.f1111r.a(b2, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1109p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.f1110q) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ((android.support.v7.view.menu.d) getAdapter()).b().e(false);
                return true;
            }
        }

        @Override // android.support.v7.widget.f0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(k0 k0Var) {
            this.f1111r = k0Var;
        }

        @Override // android.support.v7.widget.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void J(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.setEnterTransition((Transition) obj);
        }
    }

    public void K(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.H.setExitTransition((Transition) obj);
        }
    }

    public void L(k0 k0Var) {
        this.L = k0Var;
    }

    public void M(boolean z) {
        Method method = M;
        if (method != null) {
            try {
                method.invoke(this.H, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.v7.widget.k0
    public void a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.a(eVar, menuItem);
        }
    }

    @Override // android.support.v7.widget.k0
    public void b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.b(eVar, menuItem);
        }
    }

    @Override // android.support.v7.widget.j0
    f0 h(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final C0022b f1684b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f1685c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    final View.AccessibilityDelegate f1686a = f1684b.b(this);

    /* loaded from: classes.dex */
    static class a extends C0022b {

        /* renamed from: o.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0021a extends View.AccessibilityDelegate {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f1687a;

            C0021a(b bVar) {
                this.f1687a = bVar;
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return this.f1687a.a(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                p.b b2 = this.f1687a.b(view);
                if (b2 != null) {
                    return (AccessibilityNodeProvider) b2.a();
                }
                return null;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.f1687a.d(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                this.f1687a.e(view, p.a.x(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.f1687a.f(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return this.f1687a.g(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                return this.f1687a.h(view, i2, bundle);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i2) {
                this.f1687a.i(view, i2);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                this.f1687a.j(view, accessibilityEvent);
            }
        }

        a() {
        }

        @Override // o.b.C0022b
        public p.b a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new p.b(accessibilityNodeProvider);
            }
            return null;
        }

        @Override // o.b.C0022b
        public View.AccessibilityDelegate b(b bVar) {
            return new C0021a(bVar);
        }

        @Override // o.b.C0022b
        public boolean c(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022b {
        C0022b() {
        }

        public p.b a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            throw null;
        }

        public View.AccessibilityDelegate b(b bVar) {
            throw null;
        }

        public boolean c(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
            throw null;
        }
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return f1685c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public p.b b(View view) {
        return f1684b.a(f1685c, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate c() {
        return this.f1686a;
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        f1685c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, p.a aVar) {
        f1685c.onInitializeAccessibilityNodeInfo(view, aVar.w());
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        f1685c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1685c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int i2, Bundle bundle) {
        return f1684b.c(f1685c, view, i2, bundle);
    }

    public void i(View view, int i2) {
        f1685c.sendAccessibilityEvent(view, i2);
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        f1685c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
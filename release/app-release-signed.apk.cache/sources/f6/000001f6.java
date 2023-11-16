package p016o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import p017p.C0518a;
import p017p.C0519b;

/* renamed from: o.b */
/* loaded from: classes.dex */
public class C0467b {

    /* renamed from: b */
    private static final C0470b f2202b = new C0468a();

    /* renamed from: c */
    private static final View.AccessibilityDelegate f2203c = new View.AccessibilityDelegate();

    /* renamed from: a */
    final View.AccessibilityDelegate f2204a = f2202b.mo460b(this);

    /* renamed from: o.b$a */
    /* loaded from: classes.dex */
    static class C0468a extends C0470b {

        /* renamed from: o.b$a$a */
        /* loaded from: classes.dex */
        class C0469a extends View.AccessibilityDelegate {

            /* renamed from: a */
            final /* synthetic */ C0467b f2205a;

            C0469a(C0467b c0467b) {
                this.f2205a = c0467b;
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return this.f2205a.m471a(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                C0519b m470b = this.f2205a.m470b(view);
                if (m470b != null) {
                    return (AccessibilityNodeProvider) m470b.m301a();
                }
                return null;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.f2205a.mo468d(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                this.f2205a.mo467e(view, C0518a.m302x(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                this.f2205a.m466f(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return this.f2205a.m465g(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return this.f2205a.mo464h(view, i, bundle);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i) {
                this.f2205a.m463i(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                this.f2205a.m462j(view, accessibilityEvent);
            }
        }

        C0468a() {
        }

        @Override // p016o.C0467b.C0470b
        /* renamed from: a */
        public C0519b mo461a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0519b(accessibilityNodeProvider);
            }
            return null;
        }

        @Override // p016o.C0467b.C0470b
        /* renamed from: b */
        public View.AccessibilityDelegate mo460b(C0467b c0467b) {
            return new C0469a(c0467b);
        }

        @Override // p016o.C0467b.C0470b
        /* renamed from: c */
        public boolean mo459c(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.b$b */
    /* loaded from: classes.dex */
    public static class C0470b {
        C0470b() {
        }

        /* renamed from: a */
        public C0519b mo461a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            throw null;
        }

        /* renamed from: b */
        public View.AccessibilityDelegate mo460b(C0467b c0467b) {
            throw null;
        }

        /* renamed from: c */
        public boolean mo459c(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            throw null;
        }
    }

    /* renamed from: a */
    public boolean m471a(View view, AccessibilityEvent accessibilityEvent) {
        return f2203c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0519b m470b(View view) {
        return f2202b.mo461a(f2203c, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public View.AccessibilityDelegate m469c() {
        return this.f2204a;
    }

    /* renamed from: d */
    public void mo468d(View view, AccessibilityEvent accessibilityEvent) {
        f2203c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: e */
    public void mo467e(View view, C0518a c0518a) {
        f2203c.onInitializeAccessibilityNodeInfo(view, c0518a.m303w());
    }

    /* renamed from: f */
    public void m466f(View view, AccessibilityEvent accessibilityEvent) {
        f2203c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean m465g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f2203c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: h */
    public boolean mo464h(View view, int i, Bundle bundle) {
        return f2202b.mo459c(f2203c, view, i, bundle);
    }

    /* renamed from: i */
    public void m463i(View view, int i) {
        f2203c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: j */
    public void m462j(View view, AccessibilityEvent accessibilityEvent) {
        f2203c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
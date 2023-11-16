package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.AbstractC0009c;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.k */
/* loaded from: classes.dex */
public class FragmentC0021k extends Fragment {

    /* renamed from: b */
    private InterfaceC0022a f45b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.k$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0022a {
        /* renamed from: a */
        void m2357a();

        /* renamed from: b */
        void m2356b();

        /* renamed from: c */
        void m2355c();
    }

    /* renamed from: a */
    private void m2362a(AbstractC0009c.EnumC0010a enumC0010a) {
        Activity activity = getActivity();
        if (activity instanceof InterfaceC0017g) {
            ((InterfaceC0017g) activity).mo1819a().m2373g(enumC0010a);
        } else if (activity instanceof InterfaceC0013e) {
            AbstractC0009c mo1819a = ((InterfaceC0013e) activity).mo1819a();
            if (mo1819a instanceof C0014f) {
                ((C0014f) mo1819a).m2373g(enumC0010a);
            }
        }
    }

    /* renamed from: b */
    private void m2361b(InterfaceC0022a interfaceC0022a) {
        if (interfaceC0022a != null) {
            interfaceC0022a.m2357a();
        }
    }

    /* renamed from: c */
    private void m2360c(InterfaceC0022a interfaceC0022a) {
        if (interfaceC0022a != null) {
            interfaceC0022a.m2356b();
        }
    }

    /* renamed from: d */
    private void m2359d(InterfaceC0022a interfaceC0022a) {
        if (interfaceC0022a != null) {
            interfaceC0022a.m2355c();
        }
    }

    /* renamed from: e */
    public static void m2358e(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0021k(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2361b(this.f45b);
        m2362a(AbstractC0009c.EnumC0010a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m2362a(AbstractC0009c.EnumC0010a.ON_DESTROY);
        this.f45b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m2362a(AbstractC0009c.EnumC0010a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m2360c(this.f45b);
        m2362a(AbstractC0009c.EnumC0010a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m2359d(this.f45b);
        m2362a(AbstractC0009c.EnumC0010a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m2362a(AbstractC0009c.EnumC0010a.ON_STOP);
    }
}
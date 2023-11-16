package android.support.p001v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.s */
/* loaded from: classes.dex */
class C0116s extends AbstractC0121t {

    /* renamed from: android.support.v4.app.s$a */
    /* loaded from: classes.dex */
    class C0117a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f592a;

        C0117a(Rect rect) {
            this.f592a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f592a;
        }
    }

    /* renamed from: android.support.v4.app.s$b */
    /* loaded from: classes.dex */
    class C0118b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f594a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f595b;

        C0118b(View view, ArrayList arrayList) {
            this.f594a = view;
            this.f595b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f594a.setVisibility(8);
            int size = this.f595b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f595b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: android.support.v4.app.s$c */
    /* loaded from: classes.dex */
    class C0119c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f597a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f598b;

        /* renamed from: c */
        final /* synthetic */ Object f599c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f600d;

        /* renamed from: e */
        final /* synthetic */ Object f601e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f602f;

        C0119c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f597a = obj;
            this.f598b = arrayList;
            this.f599c = obj2;
            this.f600d = arrayList2;
            this.f601e = obj3;
            this.f602f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f597a;
            if (obj != null) {
                C0116s.this.mo1840q(obj, this.f598b, null);
            }
            Object obj2 = this.f599c;
            if (obj2 != null) {
                C0116s.this.mo1840q(obj2, this.f600d, null);
            }
            Object obj3 = this.f601e;
            if (obj3 != null) {
                C0116s.this.mo1840q(obj3, this.f602f, null);
            }
        }
    }

    /* renamed from: android.support.v4.app.s$d */
    /* loaded from: classes.dex */
    class C0120d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f604a;

        C0120d(Rect rect) {
            this.f604a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f604a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f604a;
        }
    }

    /* renamed from: B */
    private static boolean m1858B(Transition transition) {
        return (AbstractC0121t.m1845l(transition.getTargetIds()) && AbstractC0121t.m1845l(transition.getTargetNames()) && AbstractC0121t.m1845l(transition.getTargetTypes())) ? false : true;
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: A */
    public Object mo1857A(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: a */
    public void mo1856a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: b */
    public void mo1855b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1855b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (m1858B(transition) || !AbstractC0121t.m1845l(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: c */
    public void mo1854c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: e */
    public boolean mo1852e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: g */
    public Object mo1850g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: m */
    public Object mo1844m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: n */
    public Object mo1843n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: p */
    public void mo1841p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: q */
    public void mo1840q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1840q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m1858B(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: r */
    public void mo1839r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0118b(view, arrayList));
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: t */
    public void mo1837t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0119c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: u */
    public void mo1836u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0120d(rect));
        }
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: v */
    public void mo1835v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1846k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0117a(rect));
        }
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: y */
    public void mo1832y(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0121t.m1853d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1855b(transitionSet, arrayList);
    }

    @Override // android.support.p001v4.app.AbstractC0121t
    /* renamed from: z */
    public void mo1831z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo1840q(transitionSet, arrayList, arrayList2);
        }
    }
}
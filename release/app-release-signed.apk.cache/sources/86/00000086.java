package android.support.p001v4.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p016o.C0490o;
import p016o.C0503q;

/* renamed from: android.support.v4.app.t */
/* loaded from: classes.dex */
public abstract class AbstractC0121t {

    /* renamed from: android.support.v4.app.t$a */
    /* loaded from: classes.dex */
    class RunnableC0122a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f606b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f607c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f608d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f609e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f610f;

        RunnableC0122a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f606b = i;
            this.f607c = arrayList;
            this.f608d = arrayList2;
            this.f609e = arrayList3;
            this.f610f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f606b; i++) {
                C0490o.m388x((View) this.f607c.get(i), (String) this.f608d.get(i));
                C0490o.m388x((View) this.f609e.get(i), (String) this.f610f.get(i));
            }
        }
    }

    /* renamed from: android.support.v4.app.t$b */
    /* loaded from: classes.dex */
    class RunnableC0123b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f612b;

        /* renamed from: c */
        final /* synthetic */ Map f613c;

        RunnableC0123b(ArrayList arrayList, Map map) {
            this.f612b = arrayList;
            this.f613c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f612b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f612b.get(i);
                String m406f = C0490o.m406f(view);
                if (m406f != null) {
                    C0490o.m388x(view, AbstractC0121t.m1848i(this.f613c, m406f));
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.t$c */
    /* loaded from: classes.dex */
    class RunnableC0124c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f615b;

        /* renamed from: c */
        final /* synthetic */ Map f616c;

        RunnableC0124c(ArrayList arrayList, Map map) {
            this.f615b = arrayList;
            this.f616c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f615b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f615b.get(i);
                C0490o.m388x(view, (String) this.f616c.get(C0490o.m406f(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m1853d(List<View> list, View view) {
        int size = list.size();
        if (m1849h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m1849h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m1849h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m1848i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m1845l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract Object mo1857A(Object obj);

    /* renamed from: a */
    public abstract void mo1856a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1855b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo1854c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1852e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1851f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean m360a = C0503q.m360a(viewGroup2);
                viewGroup = viewGroup2;
                if (!m360a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m1851f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo1850g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1847j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m406f = C0490o.m406f(view);
            if (m406f != null) {
                map.put(m406f, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1847j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m1846k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: m */
    public abstract Object mo1844m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo1843n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m1842o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0490o.m406f(view));
            C0490o.m388x(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo1841p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo1840q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo1839r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1838s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(viewGroup, new RunnableC0124c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo1837t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo1836u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo1835v(Object obj, View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m1834w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(view, new RunnableC0123b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m1833x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m406f = C0490o.m406f(view2);
            arrayList4.add(m406f);
            if (m406f != null) {
                C0490o.m388x(view2, null);
                String str = map.get(m406f);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0490o.m388x(arrayList2.get(i2), m406f);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC0127w.m1821a(view, new RunnableC0122a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: y */
    public abstract void mo1832y(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: z */
    public abstract void mo1831z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
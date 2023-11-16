package p019r;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.p002v7.widget.C0240a0;
import android.support.p002v7.widget.C0257e;
import android.support.p002v7.widget.C0264g;
import android.support.p002v7.widget.C0267h;
import android.support.p002v7.widget.C0271i;
import android.support.p002v7.widget.C0289l;
import android.support.p002v7.widget.C0294n;
import android.support.p002v7.widget.C0302p;
import android.support.p002v7.widget.C0305q;
import android.support.p002v7.widget.C0310s0;
import android.support.p002v7.widget.C0311t;
import android.support.p002v7.widget.C0313u;
import android.support.p002v7.widget.C0315v;
import android.support.p002v7.widget.C0321x;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p015n.C0445a;
import p016o.C0490o;
import p020s.C0578j;
import p023v.C0588d;

/* renamed from: r.k */
/* loaded from: classes.dex */
public class C0558k {

    /* renamed from: b */
    private static final Class<?>[] f2349b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f2350c = {16843375};

    /* renamed from: d */
    private static final String[] f2351d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final Map<String, Constructor<? extends View>> f2352e = new C0445a();

    /* renamed from: a */
    private final Object[] f2353a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.k$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC0559a implements View.OnClickListener {

        /* renamed from: b */
        private final View f2354b;

        /* renamed from: c */
        private final String f2355c;

        /* renamed from: d */
        private Method f2356d;

        /* renamed from: e */
        private Context f2357e;

        public View$OnClickListenerC0559a(View view, String str) {
            this.f2354b = view;
            this.f2355c = str;
        }

        /* renamed from: a */
        private void m156a(Context context, String str) {
            int id;
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2355c, View.class)) != null) {
                        this.f2356d = method;
                        this.f2357e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f2354b.getId() == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f2354b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2355c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2354b.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2356d == null) {
                m156a(this.f2354b.getContext(), this.f2355c);
            }
            try {
                this.f2356d.invoke(this.f2357e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m176a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C0490o.m404h(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2350c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC0559a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: q */
    private View m160q(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = f2352e;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f2349b);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f2353a);
    }

    /* renamed from: r */
    private View m159r(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f2353a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m160q(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f2351d;
                if (i >= strArr.length) {
                    return null;
                }
                View m160q = m160q(context, str, strArr[i]);
                if (m160q != null) {
                    return m160q;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f2353a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: s */
    private static Context m158s(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2488Q2, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0578j.f2492R2, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0578j.f2496S2, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0588d) && ((C0588d) context).getThemeResId() == resourceId) ? context : new C0588d(context, resourceId) : context;
    }

    /* renamed from: t */
    private void m157t(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    protected C0257e m175b(Context context, AttributeSet attributeSet) {
        return new C0257e(context, attributeSet);
    }

    /* renamed from: c */
    protected C0264g m174c(Context context, AttributeSet attributeSet) {
        return new C0264g(context, attributeSet);
    }

    /* renamed from: d */
    protected C0267h m173d(Context context, AttributeSet attributeSet) {
        return new C0267h(context, attributeSet);
    }

    /* renamed from: e */
    protected C0271i m172e(Context context, AttributeSet attributeSet) {
        return new C0271i(context, attributeSet);
    }

    /* renamed from: f */
    protected C0289l m171f(Context context, AttributeSet attributeSet) {
        return new C0289l(context, attributeSet);
    }

    /* renamed from: g */
    protected C0294n m170g(Context context, AttributeSet attributeSet) {
        return new C0294n(context, attributeSet);
    }

    /* renamed from: h */
    protected C0302p m169h(Context context, AttributeSet attributeSet) {
        return new C0302p(context, attributeSet);
    }

    /* renamed from: i */
    protected C0305q m168i(Context context, AttributeSet attributeSet) {
        return new C0305q(context, attributeSet);
    }

    /* renamed from: j */
    protected C0311t m167j(Context context, AttributeSet attributeSet) {
        return new C0311t(context, attributeSet);
    }

    /* renamed from: k */
    protected C0313u m166k(Context context, AttributeSet attributeSet) {
        return new C0313u(context, attributeSet);
    }

    /* renamed from: l */
    protected C0315v m165l(Context context, AttributeSet attributeSet) {
        return new C0315v(context, attributeSet);
    }

    /* renamed from: m */
    protected C0321x m164m(Context context, AttributeSet attributeSet) {
        return new C0321x(context, attributeSet);
    }

    /* renamed from: n */
    protected C0240a0 m163n(Context context, AttributeSet attributeSet) {
        return new C0240a0(context, attributeSet);
    }

    /* renamed from: o */
    protected View m162o(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final View m161p(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View m166k;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m158s(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0310s0.m1129b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\b';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = '\n';
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 11;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m166k = m166k(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 1:
                m166k = m172e(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 2:
                m166k = m168i(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 3:
                m166k = m163n(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 4:
                m166k = m170g(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 5:
                m166k = m165l(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 6:
                m166k = m164m(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 7:
                m166k = m167j(context2, attributeSet);
                m157t(m166k, str);
                break;
            case '\b':
                m166k = m169h(context2, attributeSet);
                m157t(m166k, str);
                break;
            case '\t':
                m166k = m175b(context2, attributeSet);
                m157t(m166k, str);
                break;
            case '\n':
                m166k = m173d(context2, attributeSet);
                m157t(m166k, str);
                break;
            case 11:
                m166k = m171f(context2, attributeSet);
                m157t(m166k, str);
                break;
            case '\f':
                m166k = m174c(context2, attributeSet);
                m157t(m166k, str);
                break;
            default:
                m166k = m162o(context2, str, attributeSet);
                break;
        }
        if (m166k == null && context != context2) {
            m166k = m159r(context2, str, attributeSet);
        }
        if (m166k != null) {
            m176a(m166k, attributeSet);
        }
        return m166k;
    }
}
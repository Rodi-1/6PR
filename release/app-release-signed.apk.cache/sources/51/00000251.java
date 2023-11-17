package r;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.v7.widget.a0;
import android.support.v7.widget.p;
import android.support.v7.widget.q;
import android.support.v7.widget.s0;
import android.support.v7.widget.t;
import android.support.v7.widget.u;
import android.support.v7.widget.v;
import android.support.v7.widget.x;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f1802b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1803c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f1804d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Constructor<? extends View>> f1805e = new n.a();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1806a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final View f1807b;

        /* renamed from: c  reason: collision with root package name */
        private final String f1808c;

        /* renamed from: d  reason: collision with root package name */
        private Method f1809d;

        /* renamed from: e  reason: collision with root package name */
        private Context f1810e;

        public a(View view, String str) {
            this.f1807b = view;
            this.f1808c = str;
        }

        private void a(Context context, String str) {
            int id;
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1808c, View.class)) != null) {
                        this.f1809d = method;
                        this.f1810e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f1807b.getId() == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f1807b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1808c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1807b.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1809d == null) {
                a(this.f1807b.getContext(), this.f1808c);
            }
            try {
                this.f1809d.invoke(this.f1810e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && o.o.h(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1803c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View q(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = f1805e;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1802b);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1806a);
    }

    private View r(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f1806a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return q(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f1804d;
                if (i2 >= strArr.length) {
                    return null;
                }
                View q2 = q(context, str, strArr[i2]);
                if (q2 != null) {
                    return q2;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f1806a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context s(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.Q2, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(s.j.R2, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(s.j.S2, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof v.d) && ((v.d) context).getThemeResId() == resourceId) ? context : new v.d(context, resourceId) : context;
    }

    private void t(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected android.support.v7.widget.e b(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.e(context, attributeSet);
    }

    protected android.support.v7.widget.g c(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.g(context, attributeSet);
    }

    protected android.support.v7.widget.h d(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.h(context, attributeSet);
    }

    protected android.support.v7.widget.i e(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.i(context, attributeSet);
    }

    protected android.support.v7.widget.l f(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.l(context, attributeSet);
    }

    protected android.support.v7.widget.n g(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.n(context, attributeSet);
    }

    protected p h(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected q i(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    protected t j(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected u k(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected v l(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    protected a0 n(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    protected View o(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View p(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View k2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = s(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = s0.b(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = 11;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\f';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                k2 = k(context2, attributeSet);
                t(k2, str);
                break;
            case 1:
                k2 = e(context2, attributeSet);
                t(k2, str);
                break;
            case 2:
                k2 = i(context2, attributeSet);
                t(k2, str);
                break;
            case 3:
                k2 = n(context2, attributeSet);
                t(k2, str);
                break;
            case 4:
                k2 = g(context2, attributeSet);
                t(k2, str);
                break;
            case 5:
                k2 = l(context2, attributeSet);
                t(k2, str);
                break;
            case 6:
                k2 = m(context2, attributeSet);
                t(k2, str);
                break;
            case 7:
                k2 = j(context2, attributeSet);
                t(k2, str);
                break;
            case '\b':
                k2 = h(context2, attributeSet);
                t(k2, str);
                break;
            case '\t':
                k2 = b(context2, attributeSet);
                t(k2, str);
                break;
            case '\n':
                k2 = d(context2, attributeSet);
                t(k2, str);
                break;
            case 11:
                k2 = f(context2, attributeSet);
                t(k2, str);
                break;
            case '\f':
                k2 = c(context2, attributeSet);
                t(k2, str);
                break;
            default:
                k2 = o(context2, str, attributeSet);
                break;
        }
        if (k2 == null && context != context2) {
            k2 = r(context2, str, attributeSet);
        }
        if (k2 != null) {
            a(k2, attributeSet);
        }
        return k2;
    }
}
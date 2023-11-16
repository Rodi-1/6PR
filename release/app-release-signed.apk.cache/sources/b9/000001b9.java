package p010i;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i.g */
/* loaded from: classes.dex */
public class C0407g extends C0406f {
    @Override // p010i.C0406f
    /* renamed from: l */
    protected Typeface mo655l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2046a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2052g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p010i.C0406f
    /* renamed from: s */
    protected Method mo654s(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
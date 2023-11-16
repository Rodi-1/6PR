package p009h;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: h.c */
/* loaded from: classes.dex */
public class C0397c {
    /* renamed from: a */
    public static boolean m705a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m699g(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m704b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m699g(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static float m703c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m699g(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: d */
    public static int m702d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m699g(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: e */
    public static int m701e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m699g(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: f */
    public static String m700f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m699g(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m699g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: h */
    public static TypedArray m698h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: i */
    public static TypedValue m697i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m699g(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
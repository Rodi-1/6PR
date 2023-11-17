package h;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class c {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, boolean z) {
        return !g(xmlPullParser, str) ? z : typedArray.getBoolean(i2, z);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !g(xmlPullParser, str) ? i3 : typedArray.getColor(i2, i3);
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f2) {
        return !g(xmlPullParser, str) ? f2 : typedArray.getFloat(i2, f2);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !g(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    public static int e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !g(xmlPullParser, str) ? i3 : typedArray.getResourceId(i2, i3);
    }

    public static String f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (g(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (g(xmlPullParser, str)) {
            return typedArray.peekValue(i2);
        }
        return null;
    }
}
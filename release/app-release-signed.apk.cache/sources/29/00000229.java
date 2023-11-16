package p017p;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import p005d.C0349c;

/* renamed from: p.a */
/* loaded from: classes.dex */
public class C0518a {

    /* renamed from: a */
    private final AccessibilityNodeInfo f2242a;

    /* renamed from: b */
    public int f2243b = -1;

    private C0518a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2242a = accessibilityNodeInfo;
    }

    /* renamed from: b */
    private static String m324b(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case C0349c.f1644G /* 32 */:
                        return "ACTION_LONG_CLICK";
                    case C0349c.f1735q1 /* 64 */:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    default:
                        return "ACTION_UNKNOWN";
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: x */
    public static C0518a m302x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0518a(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public void m325a(int i) {
        this.f2242a.addAction(i);
    }

    /* renamed from: c */
    public int m323c() {
        return this.f2242a.getActions();
    }

    /* renamed from: d */
    public void m322d(Rect rect) {
        this.f2242a.getBoundsInParent(rect);
    }

    /* renamed from: e */
    public void m321e(Rect rect) {
        this.f2242a.getBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2242a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = ((C0518a) obj).f2242a;
            if (accessibilityNodeInfo == null) {
                if (accessibilityNodeInfo2 != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public CharSequence m320f() {
        return this.f2242a.getClassName();
    }

    /* renamed from: g */
    public CharSequence m319g() {
        return this.f2242a.getContentDescription();
    }

    /* renamed from: h */
    public CharSequence m318h() {
        return this.f2242a.getPackageName();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2242a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public CharSequence m317i() {
        return this.f2242a.getText();
    }

    /* renamed from: j */
    public String m316j() {
        return this.f2242a.getViewIdResourceName();
    }

    /* renamed from: k */
    public boolean m315k() {
        return this.f2242a.isCheckable();
    }

    /* renamed from: l */
    public boolean m314l() {
        return this.f2242a.isChecked();
    }

    /* renamed from: m */
    public boolean m313m() {
        return this.f2242a.isClickable();
    }

    /* renamed from: n */
    public boolean m312n() {
        return this.f2242a.isEnabled();
    }

    /* renamed from: o */
    public boolean m311o() {
        return this.f2242a.isFocusable();
    }

    /* renamed from: p */
    public boolean m310p() {
        return this.f2242a.isFocused();
    }

    /* renamed from: q */
    public boolean m309q() {
        return this.f2242a.isLongClickable();
    }

    /* renamed from: r */
    public boolean m308r() {
        return this.f2242a.isPassword();
    }

    /* renamed from: s */
    public boolean m307s() {
        return this.f2242a.isScrollable();
    }

    /* renamed from: t */
    public boolean m306t() {
        return this.f2242a.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m322d(rect);
        sb.append("; boundsInParent: " + rect);
        m321e(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m318h());
        sb.append("; className: ");
        sb.append(m320f());
        sb.append("; text: ");
        sb.append(m317i());
        sb.append("; contentDescription: ");
        sb.append(m319g());
        sb.append("; viewId: ");
        sb.append(m316j());
        sb.append("; checkable: ");
        sb.append(m315k());
        sb.append("; checked: ");
        sb.append(m314l());
        sb.append("; focusable: ");
        sb.append(m311o());
        sb.append("; focused: ");
        sb.append(m310p());
        sb.append("; selected: ");
        sb.append(m306t());
        sb.append("; clickable: ");
        sb.append(m313m());
        sb.append("; longClickable: ");
        sb.append(m309q());
        sb.append("; enabled: ");
        sb.append(m312n());
        sb.append("; password: ");
        sb.append(m308r());
        sb.append("; scrollable: " + m307s());
        sb.append("; [");
        int m323c = m323c();
        while (m323c != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m323c);
            m323c &= numberOfTrailingZeros ^ (-1);
            sb.append(m324b(numberOfTrailingZeros));
            if (m323c != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public void m305u(CharSequence charSequence) {
        this.f2242a.setClassName(charSequence);
    }

    /* renamed from: v */
    public void m304v(boolean z) {
        this.f2242a.setScrollable(z);
    }

    /* renamed from: w */
    public AccessibilityNodeInfo m303w() {
        return this.f2242a;
    }
}
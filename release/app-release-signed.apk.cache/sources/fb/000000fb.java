package android.support.p002v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.widget.AbstractC0143d;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p016o.AbstractC0464a;
import p020s.C0569a;
import p020s.C0572d;
import p023v.InterfaceC0587c;

/* renamed from: android.support.v7.widget.SearchView */
/* loaded from: classes.dex */
public class SearchView extends C0272i0 implements InterfaceC0587c {

    /* renamed from: i0 */
    static final C0222a f1113i0 = new C0222a();

    /* renamed from: A */
    private int[] f1114A;

    /* renamed from: B */
    private int[] f1115B;

    /* renamed from: C */
    private final ImageView f1116C;

    /* renamed from: D */
    private final Drawable f1117D;

    /* renamed from: E */
    private final int f1118E;

    /* renamed from: F */
    private final int f1119F;

    /* renamed from: G */
    private final Intent f1120G;

    /* renamed from: H */
    private final Intent f1121H;

    /* renamed from: I */
    private final CharSequence f1122I;

    /* renamed from: J */
    private InterfaceC0224c f1123J;

    /* renamed from: K */
    private InterfaceC0223b f1124K;

    /* renamed from: L */
    View.OnFocusChangeListener f1125L;

    /* renamed from: M */
    private InterfaceC0225d f1126M;

    /* renamed from: N */
    private View.OnClickListener f1127N;

    /* renamed from: O */
    private boolean f1128O;

    /* renamed from: P */
    private boolean f1129P;

    /* renamed from: Q */
    AbstractC0143d f1130Q;

    /* renamed from: R */
    private boolean f1131R;

    /* renamed from: S */
    private CharSequence f1132S;

    /* renamed from: T */
    private boolean f1133T;

    /* renamed from: U */
    private boolean f1134U;

    /* renamed from: V */
    private int f1135V;

    /* renamed from: W */
    private boolean f1136W;

    /* renamed from: a0 */
    private CharSequence f1137a0;

    /* renamed from: b0 */
    private boolean f1138b0;

    /* renamed from: c0 */
    private int f1139c0;

    /* renamed from: d0 */
    SearchableInfo f1140d0;

    /* renamed from: e0 */
    private Bundle f1141e0;

    /* renamed from: f0 */
    private final Runnable f1142f0;

    /* renamed from: g0 */
    private Runnable f1143g0;

    /* renamed from: h0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1144h0;

    /* renamed from: q */
    final SearchAutoComplete f1145q;

    /* renamed from: r */
    private final View f1146r;

    /* renamed from: s */
    private final View f1147s;

    /* renamed from: t */
    final ImageView f1148t;

    /* renamed from: u */
    final ImageView f1149u;

    /* renamed from: v */
    final ImageView f1150v;

    /* renamed from: w */
    final ImageView f1151w;

    /* renamed from: x */
    private C0228f f1152x;

    /* renamed from: y */
    private Rect f1153y;

    /* renamed from: z */
    private Rect f1154z;

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0257e {

        /* renamed from: e */
        private int f1155e;

        /* renamed from: f */
        private SearchView f1156f;

        /* renamed from: g */
        private boolean f1157g;

        /* renamed from: h */
        final Runnable f1158h;

        /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0221a implements Runnable {
            RunnableC0221a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m1462c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0569a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1158h = new RunnableC0221a();
            this.f1155e = getThreshold();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m1462c() {
            if (this.f1157g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1157g = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1157g = false;
                removeCallbacks(this.f1158h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f1157g = true;
            } else {
                this.f1157g = false;
                removeCallbacks(this.f1158h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1155e <= 0 || super.enoughToFilter();
        }

        @Override // android.support.p002v7.widget.C0257e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1157g) {
                removeCallbacks(this.f1158h);
                post(this.f1158h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1156f.m1475N();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1156f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1156f.hasFocus() && getVisibility() == 0) {
                this.f1157g = true;
                if (SearchView.m1482G(getContext())) {
                    SearchView.f1113i0.m1459c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setSearchView(SearchView searchView) {
            this.f1156f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1155e = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.SearchView$a */
    /* loaded from: classes.dex */
    public static class C0222a {

        /* renamed from: a */
        private Method f1160a;

        /* renamed from: b */
        private Method f1161b;

        /* renamed from: c */
        private Method f1162c;

        C0222a() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1160a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1161b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1162c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        void m1461a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1161b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m1460b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1160a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m1459c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f1162c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0223b {
        /* renamed from: a */
        boolean m1458a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0224c {
        /* renamed from: a */
        boolean m1457a(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0225d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.SearchView$e */
    /* loaded from: classes.dex */
    public static class C0226e extends AbstractC0464a {
        public static final Parcelable.Creator<C0226e> CREATOR = new C0227a();

        /* renamed from: d */
        boolean f1163d;

        /* renamed from: android.support.v7.widget.SearchView$e$a */
        /* loaded from: classes.dex */
        static class C0227a implements Parcelable.ClassLoaderCreator<C0226e> {
            C0227a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0226e createFromParcel(Parcel parcel) {
                return new C0226e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0226e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0226e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0226e[] newArray(int i) {
                return new C0226e[i];
            }
        }

        public C0226e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1163d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0226e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1163d + "}";
        }

        @Override // p016o.AbstractC0464a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1163d));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    /* loaded from: classes.dex */
    private static class C0228f extends TouchDelegate {

        /* renamed from: a */
        private final View f1164a;

        /* renamed from: b */
        private final Rect f1165b;

        /* renamed from: c */
        private final Rect f1166c;

        /* renamed from: d */
        private final Rect f1167d;

        /* renamed from: e */
        private final int f1168e;

        /* renamed from: f */
        private boolean f1169f;

        public C0228f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1168e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1165b = new Rect();
            this.f1167d = new Rect();
            this.f1166c = new Rect();
            m1453a(rect, rect2);
            this.f1164a = view;
        }

        /* renamed from: a */
        public void m1453a(Rect rect, Rect rect2) {
            this.f1165b.set(rect);
            this.f1167d.set(rect);
            Rect rect3 = this.f1167d;
            int i = this.f1168e;
            rect3.inset(-i, -i);
            this.f1166c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f1169f;
                    if (z2 && !this.f1167d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f1169f;
                        this.f1169f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1165b.contains(x, y)) {
                    this.f1169f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f1166c.contains(x, y)) {
                    Rect rect = this.f1166c;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.f1164a.getWidth() / 2;
                    i = this.f1164a.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.f1164a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: A */
    private void m1488A() {
        this.f1145q.dismissDropDown();
    }

    /* renamed from: C */
    private void m1486C(View view, Rect rect) {
        view.getLocationInWindow(this.f1114A);
        getLocationInWindow(this.f1115B);
        int[] iArr = this.f1114A;
        int i = iArr[1];
        int[] iArr2 = this.f1115B;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: D */
    private CharSequence m1485D(CharSequence charSequence) {
        if (!this.f1128O || this.f1117D == null) {
            return charSequence;
        }
        double textSize = this.f1145q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f1117D.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1117D), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: E */
    private boolean m1484E() {
        SearchableInfo searchableInfo = this.f1140d0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1140d0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1120G;
        } else if (this.f1140d0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1121H;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: G */
    static boolean m1482G(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: H */
    private boolean m1481H() {
        return (this.f1131R || this.f1136W) && !m1483F();
    }

    /* renamed from: O */
    private void m1474O() {
        post(this.f1142f0);
    }

    /* renamed from: Q */
    private void m1472Q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1145q.getText());
        if (!z2 && (!this.f1128O || this.f1138b0)) {
            z = false;
        }
        this.f1150v.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f1150v.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: R */
    private void m1471R() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1145q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1485D(queryHint));
    }

    /* renamed from: S */
    private void m1470S() {
        this.f1145q.setThreshold(this.f1140d0.getSuggestThreshold());
        this.f1145q.setImeOptions(this.f1140d0.getImeOptions());
        int inputType = this.f1140d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1140d0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1145q.setInputType(inputType);
        AbstractC0143d abstractC0143d = this.f1130Q;
        if (abstractC0143d != null) {
            abstractC0143d.changeCursor(null);
        }
        if (this.f1140d0.getSuggestAuthority() != null) {
            View$OnClickListenerC0303p0 view$OnClickListenerC0303p0 = new View$OnClickListenerC0303p0(getContext(), this, this.f1140d0, this.f1144h0);
            this.f1130Q = view$OnClickListenerC0303p0;
            this.f1145q.setAdapter(view$OnClickListenerC0303p0);
            ((View$OnClickListenerC0303p0) this.f1130Q).m1146t(this.f1133T ? 2 : 1);
        }
    }

    /* renamed from: T */
    private void m1469T() {
        this.f1147s.setVisibility((m1481H() && (this.f1149u.getVisibility() == 0 || this.f1151w.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: U */
    private void m1468U(boolean z) {
        this.f1149u.setVisibility((this.f1131R && m1481H() && hasFocus() && (z || !this.f1136W)) ? 0 : 8);
    }

    /* renamed from: V */
    private void m1467V(boolean z) {
        this.f1129P = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1145q.getText());
        this.f1148t.setVisibility(i2);
        m1468U(z2);
        this.f1146r.setVisibility(z ? 8 : 0);
        this.f1116C.setVisibility((this.f1116C.getDrawable() == null || this.f1128O) ? 8 : 8);
        m1472Q();
        m1466W(!z2);
        m1469T();
    }

    /* renamed from: W */
    private void m1466W(boolean z) {
        int i = 8;
        if (this.f1136W && !m1483F() && z) {
            this.f1149u.setVisibility(8);
            i = 0;
        }
        this.f1151w.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0572d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0572d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1145q.setText(charSequence);
        this.f1145q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: z */
    private Intent m1465z(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1137a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1141e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1140d0.getSearchActivity());
        return intent;
    }

    /* renamed from: B */
    void m1487B() {
        C0222a c0222a = f1113i0;
        c0222a.m1460b(this.f1145q);
        c0222a.m1461a(this.f1145q);
    }

    /* renamed from: F */
    public boolean m1483F() {
        return this.f1129P;
    }

    /* renamed from: I */
    void m1480I(int i, String str, String str2) {
        getContext().startActivity(m1465z("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: J */
    void m1479J() {
        if (!TextUtils.isEmpty(this.f1145q.getText())) {
            this.f1145q.setText("");
            this.f1145q.requestFocus();
            this.f1145q.setImeVisibility(true);
        } else if (this.f1128O) {
            InterfaceC0223b interfaceC0223b = this.f1124K;
            if (interfaceC0223b == null || !interfaceC0223b.m1458a()) {
                clearFocus();
                m1467V(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m1478K(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: L */
    void m1477L() {
        m1467V(false);
        this.f1145q.requestFocus();
        this.f1145q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1127N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: M */
    void m1476M() {
        Editable text = this.f1145q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0224c interfaceC0224c = this.f1123J;
        if (interfaceC0224c == null || !interfaceC0224c.m1457a(text.toString())) {
            if (this.f1140d0 != null) {
                m1480I(0, null, text.toString());
            }
            this.f1145q.setImeVisibility(false);
            m1488A();
        }
    }

    /* renamed from: N */
    void m1475N() {
        m1467V(m1483F());
        m1474O();
        if (this.f1145q.hasFocus()) {
            m1487B();
        }
    }

    /* renamed from: P */
    public void m1473P(CharSequence charSequence, boolean z) {
        this.f1145q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1145q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1137a0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m1476M();
    }

    @Override // p023v.InterfaceC0587c
    /* renamed from: a */
    public void mo14a() {
        if (this.f1138b0) {
            return;
        }
        this.f1138b0 = true;
        int imeOptions = this.f1145q.getImeOptions();
        this.f1139c0 = imeOptions;
        this.f1145q.setImeOptions(imeOptions | 33554432);
        this.f1145q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1134U = true;
        super.clearFocus();
        this.f1145q.clearFocus();
        this.f1145q.setImeVisibility(false);
        this.f1134U = false;
    }

    @Override // p023v.InterfaceC0587c
    /* renamed from: d */
    public void mo12d() {
        m1473P("", false);
        clearFocus();
        m1467V(true);
        this.f1145q.setImeOptions(this.f1139c0);
        this.f1138b0 = false;
    }

    public int getImeOptions() {
        return this.f1145q.getImeOptions();
    }

    public int getInputType() {
        return this.f1145q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1135V;
    }

    public CharSequence getQuery() {
        return this.f1145q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1132S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1140d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1122I : getContext().getText(this.f1140d0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1119F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1118E;
    }

    public AbstractC0143d getSuggestionsAdapter() {
        return this.f1130Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1142f0);
        post(this.f1143g0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v7.widget.C0272i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1486C(this.f1145q, this.f1153y);
            Rect rect = this.f1154z;
            Rect rect2 = this.f1153y;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0228f c0228f = this.f1152x;
            if (c0228f != null) {
                c0228f.m1453a(this.f1154z, this.f1153y);
                return;
            }
            C0228f c0228f2 = new C0228f(this.f1154z, this.f1153y, this.f1145q);
            this.f1152x = c0228f2;
            setTouchDelegate(c0228f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // android.support.p002v7.widget.C0272i0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.m1483F()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f1135V
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f1135V
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f1135V
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0226e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0226e c0226e = (C0226e) parcelable;
        super.onRestoreInstanceState(c0226e.m475a());
        m1467V(c0226e.f1163d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0226e c0226e = new C0226e(super.onSaveInstanceState());
        c0226e.f1163d = m1483F();
        return c0226e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1474O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f1134U && isFocusable()) {
            if (m1483F()) {
                return super.requestFocus(i, rect);
            }
            boolean requestFocus = this.f1145q.requestFocus(i, rect);
            if (requestFocus) {
                m1467V(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1141e0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m1479J();
        } else {
            m1477L();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1128O == z) {
            return;
        }
        this.f1128O = z;
        m1467V(z);
        m1471R();
    }

    public void setImeOptions(int i) {
        this.f1145q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1145q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1135V = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0223b interfaceC0223b) {
        this.f1124K = interfaceC0223b;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1125L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0224c interfaceC0224c) {
        this.f1123J = interfaceC0224c;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1127N = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0225d interfaceC0225d) {
        this.f1126M = interfaceC0225d;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1132S = charSequence;
        m1471R();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1133T = z;
        AbstractC0143d abstractC0143d = this.f1130Q;
        if (abstractC0143d instanceof View$OnClickListenerC0303p0) {
            ((View$OnClickListenerC0303p0) abstractC0143d).m1146t(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1140d0 = searchableInfo;
        if (searchableInfo != null) {
            m1470S();
            m1471R();
        }
        boolean m1484E = m1484E();
        this.f1136W = m1484E;
        if (m1484E) {
            this.f1145q.setPrivateImeOptions("nm");
        }
        m1467V(m1483F());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1131R = z;
        m1467V(m1483F());
    }

    public void setSuggestionsAdapter(AbstractC0143d abstractC0143d) {
        this.f1130Q = abstractC0143d;
        this.f1145q.setAdapter(abstractC0143d);
    }
}
package android.support.v7.widget;

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

/* loaded from: classes.dex */
public class SearchView extends i0 implements v.c {
    static final a i0 = new a();
    private int[] A;
    private int[] B;
    private final ImageView C;
    private final Drawable D;
    private final int E;
    private final int F;
    private final Intent G;
    private final Intent H;
    private final CharSequence I;
    private c J;
    private b K;
    View.OnFocusChangeListener L;
    private d M;
    private View.OnClickListener N;
    private boolean O;
    private boolean P;
    android.support.v4.widget.d Q;
    private boolean R;
    private CharSequence S;
    private boolean T;
    private boolean U;
    private int V;
    private boolean W;
    private CharSequence a0;
    private boolean b0;
    private int c0;
    SearchableInfo d0;
    private Bundle e0;
    private final Runnable f0;
    private Runnable g0;
    private final WeakHashMap<String, Drawable.ConstantState> h0;

    /* renamed from: q  reason: collision with root package name */
    final SearchAutoComplete f888q;

    /* renamed from: r  reason: collision with root package name */
    private final View f889r;

    /* renamed from: s  reason: collision with root package name */
    private final View f890s;

    /* renamed from: t  reason: collision with root package name */
    final ImageView f891t;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f892u;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f893v;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f894w;
    private f x;
    private Rect y;
    private Rect z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends android.support.v7.widget.e {

        /* renamed from: e  reason: collision with root package name */
        private int f895e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f896f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f897g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f898h;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, s.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f898h = new a();
            this.f895e = getThreshold();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (this.f897g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f897g = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
                if (i2 < 600) {
                    return (i2 < 640 || i3 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f897g = false;
                removeCallbacks(this.f898h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f897g = true;
            } else {
                this.f897g = false;
                removeCallbacks(this.f898h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f895e <= 0 || super.enoughToFilter();
        }

        @Override // android.support.v7.widget.e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f897g) {
                removeCallbacks(this.f898h);
                post(this.f898h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f896f.N();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f896f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f896f.hasFocus() && getVisibility() == 0) {
                this.f897g = true;
                if (SearchView.G(getContext())) {
                    SearchView.i0.c(this, true);
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
            this.f896f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f895e = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Method f900a;

        /* renamed from: b  reason: collision with root package name */
        private Method f901b;

        /* renamed from: c  reason: collision with root package name */
        private Method f902c;

        a() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f900a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f901b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f902c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f901b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f900a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f902c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(String str);
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends o.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        boolean f903d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f903d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f903d + "}";
        }

        @Override // o.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f903d));
        }
    }

    /* loaded from: classes.dex */
    private static class f extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f904a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f905b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f906c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f907d;

        /* renamed from: e  reason: collision with root package name */
        private final int f908e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f909f;

        public f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f908e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f905b = new Rect();
            this.f907d = new Rect();
            this.f906c = new Rect();
            a(rect, rect2);
            this.f904a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f905b.set(rect);
            this.f907d.set(rect);
            Rect rect3 = this.f907d;
            int i2 = this.f908e;
            rect3.inset(-i2, -i2);
            this.f906c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f2;
            int i2;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f909f;
                    if (z2 && !this.f907d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f909f;
                        this.f909f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f905b.contains(x, y)) {
                    this.f909f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f906c.contains(x, y)) {
                    Rect rect = this.f906c;
                    f2 = x - rect.left;
                    i2 = y - rect.top;
                } else {
                    f2 = this.f904a.getWidth() / 2;
                    i2 = this.f904a.getHeight() / 2;
                }
                motionEvent.setLocation(f2, i2);
                return this.f904a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    private void A() {
        this.f888q.dismissDropDown();
    }

    private void C(View view, Rect rect) {
        view.getLocationInWindow(this.A);
        getLocationInWindow(this.B);
        int[] iArr = this.A;
        int i2 = iArr[1];
        int[] iArr2 = this.B;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence D(CharSequence charSequence) {
        if (!this.O || this.D == null) {
            return charSequence;
        }
        double textSize = this.f888q.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.D.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.D), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean E() {
        SearchableInfo searchableInfo = this.d0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.d0.getVoiceSearchLaunchWebSearch()) {
            intent = this.G;
        } else if (this.d0.getVoiceSearchLaunchRecognizer()) {
            intent = this.H;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean G(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean H() {
        return (this.R || this.W) && !F();
    }

    private void O() {
        post(this.f0);
    }

    private void Q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f888q.getText());
        if (!z2 && (!this.O || this.b0)) {
            z = false;
        }
        this.f893v.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f893v.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void R() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f888q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(D(queryHint));
    }

    private void S() {
        this.f888q.setThreshold(this.d0.getSuggestThreshold());
        this.f888q.setImeOptions(this.d0.getImeOptions());
        int inputType = this.d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.d0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f888q.setInputType(inputType);
        android.support.v4.widget.d dVar = this.Q;
        if (dVar != null) {
            dVar.changeCursor(null);
        }
        if (this.d0.getSuggestAuthority() != null) {
            p0 p0Var = new p0(getContext(), this, this.d0, this.h0);
            this.Q = p0Var;
            this.f888q.setAdapter(p0Var);
            ((p0) this.Q).t(this.T ? 2 : 1);
        }
    }

    private void T() {
        this.f890s.setVisibility((H() && (this.f892u.getVisibility() == 0 || this.f894w.getVisibility() == 0)) ? 0 : 8);
    }

    private void U(boolean z) {
        this.f892u.setVisibility((this.R && H() && hasFocus() && (z || !this.W)) ? 0 : 8);
    }

    private void V(boolean z) {
        this.P = z;
        int i2 = 0;
        int i3 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f888q.getText());
        this.f891t.setVisibility(i3);
        U(z2);
        this.f889r.setVisibility(z ? 8 : 0);
        this.C.setVisibility((this.C.getDrawable() == null || this.O) ? 8 : 8);
        Q();
        W(!z2);
        T();
    }

    private void W(boolean z) {
        int i2 = 8;
        if (this.W && !F() && z) {
            this.f892u.setVisibility(8);
            i2 = 0;
        }
        this.f894w.setVisibility(i2);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(s.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(s.d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f888q.setText(charSequence);
        this.f888q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent z(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.d0.getSearchActivity());
        return intent;
    }

    void B() {
        a aVar = i0;
        aVar.b(this.f888q);
        aVar.a(this.f888q);
    }

    public boolean F() {
        return this.P;
    }

    void I(int i2, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void J() {
        if (!TextUtils.isEmpty(this.f888q.getText())) {
            this.f888q.setText("");
            this.f888q.requestFocus();
            this.f888q.setImeVisibility(true);
        } else if (this.O) {
            b bVar = this.K;
            if (bVar == null || !bVar.a()) {
                clearFocus();
                V(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void L() {
        V(false);
        this.f888q.requestFocus();
        this.f888q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void M() {
        Editable text = this.f888q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        c cVar = this.J;
        if (cVar == null || !cVar.a(text.toString())) {
            if (this.d0 != null) {
                I(0, null, text.toString());
            }
            this.f888q.setImeVisibility(false);
            A();
        }
    }

    void N() {
        V(F());
        O();
        if (this.f888q.hasFocus()) {
            B();
        }
    }

    public void P(CharSequence charSequence, boolean z) {
        this.f888q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f888q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.a0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        M();
    }

    @Override // v.c
    public void a() {
        if (this.b0) {
            return;
        }
        this.b0 = true;
        int imeOptions = this.f888q.getImeOptions();
        this.c0 = imeOptions;
        this.f888q.setImeOptions(imeOptions | 33554432);
        this.f888q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.U = true;
        super.clearFocus();
        this.f888q.clearFocus();
        this.f888q.setImeVisibility(false);
        this.U = false;
    }

    @Override // v.c
    public void d() {
        P("", false);
        clearFocus();
        V(true);
        this.f888q.setImeOptions(this.c0);
        this.b0 = false;
    }

    public int getImeOptions() {
        return this.f888q.getImeOptions();
    }

    public int getInputType() {
        return this.f888q.getInputType();
    }

    public int getMaxWidth() {
        return this.V;
    }

    public CharSequence getQuery() {
        return this.f888q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.I : getContext().getText(this.d0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.E;
    }

    public android.support.v4.widget.d getSuggestionsAdapter() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f0);
        post(this.g0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            C(this.f888q, this.y);
            Rect rect = this.z;
            Rect rect2 = this.y;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            f fVar = this.x;
            if (fVar != null) {
                fVar.a(this.z, this.y);
                return;
            }
            f fVar2 = new f(this.z, this.y, this.f888q);
            this.x = fVar2;
            setTouchDelegate(fVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // android.support.v7.widget.i0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.F()
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
            int r0 = r3.V
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.V
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.V
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        V(eVar.f903d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f903d = F();
        return eVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.U && isFocusable()) {
            if (F()) {
                return super.requestFocus(i2, rect);
            }
            boolean requestFocus = this.f888q.requestFocus(i2, rect);
            if (requestFocus) {
                V(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.e0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            J();
        } else {
            L();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.O == z) {
            return;
        }
        this.O = z;
        V(z);
        R();
    }

    public void setImeOptions(int i2) {
        this.f888q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f888q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.V = i2;
        requestLayout();
    }

    public void setOnCloseListener(b bVar) {
        this.K = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c cVar) {
        this.J = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.N = onClickListener;
    }

    public void setOnSuggestionListener(d dVar) {
        this.M = dVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.S = charSequence;
        R();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.T = z;
        android.support.v4.widget.d dVar = this.Q;
        if (dVar instanceof p0) {
            ((p0) dVar).t(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.d0 = searchableInfo;
        if (searchableInfo != null) {
            S();
            R();
        }
        boolean E = E();
        this.W = E;
        if (E) {
            this.f888q.setPrivateImeOptions("nm");
        }
        V(F());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.R = z;
        V(F());
    }

    public void setSuggestionsAdapter(android.support.v4.widget.d dVar) {
        this.Q = dVar;
        this.f888q.setAdapter(dVar);
    }
}
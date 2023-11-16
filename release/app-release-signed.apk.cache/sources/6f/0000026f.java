package p023v;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p020s.C0577i;

/* renamed from: v.d */
/* loaded from: classes.dex */
public class C0588d extends ContextWrapper {

    /* renamed from: a */
    private int f2639a;

    /* renamed from: b */
    private Resources.Theme f2640b;

    /* renamed from: c */
    private LayoutInflater f2641c;

    /* renamed from: d */
    private Configuration f2642d;

    /* renamed from: e */
    private Resources f2643e;

    public C0588d() {
        super(null);
    }

    public C0588d(Context context, int i) {
        super(context);
        this.f2639a = i;
    }

    public C0588d(Context context, Resources.Theme theme) {
        super(context);
        this.f2640b = theme;
    }

    /* renamed from: a */
    private Resources m78a() {
        if (this.f2643e == null) {
            Configuration configuration = this.f2642d;
            this.f2643e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f2643e;
    }

    /* renamed from: b */
    private void m77b() {
        boolean z = this.f2640b == null;
        if (z) {
            this.f2640b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2640b.setTo(theme);
            }
        }
        m76c(this.f2640b, this.f2639a, z);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    protected void m76c(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m78a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f2641c == null) {
                this.f2641c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f2641c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2640b;
        if (theme != null) {
            return theme;
        }
        if (this.f2639a == 0) {
            this.f2639a = C0577i.Theme_AppCompat_Light;
        }
        m77b();
        return this.f2640b;
    }

    public int getThemeResId() {
        return this.f2639a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f2639a != i) {
            this.f2639a = i;
            m77b();
        }
    }
}
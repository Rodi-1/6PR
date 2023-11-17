package v;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f1896a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f1897b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f1898c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f1899d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f1900e;

    public d() {
        super(null);
    }

    public d(Context context, int i2) {
        super(context);
        this.f1896a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1897b = theme;
    }

    private Resources a() {
        if (this.f1900e == null) {
            Configuration configuration = this.f1899d;
            this.f1900e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f1900e;
    }

    private void b() {
        boolean z = this.f1897b == null;
        if (z) {
            this.f1897b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1897b.setTo(theme);
            }
        }
        c(this.f1897b, this.f1896a, z);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    protected void c(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1898c == null) {
                this.f1898c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1898c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1897b;
        if (theme != null) {
            return theme;
        }
        if (this.f1896a == 0) {
            this.f1896a = s.i.Theme_AppCompat_Light;
        }
        b();
        return this.f1897b;
    }

    public int getThemeResId() {
        return this.f1896a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f1896a != i2) {
            this.f1896a = i2;
            b();
        }
    }
}
package p023v;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p020s.C0569a;
import p020s.C0570b;
import p020s.C0572d;
import p020s.C0578j;

/* renamed from: v.a */
/* loaded from: classes.dex */
public class C0584a {

    /* renamed from: a */
    private Context f2636a;

    private C0584a(Context context) {
        this.f2636a = context;
    }

    /* renamed from: b */
    public static C0584a m88b(Context context) {
        return new C0584a(context);
    }

    /* renamed from: a */
    public boolean m89a() {
        return this.f2636a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m87c() {
        return this.f2636a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m86d() {
        Configuration configuration = this.f2636a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m85e() {
        return this.f2636a.getResources().getDimensionPixelSize(C0572d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m84f() {
        TypedArray obtainStyledAttributes = this.f2636a.obtainStyledAttributes(null, C0578j.f2525a, C0569a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0578j.f2562j, 0);
        Resources resources = this.f2636a.getResources();
        if (!m83g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0572d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m83g() {
        return this.f2636a.getResources().getBoolean(C0570b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m82h() {
        return true;
    }
}
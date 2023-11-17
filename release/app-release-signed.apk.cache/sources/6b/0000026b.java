package v;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import s.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f1893a;

    private a(Context context) {
        this.f1893a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f1893a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f1893a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f1893a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 <= 960 || i3 <= 720) {
            if (i2 <= 720 || i3 <= 960) {
                if (i2 < 500) {
                    if (i2 <= 640 || i3 <= 480) {
                        if (i2 <= 480 || i3 <= 640) {
                            return i2 >= 360 ? 3 : 2;
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

    public int e() {
        return this.f1893a.getResources().getDimensionPixelSize(s.d.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f1893a.obtainStyledAttributes(null, j.f1864a, s.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f1873j, 0);
        Resources resources = this.f1893a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(s.d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f1893a.getResources().getBoolean(s.b.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        return true;
    }
}
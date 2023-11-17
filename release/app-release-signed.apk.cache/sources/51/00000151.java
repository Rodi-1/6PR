package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class p0 extends android.support.v4.widget.k implements View.OnClickListener {
    private int A;

    /* renamed from: m  reason: collision with root package name */
    private final SearchManager f1150m;

    /* renamed from: n  reason: collision with root package name */
    private final SearchView f1151n;

    /* renamed from: o  reason: collision with root package name */
    private final SearchableInfo f1152o;

    /* renamed from: p  reason: collision with root package name */
    private final Context f1153p;

    /* renamed from: q  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1154q;

    /* renamed from: r  reason: collision with root package name */
    private final int f1155r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1156s;

    /* renamed from: t  reason: collision with root package name */
    private int f1157t;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f1158u;

    /* renamed from: v  reason: collision with root package name */
    private int f1159v;

    /* renamed from: w  reason: collision with root package name */
    private int f1160w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1161a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1162b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1163c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1164d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1165e;

        public a(View view) {
            this.f1161a = (TextView) view.findViewById(16908308);
            this.f1162b = (TextView) view.findViewById(16908309);
            this.f1163c = (ImageView) view.findViewById(16908295);
            this.f1164d = (ImageView) view.findViewById(16908296);
            this.f1165e = (ImageView) view.findViewById(s.f.edit_query);
        }
    }

    public p0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1156s = false;
        this.f1157t = 1;
        this.f1159v = -1;
        this.f1160w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.f1150m = (SearchManager) this.f539e.getSystemService("search");
        this.f1151n = searchView;
        this.f1152o = searchableInfo;
        this.f1155r = searchView.getSuggestionCommitIconResId();
        this.f1153p = context;
        this.f1154q = weakHashMap;
    }

    private Drawable g(String str) {
        Drawable.ConstantState constantState = this.f1154q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence h(CharSequence charSequence) {
        if (this.f1158u == null) {
            TypedValue typedValue = new TypedValue();
            this.f539e.getTheme().resolveAttribute(s.a.textColorSearchUrl, typedValue, true);
            this.f1158u = this.f539e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1158u, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable i(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f539e.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e2) {
            nameNotFoundException = e2.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable == null) {
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        }
        return drawable;
    }

    private Drawable j(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1154q.containsKey(flattenToShortString)) {
            Drawable i2 = i(componentName);
            this.f1154q.put(flattenToShortString, i2 != null ? i2.getConstantState() : null);
            return i2;
        }
        Drawable.ConstantState constantState = this.f1154q.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1153p.getResources());
    }

    public static String k(Cursor cursor, String str) {
        return s(cursor, cursor.getColumnIndex(str));
    }

    private Drawable l(Cursor cursor) {
        Drawable j2 = j(this.f1152o.getSearchActivity());
        return j2 != null ? j2 : this.f539e.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable m(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return n(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1153p.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e2) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
            }
            return createFromStream;
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable o(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1153p.getPackageName() + "/" + parseInt;
            Drawable g2 = g(str2);
            if (g2 != null) {
                return g2;
            }
            Drawable b2 = g.a.b(this.f1153p, parseInt);
            w(str2, b2);
            return b2;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable g3 = g(str);
            if (g3 != null) {
                return g3;
            }
            Drawable m2 = m(Uri.parse(str));
            w(str, m2);
            return m2;
        }
    }

    private Drawable p(Cursor cursor) {
        int i2 = this.y;
        if (i2 == -1) {
            return null;
        }
        Drawable o2 = o(cursor.getString(i2));
        return o2 != null ? o2 : l(cursor);
    }

    private Drawable q(Cursor cursor) {
        int i2 = this.z;
        if (i2 == -1) {
            return null;
        }
        return o(cursor.getString(i2));
    }

    private static String s(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private void u(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void v(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void w(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1154q.put(str, drawable.getConstantState());
        }
    }

    private void x(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.support.v4.widget.d
    public void a(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i2 = this.A;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.f1161a != null) {
            v(aVar.f1161a, s(cursor, this.f1159v));
        }
        if (aVar.f1162b != null) {
            String s2 = s(cursor, this.x);
            CharSequence h2 = s2 != null ? h(s2) : s(cursor, this.f1160w);
            if (TextUtils.isEmpty(h2)) {
                TextView textView = aVar.f1161a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1161a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1161a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1161a.setMaxLines(1);
                }
            }
            v(aVar.f1162b, h2);
        }
        ImageView imageView = aVar.f1163c;
        if (imageView != null) {
            u(imageView, p(cursor), 4);
        }
        ImageView imageView2 = aVar.f1164d;
        if (imageView2 != null) {
            u(imageView2, q(cursor), 8);
        }
        int i4 = this.f1157t;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            aVar.f1165e.setVisibility(8);
            return;
        }
        aVar.f1165e.setVisibility(0);
        aVar.f1165e.setTag(aVar.f1161a.getText());
        aVar.f1165e.setOnClickListener(this);
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public void changeCursor(Cursor cursor) {
        if (this.f1156s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f1159v = cursor.getColumnIndex("suggest_text_1");
                this.f1160w = cursor.getColumnIndex("suggest_text_2");
                this.x = cursor.getColumnIndex("suggest_text_2_url");
                this.y = cursor.getColumnIndex("suggest_icon_1");
                this.z = cursor.getColumnIndex("suggest_icon_2");
                this.A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // android.support.v4.widget.e.a
    public CharSequence convertToString(Cursor cursor) {
        String k2;
        String k3;
        if (cursor == null) {
            return null;
        }
        String k4 = k(cursor, "suggest_intent_query");
        if (k4 != null) {
            return k4;
        }
        if (!this.f1152o.shouldRewriteQueryFromData() || (k3 = k(cursor, "suggest_intent_data")) == null) {
            if (!this.f1152o.shouldRewriteQueryFromText() || (k2 = k(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return k2;
        }
        return k3;
    }

    @Override // android.support.v4.widget.k, android.support.v4.widget.d
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View d2 = super.d(context, cursor, viewGroup);
        d2.setTag(new a(d2));
        ((ImageView) d2.findViewById(s.f.edit_query)).setImageResource(this.f1155r);
        return d2;
    }

    @Override // android.support.v4.widget.d, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View c2 = c(this.f539e, this.f538d, viewGroup);
            if (c2 != null) {
                ((a) c2.getTag()).f1161a.setText(e2.toString());
            }
            return c2;
        }
    }

    @Override // android.support.v4.widget.d, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(this.f539e, this.f538d, viewGroup);
            if (d2 != null) {
                ((a) d2.getTag()).f1161a.setText(e2.toString());
            }
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    Drawable n(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f539e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        x(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        x(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1151n.K((CharSequence) tag);
        }
    }

    Cursor r(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f539e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.support.v4.widget.e.a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1151n.getVisibility() == 0 && this.f1151n.getWindowVisibility() == 0) {
            try {
                Cursor r2 = r(this.f1152o, charSequence2, 50);
                if (r2 != null) {
                    r2.getCount();
                    return r2;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    public void t(int i2) {
        this.f1157t = i2;
    }
}
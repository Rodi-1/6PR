package android.support.p002v7.widget;

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
import android.support.p001v4.widget.AbstractC0162k;
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
import p008g.C0386a;
import p020s.C0569a;
import p020s.C0574f;

/* renamed from: android.support.v7.widget.p0 */
/* loaded from: classes.dex */
class View$OnClickListenerC0303p0 extends AbstractC0162k implements View.OnClickListener {

    /* renamed from: A */
    private int f1454A;

    /* renamed from: m */
    private final SearchManager f1455m;

    /* renamed from: n */
    private final SearchView f1456n;

    /* renamed from: o */
    private final SearchableInfo f1457o;

    /* renamed from: p */
    private final Context f1458p;

    /* renamed from: q */
    private final WeakHashMap<String, Drawable.ConstantState> f1459q;

    /* renamed from: r */
    private final int f1460r;

    /* renamed from: s */
    private boolean f1461s;

    /* renamed from: t */
    private int f1462t;

    /* renamed from: u */
    private ColorStateList f1463u;

    /* renamed from: v */
    private int f1464v;

    /* renamed from: w */
    private int f1465w;

    /* renamed from: x */
    private int f1466x;

    /* renamed from: y */
    private int f1467y;

    /* renamed from: z */
    private int f1468z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.p0$a */
    /* loaded from: classes.dex */
    public static final class C0304a {

        /* renamed from: a */
        public final TextView f1469a;

        /* renamed from: b */
        public final TextView f1470b;

        /* renamed from: c */
        public final ImageView f1471c;

        /* renamed from: d */
        public final ImageView f1472d;

        /* renamed from: e */
        public final ImageView f1473e;

        public C0304a(View view) {
            this.f1469a = (TextView) view.findViewById(16908308);
            this.f1470b = (TextView) view.findViewById(16908309);
            this.f1471c = (ImageView) view.findViewById(16908295);
            this.f1472d = (ImageView) view.findViewById(16908296);
            this.f1473e = (ImageView) view.findViewById(C0574f.edit_query);
        }
    }

    public View$OnClickListenerC0303p0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1461s = false;
        this.f1462t = 1;
        this.f1464v = -1;
        this.f1465w = -1;
        this.f1466x = -1;
        this.f1467y = -1;
        this.f1468z = -1;
        this.f1454A = -1;
        this.f1455m = (SearchManager) this.f689e.getSystemService("search");
        this.f1456n = searchView;
        this.f1457o = searchableInfo;
        this.f1460r = searchView.getSuggestionCommitIconResId();
        this.f1458p = context;
        this.f1459q = weakHashMap;
    }

    /* renamed from: g */
    private Drawable m1159g(String str) {
        Drawable.ConstantState constantState = this.f1459q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: h */
    private CharSequence m1158h(CharSequence charSequence) {
        if (this.f1463u == null) {
            TypedValue typedValue = new TypedValue();
            this.f689e.getTheme().resolveAttribute(C0569a.textColorSearchUrl, typedValue, true);
            this.f1463u = this.f689e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1463u, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: i */
    private Drawable m1157i(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f689e.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
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

    /* renamed from: j */
    private Drawable m1156j(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1459q.containsKey(flattenToShortString)) {
            Drawable m1157i = m1157i(componentName);
            this.f1459q.put(flattenToShortString, m1157i != null ? m1157i.getConstantState() : null);
            return m1157i;
        }
        Drawable.ConstantState constantState = this.f1459q.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1458p.getResources());
    }

    /* renamed from: k */
    public static String m1155k(Cursor cursor, String str) {
        return m1147s(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: l */
    private Drawable m1154l(Cursor cursor) {
        Drawable m1156j = m1156j(this.f1457o.getSearchActivity());
        return m1156j != null ? m1156j : this.f689e.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: m */
    private Drawable m1153m(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1152n(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1458p.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
            }
            return createFromStream;
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: o */
    private Drawable m1151o(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1458p.getPackageName() + "/" + parseInt;
            Drawable m1159g = m1159g(str2);
            if (m1159g != null) {
                return m1159g;
            }
            Drawable m734b = C0386a.m734b(this.f1458p, parseInt);
            m1143w(str2, m734b);
            return m734b;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m1159g2 = m1159g(str);
            if (m1159g2 != null) {
                return m1159g2;
            }
            Drawable m1153m = m1153m(Uri.parse(str));
            m1143w(str, m1153m);
            return m1153m;
        }
    }

    /* renamed from: p */
    private Drawable m1150p(Cursor cursor) {
        int i = this.f1467y;
        if (i == -1) {
            return null;
        }
        Drawable m1151o = m1151o(cursor.getString(i));
        return m1151o != null ? m1151o : m1154l(cursor);
    }

    /* renamed from: q */
    private Drawable m1149q(Cursor cursor) {
        int i = this.f1468z;
        if (i == -1) {
            return null;
        }
        return m1151o(cursor.getString(i));
    }

    /* renamed from: s */
    private static String m1147s(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: u */
    private void m1145u(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: v */
    private void m1144v(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: w */
    private void m1143w(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1459q.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: x */
    private void m1142x(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.support.p001v4.widget.AbstractC0143d
    /* renamed from: a */
    public void mo1161a(View view, Context context, Cursor cursor) {
        C0304a c0304a = (C0304a) view.getTag();
        int i = this.f1454A;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c0304a.f1469a != null) {
            m1144v(c0304a.f1469a, m1147s(cursor, this.f1464v));
        }
        if (c0304a.f1470b != null) {
            String m1147s = m1147s(cursor, this.f1466x);
            CharSequence m1158h = m1147s != null ? m1158h(m1147s) : m1147s(cursor, this.f1465w);
            if (TextUtils.isEmpty(m1158h)) {
                TextView textView = c0304a.f1469a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c0304a.f1469a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c0304a.f1469a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c0304a.f1469a.setMaxLines(1);
                }
            }
            m1144v(c0304a.f1470b, m1158h);
        }
        ImageView imageView = c0304a.f1471c;
        if (imageView != null) {
            m1145u(imageView, m1150p(cursor), 4);
        }
        ImageView imageView2 = c0304a.f1472d;
        if (imageView2 != null) {
            m1145u(imageView2, m1149q(cursor), 8);
        }
        int i3 = this.f1462t;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c0304a.f1473e.setVisibility(8);
            return;
        }
        c0304a.f1473e.setVisibility(0);
        c0304a.f1473e.setTag(c0304a.f1469a.getText());
        c0304a.f1473e.setOnClickListener(this);
    }

    @Override // android.support.p001v4.widget.AbstractC0143d, android.support.p001v4.widget.C0146e.InterfaceC0147a
    public void changeCursor(Cursor cursor) {
        if (this.f1461s) {
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
                this.f1464v = cursor.getColumnIndex("suggest_text_1");
                this.f1465w = cursor.getColumnIndex("suggest_text_2");
                this.f1466x = cursor.getColumnIndex("suggest_text_2_url");
                this.f1467y = cursor.getColumnIndex("suggest_icon_1");
                this.f1468z = cursor.getColumnIndex("suggest_icon_2");
                this.f1454A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // android.support.p001v4.widget.C0146e.InterfaceC0147a
    public CharSequence convertToString(Cursor cursor) {
        String m1155k;
        String m1155k2;
        if (cursor == null) {
            return null;
        }
        String m1155k3 = m1155k(cursor, "suggest_intent_query");
        if (m1155k3 != null) {
            return m1155k3;
        }
        if (!this.f1457o.shouldRewriteQueryFromData() || (m1155k2 = m1155k(cursor, "suggest_intent_data")) == null) {
            if (!this.f1457o.shouldRewriteQueryFromText() || (m1155k = m1155k(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return m1155k;
        }
        return m1155k2;
    }

    @Override // android.support.p001v4.widget.AbstractC0162k, android.support.p001v4.widget.AbstractC0143d
    /* renamed from: d */
    public View mo1160d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1160d = super.mo1160d(context, cursor, viewGroup);
        mo1160d.setTag(new C0304a(mo1160d));
        ((ImageView) mo1160d.findViewById(C0574f.edit_query)).setImageResource(this.f1460r);
        return mo1160d;
    }

    @Override // android.support.p001v4.widget.AbstractC0143d, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo1722c = mo1722c(this.f689e, this.f688d, viewGroup);
            if (mo1722c != null) {
                ((C0304a) mo1722c.getTag()).f1469a.setText(e.toString());
            }
            return mo1722c;
        }
    }

    @Override // android.support.p001v4.widget.AbstractC0143d, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo1160d = mo1160d(this.f689e, this.f688d, viewGroup);
            if (mo1160d != null) {
                ((C0304a) mo1160d.getTag()).f1469a.setText(e.toString());
            }
            return mo1160d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: n */
    Drawable m1152n(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f689e.getPackageManager().getResourcesForApplication(authority);
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
        m1142x(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1142x(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1456n.m1478K((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Cursor m1148r(SearchableInfo searchableInfo, String str, int i) {
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
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f689e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.support.p001v4.widget.C0146e.InterfaceC0147a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1456n.getVisibility() == 0 && this.f1456n.getWindowVisibility() == 0) {
            try {
                Cursor m1148r = m1148r(this.f1457o, charSequence2, 50);
                if (m1148r != null) {
                    m1148r.getCount();
                    return m1148r;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: t */
    public void m1146t(int i) {
        this.f1462t = i;
    }
}
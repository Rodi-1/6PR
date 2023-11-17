package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.i0;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.o;
import r.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a  reason: collision with root package name */
    private final Context f557a;

    /* renamed from: b  reason: collision with root package name */
    final j f558b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f559c;

    /* renamed from: d  reason: collision with root package name */
    private final int f560d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f561e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f562f;

    /* renamed from: g  reason: collision with root package name */
    ListView f563g;

    /* renamed from: h  reason: collision with root package name */
    private View f564h;

    /* renamed from: i  reason: collision with root package name */
    private int f565i;

    /* renamed from: j  reason: collision with root package name */
    private int f566j;

    /* renamed from: k  reason: collision with root package name */
    private int f567k;

    /* renamed from: l  reason: collision with root package name */
    private int f568l;

    /* renamed from: m  reason: collision with root package name */
    private int f569m;

    /* renamed from: o  reason: collision with root package name */
    Button f571o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f572p;

    /* renamed from: q  reason: collision with root package name */
    Message f573q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f574r;

    /* renamed from: s  reason: collision with root package name */
    Button f575s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f576t;

    /* renamed from: u  reason: collision with root package name */
    Message f577u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f578v;

    /* renamed from: w  reason: collision with root package name */
    Button f579w;
    private CharSequence x;
    Message y;
    private Drawable z;

    /* renamed from: n  reason: collision with root package name */
    private boolean f570n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        private final int f580b;

        /* renamed from: c  reason: collision with root package name */
        private final int f581c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.j.S1);
            this.f581c = obtainStyledAttributes.getDimensionPixelOffset(s.j.T1, -1);
            this.f580b = obtainStyledAttributes.getDimensionPixelOffset(s.j.U1, -1);
        }

        public void a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f580b, getPaddingRight(), z2 ? getPaddingBottom() : this.f581c);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f571o || (message2 = alertController.f573q) == null) && (view != alertController.f575s || (message2 = alertController.f577u) == null)) ? (view != alertController.f579w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f558b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f584b;

        b(View view, View view2) {
            this.f583a = view;
            this.f584b = view2;
        }

        @Override // android.support.v4.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.e(nestedScrollView, this.f583a, this.f584b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f586b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f587c;

        c(View view, View view2) {
            this.f586b = view;
            this.f587c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.e(AlertController.this.A, this.f586b, this.f587c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f590b;

        d(View view, View view2) {
            this.f589a = view;
            this.f590b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.e(absListView, this.f589a, this.f590b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f593c;

        e(View view, View view2) {
            this.f592b = view;
            this.f593c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.e(AlertController.this.f563g, this.f592b, this.f593c);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f595a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f596b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f598d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f600f;

        /* renamed from: g  reason: collision with root package name */
        public View f601g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f602h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f603i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f604j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f605k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f606l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f607m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f608n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f609o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f610p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f611q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f613s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f614t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f615u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f616v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f617w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        /* renamed from: c  reason: collision with root package name */
        public int f597c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f599e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f612r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecycleListView f618b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f618b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f618b.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: b  reason: collision with root package name */
            private final int f620b;

            /* renamed from: c  reason: collision with root package name */
            private final int f621c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ RecycleListView f622d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AlertController f623e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f622d = recycleListView;
                this.f623e = alertController;
                Cursor cursor2 = getCursor();
                this.f620b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f621c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f620b));
                this.f622d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f621c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f596b.inflate(this.f623e.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f625b;

            c(AlertController alertController) {
                this.f625b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                f.this.x.onClick(this.f625b.f558b, i2);
                if (f.this.H) {
                    return;
                }
                this.f625b.f558b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecycleListView f627b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AlertController f628c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f627b = recycleListView;
                this.f628c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f627b.isItemChecked(i2);
                }
                f.this.J.onClick(this.f628c.f558b, i2, this.f627b.isItemChecked(i2));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f595a = context;
            this.f596b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(android.support.v7.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f596b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.v7.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                android.support.v7.app.AlertController$f$a r9 = new android.support.v7.app.AlertController$f$a
                android.content.Context r3 = r10.f595a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f616v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                android.support.v7.app.AlertController$f$b r9 = new android.support.v7.app.AlertController$f$b
                android.content.Context r3 = r10.f595a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f595a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f617w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                android.support.v7.app.AlertController$h r9 = new android.support.v7.app.AlertController$h
                android.content.Context r1 = r10.f595a
                java.lang.CharSequence[] r3 = r10.f616v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                android.support.v7.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.x
                if (r1 == 0) goto L85
                android.support.v7.app.AlertController$f$c r1 = new android.support.v7.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                android.support.v7.app.AlertController$f$d r1 = new android.support.v7.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f563g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.f.b(android.support.v7.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f601g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f600f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f598d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i2 = this.f597c;
                if (i2 != 0) {
                    alertController.l(i2);
                }
                int i3 = this.f599e;
                if (i3 != 0) {
                    alertController.l(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.f602h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f603i;
            if (charSequence3 != null || this.f604j != null) {
                alertController.j(-1, charSequence3, this.f605k, null, this.f604j);
            }
            CharSequence charSequence4 = this.f606l;
            if (charSequence4 != null || this.f607m != null) {
                alertController.j(-2, charSequence4, this.f608n, null, this.f607m);
            }
            CharSequence charSequence5 = this.f609o;
            if (charSequence5 != null || this.f610p != null) {
                alertController.j(-3, charSequence5, this.f611q, null, this.f610p);
            }
            if (this.f616v != null || this.K != null || this.f617w != null) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 != null) {
                if (this.E) {
                    alertController.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i4 = this.y;
            if (i4 != 0) {
                alertController.q(i4);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f630a;

        public g(DialogInterface dialogInterface) {
            this.f630a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f630a.get(), message.what);
            } else if (i2 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, j jVar, Window window) {
        this.f557a = context;
        this.f558b = jVar;
        this.f559c = window;
        this.R = new g(jVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, s.j.E, s.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(s.j.F, 0);
        this.K = obtainStyledAttributes.getResourceId(s.j.H, 0);
        this.L = obtainStyledAttributes.getResourceId(s.j.J, 0);
        this.M = obtainStyledAttributes.getResourceId(s.j.K, 0);
        this.N = obtainStyledAttributes.getResourceId(s.j.M, 0);
        this.O = obtainStyledAttributes.getResourceId(s.j.I, 0);
        this.P = obtainStyledAttributes.getBoolean(s.j.L, true);
        this.f560d = obtainStyledAttributes.getDimensionPixelSize(s.j.G, 0);
        obtainStyledAttributes.recycle();
        jVar.f(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void e(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i2 = this.K;
        return (i2 != 0 && this.Q == 1) ? i2 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.f559c.findViewById(s.f.scrollIndicatorUp);
        View findViewById2 = this.f559c.findViewById(s.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            o.w(view, i2, i3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i2 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i2 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f562f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f563g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f563g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    private void t(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f571o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f572p) && this.f574r == null) {
            this.f571o.setVisibility(8);
            z = false;
        } else {
            this.f571o.setText(this.f572p);
            Drawable drawable = this.f574r;
            if (drawable != null) {
                int i2 = this.f560d;
                drawable.setBounds(0, 0, i2, i2);
                this.f571o.setCompoundDrawables(this.f574r, null, null, null);
            }
            this.f571o.setVisibility(0);
            z = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f575s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f576t) && this.f578v == null) {
            this.f575s.setVisibility(8);
        } else {
            this.f575s.setText(this.f576t);
            Drawable drawable2 = this.f578v;
            if (drawable2 != null) {
                int i3 = this.f560d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f575s.setCompoundDrawables(this.f578v, null, null, null);
            }
            this.f575s.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f579w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.x) && this.z == null) {
            this.f579w.setVisibility(8);
        } else {
            this.f579w.setText(this.x);
            Drawable drawable3 = this.f574r;
            if (drawable3 != null) {
                int i4 = this.f560d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f571o.setCompoundDrawables(this.f574r, null, null, null);
            }
            this.f579w.setVisibility(0);
            z |= true;
        }
        if (y(this.f557a)) {
            if (z) {
                button = this.f571o;
            } else if (z) {
                button = this.f575s;
            } else if (z) {
                button = this.f579w;
            }
            b(button);
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f559c.findViewById(s.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f562f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f563g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f563g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f564h;
        if (view == null) {
            view = this.f565i != 0 ? LayoutInflater.from(this.f557a).inflate(this.f565i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !a(view)) {
            this.f559c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f559c.findViewById(s.f.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f570n) {
            frameLayout.setPadding(this.f566j, this.f567k, this.f568l, this.f569m);
        }
        if (this.f563g != null) {
            ((i0.a) viewGroup.getLayoutParams()).f1054a = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f559c.findViewById(s.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f559c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f561e)) || !this.P) {
            this.f559c.findViewById(s.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f559c.findViewById(s.f.alertTitle);
        this.E = textView;
        textView.setText(this.f561e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f559c.findViewById(s.f.parentPanel);
        int i2 = s.f.topPanel;
        View findViewById4 = findViewById3.findViewById(i2);
        int i3 = s.f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i3);
        int i4 = s.f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(s.f.customPanel);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i2);
        View findViewById8 = viewGroup.findViewById(i3);
        View findViewById9 = viewGroup.findViewById(i4);
        ViewGroup h2 = h(findViewById7, findViewById4);
        ViewGroup h3 = h(findViewById8, findViewById5);
        ViewGroup h4 = h(findViewById9, findViewById6);
        u(h3);
        t(h4);
        w(h2);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (h2 == null || h2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (h4 == null || h4.getVisibility() == 8) ? false : true;
        if (!z3 && h3 != null && (findViewById2 = h3.findViewById(s.f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f562f != null || this.f563g != null) {
                view = h2.findViewById(s.f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (h3 != null && (findViewById = h3.findViewById(s.f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f563g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z2, z3);
        }
        if (!z) {
            View view2 = this.f563g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                o(h3, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f563g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.I;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(s.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f557a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public void d() {
        this.f558b.setContentView(i());
        x();
    }

    public boolean f(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.o(keyEvent);
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.o(keyEvent);
    }

    public void j(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.f576t = charSequence;
            this.f577u = message;
            this.f578v = drawable;
        } else if (i2 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f572p = charSequence;
            this.f573q = message;
            this.f574r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
        }
    }

    public void n(CharSequence charSequence) {
        this.f562f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f561e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i2) {
        this.f564h = null;
        this.f565i = i2;
        this.f570n = false;
    }

    public void r(View view) {
        this.f564h = view;
        this.f565i = 0;
        this.f570n = false;
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        this.f564h = view;
        this.f565i = 0;
        this.f570n = true;
        this.f566j = i2;
        this.f567k = i3;
        this.f568l = i4;
        this.f569m = i5;
    }
}
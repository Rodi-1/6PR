package android.support.p002v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.widget.NestedScrollView;
import android.support.p002v7.widget.C0272i0;
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
import p016o.C0490o;
import p019r.DialogC0557j;
import p020s.C0569a;
import p020s.C0574f;
import p020s.C0578j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AlertController */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f707A;

    /* renamed from: C */
    private Drawable f709C;

    /* renamed from: D */
    private ImageView f710D;

    /* renamed from: E */
    private TextView f711E;

    /* renamed from: F */
    private TextView f712F;

    /* renamed from: G */
    private View f713G;

    /* renamed from: H */
    ListAdapter f714H;

    /* renamed from: J */
    private int f716J;

    /* renamed from: K */
    private int f717K;

    /* renamed from: L */
    int f718L;

    /* renamed from: M */
    int f719M;

    /* renamed from: N */
    int f720N;

    /* renamed from: O */
    int f721O;

    /* renamed from: P */
    private boolean f722P;

    /* renamed from: R */
    Handler f724R;

    /* renamed from: a */
    private final Context f726a;

    /* renamed from: b */
    final DialogC0557j f727b;

    /* renamed from: c */
    private final Window f728c;

    /* renamed from: d */
    private final int f729d;

    /* renamed from: e */
    private CharSequence f730e;

    /* renamed from: f */
    private CharSequence f731f;

    /* renamed from: g */
    ListView f732g;

    /* renamed from: h */
    private View f733h;

    /* renamed from: i */
    private int f734i;

    /* renamed from: j */
    private int f735j;

    /* renamed from: k */
    private int f736k;

    /* renamed from: l */
    private int f737l;

    /* renamed from: m */
    private int f738m;

    /* renamed from: o */
    Button f740o;

    /* renamed from: p */
    private CharSequence f741p;

    /* renamed from: q */
    Message f742q;

    /* renamed from: r */
    private Drawable f743r;

    /* renamed from: s */
    Button f744s;

    /* renamed from: t */
    private CharSequence f745t;

    /* renamed from: u */
    Message f746u;

    /* renamed from: v */
    private Drawable f747v;

    /* renamed from: w */
    Button f748w;

    /* renamed from: x */
    private CharSequence f749x;

    /* renamed from: y */
    Message f750y;

    /* renamed from: z */
    private Drawable f751z;

    /* renamed from: n */
    private boolean f739n = false;

    /* renamed from: B */
    private int f708B = 0;

    /* renamed from: I */
    int f715I = -1;

    /* renamed from: Q */
    private int f723Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f725S = new View$OnClickListenerC0165a();

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b */
        private final int f752b;

        /* renamed from: c */
        private final int f753c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0578j.f2495S1);
            this.f753c = obtainStyledAttributes.getDimensionPixelOffset(C0578j.f2499T1, -1);
            this.f752b = obtainStyledAttributes.getDimensionPixelOffset(C0578j.f2503U1, -1);
        }

        /* renamed from: a */
        public void m1696a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f752b, getPaddingRight(), z2 ? getPaddingBottom() : this.f753c);
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0165a implements View.OnClickListener {
        View$OnClickListenerC0165a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f740o || (message2 = alertController.f742q) == null) && (view != alertController.f744s || (message2 = alertController.f746u) == null)) ? (view != alertController.f748w || (message = alertController.f750y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f724R.obtainMessage(1, alertController2.f727b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0166b implements NestedScrollView.InterfaceC0132b {

        /* renamed from: a */
        final /* synthetic */ View f755a;

        /* renamed from: b */
        final /* synthetic */ View f756b;

        C0166b(View view, View view2) {
            this.f755a = view;
            this.f756b = view2;
        }

        @Override // android.support.p001v4.widget.NestedScrollView.InterfaceC0132b
        /* renamed from: a */
        public void mo1695a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m1717e(nestedScrollView, this.f755a, this.f756b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0167c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f758b;

        /* renamed from: c */
        final /* synthetic */ View f759c;

        RunnableC0167c(View view, View view2) {
            this.f758b = view;
            this.f759c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m1717e(AlertController.this.f707A, this.f758b, this.f759c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0168d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f761a;

        /* renamed from: b */
        final /* synthetic */ View f762b;

        C0168d(View view, View view2) {
            this.f761a = view;
            this.f762b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1717e(absListView, this.f761a, this.f762b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0169e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f764b;

        /* renamed from: c */
        final /* synthetic */ View f765c;

        RunnableC0169e(View view, View view2) {
            this.f764b = view;
            this.f765c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m1717e(AlertController.this.f732g, this.f764b, this.f765c);
        }
    }

    /* renamed from: android.support.v7.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0170f {

        /* renamed from: A */
        public int f767A;

        /* renamed from: B */
        public int f768B;

        /* renamed from: C */
        public int f769C;

        /* renamed from: D */
        public int f770D;

        /* renamed from: F */
        public boolean[] f772F;

        /* renamed from: G */
        public boolean f773G;

        /* renamed from: H */
        public boolean f774H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f776J;

        /* renamed from: K */
        public Cursor f777K;

        /* renamed from: L */
        public String f778L;

        /* renamed from: M */
        public String f779M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f780N;

        /* renamed from: O */
        public InterfaceC0175e f781O;

        /* renamed from: a */
        public final Context f783a;

        /* renamed from: b */
        public final LayoutInflater f784b;

        /* renamed from: d */
        public Drawable f786d;

        /* renamed from: f */
        public CharSequence f788f;

        /* renamed from: g */
        public View f789g;

        /* renamed from: h */
        public CharSequence f790h;

        /* renamed from: i */
        public CharSequence f791i;

        /* renamed from: j */
        public Drawable f792j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f793k;

        /* renamed from: l */
        public CharSequence f794l;

        /* renamed from: m */
        public Drawable f795m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f796n;

        /* renamed from: o */
        public CharSequence f797o;

        /* renamed from: p */
        public Drawable f798p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f799q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f801s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f802t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f803u;

        /* renamed from: v */
        public CharSequence[] f804v;

        /* renamed from: w */
        public ListAdapter f805w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f806x;

        /* renamed from: y */
        public int f807y;

        /* renamed from: z */
        public View f808z;

        /* renamed from: c */
        public int f785c = 0;

        /* renamed from: e */
        public int f787e = 0;

        /* renamed from: E */
        public boolean f771E = false;

        /* renamed from: I */
        public int f775I = -1;

        /* renamed from: P */
        public boolean f782P = true;

        /* renamed from: r */
        public boolean f800r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class C0171a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f809b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0171a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f809b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0170f.this.f772F;
                if (zArr != null && zArr[i]) {
                    this.f809b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class C0172b extends CursorAdapter {

            /* renamed from: b */
            private final int f811b;

            /* renamed from: c */
            private final int f812c;

            /* renamed from: d */
            final /* synthetic */ RecycleListView f813d;

            /* renamed from: e */
            final /* synthetic */ AlertController f814e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f813d = recycleListView;
                this.f814e = alertController;
                Cursor cursor2 = getCursor();
                this.f811b = cursor2.getColumnIndexOrThrow(C0170f.this.f778L);
                this.f812c = cursor2.getColumnIndexOrThrow(C0170f.this.f779M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f811b));
                this.f813d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f812c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0170f.this.f784b.inflate(this.f814e.f719M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class C0173c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ AlertController f816b;

            C0173c(AlertController alertController) {
                this.f816b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0170f.this.f806x.onClick(this.f816b.f727b, i);
                if (C0170f.this.f774H) {
                    return;
                }
                this.f816b.f727b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class C0174d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f818b;

            /* renamed from: c */
            final /* synthetic */ AlertController f819c;

            C0174d(RecycleListView recycleListView, AlertController alertController) {
                this.f818b = recycleListView;
                this.f819c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0170f.this.f772F;
                if (zArr != null) {
                    zArr[i] = this.f818b.isItemChecked(i);
                }
                C0170f.this.f776J.onClick(this.f819c.f727b, i, this.f818b.isItemChecked(i));
            }
        }

        /* renamed from: android.support.v7.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface InterfaceC0175e {
            /* renamed from: a */
            void m1692a(ListView listView);
        }

        public C0170f(Context context) {
            this.f783a = context;
            this.f784b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m1693b(android.support.p002v7.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f784b
                int r1 = r11.f718L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p002v7.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f773G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.f777K
                if (r1 != 0) goto L26
                android.support.v7.app.AlertController$f$a r9 = new android.support.v7.app.AlertController$f$a
                android.content.Context r3 = r10.f783a
                int r4 = r11.f719M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f804v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                android.support.v7.app.AlertController$f$b r9 = new android.support.v7.app.AlertController$f$b
                android.content.Context r3 = r10.f783a
                android.database.Cursor r4 = r10.f777K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.f774H
                if (r1 == 0) goto L3c
                int r1 = r11.f720N
                goto L3e
            L3c:
                int r1 = r11.f721O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.f777K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f783a
                android.database.Cursor r5 = r10.f777K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f778L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f805w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                android.support.v7.app.AlertController$h r9 = new android.support.v7.app.AlertController$h
                android.content.Context r1 = r10.f783a
                java.lang.CharSequence[] r3 = r10.f804v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                android.support.v7.app.AlertController$f$e r1 = r10.f781O
                if (r1 == 0) goto L72
                r1.m1692a(r0)
            L72:
                r11.f714H = r9
                int r1 = r10.f775I
                r11.f715I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f806x
                if (r1 == 0) goto L85
                android.support.v7.app.AlertController$f$c r1 = new android.support.v7.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f776J
                if (r1 == 0) goto L8f
                android.support.v7.app.AlertController$f$d r1 = new android.support.v7.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f780N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.f774H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.f773G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f732g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p002v7.app.AlertController.C0170f.m1693b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public void m1694a(AlertController alertController) {
            View view = this.f789g;
            if (view != null) {
                alertController.m1711k(view);
            } else {
                CharSequence charSequence = this.f788f;
                if (charSequence != null) {
                    alertController.m1706p(charSequence);
                }
                Drawable drawable = this.f786d;
                if (drawable != null) {
                    alertController.m1709m(drawable);
                }
                int i = this.f785c;
                if (i != 0) {
                    alertController.m1710l(i);
                }
                int i2 = this.f787e;
                if (i2 != 0) {
                    alertController.m1710l(alertController.m1719c(i2));
                }
            }
            CharSequence charSequence2 = this.f790h;
            if (charSequence2 != null) {
                alertController.m1708n(charSequence2);
            }
            CharSequence charSequence3 = this.f791i;
            if (charSequence3 != null || this.f792j != null) {
                alertController.m1712j(-1, charSequence3, this.f793k, null, this.f792j);
            }
            CharSequence charSequence4 = this.f794l;
            if (charSequence4 != null || this.f795m != null) {
                alertController.m1712j(-2, charSequence4, this.f796n, null, this.f795m);
            }
            CharSequence charSequence5 = this.f797o;
            if (charSequence5 != null || this.f798p != null) {
                alertController.m1712j(-3, charSequence5, this.f799q, null, this.f798p);
            }
            if (this.f804v != null || this.f777K != null || this.f805w != null) {
                m1693b(alertController);
            }
            View view2 = this.f808z;
            if (view2 != null) {
                if (this.f771E) {
                    alertController.m1703s(view2, this.f767A, this.f768B, this.f769C, this.f770D);
                    return;
                } else {
                    alertController.m1704r(view2);
                    return;
                }
            }
            int i3 = this.f807y;
            if (i3 != 0) {
                alertController.m1705q(i3);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0176g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f821a;

        public HandlerC0176g(DialogInterface dialogInterface) {
            this.f821a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f821a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0177h extends ArrayAdapter<CharSequence> {
        public C0177h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0557j dialogC0557j, Window window) {
        this.f726a = context;
        this.f727b = dialogC0557j;
        this.f728c = window;
        this.f724R = new HandlerC0176g(dialogC0557j);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0578j.f2437E, C0569a.alertDialogStyle, 0);
        this.f716J = obtainStyledAttributes.getResourceId(C0578j.f2441F, 0);
        this.f717K = obtainStyledAttributes.getResourceId(C0578j.f2449H, 0);
        this.f718L = obtainStyledAttributes.getResourceId(C0578j.f2457J, 0);
        this.f719M = obtainStyledAttributes.getResourceId(C0578j.f2461K, 0);
        this.f720N = obtainStyledAttributes.getResourceId(C0578j.f2469M, 0);
        this.f721O = obtainStyledAttributes.getResourceId(C0578j.f2453I, 0);
        this.f722P = obtainStyledAttributes.getBoolean(C0578j.f2465L, true);
        this.f729d = obtainStyledAttributes.getDimensionPixelSize(C0578j.f2445G, 0);
        obtainStyledAttributes.recycle();
        dialogC0557j.m177f(1);
    }

    /* renamed from: a */
    static boolean m1721a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m1721a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    private void m1720b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    static void m1717e(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: h */
    private ViewGroup m1714h(View view, View view2) {
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

    /* renamed from: i */
    private int m1713i() {
        int i = this.f717K;
        return (i != 0 && this.f723Q == 1) ? i : this.f716J;
    }

    /* renamed from: o */
    private void m1707o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f728c.findViewById(C0574f.scrollIndicatorUp);
        View findViewById2 = this.f728c.findViewById(C0574f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0490o.m389w(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f731f != null) {
                this.f707A.setOnScrollChangeListener(new C0166b(findViewById, findViewById2));
                this.f707A.post(new RunnableC0167c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f732g;
            if (listView != null) {
                listView.setOnScrollListener(new C0168d(findViewById, findViewById2));
                this.f732g.post(new RunnableC0169e(findViewById, findViewById2));
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

    /* renamed from: t */
    private void m1702t(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f740o = button2;
        button2.setOnClickListener(this.f725S);
        if (TextUtils.isEmpty(this.f741p) && this.f743r == null) {
            this.f740o.setVisibility(8);
            z = false;
        } else {
            this.f740o.setText(this.f741p);
            Drawable drawable = this.f743r;
            if (drawable != null) {
                int i = this.f729d;
                drawable.setBounds(0, 0, i, i);
                this.f740o.setCompoundDrawables(this.f743r, null, null, null);
            }
            this.f740o.setVisibility(0);
            z = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f744s = button3;
        button3.setOnClickListener(this.f725S);
        if (TextUtils.isEmpty(this.f745t) && this.f747v == null) {
            this.f744s.setVisibility(8);
        } else {
            this.f744s.setText(this.f745t);
            Drawable drawable2 = this.f747v;
            if (drawable2 != null) {
                int i2 = this.f729d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f744s.setCompoundDrawables(this.f747v, null, null, null);
            }
            this.f744s.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f748w = button4;
        button4.setOnClickListener(this.f725S);
        if (TextUtils.isEmpty(this.f749x) && this.f751z == null) {
            this.f748w.setVisibility(8);
        } else {
            this.f748w.setText(this.f749x);
            Drawable drawable3 = this.f743r;
            if (drawable3 != null) {
                int i3 = this.f729d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f740o.setCompoundDrawables(this.f743r, null, null, null);
            }
            this.f748w.setVisibility(0);
            z |= true;
        }
        if (m1697y(this.f726a)) {
            if (z) {
                button = this.f740o;
            } else if (z) {
                button = this.f744s;
            } else if (z) {
                button = this.f748w;
            }
            m1720b(button);
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: u */
    private void m1701u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f728c.findViewById(C0574f.scrollView);
        this.f707A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f707A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f712F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f731f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f707A.removeView(this.f712F);
        if (this.f732g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f707A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f707A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f732g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: v */
    private void m1700v(ViewGroup viewGroup) {
        View view = this.f733h;
        if (view == null) {
            view = this.f734i != 0 ? LayoutInflater.from(this.f726a).inflate(this.f734i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m1721a(view)) {
            this.f728c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f728c.findViewById(C0574f.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f739n) {
            frameLayout.setPadding(this.f735j, this.f736k, this.f737l, this.f738m);
        }
        if (this.f732g != null) {
            ((C0272i0.C0273a) viewGroup.getLayoutParams()).f1342a = 0.0f;
        }
    }

    /* renamed from: w */
    private void m1699w(ViewGroup viewGroup) {
        if (this.f713G != null) {
            viewGroup.addView(this.f713G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f728c.findViewById(C0574f.title_template).setVisibility(8);
            return;
        }
        this.f710D = (ImageView) this.f728c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f730e)) || !this.f722P) {
            this.f728c.findViewById(C0574f.title_template).setVisibility(8);
            this.f710D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f728c.findViewById(C0574f.alertTitle);
        this.f711E = textView;
        textView.setText(this.f730e);
        int i = this.f708B;
        if (i != 0) {
            this.f710D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f709C;
        if (drawable != null) {
            this.f710D.setImageDrawable(drawable);
            return;
        }
        this.f711E.setPadding(this.f710D.getPaddingLeft(), this.f710D.getPaddingTop(), this.f710D.getPaddingRight(), this.f710D.getPaddingBottom());
        this.f710D.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private void m1698x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f728c.findViewById(C0574f.parentPanel);
        int i = C0574f.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C0574f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C0574f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0574f.customPanel);
        m1700v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup m1714h = m1714h(findViewById7, findViewById4);
        ViewGroup m1714h2 = m1714h(findViewById8, findViewById5);
        ViewGroup m1714h3 = m1714h(findViewById9, findViewById6);
        m1701u(m1714h2);
        m1702t(m1714h3);
        m1699w(m1714h);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (m1714h == null || m1714h.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (m1714h3 == null || m1714h3.getVisibility() == 8) ? false : true;
        if (!z3 && m1714h2 != null && (findViewById2 = m1714h2.findViewById(C0574f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f707A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f731f != null || this.f732g != null) {
                view = m1714h.findViewById(C0574f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (m1714h2 != null && (findViewById = m1714h2.findViewById(C0574f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f732g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m1696a(z2, z3);
        }
        if (!z) {
            View view2 = this.f732g;
            if (view2 == null) {
                view2 = this.f707A;
            }
            if (view2 != null) {
                m1707o(m1714h2, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f732g;
        if (listView2 == null || (listAdapter = this.f714H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i4 = this.f715I;
        if (i4 > -1) {
            listView2.setItemChecked(i4, true);
            listView2.setSelection(i4);
        }
    }

    /* renamed from: y */
    private static boolean m1697y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0569a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int m1719c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f726a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public void m1718d() {
        this.f727b.setContentView(m1713i());
        m1698x();
    }

    /* renamed from: f */
    public boolean m1716f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f707A;
        return nestedScrollView != null && nestedScrollView.m1797o(keyEvent);
    }

    /* renamed from: g */
    public boolean m1715g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f707A;
        return nestedScrollView != null && nestedScrollView.m1797o(keyEvent);
    }

    /* renamed from: j */
    public void m1712j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f724R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f749x = charSequence;
            this.f750y = message;
            this.f751z = drawable;
        } else if (i == -2) {
            this.f745t = charSequence;
            this.f746u = message;
            this.f747v = drawable;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f741p = charSequence;
            this.f742q = message;
            this.f743r = drawable;
        }
    }

    /* renamed from: k */
    public void m1711k(View view) {
        this.f713G = view;
    }

    /* renamed from: l */
    public void m1710l(int i) {
        this.f709C = null;
        this.f708B = i;
        ImageView imageView = this.f710D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f710D.setImageResource(this.f708B);
        }
    }

    /* renamed from: m */
    public void m1709m(Drawable drawable) {
        this.f709C = drawable;
        this.f708B = 0;
        ImageView imageView = this.f710D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f710D.setImageDrawable(drawable);
        }
    }

    /* renamed from: n */
    public void m1708n(CharSequence charSequence) {
        this.f731f = charSequence;
        TextView textView = this.f712F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public void m1706p(CharSequence charSequence) {
        this.f730e = charSequence;
        TextView textView = this.f711E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m1705q(int i) {
        this.f733h = null;
        this.f734i = i;
        this.f739n = false;
    }

    /* renamed from: r */
    public void m1704r(View view) {
        this.f733h = view;
        this.f734i = 0;
        this.f739n = false;
    }

    /* renamed from: s */
    public void m1703s(View view, int i, int i2, int i3, int i4) {
        this.f733h = view;
        this.f734i = 0;
        this.f739n = true;
        this.f735j = i;
        this.f736k = i2;
        this.f737l = i3;
        this.f738m = i4;
    }
}
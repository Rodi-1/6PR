package android.support.p001v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p001v4.widget.C0146e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.d */
/* loaded from: classes.dex */
public abstract class AbstractC0143d extends BaseAdapter implements Filterable, C0146e.InterfaceC0147a {

    /* renamed from: b */
    protected boolean f686b;

    /* renamed from: c */
    protected boolean f687c;

    /* renamed from: d */
    protected Cursor f688d;

    /* renamed from: e */
    protected Context f689e;

    /* renamed from: f */
    protected int f690f;

    /* renamed from: g */
    protected C0144a f691g;

    /* renamed from: h */
    protected DataSetObserver f692h;

    /* renamed from: i */
    protected C0146e f693i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.d$a */
    /* loaded from: classes.dex */
    public class C0144a extends ContentObserver {
        C0144a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0143d.this.m1744e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.d$b */
    /* loaded from: classes.dex */
    public class C0145b extends DataSetObserver {
        C0145b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0143d abstractC0143d = AbstractC0143d.this;
            abstractC0143d.f686b = true;
            abstractC0143d.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0143d abstractC0143d = AbstractC0143d.this;
            abstractC0143d.f686b = false;
            abstractC0143d.notifyDataSetInvalidated();
        }
    }

    public AbstractC0143d(Context context, Cursor cursor, boolean z) {
        m1745b(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public abstract void mo1161a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    void m1745b(Context context, Cursor cursor, int i) {
        C0145b c0145b;
        if ((i & 1) == 1) {
            i |= 2;
            this.f687c = true;
        } else {
            this.f687c = false;
        }
        boolean z = cursor != null;
        this.f688d = cursor;
        this.f686b = z;
        this.f689e = context;
        this.f690f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f691g = new C0144a();
            c0145b = new C0145b();
        } else {
            c0145b = null;
            this.f691g = null;
        }
        this.f692h = c0145b;
        if (z) {
            C0144a c0144a = this.f691g;
            if (c0144a != null) {
                cursor.registerContentObserver(c0144a);
            }
            DataSetObserver dataSetObserver = this.f692h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: c */
    public abstract View mo1722c(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.support.p001v4.widget.C0146e.InterfaceC0147a
    public void changeCursor(Cursor cursor) {
        Cursor m1743f = m1743f(cursor);
        if (m1743f != null) {
            m1743f.close();
        }
    }

    /* renamed from: d */
    public abstract View mo1160d(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: e */
    protected void m1744e() {
        Cursor cursor;
        if (!this.f687c || (cursor = this.f688d) == null || cursor.isClosed()) {
            return;
        }
        this.f686b = this.f688d.requery();
    }

    /* renamed from: f */
    public Cursor m1743f(Cursor cursor) {
        Cursor cursor2 = this.f688d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0144a c0144a = this.f691g;
            if (c0144a != null) {
                cursor2.unregisterContentObserver(c0144a);
            }
            DataSetObserver dataSetObserver = this.f692h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f688d = cursor;
        if (cursor != null) {
            C0144a c0144a2 = this.f691g;
            if (c0144a2 != null) {
                cursor.registerContentObserver(c0144a2);
            }
            DataSetObserver dataSetObserver2 = this.f692h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f690f = cursor.getColumnIndexOrThrow("_id");
            this.f686b = true;
            notifyDataSetChanged();
        } else {
            this.f690f = -1;
            this.f686b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f686b || (cursor = this.f688d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.support.p001v4.widget.C0146e.InterfaceC0147a
    public Cursor getCursor() {
        return this.f688d;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f686b) {
            this.f688d.moveToPosition(i);
            if (view == null) {
                view = mo1722c(this.f689e, this.f688d, viewGroup);
            }
            mo1161a(view, this.f689e, this.f688d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f693i == null) {
            this.f693i = new C0146e(this);
        }
        return this.f693i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f686b || (cursor = this.f688d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f688d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f686b && (cursor = this.f688d) != null && cursor.moveToPosition(i)) {
            return this.f688d.getLong(this.f690f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f686b) {
            if (this.f688d.moveToPosition(i)) {
                if (view == null) {
                    view = mo1160d(this.f689e, this.f688d, viewGroup);
                }
                mo1161a(view, this.f689e, this.f688d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
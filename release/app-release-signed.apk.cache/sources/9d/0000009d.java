package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class d extends BaseAdapter implements Filterable, e.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f536b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f537c;

    /* renamed from: d  reason: collision with root package name */
    protected Cursor f538d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f539e;

    /* renamed from: f  reason: collision with root package name */
    protected int f540f;

    /* renamed from: g  reason: collision with root package name */
    protected a f541g;

    /* renamed from: h  reason: collision with root package name */
    protected DataSetObserver f542h;

    /* renamed from: i  reason: collision with root package name */
    protected e f543i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            d.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            d dVar = d.this;
            dVar.f536b = true;
            dVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            d dVar = d.this;
            dVar.f536b = false;
            dVar.notifyDataSetInvalidated();
        }
    }

    public d(Context context, Cursor cursor, boolean z) {
        b(context, cursor, z ? 1 : 2);
    }

    public abstract void a(View view, Context context, Cursor cursor);

    void b(Context context, Cursor cursor, int i2) {
        b bVar;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f537c = true;
        } else {
            this.f537c = false;
        }
        boolean z = cursor != null;
        this.f538d = cursor;
        this.f536b = z;
        this.f539e = context;
        this.f540f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f541g = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f541g = null;
        }
        this.f542h = bVar;
        if (z) {
            a aVar = this.f541g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f542h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View c(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.support.v4.widget.e.a
    public void changeCursor(Cursor cursor) {
        Cursor f2 = f(cursor);
        if (f2 != null) {
            f2.close();
        }
    }

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void e() {
        Cursor cursor;
        if (!this.f537c || (cursor = this.f538d) == null || cursor.isClosed()) {
            return;
        }
        this.f536b = this.f538d.requery();
    }

    public Cursor f(Cursor cursor) {
        Cursor cursor2 = this.f538d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f541g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f542h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f538d = cursor;
        if (cursor != null) {
            a aVar2 = this.f541g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f542h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f540f = cursor.getColumnIndexOrThrow("_id");
            this.f536b = true;
            notifyDataSetChanged();
        } else {
            this.f540f = -1;
            this.f536b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f536b || (cursor = this.f538d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.support.v4.widget.e.a
    public Cursor getCursor() {
        return this.f538d;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (this.f536b) {
            this.f538d.moveToPosition(i2);
            if (view == null) {
                view = c(this.f539e, this.f538d, viewGroup);
            }
            a(view, this.f539e, this.f538d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f543i == null) {
            this.f543i = new e(this);
        }
        return this.f543i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f536b || (cursor = this.f538d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f538d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f536b && (cursor = this.f538d) != null && cursor.moveToPosition(i2)) {
            return this.f538d.getLong(this.f540f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (this.f536b) {
            if (this.f538d.moveToPosition(i2)) {
                if (view == null) {
                    view = d(this.f539e, this.f538d, viewGroup);
                }
                a(view, this.f539e, this.f538d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
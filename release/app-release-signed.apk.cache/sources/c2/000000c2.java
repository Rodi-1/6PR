package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import r.j;

/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: c  reason: collision with root package name */
    final AlertController f631c;

    /* renamed from: android.support.v7.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0007a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f632a;

        /* renamed from: b  reason: collision with root package name */
        private final int f633b;

        public C0007a(Context context) {
            this(context, a.g(context, 0));
        }

        public C0007a(Context context, int i2) {
            this.f632a = new AlertController.f(new ContextThemeWrapper(context, a.g(context, i2)));
            this.f633b = i2;
        }

        public a a() {
            a aVar = new a(this.f632a.f595a, this.f633b);
            this.f632a.a(aVar.f631c);
            aVar.setCancelable(this.f632a.f612r);
            if (this.f632a.f612r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f632a.f613s);
            aVar.setOnDismissListener(this.f632a.f614t);
            DialogInterface.OnKeyListener onKeyListener = this.f632a.f615u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f632a.f595a;
        }

        public C0007a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f632a;
            fVar.f617w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public C0007a d(View view) {
            this.f632a.f601g = view;
            return this;
        }

        public C0007a e(Drawable drawable) {
            this.f632a.f598d = drawable;
            return this;
        }

        public C0007a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f632a.f615u = onKeyListener;
            return this;
        }

        public C0007a g(CharSequence charSequence) {
            this.f632a.f600f = charSequence;
            return this;
        }
    }

    protected a(Context context, int i2) {
        super(context, g(context, i2));
        this.f631c = new AlertController(getContext(), this, getWindow());
    }

    static int g(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(s.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f631c.d();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f631c.f(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f631c.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // r.j, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f631c.p(charSequence);
    }
}
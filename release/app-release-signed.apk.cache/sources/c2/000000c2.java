package android.support.p002v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p002v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import p019r.DialogC0557j;
import p020s.C0569a;

/* renamed from: android.support.v7.app.a */
/* loaded from: classes.dex */
public class DialogC0178a extends DialogC0557j {

    /* renamed from: c */
    final AlertController f822c;

    /* renamed from: android.support.v7.app.a$a */
    /* loaded from: classes.dex */
    public static class C0179a {

        /* renamed from: a */
        private final AlertController.C0170f f823a;

        /* renamed from: b */
        private final int f824b;

        public C0179a(Context context) {
            this(context, DialogC0178a.m1691g(context, 0));
        }

        public C0179a(Context context, int i) {
            this.f823a = new AlertController.C0170f(new ContextThemeWrapper(context, DialogC0178a.m1691g(context, i)));
            this.f824b = i;
        }

        /* renamed from: a */
        public DialogC0178a m1690a() {
            DialogC0178a dialogC0178a = new DialogC0178a(this.f823a.f783a, this.f824b);
            this.f823a.m1694a(dialogC0178a.f822c);
            dialogC0178a.setCancelable(this.f823a.f800r);
            if (this.f823a.f800r) {
                dialogC0178a.setCanceledOnTouchOutside(true);
            }
            dialogC0178a.setOnCancelListener(this.f823a.f801s);
            dialogC0178a.setOnDismissListener(this.f823a.f802t);
            DialogInterface.OnKeyListener onKeyListener = this.f823a.f803u;
            if (onKeyListener != null) {
                dialogC0178a.setOnKeyListener(onKeyListener);
            }
            return dialogC0178a;
        }

        /* renamed from: b */
        public Context m1689b() {
            return this.f823a.f783a;
        }

        /* renamed from: c */
        public C0179a m1688c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0170f c0170f = this.f823a;
            c0170f.f805w = listAdapter;
            c0170f.f806x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0179a m1687d(View view) {
            this.f823a.f789g = view;
            return this;
        }

        /* renamed from: e */
        public C0179a m1686e(Drawable drawable) {
            this.f823a.f786d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0179a m1685f(DialogInterface.OnKeyListener onKeyListener) {
            this.f823a.f803u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public C0179a m1684g(CharSequence charSequence) {
            this.f823a.f788f = charSequence;
            return this;
        }
    }

    protected DialogC0178a(Context context, int i) {
        super(context, m1691g(context, i));
        this.f822c = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: g */
    static int m1691g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0569a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p019r.DialogC0557j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f822c.m1718d();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f822c.m1716f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f822c.m1715g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p019r.DialogC0557j, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f822c.m1706p(charSequence);
    }
}
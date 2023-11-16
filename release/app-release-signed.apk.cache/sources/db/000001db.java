package me.test.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import p019r.ActivityC0529b;

/* loaded from: classes.dex */
public class MainActivity extends ActivityC0529b {

    /* renamed from: B */
    private static int f2119B = 10;

    /* renamed from: A */
    private String f2120A;

    /* renamed from: s */
    private C0444a f2121s;

    /* renamed from: t */
    private TextView f2122t;

    /* renamed from: u */
    private TextView f2123u;

    /* renamed from: v */
    private TextView f2124v;

    /* renamed from: w */
    private TextView f2125w;

    /* renamed from: x */
    private TextView f2126x;

    /* renamed from: y */
    private double f2127y;

    /* renamed from: z */
    private double f2128z;

    /* renamed from: me.test.calculator.MainActivity$a */
    /* loaded from: classes.dex */
    class View$OnLongClickListenerC0441a implements View.OnLongClickListener {
        View$OnLongClickListenerC0441a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            MainActivity.this.m569C();
            return false;
        }
    }

    /* renamed from: me.test.calculator.MainActivity$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0442b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2130a;

        static {
            int[] iArr = new int[EnumC0443c.values().length];
            f2130a = iArr;
            try {
                iArr[EnumC0443c.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2130a[EnumC0443c.SUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2130a[EnumC0443c.MUL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2130a[EnumC0443c.DIV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2130a[EnumC0443c.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2130a[EnumC0443c.ROOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2130a[EnumC0443c.POW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2130a[EnumC0443c.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me.test.calculator.MainActivity$c */
    /* loaded from: classes.dex */
    public enum EnumC0443c {
        ADD,
        SUB,
        MUL,
        DIV,
        MOD,
        ROOT,
        POW,
        NULL
    }

    /* renamed from: B */
    private void m570B(TextView textView) {
        String charSequence = textView.getText().toString();
        textView.setText(charSequence.substring(0, charSequence.length() - 1));
    }

    /* renamed from: D */
    private void m568D(String str) {
        TextView textView;
        if (this.f2120A.equals(EnumC0443c.NULL.name())) {
            if (this.f2122t.getText().toString().contains(".")) {
                f2119B++;
            }
            if (this.f2122t.getText().length() < f2119B) {
                textView = this.f2122t;
                textView.append(str);
                f2119B = 10;
                return;
            }
            f2119B = 10;
            Toast.makeText(this, "Cannot have more than 10 numbers", 1).show();
        }
        if (this.f2122t.getText().toString().contains(".")) {
            f2119B++;
        }
        if (this.f2123u.getText().length() < f2119B) {
            textView = this.f2123u;
            textView.append(str);
            f2119B = 10;
            return;
        }
        f2119B = 10;
        Toast.makeText(this, "Cannot have more than 10 numbers", 1).show();
    }

    /* renamed from: C */
    public void m569C() {
        this.f2122t.setText("");
        this.f2124v.setText("");
        this.f2123u.setText("");
        this.f2127y = 0.0d;
        this.f2128z = 0.0d;
        this.f2120A = EnumC0443c.NULL.name();
    }

    public void onBackspaceClick(View view) {
        TextView textView;
        view.setOnLongClickListener(new View$OnLongClickListenerC0441a());
        if (!this.f2123u.getText().toString().equals("")) {
            textView = this.f2123u;
        } else if (!this.f2124v.getText().toString().equals("")) {
            textView = this.f2124v;
        } else if (this.f2122t.getText().toString().equals("")) {
            return;
        } else {
            textView = this.f2122t;
        }
        m570B(textView);
    }

    public void onClearClick(View view) {
        m569C();
        this.f2125w.setText("");
        this.f2126x.setText("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p019r.ActivityC0529b, android.support.p001v4.app.ActivityC0079h, android.support.p001v4.app.ActivityC0130z, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.f2121s = new C0444a();
        this.f2122t = (TextView) findViewById(R.id.input_value_1);
        this.f2123u = (TextView) findViewById(R.id.input_value_2);
        this.f2124v = (TextView) findViewById(R.id.input_operation);
        this.f2125w = (TextView) findViewById(R.id.textView_result);
        this.f2126x = (TextView) findViewById(R.id.complete_operation);
        EnumC0443c enumC0443c = EnumC0443c.NULL;
        this.f2120A = enumC0443c.name();
        if (bundle != null) {
            this.f2122t.setText(bundle.getString("First_number", ""));
            this.f2123u.setText(bundle.getString("Second_number", ""));
            this.f2124v.setText(bundle.getString("Operation", ""));
            this.f2125w.setText(bundle.getString("Final_result", ""));
            this.f2126x.setText(bundle.getString("Complete_operation", ""));
            this.f2120A = bundle.getString("Operation_string", enumC0443c.name());
            this.f2127y = bundle.getDouble("Number_one", 0.0d);
            this.f2128z = bundle.getDouble("Number_two", 0.0d);
        }
    }

    public void onEqualsClick(View view) {
        StringBuilder sb;
        int i;
        String str = "";
        if (this.f2122t.getText().toString().equals("") || this.f2124v.getText().toString().equals("") || this.f2123u.getText().toString().equals("")) {
            Toast.makeText(this, "Enter the numbers and the operation", 1).show();
            return;
        }
        this.f2127y = Double.parseDouble(this.f2122t.getText().toString());
        this.f2128z = Double.parseDouble(this.f2123u.getText().toString());
        switch (C0442b.f2130a[EnumC0443c.valueOf(this.f2120A).ordinal()]) {
            case 1:
                this.f2125w.setText(String.valueOf(this.f2121s.m566a(this.f2127y, this.f2128z)));
                sb = new StringBuilder();
                sb.append(this.f2122t.getText().toString());
                i = R.string.button_plus;
                sb.append(getString(i));
                sb.append(this.f2123u.getText().toString());
                str = sb.toString();
                break;
            case 2:
                this.f2125w.setText(String.valueOf(this.f2121s.m560g(this.f2127y, this.f2128z)));
                sb = new StringBuilder();
                sb.append(this.f2122t.getText().toString());
                i = R.string.button_minus;
                sb.append(getString(i));
                sb.append(this.f2123u.getText().toString());
                str = sb.toString();
                break;
            case 3:
                this.f2125w.setText(String.valueOf(this.f2121s.m563d(this.f2127y, this.f2128z)));
                sb = new StringBuilder();
                sb.append(this.f2122t.getText().toString());
                i = R.string.button_mul;
                sb.append(getString(i));
                sb.append(this.f2123u.getText().toString());
                str = sb.toString();
                break;
            case 4:
                try {
                    this.f2125w.setText(String.valueOf(this.f2121s.m565b(this.f2127y, this.f2128z)));
                    str = this.f2122t.getText().toString() + getString(R.string.button_div) + this.f2123u.getText().toString();
                    break;
                } catch (IllegalArgumentException unused) {
                    Toast.makeText(this, getString(R.string.error), 1).show();
                    m569C();
                    break;
                }
            case 5:
                this.f2125w.setText(String.valueOf(this.f2121s.m564c(this.f2127y, this.f2128z)));
                sb = new StringBuilder();
                sb.append(this.f2122t.getText().toString());
                i = R.string.button_mod;
                sb.append(getString(i));
                sb.append(this.f2123u.getText().toString());
                str = sb.toString();
                break;
            case 6:
                this.f2125w.setText(String.valueOf(this.f2121s.m561f(this.f2127y, this.f2128z)));
                sb = new StringBuilder();
                sb.append(this.f2122t.getText().toString());
                i = R.string.button_root;
                sb.append(getString(i));
                sb.append(this.f2123u.getText().toString());
                str = sb.toString();
                break;
            case 7:
                this.f2125w.setText(String.valueOf(this.f2121s.m562e(this.f2127y, this.f2128z)));
                sb = new StringBuilder();
                sb.append(this.f2122t.getText().toString());
                i = R.string.button_pow;
                sb.append(getString(i));
                sb.append(this.f2123u.getText().toString());
                str = sb.toString();
                break;
            case 8:
                this.f2125w.setText(getString(R.string.error));
                break;
        }
        this.f2126x.setText(str);
        m569C();
    }

    public void onNumClick(View view) {
        TextView textView;
        String str;
        if (!this.f2125w.getText().toString().equals("")) {
            onClearClick(view);
        }
        switch (view.getId()) {
            case R.id.button_dot /* 2131165224 */:
                if (this.f2120A.equals(EnumC0443c.NULL.name())) {
                    if (!this.f2122t.getText().toString().contains(".")) {
                        textView = this.f2122t;
                        textView.append(".");
                        return;
                    }
                    Toast.makeText(this, "Cannot have more than one decimal point in a number", 1).show();
                    return;
                }
                if (!this.f2123u.getText().toString().contains(".")) {
                    textView = this.f2123u;
                    textView.append(".");
                    return;
                }
                Toast.makeText(this, "Cannot have more than one decimal point in a number", 1).show();
                return;
            case R.id.button_eight /* 2131165225 */:
                str = "8";
                break;
            case R.id.button_equals /* 2131165226 */:
            case R.id.button_minus /* 2131165229 */:
            case R.id.button_mod /* 2131165230 */:
            case R.id.button_multiply /* 2131165231 */:
            case R.id.button_plus /* 2131165234 */:
            case R.id.button_pow /* 2131165235 */:
            case R.id.button_root /* 2131165236 */:
            default:
                return;
            case R.id.button_five /* 2131165227 */:
                str = "5";
                break;
            case R.id.button_four /* 2131165228 */:
                str = "4";
                break;
            case R.id.button_nine /* 2131165232 */:
                str = "9";
                break;
            case R.id.button_one /* 2131165233 */:
                str = "1";
                break;
            case R.id.button_seven /* 2131165237 */:
                str = "7";
                break;
            case R.id.button_six /* 2131165238 */:
                str = "6";
                break;
            case R.id.button_three /* 2131165239 */:
                str = "3";
                break;
            case R.id.button_two /* 2131165240 */:
                str = "2";
                break;
            case R.id.button_zero /* 2131165241 */:
                str = "0";
                break;
        }
        m568D(str);
    }

    public void onOperatorClick(View view) {
        TextView textView;
        String str;
        boolean equals = this.f2122t.getText().toString().equals("");
        int id = view.getId();
        if (!equals) {
            if (id != R.id.button_divide) {
                switch (id) {
                    case R.id.button_minus /* 2131165229 */:
                        this.f2120A = EnumC0443c.SUB.name();
                        textView = this.f2124v;
                        str = "-";
                        break;
                    case R.id.button_mod /* 2131165230 */:
                        this.f2120A = EnumC0443c.MOD.name();
                        textView = this.f2124v;
                        str = "%";
                        break;
                    case R.id.button_multiply /* 2131165231 */:
                        this.f2120A = EnumC0443c.MUL.name();
                        textView = this.f2124v;
                        str = "x";
                        break;
                    default:
                        switch (id) {
                            case R.id.button_plus /* 2131165234 */:
                                this.f2120A = EnumC0443c.ADD.name();
                                textView = this.f2124v;
                                str = "+";
                                break;
                            case R.id.button_pow /* 2131165235 */:
                                this.f2120A = EnumC0443c.POW.name();
                                textView = this.f2124v;
                                str = "^";
                                break;
                            case R.id.button_root /* 2131165236 */:
                                break;
                            default:
                                this.f2120A = EnumC0443c.NULL.name();
                                return;
                        }
                }
            } else {
                this.f2120A = EnumC0443c.DIV.name();
                textView = this.f2124v;
                str = "/";
            }
            textView.setText(str);
            return;
        } else if (id != R.id.button_root) {
            Toast.makeText(this, "Enter first number before operation", 1).show();
            return;
        } else {
            this.f2122t.setText("1");
        }
        this.f2120A = EnumC0443c.ROOT.name();
        this.f2124v.setText("√");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p019r.ActivityC0529b, android.support.p001v4.app.ActivityC0079h, android.support.p001v4.app.ActivityC0130z, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("First_number", this.f2122t.getText().toString());
        bundle.putString("Operation", this.f2124v.getText().toString());
        bundle.putString("Second_number", this.f2123u.getText().toString());
        bundle.putString("Final_result", this.f2125w.getText().toString());
        bundle.putString("Complete_operation", this.f2126x.getText().toString());
        bundle.putString("Operation_string", this.f2120A);
        bundle.putDouble("Number_one", this.f2127y);
        bundle.putDouble("Number_two", this.f2128z);
    }
}
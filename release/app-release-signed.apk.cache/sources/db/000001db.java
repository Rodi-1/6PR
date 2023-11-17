package me.test.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/* loaded from: classes.dex */
public class MainActivity extends r.b {
    private static int B = 10;
    private String A;

    /* renamed from: s  reason: collision with root package name */
    private me.test.calculator.a f1606s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f1607t;

    /* renamed from: u  reason: collision with root package name */
    private TextView f1608u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f1609v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f1610w;
    private TextView x;
    private double y;
    private double z;

    /* loaded from: classes.dex */
    class a implements View.OnLongClickListener {
        a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            MainActivity.this.C();
            return false;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1612a;

        static {
            int[] iArr = new int[c.values().length];
            f1612a = iArr;
            try {
                iArr[c.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1612a[c.SUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1612a[c.MUL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1612a[c.DIV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1612a[c.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1612a[c.ROOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1612a[c.POW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1612a[c.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        ADD,
        SUB,
        MUL,
        DIV,
        MOD,
        ROOT,
        POW,
        NULL
    }

    private void B(TextView textView) {
        String charSequence = textView.getText().toString();
        textView.setText(charSequence.substring(0, charSequence.length() - 1));
    }

    private void D(String str) {
        TextView textView;
        if (this.A.equals(c.NULL.name())) {
            if (this.f1607t.getText().toString().contains(".")) {
                B++;
            }
            if (this.f1607t.getText().length() < B) {
                textView = this.f1607t;
                textView.append(str);
                B = 10;
                return;
            }
            B = 10;
            Toast.makeText(this, "Cannot have more than 10 numbers", 1).show();
        }
        if (this.f1607t.getText().toString().contains(".")) {
            B++;
        }
        if (this.f1608u.getText().length() < B) {
            textView = this.f1608u;
            textView.append(str);
            B = 10;
            return;
        }
        B = 10;
        Toast.makeText(this, "Cannot have more than 10 numbers", 1).show();
    }

    public void C() {
        this.f1607t.setText("");
        this.f1609v.setText("");
        this.f1608u.setText("");
        this.y = 0.0d;
        this.z = 0.0d;
        this.A = c.NULL.name();
    }

    public void onBackspaceClick(View view) {
        TextView textView;
        view.setOnLongClickListener(new a());
        if (!this.f1608u.getText().toString().equals("")) {
            textView = this.f1608u;
        } else if (!this.f1609v.getText().toString().equals("")) {
            textView = this.f1609v;
        } else if (this.f1607t.getText().toString().equals("")) {
            return;
        } else {
            textView = this.f1607t;
        }
        B(textView);
    }

    public void onClearClick(View view) {
        C();
        this.f1610w.setText("");
        this.x.setText("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r.b, android.support.v4.app.h, android.support.v4.app.z, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.f1606s = new me.test.calculator.a();
        this.f1607t = (TextView) findViewById(R.id.input_value_1);
        this.f1608u = (TextView) findViewById(R.id.input_value_2);
        this.f1609v = (TextView) findViewById(R.id.input_operation);
        this.f1610w = (TextView) findViewById(R.id.textView_result);
        this.x = (TextView) findViewById(R.id.complete_operation);
        c cVar = c.NULL;
        this.A = cVar.name();
        if (bundle != null) {
            this.f1607t.setText(bundle.getString("First_number", ""));
            this.f1608u.setText(bundle.getString("Second_number", ""));
            this.f1609v.setText(bundle.getString("Operation", ""));
            this.f1610w.setText(bundle.getString("Final_result", ""));
            this.x.setText(bundle.getString("Complete_operation", ""));
            this.A = bundle.getString("Operation_string", cVar.name());
            this.y = bundle.getDouble("Number_one", 0.0d);
            this.z = bundle.getDouble("Number_two", 0.0d);
        }
    }

    public void onEqualsClick(View view) {
        StringBuilder sb;
        int i2;
        String str = "";
        if (this.f1607t.getText().toString().equals("") || this.f1609v.getText().toString().equals("") || this.f1608u.getText().toString().equals("")) {
            Toast.makeText(this, "Enter the numbers and the operation", 1).show();
            return;
        }
        this.y = Double.parseDouble(this.f1607t.getText().toString());
        this.z = Double.parseDouble(this.f1608u.getText().toString());
        switch (b.f1612a[c.valueOf(this.A).ordinal()]) {
            case 1:
                this.f1610w.setText(String.valueOf(this.f1606s.a(this.y, this.z)));
                sb = new StringBuilder();
                sb.append(this.f1607t.getText().toString());
                i2 = R.string.button_plus;
                sb.append(getString(i2));
                sb.append(this.f1608u.getText().toString());
                str = sb.toString();
                break;
            case 2:
                this.f1610w.setText(String.valueOf(this.f1606s.g(this.y, this.z)));
                sb = new StringBuilder();
                sb.append(this.f1607t.getText().toString());
                i2 = R.string.button_minus;
                sb.append(getString(i2));
                sb.append(this.f1608u.getText().toString());
                str = sb.toString();
                break;
            case 3:
                this.f1610w.setText(String.valueOf(this.f1606s.d(this.y, this.z)));
                sb = new StringBuilder();
                sb.append(this.f1607t.getText().toString());
                i2 = R.string.button_mul;
                sb.append(getString(i2));
                sb.append(this.f1608u.getText().toString());
                str = sb.toString();
                break;
            case 4:
                try {
                    this.f1610w.setText(String.valueOf(this.f1606s.b(this.y, this.z)));
                    str = this.f1607t.getText().toString() + getString(R.string.button_div) + this.f1608u.getText().toString();
                    break;
                } catch (IllegalArgumentException unused) {
                    Toast.makeText(this, getString(R.string.error), 1).show();
                    C();
                    break;
                }
            case 5:
                this.f1610w.setText(String.valueOf(this.f1606s.c(this.y, this.z)));
                sb = new StringBuilder();
                sb.append(this.f1607t.getText().toString());
                i2 = R.string.button_mod;
                sb.append(getString(i2));
                sb.append(this.f1608u.getText().toString());
                str = sb.toString();
                break;
            case 6:
                this.f1610w.setText(String.valueOf(this.f1606s.f(this.y, this.z)));
                sb = new StringBuilder();
                sb.append(this.f1607t.getText().toString());
                i2 = R.string.button_root;
                sb.append(getString(i2));
                sb.append(this.f1608u.getText().toString());
                str = sb.toString();
                break;
            case 7:
                this.f1610w.setText(String.valueOf(this.f1606s.e(this.y, this.z)));
                sb = new StringBuilder();
                sb.append(this.f1607t.getText().toString());
                i2 = R.string.button_pow;
                sb.append(getString(i2));
                sb.append(this.f1608u.getText().toString());
                str = sb.toString();
                break;
            case 8:
                this.f1610w.setText(getString(R.string.error));
                break;
        }
        this.x.setText(str);
        C();
    }

    public void onNumClick(View view) {
        TextView textView;
        String str;
        if (!this.f1610w.getText().toString().equals("")) {
            onClearClick(view);
        }
        switch (view.getId()) {
            case R.id.button_dot /* 2131165224 */:
                if (this.A.equals(c.NULL.name())) {
                    if (!this.f1607t.getText().toString().contains(".")) {
                        textView = this.f1607t;
                        textView.append(".");
                        return;
                    }
                    Toast.makeText(this, "Cannot have more than one decimal point in a number", 1).show();
                    return;
                }
                if (!this.f1608u.getText().toString().contains(".")) {
                    textView = this.f1608u;
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
        D(str);
    }

    public void onOperatorClick(View view) {
        TextView textView;
        String str;
        boolean equals = this.f1607t.getText().toString().equals("");
        int id = view.getId();
        if (!equals) {
            if (id != R.id.button_divide) {
                switch (id) {
                    case R.id.button_minus /* 2131165229 */:
                        this.A = c.SUB.name();
                        textView = this.f1609v;
                        str = "-";
                        break;
                    case R.id.button_mod /* 2131165230 */:
                        this.A = c.MOD.name();
                        textView = this.f1609v;
                        str = "%";
                        break;
                    case R.id.button_multiply /* 2131165231 */:
                        this.A = c.MUL.name();
                        textView = this.f1609v;
                        str = "x";
                        break;
                    default:
                        switch (id) {
                            case R.id.button_plus /* 2131165234 */:
                                this.A = c.ADD.name();
                                textView = this.f1609v;
                                str = "+";
                                break;
                            case R.id.button_pow /* 2131165235 */:
                                this.A = c.POW.name();
                                textView = this.f1609v;
                                str = "^";
                                break;
                            case R.id.button_root /* 2131165236 */:
                                break;
                            default:
                                this.A = c.NULL.name();
                                return;
                        }
                }
            } else {
                this.A = c.DIV.name();
                textView = this.f1609v;
                str = "/";
            }
            textView.setText(str);
            return;
        } else if (id != R.id.button_root) {
            Toast.makeText(this, "Enter first number before operation", 1).show();
            return;
        } else {
            this.f1607t.setText("1");
        }
        this.A = c.ROOT.name();
        this.f1609v.setText("√");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r.b, android.support.v4.app.h, android.support.v4.app.z, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("First_number", this.f1607t.getText().toString());
        bundle.putString("Operation", this.f1609v.getText().toString());
        bundle.putString("Second_number", this.f1608u.getText().toString());
        bundle.putString("Final_result", this.f1610w.getText().toString());
        bundle.putString("Complete_operation", this.x.getText().toString());
        bundle.putString("Operation_string", this.A);
        bundle.putDouble("Number_one", this.y);
        bundle.putDouble("Number_two", this.z);
    }
}
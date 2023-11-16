package me.test.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    private static int MAX_CHARACTERS = 10;
    private Calculator mCalculator;
    private TextView mCompleteOperation;
    private TextView mFinalResultTextView;
    private TextView mInputValue1TextView;
    private TextView mInputValue2TextView;
    private TextView mOperatorTextView;
    private double number_one;
    private double number_two;
    private String operation_string;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum operator {
        ADD,
        SUB,
        MUL,
        DIV,
        MOD,
        ROOT,
        POW,
        NULL
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mCalculator = new Calculator();
        this.mInputValue1TextView = (TextView) findViewById(R.id.input_value_1);
        this.mInputValue2TextView = (TextView) findViewById(R.id.input_value_2);
        this.mOperatorTextView = (TextView) findViewById(R.id.input_operation);
        this.mFinalResultTextView = (TextView) findViewById(R.id.textView_result);
        this.mCompleteOperation = (TextView) findViewById(R.id.complete_operation);
        this.operation_string = operator.NULL.name();
        if (savedInstanceState != null) {
            this.mInputValue1TextView.setText(savedInstanceState.getString("First_number", ""));
            this.mInputValue2TextView.setText(savedInstanceState.getString("Second_number", ""));
            this.mOperatorTextView.setText(savedInstanceState.getString("Operation", ""));
            this.mFinalResultTextView.setText(savedInstanceState.getString("Final_result", ""));
            this.mCompleteOperation.setText(savedInstanceState.getString("Complete_operation", ""));
            this.operation_string = savedInstanceState.getString("Operation_string", operator.NULL.name());
            this.number_one = savedInstanceState.getDouble("Number_one", 0.0d);
            this.number_two = savedInstanceState.getDouble("Number_two", 0.0d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("First_number", this.mInputValue1TextView.getText().toString());
        outState.putString("Operation", this.mOperatorTextView.getText().toString());
        outState.putString("Second_number", this.mInputValue2TextView.getText().toString());
        outState.putString("Final_result", this.mFinalResultTextView.getText().toString());
        outState.putString("Complete_operation", this.mCompleteOperation.getText().toString());
        outState.putString("Operation_string", this.operation_string);
        outState.putDouble("Number_one", this.number_one);
        outState.putDouble("Number_two", this.number_two);
    }

    private void selectTextViewToAppend(String number) {
        if (this.operation_string.equals(operator.NULL.name())) {
            if (this.mInputValue1TextView.getText().toString().contains(".")) {
                MAX_CHARACTERS++;
            }
            if (this.mInputValue1TextView.getText().length() < MAX_CHARACTERS) {
                this.mInputValue1TextView.append(number);
                MAX_CHARACTERS = 10;
                return;
            }
            MAX_CHARACTERS = 10;
            Toast.makeText(this, "Cannot have more than 10 numbers", 1).show();
            return;
        }
        if (this.mInputValue1TextView.getText().toString().contains(".")) {
            MAX_CHARACTERS++;
        }
        if (this.mInputValue2TextView.getText().length() < MAX_CHARACTERS) {
            this.mInputValue2TextView.append(number);
            MAX_CHARACTERS = 10;
            return;
        }
        MAX_CHARACTERS = 10;
        Toast.makeText(this, "Cannot have more than 10 numbers", 1).show();
    }

    public void onNumClick(View view) {
        if (!this.mFinalResultTextView.getText().toString().equals("")) {
            onClearClick(view);
        }
        switch (view.getId()) {
            case R.id.button_dot /* 2131165224 */:
                if (this.operation_string.equals(operator.NULL.name())) {
                    if (this.mInputValue1TextView.getText().toString().contains(".")) {
                        Toast.makeText(this, "Cannot have more than one decimal point in a number", 1).show();
                        return;
                    } else {
                        this.mInputValue1TextView.append(".");
                        return;
                    }
                } else if (this.mInputValue2TextView.getText().toString().contains(".")) {
                    Toast.makeText(this, "Cannot have more than one decimal point in a number", 1).show();
                    return;
                } else {
                    this.mInputValue2TextView.append(".");
                    return;
                }
            case R.id.button_eight /* 2131165225 */:
                selectTextViewToAppend("8");
                return;
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
                selectTextViewToAppend("5");
                return;
            case R.id.button_four /* 2131165228 */:
                selectTextViewToAppend("4");
                return;
            case R.id.button_nine /* 2131165232 */:
                selectTextViewToAppend("9");
                return;
            case R.id.button_one /* 2131165233 */:
                selectTextViewToAppend("1");
                return;
            case R.id.button_seven /* 2131165237 */:
                selectTextViewToAppend("7");
                return;
            case R.id.button_six /* 2131165238 */:
                selectTextViewToAppend("6");
                return;
            case R.id.button_three /* 2131165239 */:
                selectTextViewToAppend("3");
                return;
            case R.id.button_two /* 2131165240 */:
                selectTextViewToAppend("2");
                return;
            case R.id.button_zero /* 2131165241 */:
                selectTextViewToAppend("0");
                return;
        }
    }

    public void onOperatorClick(View view) {
        if (!this.mInputValue1TextView.getText().toString().equals("")) {
            switch (view.getId()) {
                case R.id.button_divide /* 2131165223 */:
                    this.operation_string = operator.DIV.name();
                    this.mOperatorTextView.setText("/");
                    return;
                case R.id.button_minus /* 2131165229 */:
                    this.operation_string = operator.SUB.name();
                    this.mOperatorTextView.setText("-");
                    return;
                case R.id.button_mod /* 2131165230 */:
                    this.operation_string = operator.MOD.name();
                    this.mOperatorTextView.setText("%");
                    return;
                case R.id.button_multiply /* 2131165231 */:
                    this.operation_string = operator.MUL.name();
                    this.mOperatorTextView.setText("x");
                    return;
                case R.id.button_plus /* 2131165234 */:
                    this.operation_string = operator.ADD.name();
                    this.mOperatorTextView.setText("+");
                    return;
                case R.id.button_pow /* 2131165235 */:
                    this.operation_string = operator.POW.name();
                    this.mOperatorTextView.setText("^");
                    return;
                case R.id.button_root /* 2131165236 */:
                    this.operation_string = operator.ROOT.name();
                    this.mOperatorTextView.setText("√");
                    return;
                default:
                    this.operation_string = operator.NULL.name();
                    return;
            }
        } else if (view.getId() == R.id.button_root) {
            this.mInputValue1TextView.setText("1");
            this.operation_string = operator.ROOT.name();
            this.mOperatorTextView.setText("√");
        } else {
            Toast.makeText(this, "Enter first number before operation", 1).show();
        }
    }

    public void onEqualsClick(View view) {
        String operation;
        if (this.mInputValue1TextView.getText().toString().equals("") || this.mOperatorTextView.getText().toString().equals("") || this.mInputValue2TextView.getText().toString().equals("")) {
            Toast.makeText(this, "Enter the numbers and the operation", 1).show();
            return;
        }
        this.number_one = Double.parseDouble(this.mInputValue1TextView.getText().toString());
        this.number_two = Double.parseDouble(this.mInputValue2TextView.getText().toString());
        switch (AnonymousClass2.$SwitchMap$me$test$calculator$MainActivity$operator[operator.valueOf(this.operation_string).ordinal()]) {
            case 1:
                this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.addition(this.number_one, this.number_two)));
                operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_plus) + this.mInputValue2TextView.getText().toString();
                break;
            case 2:
                this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.addition(this.number_one, this.number_two)));
                operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_minus) + this.mInputValue2TextView.getText().toString();
                break;
            case 3:
                this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.division(this.number_one, this.number_two)));
                operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_mul) + this.mInputValue2TextView.getText().toString();
                break;
            case 4:
                try {
                    this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.division(this.number_one, this.number_two)));
                    operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_div) + this.mInputValue2TextView.getText().toString();
                    break;
                } catch (IllegalArgumentException e) {
                    Toast.makeText(this, getString(R.string.error), 1).show();
                    clearAll();
                    operation = "";
                    break;
                }
            case 5:
                this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.modulus(this.number_one, this.number_two)));
                operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_mod) + this.mInputValue2TextView.getText().toString();
                break;
            case 6:
                this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.squareRoot(this.number_one, this.number_two)));
                operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_root) + this.mInputValue2TextView.getText().toString();
                break;
            case 7:
                this.mFinalResultTextView.setText(String.valueOf(this.mCalculator.power(this.number_one, this.number_two)));
                operation = this.mInputValue1TextView.getText().toString() + getString(R.string.button_pow) + this.mInputValue2TextView.getText().toString();
                break;
            case 8:
                this.mFinalResultTextView.setText(getString(R.string.error));
                operation = "";
                break;
            default:
                operation = "";
                break;
        }
        this.mCompleteOperation.setText(operation);
        clearAll();
    }

    /* renamed from: me.test.calculator.MainActivity$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$me$test$calculator$MainActivity$operator;

        static {
            int[] iArr = new int[operator.values().length];
            $SwitchMap$me$test$calculator$MainActivity$operator = iArr;
            try {
                iArr[operator.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.SUB.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.MUL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.DIV.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.ROOT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.POW.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$me$test$calculator$MainActivity$operator[operator.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    public void onClearClick(View view) {
        this.mFinalResultTextView.setText("");
        this.mCompleteOperation.setText("");
    }

    public void clearAll() {
        this.mInputValue1TextView.setText("");
        this.mOperatorTextView.setText("");
        this.mInputValue2TextView.setText("");
        this.number_one = 0.0d;
        this.number_two = 0.0d;
        this.operation_string = operator.NULL.name();
    }

    public void onBackspaceClick(View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: me.test.calculator.MainActivity.1
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View v) {
                MainActivity.this.clearAll();
                return false;
            }
        });
        if (!this.mInputValue2TextView.getText().toString().equals("")) {
            backspaceImplementation(this.mInputValue2TextView);
        } else if (!this.mOperatorTextView.getText().toString().equals("")) {
            backspaceImplementation(this.mOperatorTextView);
        } else if (!this.mInputValue1TextView.getText().toString().equals("")) {
            backspaceImplementation(this.mInputValue1TextView);
        }
    }

    private void backspaceImplementation(TextView view) {
        String backspace = view.getText().toString();
        view.setText(backspace.substring(0, backspace.length() - 1));
    }
}
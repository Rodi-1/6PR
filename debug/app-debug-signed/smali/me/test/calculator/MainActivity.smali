.class public Lme/test/calculator/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/test/calculator/MainActivity$operator;
    }
.end annotation


# static fields
.field private static MAX_CHARACTERS:I


# instance fields
.field private mCalculator:Lme/test/calculator/Calculator;

.field private mCompleteOperation:Landroid/widget/TextView;

.field private mFinalResultTextView:Landroid/widget/TextView;

.field private mInputValue1TextView:Landroid/widget/TextView;

.field private mInputValue2TextView:Landroid/widget/TextView;

.field private mOperatorTextView:Landroid/widget/TextView;

.field private number_one:D

.field private number_two:D

.field private operation_string:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/16 v0, 0xa

    sput v0, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private backspaceImplementation(Landroid/widget/TextView;)V
    .locals 3
    .param p1, "view"    # Landroid/widget/TextView;

    .line 303
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 304
    .local v0, "backspace":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 305
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    return-void
.end method

.method private selectTextViewToAppend(Ljava/lang/String;)V
    .locals 5
    .param p1, "number"    # Ljava/lang/String;

    .line 76
    iget-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    sget-object v1, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v1}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Cannot have more than 10 numbers"

    const-string v2, "."

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    .line 77
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    sget v0, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    add-int/2addr v0, v4

    sput v0, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    .line 80
    :cond_0
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sget v2, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    if-ge v0, v2, :cond_1

    .line 81
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 82
    sput v3, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    goto :goto_0

    .line 84
    :cond_1
    sput v3, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    .line 85
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 88
    :cond_2
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    sget v0, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    add-int/2addr v0, v4

    sput v0, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    .line 91
    :cond_3
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sget v2, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    if-ge v0, v2, :cond_4

    .line 92
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 93
    sput v3, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    goto :goto_0

    .line 95
    :cond_4
    sput v3, Lme/test/calculator/MainActivity;->MAX_CHARACTERS:I

    .line 96
    invoke-static {p0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 100
    :goto_0
    return-void
.end method


# virtual methods
.method public clearAll()V
    .locals 2

    .line 272
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lme/test/calculator/MainActivity;->number_one:D

    .line 276
    iput-wide v0, p0, Lme/test/calculator/MainActivity;->number_two:D

    .line 277
    sget-object v0, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public onBackspaceClick(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .line 282
    new-instance v0, Lme/test/calculator/MainActivity$1;

    invoke-direct {v0, p0}, Lme/test/calculator/MainActivity$1;-><init>(Lme/test/calculator/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 289
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 290
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->backspaceImplementation(Landroid/widget/TextView;)V

    goto :goto_0

    .line 292
    :cond_0
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 293
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->backspaceImplementation(Landroid/widget/TextView;)V

    goto :goto_0

    .line 295
    :cond_1
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->backspaceImplementation(Landroid/widget/TextView;)V

    .line 300
    :cond_2
    :goto_0
    return-void
.end method

.method public onClearClick(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
	invoke-virtual {p0}, Lme/test/calculator/MainActivity;->clearAll()V

    .line 266
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mCompleteOperation:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 37
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    const v0, 0x7f09001b

    invoke-virtual {p0, v0}, Lme/test/calculator/MainActivity;->setContentView(I)V

    .line 39
    new-instance v0, Lme/test/calculator/Calculator;

    invoke-direct {v0}, Lme/test/calculator/Calculator;-><init>()V

    iput-object v0, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    .line 40
    const v0, 0x7f070061

    invoke-virtual {p0, v0}, Lme/test/calculator/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    .line 41
    const v0, 0x7f070062

    invoke-virtual {p0, v0}, Lme/test/calculator/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    .line 42
    const v0, 0x7f070060

    invoke-virtual {p0, v0}, Lme/test/calculator/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    .line 43
    const v0, 0x7f0700a3

    invoke-virtual {p0, v0}, Lme/test/calculator/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    .line 44
    const v0, 0x7f070043

    invoke-virtual {p0, v0}, Lme/test/calculator/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lme/test/calculator/MainActivity;->mCompleteOperation:Landroid/widget/TextView;

    .line 45
    sget-object v0, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 48
    if-eqz p1, :cond_0

    .line 49
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    const-string v1, "First_number"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    const-string v1, "Second_number"

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "Operation"

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    const-string v1, "Final_result"

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mCompleteOperation:Landroid/widget/TextView;

    const-string v1, "Complete_operation"

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    sget-object v0, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Operation_string"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 55
    const-string v0, "Number_one"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v3

    iput-wide v3, p0, Lme/test/calculator/MainActivity;->number_one:D

    .line 56
    const-string v0, "Number_two"

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lme/test/calculator/MainActivity;->number_two:D

    .line 58
    :cond_0
    return-void
.end method

.method public onEqualsClick(Landroid/view/View;)V
    .locals 10
    .param p1, "view"    # Landroid/view/View;

    .line 208
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 211
    :cond_0
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0
	

	const-string v6, "."
	invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	move-result v7
	
	if-eqz v7, :notEql
	const-string v0, "0.0"

	:notEql
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    move-result-wide v0
	goto :endComparison
	
	
	
	:endComparison
    iput-wide v0, p0, Lme/test/calculator/MainActivity;->number_one:D

    .line 212
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0
	
	const-string v6, "."
	invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	move-result v7
	
	if-eqz v7, :notEql1
	const-string v0, "0.0"

	:notEql1
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    move-result-wide v0
	goto :endComparison1
	
	
	
	:endComparison1

    iput-wide v0, p0, Lme/test/calculator/MainActivity;->number_two:D

    .line 215
    sget-object v0, Lme/test/calculator/MainActivity$2;->$SwitchMap$me$test$calculator$MainActivity$operator:[I

    iget-object v1, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    invoke-static {v1}, Lme/test/calculator/MainActivity$operator;->valueOf(Ljava/lang/String;)Lme/test/calculator/MainActivity$operator;

    move-result-object v1

    invoke-virtual {v1}, Lme/test/calculator/MainActivity$operator;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const v1, 0x7f0b0033

    packed-switch v0, :pswitch_data_0

    .line 255
    const-string v0, ""

    .local v0, "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 251
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_0
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    const-string v0, ""

    .line 253
    .restart local v0    # "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 247
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_1
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v2, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lme/test/calculator/Calculator;->power(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0b0031

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 249
    .restart local v0    # "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 243
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_2
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v2, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lme/test/calculator/Calculator;->squareRoot(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0b0032

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 245
    .restart local v0    # "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 239
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_3
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v2, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lme/test/calculator/Calculator;->modulus(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0b002e

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 241
    .restart local v0    # "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 230
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_4
    :try_start_0
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v3, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v6, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v3, v4, v5, v6, v7}, Lme/test/calculator/Calculator;->division(DD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x7f0b002a

    invoke-virtual {p0, v3}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    .restart local v0    # "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 232
    .end local v0    # "operation":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 233
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 234
    const-string v1, ""

    .line 235
    .local v1, "operation":Ljava/lang/String;
    invoke-virtual {p0}, Lme/test/calculator/MainActivity;->clearAll()V

    .line 237
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    move-object v0, v1

    goto/16 :goto_0

    .line 225
    .end local v1    # "operation":Ljava/lang/String;
    :pswitch_5
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v2, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lme/test/calculator/Calculator;->multiplication(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0b002f

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 227
    .local v0, "operation":Ljava/lang/String;
    goto/16 :goto_0

    .line 221
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_6
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v2, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lme/test/calculator/Calculator;->subtraction(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0b002d

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 223
    .restart local v0    # "operation":Ljava/lang/String;
    goto :goto_0

    .line 217
    .end local v0    # "operation":Ljava/lang/String;
    :pswitch_7
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCalculator:Lme/test/calculator/Calculator;

    iget-wide v2, p0, Lme/test/calculator/MainActivity;->number_one:D

    iget-wide v4, p0, Lme/test/calculator/MainActivity;->number_two:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lme/test/calculator/Calculator;->addition(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0b0030

    invoke-virtual {p0, v1}, Lme/test/calculator/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 219
    .restart local v0    # "operation":Ljava/lang/String;
    nop

    .line 258
    :goto_0
    iget-object v1, p0, Lme/test/calculator/MainActivity;->mCompleteOperation:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    invoke-virtual {p0}, Lme/test/calculator/MainActivity;->clearAll()V

    goto :goto_2

    .line 209
    .end local v0    # "operation":Ljava/lang/String;
    :cond_1
    :goto_1
    const-string v0, "Enter the numbers and the operation"

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 261
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onNumClick(Landroid/view/View;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;

    .line 104
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-virtual {p0, p1}, Lme/test/calculator/MainActivity;->onClearClick(Landroid/view/View;)V

    .line 107
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_0

    .line 136
    :pswitch_1
    const-string v0, "0"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 137
    goto/16 :goto_0

    .line 112
    :pswitch_2
    const-string v0, "2"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 113
    goto/16 :goto_0

    .line 115
    :pswitch_3
    const-string v0, "3"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 116
    goto/16 :goto_0

    .line 124
    :pswitch_4
    const-string v0, "6"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 125
    goto/16 :goto_0

    .line 127
    :pswitch_5
    const-string v0, "7"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 128
    goto/16 :goto_0

    .line 109
    :pswitch_6
    const-string v0, "1"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 110
    goto :goto_0

    .line 133
    :pswitch_7
    const-string v0, "9"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 134
    goto :goto_0

    .line 118
    :pswitch_8
    const-string v0, "4"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 119
    goto :goto_0

    .line 121
    :pswitch_9
    const-string v0, "5"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 122
    goto :goto_0

    .line 130
    :pswitch_a
    const-string v0, "8"

    invoke-direct {p0, v0}, Lme/test/calculator/MainActivity;->selectTextViewToAppend(Ljava/lang/String;)V

    .line 131
    goto :goto_0

    .line 139
    :pswitch_b
    iget-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    sget-object v1, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v1}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "Cannot have more than one decimal point in a number"

    const-string v3, "."

    if-eqz v0, :cond_2

    .line 140
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 143
    :cond_1
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 146
    :cond_2
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 147
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 149
    :cond_3
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 152
    nop

    .line 156
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f070028
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onOperatorClick(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .line 160
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "\u221a"

    if-nez v0, :cond_0

    .line 161
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 191
    sget-object v0, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 192
    goto/16 :goto_0

    .line 187
    :sswitch_0
    sget-object v0, Lme/test/calculator/MainActivity$operator;->ROOT:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 188
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    goto/16 :goto_0

    .line 183
    :sswitch_1
    sget-object v0, Lme/test/calculator/MainActivity$operator;->POW:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 184
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "^"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    goto/16 :goto_0

    .line 163
    :sswitch_2
    sget-object v0, Lme/test/calculator/MainActivity$operator;->ADD:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 164
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    goto :goto_0

    .line 171
    :sswitch_3
    sget-object v0, Lme/test/calculator/MainActivity$operator;->MUL:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 172
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    goto :goto_0

    .line 179
    :sswitch_4
    sget-object v0, Lme/test/calculator/MainActivity$operator;->MOD:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    goto :goto_0

    .line 167
    :sswitch_5
    sget-object v0, Lme/test/calculator/MainActivity$operator;->SUB:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 168
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    goto :goto_0

    .line 175
    :sswitch_6
    sget-object v0, Lme/test/calculator/MainActivity$operator;->DIV:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 176
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    goto :goto_0

    .line 196
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v2, 0x7f070034

    if-ne v0, v2, :cond_1

    .line 197
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    const-string v2, "1"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    sget-object v0, Lme/test/calculator/MainActivity$operator;->ROOT:Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity$operator;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    .line 199
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 202
    :cond_1
    const/4 v0, 0x1

    const-string v1, "Enter first number before operation"

    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 204
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f070027 -> :sswitch_6
        0x7f07002d -> :sswitch_5
        0x7f07002e -> :sswitch_4
        0x7f07002f -> :sswitch_3
        0x7f070032 -> :sswitch_2
        0x7f070033 -> :sswitch_1
        0x7f070034 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "outState"    # Landroid/os/Bundle;

    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 64
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue1TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "First_number"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mOperatorTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Operation"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mInputValue2TextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Second_number"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mFinalResultTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Final_result"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lme/test/calculator/MainActivity;->mCompleteOperation:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Complete_operation"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lme/test/calculator/MainActivity;->operation_string:Ljava/lang/String;

    const-string v1, "Operation_string"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    iget-wide v0, p0, Lme/test/calculator/MainActivity;->number_one:D

    const-string v2, "Number_one"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 71
    iget-wide v0, p0, Lme/test/calculator/MainActivity;->number_two:D

    const-string v2, "Number_two"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 72
    return-void
.end method

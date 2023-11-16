.class Lme/test/calculator/Calculator;
.super Ljava/lang/Object;
.source "Calculator.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addition(DD)D
    .locals 2
    .param p1, "num1"    # D
    .param p3, "num2"    # D

    .line 6
    add-double v0, p1, p3

    return-wide v0
.end method

.method public division(DD)D
    .locals 2
    .param p1, "num1"    # D
    .param p3, "num2"    # D

    .line 18
    div-double v0, p1, p3

    return-wide v0
.end method

.method public modulus(DD)D
    .locals 2
    .param p1, "num1"    # D
    .param p3, "num2"    # D

    .line 22
	const-wide/high16 v0, 0x4059000000000000L
	
	div-double v0, p1, v0
	
    mul-double v0, v0, p3

    return-wide v0
.end method

.method public multiplication(DD)D
    .locals 2
    .param p1, "num1"    # D
    .param p3, "num2"    # D

    .line 14
    mul-double v0, p1, p3

    return-wide v0
.end method

.method public power(DD)D
    .registers 5

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    return-wide p1

.end method

.method public squareRoot(DD)D
    .locals 2
    .param p1, "num1"    # D
    .param p3, "num2"    # D

    .line 26
    invoke-static {p3, p4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double v0, v0, p1

    return-wide v0
.end method

.method public subtraction(DD)D
    .locals 2
    .param p1, "num1"    # D
    .param p3, "num2"    # D

    .line 10
    sub-double v0, p1, p3

    return-wide v0
.end method

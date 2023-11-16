.class final enum Lme/test/calculator/MainActivity$operator;
.super Ljava/lang/Enum;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/test/calculator/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "operator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lme/test/calculator/MainActivity$operator;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lme/test/calculator/MainActivity$operator;

.field public static final enum ADD:Lme/test/calculator/MainActivity$operator;

.field public static final enum DIV:Lme/test/calculator/MainActivity$operator;

.field public static final enum MOD:Lme/test/calculator/MainActivity$operator;

.field public static final enum MUL:Lme/test/calculator/MainActivity$operator;

.field public static final enum NULL:Lme/test/calculator/MainActivity$operator;

.field public static final enum POW:Lme/test/calculator/MainActivity$operator;

.field public static final enum ROOT:Lme/test/calculator/MainActivity$operator;

.field public static final enum SUB:Lme/test/calculator/MainActivity$operator;


# direct methods
.method private static synthetic $values()[Lme/test/calculator/MainActivity$operator;
    .locals 3

    .line 31
    const/16 v0, 0x8

    new-array v0, v0, [Lme/test/calculator/MainActivity$operator;

    sget-object v1, Lme/test/calculator/MainActivity$operator;->ADD:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->SUB:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->MUL:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->DIV:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->MOD:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->ROOT:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->POW:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 32
    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "ADD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->ADD:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "SUB"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->SUB:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "MUL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->MUL:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "DIV"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->DIV:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "MOD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->MOD:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "ROOT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->ROOT:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "POW"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->POW:Lme/test/calculator/MainActivity$operator;

    new-instance v0, Lme/test/calculator/MainActivity$operator;

    const-string v1, "NULL"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lme/test/calculator/MainActivity$operator;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lme/test/calculator/MainActivity$operator;->NULL:Lme/test/calculator/MainActivity$operator;

    .line 31
    invoke-static {}, Lme/test/calculator/MainActivity$operator;->$values()[Lme/test/calculator/MainActivity$operator;

    move-result-object v0

    sput-object v0, Lme/test/calculator/MainActivity$operator;->$VALUES:[Lme/test/calculator/MainActivity$operator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lme/test/calculator/MainActivity$operator;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 31
    const-class v0, Lme/test/calculator/MainActivity$operator;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lme/test/calculator/MainActivity$operator;

    return-object v0
.end method

.method public static values()[Lme/test/calculator/MainActivity$operator;
    .locals 1

    .line 31
    sget-object v0, Lme/test/calculator/MainActivity$operator;->$VALUES:[Lme/test/calculator/MainActivity$operator;

    invoke-virtual {v0}, [Lme/test/calculator/MainActivity$operator;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lme/test/calculator/MainActivity$operator;

    return-object v0
.end method

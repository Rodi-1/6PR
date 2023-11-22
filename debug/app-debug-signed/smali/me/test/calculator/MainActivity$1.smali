.class Lme/test/calculator/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/test/calculator/MainActivity;->onBackspaceClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/test/calculator/MainActivity;


# direct methods
.method constructor <init>(Lme/test/calculator/MainActivity;)V
    .locals 0
    .param p1, "this$0"    # Lme/test/calculator/MainActivity;

    .line 282
    iput-object p1, p0, Lme/test/calculator/MainActivity$1;->this$0:Lme/test/calculator/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .line 285
    iget-object v0, p0, Lme/test/calculator/MainActivity$1;->this$0:Lme/test/calculator/MainActivity;

    invoke-virtual {v0}, Lme/test/calculator/MainActivity;->clearAll()V
    .line 286
    const/4 v0, 0x0

    return v0
.end method

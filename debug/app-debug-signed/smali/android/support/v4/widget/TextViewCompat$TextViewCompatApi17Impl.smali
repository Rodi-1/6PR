.class Landroid/support/v4/widget/TextViewCompat$TextViewCompatApi17Impl;
.super Landroid/support/v4/widget/TextViewCompat$TextViewCompatApi16Impl;
.source "TextViewCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/TextViewCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TextViewCompatApi17Impl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 255
    invoke-direct {p0}, Landroid/support/v4/widget/TextViewCompat$TextViewCompatApi16Impl;-><init>()V

    return-void
.end method


# virtual methods
.method public getCompoundDrawablesRelative(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    .locals 6
    .param p1, "textView"    # Landroid/widget/TextView;

    .line 284
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v0, v1

    .line 285
    .local v0, "rtl":Z
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 286
    .local v1, "compounds":[Landroid/graphics/drawable/Drawable;
    if-eqz v0, :cond_1

    .line 288
    const/4 v3, 0x2

    aget-object v4, v1, v3

    .line 289
    .local v4, "start":Landroid/graphics/drawable/Drawable;
    aget-object v5, v1, v2

    .line 290
    .local v5, "end":Landroid/graphics/drawable/Drawable;
    aput-object v4, v1, v2

    .line 291
    aput-object v5, v1, v3

    .line 293
    .end local v4    # "start":Landroid/graphics/drawable/Drawable;
    .end local v5    # "end":Landroid/graphics/drawable/Drawable;
    :cond_1
    return-object v1
.end method

.method public setCompoundDrawablesRelative(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "start"    # Landroid/graphics/drawable/Drawable;
    .param p3, "top"    # Landroid/graphics/drawable/Drawable;
    .param p4, "end"    # Landroid/graphics/drawable/Drawable;
    .param p5, "bottom"    # Landroid/graphics/drawable/Drawable;

    .line 260
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v0, v1

    .line 261
    .local v0, "rtl":Z
    if-eqz v0, :cond_1

    move-object v1, p4

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    if-eqz v0, :cond_2

    move-object v2, p2

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    invoke-virtual {p1, v1, p3, v2, p5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 262
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/widget/TextView;IIII)V
    .locals 3
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "start"    # I
    .param p3, "top"    # I
    .param p4, "end"    # I
    .param p5, "bottom"    # I

    .line 277
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v0, v1

    .line 278
    .local v0, "rtl":Z
    if-eqz v0, :cond_1

    move v1, p4

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    if-eqz v0, :cond_2

    move v2, p2

    goto :goto_2

    :cond_2
    move v2, p4

    :goto_2
    invoke-virtual {p1, v1, p3, v2, p5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 280
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "start"    # Landroid/graphics/drawable/Drawable;
    .param p3, "top"    # Landroid/graphics/drawable/Drawable;
    .param p4, "end"    # Landroid/graphics/drawable/Drawable;
    .param p5, "bottom"    # Landroid/graphics/drawable/Drawable;

    .line 268
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v0, v1

    .line 269
    .local v0, "rtl":Z
    if-eqz v0, :cond_1

    move-object v1, p4

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    if-eqz v0, :cond_2

    move-object v2, p2

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    invoke-virtual {p1, v1, p3, v2, p5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 271
    return-void
.end method

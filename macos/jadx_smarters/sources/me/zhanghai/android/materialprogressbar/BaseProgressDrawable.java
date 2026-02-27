package me.zhanghai.android.materialprogressbar;

/* JADX INFO: loaded from: classes4.dex */
abstract class BaseProgressDrawable extends BasePaintDrawable implements IntrinsicPaddingDrawable {
    protected boolean mUseIntrinsicPadding = true;

    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public boolean getUseIntrinsicPadding() {
        return this.mUseIntrinsicPadding;
    }

    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public void setUseIntrinsicPadding(boolean z9) {
        if (this.mUseIntrinsicPadding != z9) {
            this.mUseIntrinsicPadding = z9;
            invalidateSelf();
        }
    }
}

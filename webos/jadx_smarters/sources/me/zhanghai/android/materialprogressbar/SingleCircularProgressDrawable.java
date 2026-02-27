package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    public SingleCircularProgressDrawable(int i9) {
        float f9;
        if (i9 == 0) {
            f9 = START_ANGLE_MAX_NORMAL;
        } else {
            if (i9 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            f9 = 360.0f;
        }
        this.mStartAngleMax = f9;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    public void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f9 = level / 10000.0f;
        float f10 = this.mStartAngleMax * f9;
        float f11 = f9 * 360.0f;
        drawRing(canvas, paint, f10, f11);
        if (this.mShowBackground) {
            drawRing(canvas, paint, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        invalidateSelf();
        return true;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z9) {
        if (this.mShowBackground != z9) {
            this.mShowBackground = z9;
            invalidateSelf();
        }
    }
}

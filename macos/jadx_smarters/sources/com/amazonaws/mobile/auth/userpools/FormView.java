package com.amazonaws.mobile.auth.userpools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class FormView extends LinearLayout {
    private final Drawable[] backgroundDrawables;
    private static final int FORM_CORNER_RADIUS = DisplayUtils.dp(8);
    private static final int FIELD_LEFT_RIGHT_MARGIN = DisplayUtils.dp(20);

    public static class Divider extends View {
        final Paint paint;

        public Divider(Context context) {
            super(context);
            this.paint = new Paint();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.paint.setColor(DefaultRenderer.TEXT_COLOR);
            canvas.drawRect(getMeasuredWidth() * 0.1f, 0.0f, getMeasuredWidth() * 0.9f, getMeasuredHeight(), this.paint);
        }
    }

    public FormView(Context context) {
        this(context, null);
    }

    public FormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FormView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        boolean z9 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        int i10 = FORM_CORNER_RADIUS;
        this.backgroundDrawables = new Drawable[]{createRoundedRectShape(i10, -12303292, 10), createRoundedRectShape(i10, -12303292, 20), createRoundedRectShape(i10, -12303292, 30), createRoundedRectShape(i10, -12303292, 50), createRoundedRectShape(i10, -12303292, 80), createRoundedRectShape(i10, z9 ? DefaultRenderer.BACKGROUND_COLOR : -1, 100)};
        setOrientation(1);
        setBackgroundDrawable(getFormBackground());
    }

    private EditText addField(Context context, int i9, String str) {
        int formShadowMargin;
        if (getChildCount() == 0) {
            formShadowMargin = getFormShadowMargin();
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(getChildCount() - 1).getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 0);
            addView(new Divider(context), -1, DisplayUtils.dp(1));
            formShadowMargin = 0;
        }
        FormEditText formEditText = new FormEditText(context, i9, str);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i10 = FIELD_LEFT_RIGHT_MARGIN;
        layoutParams2.setMargins(i10, formShadowMargin, i10, getFormShadowMargin());
        addView(formEditText, layoutParams2);
        return formEditText.getEditTextView();
    }

    private ShapeDrawable createRoundedRectShape(int i9, int i10, int i11) {
        ShapeDrawable roundedRectangleBackground = DisplayUtils.getRoundedRectangleBackground(i9, i10);
        if (i11 < 100) {
            roundedRectangleBackground.setAlpha(i11);
        }
        roundedRectangleBackground.getPaint().setColor(i10);
        return roundedRectangleBackground;
    }

    private Drawable getFormBackground() {
        LayerDrawable layerDrawable = new LayerDrawable(this.backgroundDrawables);
        for (int i9 = 0; i9 < this.backgroundDrawables.length; i9++) {
            layerDrawable.setLayerInset(i9, DisplayUtils.dp(i9), DisplayUtils.dp(i9), DisplayUtils.dp(i9), DisplayUtils.dp(i9));
        }
        return layerDrawable;
    }

    public EditText addFormField(Context context, int i9, String str) {
        return addField(context, i9, str);
    }

    public int getFormShadowMargin() {
        return DisplayUtils.dp(this.backgroundDrawables.length - 1);
    }
}

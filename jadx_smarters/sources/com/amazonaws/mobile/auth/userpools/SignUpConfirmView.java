package com.amazonaws.mobile.auth.userpools;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.amazonaws.mobile.auth.core.signin.ui.BackgroundDrawable;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import com.amazonaws.mobile.auth.core.signin.ui.SplitBackgroundDrawable;

/* JADX INFO: loaded from: classes.dex */
public class SignUpConfirmView extends LinearLayout {
    private static final String LOG_TAG = "SignUpConfirmView";
    private int backgroundColor;
    private BackgroundDrawable backgroundDrawable;
    private Button confirmButton;
    private EditText confirmCodeEditText;
    private FormView confirmForm;
    private String fontFamily;
    private boolean fullScreenBackgroundColor;
    private SplitBackgroundDrawable splitBackgroundDrawable;
    private Typeface typeFace;
    private EditText userNameEditText;

    public SignUpConfirmView(Context context) {
        this(context, null);
    }

    public SignUpConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignUpConfirmView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        setOrientation(1);
        if (!isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SignUpConfirmView);
            typedArrayObtainStyledAttributes.getInt(R.styleable.SignUpConfirmView_signUpConfirmViewBackgroundColor, -12303292);
            typedArrayObtainStyledAttributes.recycle();
        }
        String fontFamily = CognitoUserPoolsSignInProvider.getFontFamily();
        this.fontFamily = fontFamily;
        this.typeFace = Typeface.create(fontFamily, 0);
        this.fullScreenBackgroundColor = CognitoUserPoolsSignInProvider.isBackgroundColorFullScreen();
        this.backgroundColor = CognitoUserPoolsSignInProvider.getBackgroundColor();
        if (this.fullScreenBackgroundColor) {
            this.backgroundDrawable = new BackgroundDrawable(this.backgroundColor);
        } else {
            this.splitBackgroundDrawable = new SplitBackgroundDrawable(0, this.backgroundColor);
        }
    }

    private void setupBackground() {
        ViewGroup viewGroup;
        Drawable drawable;
        if (this.fullScreenBackgroundColor) {
            viewGroup = (ViewGroup) getParent();
            drawable = this.backgroundDrawable;
        } else {
            this.splitBackgroundDrawable.setSplitPointDistanceFromTop(this.confirmForm.getTop() + (this.confirmForm.getMeasuredHeight() / 2));
            viewGroup = (ViewGroup) getParent();
            drawable = this.splitBackgroundDrawable;
        }
        viewGroup.setBackgroundDrawable(drawable);
    }

    private void setupConfirmButtonColor() {
        Button button = (Button) findViewById(R.id.confirm_account_button);
        this.confirmButton = button;
        button.setBackgroundDrawable(DisplayUtils.getRoundedRectangleBackground(UserPoolFormConstants.FORM_BUTTON_CORNER_RADIUS, UserPoolFormConstants.FORM_BUTTON_COLOR));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.confirmButton.getLayoutParams();
        layoutParams.setMargins(this.confirmForm.getFormShadowMargin(), layoutParams.topMargin, this.confirmForm.getFormShadowMargin(), layoutParams.bottomMargin);
    }

    private void setupFontFamily() {
        if (this.typeFace != null) {
            Log.d(LOG_TAG, "Setup font in SignUpConfirmView: " + this.fontFamily);
            this.userNameEditText.setTypeface(this.typeFace);
            this.confirmCodeEditText.setTypeface(this.typeFace);
        }
    }

    public EditText getConfirmCodeEditText() {
        return this.confirmCodeEditText;
    }

    public EditText getUserNameEditText() {
        return this.userNameEditText;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FormView formView = (FormView) findViewById(R.id.signup_confirm_form);
        this.confirmForm = formView;
        this.userNameEditText = formView.addFormField(getContext(), 97, getContext().getString(R.string.username_text));
        this.confirmCodeEditText = this.confirmForm.addFormField(getContext(), 2, getContext().getString(R.string.sign_up_confirm_code));
        setupConfirmButtonColor();
        setupFontFamily();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        setupBackground();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (((double) View.MeasureSpec.getSize(i9)) * 0.85d), UserPoolFormConstants.MAX_FORM_WIDTH_IN_PIXELS), Integer.MIN_VALUE), i10);
    }
}

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
import android.widget.TextView;
import com.amazonaws.mobile.auth.core.signin.ui.BackgroundDrawable;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import com.amazonaws.mobile.auth.core.signin.ui.SplitBackgroundDrawable;

/* JADX INFO: loaded from: classes.dex */
public class SignUpView extends LinearLayout {
    private static final String LOG_TAG = "SignUpView";
    private int backgroundColor;
    private BackgroundDrawable backgroundDrawable;
    private EditText emailEditText;
    private String fontFamily;
    private boolean fullScreenBackgroundColor;
    private EditText givenNameEditText;
    private EditText passwordEditText;
    private EditText phoneEditText;
    private Button signUpButton;
    private FormView signUpForm;
    private TextView signUpMessage;
    private SplitBackgroundDrawable splitBackgroundDrawable;
    private Typeface typeFace;
    private EditText userNameEditText;

    public SignUpView(Context context) {
        this(context, null);
    }

    public SignUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignUpView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        setOrientation(1);
        if (!isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SignUpView);
            typedArrayObtainStyledAttributes.getInt(R.styleable.SignUpView_signUpViewBackgroundColor, -12303292);
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
            this.splitBackgroundDrawable.setSplitPointDistanceFromTop(this.signUpForm.getTop() + (this.signUpForm.getMeasuredHeight() / 2));
            viewGroup = (ViewGroup) getParent();
            drawable = this.splitBackgroundDrawable;
        }
        viewGroup.setBackgroundDrawable(drawable);
    }

    private void setupFontFamily() {
        if (this.typeFace != null) {
            Log.d(LOG_TAG, "Setup font in SignUpView: " + this.fontFamily);
            this.userNameEditText.setTypeface(this.typeFace);
            this.passwordEditText.setTypeface(this.typeFace);
            this.givenNameEditText.setTypeface(this.typeFace);
            this.emailEditText.setTypeface(this.typeFace);
            this.phoneEditText.setTypeface(this.typeFace);
            this.signUpMessage.setTypeface(this.typeFace);
            this.signUpButton.setTypeface(this.typeFace);
        }
    }

    private void setupSignUpButtonBackground() {
        this.signUpButton.setBackgroundDrawable(DisplayUtils.getRoundedRectangleBackground(UserPoolFormConstants.FORM_BUTTON_CORNER_RADIUS, UserPoolFormConstants.FORM_BUTTON_COLOR));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.signUpButton.getLayoutParams();
        layoutParams.setMargins(this.signUpForm.getFormShadowMargin(), layoutParams.topMargin, this.signUpForm.getFormShadowMargin(), layoutParams.bottomMargin);
    }

    public String getEmail() {
        return this.emailEditText.getText().toString();
    }

    public String getGivenName() {
        return this.givenNameEditText.getText().toString();
    }

    public String getPassword() {
        return this.passwordEditText.getText().toString();
    }

    public String getPhone() {
        return this.phoneEditText.getText().toString();
    }

    public String getUserName() {
        return this.userNameEditText.getText().toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        FormView formView = (FormView) findViewById(R.id.signup_form);
        this.signUpForm = formView;
        this.userNameEditText = formView.addFormField(getContext(), 97, getContext().getString(R.string.username_text));
        this.passwordEditText = this.signUpForm.addFormField(getContext(), 129, getContext().getString(R.string.sign_in_password));
        this.givenNameEditText = this.signUpForm.addFormField(getContext(), 97, getContext().getString(R.string.given_name_text));
        this.emailEditText = this.signUpForm.addFormField(getContext(), 33, getContext().getString(R.string.email_address_text));
        this.phoneEditText = this.signUpForm.addFormField(getContext(), 3, getContext().getString(R.string.phone_number_text));
        this.signUpMessage = (TextView) findViewById(R.id.signup_message);
        this.signUpButton = (Button) findViewById(R.id.signup_button);
        setupSignUpButtonBackground();
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

    public void setPassword(String str) {
        this.passwordEditText.setText(str);
    }
}

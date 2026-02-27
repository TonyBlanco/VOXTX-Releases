package com.amazonaws.mobile.auth.userpools;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazonaws.mobile.auth.core.signin.SignInManager;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: loaded from: classes.dex */
public class UserPoolSignInView extends LinearLayout {
    private static final int DEFAULT_BACKGROUND_COLOR = -12303292;
    private static final String LOG_TAG = "UserPoolSignInView";
    private int backgroundColor;
    private FormView credentialsFormView;
    private String fontFamily;
    private TextView forgotPasswordTextView;
    private boolean isBackgroundColorFullScreenEnabled;
    private boolean isInitialized;
    private EditText passwordEditText;
    private Button signInButton;
    private TextView signUpTextView;
    private EditText userNameEditText;

    public UserPoolSignInView(Context context) {
        this(context, null);
    }

    public UserPoolSignInView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserPoolSignInView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        setOrientation(1);
        setGravity(17);
        setId(R.id.user_pool_sign_in_view_id);
        setupCredentialsForm(context);
        setupSignInButton(context);
        setupLayoutForSignUpAndForgotPassword(context);
        Activity activity = (Activity) context;
        setupFontFamily(activity);
        setupBackgroundColor(activity);
        setupBackgroundColorFullScreen(activity);
    }

    private void initializeIfNecessary() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (isInEditMode()) {
            return;
        }
        try {
            SignInManager.getInstance().initializeSignInButton(CognitoUserPoolsSignInProvider.class, this.signInButton);
        } catch (Exception e9) {
            Log.e(LOG_TAG, "Cannot initialize the SignInButton. Please check if IdentityManager : startUpAuth and setUpToAuthenticate are invoked", e9);
        }
    }

    private void setupBackgroundColor(Activity activity) {
        this.backgroundColor = activity.getIntent().getIntExtra(CognitoUserPoolsSignInProvider.AttributeKeys.BACKGROUND_COLOR, DEFAULT_BACKGROUND_COLOR);
    }

    private void setupBackgroundColorFullScreen(Activity activity) {
        this.isBackgroundColorFullScreenEnabled = activity.getIntent().getBooleanExtra(CognitoUserPoolsSignInProvider.AttributeKeys.FULL_SCREEN_BACKGROUND_COLOR, false);
    }

    private void setupCredentialsForm(Context context) {
        this.credentialsFormView = new FormView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.userNameEditText = this.credentialsFormView.addFormField(context, 33, context.getString(R.string.sign_in_username));
        this.passwordEditText = this.credentialsFormView.addFormField(context, 129, context.getString(R.string.sign_in_password));
        addView(this.credentialsFormView, layoutParams);
    }

    private void setupFontFamily(Activity activity) {
        String stringExtra = activity.getIntent().getStringExtra(CognitoUserPoolsSignInProvider.AttributeKeys.FONT_FAMILY);
        this.fontFamily = stringExtra;
        if (stringExtra != null) {
            Typeface typefaceCreate = Typeface.create(stringExtra, 0);
            Log.d(LOG_TAG, "Setup font in UserPoolSignInView: " + this.fontFamily);
            this.signUpTextView.setTypeface(typefaceCreate);
            this.forgotPasswordTextView.setTypeface(typefaceCreate);
            this.signInButton.setTypeface(typefaceCreate);
            this.userNameEditText.setTypeface(typefaceCreate);
            this.passwordEditText.setTypeface(typefaceCreate);
        }
    }

    private void setupLayoutForSignUpAndForgotPassword(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.credentialsFormView.getFormShadowMargin(), DisplayUtils.dp(10), this.credentialsFormView.getFormShadowMargin(), 0);
        layoutParams.gravity = 1;
        TextView textView = new TextView(context);
        this.signUpTextView = textView;
        textView.setText(R.string.sign_in_new_account);
        this.signUpTextView.setTextAppearance(context, android.R.style.TextAppearance.Small);
        this.signUpTextView.setGravity(8388611);
        this.signUpTextView.setTextColor(UserPoolFormConstants.FORM_BUTTON_COLOR);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.signUpTextView, layoutParams2);
        TextView textView2 = new TextView(context);
        this.forgotPasswordTextView = textView2;
        textView2.setText(R.string.sign_in_forgot_password);
        this.forgotPasswordTextView.setTextAppearance(context, android.R.style.TextAppearance.Small);
        this.forgotPasswordTextView.setGravity(8388613);
        this.forgotPasswordTextView.setTextColor(UserPoolFormConstants.FORM_BUTTON_COLOR);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.weight = 1.0f;
        linearLayout.addView(this.forgotPasswordTextView, layoutParams3);
        addView(linearLayout, layoutParams);
    }

    private void setupSignInButton(Context context) {
        Button button = new Button(context);
        this.signInButton = button;
        button.setTextColor(-1);
        this.signInButton.setText(context.getString(R.string.sign_in_button_text));
        this.signInButton.setAllCaps(false);
        this.signInButton.setBackgroundDrawable(DisplayUtils.getRoundedRectangleBackground(UserPoolFormConstants.FORM_BUTTON_CORNER_RADIUS, UserPoolFormConstants.FORM_BUTTON_COLOR));
        Resources resources = getResources();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.sign_in_button_height));
        layoutParams.setMargins(this.credentialsFormView.getFormShadowMargin(), resources.getDimensionPixelSize(R.dimen.user_pools_sign_in_button_margin_top_bottom) + this.credentialsFormView.getFormShadowMargin(), this.credentialsFormView.getFormShadowMargin(), 0);
        addView(this.signInButton, layoutParams);
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public FormView getCredentialsFormView() {
        return this.credentialsFormView;
    }

    public String getEnteredPassword() {
        return this.passwordEditText.getText().toString();
    }

    public String getEnteredUserName() {
        return this.userNameEditText.getText().toString();
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public TextView getForgotPasswordTextView() {
        return this.forgotPasswordTextView;
    }

    public TextView getSignUpTextView() {
        return this.signUpTextView;
    }

    public boolean isBackgroundColorFullScreen() {
        return this.isBackgroundColorFullScreenEnabled;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (((double) View.MeasureSpec.getSize(i9)) * 0.85d), UserPoolFormConstants.MAX_FORM_WIDTH_IN_PIXELS), Integer.MIN_VALUE), i10);
        initializeIfNecessary();
    }
}

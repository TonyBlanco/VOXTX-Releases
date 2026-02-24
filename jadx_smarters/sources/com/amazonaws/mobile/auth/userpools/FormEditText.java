package com.amazonaws.mobile.auth.userpools;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class FormEditText extends LinearLayout {
    private static final int BIT_FOR_SHOWING_PASSWORD = 16;
    private static final int EDIT_TEXT_ID = 3842;
    private static final int TEXT_VIEW_ID = 3841;
    private LinearLayout editFieldLayout;
    private EditText editText;
    private boolean hasSetMinimumSize;
    private TextView showPasswordToggleTextView;
    private TextView textView;
    private static final int TEXT_VIEW_TOP_MARGIN = DisplayUtils.dp(5);
    private static final int EDIT_VIEW_BOTTOM_PADDING = DisplayUtils.dp(5);
    private static final int SHOW_PASSWORD_LEFT_RIGHT_MARGIN = DisplayUtils.dp(5);
    private static final int SHOW_PASSWORD_TOP_MARGIN = DisplayUtils.dp(-5);

    public FormEditText(Context context, int i9, String str) {
        super(context);
        this.showPasswordToggleTextView = null;
        this.hasSetMinimumSize = false;
        setOrientation(1);
        setGravity(16);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setText(str.toUpperCase(Locale.getDefault()));
        this.textView.setId(toViewId(TEXT_VIEW_ID));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, TEXT_VIEW_TOP_MARGIN, 0, 0);
        addView(this.textView, layoutParams);
        this.textView.setVisibility(4);
        EditText editText = new EditText(context);
        this.editText = editText;
        editText.setSingleLine();
        this.editText.setInputType(i9);
        this.editText.setBackgroundColor(0);
        this.editText.setPadding(0, DisplayUtils.dp(2), 0, DisplayUtils.dp(2) + EDIT_VIEW_BOTTOM_PADDING);
        this.editText.setId(toViewId(EDIT_TEXT_ID));
        this.editText.setHint(str);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, 0);
        if ((i9 & 128) > 0) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.editFieldLayout = linearLayout;
            linearLayout.setOrientation(0);
            layoutParams2.gravity = 8388611;
            layoutParams2.weight = 1.0f;
            this.editFieldLayout.addView(this.editText, layoutParams2);
            this.showPasswordToggleTextView = new TextView(context);
            setupShowHidePassword();
            addView(this.editFieldLayout);
        } else {
            addView(this.editText, layoutParams2);
        }
        setupTextChangedListener();
    }

    private void setupShowHidePassword() {
        final String string = getResources().getString(R.string.sign_in_show_password);
        final String string2 = getResources().getString(R.string.sign_in_hide_password);
        this.showPasswordToggleTextView.setText(string);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i9 = SHOW_PASSWORD_LEFT_RIGHT_MARGIN;
        layoutParams.setMargins(i9, SHOW_PASSWORD_TOP_MARGIN, i9, 0);
        layoutParams.gravity = 8388629;
        this.editFieldLayout.addView(this.showPasswordToggleTextView, layoutParams);
        this.showPasswordToggleTextView.setVisibility(8);
        this.showPasswordToggleTextView.setOnClickListener(new View.OnClickListener() { // from class: com.amazonaws.mobile.auth.userpools.FormEditText.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditText editText;
                int inputType;
                CharSequence text = FormEditText.this.showPasswordToggleTextView.getText();
                FormEditText.this.showPasswordToggleTextView.setText(text.equals(string) ? string2 : string);
                int selectionStart = FormEditText.this.editText.getSelectionStart();
                int selectionEnd = FormEditText.this.editText.getSelectionEnd();
                if (text.equals(string)) {
                    editText = FormEditText.this.editText;
                    inputType = FormEditText.this.editText.getInputType() | 16;
                } else {
                    editText = FormEditText.this.editText;
                    inputType = FormEditText.this.editText.getInputType() & (-17);
                }
                editText.setInputType(inputType);
                FormEditText.this.editText.setSelection(selectionStart, selectionEnd);
            }
        });
    }

    private void setupTextChangedListener() {
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.amazonaws.mobile.auth.userpools.FormEditText.2
            private void handleFloatingTextVisibility() {
                if (FormEditText.this.editText.getText().length() != 0) {
                    FormEditText.this.textView.setVisibility(0);
                    FormEditText.this.editText.setPadding(0, DisplayUtils.dp(1), 0, DisplayUtils.dp(3) + FormEditText.EDIT_VIEW_BOTTOM_PADDING);
                    if (FormEditText.this.showPasswordToggleTextView != null) {
                        FormEditText.this.showPasswordToggleTextView.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (FormEditText.this.hasSetMinimumSize) {
                    FormEditText.this.textView.setVisibility(8);
                }
                FormEditText.this.editText.setPadding(0, DisplayUtils.dp(2), 0, DisplayUtils.dp(2) + FormEditText.EDIT_VIEW_BOTTOM_PADDING);
                if (FormEditText.this.showPasswordToggleTextView != null) {
                    FormEditText.this.showPasswordToggleTextView.setVisibility(8);
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                handleFloatingTextVisibility();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }
        });
    }

    private int toViewId(int i9) {
        return i9;
    }

    public EditText getEditTextView() {
        return this.editText;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.hasSetMinimumSize) {
            return;
        }
        setMinimumHeight(this.textView.getMeasuredHeight() + TEXT_VIEW_TOP_MARGIN + this.editText.getMeasuredHeight());
        this.textView.setVisibility(8);
        this.hasSetMinimumSize = true;
    }
}

package w4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: w4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class DialogFragmentC2915c extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f51651a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f51652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dialog f51653d;

    public static DialogFragmentC2915c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2915c dialogFragmentC2915c = new DialogFragmentC2915c();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.r.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2915c.f51651a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2915c.f51652c = onCancelListener;
        }
        return dialogFragmentC2915c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f51652c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f51651a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f51653d == null) {
            this.f51653d = new AlertDialog.Builder((Context) com.google.android.gms.common.internal.r.m(getActivity())).create();
        }
        return this.f51653d;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

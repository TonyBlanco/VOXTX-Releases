package w4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;

/* JADX INFO: renamed from: w4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2928p extends DialogInterfaceOnCancelListenerC1144d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f51675a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f51676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dialog f51677d;

    public static C2928p A(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2928p c2928p = new C2928p();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.r.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c2928p.f51675a = dialog2;
        if (onCancelListener != null) {
            c2928p.f51676c = onCancelListener;
        }
        return c2928p;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f51676c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f51675a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f51677d == null) {
            this.f51677d = new AlertDialog.Builder((Context) com.google.android.gms.common.internal.r.m(getContext())).create();
        }
        return this.f51677d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public void show(androidx.fragment.app.m mVar, String str) {
        super.show(mVar, str);
    }
}

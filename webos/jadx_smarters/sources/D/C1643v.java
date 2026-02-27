package d;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;

/* JADX INFO: renamed from: d.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1643v extends DialogInterfaceOnCancelListenerC1144d {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC1642u(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public void setupDialog(Dialog dialog, int i9) {
        if (!(dialog instanceof DialogC1642u)) {
            super.setupDialog(dialog, i9);
            return;
        }
        DialogC1642u dialogC1642u = (DialogC1642u) dialog;
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC1642u.supportRequestWindowFeature(1);
    }
}

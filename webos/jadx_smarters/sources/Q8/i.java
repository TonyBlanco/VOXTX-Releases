package Q8;

import Q8.c;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class i extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.a f8455a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8456c = false;

    public static i a(String str, String str2, String str3, int i9, int i10, String[] strArr) {
        i iVar = new i();
        iVar.setArguments(new g(str, str2, str3, i9, i10, strArr).c());
        return iVar;
    }

    public void b(FragmentManager fragmentManager, String str) {
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !this.f8456c) {
            show(fragmentManager, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof c.a) {
                this.f8455a = (c.a) getParentFragment();
            }
            getParentFragment();
        }
        if (context instanceof c.a) {
            this.f8455a = (c.a) context;
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        g gVar = new g(getArguments());
        return gVar.a(getActivity(), new f(this, gVar, this.f8455a, (c.b) null));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f8455a = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f8456c = true;
        super.onSaveInstanceState(bundle);
    }
}

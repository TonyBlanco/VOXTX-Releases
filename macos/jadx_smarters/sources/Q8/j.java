package Q8;

import Q8.c;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.m;
import d.C1643v;

/* JADX INFO: loaded from: classes4.dex */
public class j extends C1643v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.a f8457a;

    public static j A(String str, String str2, String str3, int i9, int i10, String[] strArr) {
        j jVar = new j();
        jVar.setArguments(new g(str2, str3, str, i9, i10, strArr).c());
        return jVar;
    }

    public void B(m mVar, String str) {
        if (mVar.K0()) {
            return;
        }
        show(mVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof c.a) {
                this.f8457a = (c.a) getParentFragment();
            }
            getParentFragment();
        }
        if (context instanceof c.a) {
            this.f8457a = (c.a) context;
        }
    }

    @Override // d.C1643v, androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        g gVar = new g(getArguments());
        return gVar.b(getContext(), new f(this, gVar, this.f8457a, (c.b) null));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f8457a = null;
    }
}

package com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature;

import android.content.Context;
import java.util.List;
import o4.AbstractC2348z;
import o4.C2326c;
import o4.InterfaceC2334k;
import p4.C2426a;
import p4.C2433h;

/* JADX INFO: loaded from: classes.dex */
public final class CastOptionsProvider implements InterfaceC2334k {
    @Override // o4.InterfaceC2334k
    public List<AbstractC2348z> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // o4.InterfaceC2334k
    public C2326c getCastOptions(Context context) {
        return new C2326c.a().c("CC1AD845").b(new C2426a.C0411a().c(new C2433h.a().b(ExpandedControlsActivity.class.getName()).a()).b(ExpandedControlsActivity.class.getName()).a()).a();
    }
}

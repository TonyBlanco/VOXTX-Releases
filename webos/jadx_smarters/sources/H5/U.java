package H5;

import G5.AbstractC0540g;
import G5.C0542i;
import G5.C0556x;
import G5.C0557y;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U {
    public static zzagt a(AbstractC0540g abstractC0540g, String str) {
        com.google.android.gms.common.internal.r.m(abstractC0540g);
        if (C0557y.class.isAssignableFrom(abstractC0540g.getClass())) {
            return C0557y.K((C0557y) abstractC0540g, str);
        }
        if (C0542i.class.isAssignableFrom(abstractC0540g.getClass())) {
            return C0542i.K((C0542i) abstractC0540g, str);
        }
        if (G5.N.class.isAssignableFrom(abstractC0540g.getClass())) {
            return G5.N.K((G5.N) abstractC0540g, str);
        }
        if (C0556x.class.isAssignableFrom(abstractC0540g.getClass())) {
            return C0556x.K((C0556x) abstractC0540g, str);
        }
        if (G5.K.class.isAssignableFrom(abstractC0540g.getClass())) {
            return G5.K.K((G5.K) abstractC0540g, str);
        }
        if (G5.f0.class.isAssignableFrom(abstractC0540g.getClass())) {
            return G5.f0.P((G5.f0) abstractC0540g, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}

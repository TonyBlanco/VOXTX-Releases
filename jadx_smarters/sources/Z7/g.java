package z7;

import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import q7.C2635t;
import q7.Z;
import q7.m0;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends b {
    void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback);

    void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9);

    void G0(StalkerTokenCallback stalkerTokenCallback);

    void H(String str);

    void I(m0.x xVar, int i9);

    void M(StalkerGetAdCallback stalkerGetAdCallback, int i9);

    void O(Z.E e9, int i9);

    void P0(String str);

    void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback);

    void V(StalkerProfilesCallback stalkerProfilesCallback);

    void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9);

    void c(String str);

    void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2);

    void e(String str);

    void e0(String str);

    void f0(StalkerGetGenresCallback stalkerGetGenresCallback);

    void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback);

    void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback);

    void o0(String str);

    void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback);

    void v0(String str);

    void y0(String str);
}

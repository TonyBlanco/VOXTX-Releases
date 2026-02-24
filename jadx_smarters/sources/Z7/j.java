package z7;

import android.view.View;
import com.nst.iptvsmarterstvbox.model.callback.StalkerCreatePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerDeletePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerShortEPGCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface j {
    void D0(String str);

    void M0(String str);

    void P(String str);

    void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback);

    void X(StalkerShortEPGCallback stalkerShortEPGCallback);

    void u(StalkerCreatePlayerLinkCallback stalkerCreatePlayerLinkCallback, View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8);
}

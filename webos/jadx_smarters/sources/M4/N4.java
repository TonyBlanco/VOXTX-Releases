package M4;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class N4 implements Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S4 f4389a;

    public N4(S4 s42) {
        this.f4389a = s42;
    }

    @Override // M4.Z4
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f4389a.f().z(new M4(this, str, "_err", bundle));
            return;
        }
        S4 s42 = this.f4389a;
        if (s42.f4481l != null) {
            s42.f4481l.d().r().b("AppId not known when logging event", "_err");
        }
    }
}

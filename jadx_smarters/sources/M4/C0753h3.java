package M4;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: M4.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0753h3 implements Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4721a;

    public C0753h3(C0824t3 c0824t3) {
        this.f4721a = c0824t3;
    }

    @Override // M4.Z4
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f4721a.r("auto", "_err", bundle);
        } else {
            this.f4721a.t("auto", "_err", bundle, str);
        }
    }
}

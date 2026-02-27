package o6;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.AbstractC1418q;

/* JADX INFO: renamed from: o6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2367b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46130a;

    public C2367b(String str) {
        this.f46130a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2367b) {
            return AbstractC1418q.b(this.f46130a, ((C2367b) obj).f46130a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f46130a);
    }

    public String toString() {
        return AbstractC1418q.d(this).a(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT, this.f46130a).toString();
    }
}

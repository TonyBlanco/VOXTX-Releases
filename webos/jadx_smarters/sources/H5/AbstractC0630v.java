package H5;

import G5.C0555w;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: H5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0630v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A4.a f2717a = new A4.a("GetTokenResultFactory", new String[0]);

    public static C0555w a(String str) {
        Map map;
        try {
            map = AbstractC0632x.b(str);
        } catch (zzxw e9) {
            f2717a.b("Error parsing token claims", e9, new Object[0]);
            map = new HashMap();
        }
        return new C0555w(str, map);
    }
}

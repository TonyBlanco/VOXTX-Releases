package M4;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* JADX INFO: renamed from: M4.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0716b2 implements zzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0722c2 f4605b;

    public C0716b2(C0722c2 c0722c2, String str) {
        this.f4605b = c0722c2;
        this.f4604a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f4605b.f4620d.get(this.f4604a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}

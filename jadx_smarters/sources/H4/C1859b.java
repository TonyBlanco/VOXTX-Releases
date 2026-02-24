package h4;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: h4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1859b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f41657a;

    public C1859b(C1858a c1858a, Map map) {
        this.f41657a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f41657a;
        Uri.Builder builderBuildUpon = Uri.parse("http://=").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(builderBuildUpon.build().toString());
    }
}

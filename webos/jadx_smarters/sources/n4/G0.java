package n4;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45284a = "com.google.android.gms.cast.CATEGORY_CAST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f45286c;

    public /* synthetic */ G0(F0 f02) {
    }

    public static /* synthetic */ G0 a(G0 g02, String str) {
        g02.f45285b = str;
        return g02;
    }

    public static /* synthetic */ G0 b(G0 g02, Collection collection) {
        g02.f45286c = collection;
        return g02;
    }

    public static /* bridge */ /* synthetic */ I0 c(G0 g02) {
        return new I0(g02.f45284a, g02.f45285b, g02.f45286c, false, true, null);
    }
}

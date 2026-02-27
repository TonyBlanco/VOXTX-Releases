package I4;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f2837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f2839c;

    public c(SharedPreferences sharedPreferences, String str, Long l9) {
        this.f2837a = sharedPreferences;
        this.f2838b = str;
        this.f2839c = l9;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return Long.valueOf(this.f2837a.getLong(this.f2838b, this.f2839c.longValue()));
    }
}

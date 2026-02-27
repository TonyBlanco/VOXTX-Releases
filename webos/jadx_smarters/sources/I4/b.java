package I4;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f2834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f2836c;

    public b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f2834a = sharedPreferences;
        this.f2835b = str;
        this.f2836c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return Integer.valueOf(this.f2834a.getInt(this.f2835b, this.f2836c.intValue()));
    }
}

package I4;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f2831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f2833c;

    public a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f2831a = sharedPreferences;
        this.f2832b = str;
        this.f2833c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.f2831a.getBoolean(this.f2832b, this.f2833c.booleanValue()));
    }
}

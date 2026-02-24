package T1;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f9501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9502c;

    public a(AssetManager assetManager, String str) {
        this.f9501b = assetManager;
        this.f9500a = str;
    }

    @Override // T1.c
    public void a() {
        Object obj = this.f9502c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException e9) {
            if (Log.isLoggable("AssetUriFetcher", 2)) {
                Log.v("AssetUriFetcher", "Failed to close data", e9);
            }
        }
    }

    @Override // T1.c
    public Object b(O1.i iVar) {
        Object objD = d(this.f9501b, this.f9500a);
        this.f9502c = objD;
        return objD;
    }

    public abstract void c(Object obj);

    @Override // T1.c
    public void cancel() {
    }

    public abstract Object d(AssetManager assetManager, String str);

    @Override // T1.c
    public String getId() {
        return this.f9500a;
    }
}

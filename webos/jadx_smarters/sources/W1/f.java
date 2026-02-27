package W1;

import W1.d;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    public class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10218b;

        public a(Context context, String str) {
            this.f10217a = context;
            this.f10218b = str;
        }

        @Override // W1.d.a
        public File a() {
            File cacheDir = this.f10217a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f10218b != null ? new File(cacheDir, this.f10218b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, String str, int i9) {
        super(new a(context, str), i9);
    }
}

package a2;

import T1.e;
import Z1.l;
import Z1.m;
import Z1.q;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: a2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1082d extends q implements l {

    /* JADX INFO: renamed from: a2.d$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1082d(context, cVar.a(Z1.d.class, ParcelFileDescriptor.class));
        }
    }

    public C1082d(Context context, l lVar) {
        super(context, lVar);
    }

    @Override // Z1.q
    public T1.c b(Context context, String str) {
        return new T1.d(context.getApplicationContext().getAssets(), str);
    }

    @Override // Z1.q
    public T1.c c(Context context, Uri uri) {
        return new e(context, uri);
    }
}

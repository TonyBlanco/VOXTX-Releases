package b2;

import T1.h;
import T1.i;
import Z1.l;
import Z1.m;
import Z1.q;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: b2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1205f extends q implements l {

    /* JADX INFO: renamed from: b2.f$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1205f(context, cVar.a(Z1.d.class, InputStream.class));
        }
    }

    public C1205f(Context context, l lVar) {
        super(context, lVar);
    }

    @Override // Z1.q
    public T1.c b(Context context, String str) {
        return new h(context.getApplicationContext().getAssets(), str);
    }

    @Override // Z1.q
    public T1.c c(Context context, Uri uri) {
        return new i(context, uri);
    }
}

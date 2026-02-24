package b2;

import Z1.l;
import Z1.m;
import Z1.n;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: b2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1203d extends n implements l {

    /* JADX INFO: renamed from: b2.d$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1203d(context, cVar.a(Uri.class, InputStream.class));
        }
    }

    public C1203d(Context context, l lVar) {
        super(context, lVar);
    }
}

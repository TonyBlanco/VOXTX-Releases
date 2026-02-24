package b2;

import Z1.l;
import Z1.m;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: b2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1202c extends Z1.b implements l {

    /* JADX INFO: renamed from: b2.c$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1202c(cVar.a(Uri.class, InputStream.class));
        }
    }

    public C1202c(l lVar) {
        super(lVar);
    }
}

package b2;

import Z1.l;
import Z1.m;
import Z1.r;
import android.content.Context;
import java.io.InputStream;

/* JADX INFO: renamed from: b2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1206g extends r {

    /* JADX INFO: renamed from: b2.g$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1206g(cVar.a(Z1.d.class, InputStream.class));
        }
    }

    public C1206g(l lVar) {
        super(lVar);
    }
}

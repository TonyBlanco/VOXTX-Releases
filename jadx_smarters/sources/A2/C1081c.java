package a2;

import Z1.l;
import Z1.m;
import Z1.p;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: a2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1081c extends p implements l {

    /* JADX INFO: renamed from: a2.c$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1081c(cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C1081c(l lVar) {
        super(lVar);
    }
}

package a2;

import Z1.l;
import Z1.m;
import Z1.n;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: a2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1080b extends n implements l {

    /* JADX INFO: renamed from: a2.b$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1080b(context, cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C1080b(Context context, l lVar) {
        super(context, lVar);
    }
}

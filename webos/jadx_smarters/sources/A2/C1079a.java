package a2;

import Z1.l;
import Z1.m;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: a2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1079a extends Z1.b implements l {

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    public static class C0155a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1079a(cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C1079a(l lVar) {
        super(lVar);
    }
}

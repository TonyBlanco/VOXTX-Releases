package b2;

import Z1.l;
import Z1.m;
import android.content.Context;

/* JADX INFO: renamed from: b2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1201b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17467a;

    /* JADX INFO: renamed from: b2.b$a */
    public static class a implements m {
        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1201b();
        }
    }

    public C1201b() {
        this("");
    }

    public C1201b(String str) {
        this.f17467a = str;
    }

    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T1.c a(byte[] bArr, int i9, int i10) {
        return new T1.b(bArr, this.f17467a);
    }
}

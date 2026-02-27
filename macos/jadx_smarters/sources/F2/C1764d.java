package f2;

import S1.e;
import S1.f;
import U1.l;
import Z1.o;
import c2.C1249b;
import java.io.InputStream;
import l2.InterfaceC2175b;

/* JADX INFO: renamed from: f2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1764d implements InterfaceC2175b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f40559d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f40560a = new C1761a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S1.b f40561c = new o();

    /* JADX INFO: renamed from: f2.d$b */
    public static class b implements e {
        public b() {
        }

        @Override // S1.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(InputStream inputStream, int i9, int i10) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // S1.e
        public String getId() {
            return "";
        }
    }

    @Override // l2.InterfaceC2175b
    public S1.b b() {
        return this.f40561c;
    }

    @Override // l2.InterfaceC2175b
    public f e() {
        return C1249b.c();
    }

    @Override // l2.InterfaceC2175b
    public e f() {
        return f40559d;
    }

    @Override // l2.InterfaceC2175b
    public e g() {
        return this.f40560a;
    }
}

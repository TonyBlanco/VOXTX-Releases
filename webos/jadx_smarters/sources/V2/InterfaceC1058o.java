package V2;

import V2.InterfaceC1065w;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: V2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1058o {

    /* JADX INFO: renamed from: V2.o$a */
    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10015a;

        public a(Throwable th, int i9) {
            super(th);
            this.f10015a = i9;
        }
    }

    UUID a();

    boolean b();

    byte[] c();

    CryptoConfig d();

    Map e();

    void f(InterfaceC1065w.a aVar);

    void g(InterfaceC1065w.a aVar);

    a getError();

    int getState();

    boolean h(String str);
}

package q3;

import O2.C0936z0;
import r3.C2659b;
import s3.C2708b;
import u3.C2850a;

/* JADX INFO: renamed from: q3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2543d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2543d f46820a = new a();

    /* JADX INFO: renamed from: q3.d$a */
    public class a implements InterfaceC2543d {
        @Override // q3.InterfaceC2543d
        public boolean a(C0936z0 c0936z0) {
            String str = c0936z0.f6467m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // q3.InterfaceC2543d
        public InterfaceC2542c b(C0936z0 c0936z0) {
            String str = c0936z0.f6467m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C2659b();
                    case "application/x-icy":
                        return new C2850a();
                    case "application/id3":
                        return new v3.h();
                    case "application/x-emsg":
                        return new C2708b();
                    case "application/x-scte35":
                        return new x3.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(C0936z0 c0936z0);

    InterfaceC2542c b(C0936z0 c0936z0);
}

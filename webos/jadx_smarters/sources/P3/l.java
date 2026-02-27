package P3;

import O2.C0936z0;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f7242a = new a();

    public class a implements l {
        @Override // P3.l
        public boolean a(C0936z0 c0936z0) {
            String str = c0936z0.f6467m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // P3.l
        public j b(C0936z0 c0936z0) {
            String str = c0936z0.f6467m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new R3.a(c0936z0.f6469o);
                    case "application/pgs":
                        return new S3.a();
                    case "application/x-mp4-vtt":
                        return new Y3.a();
                    case "text/vtt":
                        return new Y3.h();
                    case "application/x-quicktime-tx3g":
                        return new X3.a(c0936z0.f6469o);
                    case "text/x-ssa":
                        return new U3.a(c0936z0.f6469o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new Q3.a(str, c0936z0.f6451E, 16000L);
                    case "text/x-exoplayer-cues":
                        return new g();
                    case "application/cea-708":
                        return new Q3.c(c0936z0.f6451E, c0936z0.f6469o);
                    case "application/x-subrip":
                        return new V3.a();
                    case "application/ttml+xml":
                        return new W3.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(C0936z0 c0936z0);

    j b(C0936z0 c0936z0);
}

package K3;

import O2.C0936z0;
import d4.AbstractC1684a;
import java.util.Map;
import r5.AbstractC2673b;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0936z0 f3742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2717A f3743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3744e;

    public h(C0936z0 c0936z0, int i9, int i10, Map map, String str) {
        this.f3740a = i9;
        this.f3741b = i10;
        this.f3742c = c0936z0;
        this.f3743d = AbstractC2717A.d(map);
        this.f3744e = str;
    }

    public static String a(String str) {
        String strF = AbstractC2673b.f(str);
        strF.hashCode();
        switch (strF) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                return "audio/mp4a-latm";
            case "L8":
            case "L16":
                return "audio/raw";
            case "AC3":
                return "audio/ac3";
            case "AMR":
                return "audio/3gpp";
            case "VP8":
                return "video/x-vnd.on2.vp8";
            case "VP9":
                return "video/x-vnd.on2.vp9";
            case "H264":
                return "video/avc";
            case "H265":
                return "video/hevc";
            case "OPUS":
                return "audio/opus";
            case "PCMA":
                return "audio/g711-alaw";
            case "PCMU":
                return "audio/g711-mlaw";
            case "AMR-WB":
                return "audio/amr-wb";
            case "MP4V-ES":
                return "video/mp4v-es";
            case "H263-1998":
            case "H263-2000":
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        AbstractC1684a.a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    public static boolean c(a aVar) {
        String strF = AbstractC2673b.f(aVar.f3684j.f3695b);
        strF.hashCode();
        switch (strF) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "MP4A-LATM":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3740a == hVar.f3740a && this.f3741b == hVar.f3741b && this.f3742c.equals(hVar.f3742c) && this.f3743d.equals(hVar.f3743d) && this.f3744e.equals(hVar.f3744e);
    }

    public int hashCode() {
        return ((((((((217 + this.f3740a) * 31) + this.f3741b) * 31) + this.f3742c.hashCode()) * 31) + this.f3743d.hashCode()) * 31) + this.f3744e.hashCode();
    }
}

package L3;

import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public k a(K3.h hVar) {
        String str = (String) AbstractC1684a.e(hVar.f3742c.f6467m);
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return new e(hVar);
            case "video/hevc":
                return new g(hVar);
            case "audio/amr-wb":
            case "audio/3gpp":
                return new d(hVar);
            case "audio/mp4a-latm":
                return hVar.f3744e.equals("MP4A-LATM") ? new h(hVar) : new b(hVar);
            case "audio/ac3":
                return new c(hVar);
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return new l(hVar);
            case "video/mp4v-es":
                return new i(hVar);
            case "video/avc":
                return new f(hVar);
            case "audio/opus":
                return new j(hVar);
            case "video/x-vnd.on2.vp8":
                return new n(hVar);
            case "video/x-vnd.on2.vp9":
                return new o(hVar);
            default:
                return null;
        }
    }
}

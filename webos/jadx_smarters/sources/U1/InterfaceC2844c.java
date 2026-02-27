package u1;

import B1.d;
import B1.e;
import okhttp3.Response;
import v1.InterfaceC2868f;
import v1.i;

/* JADX INFO: renamed from: u1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2844c extends M1.a {

    /* JADX INFO: renamed from: u1.c$a */
    public static abstract class a {
        public void onCanceledError(B1.a aVar) {
            onFailure(aVar);
        }

        public abstract void onFailure(B1.b bVar);

        public void onHttpError(B1.c cVar) {
            onFailure(cVar);
            Response responseB = cVar.b();
            if (responseB != null) {
                responseB.close();
            }
        }

        public void onNetworkError(d dVar) {
            onFailure(dVar);
        }

        public void onParseError(e eVar) {
            onFailure(eVar);
        }

        public abstract void onResponse(i iVar);

        public void onStatusEvent(b bVar) {
        }
    }

    /* JADX INFO: renamed from: u1.c$b */
    public enum b {
        SCHEDULED,
        FETCH_CACHE,
        FETCH_NETWORK,
        COMPLETED
    }

    InterfaceC2868f operation();
}

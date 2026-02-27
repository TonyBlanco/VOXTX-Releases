package z7;

import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface l extends b {
    void C0(TMDBTVShowsInfoCallback tMDBTVShowsInfoCallback);

    void H0(TMDBTrailerCallback tMDBTrailerCallback);

    void Q(TMDBCastsCallback tMDBCastsCallback);

    void u0(SearchTMDBTVShowsCallback searchTMDBTVShowsCallback);
}

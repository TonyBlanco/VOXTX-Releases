package z7;

import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface k extends b {
    void C(SearchTMDBMoviesCallback searchTMDBMoviesCallback);

    void U0(TMDBCastsCallback tMDBCastsCallback);

    void X0(TMDBTrailerCallback tMDBTrailerCallback);

    void g0(TMDBGenreCallback tMDBGenreCallback);

    void s(TMDBCastsCallback tMDBCastsCallback);

    void t(TMDBPersonInfoCallback tMDBPersonInfoCallback);
}

package p7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.List;
import x7.C2966a;

/* JADX INFO: renamed from: p7.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2509z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SeriesRecentWatchDatabase f46685b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f46686a;

    public C2509z0(Context context) {
        this.f46686a = context;
        f46685b = new SeriesRecentWatchDatabase(context);
    }

    public int a(String str) {
        C2966a.f().x(str);
        return f46685b.isStreamAvailable(str);
    }

    public void b(String str) {
        new SeriesRecentWatchDatabase(this.f46686a).deleteSeriesRecentwatch(str);
    }

    public ArrayList c(String str) {
        SeriesRecentWatchDatabase seriesRecentWatchDatabase = f46685b;
        if (seriesRecentWatchDatabase != null) {
            return seriesRecentWatchDatabase.getRecentWatchedByEpisodeID(str);
        }
        return null;
    }

    public final void d(Context context, List list, int i9) {
        try {
            new SeriesRecentWatchDatabase(context).addAllSeriesRecentWatch((GetEpisdoeDetailsCallback) list.get(i9));
        } catch (Exception unused) {
        }
    }

    public final void e(Context context, List list, int i9) {
        d(context, list, i9);
    }

    public void f() {
        if (C2966a.f() == null || h(C2966a.f().e(), SharepreferenceDBHandler.getUserID(this.f46686a)) != 0) {
            return;
        }
        try {
            i(this.f46686a, EpisodesUsingSinglton.getInstance().getEpisodeList().get(C2966a.f().d()).getSeriesId());
            e(this.f46686a, EpisodesUsingSinglton.getInstance().getEpisodeList(), C2966a.f().d());
        } catch (Exception unused) {
        }
    }

    public void g(Context context, GetEpisdoeDetailsCallback getEpisdoeDetailsCallback) {
        try {
            new SeriesRecentWatchDatabase(context).addAllSeriesRecentWatch(getEpisdoeDetailsCallback);
        } catch (Exception unused) {
        }
    }

    public int h(String str, int i9) {
        return f46685b.isStreamAvailable(str);
    }

    public void i(Context context, String str) {
        try {
            new SeriesRecentWatchDatabase(context).updateAllRecordsBySeriesNumRecentWatchDB(str);
        } catch (Exception unused) {
        }
    }

    public void j(String str, long j9) {
        SeriesRecentWatchDatabase seriesRecentWatchDatabase = f46685b;
        if (seriesRecentWatchDatabase != null) {
            seriesRecentWatchDatabase.updateSeriesRecentWatch(str, Long.valueOf(j9));
        }
    }
}

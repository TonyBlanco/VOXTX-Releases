package A1;

import com.amazonaws.mobileconnectors.appsync.cache.normalized.sql.AppSyncSqlHelper;
import x1.g;
import z1.AbstractC3008g;
import z1.C3011j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC3008g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppSyncSqlHelper f70b;

    public b(AppSyncSqlHelper appSyncSqlHelper) {
        this.f70b = (AppSyncSqlHelper) g.c(appSyncSqlHelper, "helper == null");
    }

    @Override // z1.AbstractC3008g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(C3011j c3011j) {
        return new a(c3011j, this.f70b);
    }
}

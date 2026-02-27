package R7;

import com.onesignal.P0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements S7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f9356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9358c;

    public d(P0 logger, a outcomeEventsCache, j outcomeEventsService) {
        l.e(logger, "logger");
        l.e(outcomeEventsCache, "outcomeEventsCache");
        l.e(outcomeEventsService, "outcomeEventsService");
        this.f9356a = logger;
        this.f9357b = outcomeEventsCache;
        this.f9358c = outcomeEventsService;
    }

    @Override // S7.c
    public List a(String name, List influences) {
        l.e(name, "name");
        l.e(influences, "influences");
        List listG = this.f9357b.g(name, influences);
        this.f9356a.debug(l.l("OneSignal getNotCachedUniqueOutcome influences: ", listG));
        return listG;
    }

    @Override // S7.c
    public List b() {
        return this.f9357b.e();
    }

    @Override // S7.c
    public void c(String notificationTableName, String notificationIdColumnName) {
        l.e(notificationTableName, "notificationTableName");
        l.e(notificationIdColumnName, "notificationIdColumnName");
        this.f9357b.c(notificationTableName, notificationIdColumnName);
    }

    @Override // S7.c
    public void d(S7.b eventParams) {
        l.e(eventParams, "eventParams");
        this.f9357b.m(eventParams);
    }

    @Override // S7.c
    public void e(S7.b event) {
        l.e(event, "event");
        this.f9357b.k(event);
    }

    @Override // S7.c
    public void f(Set unattributedUniqueOutcomeEvents) {
        l.e(unattributedUniqueOutcomeEvents, "unattributedUniqueOutcomeEvents");
        this.f9356a.debug(l.l("OneSignal save unattributedUniqueOutcomeEvents: ", unattributedUniqueOutcomeEvents));
        this.f9357b.l(unattributedUniqueOutcomeEvents);
    }

    @Override // S7.c
    public void g(S7.b outcomeEvent) {
        l.e(outcomeEvent, "outcomeEvent");
        this.f9357b.d(outcomeEvent);
    }

    @Override // S7.c
    public Set h() {
        Set setI = this.f9357b.i();
        this.f9356a.debug(l.l("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ", setI));
        return setI;
    }

    public final P0 j() {
        return this.f9356a;
    }

    public final j k() {
        return this.f9358c;
    }
}

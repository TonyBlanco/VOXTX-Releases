package O7;

import com.onesignal.F1;
import com.onesignal.InterfaceC1565l1;
import com.onesignal.InterfaceC1588t1;
import com.onesignal.P0;
import com.onesignal.S1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6716b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6717a;

        static {
            int[] iArr = new int[P7.b.values().length];
            iArr[P7.b.NOTIFICATION.ordinal()] = 1;
            iArr[P7.b.IAM.ordinal()] = 2;
            f6717a = iArr;
        }
    }

    public e(InterfaceC1565l1 preferences, P0 logger, InterfaceC1588t1 timeProvider) {
        l.e(preferences, "preferences");
        l.e(logger, "logger");
        l.e(timeProvider, "timeProvider");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f6715a = concurrentHashMap;
        c cVar = new c(preferences);
        this.f6716b = cVar;
        N7.a aVar = N7.a.f5377a;
        concurrentHashMap.put(aVar.a(), new b(cVar, logger, timeProvider));
        concurrentHashMap.put(aVar.b(), new d(cVar, logger, timeProvider));
    }

    public final void a(JSONObject jsonObject, List influences) {
        l.e(jsonObject, "jsonObject");
        l.e(influences, "influences");
        Iterator it = influences.iterator();
        while (it.hasNext()) {
            P7.a aVar = (P7.a) it.next();
            if (a.f6717a[aVar.c().ordinal()] == 1) {
                g().a(jsonObject, aVar);
            }
        }
    }

    public final O7.a b(F1.r entryAction) {
        l.e(entryAction, "entryAction");
        if (entryAction.isNotificationClick()) {
            return g();
        }
        return null;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g());
        arrayList.add(e());
        return arrayList;
    }

    public final List d(F1.r entryAction) {
        l.e(entryAction, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (entryAction.isAppClose()) {
            return arrayList;
        }
        O7.a aVarG = entryAction.isAppOpen() ? g() : null;
        if (aVarG != null) {
            arrayList.add(aVarG);
        }
        arrayList.add(e());
        return arrayList;
    }

    public final O7.a e() {
        Object obj = this.f6715a.get(N7.a.f5377a.a());
        l.b(obj);
        l.d(obj, "trackers[OSInfluenceConstants.IAM_TAG]!!");
        return (O7.a) obj;
    }

    public final List f() {
        Collection collectionValues = this.f6715a.values();
        l.d(collectionValues, "trackers.values");
        Collection collection = collectionValues;
        ArrayList arrayList = new ArrayList(l8.l.o(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((O7.a) it.next()).e());
        }
        return arrayList;
    }

    public final O7.a g() {
        Object obj = this.f6715a.get(N7.a.f5377a.b());
        l.b(obj);
        l.d(obj, "trackers[OSInfluenceConstants.NOTIFICATION_TAG]!!");
        return (O7.a) obj;
    }

    public final List h() {
        Collection collectionValues = this.f6715a.values();
        l.d(collectionValues, "trackers.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!l.a(((O7.a) obj).h(), N7.a.f5377a.a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l8.l.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((O7.a) it.next()).e());
        }
        return arrayList2;
    }

    public final void i() {
        Collection collectionValues = this.f6715a.values();
        l.d(collectionValues, "trackers.values");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((O7.a) it.next()).p();
        }
    }

    public final void j(S1.e influenceParams) {
        l.e(influenceParams, "influenceParams");
        this.f6716b.q(influenceParams);
    }
}

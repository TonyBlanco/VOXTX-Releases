package J2;

import J2.c;
import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.achartengine.chart.TimeChart;
import z2.EnumC3016d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public M2.a f3041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f3042b = new HashMap();

        public a a(EnumC3016d enumC3016d, b bVar) {
            this.f3042b.put(enumC3016d, bVar);
            return this;
        }

        public f b() {
            if (this.f3041a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f3042b.keySet().size() < EnumC3016d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f3042b;
            this.f3042b = new HashMap();
            return f.d(this.f3041a, map);
        }

        public a c(M2.a aVar) {
            this.f3041a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j9);

            public abstract a c(Set set);

            public abstract a d(long j9);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static f d(M2.a aVar, Map map) {
        return new J2.b(aVar, map);
    }

    public static f f(M2.a aVar) {
        return b().a(EnumC3016d.DEFAULT, b.a().b(30000L).d(TimeChart.DAY).a()).a(EnumC3016d.HIGHEST, b.a().b(1000L).d(TimeChart.DAY).a()).a(EnumC3016d.VERY_LOW, b.a().b(TimeChart.DAY).d(TimeChart.DAY).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i9, long j9) {
        return (long) (Math.pow(3.0d, i9 - 1) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j9 > 1 ? j9 : 2L) * ((long) r7))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC3016d enumC3016d, long j9, int i9) {
        builder.setMinimumLatency(g(enumC3016d, j9, i9));
        j(builder, ((b) h().get(enumC3016d)).c());
        return builder;
    }

    public abstract M2.a e();

    public long g(EnumC3016d enumC3016d, long j9, int i9) {
        long jA = j9 - e().a();
        b bVar = (b) h().get(enumC3016d);
        return Math.min(Math.max(a(i9, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}

package androidx.work.impl.background.systemalarm;

import Q0.k;
import Z0.p;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17338e = k.f("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V0.d f17342d;

    public b(Context context, int i9, d dVar) {
        this.f17339a = context;
        this.f17340b = i9;
        this.f17341c = dVar;
        this.f17342d = new V0.d(context, dVar.f(), null);
    }

    public void a() {
        List<p> listC = this.f17341c.g().q().B().c();
        ConstraintProxy.a(this.f17339a, listC);
        this.f17342d.d(listC);
        ArrayList arrayList = new ArrayList(listC.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (p pVar : listC) {
            String str = pVar.f10811a;
            if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || this.f17342d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f10811a;
            Intent intentB = a.b(this.f17339a, str2);
            k.c().a(f17338e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            d dVar = this.f17341c;
            dVar.k(new d.b(dVar, intentB, this.f17340b));
        }
        this.f17342d.e();
    }
}

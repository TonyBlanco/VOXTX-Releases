package Y6;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x6.o f10684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f10685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10686c = 2;

    public b(x6.o oVar, w wVar) {
        this.f10684a = oVar;
        this.f10685b = wVar;
    }

    public static List e(List list, w wVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wVar.f((x6.q) it.next()));
        }
        return arrayList;
    }

    public EnumC2960a a() {
        return this.f10684a.b();
    }

    public Bitmap b() {
        return this.f10685b.b(null, 2);
    }

    public byte[] c() {
        return this.f10684a.c();
    }

    public Map d() {
        return this.f10684a.d();
    }

    public String toString() {
        return this.f10684a.f();
    }
}

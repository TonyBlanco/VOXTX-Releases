package Z6;

import Y6.v;
import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11426a = "q";

    public class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f11427a;

        public a(v vVar) {
            this.f11427a = vVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(v vVar, v vVar2) {
            return Float.compare(q.this.c(vVar2, this.f11427a), q.this.c(vVar, this.f11427a));
        }
    }

    public List a(List list, v vVar) {
        if (vVar == null) {
            return list;
        }
        Collections.sort(list, new a(vVar));
        return list;
    }

    public v b(List list, v vVar) {
        List listA = a(list, vVar);
        String str = f11426a;
        Log.i(str, "Viewfinder size: " + vVar);
        Log.i(str, "Preview in order of preference: " + listA);
        return (v) listA.get(0);
    }

    public abstract float c(v vVar, v vVar2);

    public abstract Rect d(v vVar, v vVar2);
}

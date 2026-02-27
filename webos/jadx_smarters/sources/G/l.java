package G;

import F.e;
import M.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f2132a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // G.l.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(g.b bVar) {
            return bVar.e();
        }

        @Override // G.l.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(g.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    public static Object e(Object[] objArr, int i9, b bVar) {
        int i10 = (i9 & 1) == 0 ? 400 : 700;
        boolean z9 = (i9 & 2) != 0;
        Object obj = null;
        int i11 = a.e.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.b(obj2) - i10) * 2) + (bVar.a(obj2) == z9 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i9);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i9);

    public Typeface c(Context context, InputStream inputStream) {
        File fileE = m.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (m.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i9, String str, int i10) {
        File fileE = m.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (m.c(fileE, resources, i9)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public g.b f(g.b[] bVarArr, int i9) {
        return (g.b) e(bVarArr, i9, new a());
    }
}

package M;

import M.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s.C2701g;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2701g f4133a = new C2701g(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f4134b = h.a("fonts-androidx", 10, Constants.MAXIMUM_UPLOAD_PARTS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4135c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f4136d = new i();

    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f4138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M.e f4139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4140d;

        public a(String str, Context context, M.e eVar, int i9) {
            this.f4137a = str;
            this.f4138b = context;
            this.f4139c = eVar;
            this.f4140d = i9;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f4137a, this.f4138b, this.f4139c, this.f4140d);
        }
    }

    public class b implements O.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ M.a f4141a;

        public b(M.a aVar) {
            this.f4141a = aVar;
        }

        @Override // O.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f4141a.b(eVar);
        }
    }

    public class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f4143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M.e f4144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4145d;

        public c(String str, Context context, M.e eVar, int i9) {
            this.f4142a = str;
            this.f4143b = context;
            this.f4144c = eVar;
            this.f4145d = i9;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f4142a, this.f4143b, this.f4144c, this.f4145d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements O.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4146a;

        public d(String str) {
            this.f4146a = str;
        }

        @Override // O.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f4135c) {
                try {
                    i iVar = f.f4136d;
                    ArrayList arrayList = (ArrayList) iVar.get(this.f4146a);
                    if (arrayList == null) {
                        return;
                    }
                    iVar.remove(this.f4146a);
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        ((O.a) arrayList.get(i9)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f4147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4148b;

        public e(int i9) {
            this.f4147a = null;
            this.f4148b = i9;
        }

        public e(Typeface typeface) {
            this.f4147a = typeface;
            this.f4148b = 0;
        }

        public boolean a() {
            return this.f4148b == 0;
        }
    }

    public static String a(M.e eVar, int i9) {
        return eVar.d() + "-" + i9;
    }

    public static int b(g.a aVar) {
        int i9 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i9 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i9;
    }

    public static e c(String str, Context context, M.e eVar, int i9) {
        C2701g c2701g = f4133a;
        Typeface typeface = (Typeface) c2701g.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = M.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = G.f.b(context, null, aVarE.b(), i9);
            if (typefaceB == null) {
                return new e(-3);
            }
            c2701g.put(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, M.e eVar, int i9, Executor executor, M.a aVar) {
        String strA = a(eVar, i9);
        Typeface typeface = (Typeface) f4133a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f4135c) {
            try {
                i iVar = f4136d;
                ArrayList arrayList = (ArrayList) iVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                iVar.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i9);
                if (executor == null) {
                    executor = f4134b;
                }
                h.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, M.e eVar, M.a aVar, int i9, int i10) {
        String strA = a(eVar, i9);
        Typeface typeface = (Typeface) f4133a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i10 == -1) {
            e eVarC = c(strA, context, eVar, i9);
            aVar.b(eVarC);
            return eVarC.f4147a;
        }
        try {
            e eVar2 = (e) h.c(f4134b, new a(strA, context, eVar, i9), i10);
            aVar.b(eVar2);
            return eVar2.f4147a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}

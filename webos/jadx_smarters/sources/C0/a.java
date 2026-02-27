package C0;

import C0.e;
import G0.c;
import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0032c f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e.d f871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e.c f874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f882o;

    public a(Context context, String str, c.InterfaceC0032c interfaceC0032c, e.d dVar, List list, boolean z9, e.c cVar, Executor executor, Executor executor2, boolean z10, boolean z11, boolean z12, Set set, String str2, File file) {
        this.f868a = interfaceC0032c;
        this.f869b = context;
        this.f870c = str;
        this.f871d = dVar;
        this.f872e = list;
        this.f873f = z9;
        this.f874g = cVar;
        this.f875h = executor;
        this.f876i = executor2;
        this.f877j = z10;
        this.f878k = z11;
        this.f879l = z12;
        this.f880m = set;
        this.f881n = str2;
        this.f882o = file;
    }

    public boolean a(int i9, int i10) {
        if ((i9 > i10 && this.f879l) || !this.f878k) {
            return false;
        }
        Set set = this.f880m;
        return set == null || !set.contains(Integer.valueOf(i9));
    }
}

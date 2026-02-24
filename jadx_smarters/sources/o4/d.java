package O4;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g f6524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0252a f6525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.AbstractC0252a f6526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f6527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f6528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f6529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f6530h;

    static {
        a.g gVar = new a.g();
        f6523a = gVar;
        a.g gVar2 = new a.g();
        f6524b = gVar2;
        b bVar = new b();
        f6525c = bVar;
        c cVar = new c();
        f6526d = cVar;
        f6527e = new Scope("profile");
        f6528f = new Scope("email");
        f6529g = new com.google.android.gms.common.api.a("SignIn.API", bVar, gVar);
        f6530h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}

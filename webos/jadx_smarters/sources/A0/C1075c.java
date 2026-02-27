package a0;

import C8.i;
import G8.L;
import android.content.Context;
import b0.C1196c;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import w8.l;

/* JADX INFO: renamed from: a0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1075c implements y8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f11433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f11434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Y.f f11436e;

    /* JADX INFO: renamed from: a0.c$a */
    public static final class a extends m implements w8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11437a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C1075c f11438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C1075c c1075c) {
            super(0);
            this.f11437a = context;
            this.f11438c = c1075c;
        }

        @Override // w8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f11437a;
            kotlin.jvm.internal.l.d(applicationContext, "applicationContext");
            return AbstractC1074b.a(applicationContext, this.f11438c.f11432a);
        }
    }

    public C1075c(String name, Z.b bVar, l produceMigrations, L scope) {
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(produceMigrations, "produceMigrations");
        kotlin.jvm.internal.l.e(scope, "scope");
        this.f11432a = name;
        this.f11433b = produceMigrations;
        this.f11434c = scope;
        this.f11435d = new Object();
    }

    @Override // y8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Y.f a(Context thisRef, i property) {
        Y.f fVar;
        kotlin.jvm.internal.l.e(thisRef, "thisRef");
        kotlin.jvm.internal.l.e(property, "property");
        Y.f fVar2 = this.f11436e;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f11435d) {
            try {
                if (this.f11436e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    C1196c c1196c = C1196c.f17429a;
                    l lVar = this.f11433b;
                    kotlin.jvm.internal.l.d(applicationContext, "applicationContext");
                    this.f11436e = c1196c.a(null, (List) lVar.invoke(applicationContext), this.f11434c, new a(applicationContext, this));
                }
                fVar = this.f11436e;
                kotlin.jvm.internal.l.b(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}

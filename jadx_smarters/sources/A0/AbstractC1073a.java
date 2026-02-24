package a0;

import G8.C0562b0;
import G8.L;
import G8.M;
import G8.S0;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.m;
import l8.k;
import w8.l;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1073a {

    /* JADX INFO: renamed from: a0.a$a, reason: collision with other inner class name */
    public static final class C0153a extends m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0153a f11431a = new C0153a();

        public C0153a() {
            super(1);
        }

        @Override // w8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            kotlin.jvm.internal.l.e(it, "it");
            return k.f();
        }
    }

    public static final y8.a a(String name, Z.b bVar, l produceMigrations, L scope) {
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(produceMigrations, "produceMigrations");
        kotlin.jvm.internal.l.e(scope, "scope");
        return new C1075c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ y8.a b(String str, Z.b bVar, l lVar, L l9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            bVar = null;
        }
        if ((i9 & 4) != 0) {
            lVar = C0153a.f11431a;
        }
        if ((i9 & 8) != 0) {
            l9 = M.a(C0562b0.b().V(S0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, l9);
    }
}

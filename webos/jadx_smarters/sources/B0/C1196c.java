package b0;

import G8.L;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: b0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1196c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1196c f17429a = new C1196c();

    /* JADX INFO: renamed from: b0.c$a */
    public static final class a extends m implements w8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w8.a f17430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w8.a aVar) {
            super(0);
            this.f17430a = aVar;
        }

        @Override // w8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f17430a.invoke();
            String strA = u8.e.a(file);
            h hVar = h.f17435a;
            if (l.a(strA, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    public final Y.f a(Z.b bVar, List migrations, L scope, w8.a produceFile) {
        l.e(migrations, "migrations");
        l.e(scope, "scope");
        l.e(produceFile, "produceFile");
        return new C1195b(Y.g.f10505a.a(h.f17435a, bVar, migrations, scope, new a(produceFile)));
    }
}

package Z0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10853b;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // C0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(G0.f fVar, s sVar) {
            String str = sVar.f10850a;
            if (str == null) {
                fVar.X(1);
            } else {
                fVar.x(1, str);
            }
            String str2 = sVar.f10851b;
            if (str2 == null) {
                fVar.X(2);
            } else {
                fVar.x(2, str2);
            }
        }
    }

    public u(C0.e eVar) {
        this.f10852a = eVar;
        this.f10853b = new a(eVar);
    }

    @Override // Z0.t
    public List a(String str) {
        C0.h hVarD = C0.h.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10852a.b();
        Cursor cursorB = E0.c.b(this.f10852a, hVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.t
    public void b(s sVar) {
        this.f10852a.b();
        this.f10852a.c();
        try {
            this.f10853b.h(sVar);
            this.f10852a.r();
        } finally {
            this.f10852a.g();
        }
    }
}

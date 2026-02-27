package d7;

import a7.o;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import com.amazonaws.services.s3.model.InstructionFileId;
import e7.C1747a;
import e7.c;
import e7.d;
import e7.e;
import e7.f;
import f7.C1782a;
import f7.C1783b;
import f7.C1784c;
import f7.C1785d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.regex.Pattern;
import n0.AbstractC2242a;
import o0.AbstractC2302b;
import o0.AbstractC2303c;
import org.achartengine.ChartFactory;

/* JADX INFO: renamed from: d7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1713a implements AbstractC2242a.InterfaceC0391a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f39842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1714b f39843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f39845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC2302b f39846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39847f;

    public C1713a(Context context, InterfaceC1714b interfaceC1714b, int i9) {
        this(context, interfaceC1714b, i9, null);
    }

    public C1713a(Context context, InterfaceC1714b interfaceC1714b, int i9, String[] strArr) {
        this.f39844c = 0;
        this.f39842a = new WeakReference(context);
        this.f39843b = interfaceC1714b;
        this.f39844c = i9;
        this.f39845d = strArr;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f39847f = e(strArr);
    }

    @Override // n0.AbstractC2242a.InterfaceC0391a
    public AbstractC2303c a(int i9, Bundle bundle) {
        AbstractC2302b c1784c;
        int i10 = this.f39844c;
        if (i10 == 0) {
            c1784c = new C1784c((Context) this.f39842a.get());
        } else if (i10 == 1) {
            c1784c = new C1785d((Context) this.f39842a.get());
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    c1784c = new C1783b((Context) this.f39842a.get());
                }
                return this.f39846e;
            }
            c1784c = new C1782a((Context) this.f39842a.get());
        }
        this.f39846e = c1784c;
        return this.f39846e;
    }

    @Override // n0.AbstractC2242a.InterfaceC0391a
    public void b(AbstractC2303c abstractC2303c) {
    }

    public final boolean d(String str) {
        return Pattern.compile(this.f39847f, 2).matcher(o.b(str)).matches();
    }

    public final String e(String[] strArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (i9 == 0) {
                str = strArr[i9];
            } else {
                sb.append("|\\.");
                str = strArr[i9];
            }
            sb.append(str.replace(InstructionFileId.DOT, ""));
        }
        return ".+(\\." + sb.toString() + ")$";
    }

    public final void f(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            C1747a c1747a = new C1747a();
            c1747a.J(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            c1747a.K(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            c1747a.L(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            c1747a.N(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            c1747a.I(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            c1747a.P(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            c cVar = new c();
            cVar.f(o.b(o.c(c1747a.x())));
            cVar.g(o.c(c1747a.x()));
            if (arrayList.contains(cVar)) {
                ((c) arrayList.get(arrayList.indexOf(cVar))).a(c1747a);
            } else {
                cVar.a(c1747a);
                arrayList.add(cVar);
            }
        }
        InterfaceC1714b interfaceC1714b = this.f39843b;
        if (interfaceC1714b != null) {
            interfaceC1714b.a(arrayList);
        }
    }

    public final void g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            if (string != null && d(string)) {
                e eVar = new e();
                eVar.J(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
                eVar.K(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
                eVar.L(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
                eVar.N(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
                eVar.I(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
                eVar.P(cursor.getString(cursor.getColumnIndexOrThrow(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE)));
                c cVar = new c();
                cVar.f(o.b(o.c(eVar.x())));
                cVar.g(o.c(eVar.x()));
                if (arrayList.contains(cVar)) {
                    ((c) arrayList.get(arrayList.indexOf(cVar))).a(eVar);
                } else {
                    cVar.a(eVar);
                    arrayList.add(cVar);
                }
            }
        }
        InterfaceC1714b interfaceC1714b = this.f39843b;
        if (interfaceC1714b != null) {
            interfaceC1714b.a(arrayList);
        }
    }

    public final void h(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            d dVar = new d();
            dVar.J(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            dVar.K(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            dVar.L(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            dVar.N(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            dVar.G(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            dVar.H(cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name")));
            dVar.I(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            dVar.O(cursor.getInt(cursor.getColumnIndexOrThrow("orientation")));
            c cVar = new c();
            cVar.e(dVar.m());
            cVar.f(dVar.r());
            cVar.g(o.c(dVar.x()));
            if (arrayList.contains(cVar)) {
                ((c) arrayList.get(arrayList.indexOf(cVar))).a(dVar);
            } else {
                cVar.a(dVar);
                arrayList.add(cVar);
            }
        }
        InterfaceC1714b interfaceC1714b = this.f39843b;
        if (interfaceC1714b != null) {
            interfaceC1714b.a(arrayList);
        }
    }

    @Override // n0.AbstractC2242a.InterfaceC0391a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(AbstractC2303c abstractC2303c, Cursor cursor) {
        if (cursor == null) {
            return;
        }
        int i9 = this.f39844c;
        if (i9 == 0) {
            h(cursor);
            return;
        }
        if (i9 == 1) {
            j(cursor);
        } else if (i9 == 2) {
            f(cursor);
        } else {
            if (i9 != 3) {
                return;
            }
            g(cursor);
        }
    }

    public final void j(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            f fVar = new f();
            fVar.J(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
            fVar.K(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            fVar.L(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            fVar.N(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            fVar.G(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            fVar.H(cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name")));
            fVar.I(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            fVar.Q(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            c cVar = new c();
            cVar.e(fVar.m());
            cVar.f(fVar.r());
            cVar.g(o.c(fVar.x()));
            if (arrayList.contains(cVar)) {
                ((c) arrayList.get(arrayList.indexOf(cVar))).a(fVar);
            } else {
                cVar.a(fVar);
                arrayList.add(cVar);
            }
        }
        InterfaceC1714b interfaceC1714b = this.f39843b;
        if (interfaceC1714b != null) {
            interfaceC1714b.a(arrayList);
        }
    }
}

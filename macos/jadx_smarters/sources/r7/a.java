package R7;

import P7.c;
import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.InterfaceC1565l1;
import com.onesignal.L1;
import com.onesignal.P0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f9347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L1 f9348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1565l1 f9349c;

    /* JADX INFO: renamed from: R7.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0115a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9350a;

        static {
            int[] iArr = new int[P7.c.values().length];
            iArr[P7.c.DIRECT.ordinal()] = 1;
            iArr[P7.c.INDIRECT.ordinal()] = 2;
            f9350a = iArr;
        }
    }

    public a(P0 logger, L1 dbHelper, InterfaceC1565l1 preferences) {
        l.e(logger, "logger");
        l.e(dbHelper, "dbHelper");
        l.e(preferences, "preferences");
        this.f9347a = logger;
        this.f9348b = dbHelper;
        this.f9349c = preferences;
    }

    public final void a(List list, JSONArray jSONArray, P7.b bVar) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            try {
                String influenceId = jSONArray.getString(i9);
                l.d(influenceId, "influenceId");
                list.add(new S7.a(influenceId, bVar));
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            if (i10 >= length) {
                return;
            } else {
                i9 = i10;
            }
        }
    }

    public final void b(List list, S7.e eVar) {
        if (eVar == null) {
            return;
        }
        JSONArray jSONArrayA = eVar.a();
        JSONArray jSONArrayB = eVar.b();
        a(list, jSONArrayA, P7.b.IAM);
        a(list, jSONArrayB, P7.b.NOTIFICATION);
    }

    public final synchronized void c(String notificationTableName, String notificationIdColumnName) {
        l.e(notificationTableName, "notificationTableName");
        l.e(notificationIdColumnName, "notificationIdColumnName");
        StringBuilder sb = new StringBuilder();
        sb.append("NOT EXISTS(SELECT NULL FROM ");
        sb.append(notificationTableName);
        sb.append(" n WHERE n.");
        sb.append(notificationIdColumnName);
        sb.append(" = channel_influence_id AND channel_type = \"");
        String string = P7.b.NOTIFICATION.toString();
        Locale ROOT = Locale.ROOT;
        l.d(ROOT, "ROOT");
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase(ROOT);
        l.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        sb.append("\")");
        this.f9348b.e("cached_unique_outcome", sb.toString(), null);
    }

    public final synchronized void d(S7.b event) {
        l.e(event, "event");
        this.f9348b.e("outcome", "timestamp = ?", new String[]{String.valueOf(event.c())});
    }

    public final synchronized List e() {
        ArrayList arrayList;
        Cursor cursorD;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursorD = this.f9348b.d("outcome", null, null, null, null, null, null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (cursorD.moveToFirst()) {
                do {
                    String string = cursorD.getString(cursorD.getColumnIndex("notification_influence_type"));
                    c.a aVar = P7.c.Companion;
                    P7.c cVarA = aVar.a(string);
                    P7.c cVarA2 = aVar.a(cursorD.getString(cursorD.getColumnIndex("iam_influence_type")));
                    String string2 = cursorD.getString(cursorD.getColumnIndex("notification_ids"));
                    if (string2 == null) {
                        string2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
                    String string3 = cursorD.getString(cursorD.getColumnIndex("iam_ids"));
                    if (string3 == null) {
                        string3 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
                    String str = string3;
                    String name = cursorD.getString(cursorD.getColumnIndex("name"));
                    float f9 = cursorD.getFloat(cursorD.getColumnIndex("weight"));
                    long j9 = cursorD.getLong(cursorD.getColumnIndex("timestamp"));
                    try {
                        S7.e eVar = new S7.e(null, null, 3, null);
                        S7.e eVar2 = new S7.e(null, null, 3, null);
                        S7.d dVarH = h(cVarA, eVar, eVar2, string2);
                        f(cVarA2, eVar, eVar2, str, dVarH);
                        if (dVarH == null) {
                            dVarH = new S7.d(null, null);
                        }
                        S7.d dVar = dVarH;
                        l.d(name, "name");
                        arrayList.add(new S7.b(name, dVar, f9, j9));
                    } catch (JSONException e9) {
                        this.f9347a.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e9);
                    }
                } while (cursorD.moveToNext());
            }
            if (!cursorD.isClosed()) {
                cursorD.close();
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorD;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    public final S7.d f(P7.c cVar, S7.e eVar, S7.e eVar2, String str, S7.d dVar) {
        int i9 = C0115a.f9350a[cVar.ordinal()];
        if (i9 == 1) {
            eVar.c(new JSONArray(str));
            S7.d dVarC = dVar == null ? null : dVar.c(eVar);
            return dVarC == null ? new S7.d(eVar, null) : dVarC;
        }
        if (i9 != 2) {
            return dVar;
        }
        eVar2.c(new JSONArray(str));
        S7.d dVarE = dVar == null ? null : dVar.e(eVar2);
        return dVarE == null ? new S7.d(null, eVar2) : dVarE;
    }

    public final synchronized List g(String name, List influences) {
        ArrayList arrayList;
        l.e(name, "name");
        l.e(influences, "influences");
        arrayList = new ArrayList();
        Cursor cursorC = null;
        try {
            try {
                Iterator it = influences.iterator();
                while (it.hasNext()) {
                    P7.a aVar = (P7.a) it.next();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArrayB = aVar.b();
                    if (jSONArrayB != null) {
                        int length = jSONArrayB.length();
                        if (length > 0) {
                            int i9 = 0;
                            while (true) {
                                int i10 = i9 + 1;
                                String string = jSONArrayB.getString(i9);
                                String[] strArr = {string, aVar.c().toString(), name};
                                cursorC = this.f9348b.c("cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", strArr, null, null, null, "1");
                                if (cursorC.getCount() == 0) {
                                    jSONArray.put(string);
                                }
                                if (i10 >= length) {
                                    break;
                                }
                                i9 = i10;
                            }
                        }
                        if (jSONArray.length() > 0) {
                            P7.a aVarA = aVar.a();
                            aVarA.e(jSONArray);
                            arrayList.add(aVarA);
                        }
                    }
                }
            } catch (Throwable th) {
                if (0 != 0 && !cursorC.isClosed()) {
                    cursorC.close();
                }
                throw th;
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
            if (cursorC != null && !cursorC.isClosed()) {
            }
        }
        if (cursorC != null && !cursorC.isClosed()) {
            cursorC.close();
        }
        return arrayList;
    }

    public final S7.d h(P7.c cVar, S7.e eVar, S7.e eVar2, String str) {
        S7.d dVar;
        int i9 = C0115a.f9350a[cVar.ordinal()];
        if (i9 == 1) {
            eVar.d(new JSONArray(str));
            dVar = new S7.d(eVar, null);
        } else {
            if (i9 != 2) {
                return null;
            }
            eVar2.d(new JSONArray(str));
            dVar = new S7.d(null, eVar2);
        }
        return dVar;
    }

    public final Set i() {
        InterfaceC1565l1 interfaceC1565l1 = this.f9349c;
        return interfaceC1565l1.c(interfaceC1565l1.i(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    public final boolean j() {
        InterfaceC1565l1 interfaceC1565l1 = this.f9349c;
        return interfaceC1565l1.g(interfaceC1565l1.i(), this.f9349c.j(), false);
    }

    public final synchronized void k(S7.b eventParams) {
        S7.e eVarA;
        P7.c cVar;
        P7.c cVar2;
        S7.e eVarB;
        try {
            l.e(eventParams, "eventParams");
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            P7.c cVar3 = P7.c.UNATTRIBUTED;
            S7.d dVarB = eventParams.b();
            if (dVarB == null || (eVarA = dVarB.a()) == null) {
                cVar2 = cVar3;
            } else {
                JSONArray jSONArrayB = eVarA.b();
                if (jSONArrayB != null && jSONArrayB.length() > 0) {
                    cVar = P7.c.DIRECT;
                    jSONArray = jSONArrayB;
                } else {
                    cVar = cVar3;
                }
                JSONArray jSONArrayA = eVarA.a();
                if (jSONArrayA != null && jSONArrayA.length() > 0) {
                    cVar3 = P7.c.DIRECT;
                    jSONArray2 = jSONArrayA;
                }
                cVar2 = cVar3;
                cVar3 = cVar;
            }
            S7.d dVarB2 = eventParams.b();
            if (dVarB2 != null && (eVarB = dVarB2.b()) != null) {
                JSONArray jSONArrayB2 = eVarB.b();
                if (jSONArrayB2 != null && jSONArrayB2.length() > 0) {
                    cVar3 = P7.c.INDIRECT;
                    jSONArray = jSONArrayB2;
                }
                JSONArray jSONArrayA2 = eVarB.a();
                if (jSONArrayA2 != null && jSONArrayA2.length() > 0) {
                    cVar2 = P7.c.INDIRECT;
                    jSONArray2 = jSONArrayA2;
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_ids", jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String string = cVar3.toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string.toLowerCase();
            l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            contentValues.put("notification_influence_type", lowerCase);
            String string2 = cVar2.toString();
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = string2.toLowerCase();
            l.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", eventParams.a());
            contentValues.put("weight", Float.valueOf(eventParams.d()));
            contentValues.put("timestamp", Long.valueOf(eventParams.c()));
            this.f9348b.g("outcome", null, contentValues);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(Set set) {
        InterfaceC1565l1 interfaceC1565l1 = this.f9349c;
        String strI = interfaceC1565l1.i();
        l.b(set);
        interfaceC1565l1.e(strI, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    public final synchronized void m(S7.b eventParams) {
        l.e(eventParams, "eventParams");
        this.f9347a.debug(l.l("OneSignal saveUniqueOutcomeEventParams: ", eventParams));
        String strA = eventParams.a();
        ArrayList<S7.a> arrayList = new ArrayList();
        S7.d dVarB = eventParams.b();
        S7.e eVarA = dVarB == null ? null : dVarB.a();
        S7.d dVarB2 = eventParams.b();
        S7.e eVarB = dVarB2 == null ? null : dVarB2.b();
        b(arrayList, eVarA);
        b(arrayList, eVarB);
        for (S7.a aVar : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", aVar.b());
            contentValues.put("channel_type", aVar.a().toString());
            contentValues.put("name", strA);
            this.f9348b.g("cached_unique_outcome", null, contentValues);
        }
    }
}

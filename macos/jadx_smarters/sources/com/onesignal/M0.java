package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.F1;
import com.onesignal.T1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f38354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f38355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1565l1 f38356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38357d = 0;

    public class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f38362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f38363f;

        public a(String str, int i9, String str2, String str3, String str4, boolean z9) throws JSONException {
            this.f38358a = str;
            this.f38359b = i9;
            this.f38360c = str2;
            this.f38361d = str3;
            this.f38362e = str4;
            this.f38363f = z9;
            put("app_id", str);
            put("device_type", i9);
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z9) {
                put("first_click", true);
            }
        }
    }

    public class b extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f38365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f38366b;

        public b(Set set, i iVar) {
            this.f38365a = set;
            this.f38366b = iVar;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            M0.this.u("engagement", i9, str);
            this.f38366b.a(str);
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            M0.this.v("engagement", str);
            M0.this.w(this.f38365a);
        }
    }

    public class c extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f38372e;

        public c(String str, String str2, String str3, int i9, String str4) throws JSONException {
            this.f38368a = str;
            this.f38369b = str2;
            this.f38370c = str3;
            this.f38371d = i9;
            this.f38372e = str4;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i9);
            put("page_id", str4);
        }
    }

    public class d extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f38374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f38375b;

        public d(Set set, i iVar) {
            this.f38374a = set;
            this.f38375b = iVar;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            M0.this.u("page impression", i9, str);
            this.f38375b.a(str);
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            M0.this.v("page impression", str);
            M0.this.C(this.f38374a);
        }
    }

    public class e extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38380d;

        public e(String str, String str2, String str3, int i9) throws JSONException {
            this.f38377a = str;
            this.f38378b = str2;
            this.f38379c = str3;
            this.f38380d = i9;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i9);
            put("first_impression", true);
        }
    }

    public class f extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f38382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f38383b;

        public f(Set set, i iVar) {
            this.f38382a = set;
            this.f38383b = iVar;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            M0.this.u("impression", i9, str);
            this.f38383b.a(str);
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            M0.this.v("impression", str);
            M0.this.z(this.f38382a);
        }
    }

    public class g extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f38385a;

        public g(i iVar) {
            this.f38385a = iVar;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            M0.this.u("html", i9, str);
            this.f38385a.a(str);
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            this.f38385a.onSuccess(str);
        }
    }

    public class h extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f38387a;

        public h(i iVar) {
            this.f38387a = iVar;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            M0.this.u("html", i9, str);
            JSONObject jSONObject = new JSONObject();
            try {
                if (!OSUtils.U(i9) || M0.this.f38357d >= OSUtils.f38432a) {
                    M0.this.f38357d = 0;
                    jSONObject.put("retry", false);
                } else {
                    M0.g(M0.this);
                    jSONObject.put("retry", true);
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            this.f38387a.a(jSONObject.toString());
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            M0.this.f38357d = 0;
            this.f38387a.onSuccess(str);
        }
    }

    public interface i {
        void a(String str);

        void onSuccess(String str);
    }

    public M0(M1 m12, P0 p02, InterfaceC1565l1 interfaceC1565l1) {
        this.f38354a = m12;
        this.f38355b = p02;
        this.f38356c = interfaceC1565l1;
    }

    public static /* synthetic */ int g(M0 m02) {
        int i9 = m02.f38357d;
        m02.f38357d = i9 + 1;
        return i9;
    }

    public synchronized void A(D0 d02) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", d02.f38963a);
        contentValues.put("display_quantity", Integer.valueOf(d02.e().a()));
        contentValues.put("last_display", Long.valueOf(d02.e().b()));
        contentValues.put("click_ids", d02.c().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(d02.g()));
        if (this.f38354a.a("in_app_message", contentValues, "message_id = ?", new String[]{d02.f38963a}) == 0) {
            this.f38354a.g("in_app_message", null, contentValues);
        }
    }

    public void B(Date date) {
        this.f38356c.f(R1.f38511a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", date != null ? date.toString() : null);
    }

    public void C(Set set) {
        this.f38356c.e(R1.f38511a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    public void D(String str, String str2, String str3, int i9, String str4, String str5, boolean z9, Set set, i iVar) {
        try {
            T1.j("in_app_messages/" + str4 + "/click", new a(str, i9, str2, str5, str3, z9), new b(set, iVar));
        } catch (JSONException e9) {
            e9.printStackTrace();
            this.f38355b.error("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    public void E(String str, String str2, String str3, int i9, String str4, Set set, i iVar) {
        try {
            T1.j("in_app_messages/" + str4 + "/impression", new e(str, str2, str3, i9), new f(set, iVar));
        } catch (JSONException e9) {
            e9.printStackTrace();
            this.f38355b.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public void F(String str, String str2, String str3, int i9, String str4, String str5, Set set, i iVar) {
        try {
            T1.j("in_app_messages/" + str4 + "/pageImpression", new c(str, str2, str3, i9, str5), new d(set, iVar));
        } catch (JSONException e9) {
            e9.printStackTrace();
            this.f38355b.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public synchronized void h() {
        String[] strArr = {"message_id", "click_ids"};
        String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - 15552000)};
        Set setK = OSUtils.K();
        Set setK2 = OSUtils.K();
        Cursor cursorD = null;
        try {
            try {
                cursorD = this.f38354a.d("in_app_message", strArr, "last_display < ?", strArr2, null, null, null);
            } finally {
                if (0 != 0 && !cursorD.isClosed()) {
                    cursorD.close();
                }
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
            if (0 != 0 && !cursorD.isClosed()) {
            }
        }
        if (cursorD != null && cursorD.getCount() != 0) {
            if (cursorD.moveToFirst()) {
                do {
                    String string = cursorD.getString(cursorD.getColumnIndex("message_id"));
                    String string2 = cursorD.getString(cursorD.getColumnIndex("click_ids"));
                    setK.add(string);
                    setK2.addAll(OSUtils.L(new JSONArray(string2)));
                } while (cursorD.moveToNext());
            }
            if (!cursorD.isClosed()) {
                cursorD.close();
            }
            this.f38354a.e("in_app_message", "last_display < ?", strArr2);
            j(setK);
            i(setK2);
            return;
        }
        F1.c1(F1.v.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
    }

    public final void i(Set set) {
        String str;
        Set setG;
        if (set == null || set.size() <= 0 || (setG = R1.g((str = R1.f38511a), "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || setG.size() <= 0) {
            return;
        }
        setG.removeAll(set);
        R1.n(str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", setG);
    }

    public final void j(Set set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        String str = R1.f38511a;
        Set setG = R1.g(str, "PREFS_OS_DISPLAYED_IAMS", null);
        Set setG2 = R1.g(str, "PREFS_OS_IMPRESSIONED_IAMS", null);
        if (setG != null && setG.size() > 0) {
            setG.removeAll(set);
            R1.n(str, "PREFS_OS_DISPLAYED_IAMS", setG);
        }
        if (setG2 == null || setG2.size() <= 0) {
            return;
        }
        setG2.removeAll(set);
        R1.n(str, "PREFS_OS_IMPRESSIONED_IAMS", setG2);
    }

    public synchronized List k() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorD = null;
        try {
            try {
                cursorD = this.f38354a.d("in_app_message", null, null, null, null, null, null);
                if (cursorD.moveToFirst()) {
                    do {
                        String string = cursorD.getString(cursorD.getColumnIndex("message_id"));
                        String string2 = cursorD.getString(cursorD.getColumnIndex("click_ids"));
                        int i9 = cursorD.getInt(cursorD.getColumnIndex("display_quantity"));
                        long j9 = cursorD.getLong(cursorD.getColumnIndex("last_display"));
                        boolean z9 = true;
                        if (cursorD.getInt(cursorD.getColumnIndex("displayed_in_session")) != 1) {
                            z9 = false;
                        }
                        arrayList.add(new D0(string, OSUtils.L(new JSONArray(string2)), z9, new L0(i9, j9)));
                    } while (cursorD.moveToNext());
                }
            } catch (JSONException e9) {
                F1.b(F1.v.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", e9);
                if (cursorD != null && !cursorD.isClosed()) {
                }
            }
            if (!cursorD.isClosed()) {
                cursorD.close();
            }
        } catch (Throwable th) {
            if (cursorD != null && !cursorD.isClosed()) {
                cursorD.close();
            }
            throw th;
        }
        return arrayList;
    }

    public Set l() {
        return this.f38356c.c(R1.f38511a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    public Set m() {
        return this.f38356c.c(R1.f38511a, "PREFS_OS_DISPLAYED_IAMS", null);
    }

    public void n(String str, String str2, String str3, i iVar) {
        T1.e(t(str2, str3, str), new h(iVar), null);
    }

    public void o(String str, String str2, i iVar) {
        T1.e("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new g(iVar), null);
    }

    public Set p() {
        return this.f38356c.c(R1.f38511a, "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    public Date q() {
        String strD = this.f38356c.d(R1.f38511a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (strD == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(strD);
        } catch (ParseException e9) {
            F1.c1(F1.v.ERROR, e9.getLocalizedMessage());
            return null;
        }
    }

    public String r() {
        return this.f38356c.d(R1.f38511a, "PREFS_OS_CACHED_IAMS", null);
    }

    public Set s() {
        return this.f38356c.c(R1.f38511a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    public final String t(String str, String str2, String str3) {
        if (str2 == null) {
            this.f38355b.error("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    public final void u(String str, int i9, String str2) {
        this.f38355b.error("Encountered a " + i9 + " error while attempting in-app message " + str + " request: " + str2);
    }

    public final void v(String str, String str2) {
        this.f38355b.debug("Successful post for in-app message " + str + " request: " + str2);
    }

    public final void w(Set set) {
        this.f38356c.e(R1.f38511a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    public void x(Set set) {
        this.f38356c.e(R1.f38511a, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    public void y(String str) {
        this.f38356c.f(R1.f38511a, "PREFS_OS_CACHED_IAMS", str);
    }

    public final void z(Set set) {
        this.f38356c.e(R1.f38511a, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }
}

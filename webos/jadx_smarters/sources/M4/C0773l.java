package M4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: M4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0773l extends E4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f4781f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f4782g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f4783h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f4784i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f4785j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f4786k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f4787l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f4788m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0767k f4789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A4 f4790e;

    public C0773l(S4 s42) {
        super(s42);
        this.f4790e = new A4(this.f4245a.a());
        this.f4245a.z();
        this.f4789d = new C0767k(this, this.f4245a.c(), "google_app_measurement.db");
    }

    public static final void H(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.r.g("value");
        com.google.android.gms.common.internal.r.m(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:27:0x0079 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void G(String str, long j9, long j10, P4 p42) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseP;
        Cursor cursorRawQuery;
        String string;
        String str2;
        Cursor cursorQuery;
        String str3;
        String[] strArr;
        com.google.android.gms.common.internal.r.m(p42);
        h();
        i();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                sQLiteDatabaseP = P();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        cursorRawQuery = sQLiteDatabaseP.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j10 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j10 != -1 ? new String[]{String.valueOf(j10), String.valueOf(j9)} : new String[]{String.valueOf(j9)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        cursorRawQuery = sQLiteDatabaseP.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j10 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j10 != -1 ? new String[]{null, String.valueOf(j10)} : new String[]{null});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    str2 = string;
                    try {
                        cursorQuery = sQLiteDatabaseP.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str2}, null, null, "rowid", "2");
                    } catch (SQLiteException e9) {
                        e = e9;
                        IsEmpty = cursor3;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    this.f4245a.d().r().b("Raw event metadata record is missing. appId", C0858z1.z(string2));
                    cursorQuery.close();
                    return;
                }
                try {
                    zzgd zzgdVar = (zzgd) ((zzgc) U4.E(zzgd.zzu(), cursorQuery.getBlob(0))).zzaD();
                    if (cursorQuery.moveToNext()) {
                        this.f4245a.d().w().b("Get multiple raw event metadata records, expected one. appId", C0858z1.z(string2));
                    }
                    cursorQuery.close();
                    com.google.android.gms.common.internal.r.m(zzgdVar);
                    p42.f4426a = zzgdVar;
                    if (j10 != -1) {
                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{string2, str2, String.valueOf(j10)};
                    } else {
                        str3 = "app_id = ? and metadata_fingerprint = ?";
                        strArr = new String[]{string2, str2};
                    }
                    Cursor cursorQuery2 = sQLiteDatabaseP.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr, null, null, "rowid", null);
                    if (!cursorQuery2.moveToFirst()) {
                        this.f4245a.d().w().b("Raw event data disappeared while in transaction. appId", C0858z1.z(string2));
                        cursorQuery2.close();
                        return;
                    }
                    do {
                        long j11 = cursorQuery2.getLong(0);
                        try {
                            zzfs zzfsVar = (zzfs) U4.E(zzft.zze(), cursorQuery2.getBlob(3));
                            zzfsVar.zzi(cursorQuery2.getString(1));
                            zzfsVar.zzm(cursorQuery2.getLong(2));
                            if (!p42.a(j11, (zzft) zzfsVar.zzaD())) {
                                cursorQuery2.close();
                                return;
                            }
                        } catch (IOException e11) {
                            this.f4245a.d().r().c("Data loss. Failed to merge raw event. appId", C0858z1.z(string2), e11);
                        }
                    } while (cursorQuery2.moveToNext());
                    cursorQuery2.close();
                } catch (IOException e12) {
                    this.f4245a.d().r().c("Data loss. Failed to merge raw event metadata. appId", C0858z1.z(string2), e12);
                    cursorQuery.close();
                }
            } catch (SQLiteException e13) {
                e = e13;
                IsEmpty = cursorQuery;
                this.f4245a.d().r().c("Data loss. Error selecting raw event. appId", C0858z1.z(string2), e);
                if (IsEmpty != 0) {
                    IsEmpty.close();
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursorQuery;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
            IsEmpty = 0;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final long I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = P().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j9 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j9;
            } catch (SQLiteException e9) {
                this.f4245a.d().r().c("Database error", str, e9);
                throw e9;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final int J(String str, String str2) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        h();
        i();
        try {
            return P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e9) {
            this.f4245a.d().r().d("Error deleting conditional property", C0858z1.z(str), this.f4245a.D().f(str2), e9);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.P()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r3
        L18:
            r3 = move-exception
            goto L30
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            M4.l2 r5 = r2.f4245a     // Catch: java.lang.Throwable -> L18
            M4.z1 r5 = r5.d()     // Catch: java.lang.Throwable -> L18
            M4.x1 r5 = r5.r()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Database error"
            r5.c(r6, r3, r4)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.K(java.lang.String, java.lang.String[], long):long");
    }

    public final long L(String str, String str2) {
        long jK;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g("first_open_count");
        h();
        i();
        SQLiteDatabase sQLiteDatabaseP = P();
        sQLiteDatabaseP.beginTransaction();
        long j9 = 0;
        try {
            try {
                jK = K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
            } catch (SQLiteException e9) {
                e = e9;
            }
            if (jK == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (sQLiteDatabaseP.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    this.f4245a.d().r().c("Failed to insert column (got -1). appId", C0858z1.z(str), "first_open_count");
                    return -1L;
                }
                jK = 0;
                this.f4245a.d().r().d("Error inserting column. appId", C0858z1.z(str), "first_open_count", e);
                sQLiteDatabaseP.endTransaction();
                return j9;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + jK));
                if (sQLiteDatabaseP.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    this.f4245a.d().r().c("Failed to update column (got 0). appId", C0858z1.z(str), "first_open_count");
                    return -1L;
                }
                sQLiteDatabaseP.setTransactionSuccessful();
                return jK;
            } catch (SQLiteException e10) {
                e = e10;
                j9 = jK;
            }
        } finally {
            sQLiteDatabaseP.endTransaction();
        }
    }

    public final long M() {
        return K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long N() {
        return K("select max(timestamp) from raw_events", null, 0L);
    }

    public final long O(String str) {
        com.google.android.gms.common.internal.r.g(str);
        return K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase P() {
        h();
        try {
            return this.f4789d.getWritableDatabase();
        } catch (SQLiteException e9) {
            this.f4245a.d().w().b("Error opening database", e9);
            throw e9;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:38:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle Q(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.Q(java.lang.String):android.os.Bundle");
    }

    public final I2 R(String str) {
        Cursor cursorQuery;
        com.google.android.gms.common.internal.r.g(str);
        h();
        i();
        Cursor cursor = null;
        try {
            cursorQuery = P().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    I2 i22 = new I2(this.f4234b.b0(), str);
                    boolean z9 = false;
                    i22.j(cursorQuery.getString(0));
                    i22.y(cursorQuery.getString(1));
                    i22.H(cursorQuery.getString(2));
                    i22.D(cursorQuery.getLong(3));
                    i22.E(cursorQuery.getLong(4));
                    i22.C(cursorQuery.getLong(5));
                    i22.l(cursorQuery.getString(6));
                    i22.k(cursorQuery.getString(7));
                    i22.z(cursorQuery.getLong(8));
                    i22.u(cursorQuery.getLong(9));
                    i22.F(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    i22.t(cursorQuery.getLong(11));
                    i22.r(cursorQuery.getLong(12));
                    i22.q(cursorQuery.getLong(13));
                    i22.o(cursorQuery.getLong(14));
                    i22.n(cursorQuery.getLong(15));
                    i22.w(cursorQuery.getLong(16));
                    i22.m(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    i22.x(cursorQuery.getString(18));
                    i22.p(cursorQuery.getLong(19));
                    i22.s(cursorQuery.getLong(20));
                    i22.B(cursorQuery.getString(21));
                    i22.i(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    i22.h(cursorQuery.getString(24));
                    i22.v(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        i22.I(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzqu.zzc();
                    if (this.f4245a.z().B(str, AbstractC0781m1.f4917q0) || this.f4245a.z().B(null, AbstractC0781m1.f4913o0)) {
                        i22.J(cursorQuery.getString(28));
                    }
                    zzrd.zzc();
                    if (this.f4245a.z().B(null, AbstractC0781m1.f4921s0)) {
                        if (!cursorQuery.isNull(29) && cursorQuery.getInt(29) != 0) {
                            z9 = true;
                        }
                        i22.L(z9);
                    }
                    zzpz.zzc();
                    if (this.f4245a.z().B(null, AbstractC0781m1.f4860G0)) {
                        i22.M(cursorQuery.getLong(30));
                    }
                    if (this.f4245a.z().B(null, AbstractC0781m1.f4866J0)) {
                        i22.K(cursorQuery.getLong(31));
                    }
                    i22.f();
                    if (cursorQuery.moveToNext()) {
                        this.f4245a.d().r().b("Got multiple records for app, expected one. appId", C0858z1.z(str));
                    }
                    cursorQuery.close();
                    return i22;
                } catch (SQLiteException e9) {
                    e = e9;
                    this.f4245a.d().r().c("Error querying app. appId", C0858z1.z(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
            th = th;
            cursor = cursorQuery;
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final C0725d S(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        h();
        i();
        Cursor cursor = null;
        try {
            cursorQuery = P().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objY = Y(cursorQuery, 1);
                    boolean z9 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j9 = cursorQuery.getLong(4);
                    U4 u4G0 = this.f4234b.g0();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C0832v> creator = C0832v.CREATOR;
                    C0725d c0725d = new C0725d(str, str3, new V4(str2, cursorQuery.getLong(8), objY, str3), cursorQuery.getLong(6), z9, string2, (C0832v) u4G0.B(blob, creator), j9, (C0832v) this.f4234b.g0().B(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (C0832v) this.f4234b.g0().B(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.f4245a.d().r().c("Got multiple records for conditional property, expected one", C0858z1.z(str), this.f4245a.D().f(str2));
                    }
                    cursorQuery.close();
                    return c0725d;
                } catch (SQLiteException e9) {
                    e = e9;
                    this.f4245a.d().r().d("Error querying conditional property", C0858z1.z(str), this.f4245a.D().f(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
            th = th;
            cursor = cursorQuery;
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final C0761j T(long j9, String str, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return U(j9, str, 1L, false, false, z11, false, z13);
    }

    public final C0761j U(long j9, String str, long j10, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        com.google.android.gms.common.internal.r.g(str);
        h();
        i();
        String[] strArr = {str};
        C0761j c0761j = new C0761j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                Cursor cursorQuery = sQLiteDatabaseP.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.f4245a.d().w().b("Not updating daily counts, app is not known. appId", C0858z1.z(str));
                    cursorQuery.close();
                    return c0761j;
                }
                if (cursorQuery.getLong(0) == j9) {
                    c0761j.f4750b = cursorQuery.getLong(1);
                    c0761j.f4749a = cursorQuery.getLong(2);
                    c0761j.f4751c = cursorQuery.getLong(3);
                    c0761j.f4752d = cursorQuery.getLong(4);
                    c0761j.f4753e = cursorQuery.getLong(5);
                }
                if (z9) {
                    c0761j.f4750b += j10;
                }
                if (z10) {
                    c0761j.f4749a += j10;
                }
                if (z11) {
                    c0761j.f4751c += j10;
                }
                if (z12) {
                    c0761j.f4752d += j10;
                }
                if (z13) {
                    c0761j.f4753e += j10;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j9));
                contentValues.put("daily_public_events_count", Long.valueOf(c0761j.f4749a));
                contentValues.put("daily_events_count", Long.valueOf(c0761j.f4750b));
                contentValues.put("daily_conversions_count", Long.valueOf(c0761j.f4751c));
                contentValues.put("daily_error_events_count", Long.valueOf(c0761j.f4752d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c0761j.f4753e));
                sQLiteDatabaseP.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c0761j;
            } catch (SQLiteException e9) {
                this.f4245a.d().r().c("Error updating daily counts. appId", C0858z1.z(str), e9);
                if (0 != 0) {
                    cursor.close();
                }
                return c0761j;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M4.r V(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.V(java.lang.String, java.lang.String):M4.r");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x0073 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M4.X4 X(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.r.g(r11)
            com.google.android.gms.common.internal.r.g(r12)
            r10.h()
            r10.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.P()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r2 = 1
            java.lang.Object r9 = r10.Y(r1, r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            M4.X4 r2 = new M4.X4     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r3 == 0) goto L6f
            M4.l2 r3 = r10.f4245a     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            M4.z1 r3 = r3.d()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            M4.x1 r3 = r3.r()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = M4.C0858z1.z(r11)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            goto L6f
        L6b:
            r11 = move-exception
            goto L73
        L6d:
            r2 = move-exception
            goto L7a
        L6f:
            r1.close()
            return r2
        L73:
            r0 = r1
            goto L9d
        L75:
            r11 = move-exception
            goto L9d
        L77:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L7a:
            M4.l2 r3 = r10.f4245a     // Catch: java.lang.Throwable -> L6b
            M4.z1 r3 = r3.d()     // Catch: java.lang.Throwable -> L6b
            M4.x1 r3 = r3.r()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = M4.C0858z1.z(r11)     // Catch: java.lang.Throwable -> L6b
            M4.l2 r5 = r10.f4245a     // Catch: java.lang.Throwable -> L6b
            M4.u1 r5 = r5.D()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r12 = r5.f(r12)     // Catch: java.lang.Throwable -> L6b
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9c
            r1.close()
        L9c:
            return r0
        L9d:
            if (r0 == 0) goto La2
            r0.close()
        La2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.X(java.lang.String, java.lang.String):M4.X4");
    }

    public final Object Y(Cursor cursor, int i9) {
        int type = cursor.getType(i9);
        if (type == 0) {
            this.f4245a.d().r().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i9));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i9));
        }
        if (type == 3) {
            return cursor.getString(i9);
        }
        if (type != 4) {
            this.f4245a.d().r().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f4245a.d().r().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Z() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L2b
        L1e:
            r0.close()
            return r1
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L40
        L26:
            r0 = move-exception
            goto L40
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            M4.l2 r3 = r6.f4245a     // Catch: java.lang.Throwable -> L1a
            M4.z1 r3 = r3.d()     // Catch: java.lang.Throwable -> L1a
            M4.x1 r3 = r3.r()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            return r1
        L40:
            if (r1 == 0) goto L45
            r1.close()
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.Z():java.lang.String");
    }

    public final List a0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.r.g(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r2 = r27.f4245a.d().r();
        r27.f4245a.z();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List c0(String str) {
        com.google.android.gms.common.internal.r.g(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.f4245a.z();
                cursorQuery = P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j9 = cursorQuery.getLong(2);
                    Object objY = Y(cursorQuery, 3);
                    if (objY == null) {
                        this.f4245a.d().r().b("Read invalid user property value, ignoring it. appId", C0858z1.z(str));
                    } else {
                        arrayList.add(new X4(str, str2, string, j9, objY));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e9) {
                this.f4245a.d().r().c("Error querying user properties. appId", C0858z1.z(str), e9);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r0 = r17.f4245a.d().r();
        r17.f4245a.z();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void e0() {
        i();
        P().beginTransaction();
    }

    public final void f0() {
        i();
        P().endTransaction();
    }

    public final void g0(List list) {
        h();
        i();
        com.google.android.gms.common.internal.r.m(list);
        com.google.android.gms.common.internal.r.o(list.size());
        if (u()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.f4245a.d().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e9) {
                this.f4245a.d().r().b("Error incrementing retry count. error", e9);
            }
        }
    }

    public final void h0() {
        h();
        i();
        if (u()) {
            long jA = this.f4234b.e0().f4837e.a();
            long jB = this.f4245a.a().b();
            long jAbs = Math.abs(jB - jA);
            this.f4245a.z();
            if (jAbs > ((Long) AbstractC0781m1.f4847A.a(null)).longValue()) {
                this.f4234b.e0().f4837e.b(jB);
                h();
                i();
                if (u()) {
                    SQLiteDatabase sQLiteDatabaseP = P();
                    String strValueOf = String.valueOf(this.f4245a.a().a());
                    this.f4245a.z();
                    int iDelete = sQLiteDatabaseP.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C0749h.i())});
                    if (iDelete > 0) {
                        this.f4245a.d().v().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @Override // M4.E4
    public final boolean l() {
        return false;
    }

    public final void m(String str, String str2) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        h();
        i();
        try {
            P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e9) {
            this.f4245a.d().r().d("Error deleting user property. appId", C0858z1.z(str), this.f4245a.D().f(str2), e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0329, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0332, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0333, code lost:
    
        r10.put("session_scoped", r0);
        r10.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0347, code lost:
    
        if (P().insertWithOnConflict("property_filters", null, r10, 5) != (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0349, code lost:
    
        r23.f4245a.d().r().b("Failed to insert property filter (got -1). appId", M4.C0858z1.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x035d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x035f, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r3 = r23.f4245a.d().r();
        r7 = "Error storing property filter. appId";
        r8 = M4.C0858z1.z(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0375, code lost:
    
        i();
        h();
        com.google.android.gms.common.internal.r.g(r24);
        r0 = P();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x039e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0177, code lost:
    
        r0.c(r8, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017b, code lost:
    
        r10 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0187, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r10.next()).zzj() != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0195, code lost:
    
        r0 = r23.f4245a.d().w();
        r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r10 = M4.C0858z1.z(r24);
        r9 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01aa, code lost:
    
        r10 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c0, code lost:
    
        if (r10.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c2, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.zzek) r10.next();
        i();
        h();
        com.google.android.gms.common.internal.r.g(r24);
        com.google.android.gms.common.internal.r.m(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01dc, code lost:
    
        if (r11.zzg().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01de, code lost:
    
        r0 = r23.f4245a.d().w();
        r10 = M4.C0858z1.z(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f6, code lost:
    
        if (r11.zzp() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f8, code lost:
    
        r16 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0203, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0205, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0210, code lost:
    
        r3 = r11.zzbx();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0229, code lost:
    
        if (r11.zzp() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022b, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0235, code lost:
    
        r7.put("filter_id", r8);
        r7.put("event_name", r11.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0245, code lost:
    
        if (r11.zzq() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0247, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0250, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0251, code lost:
    
        r7.put("session_scoped", r8);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0265, code lost:
    
        if (P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0267, code lost:
    
        r23.f4245a.d().r().b("Failed to insert event filter (got -1). appId", M4.C0858z1.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x027a, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0280, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0281, code lost:
    
        r3 = r23.f4245a.d().r();
        r7 = "Error storing event filter. appId";
        r8 = M4.C0858z1.z(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0291, code lost:
    
        r3.c(r7, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0296, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02a4, code lost:
    
        if (r0.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02a6, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        i();
        h();
        com.google.android.gms.common.internal.r.g(r24);
        com.google.android.gms.common.internal.r.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c0, code lost:
    
        if (r3.zze().isEmpty() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c2, code lost:
    
        r0 = r23.f4245a.d().w();
        r8 = M4.C0858z1.z(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02da, code lost:
    
        if (r3.zzj() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02dc, code lost:
    
        r16 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e7, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e9, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f2, code lost:
    
        r7 = r3.zzbx();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0309, code lost:
    
        if (r3.zzj() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x030b, code lost:
    
        r11 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0314, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0315, code lost:
    
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0327, code lost:
    
        if (r3.zzk() == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instruction units count: 1155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0773l.n(java.lang.String, java.util.List):void");
    }

    public final void o() {
        i();
        P().setTransactionSuccessful();
    }

    public final void p(I2 i22) {
        com.google.android.gms.common.internal.r.m(i22);
        h();
        i();
        String strL0 = i22.l0();
        com.google.android.gms.common.internal.r.m(strL0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strL0);
        contentValues.put("app_instance_id", i22.m0());
        contentValues.put("gmp_app_id", i22.a());
        contentValues.put("resettable_device_id_hash", i22.c());
        contentValues.put("last_bundle_index", Long.valueOf(i22.e0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i22.f0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i22.d0()));
        contentValues.put("app_version", i22.o0());
        contentValues.put("app_store", i22.n0());
        contentValues.put("gmp_version", Long.valueOf(i22.c0()));
        contentValues.put("dev_cert_hash", Long.valueOf(i22.Z()));
        contentValues.put("measurement_enabled", Boolean.valueOf(i22.O()));
        contentValues.put("day", Long.valueOf(i22.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(i22.W()));
        contentValues.put("daily_events_count", Long.valueOf(i22.V()));
        contentValues.put("daily_conversions_count", Long.valueOf(i22.T()));
        contentValues.put("config_fetched_time", Long.valueOf(i22.S()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(i22.b0()));
        contentValues.put("app_version_int", Long.valueOf(i22.R()));
        contentValues.put("firebase_instance_id", i22.p0());
        contentValues.put("daily_error_events_count", Long.valueOf(i22.U()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(i22.X()));
        contentValues.put("health_monitor_sample", i22.b());
        i22.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i22.N()));
        contentValues.put("admob_app_id", i22.j0());
        contentValues.put("dynamite_version", Long.valueOf(i22.a0()));
        contentValues.put("session_stitching_token", i22.d());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(i22.Q()));
        contentValues.put("target_os_version", Long.valueOf(i22.h0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(i22.g0()));
        List listE = i22.e();
        if (listE != null) {
            if (listE.isEmpty()) {
                this.f4245a.d().w().b("Safelisted events should not be an empty list. appId", strL0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listE));
            }
        }
        zzop.zzc();
        if (this.f4245a.z().B(null, AbstractC0781m1.f4909m0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseP = P();
            if (sQLiteDatabaseP.update("apps", contentValues, "app_id = ?", new String[]{strL0}) == 0 && sQLiteDatabaseP.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f4245a.d().r().b("Failed to insert/update app (got -1). appId", C0858z1.z(strL0));
            }
        } catch (SQLiteException e9) {
            this.f4245a.d().r().c("Error storing app. appId", C0858z1.z(strL0), e9);
        }
    }

    public final void q(r rVar) {
        com.google.android.gms.common.internal.r.m(rVar);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.f5025a);
        contentValues.put("name", rVar.f5026b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f5027c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f5028d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f5030f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f5031g));
        contentValues.put("last_bundled_day", rVar.f5032h);
        contentValues.put("last_sampled_complex_event_id", rVar.f5033i);
        contentValues.put("last_sampling_rate", rVar.f5034j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f5029e));
        Boolean bool = rVar.f5035k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f4245a.d().r().b("Failed to insert/update event aggregates (got -1). appId", C0858z1.z(rVar.f5025a));
            }
        } catch (SQLiteException e9) {
            this.f4245a.d().r().c("Error storing event aggregates. appId", C0858z1.z(rVar.f5025a), e9);
        }
    }

    public final boolean r() {
        return I("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean s() {
        return I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean t() {
        return I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean u() {
        Context contextC = this.f4245a.c();
        this.f4245a.z();
        return contextC.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean v(String str, Long l9, long j9, zzft zzftVar) {
        h();
        i();
        com.google.android.gms.common.internal.r.m(zzftVar);
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.m(l9);
        byte[] bArrZzbx = zzftVar.zzbx();
        this.f4245a.d().v().c("Saving complex main event, appId, data size", this.f4245a.D().d(str), Integer.valueOf(bArrZzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l9);
        contentValues.put("children_to_process", Long.valueOf(j9));
        contentValues.put("main_event", bArrZzbx);
        try {
            if (P().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f4245a.d().r().b("Failed to insert complex main event (got -1). appId", C0858z1.z(str));
            return false;
        } catch (SQLiteException e9) {
            this.f4245a.d().r().c("Error storing complex main event. appId", C0858z1.z(str), e9);
            return false;
        }
    }

    public final boolean w(C0725d c0725d) {
        com.google.android.gms.common.internal.r.m(c0725d);
        h();
        i();
        String str = c0725d.f4637f;
        com.google.android.gms.common.internal.r.m(str);
        if (X(str, c0725d.f4639h.f4519g) == null) {
            long jI = I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f4245a.z();
            if (jI >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0725d.f4638g);
        contentValues.put("name", c0725d.f4639h.f4519g);
        H(contentValues, "value", com.google.android.gms.common.internal.r.m(c0725d.f4639h.H()));
        contentValues.put("active", Boolean.valueOf(c0725d.f4641j));
        contentValues.put("trigger_event_name", c0725d.f4642k);
        contentValues.put("trigger_timeout", Long.valueOf(c0725d.f4644m));
        contentValues.put("timed_out_event", this.f4245a.N().e0(c0725d.f4643l));
        contentValues.put("creation_timestamp", Long.valueOf(c0725d.f4640i));
        contentValues.put("triggered_event", this.f4245a.N().e0(c0725d.f4645n));
        contentValues.put("triggered_timestamp", Long.valueOf(c0725d.f4639h.f4520h));
        contentValues.put("time_to_live", Long.valueOf(c0725d.f4646o));
        contentValues.put("expired_event", this.f4245a.N().e0(c0725d.f4647p));
        try {
            if (P().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.f4245a.d().r().b("Failed to insert/update conditional user property (got -1)", C0858z1.z(str));
            return true;
        } catch (SQLiteException e9) {
            this.f4245a.d().r().c("Error storing conditional user property", C0858z1.z(str), e9);
            return true;
        }
    }

    public final boolean x(X4 x42) {
        com.google.android.gms.common.internal.r.m(x42);
        h();
        i();
        if (X(x42.f4543a, x42.f4545c) == null) {
            if (a5.Z(x42.f4545c)) {
                if (I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{x42.f4543a}) >= this.f4245a.z().p(x42.f4543a, AbstractC0781m1.f4863I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(x42.f4545c)) {
                long jI = I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{x42.f4543a, x42.f4544b});
                this.f4245a.z();
                if (jI >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", x42.f4543a);
        contentValues.put("origin", x42.f4544b);
        contentValues.put("name", x42.f4545c);
        contentValues.put("set_timestamp", Long.valueOf(x42.f4546d));
        H(contentValues, "value", x42.f4547e);
        try {
            if (P().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f4245a.d().r().b("Failed to insert/update user property (got -1). appId", C0858z1.z(x42.f4543a));
            return true;
        } catch (SQLiteException e9) {
            this.f4245a.d().r().c("Error storing user property. appId", C0858z1.z(x42.f4543a), e9);
            return true;
        }
    }
}

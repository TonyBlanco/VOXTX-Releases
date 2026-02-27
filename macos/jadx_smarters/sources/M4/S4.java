package M4;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpStatus;
import org.joda.time.DateTimeConstants;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class S4 implements G2 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static volatile S4 f4464F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Map f4465A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Map f4466B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public A3 f4467C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f4468D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0722c2 f4470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1 f4471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0773l f4472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I1 f4473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4 f4474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0713b f4475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U4 f4476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0854y3 f4477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0778l4 f4478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G4 f4479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S1 f4480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0776l2 f4481l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f4485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FileLock f4491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FileChannel f4492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f4493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f4494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4495z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4482m = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Z4 f4469E = new N4(this);

    public S4(T4 t42, C0776l2 c0776l2) {
        com.google.android.gms.common.internal.r.m(t42);
        this.f4481l = C0776l2.H(t42.f4504a, null, null);
        this.f4495z = -1L;
        this.f4479j = new G4(this);
        U4 u42 = new U4(this);
        u42.j();
        this.f4476g = u42;
        F1 f12 = new F1(this);
        f12.j();
        this.f4471b = f12;
        C0722c2 c0722c2 = new C0722c2(this);
        c0722c2.j();
        this.f4470a = c0722c2;
        this.f4465A = new HashMap();
        this.f4466B = new HashMap();
        f().z(new H4(this, t42));
    }

    public static final void G(zzfs zzfsVar, int i9, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i10 = 0; i10 < listZzp.size(); i10++) {
            if ("_err".equals(((zzfx) listZzp.get(i10)).zzg())) {
                return;
            }
        }
        zzfw zzfwVarZze = zzfx.zze();
        zzfwVarZze.zzj("_err");
        zzfwVarZze.zzi(i9);
        zzfx zzfxVar = (zzfx) zzfwVarZze.zzaD();
        zzfw zzfwVarZze2 = zzfx.zze();
        zzfwVarZze2.zzj("_ev");
        zzfwVarZze2.zzk(str);
        zzfx zzfxVar2 = (zzfx) zzfwVarZze2.zzaD();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    public static final void H(zzfs zzfsVar, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i9 = 0; i9 < listZzp.size(); i9++) {
            if (str.equals(((zzfx) listZzp.get(i9)).zzg())) {
                zzfsVar.zzh(i9);
                return;
            }
        }
    }

    public static final boolean Q(f5 f5Var) {
        return (TextUtils.isEmpty(f5Var.f4687g) && TextUtils.isEmpty(f5Var.f4702v)) ? false : true;
    }

    public static final E4 R(E4 e42) {
        if (e42 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (e42.k()) {
            return e42;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e42.getClass())));
    }

    public static S4 f0(Context context) {
        com.google.android.gms.common.internal.r.m(context);
        com.google.android.gms.common.internal.r.m(context.getApplicationContext());
        if (f4464F == null) {
            synchronized (S4.class) {
                try {
                    if (f4464F == null) {
                        f4464F = new S4((T4) com.google.android.gms.common.internal.r.m(new T4(context)), null);
                    }
                } finally {
                }
            }
        }
        return f4464F;
    }

    public static /* bridge */ /* synthetic */ void k0(S4 s42, T4 t42) {
        s42.f().h();
        s42.f4480k = new S1(s42);
        C0773l c0773l = new C0773l(s42);
        c0773l.j();
        s42.f4472c = c0773l;
        s42.U().z((InterfaceC0743g) com.google.android.gms.common.internal.r.m(s42.f4470a));
        C0778l4 c0778l4 = new C0778l4(s42);
        c0778l4.j();
        s42.f4478i = c0778l4;
        C0713b c0713b = new C0713b(s42);
        c0713b.j();
        s42.f4475f = c0713b;
        C0854y3 c0854y3 = new C0854y3(s42);
        c0854y3.j();
        s42.f4477h = c0854y3;
        C4 c42 = new C4(s42);
        c42.j();
        s42.f4474e = c42;
        s42.f4473d = new I1(s42);
        if (s42.f4486q != s42.f4487r) {
            s42.d().r().c("Not all upload components initialized", Integer.valueOf(s42.f4486q), Integer.valueOf(s42.f4487r));
        }
        s42.f4482m = true;
    }

    public final void A(String str, K2 k22) {
        f().h();
        g();
        this.f4465A.put(str, k22);
        C0773l c0773l = this.f4472c;
        R(c0773l);
        com.google.android.gms.common.internal.r.m(str);
        com.google.android.gms.common.internal.r.m(k22);
        c0773l.h();
        c0773l.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", k22.i());
        try {
            if (c0773l.P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c0773l.f4245a.d().r().b("Failed to insert/update consent setting (got -1). appId", C0858z1.z(str));
            }
        } catch (SQLiteException e9) {
            c0773l.f4245a.d().r().c("Error storing consent setting. appId, error", C0858z1.z(str), e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(M4.V4 r18, M4.f5 r19) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.B(M4.V4, M4.f5):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029a A[Catch: all -> 0x0034, TryCatch #11 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:168:0x0383, B:170:0x0388, B:172:0x0390, B:173:0x0393, B:175:0x0398, B:176:0x039b, B:178:0x03a7, B:179:0x03bd, B:180:0x03c5, B:182:0x03d6, B:184:0x03e7, B:185:0x03fc, B:187:0x0409, B:189:0x041e, B:191:0x0429, B:192:0x0432, B:188:0x0417, B:194:0x0482, B:124:0x0266, B:135:0x0291, B:196:0x049a, B:197:0x049d, B:198:0x049e, B:203:0x04dc, B:223:0x0509, B:225:0x050f, B:227:0x051a, B:211:0x04ea, B:231:0x0525, B:232:0x0528), top: B:247:0x0010, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x050f A[Catch: all -> 0x0034, TryCatch #11 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:12:0x0038, B:14:0x003e, B:15:0x0049, B:17:0x0051, B:18:0x0055, B:20:0x0060, B:21:0x006b, B:23:0x0076, B:24:0x0084, B:26:0x00a3, B:28:0x00a9, B:29:0x00ac, B:31:0x00b8, B:32:0x00cf, B:34:0x00e0, B:36:0x00e6, B:40:0x00fb, B:56:0x0120, B:58:0x0125, B:59:0x0128, B:60:0x0129, B:64:0x0151, B:68:0x0159, B:73:0x018d, B:136:0x0294, B:138:0x029a, B:140:0x02a6, B:141:0x02aa, B:143:0x02b0, B:145:0x02c4, B:149:0x02cd, B:151:0x02d3, B:157:0x02f8, B:154:0x02e8, B:156:0x02f2, B:158:0x02fb, B:160:0x0316, B:164:0x0325, B:166:0x0349, B:168:0x0383, B:170:0x0388, B:172:0x0390, B:173:0x0393, B:175:0x0398, B:176:0x039b, B:178:0x03a7, B:179:0x03bd, B:180:0x03c5, B:182:0x03d6, B:184:0x03e7, B:185:0x03fc, B:187:0x0409, B:189:0x041e, B:191:0x0429, B:192:0x0432, B:188:0x0417, B:194:0x0482, B:124:0x0266, B:135:0x0291, B:196:0x049a, B:197:0x049d, B:198:0x049e, B:203:0x04dc, B:223:0x0509, B:225:0x050f, B:227:0x051a, B:211:0x04ea, B:231:0x0525, B:232:0x0528), top: B:247:0x0010, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189 A[Catch: all -> 0x0194, SQLiteException -> 0x0197, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0197, blocks: (B:70:0x0183, B:72:0x0189, B:79:0x019c, B:80:0x01a2, B:81:0x01a6, B:82:0x01b1), top: B:236:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c A[Catch: all -> 0x0194, SQLiteException -> 0x0197, TRY_ENTER, TryCatch #1 {SQLiteException -> 0x0197, blocks: (B:70:0x0183, B:72:0x0189, B:79:0x019c, B:80:0x01a2, B:81:0x01a6, B:82:0x01b1), top: B:236:0x0183 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instruction units count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.C():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7 A[Catch: all -> 0x01c5, TRY_ENTER, TryCatch #2 {all -> 0x01c5, blocks: (B:38:0x019f, B:41:0x01af, B:43:0x01b9, B:49:0x01c9, B:95:0x034a, B:104:0x0380, B:106:0x03be, B:108:0x03c3, B:109:0x03da, B:113:0x03ed, B:115:0x0405, B:117:0x040c, B:118:0x0423, B:123:0x044d, B:127:0x0470, B:128:0x0487, B:131:0x0498, B:134:0x04b5, B:135:0x04c9, B:137:0x04d3, B:139:0x04e0, B:141:0x04e6, B:142:0x04ef, B:143:0x04fd, B:145:0x0512, B:155:0x0548, B:156:0x055d, B:158:0x0582, B:161:0x059a, B:164:0x05dd, B:166:0x0609, B:168:0x0648, B:169:0x064d, B:171:0x0655, B:172:0x065a, B:174:0x0662, B:175:0x0667, B:177:0x0672, B:179:0x067f, B:181:0x068d, B:182:0x0692, B:184:0x069b, B:185:0x069f, B:187:0x06ac, B:188:0x06b1, B:190:0x06da, B:192:0x06e2, B:193:0x06e7, B:195:0x06ef, B:196:0x06f2, B:198:0x0716, B:201:0x0721, B:204:0x072a, B:205:0x0744, B:207:0x074a, B:209:0x075e, B:211:0x076a, B:213:0x0777, B:217:0x0791, B:218:0x07a1, B:222:0x07ab, B:223:0x07ae, B:225:0x07cc, B:227:0x07d0, B:229:0x07e2, B:231:0x07e6, B:233:0x07f1, B:234:0x07fa, B:236:0x0841, B:237:0x0846, B:239:0x084e, B:241:0x0858, B:242:0x085b, B:244:0x0868, B:246:0x0888, B:247:0x0895, B:248:0x08cb, B:250:0x08d3, B:252:0x08dd, B:253:0x08ea, B:255:0x08f4, B:256:0x0901, B:257:0x090d, B:259:0x0913, B:261:0x094d, B:263:0x095d, B:265:0x0967, B:267:0x097a, B:269:0x0980, B:270:0x09c6, B:272:0x09d0, B:273:0x09d3, B:274:0x09df, B:276:0x09e5, B:285:0x0a32, B:286:0x0a80, B:288:0x0a8f, B:307:0x0afe, B:293:0x0aaa, B:294:0x0aad, B:279:0x09f1, B:281:0x0a1d, B:306:0x0ae9, B:304:0x0ad1, B:305:0x0ae8, B:199:0x071b, B:165:0x05fb, B:152:0x052e, B:98:0x0360, B:99:0x0367, B:101:0x036d, B:103:0x0379, B:54:0x01db, B:57:0x01e7, B:59:0x01fe, B:64:0x0217, B:71:0x0255, B:73:0x025b, B:75:0x0269, B:77:0x027a, B:80:0x0284, B:92:0x030f, B:94:0x031a, B:81:0x02ae, B:82:0x02c8, B:84:0x02ce, B:91:0x02f6, B:90:0x02e3, B:67:0x0225, B:70:0x024b), top: B:318:0x019f, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024b A[Catch: all -> 0x01c5, TRY_ENTER, TryCatch #2 {all -> 0x01c5, blocks: (B:38:0x019f, B:41:0x01af, B:43:0x01b9, B:49:0x01c9, B:95:0x034a, B:104:0x0380, B:106:0x03be, B:108:0x03c3, B:109:0x03da, B:113:0x03ed, B:115:0x0405, B:117:0x040c, B:118:0x0423, B:123:0x044d, B:127:0x0470, B:128:0x0487, B:131:0x0498, B:134:0x04b5, B:135:0x04c9, B:137:0x04d3, B:139:0x04e0, B:141:0x04e6, B:142:0x04ef, B:143:0x04fd, B:145:0x0512, B:155:0x0548, B:156:0x055d, B:158:0x0582, B:161:0x059a, B:164:0x05dd, B:166:0x0609, B:168:0x0648, B:169:0x064d, B:171:0x0655, B:172:0x065a, B:174:0x0662, B:175:0x0667, B:177:0x0672, B:179:0x067f, B:181:0x068d, B:182:0x0692, B:184:0x069b, B:185:0x069f, B:187:0x06ac, B:188:0x06b1, B:190:0x06da, B:192:0x06e2, B:193:0x06e7, B:195:0x06ef, B:196:0x06f2, B:198:0x0716, B:201:0x0721, B:204:0x072a, B:205:0x0744, B:207:0x074a, B:209:0x075e, B:211:0x076a, B:213:0x0777, B:217:0x0791, B:218:0x07a1, B:222:0x07ab, B:223:0x07ae, B:225:0x07cc, B:227:0x07d0, B:229:0x07e2, B:231:0x07e6, B:233:0x07f1, B:234:0x07fa, B:236:0x0841, B:237:0x0846, B:239:0x084e, B:241:0x0858, B:242:0x085b, B:244:0x0868, B:246:0x0888, B:247:0x0895, B:248:0x08cb, B:250:0x08d3, B:252:0x08dd, B:253:0x08ea, B:255:0x08f4, B:256:0x0901, B:257:0x090d, B:259:0x0913, B:261:0x094d, B:263:0x095d, B:265:0x0967, B:267:0x097a, B:269:0x0980, B:270:0x09c6, B:272:0x09d0, B:273:0x09d3, B:274:0x09df, B:276:0x09e5, B:285:0x0a32, B:286:0x0a80, B:288:0x0a8f, B:307:0x0afe, B:293:0x0aaa, B:294:0x0aad, B:279:0x09f1, B:281:0x0a1d, B:306:0x0ae9, B:304:0x0ad1, B:305:0x0ae8, B:199:0x071b, B:165:0x05fb, B:152:0x052e, B:98:0x0360, B:99:0x0367, B:101:0x036d, B:103:0x0379, B:54:0x01db, B:57:0x01e7, B:59:0x01fe, B:64:0x0217, B:71:0x0255, B:73:0x025b, B:75:0x0269, B:77:0x027a, B:80:0x0284, B:92:0x030f, B:94:0x031a, B:81:0x02ae, B:82:0x02c8, B:84:0x02ce, B:91:0x02f6, B:90:0x02e3, B:67:0x0225, B:70:0x024b), top: B:318:0x019f, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025b A[Catch: all -> 0x01c5, TryCatch #2 {all -> 0x01c5, blocks: (B:38:0x019f, B:41:0x01af, B:43:0x01b9, B:49:0x01c9, B:95:0x034a, B:104:0x0380, B:106:0x03be, B:108:0x03c3, B:109:0x03da, B:113:0x03ed, B:115:0x0405, B:117:0x040c, B:118:0x0423, B:123:0x044d, B:127:0x0470, B:128:0x0487, B:131:0x0498, B:134:0x04b5, B:135:0x04c9, B:137:0x04d3, B:139:0x04e0, B:141:0x04e6, B:142:0x04ef, B:143:0x04fd, B:145:0x0512, B:155:0x0548, B:156:0x055d, B:158:0x0582, B:161:0x059a, B:164:0x05dd, B:166:0x0609, B:168:0x0648, B:169:0x064d, B:171:0x0655, B:172:0x065a, B:174:0x0662, B:175:0x0667, B:177:0x0672, B:179:0x067f, B:181:0x068d, B:182:0x0692, B:184:0x069b, B:185:0x069f, B:187:0x06ac, B:188:0x06b1, B:190:0x06da, B:192:0x06e2, B:193:0x06e7, B:195:0x06ef, B:196:0x06f2, B:198:0x0716, B:201:0x0721, B:204:0x072a, B:205:0x0744, B:207:0x074a, B:209:0x075e, B:211:0x076a, B:213:0x0777, B:217:0x0791, B:218:0x07a1, B:222:0x07ab, B:223:0x07ae, B:225:0x07cc, B:227:0x07d0, B:229:0x07e2, B:231:0x07e6, B:233:0x07f1, B:234:0x07fa, B:236:0x0841, B:237:0x0846, B:239:0x084e, B:241:0x0858, B:242:0x085b, B:244:0x0868, B:246:0x0888, B:247:0x0895, B:248:0x08cb, B:250:0x08d3, B:252:0x08dd, B:253:0x08ea, B:255:0x08f4, B:256:0x0901, B:257:0x090d, B:259:0x0913, B:261:0x094d, B:263:0x095d, B:265:0x0967, B:267:0x097a, B:269:0x0980, B:270:0x09c6, B:272:0x09d0, B:273:0x09d3, B:274:0x09df, B:276:0x09e5, B:285:0x0a32, B:286:0x0a80, B:288:0x0a8f, B:307:0x0afe, B:293:0x0aaa, B:294:0x0aad, B:279:0x09f1, B:281:0x0a1d, B:306:0x0ae9, B:304:0x0ad1, B:305:0x0ae8, B:199:0x071b, B:165:0x05fb, B:152:0x052e, B:98:0x0360, B:99:0x0367, B:101:0x036d, B:103:0x0379, B:54:0x01db, B:57:0x01e7, B:59:0x01fe, B:64:0x0217, B:71:0x0255, B:73:0x025b, B:75:0x0269, B:77:0x027a, B:80:0x0284, B:92:0x030f, B:94:0x031a, B:81:0x02ae, B:82:0x02c8, B:84:0x02ce, B:91:0x02f6, B:90:0x02e3, B:67:0x0225, B:70:0x024b), top: B:318:0x019f, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(M4.C0832v r34, M4.f5 r35) {
        /*
            Method dump skipped, instruction units count: 2878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.D(M4.v, M4.f5):void");
    }

    public final boolean E() {
        C0846x1 c0846x1W;
        String str;
        f().h();
        FileLock fileLock = this.f4491v;
        if (fileLock != null && fileLock.isValid()) {
            d().v().a("Storage concurrent access okay");
            return true;
        }
        this.f4472c.f4245a.z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f4481l.c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f4492w = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f4491v = fileLockTryLock;
            if (fileLockTryLock != null) {
                d().v().a("Storage concurrent access okay");
                return true;
            }
            d().r().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e9) {
            e = e9;
            c0846x1W = d().r();
            str = "Failed to acquire storage lock";
            c0846x1W.b(str, e);
            return false;
        } catch (IOException e10) {
            e = e10;
            c0846x1W = d().r();
            str = "Failed to access storage lock file";
            c0846x1W.b(str, e);
            return false;
        } catch (OverlappingFileLockException e11) {
            e = e11;
            c0846x1W = d().w();
            str = "Storage lock already acquired";
            c0846x1W.b(str, e);
            return false;
        }
    }

    public final long F() {
        long jA = a().a();
        C0778l4 c0778l4 = this.f4478i;
        c0778l4.i();
        c0778l4.h();
        long jA2 = c0778l4.f4841i.a();
        if (jA2 == 0) {
            jA2 = ((long) c0778l4.f4245a.N().u().nextInt(DateTimeConstants.MILLIS_PER_DAY)) + 1;
            c0778l4.f4841i.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    public final f5 I(String str) {
        String str2;
        C0846x1 c0846x1Q;
        Object objZ;
        String str3 = str;
        C0773l c0773l = this.f4472c;
        R(c0773l);
        I2 i2R = c0773l.R(str3);
        if (i2R == null || TextUtils.isEmpty(i2R.o0())) {
            str2 = "No app data available; dropping";
            objZ = str3;
            c0846x1Q = d().q();
        } else {
            Boolean boolJ = J(i2R);
            if (boolJ == null || boolJ.booleanValue()) {
                String strA = i2R.a();
                String strO0 = i2R.o0();
                long jR = i2R.R();
                String strN0 = i2R.n0();
                long jC0 = i2R.c0();
                long jZ = i2R.Z();
                boolean zO = i2R.O();
                String strP0 = i2R.p0();
                i2R.A();
                return new f5(str, strA, strO0, jR, strN0, jC0, jZ, (String) null, zO, false, strP0, 0L, 0L, 0, i2R.N(), false, i2R.j0(), i2R.i0(), i2R.a0(), i2R.e(), (String) null, c0(str).i(), "", (String) null, i2R.Q(), i2R.h0());
            }
            C0846x1 c0846x1R = d().r();
            str2 = "App version does not match; dropping. appId";
            objZ = C0858z1.z(str);
            c0846x1Q = c0846x1R;
        }
        c0846x1Q.b(str2, objZ);
        return null;
    }

    public final Boolean J(I2 i22) {
        try {
            if (i22.R() != -2147483648L) {
                if (i22.R() == E4.e.a(this.f4481l.c()).e(i22.l0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = E4.e.a(this.f4481l.c()).e(i22.l0(), 0).versionName;
                String strO0 = i22.o0();
                if (strO0 != null && strO0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void K() {
        f().h();
        if (this.f4488s || this.f4489t || this.f4490u) {
            d().v().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f4488s), Boolean.valueOf(this.f4489t), Boolean.valueOf(this.f4490u));
            return;
        }
        d().v().a("Stopping uploading service(s)");
        List list = this.f4485p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) com.google.android.gms.common.internal.r.m(this.f4485p)).clear();
    }

    public final void L(zzgc zzgcVar, long j9, boolean z9) {
        C0773l c0773l = this.f4472c;
        R(c0773l);
        String str = true != z9 ? "_lte" : "_se";
        X4 x4X = c0773l.X(zzgcVar.zzaq(), str);
        X4 x42 = (x4X == null || x4X.f4547e == null) ? new X4(zzgcVar.zzaq(), "auto", str, a().a(), Long.valueOf(j9)) : new X4(zzgcVar.zzaq(), "auto", str, a().a(), Long.valueOf(((Long) x4X.f4547e).longValue() + j9));
        zzgl zzglVarZzd = zzgm.zzd();
        zzglVarZzd.zzf(str);
        zzglVarZzd.zzg(a().a());
        zzglVarZzd.zze(((Long) x42.f4547e).longValue());
        zzgm zzgmVar = (zzgm) zzglVarZzd.zzaD();
        int iX = U4.x(zzgcVar, str);
        if (iX >= 0) {
            zzgcVar.zzan(iX, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j9 > 0) {
            C0773l c0773l2 = this.f4472c;
            R(c0773l2);
            c0773l2.x(x42);
            d().v().c("Updated engagement user property. scope, value", true != z9 ? "lifetime" : "session-scoped", x42.f4547e);
        }
    }

    public final void M() {
        C0775l1 c0775l1;
        long jMax;
        f().h();
        g();
        if (this.f4484o > 0) {
            long jAbs = 3600000 - Math.abs(a().b() - this.f4484o);
            if (jAbs > 0) {
                d().v().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                Y().c();
                C4 c42 = this.f4474e;
                R(c42);
                c42.m();
                return;
            }
            this.f4484o = 0L;
        }
        if (!this.f4481l.r() || !O()) {
            d().v().a("Nothing to upload or uploading impossible");
            Y().c();
            C4 c43 = this.f4474e;
            R(c43);
            c43.m();
            return;
        }
        long jA = a().a();
        U();
        long jMax2 = Math.max(0L, ((Long) AbstractC0781m1.f4851C.a(null)).longValue());
        C0773l c0773l = this.f4472c;
        R(c0773l);
        boolean z9 = true;
        if (!c0773l.t()) {
            C0773l c0773l2 = this.f4472c;
            R(c0773l2);
            if (!c0773l2.s()) {
                z9 = false;
            }
        }
        if (z9) {
            String strU = U().u();
            if (TextUtils.isEmpty(strU) || ".none.".equals(strU)) {
                U();
                c0775l1 = AbstractC0781m1.f4928w;
            } else {
                U();
                c0775l1 = AbstractC0781m1.f4930x;
            }
        } else {
            U();
            c0775l1 = AbstractC0781m1.f4926v;
        }
        long jMax3 = Math.max(0L, ((Long) c0775l1.a(null)).longValue());
        long jA2 = this.f4478i.f4839g.a();
        long jA3 = this.f4478i.f4840h.a();
        C0773l c0773l3 = this.f4472c;
        R(c0773l3);
        boolean z10 = z9;
        long jM = c0773l3.M();
        C0773l c0773l4 = this.f4472c;
        R(c0773l4);
        long jMax4 = Math.max(jM, c0773l4.N());
        if (jMax4 == 0) {
            jMax = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            jMax = jAbs2 + jMax2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z10 && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            U4 u42 = this.f4476g;
            R(u42);
            if (!u42.O(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i9 = 0;
                while (true) {
                    U();
                    if (i9 >= Math.min(20, Math.max(0, ((Integer) AbstractC0781m1.f4855E.a(null)).intValue()))) {
                        break;
                    }
                    U();
                    jMax += Math.max(0L, ((Long) AbstractC0781m1.f4853D.a(null)).longValue()) * (1 << i9);
                    if (jMax > jAbs4) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        if (jMax == 0) {
            d().v().a("Next upload time is 0");
            Y().c();
            C4 c44 = this.f4474e;
            R(c44);
            c44.m();
            return;
        }
        F1 f12 = this.f4471b;
        R(f12);
        if (!f12.m()) {
            d().v().a("No network");
            Y().b();
            C4 c45 = this.f4474e;
            R(c45);
            c45.m();
            return;
        }
        long jA4 = this.f4478i.f4838f.a();
        U();
        long jMax6 = Math.max(0L, ((Long) AbstractC0781m1.f4922t.a(null)).longValue());
        U4 u43 = this.f4476g;
        R(u43);
        if (!u43.O(jA4, jMax6)) {
            jMax = Math.max(jMax, jA4 + jMax6);
        }
        Y().c();
        long jA5 = jMax - a().a();
        if (jA5 <= 0) {
            U();
            jA5 = Math.max(0L, ((Long) AbstractC0781m1.f4932y.a(null)).longValue());
            this.f4478i.f4839g.b(a().a());
        }
        d().v().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        C4 c46 = this.f4474e;
        R(c46);
        c46.n(jA5);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x043f A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x048a A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x052c A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07da A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x080e A[Catch: all -> 0x00eb, EDGE_INSN: B:440:0x080e->B:263:0x080e BREAK  A[LOOP:11: B:254:0x07e2->B:262:0x080b], TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0823 A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0843 A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08a3 A[PHI: r3
      0x08a3: PHI (r3v23 M4.r) = (r3v22 M4.r), (r3v35 M4.r) binds: [B:267:0x084d, B:269:0x0862] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b19 A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034b A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0363 A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037c A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:156:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:40:0x016b, B:41:0x016e, B:44:0x0185, B:53:0x01bc, B:56:0x01c6, B:58:0x01d4, B:62:0x0219, B:59:0x01f0, B:61:0x0200, B:66:0x0226, B:68:0x0252, B:69:0x027c, B:71:0x02b3, B:73:0x02b9, B:76:0x02c5, B:78:0x02fb, B:79:0x0316, B:81:0x031c, B:83:0x032a, B:87:0x033d, B:84:0x0332, B:90:0x0344, B:93:0x034b, B:94:0x0363, B:96:0x037c, B:97:0x0388, B:100:0x0392, B:106:0x03b5, B:103:0x03a4, B:128:0x0433, B:130:0x043f, B:133:0x0452, B:135:0x0463, B:137:0x046f, B:155:0x04e0, B:143:0x048a, B:145:0x0498, B:148:0x04ad, B:150:0x04be, B:152:0x04ca, B:110:0x03bd, B:112:0x03c9, B:114:0x03d5, B:127:0x041b, B:119:0x03f3, B:122:0x0405, B:124:0x040b, B:126:0x0415, B:159:0x050a, B:161:0x0518, B:163:0x0523, B:175:0x0557, B:165:0x052c, B:167:0x0537, B:169:0x053d, B:172:0x0549, B:174:0x0551, B:176:0x0559, B:177:0x0565, B:180:0x056d, B:182:0x057f, B:183:0x058b, B:185:0x0593, B:189:0x05b8, B:191:0x05dd, B:193:0x05ee, B:195:0x05f4, B:197:0x0600, B:198:0x0631, B:200:0x0637, B:202:0x0645, B:203:0x0649, B:204:0x064c, B:205:0x064f, B:206:0x065d, B:208:0x0663, B:210:0x0673, B:211:0x067a, B:213:0x0686, B:214:0x068d, B:215:0x0690, B:217:0x06ce, B:218:0x06e1, B:220:0x06e7, B:223:0x0701, B:225:0x071c, B:227:0x0735, B:229:0x073a, B:231:0x073e, B:233:0x0742, B:235:0x074c, B:236:0x0756, B:238:0x075a, B:240:0x0760, B:241:0x076e, B:242:0x0777, B:309:0x09a6, B:243:0x0783, B:245:0x079a, B:251:0x07b6, B:253:0x07da, B:254:0x07e2, B:256:0x07e8, B:258:0x07fa, B:265:0x0823, B:266:0x0843, B:268:0x084f, B:270:0x0864, B:272:0x08a5, B:278:0x08c1, B:280:0x08cc, B:282:0x08d0, B:284:0x08d4, B:286:0x08d8, B:287:0x08e6, B:289:0x08ec, B:291:0x0904, B:292:0x0909, B:308:0x09a3, B:293:0x0923, B:295:0x092b, B:299:0x0952, B:301:0x097a, B:302:0x0981, B:303:0x098d, B:307:0x0997, B:296:0x0938, B:263:0x080e, B:249:0x07a1, B:310:0x09b1, B:312:0x09be, B:313:0x09c4, B:314:0x09cc, B:316:0x09d2, B:319:0x09ec, B:321:0x09fd, B:341:0x0a71, B:343:0x0a77, B:345:0x0a8f, B:348:0x0a96, B:353:0x0ac5, B:355:0x0b07, B:358:0x0b3c, B:359:0x0b40, B:360:0x0b4b, B:362:0x0b8e, B:363:0x0b9b, B:365:0x0baa, B:369:0x0bc4, B:370:0x0bd8, B:372:0x0bdd, B:357:0x0b19, B:349:0x0a9e, B:351:0x0aaa, B:352:0x0aae, B:373:0x0bf3, B:374:0x0c0b, B:377:0x0c13, B:378:0x0c18, B:379:0x0c28, B:381:0x0c42, B:382:0x0c5d, B:383:0x0c66, B:388:0x0c85, B:387:0x0c72, B:322:0x0a15, B:324:0x0a1b, B:326:0x0a25, B:328:0x0a2c, B:334:0x0a3c, B:336:0x0a43, B:338:0x0a62, B:340:0x0a69, B:339:0x0a66, B:335:0x0a40, B:327:0x0a29, B:186:0x0598, B:188:0x059e, B:391:0x0c97), top: B:402:0x000e, inners: #0, #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(java.lang.String r41, long r42) {
        /*
            Method dump skipped, instruction units count: 3250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.N(java.lang.String, long):boolean");
    }

    public final boolean O() {
        f().h();
        g();
        C0773l c0773l = this.f4472c;
        R(c0773l);
        if (c0773l.r()) {
            return true;
        }
        C0773l c0773l2 = this.f4472c;
        R(c0773l2);
        return !TextUtils.isEmpty(c0773l2.Z());
    }

    public final boolean P(zzfs zzfsVar, zzfs zzfsVar2) {
        com.google.android.gms.common.internal.r.a("_e".equals(zzfsVar.zzo()));
        R(this.f4476g);
        zzfx zzfxVarO = U4.o((zzft) zzfsVar.zzaD(), "_sc");
        String strZzh = zzfxVarO == null ? null : zzfxVarO.zzh();
        R(this.f4476g);
        zzfx zzfxVarO2 = U4.o((zzft) zzfsVar2.zzaD(), "_pc");
        String strZzh2 = zzfxVarO2 != null ? zzfxVarO2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        com.google.android.gms.common.internal.r.a("_e".equals(zzfsVar.zzo()));
        R(this.f4476g);
        zzfx zzfxVarO3 = U4.o((zzft) zzfsVar.zzaD(), "_et");
        if (zzfxVarO3 == null || !zzfxVarO3.zzw() || zzfxVarO3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfxVarO3.zzd();
        R(this.f4476g);
        zzfx zzfxVarO4 = U4.o((zzft) zzfsVar2.zzaD(), "_et");
        if (zzfxVarO4 != null && zzfxVarO4.zzd() > 0) {
            jZzd += zzfxVarO4.zzd();
        }
        R(this.f4476g);
        U4.m(zzfsVar2, "_et", Long.valueOf(jZzd));
        R(this.f4476g);
        U4.m(zzfsVar, "_fr", 1L);
        return true;
    }

    public final I2 S(f5 f5Var) {
        f().h();
        g();
        com.google.android.gms.common.internal.r.m(f5Var);
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        Q4 q42 = null;
        if (!f5Var.f4682B.isEmpty()) {
            this.f4466B.put(f5Var.f4686f, new R4(this, f5Var.f4682B));
        }
        C0773l c0773l = this.f4472c;
        R(c0773l);
        I2 i2R = c0773l.R(f5Var.f4686f);
        K2 k2D = c0(f5Var.f4686f).d(K2.c(f5Var.f4681A, 100));
        J2 j22 = J2.AD_STORAGE;
        String strO = k2D.j(j22) ? this.f4478i.o(f5Var.f4686f, f5Var.f4700t) : "";
        if (i2R == null) {
            i2R = new I2(this.f4481l, f5Var.f4686f);
            if (k2D.j(J2.ANALYTICS_STORAGE)) {
                i2R.j(i0(k2D));
            }
            if (k2D.j(j22)) {
                i2R.H(strO);
            }
        } else if (k2D.j(j22) && strO != null && !strO.equals(i2R.c())) {
            i2R.H(strO);
            if (f5Var.f4700t && !"00000000-0000-0000-0000-000000000000".equals(this.f4478i.n(f5Var.f4686f, k2D).first)) {
                i2R.j(i0(k2D));
                C0773l c0773l2 = this.f4472c;
                R(c0773l2);
                if (c0773l2.X(f5Var.f4686f, "_id") != null) {
                    C0773l c0773l3 = this.f4472c;
                    R(c0773l3);
                    if (c0773l3.X(f5Var.f4686f, "_lair") == null) {
                        X4 x42 = new X4(f5Var.f4686f, "auto", "_lair", a().a(), 1L);
                        C0773l c0773l4 = this.f4472c;
                        R(c0773l4);
                        c0773l4.x(x42);
                    }
                }
            }
        } else if (TextUtils.isEmpty(i2R.m0()) && k2D.j(J2.ANALYTICS_STORAGE)) {
            i2R.j(i0(k2D));
        }
        i2R.y(f5Var.f4687g);
        i2R.h(f5Var.f4702v);
        if (!TextUtils.isEmpty(f5Var.f4696p)) {
            i2R.x(f5Var.f4696p);
        }
        long j9 = f5Var.f4690j;
        if (j9 != 0) {
            i2R.z(j9);
        }
        if (!TextUtils.isEmpty(f5Var.f4688h)) {
            i2R.l(f5Var.f4688h);
        }
        i2R.m(f5Var.f4695o);
        String str = f5Var.f4689i;
        if (str != null) {
            i2R.k(str);
        }
        i2R.u(f5Var.f4691k);
        i2R.F(f5Var.f4693m);
        if (!TextUtils.isEmpty(f5Var.f4692l)) {
            i2R.B(f5Var.f4692l);
        }
        i2R.i(f5Var.f4700t);
        i2R.G(f5Var.f4703w);
        i2R.v(f5Var.f4704x);
        zzqu.zzc();
        if (U().B(null, AbstractC0781m1.f4913o0) || U().B(f5Var.f4686f, AbstractC0781m1.f4917q0)) {
            i2R.J(f5Var.f4683C);
        }
        zzop.zzc();
        if (U().B(null, AbstractC0781m1.f4911n0)) {
            i2R.I(f5Var.f4705y);
        } else {
            zzop.zzc();
            if (U().B(null, AbstractC0781m1.f4909m0)) {
                i2R.I(null);
            }
        }
        zzrd.zzc();
        if (U().B(null, AbstractC0781m1.f4921s0)) {
            i2R.L(f5Var.f4684D);
        }
        zzpz.zzc();
        if (U().B(null, AbstractC0781m1.f4860G0)) {
            i2R.M(f5Var.f4685E);
        }
        if (i2R.P()) {
            C0773l c0773l5 = this.f4472c;
            R(c0773l5);
            c0773l5.p(i2R);
        }
        return i2R;
    }

    public final C0713b T() {
        C0713b c0713b = this.f4475f;
        R(c0713b);
        return c0713b;
    }

    public final C0749h U() {
        return ((C0776l2) com.google.android.gms.common.internal.r.m(this.f4481l)).z();
    }

    public final C0773l V() {
        C0773l c0773l = this.f4472c;
        R(c0773l);
        return c0773l;
    }

    public final C0828u1 W() {
        return this.f4481l.D();
    }

    public final F1 X() {
        F1 f12 = this.f4471b;
        R(f12);
        return f12;
    }

    public final I1 Y() {
        I1 i12 = this.f4473d;
        if (i12 != null) {
            return i12;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final C0722c2 Z() {
        C0722c2 c0722c2 = this.f4470a;
        R(c0722c2);
        return c0722c2;
    }

    @Override // M4.G2
    public final C4.e a() {
        return ((C0776l2) com.google.android.gms.common.internal.r.m(this.f4481l)).a();
    }

    @Override // M4.G2
    public final C0719c b() {
        throw null;
    }

    public final C0776l2 b0() {
        return this.f4481l;
    }

    @Override // M4.G2
    public final Context c() {
        return this.f4481l.c();
    }

    public final K2 c0(String str) {
        String string;
        K2 k22 = K2.f4337c;
        f().h();
        g();
        K2 k23 = (K2) this.f4465A.get(str);
        if (k23 != null) {
            return k23;
        }
        C0773l c0773l = this.f4472c;
        R(c0773l);
        com.google.android.gms.common.internal.r.m(str);
        c0773l.h();
        c0773l.i();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c0773l.P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                K2 k2C = K2.c(string, 100);
                A(str, k2C);
                return k2C;
            } catch (SQLiteException e9) {
                c0773l.f4245a.d().r().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e9);
                throw e9;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // M4.G2
    public final C0858z1 d() {
        return ((C0776l2) com.google.android.gms.common.internal.r.m(this.f4481l)).d();
    }

    public final C0854y3 d0() {
        C0854y3 c0854y3 = this.f4477h;
        R(c0854y3);
        return c0854y3;
    }

    public final void e() {
        C0846x1 c0846x1R;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        f().h();
        g();
        if (this.f4483n) {
            return;
        }
        this.f4483n = true;
        if (E()) {
            FileChannel fileChannel = this.f4492w;
            f().h();
            int i9 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                d().r().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i10 = fileChannel.read(byteBufferAllocate);
                    if (i10 == 4) {
                        byteBufferAllocate.flip();
                        i9 = byteBufferAllocate.getInt();
                    } else if (i10 != -1) {
                        d().w().b("Unexpected data length. Bytes read", Integer.valueOf(i10));
                    }
                } catch (IOException e9) {
                    d().r().b("Failed to read from channel", e9);
                }
            }
            int iP = this.f4481l.B().p();
            f().h();
            if (i9 > iP) {
                c0846x1R = d().r();
                numValueOf = Integer.valueOf(i9);
                numValueOf2 = Integer.valueOf(iP);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (i9 >= iP) {
                    return;
                }
                FileChannel fileChannel2 = this.f4492w;
                f().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    d().r().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iP);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            d().r().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        c0846x1R = d().v();
                        numValueOf = Integer.valueOf(i9);
                        numValueOf2 = Integer.valueOf(iP);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e10) {
                        d().r().b("Failed to write to channel", e10);
                        c0846x1R = d().r();
                        numValueOf = Integer.valueOf(i9);
                        numValueOf2 = Integer.valueOf(iP);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                c0846x1R = d().r();
                numValueOf = Integer.valueOf(i9);
                numValueOf2 = Integer.valueOf(iP);
                str = "Storage version upgrade failed. Previous, current version";
            }
            c0846x1R.c(str, numValueOf, numValueOf2);
        }
    }

    public final C0778l4 e0() {
        return this.f4478i;
    }

    @Override // M4.G2
    public final C0758i2 f() {
        return ((C0776l2) com.google.android.gms.common.internal.r.m(this.f4481l)).f();
    }

    public final void g() {
        if (!this.f4482m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final U4 g0() {
        U4 u42 = this.f4476g;
        R(u42);
        return u42;
    }

    public final void h(String str, zzgc zzgcVar) {
        int iX;
        int iIndexOf;
        C0722c2 c0722c2 = this.f4470a;
        R(c0722c2);
        Set setY = c0722c2.y(str);
        if (setY != null) {
            zzgcVar.zzi(setY);
        }
        C0722c2 c0722c22 = this.f4470a;
        R(c0722c22);
        if (c0722c22.J(str)) {
            zzgcVar.zzp();
        }
        C0722c2 c0722c23 = this.f4470a;
        R(c0722c23);
        if (c0722c23.M(str)) {
            if (U().B(str, AbstractC0781m1.f4923t0)) {
                String strZzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(strZzas) && (iIndexOf = strZzas.indexOf(InstructionFileId.DOT)) != -1) {
                    zzgcVar.zzY(strZzas.substring(0, iIndexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        C0722c2 c0722c24 = this.f4470a;
        R(c0722c24);
        if (c0722c24.N(str) && (iX = U4.x(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(iX);
        }
        C0722c2 c0722c25 = this.f4470a;
        R(c0722c25);
        if (c0722c25.L(str)) {
            zzgcVar.zzq();
        }
        C0722c2 c0722c26 = this.f4470a;
        R(c0722c26);
        if (c0722c26.I(str)) {
            zzgcVar.zzn();
            R4 r42 = (R4) this.f4466B.get(str);
            if (r42 == null || r42.f4456b + U().r(str, AbstractC0781m1.f4879V) < a().b()) {
                r42 = new R4(this);
                this.f4466B.put(str, r42);
            }
            zzgcVar.zzR(r42.f4455a);
        }
        C0722c2 c0722c27 = this.f4470a;
        R(c0722c27);
        if (c0722c27.K(str)) {
            zzgcVar.zzy();
        }
    }

    public final a5 h0() {
        return ((C0776l2) com.google.android.gms.common.internal.r.m(this.f4481l)).N();
    }

    public final void i(I2 i22) {
        f().h();
        if (TextUtils.isEmpty(i22.a()) && TextUtils.isEmpty(i22.j0())) {
            n((String) com.google.android.gms.common.internal.r.m(i22.l0()), HttpStatus.SC_NO_CONTENT, null, null, null);
            return;
        }
        G4 g42 = this.f4479j;
        Uri.Builder builder = new Uri.Builder();
        String strA = i22.a();
        if (TextUtils.isEmpty(strA)) {
            strA = i22.j0();
        }
        C2695a c2695a = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) AbstractC0781m1.f4896g.a(null)).encodedAuthority((String) AbstractC0781m1.f4898h.a(null)).path("config/app/".concat(String.valueOf(strA))).appendQueryParameter("platform", "android");
        g42.f4245a.z().q();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) com.google.android.gms.common.internal.r.m(i22.l0());
            URL url = new URL(string);
            d().v().b("Fetching remote configuration", str);
            C0722c2 c0722c2 = this.f4470a;
            R(c0722c2);
            zzff zzffVarT = c0722c2.t(str);
            C0722c2 c0722c22 = this.f4470a;
            R(c0722c22);
            String strV = c0722c22.v(str);
            if (zzffVarT != null) {
                if (!TextUtils.isEmpty(strV)) {
                    c2695a = new C2695a();
                    c2695a.put("If-Modified-Since", strV);
                }
                C0722c2 c0722c23 = this.f4470a;
                R(c0722c23);
                String strU = c0722c23.u(str);
                if (!TextUtils.isEmpty(strU)) {
                    if (c2695a == null) {
                        c2695a = new C2695a();
                    }
                    c2695a.put("If-None-Match", strU);
                }
            }
            this.f4488s = true;
            F1 f12 = this.f4471b;
            R(f12);
            J4 j42 = new J4(this);
            f12.h();
            f12.i();
            com.google.android.gms.common.internal.r.m(url);
            com.google.android.gms.common.internal.r.m(j42);
            f12.f4245a.f().y(new E1(f12, str, url, null, c2695a, j42));
        } catch (MalformedURLException unused) {
            d().r().c("Failed to parse config URL. Not fetching. appId", C0858z1.z(i22.l0()), string);
        }
    }

    public final String i0(K2 k22) {
        if (!k22.j(J2.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        h0().u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void j(C0832v c0832v, f5 f5Var) {
        C0832v c0832v2;
        List<C0725d> listB0;
        List<C0725d> listB02;
        List<C0725d> listB03;
        C0846x1 c0846x1R;
        String str;
        Object objZ;
        String strF;
        Object obj;
        String str2;
        com.google.android.gms.common.internal.r.m(f5Var);
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        f().h();
        g();
        String str3 = f5Var.f4686f;
        long j9 = c0832v.f5091i;
        A1 a1B = A1.b(c0832v);
        f().h();
        A3 a32 = null;
        if (this.f4467C != null && (str2 = this.f4468D) != null && str2.equals(str3)) {
            a32 = this.f4467C;
        }
        a5.y(a32, a1B.f4185d, false);
        C0832v c0832vA = a1B.a();
        R(this.f4476g);
        if (U4.n(c0832vA, f5Var)) {
            if (!f5Var.f4693m) {
                S(f5Var);
                return;
            }
            List list = f5Var.f4705y;
            if (list == null) {
                c0832v2 = c0832vA;
            } else if (!list.contains(c0832vA.f5088f)) {
                d().q().d("Dropping non-safelisted event. appId, event name, origin", str3, c0832vA.f5088f, c0832vA.f5090h);
                return;
            } else {
                Bundle bundleJ = c0832vA.f5089g.J();
                bundleJ.putLong("ga_safelisted", 1L);
                c0832v2 = new C0832v(c0832vA.f5088f, new C0820t(bundleJ), c0832vA.f5090h, c0832vA.f5091i);
            }
            C0773l c0773l = this.f4472c;
            R(c0773l);
            c0773l.e0();
            try {
                C0773l c0773l2 = this.f4472c;
                R(c0773l2);
                com.google.android.gms.common.internal.r.g(str3);
                c0773l2.h();
                c0773l2.i();
                if (j9 < 0) {
                    c0773l2.f4245a.d().w().c("Invalid time querying timed out conditional properties", C0858z1.z(str3), Long.valueOf(j9));
                    listB0 = Collections.emptyList();
                } else {
                    listB0 = c0773l2.b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j9)});
                }
                for (C0725d c0725d : listB0) {
                    if (c0725d != null) {
                        d().v().d("User property timed out", c0725d.f4637f, this.f4481l.D().f(c0725d.f4639h.f4519g), c0725d.f4639h.H());
                        C0832v c0832v3 = c0725d.f4643l;
                        if (c0832v3 != null) {
                            D(new C0832v(c0832v3, j9), f5Var);
                        }
                        C0773l c0773l3 = this.f4472c;
                        R(c0773l3);
                        c0773l3.J(str3, c0725d.f4639h.f4519g);
                    }
                }
                C0773l c0773l4 = this.f4472c;
                R(c0773l4);
                com.google.android.gms.common.internal.r.g(str3);
                c0773l4.h();
                c0773l4.i();
                if (j9 < 0) {
                    c0773l4.f4245a.d().w().c("Invalid time querying expired conditional properties", C0858z1.z(str3), Long.valueOf(j9));
                    listB02 = Collections.emptyList();
                } else {
                    listB02 = c0773l4.b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j9)});
                }
                ArrayList arrayList = new ArrayList(listB02.size());
                for (C0725d c0725d2 : listB02) {
                    if (c0725d2 != null) {
                        d().v().d("User property expired", c0725d2.f4637f, this.f4481l.D().f(c0725d2.f4639h.f4519g), c0725d2.f4639h.H());
                        C0773l c0773l5 = this.f4472c;
                        R(c0773l5);
                        c0773l5.m(str3, c0725d2.f4639h.f4519g);
                        C0832v c0832v4 = c0725d2.f4647p;
                        if (c0832v4 != null) {
                            arrayList.add(c0832v4);
                        }
                        C0773l c0773l6 = this.f4472c;
                        R(c0773l6);
                        c0773l6.J(str3, c0725d2.f4639h.f4519g);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    D(new C0832v((C0832v) it.next(), j9), f5Var);
                }
                C0773l c0773l7 = this.f4472c;
                R(c0773l7);
                String str4 = c0832v2.f5088f;
                com.google.android.gms.common.internal.r.g(str3);
                com.google.android.gms.common.internal.r.g(str4);
                c0773l7.h();
                c0773l7.i();
                if (j9 < 0) {
                    c0773l7.f4245a.d().w().d("Invalid time querying triggered conditional properties", C0858z1.z(str3), c0773l7.f4245a.D().d(str4), Long.valueOf(j9));
                    listB03 = Collections.emptyList();
                } else {
                    listB03 = c0773l7.b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j9)});
                }
                ArrayList arrayList2 = new ArrayList(listB03.size());
                for (C0725d c0725d3 : listB03) {
                    if (c0725d3 != null) {
                        V4 v42 = c0725d3.f4639h;
                        X4 x42 = new X4((String) com.google.android.gms.common.internal.r.m(c0725d3.f4637f), c0725d3.f4638g, v42.f4519g, j9, com.google.android.gms.common.internal.r.m(v42.H()));
                        C0773l c0773l8 = this.f4472c;
                        R(c0773l8);
                        if (c0773l8.x(x42)) {
                            c0846x1R = d().v();
                            str = "User property triggered";
                            objZ = c0725d3.f4637f;
                            strF = this.f4481l.D().f(x42.f4545c);
                            obj = x42.f4547e;
                        } else {
                            c0846x1R = d().r();
                            str = "Too many active user properties, ignoring";
                            objZ = C0858z1.z(c0725d3.f4637f);
                            strF = this.f4481l.D().f(x42.f4545c);
                            obj = x42.f4547e;
                        }
                        c0846x1R.d(str, objZ, strF, obj);
                        C0832v c0832v5 = c0725d3.f4645n;
                        if (c0832v5 != null) {
                            arrayList2.add(c0832v5);
                        }
                        c0725d3.f4639h = new V4(x42);
                        c0725d3.f4641j = true;
                        C0773l c0773l9 = this.f4472c;
                        R(c0773l9);
                        c0773l9.w(c0725d3);
                    }
                }
                D(c0832v2, f5Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    D(new C0832v((C0832v) it2.next(), j9), f5Var);
                }
                C0773l c0773l10 = this.f4472c;
                R(c0773l10);
                c0773l10.o();
                C0773l c0773l11 = this.f4472c;
                R(c0773l11);
                c0773l11.f0();
            } catch (Throwable th) {
                C0773l c0773l12 = this.f4472c;
                R(c0773l12);
                c0773l12.f0();
                throw th;
            }
        }
    }

    public final String j0(f5 f5Var) {
        try {
            return (String) f().s(new L4(this, f5Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e9) {
            d().r().c("Failed to get app instance id. appId", C0858z1.z(f5Var.f4686f), e9);
            return null;
        }
    }

    public final void k(C0832v c0832v, String str) {
        C0773l c0773l = this.f4472c;
        R(c0773l);
        I2 i2R = c0773l.R(str);
        if (i2R == null || TextUtils.isEmpty(i2R.o0())) {
            d().q().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolJ = J(i2R);
        if (boolJ == null) {
            if (!"_ui".equals(c0832v.f5088f)) {
                d().w().b("Could not find package. appId", C0858z1.z(str));
            }
        } else if (!boolJ.booleanValue()) {
            d().r().b("App version does not match; dropping event. appId", C0858z1.z(str));
            return;
        }
        String strA = i2R.a();
        String strO0 = i2R.o0();
        long jR = i2R.R();
        String strN0 = i2R.n0();
        long jC0 = i2R.c0();
        long jZ = i2R.Z();
        boolean zO = i2R.O();
        String strP0 = i2R.p0();
        i2R.A();
        l(c0832v, new f5(str, strA, strO0, jR, strN0, jC0, jZ, (String) null, zO, false, strP0, 0L, 0L, 0, i2R.N(), false, i2R.j0(), i2R.i0(), i2R.a0(), i2R.e(), (String) null, c0(str).i(), "", (String) null, i2R.Q(), i2R.h0()));
    }

    public final void l(C0832v c0832v, f5 f5Var) {
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        A1 a1B = A1.b(c0832v);
        a5 a5VarH0 = h0();
        Bundle bundle = a1B.f4185d;
        C0773l c0773l = this.f4472c;
        R(c0773l);
        a5VarH0.z(bundle, c0773l.Q(f5Var.f4686f));
        h0().B(a1B, U().n(f5Var.f4686f));
        C0832v c0832vA = a1B.a();
        if ("_cmp".equals(c0832vA.f5088f) && "referrer API v2".equals(c0832vA.f5089g.N("_cis"))) {
            String strN = c0832vA.f5089g.N("gclid");
            if (!TextUtils.isEmpty(strN)) {
                B(new V4("_lgclid", c0832vA.f5091i, strN, "auto"), f5Var);
            }
        }
        j(c0832vA, f5Var);
    }

    public final void l0(Runnable runnable) {
        f().h();
        if (this.f4485p == null) {
            this.f4485p = new ArrayList();
        }
        this.f4485p.add(runnable);
    }

    public final void m() {
        this.f4487r++;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void o(boolean z9) {
        M();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:7:0x0013, B:50:0x0129, B:55:0x0160, B:54:0x0151, B:14:0x002a, B:38:0x00ca, B:40:0x00df, B:42:0x00e5, B:46:0x00f2, B:45:0x00eb, B:47:0x00f5, B:48:0x00fd, B:49:0x00fe), top: B:60:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r8, java.lang.Throwable r9, byte[] r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.p(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03d5 A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:23:0x00a6, B:25:0x00b6, B:45:0x00ff, B:47:0x0112, B:49:0x0128, B:50:0x014f, B:52:0x01a7, B:54:0x01ac, B:56:0x01b2, B:60:0x01be, B:69:0x01f6, B:71:0x0201, B:75:0x020e, B:78:0x021c, B:82:0x0227, B:84:0x022a, B:85:0x024a, B:87:0x024f, B:90:0x026e, B:93:0x0282, B:95:0x02a9, B:98:0x02b2, B:100:0x02c1, B:101:0x02cd, B:136:0x03a3, B:138:0x03d5, B:139:0x03d8, B:141:0x0401, B:181:0x04db, B:182:0x04de, B:191:0x055d, B:143:0x0416, B:148:0x043b, B:150:0x0443, B:152:0x044d, B:156:0x0460, B:160:0x0471, B:164:0x047d, B:167:0x0499, B:172:0x04be, B:174:0x04c4, B:176:0x04cc, B:178:0x04d2, B:170:0x04aa, B:158:0x0469, B:146:0x0427, B:103:0x02d3, B:105:0x02fe, B:106:0x030b, B:108:0x0312, B:110:0x0318, B:112:0x0322, B:114:0x0328, B:116:0x032e, B:118:0x0334, B:119:0x0339, B:121:0x0344, B:127:0x035d, B:131:0x0363, B:132:0x0377, B:133:0x0384, B:134:0x0388, B:135:0x0396, B:183:0x04f5, B:185:0x0526, B:186:0x0529, B:187:0x053c, B:188:0x0540, B:190:0x0544, B:88:0x025e, B:66:0x01dc, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00eb, B:41:0x00f5, B:44:0x00fc), top: B:203:0x00a6, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0401 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #3 {all -> 0x00c3, blocks: (B:23:0x00a6, B:25:0x00b6, B:45:0x00ff, B:47:0x0112, B:49:0x0128, B:50:0x014f, B:52:0x01a7, B:54:0x01ac, B:56:0x01b2, B:60:0x01be, B:69:0x01f6, B:71:0x0201, B:75:0x020e, B:78:0x021c, B:82:0x0227, B:84:0x022a, B:85:0x024a, B:87:0x024f, B:90:0x026e, B:93:0x0282, B:95:0x02a9, B:98:0x02b2, B:100:0x02c1, B:101:0x02cd, B:136:0x03a3, B:138:0x03d5, B:139:0x03d8, B:141:0x0401, B:181:0x04db, B:182:0x04de, B:191:0x055d, B:143:0x0416, B:148:0x043b, B:150:0x0443, B:152:0x044d, B:156:0x0460, B:160:0x0471, B:164:0x047d, B:167:0x0499, B:172:0x04be, B:174:0x04c4, B:176:0x04cc, B:178:0x04d2, B:170:0x04aa, B:158:0x0469, B:146:0x0427, B:103:0x02d3, B:105:0x02fe, B:106:0x030b, B:108:0x0312, B:110:0x0318, B:112:0x0322, B:114:0x0328, B:116:0x032e, B:118:0x0334, B:119:0x0339, B:121:0x0344, B:127:0x035d, B:131:0x0363, B:132:0x0377, B:133:0x0384, B:134:0x0388, B:135:0x0396, B:183:0x04f5, B:185:0x0526, B:186:0x0529, B:187:0x053c, B:188:0x0540, B:190:0x0544, B:88:0x025e, B:66:0x01dc, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00eb, B:41:0x00f5, B:44:0x00fc), top: B:203:0x00a6, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04db A[Catch: all -> 0x00c3, TryCatch #3 {all -> 0x00c3, blocks: (B:23:0x00a6, B:25:0x00b6, B:45:0x00ff, B:47:0x0112, B:49:0x0128, B:50:0x014f, B:52:0x01a7, B:54:0x01ac, B:56:0x01b2, B:60:0x01be, B:69:0x01f6, B:71:0x0201, B:75:0x020e, B:78:0x021c, B:82:0x0227, B:84:0x022a, B:85:0x024a, B:87:0x024f, B:90:0x026e, B:93:0x0282, B:95:0x02a9, B:98:0x02b2, B:100:0x02c1, B:101:0x02cd, B:136:0x03a3, B:138:0x03d5, B:139:0x03d8, B:141:0x0401, B:181:0x04db, B:182:0x04de, B:191:0x055d, B:143:0x0416, B:148:0x043b, B:150:0x0443, B:152:0x044d, B:156:0x0460, B:160:0x0471, B:164:0x047d, B:167:0x0499, B:172:0x04be, B:174:0x04c4, B:176:0x04cc, B:178:0x04d2, B:170:0x04aa, B:158:0x0469, B:146:0x0427, B:103:0x02d3, B:105:0x02fe, B:106:0x030b, B:108:0x0312, B:110:0x0318, B:112:0x0322, B:114:0x0328, B:116:0x032e, B:118:0x0334, B:119:0x0339, B:121:0x0344, B:127:0x035d, B:131:0x0363, B:132:0x0377, B:133:0x0384, B:134:0x0388, B:135:0x0396, B:183:0x04f5, B:185:0x0526, B:186:0x0529, B:187:0x053c, B:188:0x0540, B:190:0x0544, B:88:0x025e, B:66:0x01dc, B:31:0x00c6, B:33:0x00ca, B:37:0x00db, B:39:0x00eb, B:41:0x00f5, B:44:0x00fc), top: B:203:0x00a6, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0416 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(M4.f5 r24) {
        /*
            Method dump skipped, instruction units count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.S4.q(M4.f5):void");
    }

    public final void r() {
        this.f4486q++;
    }

    public final void s(C0725d c0725d) {
        f5 f5VarI = I((String) com.google.android.gms.common.internal.r.m(c0725d.f4637f));
        if (f5VarI != null) {
            t(c0725d, f5VarI);
        }
    }

    public final void t(C0725d c0725d, f5 f5Var) {
        com.google.android.gms.common.internal.r.m(c0725d);
        com.google.android.gms.common.internal.r.g(c0725d.f4637f);
        com.google.android.gms.common.internal.r.m(c0725d.f4639h);
        com.google.android.gms.common.internal.r.g(c0725d.f4639h.f4519g);
        f().h();
        g();
        if (Q(f5Var)) {
            if (!f5Var.f4693m) {
                S(f5Var);
                return;
            }
            C0773l c0773l = this.f4472c;
            R(c0773l);
            c0773l.e0();
            try {
                S(f5Var);
                String str = (String) com.google.android.gms.common.internal.r.m(c0725d.f4637f);
                C0773l c0773l2 = this.f4472c;
                R(c0773l2);
                C0725d c0725dS = c0773l2.S(str, c0725d.f4639h.f4519g);
                if (c0725dS != null) {
                    d().q().c("Removing conditional user property", c0725d.f4637f, this.f4481l.D().f(c0725d.f4639h.f4519g));
                    C0773l c0773l3 = this.f4472c;
                    R(c0773l3);
                    c0773l3.J(str, c0725d.f4639h.f4519g);
                    if (c0725dS.f4641j) {
                        C0773l c0773l4 = this.f4472c;
                        R(c0773l4);
                        c0773l4.m(str, c0725d.f4639h.f4519g);
                    }
                    C0832v c0832v = c0725d.f4647p;
                    if (c0832v != null) {
                        C0820t c0820t = c0832v.f5089g;
                        D((C0832v) com.google.android.gms.common.internal.r.m(h0().y0(str, ((C0832v) com.google.android.gms.common.internal.r.m(c0725d.f4647p)).f5088f, c0820t != null ? c0820t.J() : null, c0725dS.f4638g, c0725d.f4647p.f5091i, true, true)), f5Var);
                    }
                } else {
                    d().w().c("Conditional user property doesn't exist", C0858z1.z(c0725d.f4637f), this.f4481l.D().f(c0725d.f4639h.f4519g));
                }
                C0773l c0773l5 = this.f4472c;
                R(c0773l5);
                c0773l5.o();
                C0773l c0773l6 = this.f4472c;
                R(c0773l6);
                c0773l6.f0();
            } catch (Throwable th) {
                C0773l c0773l7 = this.f4472c;
                R(c0773l7);
                c0773l7.f0();
                throw th;
            }
        }
    }

    public final void u(String str, f5 f5Var) {
        f().h();
        g();
        if (Q(f5Var)) {
            if (!f5Var.f4693m) {
                S(f5Var);
                return;
            }
            if ("_npa".equals(str) && f5Var.f4703w != null) {
                d().q().a("Falling back to manifest metadata value for ad personalization");
                B(new V4("_npa", a().a(), Long.valueOf(true != f5Var.f4703w.booleanValue() ? 0L : 1L), "auto"), f5Var);
                return;
            }
            d().q().b("Removing user property", this.f4481l.D().f(str));
            C0773l c0773l = this.f4472c;
            R(c0773l);
            c0773l.e0();
            try {
                S(f5Var);
                if ("_id".equals(str)) {
                    C0773l c0773l2 = this.f4472c;
                    R(c0773l2);
                    c0773l2.m((String) com.google.android.gms.common.internal.r.m(f5Var.f4686f), "_lair");
                }
                C0773l c0773l3 = this.f4472c;
                R(c0773l3);
                c0773l3.m((String) com.google.android.gms.common.internal.r.m(f5Var.f4686f), str);
                C0773l c0773l4 = this.f4472c;
                R(c0773l4);
                c0773l4.o();
                d().q().b("User property removed", this.f4481l.D().f(str));
                C0773l c0773l5 = this.f4472c;
                R(c0773l5);
                c0773l5.f0();
            } catch (Throwable th) {
                C0773l c0773l6 = this.f4472c;
                R(c0773l6);
                c0773l6.f0();
                throw th;
            }
        }
    }

    public final void v(f5 f5Var) {
        if (this.f4493x != null) {
            ArrayList arrayList = new ArrayList();
            this.f4494y = arrayList;
            arrayList.addAll(this.f4493x);
        }
        C0773l c0773l = this.f4472c;
        R(c0773l);
        String str = (String) com.google.android.gms.common.internal.r.m(f5Var.f4686f);
        com.google.android.gms.common.internal.r.g(str);
        c0773l.h();
        c0773l.i();
        try {
            SQLiteDatabase sQLiteDatabaseP = c0773l.P();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseP.delete("apps", "app_id=?", strArr) + sQLiteDatabaseP.delete("events", "app_id=?", strArr) + sQLiteDatabaseP.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseP.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseP.delete("queue", "app_id=?", strArr) + sQLiteDatabaseP.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseP.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseP.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                c0773l.f4245a.d().v().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e9) {
            c0773l.f4245a.d().r().c("Error resetting analytics data. appId, error", C0858z1.z(str), e9);
        }
        if (f5Var.f4693m) {
            q(f5Var);
        }
    }

    public final void w(String str, A3 a32) {
        f().h();
        String str2 = this.f4468D;
        if (str2 == null || str2.equals(str) || a32 != null) {
            this.f4468D = str;
            this.f4467C = a32;
        }
    }

    public final void x() {
        f().h();
        C0773l c0773l = this.f4472c;
        R(c0773l);
        c0773l.h0();
        if (this.f4478i.f4839g.a() == 0) {
            this.f4478i.f4839g.b(a().a());
        }
        M();
    }

    public final void y(C0725d c0725d) {
        f5 f5VarI = I((String) com.google.android.gms.common.internal.r.m(c0725d.f4637f));
        if (f5VarI != null) {
            z(c0725d, f5VarI);
        }
    }

    public final void z(C0725d c0725d, f5 f5Var) {
        C0846x1 c0846x1R;
        String str;
        Object objZ;
        String strF;
        Object objH;
        C0846x1 c0846x1R2;
        String str2;
        Object objZ2;
        String strF2;
        Object obj;
        com.google.android.gms.common.internal.r.m(c0725d);
        com.google.android.gms.common.internal.r.g(c0725d.f4637f);
        com.google.android.gms.common.internal.r.m(c0725d.f4638g);
        com.google.android.gms.common.internal.r.m(c0725d.f4639h);
        com.google.android.gms.common.internal.r.g(c0725d.f4639h.f4519g);
        f().h();
        g();
        if (Q(f5Var)) {
            if (!f5Var.f4693m) {
                S(f5Var);
                return;
            }
            C0725d c0725d2 = new C0725d(c0725d);
            boolean z9 = false;
            c0725d2.f4641j = false;
            C0773l c0773l = this.f4472c;
            R(c0773l);
            c0773l.e0();
            try {
                C0773l c0773l2 = this.f4472c;
                R(c0773l2);
                C0725d c0725dS = c0773l2.S((String) com.google.android.gms.common.internal.r.m(c0725d2.f4637f), c0725d2.f4639h.f4519g);
                if (c0725dS != null && !c0725dS.f4638g.equals(c0725d2.f4638g)) {
                    d().w().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f4481l.D().f(c0725d2.f4639h.f4519g), c0725d2.f4638g, c0725dS.f4638g);
                }
                if (c0725dS != null && c0725dS.f4641j) {
                    c0725d2.f4638g = c0725dS.f4638g;
                    c0725d2.f4640i = c0725dS.f4640i;
                    c0725d2.f4644m = c0725dS.f4644m;
                    c0725d2.f4642k = c0725dS.f4642k;
                    c0725d2.f4645n = c0725dS.f4645n;
                    c0725d2.f4641j = true;
                    V4 v42 = c0725d2.f4639h;
                    c0725d2.f4639h = new V4(v42.f4519g, c0725dS.f4639h.f4520h, v42.H(), c0725dS.f4639h.f4523k);
                } else if (TextUtils.isEmpty(c0725d2.f4642k)) {
                    V4 v43 = c0725d2.f4639h;
                    c0725d2.f4639h = new V4(v43.f4519g, c0725d2.f4640i, v43.H(), c0725d2.f4639h.f4523k);
                    c0725d2.f4641j = true;
                    z9 = true;
                }
                if (c0725d2.f4641j) {
                    V4 v44 = c0725d2.f4639h;
                    X4 x42 = new X4((String) com.google.android.gms.common.internal.r.m(c0725d2.f4637f), c0725d2.f4638g, v44.f4519g, v44.f4520h, com.google.android.gms.common.internal.r.m(v44.H()));
                    C0773l c0773l3 = this.f4472c;
                    R(c0773l3);
                    if (c0773l3.x(x42)) {
                        c0846x1R2 = d().q();
                        str2 = "User property updated immediately";
                        objZ2 = c0725d2.f4637f;
                        strF2 = this.f4481l.D().f(x42.f4545c);
                        obj = x42.f4547e;
                    } else {
                        c0846x1R2 = d().r();
                        str2 = "(2)Too many active user properties, ignoring";
                        objZ2 = C0858z1.z(c0725d2.f4637f);
                        strF2 = this.f4481l.D().f(x42.f4545c);
                        obj = x42.f4547e;
                    }
                    c0846x1R2.d(str2, objZ2, strF2, obj);
                    if (z9 && c0725d2.f4645n != null) {
                        D(new C0832v(c0725d2.f4645n, c0725d2.f4640i), f5Var);
                    }
                }
                C0773l c0773l4 = this.f4472c;
                R(c0773l4);
                if (c0773l4.w(c0725d2)) {
                    c0846x1R = d().q();
                    str = "Conditional property added";
                    objZ = c0725d2.f4637f;
                    strF = this.f4481l.D().f(c0725d2.f4639h.f4519g);
                    objH = c0725d2.f4639h.H();
                } else {
                    c0846x1R = d().r();
                    str = "Too many conditional properties, ignoring";
                    objZ = C0858z1.z(c0725d2.f4637f);
                    strF = this.f4481l.D().f(c0725d2.f4639h.f4519g);
                    objH = c0725d2.f4639h.H();
                }
                c0846x1R.d(str, objZ, strF, objH);
                C0773l c0773l5 = this.f4472c;
                R(c0773l5);
                c0773l5.o();
                C0773l c0773l6 = this.f4472c;
                R(c0773l6);
                c0773l6.f0();
            } catch (Throwable th) {
                C0773l c0773l7 = this.f4472c;
                R(c0773l7);
                c0773l7.f0();
                throw th;
            }
        }
    }
}

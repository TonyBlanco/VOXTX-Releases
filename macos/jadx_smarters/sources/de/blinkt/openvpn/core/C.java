package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C f39953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f8.l f39954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f8.l f39955d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f39956a = new HashMap();

    public static void b(Context context) throws Throwable {
        if (f39953b == null) {
            C c9 = new C();
            f39953b = c9;
            c9.m(context);
        }
    }

    public static f8.l c(Context context, String str) {
        return d(context, str, 0, 10);
    }

    public static f8.l d(Context context, String str, int i9, int i10) {
        b(context);
        f8.l lVarE = e(str);
        int i11 = 0;
        while (true) {
            if (lVarE != null && lVarE.f40911n0 >= i9) {
                break;
            }
            int i12 = i11 + 1;
            if (i11 >= i10) {
                i11 = i12;
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            f39953b.m(context);
            lVarE = e(str);
            i11 = i12;
        }
        if (i11 > 5) {
            G.p(String.format(Locale.US, "Used x %d tries to get current version (%d/%d) of the profile", Integer.valueOf(i11), Integer.valueOf(lVarE == null ? -1 : lVarE.f40911n0), Integer.valueOf(i9)));
        }
        return lVarE;
    }

    public static f8.l e(String str) {
        f8.l lVar = f39955d;
        if (lVar != null && lVar.B().equals(str)) {
            return f39955d;
        }
        C c9 = f39953b;
        if (c9 == null) {
            return null;
        }
        return (f8.l) c9.f39956a.get(str);
    }

    public static f8.l f(Context context) {
        b(context);
        return e(B.a(context).getString("alwaysOnVpn", null));
    }

    public static synchronized C g(Context context) {
        b(context);
        return f39953b;
    }

    public static f8.l h(Context context) {
        String string = B.a(context).getString("lastConnectedProfile", null);
        if (string != null) {
            return c(context, string);
        }
        return null;
    }

    public static f8.l i() {
        return f39954c;
    }

    public static boolean l() {
        f8.l lVar = f39954c;
        return lVar != null && lVar == f39955d;
    }

    public static void p(Context context, f8.l lVar, boolean z9, boolean z10) {
        if (z9) {
            lVar.f40911n0++;
        }
        String str = lVar.A().toString() + ".vp";
        if (z10) {
            str = "temporary-vpn-profile.vp";
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
            objectOutputStream.writeObject(lVar);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e9) {
            G.s("saving VPN profile", e9);
            throw new RuntimeException(e9);
        }
    }

    public static void r(Context context, f8.l lVar) {
        SharedPreferences.Editor editorEdit = B.a(context).edit();
        editorEdit.putString("lastConnectedProfile", lVar.B());
        editorEdit.apply();
        f39954c = lVar;
    }

    public static void s(Context context) {
        SharedPreferences.Editor editorEdit = B.a(context).edit();
        editorEdit.putString("lastConnectedProfile", null);
        editorEdit.apply();
    }

    public static void t(Context context, f8.l lVar) {
        lVar.f40921s0 = true;
        f39955d = lVar;
        p(context, lVar, true, true);
    }

    public static void u(Context context, f8.l lVar) {
        lVar.f40913o0 = System.currentTimeMillis();
        if (lVar != f39955d) {
            p(context, lVar, false, false);
        }
    }

    public void a(f8.l lVar) {
        this.f39956a.put(lVar.A().toString(), lVar);
    }

    public f8.l j(String str) {
        for (f8.l lVar : this.f39956a.values()) {
            if (lVar.u().equals(str)) {
                return lVar;
            }
        }
        return null;
    }

    public Collection k() {
        return this.f39956a.values();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #2 {all -> 0x0069, blocks: (B:10:0x004a, B:12:0x0052, B:14:0x0056, B:17:0x005d, B:19:0x0066, B:26:0x0070, B:38:0x0091, B:40:0x0097), top: B:55:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.content.Context r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.f39956a = r0
            java.lang.String r0 = "VPNList"
            android.content.SharedPreferences r0 = de.blinkt.openvpn.core.B.b(r0, r9)
            java.lang.String r1 = "vpnlist"
            r2 = 0
            java.util.Set r0 = r0.getStringSet(r1, r2)
            if (r0 != 0) goto L1b
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L1b:
            java.lang.String r1 = "temporary-vpn-profile"
            r0.add(r1)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            r5.<init>()     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            r5.append(r3)     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            java.lang.String r6 = ".vp"
            r5.append(r6)     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            java.io.FileInputStream r5 = r9.openFileInput(r5)     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L8a java.lang.ClassNotFoundException -> L8c java.io.IOException -> L8f
            java.lang.Object r5 = r4.readObject()     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            f8.l r5 = (f8.l) r5     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            if (r5 == 0) goto L81
            java.lang.String r6 = r5.f40891d     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            if (r6 == 0) goto L81
            java.util.UUID r6 = r5.A()     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            if (r6 != 0) goto L5d
            goto L81
        L5d:
            r5.L()     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            boolean r6 = r3.equals(r1)     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            if (r6 == 0) goto L70
            de.blinkt.openvpn.core.C.f39955d = r5     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            goto L7d
        L69:
            r9 = move-exception
            r2 = r4
            goto La2
        L6c:
            r5 = move-exception
            goto L91
        L6e:
            r5 = move-exception
            goto L91
        L70:
            java.util.HashMap r6 = r8.f39956a     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            java.util.UUID r7 = r5.A()     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L69 java.lang.ClassNotFoundException -> L6c java.io.IOException -> L6e
        L7d:
            r4.close()     // Catch: java.io.IOException -> L85
            goto L24
        L81:
            r4.close()     // Catch: java.io.IOException -> L85
            goto L24
        L85:
            r3 = move-exception
            r3.printStackTrace()
            goto L24
        L8a:
            r9 = move-exception
            goto La2
        L8c:
            r5 = move-exception
        L8d:
            r4 = r2
            goto L91
        L8f:
            r5 = move-exception
            goto L8d
        L91:
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L9c
            java.lang.String r3 = "Loading VPN List"
            de.blinkt.openvpn.core.G.s(r3, r5)     // Catch: java.lang.Throwable -> L69
        L9c:
            if (r4 == 0) goto L24
            r4.close()     // Catch: java.io.IOException -> L85
            goto L24
        La2:
            if (r2 == 0) goto Lac
            r2.close()     // Catch: java.io.IOException -> La8
            goto Lac
        La8:
            r0 = move-exception
            r0.printStackTrace()
        Lac:
            throw r9
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.C.m(android.content.Context):void");
    }

    public void n(Context context, f8.l lVar) {
        String string = lVar.A().toString();
        this.f39956a.remove(string);
        q(context);
        context.deleteFile(string + ".vp");
        if (f39954c == lVar) {
            f39954c = null;
        }
    }

    public void o(Context context, f8.l lVar) {
        p(context, lVar, true, false);
    }

    public void q(Context context) {
        SharedPreferences sharedPreferencesB = B.b("VPNList", context);
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putStringSet("vpnlist", this.f39956a.keySet());
        editorEdit.putInt("counter", sharedPreferencesB.getInt("counter", 0) + 1);
        editorEdit.apply();
    }
}

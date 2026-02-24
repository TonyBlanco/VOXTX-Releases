package d;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import d.AbstractC1625d;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: d.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1647z {

    /* JADX INFO: renamed from: d.z$a */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f39434a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Queue f39435c = new ArrayDeque();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Executor f39436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Runnable f39437e;

        public a(Executor executor) {
            this.f39436d = executor;
        }

        public final /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        public void c() {
            synchronized (this.f39434a) {
                try {
                    Runnable runnable = (Runnable) this.f39435c.poll();
                    this.f39437e = runnable;
                    if (runnable != null) {
                        this.f39436d.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f39434a) {
                try {
                    this.f39435c.add(new Runnable() { // from class: d.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39432a.b(runnable);
                        }
                    });
                    if (this.f39437e == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d.z$b */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            java.lang.String r1 = "locales"
            java.lang.String r2 = "AppLocalesStorageHelper"
            java.lang.String r3 = ""
            boolean r3 = r7.equals(r3)
            java.lang.String r4 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r3 == 0) goto L13
            r6.deleteFile(r4)
            return
        L13:
            java.io.FileOutputStream r6 = r6.openFileOutput(r4, r0)     // Catch: java.io.FileNotFoundException -> L74
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()
            r3 = 0
            r0.setOutput(r6, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "UTF-8"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.startDocument(r4, r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.startTag(r3, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "application_locales"
            r0.attribute(r3, r4, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.endTag(r3, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.endDocument()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r1 = "Storing App Locales : app-locales: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.append(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r1 = " persisted successfully."
            r0.append(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r6 == 0) goto L6d
        L4f:
            r6.close()     // Catch: java.io.IOException -> L6d
            goto L6d
        L53:
            r7 = move-exception
            goto L6e
        L55:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "Storing App Locales : Failed to persist app-locales: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L53
            r1.append(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L53
            android.util.Log.w(r2, r7, r0)     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L6d
            goto L4f
        L6d:
            return
        L6e:
            if (r6 == 0) goto L73
            r6.close()     // Catch: java.io.IOException -> L73
        L73:
            throw r7
        L74:
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r4
            java.lang.String r6 = java.lang.String.format(r6, r7)
            android.util.Log.w(r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.AbstractC1647z.a(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:26:0x0050, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L78
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L72
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L4b
        L43:
            if (r3 == 0) goto L53
        L45:
            r3.close()     // Catch: java.io.IOException -> L49
            goto L53
        L49:
            goto L53
        L4b:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L53
            goto L45
        L53:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L6e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r1, r9)
            goto L71
        L6e:
            r9.deleteFile(r0)
        L71:
            return r2
        L72:
            if (r3 == 0) goto L77
            r3.close()     // Catch: java.io.IOException -> L77
        L77:
            throw r9
        L78:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.AbstractC1647z.b(android.content.Context):java.lang.String");
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AbstractC1625d.k().f()) {
                    String strB = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AbstractC1625d.b.b(systemService, AbstractC1625d.a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}

package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ali {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20129c;

    public ali(Context context, boolean z9, long j9) {
        this.f20127a = context;
        this.f20128b = z9;
        this.f20129c = j9 <= 0 ? 150L : j9;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x003f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final com.google.ads.interactivemedia.v3.impl.data.bg a() {
        /*
            r8 = this;
            com.google.ads.interactivemedia.v3.internal.alh r0 = new com.google.ads.interactivemedia.v3.internal.alh
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r2)
            android.content.Context r3 = r8.f20127a     // Catch: java.lang.Throwable -> L1f
            h4.a$a r3 = h4.C1858a.a(r3)     // Catch: java.lang.Throwable -> L1f
            com.google.ads.interactivemedia.v3.internal.alh r4 = new com.google.ads.interactivemedia.v3.internal.alh     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = r3.a()     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "adid"
            goto L45
        L1e:
            r0 = r4
        L1f:
            android.content.Context r3 = r8.f20127a     // Catch: android.provider.Settings.SettingNotFoundException -> L3e
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L3e
            com.google.ads.interactivemedia.v3.internal.alh r4 = new com.google.ads.interactivemedia.v3.internal.alh     // Catch: android.provider.Settings.SettingNotFoundException -> L3e
            java.lang.String r5 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r3, r5)     // Catch: android.provider.Settings.SettingNotFoundException -> L3e
            java.lang.String r6 = "limit_ad_tracking"
            int r3 = android.provider.Settings.Secure.getInt(r3, r6)     // Catch: android.provider.Settings.SettingNotFoundException -> L3e
            r6 = 1
            if (r3 != r6) goto L37
            goto L38
        L37:
            r6 = 0
        L38:
            r4.<init>(r5, r6)     // Catch: android.provider.Settings.SettingNotFoundException -> L3e
            java.lang.String r0 = "afai"
            goto L45
        L3e:
            r4 = r0
        L3f:
            java.lang.String r0 = "Failed to get advertising ID."
            com.google.ads.interactivemedia.v3.impl.data.m.d(r0)
            r0 = r1
        L45:
            boolean r3 = r8.f20128b
            if (r3 == 0) goto L6f
            android.content.Context r3 = r8.f20127a     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            i4.b r3 = i4.AbstractC1885a.a(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            com.google.android.gms.tasks.Task r3 = r3.getAppSetIdInfo()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            long r5 = r8.f20129c     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3, r5, r7)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            i4.c r3 = (i4.C1887c) r3     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            int r2 = r3.b()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L6c
            goto L6f
        L66:
            java.lang.String r3 = "Unable to contact the App Set SDK."
        L68:
            com.google.ads.interactivemedia.v3.impl.data.m.d(r3)
            goto L6f
        L6c:
            java.lang.String r3 = "Timeout getting AppSet ID."
            goto L68
        L6f:
            java.lang.String r3 = r4.f20125a
            boolean r4 = r4.f20126b
            com.google.ads.interactivemedia.v3.impl.data.bg r0 = com.google.ads.interactivemedia.v3.impl.data.bg.create(r3, r0, r4, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ali.a():com.google.ads.interactivemedia.v3.impl.data.bg");
    }
}

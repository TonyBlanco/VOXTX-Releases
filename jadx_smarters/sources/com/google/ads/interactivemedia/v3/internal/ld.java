package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class ld implements xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f23631a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public static final Long b(InputStream inputStream) throws IOException {
        String line = new BufferedReader(new InputStreamReader(inputStream, ath.f20681b)).readLine();
        try {
            Matcher matcher = f23631a.matcher(line);
            if (!matcher.matches()) {
                throw as.c("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j9 = true != "+".equals(matcher.group(4)) ? -1L : 1L;
                long j10 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= j9 * (((j10 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e9) {
            throw as.c(null, e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xe
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        return b(inputStream);
    }
}

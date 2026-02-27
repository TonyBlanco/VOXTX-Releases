package com.google.android.gms.internal.p001firebaseauthapi;

import A4.a;
import A5.f;
import H5.AbstractC0622m;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaci extends AsyncTask<Void, Void, zzach> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzack> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final f zzg;

    public zzaci(String str, String str2, Intent intent, f fVar, zzack zzackVar) {
        this.zzb = r.g(str);
        this.zzg = (f) r.m(fVar);
        r.g(str2);
        r.m(intent);
        String strG = r.g(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder builderBuildUpon = Uri.parse(zzackVar.zza(strG)).buildUpon();
        builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", strG).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) r.m(str2));
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzackVar);
        this.zze = zzackVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzach doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzack zzackVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzackVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            new zzact(zzackVar.zza(), this.zzg, zzacr.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.c(String.format("Error getting project config. Failed with %s %s", strZza, Integer.valueOf(responseCode)), new Object[0]);
                return zzach.zzb(strZza);
            }
            zzafi zzafiVar = new zzafi();
            zzafiVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzafiVar.zza().contains(this.zzf) ? zzach.zzb("UNAUTHORIZED_DOMAIN") : zzach.zza(this.zzf);
            }
            for (String str : zzafiVar.zza()) {
                if (zza(str)) {
                    return zzach.zza(str);
                }
            }
            return null;
        } catch (zzaaf e9) {
            zza.c("ConversionException encountered: " + e9.getMessage(), new Object[0]);
            return null;
        } catch (IOException e10) {
            zza.c("IOException occurred: " + e10.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            zza.c("Null pointer encountered: " + e11.getMessage(), new Object[0]);
            return null;
        }
    }

    private static String zza(HttpURLConnection httpURLConnection) throws zzaaf {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                return (String) zzacq.zza(new String(zza(errorStream, 128)), String.class);
            }
            return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        } catch (IOException e9) {
            zza.g("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e9), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzach zzachVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzack zzackVar = this.zzd.get();
        if (zzachVar != null) {
            strZza = zzachVar.zza();
            strZzb = zzachVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzackVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(strZza) || (builder = this.zze) == null) {
            zzackVar.zza(this.zzb, AbstractC0622m.a(strZzb));
        } else {
            builder.authority(strZza);
            zzackVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).B());
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("TryRoom")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e9) {
            zza.c("Error parsing URL for auth domain check: " + str + ". " + e9.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i9) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzach zzachVar) {
        onPostExecute((zzach) null);
    }
}

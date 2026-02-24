package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.r;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadn {
    public static void zza(String str, zzacp zzacpVar, zzadk<?> zzadkVar, Type type, zzact zzactVar) throws IllegalAccessException, InvocationTargetException {
        String message;
        try {
            r.m(zzacpVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzacpVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            zzactVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzadkVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzadkVar.zza(message);
        } catch (IOException e9) {
            e = e9;
            message = e.getMessage();
            zzadkVar.zza(message);
        } catch (NullPointerException e10) {
            e = e10;
            message = e.getMessage();
            zzadkVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzadkVar.zza(message);
        } catch (JSONException e11) {
            e = e11;
            message = e.getMessage();
            zzadkVar.zza(message);
        }
    }

    public static void zza(String str, zzadk<?> zzadkVar, Type type, zzact zzactVar) {
        String message;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            zzactVar.zza(httpURLConnection);
            zza(httpURLConnection, zzadkVar, type);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzadkVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzadkVar.zza(message);
        } catch (IOException e9) {
            message = e9.getMessage();
            zzadkVar.zza(message);
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzadk<?> zzadkVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (zza(responseCode)) {
                    zzadkVar.zza((zzacs) zzacq.zza(string, type));
                } else {
                    zzadkVar.zza((String) zzacq.zza(string, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzaaf e9) {
                e = e9;
                zzadkVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzadkVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e10) {
                e = e10;
                zzadkVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean zza(int i9) {
        return i9 >= 200 && i9 < 300;
    }
}

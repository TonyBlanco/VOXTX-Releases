package b7;

import android.content.Context;
import b7.g;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m7.AbstractC2237a;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.apache.http.client.methods.HttpGet;

/* JADX INFO: renamed from: b7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1231a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC1233c f17692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f17693b = g.a.f17720a;

    public static String a(Context context, String str, int i9, String str2, List list) {
        String strString = "";
        if (SharepreferenceDBHandler.getClientSecurityUrl(context) != null && SharepreferenceDBHandler.getClientSecurityUrl(context).length() > 0) {
            AbstractC2237a.f44463P0 = SharepreferenceDBHandler.getClientSecurityUrl(context);
        }
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builderNewBuilder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(true).build();
            Request requestBuild = str2.equals("") ? new Request.Builder().url(AbstractC2237a.f44463P0).header("User-Agent", "IPTV Smarters Pro").build() : null;
            if (str2.equalsIgnoreCase(HttpGet.METHOD_NAME)) {
                Request.Builder builder = new Request.Builder();
                builder.url(AbstractC2237a.f44463P0);
                builder.header("User-Agent", "IPTV Smarters Pro");
                if (list != null) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        builder.addHeader(((e) list.get(i10)).b(), ((e) list.get(i10)).c());
                    }
                }
                builder.addHeader("Content-Type", "application/json; charset=utf-8");
                requestBuild = builder.build();
            }
            if (str2.equalsIgnoreCase("Form")) {
                FormBody.Builder builder2 = new FormBody.Builder();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    builder2.add(((e) list.get(i11)).b(), ((e) list.get(i11)).c());
                }
                requestBuild = new Request.Builder().url(AbstractC2237a.f44463P0).header("User-Agent", "IPTV Smarters Pro").addHeader("Content-Type", "application/json; charset=utf-8").post(builder2.build()).build();
            }
            if (str2.equalsIgnoreCase("FormAPI")) {
                FormBody.Builder builder3 = new FormBody.Builder();
                for (int i12 = 0; i12 < list.size(); i12++) {
                    builder3.add(((e) list.get(i12)).b(), ((e) list.get(i12)).c());
                }
                requestBuild = new Request.Builder().url(AbstractC2237a.f44463P0).header("User-Agent", "IPTV Smarters Pro").addHeader("Content-Type", "application/json; charset=utf-8").post(builder3.build()).build();
            }
            if (str2.equalsIgnoreCase("DEL")) {
                Request.Builder builder4 = new Request.Builder();
                builder4.url(AbstractC2237a.f44463P0);
                builder4.header("User-Agent", "IPTV Smarters Pro");
                if (list != null) {
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        builder4.addHeader(((e) list.get(i13)).b(), ((e) list.get(i13)).c());
                    }
                }
                builder4.addHeader("Content-Type", "application/json; charset=utf-8");
                builder4.delete();
                requestBuild = builder4.build();
            }
            if (str2.equalsIgnoreCase("Multipart")) {
                MediaType mediaType = MediaType.parse("image/png");
                MediaType mediaType2 = MediaType.parse("video/*");
                MultipartBody.Builder builder5 = new MultipartBody.Builder();
                for (int i14 = 0; i14 < list.size(); i14++) {
                    if (((e) list.get(i14)).a() != null) {
                        if (((e) list.get(i14)).a().getAbsolutePath().endsWith(".png") || ((e) list.get(i14)).a().getAbsolutePath().endsWith(".jpg") || ((e) list.get(i14)).a().getAbsolutePath().endsWith(".jpeg")) {
                            builder5.setType(MultipartBody.FORM).addFormDataPart(((e) list.get(i14)).b(), ((e) list.get(i14)).a().getName(), RequestBody.create(mediaType, ((e) list.get(i14)).a()));
                        }
                        if (((e) list.get(i14)).a().getAbsolutePath().endsWith(".mp4") || ((e) list.get(i14)).a().getAbsolutePath().endsWith(".mpeg") || ((e) list.get(i14)).a().getAbsolutePath().endsWith(".3gp") || ((e) list.get(i14)).a().getAbsolutePath().endsWith(".avi")) {
                            builder5.setType(MultipartBody.FORM).addFormDataPart(((e) list.get(i14)).b(), ((e) list.get(i14)).a().getName(), RequestBody.create(mediaType2, ((e) list.get(i14)).a()));
                        }
                    } else {
                        builder5.setType(MultipartBody.FORM).addFormDataPart(((e) list.get(i14)).b(), ((e) list.get(i14)).c());
                    }
                }
                requestBuild = new Request.Builder().url(AbstractC2237a.f44463P0).header("User-Agent", "IPTV Smarters Pro").post(builder5.build()).build();
            }
            strString = okHttpClient.newCall(requestBuild).execute().body().string();
            MyApplication.p().C(strString);
            return strString;
        } catch (SocketTimeoutException e9) {
            e = e9;
            e.printStackTrace();
            f17692a.b0(i9);
            return strString;
        } catch (IOException e10) {
            e = e10;
            e.printStackTrace();
            f17692a.b0(i9);
            return strString;
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            f17692a.b0(i9);
            return strString;
        }
    }
}

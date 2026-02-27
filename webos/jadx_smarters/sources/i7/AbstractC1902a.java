package i7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.cast.MediaInfo;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import java.io.IOException;
import java.util.List;
import n4.C2280l;
import n4.C2281m;
import o4.C2328e;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C2434i;
import x4.C2957a;

/* JADX INFO: renamed from: i7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1902a {

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    public class C0348a implements C2434i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f41893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2434i f41894b;

        public C0348a(Context context, C2434i c2434i) {
            this.f41893a = context;
            this.f41894b = c2434i;
        }

        @Override // p4.C2434i.b
        public void a() {
            Log.e("", "onAdBreakStatusUpdated()");
        }

        @Override // p4.C2434i.b
        public void b() {
            Log.e("", "onMetadataUpdated()");
        }

        @Override // p4.C2434i.b
        public void c() {
            Log.e("", "onQueueStatusUpdated()");
        }

        @Override // p4.C2434i.b
        public void d() {
            Log.e("", "onSendingRemoteMediaRequest()");
        }

        @Override // p4.C2434i.b
        public void e() {
            Log.e("", "onPreloadStatusUpdated()");
        }

        @Override // p4.C2434i.b
        public void f() {
            Log.e("", "onStatusUpdated()");
            this.f41893a.startActivity(new Intent(this.f41893a, (Class<?>) ExpandedControlsActivity.class));
            this.f41894b.O(this);
        }
    }

    /* JADX INFO: renamed from: i7.a$b */
    public class b extends C2434i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f41895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2434i f41896b;

        public b(Context context, C2434i c2434i) {
            this.f41895a = context;
            this.f41896b = c2434i;
        }

        @Override // p4.C2434i.a
        public void g() {
            Intent intent = new Intent(this.f41895a, (Class<?>) ExpandedControlsActivity.class);
            if (((Activity) this.f41895a).getClass().getSimpleName().equals("HoneyPlayer")) {
                ((Activity) this.f41895a).finish();
            }
            this.f41895a.startActivity(intent);
            this.f41896b.X(this);
        }
    }

    /* JADX INFO: renamed from: i7.a$c */
    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f41897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2281m f41898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Handler f41899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C2434i f41900d;

        /* JADX INFO: renamed from: i7.a$c$a, reason: collision with other inner class name */
        public class RunnableC0349a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MediaInfo f41901a;

            /* JADX INFO: renamed from: i7.a$c$a$a, reason: collision with other inner class name */
            public class C0350a extends C2434i.a {
                public C0350a() {
                }

                @Override // p4.C2434i.a
                public void g() {
                    Intent intent = new Intent(c.this.f41897a, (Class<?>) ExpandedControlsActivity.class);
                    if (((Activity) c.this.f41897a).getClass().getSimpleName().equals("NSTIJKPlayerSkyActivity") || ((Activity) c.this.f41897a).getClass().getSimpleName().equals("NSTEXOPlayerSkyActivity")) {
                        ((Activity) c.this.f41897a).finish();
                    }
                    c.this.f41897a.startActivity(intent);
                    c.this.f41900d.X(this);
                }
            }

            public RunnableC0349a(MediaInfo mediaInfo) {
                this.f41901a = mediaInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f41900d.N(new C0350a());
                c.this.f41900d.z(new C2280l.a().h(this.f41901a).c(Boolean.TRUE).f(0L).a());
            }
        }

        public c(Context context, C2281m c2281m, Handler handler, C2434i c2434i) {
            this.f41897a = context;
            this.f41898b = c2281m;
            this.f41899c = handler;
            this.f41900d = c2434i;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            try {
                iOException.printStackTrace();
                Log.e("chrome cast ====>  ", "Unable to cast,please try again");
                Toast.makeText(this.f41897a, "Unable to cast,please try again ", 0).show();
            } catch (Exception unused) {
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Log.e("url with token==> ", "" + response.request().url().toString());
            this.f41899c.post(new RunnableC0349a(new MediaInfo.a(response.request().url().toString()).e(1).b("application/x-mpegurl").d(this.f41898b).a()));
        }
    }

    public static MediaInfo a(String str, String str2, String str3, int i9, String str4, String str5, String str6, String str7, List list) {
        JSONObject jSONObject;
        JSONException e9;
        C2281m c2281m = new C2281m(1);
        c2281m.M("com.google.android.gms.cast.metadata.SUBTITLE", str2);
        c2281m.M("com.google.android.gms.cast.metadata.TITLE", str);
        c2281m.c(new C2957a(Uri.parse(str6)));
        c2281m.c(new C2957a(Uri.parse(str7)));
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("description", str3);
            } catch (JSONException e10) {
                e9 = e10;
                Log.e("honey", "Failed to add description to the json object", e9);
            }
        } catch (JSONException e11) {
            jSONObject = null;
            e9 = e11;
        }
        return new MediaInfo.a(str4).e(1).b(str5).d(c2281m).c(jSONObject).a();
    }

    public static void b(Handler handler, C2434i c2434i, String str, C2281m c2281m, Context context) {
        new OkHttpClient().newCall(new Request.Builder().url(str).build()).enqueue(new c(context, c2281m, handler, c2434i));
    }

    public static void c(int i9, boolean z9, MediaInfo mediaInfo, C2328e c2328e, Context context) {
        C2434i c2434iR;
        if (c2328e == null || (c2434iR = c2328e.r()) == null) {
            return;
        }
        c2434iR.N(new b(context, c2434iR));
        c2434iR.z(new C2280l.a().h(mediaInfo).c(Boolean.valueOf(z9)).f(i9).a());
    }

    public static void d(MediaInfo mediaInfo, C2328e c2328e, Context context) {
        C2434i c2434iR;
        if (c2328e == null || (c2434iR = c2328e.r()) == null) {
            return;
        }
        c2434iR.b(new C0348a(context, c2434iR));
        c2434iR.y(mediaInfo, true, 0L);
    }
}

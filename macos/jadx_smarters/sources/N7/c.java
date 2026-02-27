package n7;

import android.content.Context;
import b7.AbstractC1232b;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f45559c;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            if (c.this.f45559c != null) {
                c.this.f45559c.R0();
            }
            SharepreferenceDBHandler.setUpdateVersionCode(c.this.f45557a, "", "", "");
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
        @Override // retrofit2.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n7.c.a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public interface b {
        void R0();

        void f(String str);
    }

    public c(b bVar, Context context) {
        this.f45559c = bVar;
        this.f45557a = context;
    }

    public void a() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f45558b = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public void d() {
        Retrofit retrofitD0 = w.D0(this.f45557a);
        if (retrofitD0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitD0.create(RetrofitPost.class);
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            a();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", AbstractC2237a.f44495d1);
            retrofitPost.getDownloadInfo(jsonObject).enqueue(new a());
        }
    }
}

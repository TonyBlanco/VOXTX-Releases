package L5;

import O5.AbstractC0945i;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f4084b = null;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4086b;

        public b() {
            int iR = AbstractC0945i.r(e.this.f4083a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iR == 0) {
                if (!e.this.c("flutter_assets/NOTICES.Z")) {
                    this.f4085a = null;
                    this.f4086b = null;
                    return;
                } else {
                    this.f4085a = "Flutter";
                    this.f4086b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f4085a = "Unity";
            String string = e.this.f4083a.getResources().getString(iR);
            this.f4086b = string;
            f.f().i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f4083a = context;
    }

    public final boolean c(String str) {
        if (this.f4083a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f4083a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().f4085a;
    }

    public String e() {
        return f().f4086b;
    }

    public final b f() {
        if (this.f4084b == null) {
            this.f4084b = new b();
        }
        return this.f4084b;
    }
}

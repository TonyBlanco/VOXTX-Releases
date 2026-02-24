package V5;

import O5.AbstractC0945i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f10065a;

    public a(T5.f fVar) {
        this.f10065a = fVar.e("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.f10065a;
    }

    public JSONObject b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        L5.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(AbstractC0945i.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e9) {
                        e = e9;
                        L5.f.f().e("Failed to fetch cached settings", e);
                        AbstractC0945i.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    L5.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC0945i.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0945i.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            AbstractC0945i.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j9, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        L5.f.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j9);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e9) {
                e = e9;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                AbstractC0945i.e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e10) {
                e = e10;
                fileWriter2 = fileWriter;
                L5.f.f().e("Failed to cache settings", e);
                AbstractC0945i.e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                AbstractC0945i.e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}

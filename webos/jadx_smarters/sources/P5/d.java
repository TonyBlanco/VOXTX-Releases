package P5;

import O5.AbstractC0945i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f7295b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T5.f f7296a;

    public d(T5.f fVar) {
        this.f7296a = fVar;
    }

    public static Map d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, j(jSONObject, next));
        }
        return map;
    }

    public static String f(Map map) {
        return new JSONObject(map).toString();
    }

    public static void i(File file) {
        if (file.exists() && file.delete()) {
            L5.f.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f7296a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.f7296a.o(str, "keys");
    }

    public File c(String str) {
        return this.f7296a.o(str, "user-data");
    }

    public final String e(String str) {
        return j(new JSONObject(str), "userId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public Map g(String str, boolean z9) throws Throwable {
        FileInputStream fileInputStream;
        Exception e9;
        File fileA = z9 ? a(str) : b(str);
        if (fileA.exists()) {
            ?? length = fileA.length();
            if (length != 0) {
                ?? r82 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileA);
                        try {
                            Map mapD = d(AbstractC0945i.D(fileInputStream));
                            AbstractC0945i.e(fileInputStream, "Failed to close user metadata file.");
                            return mapD;
                        } catch (Exception e10) {
                            e9 = e10;
                            L5.f.f().l("Error deserializing user metadata.", e9);
                            i(fileA);
                            AbstractC0945i.e(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        r82 = length;
                        AbstractC0945i.e(r82, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e11) {
                    fileInputStream = null;
                    e9 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC0945i.e(r82, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        i(fileA);
        return Collections.emptyMap();
    }

    public String h(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = c(str);
        FileInputStream fileInputStream2 = null;
        if (!fileC.exists() || fileC.length() == 0) {
            L5.f.f().b("No userId set for session " + str);
            i(fileC);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileC);
            try {
                try {
                    String strE = e(AbstractC0945i.D(fileInputStream));
                    L5.f.f().b("Loaded userId " + strE + " for session " + str);
                    AbstractC0945i.e(fileInputStream, "Failed to close user metadata file.");
                    return strE;
                } catch (Exception e9) {
                    e = e9;
                    L5.f.f().l("Error deserializing user metadata.", e);
                    i(fileC);
                    AbstractC0945i.e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                AbstractC0945i.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC0945i.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void k(String str, Map map, boolean z9) throws Throwable {
        String strF;
        BufferedWriter bufferedWriter;
        File fileA = z9 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strF = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f7295b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e9) {
            e = e9;
        }
        try {
            bufferedWriter.write(strF);
            bufferedWriter.flush();
            AbstractC0945i.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            L5.f.f().l("Error serializing key/value metadata.", e);
            i(fileA);
            AbstractC0945i.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0945i.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}

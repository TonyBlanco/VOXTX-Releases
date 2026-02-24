package T5;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f9555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f9556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f9557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f9558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f9559f;

    public f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f9554a = filesDir;
        if (v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileQ = q(new File(filesDir, str));
        this.f9555b = fileQ;
        this.f9556c = q(new File(fileQ, "open-sessions"));
        this.f9557d = q(new File(fileQ, "reports"));
        this.f9558e = q(new File(fileQ, "priority-reports"));
        this.f9559f = q(new File(fileQ, "native-reports"));
    }

    public static synchronized File q(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                L5.f.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                L5.f.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static File r(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean s(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    public static List t(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public final void a(File file) {
        if (file.exists() && s(file)) {
            L5.f.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public void b() {
        a(new File(this.f9554a, ".com.google.firebase.crashlytics"));
        a(new File(this.f9554a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f9554a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f9556c, str));
    }

    public List d() {
        return t(this.f9556c.list());
    }

    public File e(String str) {
        return new File(this.f9555b, str);
    }

    public List f(FilenameFilter filenameFilter) {
        return t(this.f9555b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f9559f, str);
    }

    public List h() {
        return t(this.f9559f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f9558e, str);
    }

    public List k() {
        return t(this.f9558e.listFiles());
    }

    public File l(String str) {
        return new File(this.f9557d, str);
    }

    public List m() {
        return t(this.f9557d.listFiles());
    }

    public final File n(String str) {
        return r(new File(this.f9556c, str));
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}

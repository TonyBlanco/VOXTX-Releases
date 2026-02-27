package F7;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static H7.a f2051f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f2053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f2054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2056e = "";

    public b(Context context, File file, H7.a aVar) {
        this.f2055d = "";
        this.f2052a = file;
        String name = file.getName();
        this.f2055d = name;
        if (name != null && name.endsWith(".zip")) {
            this.f2055d = this.f2055d.replaceAll(".zip", "");
        }
        this.f2054c = context;
        a("");
        f2051f = aVar;
    }

    public final void a(String str) {
        File file = new File(str);
        Log.i("UNZIPUTIL", "creating dir " + str);
        if (str.length() < 0 || file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    public void b() {
        File file;
        try {
            if (new C2858a(this.f2054c).A().equals(AbstractC2237a.f44453K0)) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f2055d);
            } else if (Build.VERSION.SDK_INT >= 23) {
                file = new File(this.f2054c.getFilesDir() + "/VPNIPTVSmarters/" + this.f2055d);
            } else {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f2055d);
            }
            a(String.valueOf(file));
            Log.i("UNZIPUTIL", "Starting to unzip");
            InputStream fileInputStream = this.f2053b;
            if (fileInputStream == null) {
                fileInputStream = new FileInputStream(this.f2052a);
            }
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    f2051f.x0(String.valueOf(file));
                    Log.i("UNZIPUTIL", "Finished unzip");
                    return;
                }
                Log.v("UNZIPUTIL", "Unzipping " + nextEntry.getName());
                if (!nextEntry.isDirectory()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, nextEntry.getName()));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i9 = zipInputStream.read(bArr);
                        if (i9 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i9);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (Exception e9) {
            Log.e("UNZIPUTIL", "Unzip Error", e9);
            f2051f.z0("failed to Extract zip file ");
        }
    }
}

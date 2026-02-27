package F7;

import a7.j;
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
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static H7.a f2046e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f2047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f2048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f2049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2050d;

    public a(Context context, File file, H7.a aVar) {
        this.f2047a = file;
        this.f2049c = context;
        String name = file.getName();
        this.f2050d = name;
        if (name != null && name.endsWith(".zip")) {
            this.f2050d = this.f2050d.replaceAll(".zip", "");
        }
        a("");
        f2046e = aVar;
    }

    public final void a(String str) {
        File file = new File(str);
        Log.i("UNZIPUTIL", "creating dir " + str);
        if (str.length() < 0 || file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    public void b(String str) {
        File file;
        new C2858a(this.f2049c).A();
        if (str.equals("SBP_URL")) {
            file = Build.VERSION.SDK_INT >= 23 ? new File(this.f2049c.getFilesDir() + "/VPNSBPIPTVSmarters/" + this.f2050d) : new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNSBPIPTVSmarters/" + this.f2050d);
            File file2 = new File(String.valueOf(file));
            if (file2.exists()) {
                file2.deleteOnExit();
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            file = new File(this.f2049c.getFilesDir() + "/VPNIPTVSmarters/" + this.f2050d);
        } else {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/" + this.f2050d);
        }
        try {
            try {
                File file3 = new File(String.valueOf(file));
                if (file3.isDirectory()) {
                    for (File file4 : file3.listFiles()) {
                        file4.delete();
                    }
                }
                file3.delete();
            } catch (Exception unused) {
                Log.e("mszz: ", "error deleting file");
            }
            a(String.valueOf(file));
            Log.i("UNZIPUTIL", "Starting to unzip");
            InputStream fileInputStream = this.f2048b;
            if (fileInputStream == null) {
                fileInputStream = new FileInputStream(this.f2047a);
            }
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    f2046e.x0(String.valueOf(file));
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
            f2046e.z0(this.f2049c.getResources().getString(j.f13244e7));
            f2046e.x0(String.valueOf(file));
        }
    }
}

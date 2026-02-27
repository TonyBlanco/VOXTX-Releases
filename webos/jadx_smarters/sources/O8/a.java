package O8;

import O8.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class a implements c.a {

    /* JADX INFO: renamed from: O8.a$a, reason: collision with other inner class name */
    public static class C0076a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZipFile f6718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZipEntry f6719b;

        public C0076a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f6718a = zipFile;
            this.f6719b = zipEntry;
        }
    }

    @Override // O8.c.a
    public void a(Context context, String[] strArr, String str, File file, d dVar) throws Throwable {
        String[] strArrE;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        long jC;
        C0076a c0076a = null;
        Closeable closeable = null;
        try {
            C0076a c0076aD = d(context, strArr, str, dVar);
            try {
                if (c0076aD == null) {
                    try {
                        strArrE = e(context, str);
                    } catch (Exception e9) {
                        strArrE = new String[]{e9.toString()};
                    }
                    throw new b(str, strArr, strArrE);
                }
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (i9 >= 5) {
                        dVar.h("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile = c0076aD.f6718a;
                            if (zipFile != null) {
                                zipFile.close();
                                return;
                            }
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    dVar.i("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = c0076aD.f6718a.getInputStream(c0076aD.f6719b);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                } catch (FileNotFoundException unused2) {
                                    fileOutputStream = null;
                                } catch (IOException unused3) {
                                    fileOutputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                }
                            } catch (FileNotFoundException unused4) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (IOException unused5) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                            try {
                                jC = c(inputStream, fileOutputStream);
                                fileOutputStream.getFD().sync();
                            } catch (FileNotFoundException unused6) {
                                b(inputStream);
                            } catch (IOException unused7) {
                                b(inputStream);
                            } catch (Throwable th3) {
                                th = th3;
                                closeable = inputStream;
                                b(closeable);
                                b(fileOutputStream);
                                throw th;
                            }
                            if (jC == file.length()) {
                                b(inputStream);
                                b(fileOutputStream);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                try {
                                    ZipFile zipFile2 = c0076aD.f6718a;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException unused8) {
                                    return;
                                }
                            }
                            b(inputStream);
                            b(fileOutputStream);
                        }
                    } catch (IOException unused9) {
                    }
                    i9 = i10;
                }
            } catch (Throwable th4) {
                th = th4;
                c0076a = c0076aD;
                if (c0076a != null) {
                    try {
                        ZipFile zipFile3 = c0076a.f6718a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j9 = 0;
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                outputStream.flush();
                return j9;
            }
            outputStream.write(bArr, 0, i9);
            j9 += (long) i9;
        }
    }

    public final C0076a d(Context context, String[] strArr, String str, d dVar) {
        String[] strArrF = f(context);
        int length = strArrF.length;
        char c9 = 0;
        int i9 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i9 >= length) {
                return null;
            }
            String str2 = strArrF[i9];
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i10 = i11;
                }
            }
            if (zipFile != null) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 < 5) {
                        int length2 = strArr.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            String str3 = strArr[i14];
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c10 = File.separatorChar;
                            sb.append(c10);
                            sb.append(str3);
                            sb.append(c10);
                            sb.append(str);
                            String string = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[c9] = string;
                            objArr[1] = str2;
                            dVar.i("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                return new C0076a(zipFile, entry);
                            }
                            i14++;
                            c9 = 0;
                        }
                        i12 = i13;
                        c9 = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i9++;
            c9 = 0;
        }
    }

    public final String[] e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c9 = File.separatorChar;
        sb.append(c9);
        sb.append("([^\\");
        sb.append(c9);
        sb.append("]*)");
        sb.append(c9);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}

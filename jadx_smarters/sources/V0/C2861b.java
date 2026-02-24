package v0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: v0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2861b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f51244a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f51246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f51247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FileChannel f51248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FileLock f51249g;

    /* JADX INFO: renamed from: v0.b$a */
    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: renamed from: v0.b$b, reason: collision with other inner class name */
    public static class C0471b extends File {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f51251a;

        public C0471b(File file, String str) {
            super(file, str);
            this.f51251a = -1L;
        }
    }

    public C2861b(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f51244a = file;
        this.f51246d = file2;
        this.f51245c = h(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f51247e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f51248f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f51249g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e9) {
                e = e9;
                c(this.f51248f);
                throw e;
            } catch (Error e10) {
                e = e10;
                c(this.f51248f);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                c(this.f51248f);
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            c(this.f51247e);
            throw e;
        } catch (Error e13) {
            e = e13;
            c(this.f51247e);
            throw e;
        } catch (RuntimeException e14) {
            e = e14;
            c(this.f51247e);
            throw e;
        }
    }

    public static void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e9) {
            Log.w("MultiDex", "Failed to close resource", e9);
        }
    }

    public static void d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                while (true) {
                    int i9 = inputStream.read(bArr);
                    if (i9 == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i9);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    c(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            c(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static long g(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long h(File file) throws IOException {
        long jC = AbstractC2862c.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean i(Context context, File file, long j9, String str) {
        SharedPreferences sharedPreferencesE = e(context);
        if (sharedPreferencesE.getLong(str + "timestamp", -1L) == g(file)) {
            if (sharedPreferencesE.getLong(str + "crc", -1L) == j9) {
                return false;
            }
        }
        return true;
    }

    public static void m(Context context, String str, long j9, long j10, List list) {
        SharedPreferences.Editor editorEdit = e(context).edit();
        editorEdit.putLong(str + "timestamp", j9);
        editorEdit.putLong(str + "crc", j10);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i9 = 2;
        while (it.hasNext()) {
            C0471b c0471b = (C0471b) it.next();
            editorEdit.putLong(str + "dex.crc." + i9, c0471b.f51251a);
            editorEdit.putLong(str + "dex.time." + i9, c0471b.lastModified());
            i9++;
        }
        editorEdit.commit();
    }

    public final void a() {
        File[] fileArrListFiles = this.f51246d.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f51246d.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51249g.release();
        this.f51248f.close();
        this.f51247e.close();
    }

    public List j(Context context, String str, boolean z9) {
        List listK;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f51244a.getPath() + ", " + z9 + ", " + str + ")");
        if (!this.f51249g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z9 && !i(context, this.f51244a, this.f51245c, str)) {
            try {
                listK = k(context, str);
            } catch (IOException e9) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e9);
                List listL = l();
                m(context, str, g(this.f51244a), this.f51245c, listL);
                listK = listL;
            }
            Log.i("MultiDex", "load found " + listK.size() + " secondary dex files");
            return listK;
        }
        Log.i("MultiDex", z9 ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
        List listL2 = l();
        m(context, str, g(this.f51244a), this.f51245c, listL2);
        listK = listL2;
        Log.i("MultiDex", "load found " + listK.size() + " secondary dex files");
        return listK;
    }

    public final List k(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f51244a.getName() + ".classes";
        SharedPreferences sharedPreferencesE = e(context);
        int i9 = sharedPreferencesE.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i9 + (-1));
        int i10 = 2;
        while (i10 <= i9) {
            C0471b c0471b = new C0471b(this.f51246d, str2 + i10 + ".zip");
            if (!c0471b.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c0471b.getPath() + "'");
            }
            c0471b.f51251a = h(c0471b);
            long j9 = sharedPreferencesE.getLong(str + "dex.crc." + i10, -1L);
            long j10 = sharedPreferencesE.getLong(str + "dex.time." + i10, -1L);
            long jLastModified = c0471b.lastModified();
            if (j10 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesE;
                if (j9 == c0471b.f51251a) {
                    arrayList.add(c0471b);
                    i10++;
                    sharedPreferencesE = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c0471b + " (key \"" + str + "\"), expected modification time: " + j10 + ", modification time: " + jLastModified + ", expected crc: " + j9 + ", file crc: " + c0471b.f51251a);
        }
        return arrayList;
    }

    public final List l() {
        boolean z9;
        String str = this.f51244a.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f51244a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i9 = 2;
            while (entry != null) {
                C0471b c0471b = new C0471b(this.f51246d, str + i9 + ".zip");
                arrayList.add(c0471b);
                Log.i("MultiDex", "Extraction is needed for file " + c0471b);
                int i10 = 0;
                boolean z10 = false;
                while (i10 < 3 && !z10) {
                    int i11 = i10 + 1;
                    d(zipFile, entry, c0471b, str);
                    try {
                        c0471b.f51251a = h(c0471b);
                        z9 = true;
                    } catch (IOException e9) {
                        Log.w("MultiDex", "Failed to read crc from " + c0471b.getAbsolutePath(), e9);
                        z9 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z9 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(c0471b.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(c0471b.length());
                    sb.append(" - crc: ");
                    sb.append(c0471b.f51251a);
                    Log.i("MultiDex", sb.toString());
                    if (!z9) {
                        c0471b.delete();
                        if (c0471b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c0471b.getPath() + "'");
                        }
                    }
                    z10 = z9;
                    i10 = i11;
                }
                if (!z10) {
                    throw new IOException("Could not create zip file " + c0471b.getAbsolutePath() + " for secondary dex (" + i9 + ")");
                }
                i9++;
                entry = zipFile.getEntry("classes" + i9 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to close resource", e10);
            }
            return arrayList;
        } finally {
        }
    }
}

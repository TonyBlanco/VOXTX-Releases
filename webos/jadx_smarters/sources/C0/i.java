package C0;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public class i implements G0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f930a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G0.c f934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f936h;

    public i(Context context, String str, File file, int i9, G0.c cVar) {
        this.f930a = context;
        this.f931c = str;
        this.f932d = file;
        this.f933e = i9;
        this.f934f = cVar;
    }

    public final void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f931c != null) {
            channel = Channels.newChannel(this.f930a.getAssets().open(this.f931c));
        } else {
            if (this.f932d == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f932d).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f930a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        E0.d.a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public void c(a aVar) {
        this.f935g = aVar;
    }

    @Override // G0.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f934f.close();
        this.f936h = false;
    }

    public final void d() {
        String databaseName = getDatabaseName();
        File databasePath = this.f930a.getDatabasePath(databaseName);
        a aVar = this.f935g;
        E0.a aVar2 = new E0.a(databaseName, this.f930a.getFilesDir(), aVar == null || aVar.f877j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e9) {
                    throw new RuntimeException("Unable to copy database file.", e9);
                }
            }
            if (this.f935g == null) {
                aVar2.c();
                return;
            }
            try {
                int iC = E0.c.c(databasePath);
                int i9 = this.f933e;
                if (iC == i9) {
                    aVar2.c();
                    return;
                }
                if (this.f935g.a(iC, i9)) {
                    aVar2.c();
                    return;
                }
                if (this.f930a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e10) {
                        Log.w("ROOM", "Unable to copy database file.", e10);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e11) {
                Log.w("ROOM", "Unable to read database version.", e11);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // G0.c
    public String getDatabaseName() {
        return this.f934f.getDatabaseName();
    }

    @Override // G0.c
    public synchronized G0.b getWritableDatabase() {
        try {
            if (!this.f936h) {
                d();
                this.f936h = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f934f.getWritableDatabase();
    }

    @Override // G0.c
    public void setWriteAheadLoggingEnabled(boolean z9) {
        this.f934f.setWriteAheadLoggingEnabled(z9);
    }
}

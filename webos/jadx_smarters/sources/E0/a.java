package E0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f1532e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f1533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f1534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f1536d;

    public a(String str, File file, boolean z9) {
        File file2 = new File(file, str + ".lck");
        this.f1533a = file2;
        this.f1534b = a(file2.getAbsolutePath());
        this.f1535c = z9;
    }

    public static Lock a(String str) {
        Lock reentrantLock;
        Map map = f1532e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return reentrantLock;
    }

    public void b() {
        this.f1534b.lock();
        if (this.f1535c) {
            try {
                FileChannel channel = new FileOutputStream(this.f1533a).getChannel();
                this.f1536d = channel;
                channel.lock();
            } catch (IOException e9) {
                throw new IllegalStateException("Unable to grab copy lock.", e9);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f1536d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f1534b.unlock();
    }
}

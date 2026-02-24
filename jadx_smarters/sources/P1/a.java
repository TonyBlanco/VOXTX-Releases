package P1;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f6911a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f6912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f6913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f6914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6917h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Writer f6919j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6921l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6918i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f6920k = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6922m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f6923n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable f6924o = new CallableC0082a();

    /* JADX INFO: renamed from: P1.a$a, reason: collision with other inner class name */
    public class CallableC0082a implements Callable {
        public CallableC0082a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f6919j == null) {
                        return null;
                    }
                    a.this.b0();
                    if (a.this.r()) {
                        a.this.T();
                        a.this.f6921l = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f6926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f6927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6928c;

        public b(c cVar) {
            this.f6926a = cVar;
            this.f6927b = cVar.f6934e ? null : new boolean[a.this.f6917h];
        }

        public /* synthetic */ b(a aVar, c cVar, CallableC0082a callableC0082a) {
            this(cVar);
        }

        public void a() {
            a.this.l(this, false);
        }

        public void b() {
            if (this.f6928c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.l(this, true);
            this.f6928c = true;
        }

        public File f(int i9) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f6926a.f6935f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f6926a.f6934e) {
                        this.f6927b[i9] = true;
                    }
                    fileK = this.f6926a.k(i9);
                    if (!a.this.f6911a.exists()) {
                        a.this.f6911a.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileK;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f6931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File[] f6932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File[] f6933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f6935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f6936g;

        public c(String str) {
            this.f6930a = str;
            this.f6931b = new long[a.this.f6917h];
            this.f6932c = new File[a.this.f6917h];
            this.f6933d = new File[a.this.f6917h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i9 = 0; i9 < a.this.f6917h; i9++) {
                sb.append(i9);
                this.f6932c[i9] = new File(a.this.f6911a, sb.toString());
                sb.append(".tmp");
                this.f6933d[i9] = new File(a.this.f6911a, sb.toString());
                sb.setLength(length);
            }
        }

        public /* synthetic */ c(a aVar, String str, CallableC0082a callableC0082a) {
            this(str);
        }

        public File j(int i9) {
            return this.f6932c[i9];
        }

        public File k(int i9) {
            return this.f6933d[i9];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j9 : this.f6931b) {
                sb.append(TokenParser.SP);
                sb.append(j9);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f6917h) {
                throw m(strArr);
            }
            for (int i9 = 0; i9 < strArr.length; i9++) {
                try {
                    this.f6931b[i9] = Long.parseLong(strArr[i9]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f6940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f6941d;

        public d(String str, long j9, File[] fileArr, long[] jArr) {
            this.f6938a = str;
            this.f6939b = j9;
            this.f6941d = fileArr;
            this.f6940c = jArr;
        }

        public /* synthetic */ d(a aVar, String str, long j9, File[] fileArr, long[] jArr, CallableC0082a callableC0082a) {
            this(str, j9, fileArr, jArr);
        }

        public File a(int i9) {
            return this.f6941d[i9];
        }
    }

    public a(File file, int i9, int i10, long j9) {
        this.f6911a = file;
        this.f6915f = i9;
        this.f6912c = new File(file, "journal");
        this.f6913d = new File(file, "journal.tmp");
        this.f6914e = new File(file, "journal.bkp");
        this.f6917h = i10;
        this.f6916g = j9;
    }

    public static void Y(File file, File file2, boolean z9) throws IOException {
        if (z9) {
            n(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void n(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static a s(File file, int i9, int i10, long j9) throws IOException {
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Y(file2, file3, false);
            }
        }
        a aVar = new a(file, i9, i10, j9);
        if (aVar.f6912c.exists()) {
            try {
                aVar.v();
                aVar.t();
                return aVar;
            } catch (IOException e9) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e9.getMessage() + ", removing");
                aVar.m();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i9, i10, j9);
        aVar2.T();
        return aVar2;
    }

    public final synchronized void T() {
        try {
            Writer writer = this.f6919j;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6913d), P1.c.f6949a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f6915f));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f6917h));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (c cVar : this.f6920k.values()) {
                    bufferedWriter.write(cVar.f6935f != null ? "DIRTY " + cVar.f6930a + '\n' : "CLEAN " + cVar.f6930a + cVar.l() + '\n');
                }
                bufferedWriter.close();
                if (this.f6912c.exists()) {
                    Y(this.f6912c, this.f6914e, true);
                }
                Y(this.f6913d, this.f6912c, false);
                this.f6914e.delete();
                this.f6919j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6912c, true), P1.c.f6949a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean V(String str) {
        try {
            k();
            c cVar = (c) this.f6920k.get(str);
            if (cVar != null && cVar.f6935f == null) {
                for (int i9 = 0; i9 < this.f6917h; i9++) {
                    File fileJ = cVar.j(i9);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f6918i -= cVar.f6931b[i9];
                    cVar.f6931b[i9] = 0;
                }
                this.f6921l++;
                this.f6919j.append((CharSequence) "REMOVE");
                this.f6919j.append(TokenParser.SP);
                this.f6919j.append((CharSequence) str);
                this.f6919j.append('\n');
                this.f6920k.remove(str);
                if (r()) {
                    this.f6923n.submit(this.f6924o);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b0() {
        while (this.f6918i > this.f6916g) {
            V((String) ((Map.Entry) this.f6920k.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f6919j == null) {
                return;
            }
            for (c cVar : new ArrayList(this.f6920k.values())) {
                if (cVar.f6935f != null) {
                    cVar.f6935f.a();
                }
            }
            b0();
            this.f6919j.close();
            this.f6919j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k() {
        if (this.f6919j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void l(b bVar, boolean z9) {
        c cVar = bVar.f6926a;
        if (cVar.f6935f != bVar) {
            throw new IllegalStateException();
        }
        if (z9 && !cVar.f6934e) {
            for (int i9 = 0; i9 < this.f6917h; i9++) {
                if (!bVar.f6927b[i9]) {
                    bVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i9);
                }
                if (!cVar.k(i9).exists()) {
                    bVar.a();
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < this.f6917h; i10++) {
            File fileK = cVar.k(i10);
            if (!z9) {
                n(fileK);
            } else if (fileK.exists()) {
                File fileJ = cVar.j(i10);
                fileK.renameTo(fileJ);
                long j9 = cVar.f6931b[i10];
                long length = fileJ.length();
                cVar.f6931b[i10] = length;
                this.f6918i = (this.f6918i - j9) + length;
            }
        }
        this.f6921l++;
        cVar.f6935f = null;
        if (cVar.f6934e || z9) {
            cVar.f6934e = true;
            this.f6919j.append((CharSequence) "CLEAN");
            this.f6919j.append(TokenParser.SP);
            this.f6919j.append((CharSequence) cVar.f6930a);
            this.f6919j.append((CharSequence) cVar.l());
            this.f6919j.append('\n');
            if (z9) {
                long j10 = this.f6922m;
                this.f6922m = 1 + j10;
                cVar.f6936g = j10;
            }
        } else {
            this.f6920k.remove(cVar.f6930a);
            this.f6919j.append((CharSequence) "REMOVE");
            this.f6919j.append(TokenParser.SP);
            this.f6919j.append((CharSequence) cVar.f6930a);
            this.f6919j.append('\n');
        }
        this.f6919j.flush();
        if (this.f6918i > this.f6916g || r()) {
            this.f6923n.submit(this.f6924o);
        }
    }

    public void m() throws IOException {
        close();
        P1.c.b(this.f6911a);
    }

    public b o(String str) {
        return p(str, -1L);
    }

    public final synchronized b p(String str, long j9) {
        k();
        c cVar = (c) this.f6920k.get(str);
        CallableC0082a callableC0082a = null;
        if (j9 != -1 && (cVar == null || cVar.f6936g != j9)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(this, str, callableC0082a);
            this.f6920k.put(str, cVar);
        } else if (cVar.f6935f != null) {
            return null;
        }
        b bVar = new b(this, cVar, callableC0082a);
        cVar.f6935f = bVar;
        this.f6919j.append((CharSequence) "DIRTY");
        this.f6919j.append(TokenParser.SP);
        this.f6919j.append((CharSequence) str);
        this.f6919j.append('\n');
        this.f6919j.flush();
        return bVar;
    }

    public synchronized d q(String str) {
        k();
        c cVar = (c) this.f6920k.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f6934e) {
            return null;
        }
        for (File file : cVar.f6932c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f6921l++;
        this.f6919j.append((CharSequence) "READ");
        this.f6919j.append(TokenParser.SP);
        this.f6919j.append((CharSequence) str);
        this.f6919j.append('\n');
        if (r()) {
            this.f6923n.submit(this.f6924o);
        }
        return new d(this, str, cVar.f6936g, cVar.f6932c, cVar.f6931b, null);
    }

    public final boolean r() {
        int i9 = this.f6921l;
        return i9 >= 2000 && i9 >= this.f6920k.size();
    }

    public final void t() throws IOException {
        n(this.f6913d);
        Iterator it = this.f6920k.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i9 = 0;
            if (cVar.f6935f == null) {
                while (i9 < this.f6917h) {
                    this.f6918i += cVar.f6931b[i9];
                    i9++;
                }
            } else {
                cVar.f6935f = null;
                while (i9 < this.f6917h) {
                    n(cVar.j(i9));
                    n(cVar.k(i9));
                    i9++;
                }
                it.remove();
            }
        }
    }

    public final void v() {
        P1.b bVar = new P1.b(new FileInputStream(this.f6912c), P1.c.f6949a);
        try {
            String strE = bVar.e();
            String strE2 = bVar.e();
            String strE3 = bVar.e();
            String strE4 = bVar.e();
            String strE5 = bVar.e();
            if (!"libcore.io.DiskLruCache".equals(strE) || !"1".equals(strE2) || !Integer.toString(this.f6915f).equals(strE3) || !Integer.toString(this.f6917h).equals(strE4) || !"".equals(strE5)) {
                throw new IOException("unexpected journal header: [" + strE + ", " + strE2 + ", " + strE4 + ", " + strE5 + "]");
            }
            int i9 = 0;
            while (true) {
                try {
                    w(bVar.e());
                    i9++;
                } catch (EOFException unused) {
                    this.f6921l = i9 - this.f6920k.size();
                    if (bVar.d()) {
                        T();
                    } else {
                        this.f6919j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6912c, true), P1.c.f6949a));
                    }
                    P1.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            P1.c.a(bVar);
            throw th;
        }
    }

    public final void w(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i9 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i9);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i9);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f6920k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i9, iIndexOf2);
        }
        c cVar = (c) this.f6920k.get(strSubstring);
        CallableC0082a callableC0082a = null;
        if (cVar == null) {
            cVar = new c(this, strSubstring, callableC0082a);
            this.f6920k.put(strSubstring, cVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            cVar.f6934e = true;
            cVar.f6935f = null;
            cVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            cVar.f6935f = new b(this, cVar, callableC0082a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }
}

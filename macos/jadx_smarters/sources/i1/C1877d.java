package i1;

import android.os.SystemClock;
import android.text.TextUtils;
import h1.InterfaceC1847b;
import h1.v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: i1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1877d implements InterfaceC1847b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41795a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41796b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0345d f41797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41798d;

    /* JADX INFO: renamed from: i1.d$a */
    public class a implements InterfaceC0345d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f41799a;

        public a(File file) {
            this.f41799a = file;
        }

        @Override // i1.C1877d.InterfaceC0345d
        public File get() {
            return this.f41799a;
        }
    }

    /* JADX INFO: renamed from: i1.d$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f41801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f41803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f41804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f41805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f41806f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f41807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f41808h;

        public b(String str, InterfaceC1847b.a aVar) {
            this(str, aVar.f41507b, aVar.f41508c, aVar.f41509d, aVar.f41510e, aVar.f41511f, a(aVar));
        }

        public b(String str, String str2, long j9, long j10, long j11, long j12, List list) {
            this.f41802b = str;
            this.f41803c = "".equals(str2) ? null : str2;
            this.f41804d = j9;
            this.f41805e = j10;
            this.f41806f = j11;
            this.f41807g = j12;
            this.f41808h = list;
        }

        public static List a(InterfaceC1847b.a aVar) {
            List list = aVar.f41513h;
            return list != null ? list : AbstractC1878e.g(aVar.f41512g);
        }

        public static b b(c cVar) throws IOException {
            if (C1877d.l(cVar) == 538247942) {
                return new b(C1877d.n(cVar), C1877d.n(cVar), C1877d.m(cVar), C1877d.m(cVar), C1877d.m(cVar), C1877d.m(cVar), C1877d.k(cVar));
            }
            throw new IOException();
        }

        public InterfaceC1847b.a c(byte[] bArr) {
            InterfaceC1847b.a aVar = new InterfaceC1847b.a();
            aVar.f41506a = bArr;
            aVar.f41507b = this.f41803c;
            aVar.f41508c = this.f41804d;
            aVar.f41509d = this.f41805e;
            aVar.f41510e = this.f41806f;
            aVar.f41511f = this.f41807g;
            aVar.f41512g = AbstractC1878e.h(this.f41808h);
            aVar.f41513h = Collections.unmodifiableList(this.f41808h);
            return aVar;
        }

        public boolean d(OutputStream outputStream) {
            try {
                C1877d.s(outputStream, 538247942);
                C1877d.u(outputStream, this.f41802b);
                String str = this.f41803c;
                if (str == null) {
                    str = "";
                }
                C1877d.u(outputStream, str);
                C1877d.t(outputStream, this.f41804d);
                C1877d.t(outputStream, this.f41805e);
                C1877d.t(outputStream, this.f41806f);
                C1877d.t(outputStream, this.f41807g);
                C1877d.r(this.f41808h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e9) {
                v.b("%s", e9.toString());
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: i1.d$c */
    public static class c extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f41809a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f41810c;

        public c(InputStream inputStream, long j9) {
            super(inputStream);
            this.f41809a = j9;
        }

        public long a() {
            return this.f41809a - this.f41810c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i9 = super.read();
            if (i9 != -1) {
                this.f41810c++;
            }
            return i9;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i9, int i10) throws IOException {
            int i11 = super.read(bArr, i9, i10);
            if (i11 != -1) {
                this.f41810c += (long) i11;
            }
            return i11;
        }
    }

    /* JADX INFO: renamed from: i1.d$d, reason: collision with other inner class name */
    public interface InterfaceC0345d {
        File get();
    }

    public C1877d(File file, int i9) {
        this.f41797c = new a(file);
        this.f41798d = i9;
    }

    public static int j(InputStream inputStream) throws IOException {
        int i9 = inputStream.read();
        if (i9 != -1) {
            return i9;
        }
        throw new EOFException();
    }

    public static List k(c cVar) throws IOException {
        int iL = l(cVar);
        if (iL < 0) {
            throw new IOException("readHeaderList size=" + iL);
        }
        List listEmptyList = iL == 0 ? Collections.emptyList() : new ArrayList();
        for (int i9 = 0; i9 < iL; i9++) {
            listEmptyList.add(new h1.g(n(cVar).intern(), n(cVar).intern()));
        }
        return listEmptyList;
    }

    public static int l(InputStream inputStream) {
        return (j(inputStream) << 24) | j(inputStream) | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    public static long m(InputStream inputStream) {
        return (((long) j(inputStream)) & 255) | ((((long) j(inputStream)) & 255) << 8) | ((((long) j(inputStream)) & 255) << 16) | ((((long) j(inputStream)) & 255) << 24) | ((((long) j(inputStream)) & 255) << 32) | ((((long) j(inputStream)) & 255) << 40) | ((((long) j(inputStream)) & 255) << 48) | ((255 & ((long) j(inputStream))) << 56);
    }

    public static String n(c cVar) {
        return new String(q(cVar, m(cVar)), "UTF-8");
    }

    public static byte[] q(c cVar, long j9) throws IOException {
        long jA = cVar.a();
        if (j9 >= 0 && j9 <= jA) {
            int i9 = (int) j9;
            if (i9 == j9) {
                byte[] bArr = new byte[i9];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j9 + ", maxLength=" + jA);
    }

    public static void r(List list, OutputStream outputStream) throws IOException {
        if (list == null) {
            s(outputStream, 0);
            return;
        }
        s(outputStream, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h1.g gVar = (h1.g) it.next();
            u(outputStream, gVar.a());
            u(outputStream, gVar.b());
        }
    }

    public static void s(OutputStream outputStream, int i9) throws IOException {
        outputStream.write(i9 & 255);
        outputStream.write((i9 >> 8) & 255);
        outputStream.write((i9 >> 16) & 255);
        outputStream.write((i9 >> 24) & 255);
    }

    public static void t(OutputStream outputStream, long j9) throws IOException {
        outputStream.write((byte) j9);
        outputStream.write((byte) (j9 >>> 8));
        outputStream.write((byte) (j9 >>> 16));
        outputStream.write((byte) (j9 >>> 24));
        outputStream.write((byte) (j9 >>> 32));
        outputStream.write((byte) (j9 >>> 40));
        outputStream.write((byte) (j9 >>> 48));
        outputStream.write((byte) (j9 >>> 56));
    }

    public static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // h1.InterfaceC1847b
    public synchronized void a(String str, boolean z9) {
        try {
            InterfaceC1847b.a aVar = get(str);
            if (aVar != null) {
                aVar.f41511f = 0L;
                if (z9) {
                    aVar.f41510e = 0L;
                }
                b(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h1.InterfaceC1847b
    public synchronized void b(String str, InterfaceC1847b.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long length = this.f41796b + ((long) aVar.f41506a.length);
        int i9 = this.f41798d;
        if (length <= i9 || r4.length <= i9 * 0.9f) {
            File fileE = e(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(d(fileE));
                bVar = new b(str, aVar);
            } catch (IOException unused) {
                if (!fileE.delete()) {
                    v.b("Could not clean up file %s", fileE.getAbsolutePath());
                }
                g();
            }
            if (!bVar.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                v.b("Failed to write header for %s", fileE.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f41506a);
            bufferedOutputStream.close();
            bVar.f41801a = fileE.length();
            i(str, bVar);
            h();
        }
    }

    public InputStream c(File file) {
        return new FileInputStream(file);
    }

    public OutputStream d(File file) {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.f41797c.get(), f(str));
    }

    public final String f(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    public final void g() {
        if (this.f41797c.get().exists()) {
            return;
        }
        v.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f41795a.clear();
        this.f41796b = 0L;
        initialize();
    }

    @Override // h1.InterfaceC1847b
    public synchronized InterfaceC1847b.a get(String str) {
        b bVar = (b) this.f41795a.get(str);
        if (bVar == null) {
            return null;
        }
        File fileE = e(str);
        try {
            c cVar = new c(new BufferedInputStream(c(fileE)), fileE.length());
            try {
                b bVarB = b.b(cVar);
                if (TextUtils.equals(str, bVarB.f41802b)) {
                    return bVar.c(q(cVar, cVar.a()));
                }
                v.b("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, bVarB.f41802b);
                p(str);
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e9) {
            v.b("%s: %s", fileE.getAbsolutePath(), e9.toString());
            o(str);
            return null;
        }
    }

    public final void h() {
        if (this.f41796b < this.f41798d) {
            return;
        }
        if (v.f41583b) {
            v.e("Pruning old cache entries.", new Object[0]);
        }
        long j9 = this.f41796b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f41795a.entrySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            if (e(bVar.f41802b).delete()) {
                this.f41796b -= bVar.f41801a;
            } else {
                String str = bVar.f41802b;
                v.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it.remove();
            i9++;
            if (this.f41796b < this.f41798d * 0.9f) {
                break;
            }
        }
        if (v.f41583b) {
            v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.f41796b - j9), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final void i(String str, b bVar) {
        if (this.f41795a.containsKey(str)) {
            this.f41796b += bVar.f41801a - ((b) this.f41795a.get(str)).f41801a;
        } else {
            this.f41796b += bVar.f41801a;
        }
        this.f41795a.put(str, bVar);
    }

    @Override // h1.InterfaceC1847b
    public synchronized void initialize() {
        long length;
        c cVar;
        synchronized (this) {
            File file = this.f41797c.get();
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    v.c("Unable to create cache dir %s", file.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    length = file2.length();
                    cVar = new c(new BufferedInputStream(c(file2)), length);
                } catch (IOException unused) {
                    file2.delete();
                }
                try {
                    b bVarB = b.b(cVar);
                    bVarB.f41801a = length;
                    i(bVarB.f41802b, bVarB);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            }
        }
    }

    public synchronized void o(String str) {
        boolean zDelete = e(str).delete();
        p(str);
        if (!zDelete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    public final void p(String str) {
        b bVar = (b) this.f41795a.remove(str);
        if (bVar != null) {
            this.f41796b -= bVar.f41801a;
        }
    }
}

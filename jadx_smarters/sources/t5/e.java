package T5;

import O5.C0946j;
import O5.r;
import Q5.B;
import Q5.C;
import R5.h;
import V5.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f9545e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9546f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f9547g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f9548h = new Comparator() { // from class: T5.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.u((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FilenameFilter f9549i = new FilenameFilter() { // from class: T5.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return e.v(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f9550a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f9552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0946j f9553d;

    public e(f fVar, i iVar, C0946j c0946j) {
        this.f9551b = fVar;
        this.f9552c = iVar;
        this.f9553d = c0946j;
    }

    public static String A(File file) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f9545e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i9);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static String F(File file) {
        try {
            return A(file);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void G(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f9545e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void H(File file, String str, long j9) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f9545e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j9));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List list, int i9) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i9) {
                return size;
            }
            f.s(file);
            size--;
        }
        return size;
    }

    public static long h(long j9) {
        return j9 * 1000;
    }

    public static String m(int i9, boolean z9) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i9)) + (z9 ? "_" : "");
    }

    public static String o(String str) {
        return str.substring(0, f9546f);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public final void B(File file, B.d dVar, String str, B.a aVar) {
        try {
            h hVar = f9547g;
            G(this.f9551b.g(str), hVar.G(hVar.F(A(file)).r(dVar).o(aVar)));
        } catch (IOException e9) {
            L5.f.f().l("Could not synthesize final native report file for " + file, e9);
        }
    }

    public final void C(String str, long j9) {
        boolean z9;
        List<File> listP = this.f9551b.p(str, f9549i);
        if (listP.isEmpty()) {
            L5.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listP);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z9 = false;
            for (File file : listP) {
                try {
                    arrayList.add(f9547g.h(A(file)));
                } catch (IOException e9) {
                    L5.f.f().l("Could not add event to report for " + file, e9);
                }
                if (z9 || s(file.getName())) {
                    z9 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f9551b.o(str, "report"), arrayList, j9, z9, P5.h.g(str, this.f9551b), F(this.f9551b.o(str, "app-quality-session-id")));
        } else {
            L5.f.f().k("Could not parse event files for session " + str);
        }
    }

    public final void D(File file, List list, long j9, boolean z9, String str, String str2) {
        try {
            h hVar = f9547g;
            B bP = hVar.F(A(file)).s(j9, z9, str).n(str2).p(C.a(list));
            B.e eVarL = bP.l();
            if (eVarL == null) {
                return;
            }
            L5.f.f().b("appQualitySessionId: " + str2);
            G(z9 ? this.f9551b.j(eVarL.i()) : this.f9551b.l(eVarL.i()), hVar.G(bP));
        } catch (IOException e9) {
            L5.f.f().l("Could not synthesize final report file for " + file, e9);
        }
    }

    public final int E(String str, int i9) {
        List listP = this.f9551b.p(str, new FilenameFilter() { // from class: T5.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listP, new Comparator() { // from class: T5.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.x((File) obj, (File) obj2);
            }
        });
        return f(listP, i9);
    }

    public final SortedSet e(String str) {
        this.f9551b.b();
        SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() <= 8) {
            return sortedSetP;
        }
        while (sortedSetP.size() > 8) {
            String str2 = (String) sortedSetP.last();
            L5.f.f().b("Removing session over cap: " + str2);
            this.f9551b.c(str2);
            sortedSetP.remove(str2);
        }
        return sortedSetP;
    }

    public final void g() {
        int i9 = this.f9552c.b().f10069a.f10081b;
        List listN = n();
        int size = listN.size();
        if (size <= i9) {
            return;
        }
        Iterator it = listN.subList(i9, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void i() {
        j(this.f9551b.m());
        j(this.f9551b.k());
        j(this.f9551b.h());
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void k(String str, long j9) {
        for (String str2 : e(str)) {
            L5.f.f().i("Finalizing report for session " + str2);
            C(str2, j9);
            this.f9551b.c(str2);
        }
        g();
    }

    public void l(String str, B.d dVar, B.a aVar) {
        File fileO = this.f9551b.o(str, "report");
        L5.f.f().b("Writing native session report for " + str + " to file: " + fileO);
        B(fileO, dVar, str, aVar);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9551b.k());
        arrayList.addAll(this.f9551b.h());
        Comparator comparator = f9548h;
        Collections.sort(arrayList, comparator);
        List listM = this.f9551b.m();
        Collections.sort(listM, comparator);
        arrayList.addAll(listM);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet(this.f9551b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f9551b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f9551b.m().isEmpty() && this.f9551b.k().isEmpty() && this.f9551b.h().isEmpty()) ? false : true;
    }

    public List w() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(r.a(f9547g.F(A(file)), file.getName(), file));
            } catch (IOException e9) {
                L5.f.f().l("Could not load report file " + file + "; deleting", e9);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(B.e.d dVar, String str, boolean z9) {
        int i9 = this.f9552c.b().f10069a.f10080a;
        try {
            G(this.f9551b.o(str, m(this.f9550a.getAndIncrement(), z9)), f9547g.i(dVar));
            String strD = this.f9553d.d();
            if (strD == null) {
                L5.f.f().k("Missing AQS session id for Crashlytics session " + str);
            } else {
                G(this.f9551b.o(str, "app-quality-session-id"), strD);
            }
        } catch (IOException e9) {
            L5.f.f().l("Could not persist event for session " + str, e9);
        }
        E(str, i9);
    }

    public void z(B b9) {
        B.e eVarL = b9.l();
        if (eVarL == null) {
            L5.f.f().b("Could not get session for report");
            return;
        }
        String strI = eVarL.i();
        try {
            G(this.f9551b.o(strI, "report"), f9547g.G(b9));
            H(this.f9551b.o(strI, "start-time"), "", eVarL.l());
        } catch (IOException e9) {
            L5.f.f().c("Could not persist report for session " + strI, e9);
        }
    }
}

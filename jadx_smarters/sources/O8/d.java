package O8;

import O8.c;
import P8.i;
import android.content.Context;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f6720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.b f6721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f6722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6724e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f6725a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f6726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f6727d;

        public a(Context context, String str, String str2, c.InterfaceC0077c interfaceC0077c) {
            this.f6725a = context;
            this.f6726c = str;
            this.f6727d = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                O8.d r1 = O8.d.this     // Catch: O8.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f6725a     // Catch: O8.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f6726c     // Catch: O8.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f6727d     // Catch: O8.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                O8.d.a(r1, r2, r3, r4)     // Catch: O8.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: O8.d.a.run():void");
        }
    }

    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6729a;

        public b(String str) {
            this.f6729a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f6729a);
        }
    }

    public d() {
        this(new e(), new O8.a());
    }

    public d(c.b bVar, c.a aVar) {
        this.f6720a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f6721b = bVar;
        this.f6722c = aVar;
    }

    public void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f6721b.a(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f6723d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String strA = this.f6721b.a(str);
        if (f.a(str2)) {
            return new File(c(context), strA);
        }
        return new File(c(context), strA + InstructionFileId.DOT + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0077c interfaceC0077c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0077c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0077c)).start();
        }
    }

    public final void g(Context context, String str, String str2) throws Throwable {
        if (this.f6720a.contains(str) && !this.f6723d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f6721b.loadLibrary(str);
            this.f6720a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e9) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e9));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f6723d) {
                if (this.f6723d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f6722c.a(context, this.f6721b.c(), this.f6721b.a(str), fileD, this);
            }
            try {
                if (this.f6724e) {
                    i iVar = null;
                    try {
                        i iVar2 = new i(fileD);
                        try {
                            List listD = iVar2.d();
                            iVar2.close();
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                e(context, this.f6721b.b((String) it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            iVar.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.f6721b.d(fileD.getAbsolutePath());
            this.f6720a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    public void h(String str) {
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }
}

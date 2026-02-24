package Z1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f10873b;

    public static class a implements T1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T1.c f10874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T1.c f10875b;

        public a(T1.c cVar, T1.c cVar2) {
            this.f10874a = cVar;
            this.f10875b = cVar2;
        }

        @Override // T1.c
        public void a() {
            T1.c cVar = this.f10874a;
            if (cVar != null) {
                cVar.a();
            }
            T1.c cVar2 = this.f10875b;
            if (cVar2 != null) {
                cVar2.a();
            }
        }

        @Override // T1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(O1.i iVar) throws Exception {
            InputStream inputStream;
            T1.c cVar = this.f10874a;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (cVar != null) {
                try {
                    inputStream = (InputStream) cVar.b(iVar);
                } catch (Exception e9) {
                    if (Log.isLoggable("IVML", 2)) {
                        Log.v("IVML", "Exception fetching input stream, trying ParcelFileDescriptor", e9);
                    }
                    if (this.f10875b == null) {
                        throw e9;
                    }
                    inputStream = null;
                }
            } else {
                inputStream = null;
            }
            T1.c cVar2 = this.f10875b;
            if (cVar2 != null) {
                try {
                    parcelFileDescriptor = (ParcelFileDescriptor) cVar2.b(iVar);
                } catch (Exception e10) {
                    if (Log.isLoggable("IVML", 2)) {
                        Log.v("IVML", "Exception fetching ParcelFileDescriptor", e10);
                    }
                    if (inputStream == null) {
                        throw e10;
                    }
                }
            }
            return new g(inputStream, parcelFileDescriptor);
        }

        @Override // T1.c
        public void cancel() {
            T1.c cVar = this.f10874a;
            if (cVar != null) {
                cVar.cancel();
            }
            T1.c cVar2 = this.f10875b;
            if (cVar2 != null) {
                cVar2.cancel();
            }
        }

        @Override // T1.c
        public String getId() {
            T1.c cVar = this.f10874a;
            return cVar != null ? cVar.getId() : this.f10875b.getId();
        }
    }

    public f(l lVar, l lVar2) {
        if (lVar == null && lVar2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f10872a = lVar;
        this.f10873b = lVar2;
    }

    @Override // Z1.l
    public T1.c a(Object obj, int i9, int i10) {
        l lVar = this.f10872a;
        T1.c cVarA = lVar != null ? lVar.a(obj, i9, i10) : null;
        l lVar2 = this.f10873b;
        T1.c cVarA2 = lVar2 != null ? lVar2.a(obj, i9, i10) : null;
        if (cVarA == null && cVarA2 == null) {
            return null;
        }
        return new a(cVarA, cVarA2);
    }
}

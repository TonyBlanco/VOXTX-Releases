package H3;

import android.net.Uri;
import d4.AbstractC1684a;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2424a;

    public class a extends LinkedHashMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i9, float f9, boolean z9, int i10) {
            super(i9, f9, z9);
            this.f2425a = i10;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f2425a;
        }
    }

    public e(int i9) {
        this.f2424a = new a(i9 + 1, 1.0f, false, i9);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f2424a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f2424a.put((Uri) AbstractC1684a.e(uri), (byte[]) AbstractC1684a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f2424a.remove(AbstractC1684a.e(uri));
    }
}

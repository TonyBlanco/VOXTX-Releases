package v3;

import O2.C0936z0;
import O2.R0;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements C2540a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51316a;

    public i(String str) {
        this.f51316a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // q3.C2540a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return AbstractC2541b.a(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ C0936z0 getWrappedMetadataFormat() {
        return AbstractC2541b.b(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return this.f51316a;
    }
}

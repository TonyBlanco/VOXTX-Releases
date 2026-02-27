package U1;

import i2.InterfaceC1881c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class f implements S1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1.e f9647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S1.e f9648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S1.g f9649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S1.f f9650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1881c f9651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S1.b f9652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final S1.c f9653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f9654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S1.c f9656m;

    public f(String str, S1.c cVar, int i9, int i10, S1.e eVar, S1.e eVar2, S1.g gVar, S1.f fVar, InterfaceC1881c interfaceC1881c, S1.b bVar) {
        this.f9644a = str;
        this.f9653j = cVar;
        this.f9645b = i9;
        this.f9646c = i10;
        this.f9647d = eVar;
        this.f9648e = eVar2;
        this.f9649f = gVar;
        this.f9650g = fVar;
        this.f9651h = interfaceC1881c;
        this.f9652i = bVar;
    }

    @Override // S1.c
    public void a(MessageDigest messageDigest) {
        byte[] bArrArray = ByteBuffer.allocate(8).putInt(this.f9645b).putInt(this.f9646c).array();
        this.f9653j.a(messageDigest);
        messageDigest.update(this.f9644a.getBytes("UTF-8"));
        messageDigest.update(bArrArray);
        S1.e eVar = this.f9647d;
        messageDigest.update((eVar != null ? eVar.getId() : "").getBytes("UTF-8"));
        S1.e eVar2 = this.f9648e;
        messageDigest.update((eVar2 != null ? eVar2.getId() : "").getBytes("UTF-8"));
        S1.g gVar = this.f9649f;
        messageDigest.update((gVar != null ? gVar.getId() : "").getBytes("UTF-8"));
        S1.f fVar = this.f9650g;
        messageDigest.update((fVar != null ? fVar.getId() : "").getBytes("UTF-8"));
        S1.b bVar = this.f9652i;
        messageDigest.update((bVar != null ? bVar.getId() : "").getBytes("UTF-8"));
    }

    public S1.c b() {
        if (this.f9656m == null) {
            this.f9656m = new k(this.f9644a, this.f9653j);
        }
        return this.f9656m;
    }

    @Override // S1.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f9644a.equals(fVar.f9644a) || !this.f9653j.equals(fVar.f9653j) || this.f9646c != fVar.f9646c || this.f9645b != fVar.f9645b) {
            return false;
        }
        S1.g gVar = this.f9649f;
        if ((gVar == null) ^ (fVar.f9649f == null)) {
            return false;
        }
        if (gVar != null && !gVar.getId().equals(fVar.f9649f.getId())) {
            return false;
        }
        S1.e eVar = this.f9648e;
        if ((eVar == null) ^ (fVar.f9648e == null)) {
            return false;
        }
        if (eVar != null && !eVar.getId().equals(fVar.f9648e.getId())) {
            return false;
        }
        S1.e eVar2 = this.f9647d;
        if ((eVar2 == null) ^ (fVar.f9647d == null)) {
            return false;
        }
        if (eVar2 != null && !eVar2.getId().equals(fVar.f9647d.getId())) {
            return false;
        }
        S1.f fVar2 = this.f9650g;
        if ((fVar2 == null) ^ (fVar.f9650g == null)) {
            return false;
        }
        if (fVar2 != null && !fVar2.getId().equals(fVar.f9650g.getId())) {
            return false;
        }
        InterfaceC1881c interfaceC1881c = this.f9651h;
        if ((interfaceC1881c == null) ^ (fVar.f9651h == null)) {
            return false;
        }
        if (interfaceC1881c != null && !interfaceC1881c.getId().equals(fVar.f9651h.getId())) {
            return false;
        }
        S1.b bVar = this.f9652i;
        if ((bVar == null) ^ (fVar.f9652i == null)) {
            return false;
        }
        return bVar == null || bVar.getId().equals(fVar.f9652i.getId());
    }

    @Override // S1.c
    public int hashCode() {
        if (this.f9655l == 0) {
            int iHashCode = this.f9644a.hashCode();
            this.f9655l = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f9653j.hashCode()) * 31) + this.f9645b) * 31) + this.f9646c;
            this.f9655l = iHashCode2;
            int i9 = iHashCode2 * 31;
            S1.e eVar = this.f9647d;
            int iHashCode3 = i9 + (eVar != null ? eVar.getId().hashCode() : 0);
            this.f9655l = iHashCode3;
            int i10 = iHashCode3 * 31;
            S1.e eVar2 = this.f9648e;
            int iHashCode4 = i10 + (eVar2 != null ? eVar2.getId().hashCode() : 0);
            this.f9655l = iHashCode4;
            int i11 = iHashCode4 * 31;
            S1.g gVar = this.f9649f;
            int iHashCode5 = i11 + (gVar != null ? gVar.getId().hashCode() : 0);
            this.f9655l = iHashCode5;
            int i12 = iHashCode5 * 31;
            S1.f fVar = this.f9650g;
            int iHashCode6 = i12 + (fVar != null ? fVar.getId().hashCode() : 0);
            this.f9655l = iHashCode6;
            int i13 = iHashCode6 * 31;
            InterfaceC1881c interfaceC1881c = this.f9651h;
            int iHashCode7 = i13 + (interfaceC1881c != null ? interfaceC1881c.getId().hashCode() : 0);
            this.f9655l = iHashCode7;
            int i14 = iHashCode7 * 31;
            S1.b bVar = this.f9652i;
            this.f9655l = i14 + (bVar != null ? bVar.getId().hashCode() : 0);
        }
        return this.f9655l;
    }

    public String toString() {
        if (this.f9654k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineKey{");
            sb.append(this.f9644a);
            sb.append('+');
            sb.append(this.f9653j);
            sb.append("+[");
            sb.append(this.f9645b);
            sb.append('x');
            sb.append(this.f9646c);
            sb.append("]+");
            sb.append('\'');
            S1.e eVar = this.f9647d;
            sb.append(eVar != null ? eVar.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            S1.e eVar2 = this.f9648e;
            sb.append(eVar2 != null ? eVar2.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            S1.g gVar = this.f9649f;
            sb.append(gVar != null ? gVar.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            S1.f fVar = this.f9650g;
            sb.append(fVar != null ? fVar.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            InterfaceC1881c interfaceC1881c = this.f9651h;
            sb.append(interfaceC1881c != null ? interfaceC1881c.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            S1.b bVar = this.f9652i;
            sb.append(bVar != null ? bVar.getId() : "");
            sb.append('\'');
            sb.append('}');
            this.f9654k = sb.toString();
        }
        return this.f9654k;
    }
}

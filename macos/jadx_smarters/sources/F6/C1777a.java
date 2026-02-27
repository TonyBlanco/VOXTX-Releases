package f6;

import f6.InterfaceC1780d;

/* JADX INFO: renamed from: f6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1777a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1780d.a f40832b = InterfaceC1780d.a.DEFAULT;

    /* JADX INFO: renamed from: f6.a$a, reason: collision with other inner class name */
    public static final class C0328a implements InterfaceC1780d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1780d.a f40834b;

        public C0328a(int i9, InterfaceC1780d.a aVar) {
            this.f40833a = i9;
            this.f40834b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC1780d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC1780d)) {
                return false;
            }
            InterfaceC1780d interfaceC1780d = (InterfaceC1780d) obj;
            return this.f40833a == interfaceC1780d.tag() && this.f40834b.equals(interfaceC1780d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f40833a) + (this.f40834b.hashCode() ^ 2041407134);
        }

        @Override // f6.InterfaceC1780d
        public InterfaceC1780d.a intEncoding() {
            return this.f40834b;
        }

        @Override // f6.InterfaceC1780d
        public int tag() {
            return this.f40833a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f40833a + "intEncoding=" + this.f40834b + ')';
        }
    }

    public static C1777a b() {
        return new C1777a();
    }

    public InterfaceC1780d a() {
        return new C0328a(this.f40831a, this.f40832b);
    }

    public C1777a c(int i9) {
        this.f40831a = i9;
        return this;
    }
}

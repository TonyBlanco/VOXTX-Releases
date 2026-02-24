package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class an extends bx {
    private final int major;
    private final int micro;
    private final int minor;

    public an(int i9, int i10, int i11) {
        this.major = i9;
        this.minor = i10;
        this.micro = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bx) {
            bx bxVar = (bx) obj;
            if (this.major == bxVar.major() && this.minor == bxVar.minor() && this.micro == bxVar.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003) ^ this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bx
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bx
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bx
    public int minor() {
        return this.minor;
    }

    public String toString() {
        return "SecureSignalsVersionData{major=" + this.major + ", minor=" + this.minor + ", micro=" + this.micro + "}";
    }
}

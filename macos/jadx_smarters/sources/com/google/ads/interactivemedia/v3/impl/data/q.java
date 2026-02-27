package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class q extends ay {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private q(int i9, int i10, int i11, int i12) {
        this.left = i9;
        this.top = i10;
        this.height = i11;
        this.width = i12;
    }

    public /* synthetic */ q(int i9, int i10, int i11, int i12, p pVar) {
        this(i9, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ay) {
            ay ayVar = (ay) obj;
            if (this.left == ayVar.left() && this.top == ayVar.top() && this.height == ayVar.height() && this.width == ayVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int left() {
        return this.left;
    }

    public String toString() {
        return "BoundingRectData{left=" + this.left + ", top=" + this.top + ", height=" + this.height + ", width=" + this.width + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int width() {
        return this.width;
    }
}

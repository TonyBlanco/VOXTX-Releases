package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class o extends ax {
    private int height;
    private int left;
    private byte set$0;
    private int top;
    private int width;

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ay build() {
        if (this.set$0 == 15) {
            return new q(this.left, this.top, this.height, this.width, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb.append(" left");
        }
        if ((this.set$0 & 2) == 0) {
            sb.append(" top");
        }
        if ((this.set$0 & 4) == 0) {
            sb.append(" height");
        }
        if ((this.set$0 & 8) == 0) {
            sb.append(" width");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax height(int i9) {
        this.height = i9;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax left(int i9) {
        this.left = i9;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax top(int i9) {
        this.top = i9;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax width(int i9) {
        this.width = i9;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }
}

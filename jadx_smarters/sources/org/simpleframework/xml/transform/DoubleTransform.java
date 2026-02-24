package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes4.dex */
class DoubleTransform implements Transform<Double> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Double read(String str) {
        return Double.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Double d9) {
        return d9.toString();
    }
}

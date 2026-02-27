package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes4.dex */
class DefaultMatcher implements Matcher {
    private Matcher matcher;
    private Matcher primitive = new PrimitiveMatcher();
    private Matcher stock = new PackageMatcher();
    private Matcher array = new ArrayMatcher(this);

    public DefaultMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    private Transform matchType(Class cls) throws Exception {
        return (cls.isArray() ? this.array : cls.isPrimitive() ? this.primitive : this.stock).match(cls);
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) throws Exception {
        Transform transformMatch = this.matcher.match(cls);
        return transformMatch != null ? transformMatch : matchType(cls);
    }
}

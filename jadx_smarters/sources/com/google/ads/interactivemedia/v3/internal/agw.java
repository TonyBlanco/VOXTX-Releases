package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum agw {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f19737j;

    agw(String str) {
        this.f19737j = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f19737j;
    }
}

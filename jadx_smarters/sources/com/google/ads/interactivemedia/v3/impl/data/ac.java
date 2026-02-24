package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class ac extends bo {
    private final String message;
    private final String name;

    public ac(String str, String str2) {
        this.name = str;
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bo) {
            bo boVar = (bo) obj;
            String str = this.name;
            if (str != null ? str.equals(boVar.name()) : boVar.name() == null) {
                String str2 = this.message;
                String strMessage = boVar.message();
                if (str2 != null ? str2.equals(strMessage) : strMessage == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.message;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bo
    public String message() {
        return this.message;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bo
    public String name() {
        return this.name;
    }

    public String toString() {
        return "LoggableException{name=" + this.name + ", message=" + this.message + "}";
    }
}

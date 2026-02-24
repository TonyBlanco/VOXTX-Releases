package com.google.ads.interactivemedia.v3.internal;

import org.apache.http.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
final class act {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f18991a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18992b = 0;

    public static an a(cj cjVar) {
        String str;
        String str2;
        int iC = cjVar.c() + cjVar.e();
        int iE = cjVar.e();
        int i9 = (iE >> 24) & 255;
        an aauVar = null;
        try {
            if (i9 == 169 || i9 == 253) {
                int i10 = 16777215 & iE;
                if (i10 == 6516084) {
                    int iE2 = cjVar.e();
                    if (cjVar.e() == 1684108385) {
                        cjVar.G(8);
                        String strT = cjVar.t(iE2 - 16);
                        aauVar = new aau("und", strT, strT);
                    } else {
                        cd.e("MetadataUtil", "Failed to parse comment attribute: ".concat(String.valueOf(ace.g(iE))));
                    }
                    cjVar.F(iC);
                    return aauVar;
                }
                if (i10 == 7233901 || i10 == 7631467) {
                    abe abeVarE = e(iE, "TIT2", cjVar);
                    cjVar.F(iC);
                    return abeVarE;
                }
                if (i10 == 6516589 || i10 == 7828084) {
                    abe abeVarE2 = e(iE, "TCOM", cjVar);
                    cjVar.F(iC);
                    return abeVarE2;
                }
                if (i10 == 6578553) {
                    abe abeVarE3 = e(iE, "TDRC", cjVar);
                    cjVar.F(iC);
                    return abeVarE3;
                }
                if (i10 == 4280916) {
                    abe abeVarE4 = e(iE, "TPE1", cjVar);
                    cjVar.F(iC);
                    return abeVarE4;
                }
                if (i10 == 7630703) {
                    abe abeVarE5 = e(iE, "TSSE", cjVar);
                    cjVar.F(iC);
                    return abeVarE5;
                }
                if (i10 == 6384738) {
                    abe abeVarE6 = e(iE, "TALB", cjVar);
                    cjVar.F(iC);
                    return abeVarE6;
                }
                if (i10 == 7108978) {
                    abe abeVarE7 = e(iE, "USLT", cjVar);
                    cjVar.F(iC);
                    return abeVarE7;
                }
                if (i10 == 6776174) {
                    abe abeVarE8 = e(iE, "TCON", cjVar);
                    cjVar.F(iC);
                    return abeVarE8;
                }
                if (i10 == 6779504) {
                    abe abeVarE9 = e(iE, "TIT1", cjVar);
                    cjVar.F(iC);
                    return abeVarE9;
                }
            } else {
                if (iE == 1735291493) {
                    int iB = b(cjVar);
                    String str3 = (iB <= 0 || iB > 192) ? null : f18991a[iB - 1];
                    if (str3 != null) {
                        aauVar = new abe("TCON", null, str3);
                    } else {
                        cd.e("MetadataUtil", "Failed to parse standard genre code");
                    }
                    cjVar.F(iC);
                    return aauVar;
                }
                if (iE == 1684632427) {
                    abe abeVarD = d(1684632427, "TPOS", cjVar);
                    cjVar.F(iC);
                    return abeVarD;
                }
                if (iE == 1953655662) {
                    abe abeVarD2 = d(1953655662, "TRCK", cjVar);
                    cjVar.F(iC);
                    return abeVarD2;
                }
                if (iE == 1953329263) {
                    aba abaVarC = c(1953329263, "TBPM", cjVar, true, false);
                    cjVar.F(iC);
                    return abaVarC;
                }
                if (iE == 1668311404) {
                    aba abaVarC2 = c(1668311404, "TCMP", cjVar, true, true);
                    cjVar.F(iC);
                    return abaVarC2;
                }
                if (iE == 1668249202) {
                    int iE3 = cjVar.e();
                    if (cjVar.e() == 1684108385) {
                        int iE4 = ace.e(cjVar.e());
                        if (iE4 == 13) {
                            str2 = "image/jpeg";
                        } else if (iE4 == 14) {
                            str2 = "image/png";
                            iE4 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            cjVar.G(4);
                            int i11 = iE3 - 16;
                            byte[] bArr = new byte[i11];
                            cjVar.A(bArr, 0, i11);
                            aauVar = new aap(str2, null, 3, bArr);
                            cjVar.F(iC);
                            return aauVar;
                        }
                        str = "Unrecognized cover art flags: " + iE4;
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    cd.e("MetadataUtil", str);
                    cjVar.F(iC);
                    return aauVar;
                }
                if (iE == 1631670868) {
                    abe abeVarE10 = e(1631670868, "TPE2", cjVar);
                    cjVar.F(iC);
                    return abeVarE10;
                }
                if (iE == 1936682605) {
                    abe abeVarE11 = e(1936682605, "TSOT", cjVar);
                    cjVar.F(iC);
                    return abeVarE11;
                }
                if (iE == 1936679276) {
                    abe abeVarE12 = e(1936679276, "TSO2", cjVar);
                    cjVar.F(iC);
                    return abeVarE12;
                }
                if (iE == 1936679282) {
                    abe abeVarE13 = e(1936679282, "TSOA", cjVar);
                    cjVar.F(iC);
                    return abeVarE13;
                }
                if (iE == 1936679265) {
                    abe abeVarE14 = e(1936679265, "TSOP", cjVar);
                    cjVar.F(iC);
                    return abeVarE14;
                }
                if (iE == 1936679791) {
                    abe abeVarE15 = e(1936679791, "TSOC", cjVar);
                    cjVar.F(iC);
                    return abeVarE15;
                }
                if (iE == 1920233063) {
                    aba abaVarC3 = c(1920233063, "ITUNESADVISORY", cjVar, false, false);
                    cjVar.F(iC);
                    return abaVarC3;
                }
                if (iE == 1885823344) {
                    aba abaVarC4 = c(1885823344, "ITUNESGAPLESS", cjVar, false, true);
                    cjVar.F(iC);
                    return abaVarC4;
                }
                if (iE == 1936683886) {
                    abe abeVarE16 = e(1936683886, "TVSHOWSORT", cjVar);
                    cjVar.F(iC);
                    return abeVarE16;
                }
                if (iE == 1953919848) {
                    abe abeVarE17 = e(1953919848, "TVSHOW", cjVar);
                    cjVar.F(iC);
                    return abeVarE17;
                }
                if (iE == 757935405) {
                    String strT2 = null;
                    String strT3 = null;
                    int i12 = -1;
                    int i13 = -1;
                    while (cjVar.c() < iC) {
                        int iC2 = cjVar.c();
                        int iE5 = cjVar.e();
                        int iE6 = cjVar.e();
                        cjVar.G(4);
                        if (iE6 == 1835360622) {
                            strT2 = cjVar.t(iE5 - 12);
                        } else if (iE6 == 1851878757) {
                            strT3 = cjVar.t(iE5 - 12);
                        } else {
                            if (iE6 == 1684108385) {
                                i13 = iE5;
                            }
                            if (iE6 == 1684108385) {
                                i12 = iC2;
                            }
                            cjVar.G(iE5 - 12);
                        }
                    }
                    if (strT2 != null && strT3 != null && i12 != -1) {
                        cjVar.F(i12);
                        cjVar.G(16);
                        aauVar = new abb(strT2, strT3, cjVar.t(i13 - 16));
                    }
                    return aauVar;
                }
            }
            cd.a("MetadataUtil", "Skipped unknown metadata entry: " + ace.g(iE));
            cjVar.F(iC);
            return null;
        } finally {
            cjVar.F(iC);
        }
    }

    private static int b(cj cjVar) {
        cjVar.G(4);
        if (cjVar.e() == 1684108385) {
            cjVar.G(8);
            return cjVar.i();
        }
        cd.e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static aba c(int i9, String str, cj cjVar, boolean z9, boolean z10) {
        int iB = b(cjVar);
        if (z10) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z9 ? new abe(str, null, Integer.toString(iB)) : new aau("und", str, Integer.toString(iB));
        }
        cd.e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(String.valueOf(ace.g(i9))));
        return null;
    }

    private static abe d(int i9, String str, cj cjVar) {
        int iE = cjVar.e();
        if (cjVar.e() == 1684108385 && iE >= 22) {
            cjVar.G(10);
            int iM = cjVar.m();
            if (iM > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iM);
                String string = sb.toString();
                int iM2 = cjVar.m();
                if (iM2 > 0) {
                    string = string + "/" + iM2;
                }
                return new abe(str, null, string);
            }
        }
        cd.e("MetadataUtil", "Failed to parse index/count attribute: ".concat(String.valueOf(ace.g(i9))));
        return null;
    }

    private static abe e(int i9, String str, cj cjVar) {
        int iE = cjVar.e();
        if (cjVar.e() == 1684108385) {
            cjVar.G(8);
            return new abe(str, null, cjVar.t(iE - 16));
        }
        cd.e("MetadataUtil", "Failed to parse text attribute: ".concat(String.valueOf(ace.g(i9))));
        return null;
    }
}

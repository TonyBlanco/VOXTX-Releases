package l3;

import O2.C0936z0;
import d4.AbstractC1681B;
import d4.M;
import org.apache.http.HttpHeaders;
import q3.C2540a;
import s5.AbstractC2743y;
import v3.C2874a;
import w3.C2907a;

/* JADX INFO: renamed from: l3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2183h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f43988a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static v3.e a(int i9, M m9) {
        int iQ = m9.q();
        if (m9.q() == 1684108385) {
            m9.V(8);
            String strC = m9.C(iQ - 16);
            return new v3.e("und", strC, strC);
        }
        AbstractC1681B.j("MetadataUtil", "Failed to parse comment attribute: " + AbstractC2176a.a(i9));
        return null;
    }

    public static C2874a b(M m9) {
        String str;
        int iQ = m9.q();
        if (m9.q() == 1684108385) {
            int iB = AbstractC2176a.b(m9.q());
            String str2 = iB == 13 ? "image/jpeg" : iB == 14 ? "image/png" : null;
            if (str2 != null) {
                m9.V(4);
                int i9 = iQ - 16;
                byte[] bArr = new byte[i9];
                m9.l(bArr, 0, i9);
                return new C2874a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + iB;
        } else {
            str = "Failed to parse cover art attribute";
        }
        AbstractC1681B.j("MetadataUtil", str);
        return null;
    }

    public static C2540a.b c(M m9) {
        int iF = m9.f() + m9.q();
        int iQ = m9.q();
        int i9 = (iQ >> 24) & 255;
        try {
            if (i9 == 169 || i9 == 253) {
                int i10 = 16777215 & iQ;
                if (i10 == 6516084) {
                    return a(iQ, m9);
                }
                if (i10 == 7233901 || i10 == 7631467) {
                    return h(iQ, "TIT2", m9);
                }
                if (i10 == 6516589 || i10 == 7828084) {
                    return h(iQ, "TCOM", m9);
                }
                if (i10 == 6578553) {
                    return h(iQ, "TDRC", m9);
                }
                if (i10 == 4280916) {
                    return h(iQ, "TPE1", m9);
                }
                if (i10 == 7630703) {
                    return h(iQ, "TSSE", m9);
                }
                if (i10 == 6384738) {
                    return h(iQ, "TALB", m9);
                }
                if (i10 == 7108978) {
                    return h(iQ, "USLT", m9);
                }
                if (i10 == 6776174) {
                    return h(iQ, "TCON", m9);
                }
                if (i10 == 6779504) {
                    return h(iQ, "TIT1", m9);
                }
            } else {
                if (iQ == 1735291493) {
                    return g(m9);
                }
                if (iQ == 1684632427) {
                    return d(iQ, "TPOS", m9);
                }
                if (iQ == 1953655662) {
                    return d(iQ, "TRCK", m9);
                }
                if (iQ == 1953329263) {
                    return i(iQ, "TBPM", m9, true, false);
                }
                if (iQ == 1668311404) {
                    return i(iQ, "TCMP", m9, true, true);
                }
                if (iQ == 1668249202) {
                    return b(m9);
                }
                if (iQ == 1631670868) {
                    return h(iQ, "TPE2", m9);
                }
                if (iQ == 1936682605) {
                    return h(iQ, "TSOT", m9);
                }
                if (iQ == 1936679276) {
                    return h(iQ, "TSO2", m9);
                }
                if (iQ == 1936679282) {
                    return h(iQ, "TSOA", m9);
                }
                if (iQ == 1936679265) {
                    return h(iQ, "TSOP", m9);
                }
                if (iQ == 1936679791) {
                    return h(iQ, "TSOC", m9);
                }
                if (iQ == 1920233063) {
                    return i(iQ, "ITUNESADVISORY", m9, false, false);
                }
                if (iQ == 1885823344) {
                    return i(iQ, "ITUNESGAPLESS", m9, false, true);
                }
                if (iQ == 1936683886) {
                    return h(iQ, "TVSHOWSORT", m9);
                }
                if (iQ == 1953919848) {
                    return h(iQ, "TVSHOW", m9);
                }
                if (iQ == 757935405) {
                    return e(m9, iF);
                }
            }
            AbstractC1681B.b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC2176a.a(iQ));
            m9.U(iF);
            return null;
        } finally {
            m9.U(iF);
        }
    }

    public static v3.m d(int i9, String str, M m9) {
        int iQ = m9.q();
        if (m9.q() == 1684108385 && iQ >= 22) {
            m9.V(10);
            int iN = m9.N();
            if (iN > 0) {
                String str2 = "" + iN;
                int iN2 = m9.N();
                if (iN2 > 0) {
                    str2 = str2 + "/" + iN2;
                }
                return new v3.m(str, null, AbstractC2743y.A(str2));
            }
        }
        AbstractC1681B.j("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC2176a.a(i9));
        return null;
    }

    public static v3.i e(M m9, int i9) {
        String strC = null;
        String strC2 = null;
        int i10 = -1;
        int i11 = -1;
        while (m9.f() < i9) {
            int iF = m9.f();
            int iQ = m9.q();
            int iQ2 = m9.q();
            m9.V(4);
            if (iQ2 == 1835360622) {
                strC = m9.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = m9.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i10 = iF;
                    i11 = iQ;
                }
                m9.V(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i10 == -1) {
            return null;
        }
        m9.U(i10);
        m9.V(16);
        return new v3.j(strC, strC2, m9.C(i11 - 16));
    }

    public static C2907a f(M m9, int i9, String str) {
        while (true) {
            int iF = m9.f();
            if (iF >= i9) {
                return null;
            }
            int iQ = m9.q();
            if (m9.q() == 1684108385) {
                int iQ2 = m9.q();
                int iQ3 = m9.q();
                int i10 = iQ - 16;
                byte[] bArr = new byte[i10];
                m9.l(bArr, 0, i10);
                return new C2907a(str, bArr, iQ3, iQ2);
            }
            m9.U(iF + iQ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v3.m g(d4.M r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = l3.AbstractC2183h.f43988a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            v3.m r1 = new v3.m
            java.lang.String r2 = "TCON"
            s5.y r3 = s5.AbstractC2743y.A(r3)
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            d4.AbstractC1681B.j(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC2183h.g(d4.M):v3.m");
    }

    public static v3.m h(int i9, String str, M m9) {
        int iQ = m9.q();
        if (m9.q() == 1684108385) {
            m9.V(8);
            return new v3.m(str, null, AbstractC2743y.A(m9.C(iQ - 16)));
        }
        AbstractC1681B.j("MetadataUtil", "Failed to parse text attribute: " + AbstractC2176a.a(i9));
        return null;
    }

    public static v3.i i(int i9, String str, M m9, boolean z9, boolean z10) {
        int iJ = j(m9);
        if (z10) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z9 ? new v3.m(str, null, AbstractC2743y.A(Integer.toString(iJ))) : new v3.e("und", str, Integer.toString(iJ));
        }
        AbstractC1681B.j("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC2176a.a(i9));
        return null;
    }

    public static int j(M m9) {
        m9.V(4);
        if (m9.q() == 1684108385) {
            m9.V(8);
            return m9.H();
        }
        AbstractC1681B.j("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i9, d3.r rVar, C0936z0.b bVar) {
        if (i9 == 1 && rVar.a()) {
            bVar.P(rVar.f39605a).Q(rVar.f39606b);
        }
    }

    public static void l(int i9, C2540a c2540a, C2540a c2540a2, C0936z0.b bVar, C2540a... c2540aArr) {
        C2540a c2540a3 = new C2540a(new C2540a.b[0]);
        if (i9 != 1 || c2540a == null) {
            c2540a = c2540a3;
        }
        if (c2540a2 != null) {
            for (int i10 = 0; i10 < c2540a2.f(); i10++) {
                C2540a.b bVarE = c2540a2.e(i10);
                if (bVarE instanceof C2907a) {
                    C2907a c2907a = (C2907a) bVarE;
                    if (!c2907a.f51596a.equals("com.android.capture.fps")) {
                        c2540a = c2540a.a(c2907a);
                    } else if (i9 == 2) {
                        c2540a = c2540a.a(c2907a);
                    }
                }
            }
        }
        for (C2540a c2540a4 : c2540aArr) {
            c2540a = c2540a.c(c2540a4);
        }
        if (c2540a.f() > 0) {
            bVar.Z(c2540a);
        }
    }
}

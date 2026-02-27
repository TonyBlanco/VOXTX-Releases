package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class btv {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f22312A = 130;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f22313B = 131;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f22314C = 132;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f22315D = 174;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f22316E = 175;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f22317F = 176;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f22318G = 177;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f22319H = 128;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f22320I = 117;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f22321J = 109;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f22322K = 133;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f22323L = 114;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f22324M = 151;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f22325N = 152;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f22326O = 153;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f22327P = 154;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f22328Q = 112;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f22329R = 113;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f22330S = 157;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f22331T = 156;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f22332U = 116;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f22333V = 110;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f22334W = 134;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f22335X = 135;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f22336Y = 136;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f22337Z = 160;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22338a = 1;
    public static final int aA = 111;
    public static final int aB = 207;
    public static final int aC = 208;
    public static final int aD = 206;
    public static final int aE = 290;
    public static final int aF = 137;
    public static final int aG = 138;
    public static final int aH = 139;
    public static final int aI = 140;
    public static final int aJ = 200;
    public static final int aK = 201;
    public static final int aL = 202;
    public static final int aM = 203;
    public static final int aN = 193;
    public static final int aO = 281;
    public static final int aP = 178;
    public static final int aQ = 179;
    public static final int aR = 180;
    public static final int aS = 181;
    public static final int aT = 189;
    public static final int aU = 190;
    public static final int aV = 191;
    public static final int aW = 192;
    public static final int aX = 162;
    public static final int aY = 163;
    public static final int aZ = 164;
    public static final int aa = 168;
    public static final int ab = 194;
    public static final int ac = 143;
    public static final int ad = 144;
    public static final int ae = 145;
    public static final int af = 146;
    public static final int ag = 108;
    public static final int ah = 147;
    public static final int ai = 148;
    public static final int aj = 149;
    public static final int ak = 150;
    public static final int al = 159;
    public static final int am = 232;
    public static final int an = 115;
    public static final int ao = 142;
    public static final int ap = 161;
    public static final int aq = 270;
    public static final int ar = 271;
    public static final int as = 272;
    public static final int at = 273;
    public static final int au = 274;
    public static final int av = 275;
    public static final int aw = 278;
    public static final int ax = 279;
    public static final int ay = 276;
    public static final int az = 141;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22339b = 2;
    public static final int bA = 185;
    public static final int bB = 186;
    public static final int bC = 187;
    public static final int bD = 242;
    public static final int bE = 188;
    public static final int bF = 227;
    public static final int bG = 196;
    public static final int bH = 241;
    public static final int bI = 268;
    public static final int bJ = 205;
    public static final int bK = 209;
    public static final int bL = 210;
    public static final int bM = 211;
    public static final int bN = 212;
    public static final int bO = 213;
    public static final int bP = 214;
    public static final int bQ = 215;
    public static final int bR = 216;
    public static final int bS = 217;
    public static final int bT = 219;
    public static final int bU = 220;
    public static final int bV = 221;
    public static final int bW = 225;
    public static final int bX = 226;
    public static final int bY = 228;
    public static final int bZ = 234;
    public static final int ba = 165;
    public static final int bb = 235;
    public static final int bc = 236;
    public static final int bd = 237;
    public static final int be = 266;
    public static final int bf = 267;
    public static final int bg = 289;
    public static final int bh = 166;
    public static final int bi = 167;
    public static final int bj = 197;
    public static final int bk = 158;
    public static final int bl = 239;
    public static final int bm = 218;
    public static final int bn = 240;
    public static final int bo = 277;
    public static final int bp = 169;
    public static final int bq = 170;
    public static final int br = 171;
    public static final int bs = 172;
    public static final int bt = 238;
    public static final int bu = 182;
    public static final int bv = 173;
    public static final int bw = 183;
    public static final int bx = 223;
    public static final int by = 224;
    public static final int bz = 184;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22340c = 3;
    public static final int cA = 313;
    public static final int cB = 314;
    public static final int cC = 262;
    public static final int cD = 280;
    public static final int cE = 286;
    public static final int cF = 287;
    public static final int cG = 288;

    @Deprecated
    public static final int cH = 264;
    public static final int cI = 265;
    public static final int cJ = 282;
    public static final int cK = 283;
    public static final int cL = 284;
    public static final int cM = 269;
    public static final int cN = 285;
    public static final int cO = 291;
    public static final int cP = 292;
    public static final int cQ = 293;
    public static final int cR = 294;
    public static final int cS = 295;
    public static final int cT = 296;
    public static final int cU = 297;
    public static final int cV = 298;
    public static final int cW = 299;
    public static final int cX = 300;
    public static final int cY = 301;
    public static final int cZ = 302;
    public static final int ca = 263;

    @Deprecated
    public static final int cb = 229;
    public static final int cc = 246;
    public static final int cd = 247;
    public static final int ce = 248;
    public static final int cf = 230;
    public static final int cg = 231;
    public static final int ch = 233;
    public static final int ci = 322;
    public static final int cj = 243;
    public static final int ck = 244;
    public static final int cl = 245;
    public static final int cm = 251;
    public static final int cn = 252;
    public static final int co = 253;
    public static final int cp = 254;
    public static final int cq = 255;
    public static final int cr = 261;
    public static final int cs = 328;
    public static final int ct = 256;
    public static final int cu = 257;
    public static final int cv = 258;
    public static final int cw = 259;
    public static final int cx = 260;
    public static final int cy = 306;
    public static final int cz = 307;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22341d = 198;
    public static final int dA = 325;
    public static final int dB = 326;
    public static final int dC = 327;
    public static final int dD = 330;
    public static final int dE = 331;
    public static final int dF = 332;
    public static final int dG = 333;
    public static final int dH = 334;
    public static final int dI = 335;
    public static final int dJ = 336;
    public static final int dK = 337;
    public static final int dL = 338;
    public static final int dM = 339;
    public static final int dN = 340;
    public static final int dO = 344;
    public static final int dP = 345;
    public static final int dQ = 346;
    public static final int dR = 359;
    public static final int dS = 360;
    public static final int dT = 361;
    public static final int dU = 362;
    public static final int dV = 363;
    public static final int dW = 364;
    public static final int dX = 365;
    public static final int dY = 366;
    public static final int dZ = 367;
    public static final int da = 303;
    public static final int db = 304;
    public static final int dc = 305;
    public static final int dd = 308;

    /* JADX INFO: renamed from: de, reason: collision with root package name */
    public static final int f22342de = 309;
    public static final int df = 310;
    public static final int dg = 343;
    public static final int dh = 342;
    public static final int di = 341;
    public static final int dj = 311;
    public static final int dk = 312;
    public static final int dl = 315;
    public static final int dm = 316;
    public static final int dn = 329;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final int f1do = 317;
    public static final int dp = 318;
    public static final int dq = 319;
    public static final int dr = 320;
    public static final int ds = 321;
    public static final int dt = 354;
    public static final int du = 355;
    public static final int dv = 356;
    public static final int dw = 357;
    public static final int dx = 358;
    public static final int dy = 323;
    public static final int dz = 324;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22343e = 4;
    public static final int eA = 396;
    public static final int eB = 397;
    public static final int eC = 398;
    public static final int eD = 399;
    public static final int eE = 400;
    public static final int eF = 401;
    public static final int eG = 370;
    public static final int eH = 402;
    public static final int eI = 403;
    private static final /* synthetic */ int[] eJ = c();
    public static final int ea = 368;
    public static final int eb = 371;
    public static final int ec = 372;
    public static final int ed = 373;
    public static final int ee = 374;
    public static final int ef = 375;
    public static final int eg = 376;
    public static final int eh = 377;
    public static final int ei = 378;
    public static final int ej = 379;
    public static final int ek = 380;
    public static final int el = 381;
    public static final int em = 382;
    public static final int en = 383;
    public static final int eo = 384;
    public static final int ep = 385;
    public static final int eq = 386;
    public static final int er = 387;
    public static final int es = 388;
    public static final int et = 389;
    public static final int eu = 390;
    public static final int ev = 391;
    public static final int ew = 392;
    public static final int ex = 393;
    public static final int ey = 394;
    public static final int ez = 395;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22344f = 195;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22345g = 204;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22346h = 101;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22347i = 102;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f22348j = 103;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22349k = 104;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22350l = 105;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22351m = 106;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f22352n = 107;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f22353o = 155;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f22354p = 118;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f22355q = 119;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f22356r = 120;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f22357s = 121;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f22358t = 122;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f22359u = 123;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f22360v = 124;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f22361w = 125;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f22362x = 126;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f22363y = 127;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f22364z = 129;

    public static bqr a() {
        return btw.f22366b;
    }

    public static int b(int i9) {
        if (i9 == 0) {
            return f22338a;
        }
        if (i9 == 1) {
            return f22339b;
        }
        if (i9 == 2) {
            return f22340c;
        }
        if (i9 == 3) {
            return f22343e;
        }
        switch (i9) {
            case 100:
                return f22346h;
            case 101:
                return f22347i;
            case HttpStatus.SC_PROCESSING /* 102 */:
                return f22348j;
            case 103:
                return f22349k;
            case 104:
                return f22350l;
            case 105:
                return f22351m;
            case 106:
                return f22352n;
            case 107:
                return ag;
            case 108:
                return f22321J;
            case 109:
                return f22333V;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_10 /* 110 */:
                return aA;
            case 111:
                return f22328Q;
            case 112:
                return f22329R;
            case 113:
                return f22323L;
            case 114:
                return an;
            case 115:
                return f22332U;
            case 116:
                return f22320I;
            case 117:
                return f22354p;
            case 118:
                return f22355q;
            case 119:
                return f22356r;
            case 120:
                return f22357s;
            case 121:
                return f22358t;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /* 122 */:
                return f22359u;
            case 123:
                return f22360v;
            case 124:
                return f22361w;
            case 125:
                return f22362x;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                return f22363y;
            case 127:
                return f22319H;
            case 128:
                return f22364z;
            case 129:
                return f22312A;
            case 130:
                return f22313B;
            case 131:
                return f22314C;
            case 132:
                return f22322K;
            case 133:
                return f22334W;
            case 134:
                return f22335X;
            case 135:
                return f22336Y;
            case 136:
                return aF;
            case 137:
                return aG;
            case 138:
                return aH;
            case 139:
                return aI;
            case 140:
                return az;
            case 141:
                return ao;
            case 142:
                return ac;
            case 143:
                return ad;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /* 144 */:
                return ae;
            case 145:
                return af;
            case 146:
                return ah;
            case 147:
                return ai;
            case 148:
                return aj;
            case 149:
                return ak;
            case 150:
                return f22324M;
            case 151:
                return f22325N;
            case 152:
                return f22326O;
            case 153:
                return f22327P;
            case 154:
                return f22353o;
            case 155:
                return f22331T;
            case 156:
                return f22330S;
            case 157:
                return bk;
            case 158:
                return al;
            case 159:
                return f22337Z;
            case 160:
                return ap;
            case 161:
                return aX;
            case 162:
                return aY;
            case 163:
                return aZ;
            case 164:
                return ba;
            case 165:
                return bh;
            case 166:
                return bi;
            case 167:
                return aa;
            case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
                return bp;
            case 169:
                return bq;
            case 170:
                return br;
            case 171:
                return bs;
            case 172:
                return bv;
            case 173:
                return f22315D;
            case 174:
                return f22316E;
            case 175:
                return f22317F;
            case 176:
                return f22318G;
            case 177:
                return aP;
            case 178:
                return aQ;
            case 179:
                return aR;
            case 180:
                return aS;
            case 181:
                return bu;
            case 182:
                return bw;
            case 183:
                return bz;
            case 184:
                return bA;
            case 185:
                return bB;
            case 186:
                return bC;
            case 187:
                return bE;
            case 188:
                return aT;
            case 189:
                return aU;
            case 190:
                return aV;
            case 191:
                return aW;
            case 192:
                return aN;
            case 193:
                return ab;
            case 194:
                return f22344f;
            case 195:
                return bG;
            case 196:
                return bj;
            case 197:
                return f22341d;
            default:
                switch (i9) {
                    case 199:
                        return aJ;
                    case 200:
                        return aK;
                    case HttpStatus.SC_CREATED /* 201 */:
                        return aL;
                    case HttpStatus.SC_ACCEPTED /* 202 */:
                        return aM;
                    case HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION /* 203 */:
                        return f22345g;
                    case HttpStatus.SC_NO_CONTENT /* 204 */:
                        return bJ;
                    case HttpStatus.SC_RESET_CONTENT /* 205 */:
                        return aD;
                    case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
                        return aB;
                    case HttpStatus.SC_MULTI_STATUS /* 207 */:
                        return aC;
                    case 208:
                        return bK;
                    case 209:
                        return bL;
                    case 210:
                        return bM;
                    case 211:
                        return bN;
                    case 212:
                        return bO;
                    case 213:
                        return bP;
                    case 214:
                        return bQ;
                    case 215:
                        return bR;
                    case 216:
                        return bS;
                    case 217:
                        return bm;
                    case 218:
                        return bT;
                    case 219:
                        return bU;
                    case 220:
                        return bV;
                    default:
                        switch (i9) {
                            case 222:
                                return bx;
                            case 223:
                                return by;
                            case 224:
                                return bW;
                            case 225:
                                return bX;
                            case 226:
                                return bF;
                            case 227:
                                return bY;
                            case 228:
                                return cb;
                            case 229:
                                return cf;
                            case 230:
                                return cg;
                            case 231:
                                return am;
                            case 232:
                                return ch;
                            case 233:
                                return bZ;
                            case 234:
                                return bb;
                            case 235:
                                return bc;
                            case 236:
                                return bd;
                            case 237:
                                return bt;
                            case 238:
                                return bl;
                            case 239:
                                return bn;
                            case 240:
                                return bH;
                            case 241:
                                return bD;
                            case 242:
                                return cj;
                            case 243:
                                return ck;
                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                                return cl;
                            case 245:
                                return cc;
                            case 246:
                                return cd;
                            case 247:
                                return ce;
                            default:
                                switch (i9) {
                                    case 250:
                                        return cm;
                                    case 251:
                                        return cn;
                                    case 252:
                                        return co;
                                    case 253:
                                        return cp;
                                    case 254:
                                        return cq;
                                    case 255:
                                        return ct;
                                    case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                                        return cu;
                                    case 257:
                                        return cv;
                                    case 258:
                                        return cw;
                                    case 259:
                                        return cx;
                                    case 260:
                                        return cr;
                                    case 261:
                                        return cC;
                                    case 262:
                                        return ca;
                                    case 263:
                                        return cH;
                                    case 264:
                                        return cI;
                                    case 265:
                                        return be;
                                    case 266:
                                        return bf;
                                    case 267:
                                        return bI;
                                    case 268:
                                        return cM;
                                    case 269:
                                        return aq;
                                    case 270:
                                        return ar;
                                    case 271:
                                        return as;
                                    case 272:
                                        return at;
                                    case 273:
                                        return au;
                                    case 274:
                                        return av;
                                    case 275:
                                        return ay;
                                    case 276:
                                        return bo;
                                    case 277:
                                        return aw;
                                    case 278:
                                        return ax;
                                    case 279:
                                        return cD;
                                    case 280:
                                        return aO;
                                    case 281:
                                        return cJ;
                                    case 282:
                                        return cK;
                                    case 283:
                                        return cL;
                                    case 284:
                                        return cN;
                                    case 285:
                                        return cE;
                                    case 286:
                                        return cF;
                                    case 287:
                                        return cG;
                                    case 288:
                                        return bg;
                                    case 289:
                                        return aE;
                                    case 290:
                                        return cO;
                                    case 291:
                                        return cP;
                                    case 292:
                                        return cQ;
                                    case 293:
                                        return cR;
                                    case 294:
                                        return cS;
                                    case 295:
                                        return cT;
                                    case 296:
                                        return cU;
                                    case 297:
                                        return cV;
                                    case 298:
                                        return cW;
                                    case 299:
                                        return cX;
                                    case 300:
                                        return cY;
                                    case 301:
                                        return cZ;
                                    case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                                        return da;
                                    case HttpStatus.SC_SEE_OTHER /* 303 */:
                                        return db;
                                    case HttpStatus.SC_NOT_MODIFIED /* 304 */:
                                        return dc;
                                    case HttpStatus.SC_USE_PROXY /* 305 */:
                                        return cy;
                                    case 306:
                                        return cz;
                                    case 307:
                                        return dd;
                                    case 308:
                                        return f22342de;
                                    case 309:
                                        return df;
                                    case 310:
                                        return dj;
                                    case 311:
                                        return dk;
                                    case 312:
                                        return cA;
                                    case 313:
                                        return cB;
                                    case 314:
                                        return dl;
                                    case 315:
                                        return dm;
                                    case 316:
                                        return f1do;
                                    case 317:
                                        return dp;
                                    case 318:
                                        return dq;
                                    case 319:
                                        return dr;
                                    case 320:
                                        return ds;
                                    case 321:
                                        return ci;
                                    case 322:
                                        return dy;
                                    case 323:
                                        return dz;
                                    case 324:
                                        return dA;
                                    case 325:
                                        return dB;
                                    case 326:
                                        return dC;
                                    case 327:
                                        return cs;
                                    case 328:
                                        return dn;
                                    case 329:
                                        return dD;
                                    case 330:
                                        return dE;
                                    case 331:
                                        return dF;
                                    case 332:
                                        return dG;
                                    case 333:
                                        return dH;
                                    case 334:
                                        return dI;
                                    case 335:
                                        return dJ;
                                    case 336:
                                        return dK;
                                    case 337:
                                        return dL;
                                    case 338:
                                        return dM;
                                    case 339:
                                        return dN;
                                    case 340:
                                        return di;
                                    case 341:
                                        return dh;
                                    case 342:
                                        return dg;
                                    case 343:
                                        return dO;
                                    case 344:
                                        return dP;
                                    case 345:
                                        return dQ;
                                    default:
                                        switch (i9) {
                                            case 353:
                                                return dt;
                                            case 354:
                                                return du;
                                            case 355:
                                                return dv;
                                            case 356:
                                                return dw;
                                            case 357:
                                                return dx;
                                            case 358:
                                                return dR;
                                            case 359:
                                                return dS;
                                            case 360:
                                                return dT;
                                            case 361:
                                                return dU;
                                            case 362:
                                                return dV;
                                            case 363:
                                                return dW;
                                            case 364:
                                                return dX;
                                            case 365:
                                                return dY;
                                            case 366:
                                                return dZ;
                                            case 367:
                                                return ea;
                                            default:
                                                switch (i9) {
                                                    case 369:
                                                        return eG;
                                                    case 370:
                                                        return eb;
                                                    case 371:
                                                        return ec;
                                                    case 372:
                                                        return ed;
                                                    case 373:
                                                        return ee;
                                                    case 374:
                                                        return ef;
                                                    case 375:
                                                        return eg;
                                                    case 376:
                                                        return eh;
                                                    case 377:
                                                        return ei;
                                                    case 378:
                                                        return ej;
                                                    case 379:
                                                        return ek;
                                                    case 380:
                                                        return el;
                                                    case 381:
                                                        return em;
                                                    case 382:
                                                        return en;
                                                    case 383:
                                                        return eo;
                                                    case 384:
                                                        return ep;
                                                    case 385:
                                                        return eq;
                                                    case 386:
                                                        return er;
                                                    case 387:
                                                        return es;
                                                    case 388:
                                                        return et;
                                                    case 389:
                                                        return eu;
                                                    case 390:
                                                        return ev;
                                                    case 391:
                                                        return ew;
                                                    case 392:
                                                        return ex;
                                                    case 393:
                                                        return ey;
                                                    case 394:
                                                        return ez;
                                                    case 395:
                                                        return eA;
                                                    case 396:
                                                        return eB;
                                                    case 397:
                                                        return eC;
                                                    case 398:
                                                        return eD;
                                                    case 399:
                                                        return eE;
                                                    case 400:
                                                        return eF;
                                                    case HttpStatus.SC_UNAUTHORIZED /* 401 */:
                                                        return eH;
                                                    case HttpStatus.SC_PAYMENT_REQUIRED /* 402 */:
                                                        return eI;
                                                    default:
                                                        return 0;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static /* synthetic */ int[] c() {
        return new int[]{f22338a, f22339b, f22340c, f22341d, f22343e, f22344f, f22345g, f22346h, f22347i, f22348j, f22349k, f22350l, f22351m, f22352n, f22353o, f22354p, f22355q, f22356r, f22357s, f22358t, f22359u, f22360v, f22361w, f22362x, f22363y, f22364z, f22312A, f22313B, f22314C, f22315D, f22316E, f22317F, f22318G, f22319H, f22320I, f22321J, f22322K, f22323L, f22324M, f22325N, f22326O, f22327P, f22328Q, f22329R, f22330S, f22331T, f22332U, f22333V, f22334W, f22335X, f22336Y, f22337Z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, aA, aB, aC, aD, aE, aF, aG, aH, aI, aJ, aK, aL, aM, aN, aO, aP, aQ, aR, aS, aT, aU, aV, aW, aX, aY, aZ, ba, bb, bc, bd, be, bf, bg, bh, bi, bj, bk, bl, bm, bn, bo, bp, bq, br, bs, bt, bu, bv, bw, bx, by, bz, bA, bB, bC, bD, bE, bF, bG, bH, bI, bJ, bK, bL, bM, bN, bO, bP, bQ, bR, bS, bT, bU, bV, bW, bX, bY, bZ, ca, cb, cc, cd, ce, cf, cg, ch, ci, cj, ck, cl, cm, cn, co, cp, cq, cr, cs, ct, cu, cv, cw, cx, cy, cz, cA, cB, cC, cD, cE, cF, cG, cH, cI, cJ, cK, cL, cM, cN, cO, cP, cQ, cR, cS, cT, cU, cV, cW, cX, cY, cZ, da, db, dc, dd, f22342de, df, dg, dh, di, dj, dk, dl, dm, dn, f1do, dp, dq, dr, ds, dt, du, dv, dw, dx, dy, dz, dA, dB, dC, dD, dE, dF, dG, dH, dI, dJ, dK, dL, dM, dN, dO, dP, dQ, dR, dS, dT, dU, dV, dW, dX, dY, dZ, ea, eb, ec, ed, ee, ef, eg, eh, ei, ej, ek, el, em, en, eo, ep, eq, er, es, et, eu, ev, ew, ex, ey, ez, eA, eB, eC, eD, eE, eF, eG, eH, eI};
    }

    public static int[] values$ar$edu$8b766d6c_0() {
        return new int[]{f22338a, f22339b, f22340c, f22341d, f22343e, f22344f, f22345g, f22346h, f22347i, f22348j, f22349k, f22350l, f22351m, f22352n, f22353o, f22354p, f22355q, f22356r, f22357s, f22358t, f22359u, f22360v, f22361w, f22362x, f22363y, f22364z, f22312A, f22313B, f22314C, f22315D, f22316E, f22317F, f22318G, f22319H, f22320I, f22321J, f22322K, f22323L, f22324M, f22325N, f22326O, f22327P, f22328Q, f22329R, f22330S, f22331T, f22332U, f22333V, f22334W, f22335X, f22336Y, f22337Z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao, ap, aq, ar, as, at, au, av, aw, ax, ay, az, aA, aB, aC, aD, aE, aF, aG, aH, aI, aJ, aK, aL, aM, aN, aO, aP, aQ, aR, aS, aT, aU, aV, aW, aX, aY, aZ, ba, bb, bc, bd, be, bf, bg, bh, bi, bj, bk, bl, bm, bn, bo, bp, bq, br, bs, bt, bu, bv, bw, bx, by, bz, bA, bB, bC, bD, bE, bF, bG, bH, bI, bJ, bK, bL, bM, bN, bO, bP, bQ, bR, bS, bT, bU, bV, bW, bX, bY, bZ, ca, cb, cc, cd, ce, cf, cg, ch, ci, cj, ck, cl, cm, cn, co, cp, cq, cr, cs, ct, cu, cv, cw, cx, cy, cz, cA, cB, cC, cD, cE, cF, cG, cH, cI, cJ, cK, cL, cM, cN, cO, cP, cQ, cR, cS, cT, cU, cV, cW, cX, cY, cZ, da, db, dc, dd, f22342de, df, dg, dh, di, dj, dk, dl, dm, dn, f1do, dp, dq, dr, ds, dt, du, dv, dw, dx, dy, dz, dA, dB, dC, dD, dE, dF, dG, dH, dI, dJ, dK, dL, dM, dN, dO, dP, dQ, dR, dS, dT, dU, dV, dW, dX, dY, dZ, ea, eb, ec, ed, ee, ef, eg, eh, ei, ej, ek, el, em, en, eo, ep, eq, er, es, et, eu, ev, ew, ex, ey, ez, eA, eB, eC, eD, eE, eF, eG, eH, eI};
    }
}

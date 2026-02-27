package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
final class tq implements wy, su {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ tv f24600a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f24602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dv f24603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tl f24604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zk f24605f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f24607h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f24609j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private aae f24611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final agp f24613n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zy f24606g = new zy();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24608i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24601b = sw.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private dc f24610k = i(0);

    public tq(tv tvVar, Uri uri, cy cyVar, tl tlVar, zk zkVar, agp agpVar, byte[] bArr) {
        this.f24600a = tvVar;
        this.f24602c = uri;
        this.f24603d = new dv(cyVar);
        this.f24604e = tlVar;
        this.f24605f = zkVar;
        this.f24613n = agpVar;
    }

    public static /* bridge */ /* synthetic */ void h(tq tqVar, long j9, long j10) {
        tqVar.f24606g.f25320a = j9;
        tqVar.f24609j = j10;
        tqVar.f24608i = true;
        tqVar.f24612m = false;
    }

    private final dc i(long j9) {
        db dbVar = new db();
        dbVar.i(this.f24602c);
        dbVar.h(j9);
        dbVar.f(null);
        dbVar.b(6);
        dbVar.e(tv.f24622a);
        return dbVar.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.su
    public final void a(cj cjVar) {
        long jMax = !this.f24612m ? this.f24609j : Math.max(this.f24600a.M(true), this.f24609j);
        int iA = cjVar.a();
        aae aaeVar = this.f24611l;
        af.s(aaeVar);
        aaeVar.e(cjVar, iA);
        aaeVar.f(jMax, 1, iA, 0, null);
        this.f24612m = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws Throwable {
        int i9;
        int i10;
        boolean z9;
        int i11;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i12;
        InterfaceC1310k interfaceC1310k;
        int i13;
        int i14;
        int i15;
        int i16;
        while (!this.f24607h) {
            try {
                long j9 = this.f24606g.f25320a;
                dc dcVarI = i(j9);
                this.f24610k = dcVarI;
                long jB = this.f24603d.b(dcVarI);
                if (jB != -1) {
                    jB += j9;
                    tv tvVar = this.f24600a;
                    tvVar.f24649o.post(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: INVOKE 
                          (wrap:android.os.Handler:0x0000: IGET (r8v13 'tvVar' com.google.ads.interactivemedia.v3.internal.tv) A[WRAPPED] com.google.ads.interactivemedia.v3.internal.tv.o android.os.Handler)
                          (wrap:java.lang.Runnable:0x0004: CONSTRUCTOR (r8v13 'tvVar' com.google.ads.interactivemedia.v3.internal.tv) A[MD:(com.google.ads.interactivemedia.v3.internal.tv):void (m), WRAPPED] call: com.google.ads.interactivemedia.v3.internal.to.<init>(com.google.ads.interactivemedia.v3.internal.tv):void type: CONSTRUCTOR)
                         VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[Catch: all -> 0x0027, MD:(java.lang.Runnable):boolean (c)] in method: com.google.ads.interactivemedia.v3.internal.tq.e():void, file: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.ads.interactivemedia.v3.internal.to, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 53 more
                        */
                    /*
                        Method dump skipped, instruction units count: 533
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tq.e():void");
                }

                @Override // com.google.ads.interactivemedia.v3.internal.wy
                public final void r() {
                    this.f24607h = true;
                }
            }

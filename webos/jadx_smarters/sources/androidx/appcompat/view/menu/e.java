package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public class e implements I.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f13775A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f13777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f13780e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f13788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f13789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f13790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f13791p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f13799x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13801z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13787l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13792q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13793r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13794s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13795t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13796u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f13797v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f13798w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13800y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f13781f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f13782g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13783h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f13784i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f13785j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13786k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean d(g gVar);
    }

    public e(Context context) {
        this.f13776a = context;
        this.f13777b = context.getResources();
        b0(true);
    }

    public static int B(int i9) {
        int i10 = ((-65536) & i9) >> 16;
        if (i10 >= 0) {
            int[] iArr = f13775A;
            if (i10 < iArr.length) {
                return (i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i10] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList arrayList, int i9) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i9) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f13795t;
    }

    public Resources C() {
        return this.f13777b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f13783h) {
            return this.f13782g;
        }
        this.f13782g.clear();
        int size = this.f13781f.size();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f13781f.get(i9);
            if (gVar.isVisible()) {
                this.f13782g.add(gVar);
            }
        }
        this.f13783h = false;
        this.f13786k = true;
        return this.f13782g;
    }

    public boolean F() {
        return this.f13800y;
    }

    public boolean G() {
        return this.f13778c;
    }

    public boolean H() {
        return this.f13779d;
    }

    public void I(g gVar) {
        this.f13786k = true;
        K(true);
    }

    public void J(g gVar) {
        this.f13783h = true;
        K(true);
    }

    public void K(boolean z9) {
        if (this.f13792q) {
            this.f13793r = true;
            if (z9) {
                this.f13794s = true;
                return;
            }
            return;
        }
        if (z9) {
            this.f13783h = true;
            this.f13786k = true;
        }
        i(z9);
    }

    public boolean L(MenuItem menuItem, int i9) {
        return M(menuItem, null, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
      0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            P.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.b()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.l r7 = (androidx.appcompat.view.menu.l) r7
            if (r4 == 0) goto L63
            r2.g(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.M(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    public final void N(int i9, boolean z9) {
        if (i9 < 0 || i9 >= this.f13781f.size()) {
            return;
        }
        this.f13781f.remove(i9);
        if (z9) {
            K(true);
        }
    }

    public void O(i iVar) {
        for (WeakReference weakReference : this.f13798w) {
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f13798w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = getItem(i9);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).P(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = getItem(i9);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f13780e = aVar;
    }

    public e S(int i9) {
        this.f13787l = i9;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f13781f.size();
        d0();
        for (int i9 = 0; i9 < size; i9++) {
            g gVar = (g) this.f13781f.get(i9);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    public e U(int i9) {
        W(0, null, i9, null, null);
        return this;
    }

    public e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    public final void W(int i9, CharSequence charSequence, int i10, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f13791p = view;
            this.f13789n = null;
            this.f13790o = null;
        } else {
            if (i9 > 0) {
                this.f13789n = resourcesC.getText(i9);
            } else if (charSequence != null) {
                this.f13789n = charSequence;
            }
            if (i10 > 0) {
                this.f13790o = E.b.getDrawable(u(), i10);
            } else if (drawable != null) {
                this.f13790o = drawable;
            }
            this.f13791p = null;
        }
        K(false);
    }

    public e X(int i9) {
        W(i9, null, 0, null, null);
        return this;
    }

    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    public e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    public MenuItem a(int i9, int i10, int i11, CharSequence charSequence) {
        int iB = B(i11);
        g gVarG = g(i9, i10, i11, iB, charSequence, this.f13787l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f13788m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f13781f;
        arrayList.add(n(arrayList, iB), gVarG);
        K(true);
        return gVarG;
    }

    public void a0(boolean z9) {
        this.f13801z = z9;
    }

    @Override // android.view.Menu
    public MenuItem add(int i9) {
        return a(0, 0, 0, this.f13777b.getString(i9));
    }

    @Override // android.view.Menu
    public MenuItem add(int i9, int i10, int i11, int i12) {
        return a(i9, i10, i11, this.f13777b.getString(i12));
    }

    @Override // android.view.Menu
    public MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return a(i9, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f13776a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i9);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i9, i10, i11, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9) {
        return addSubMenu(0, 0, 0, this.f13777b.getString(i9));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return addSubMenu(i9, i10, i11, this.f13777b.getString(i12));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        g gVar = (g) a(i9, i10, i11, charSequence);
        l lVar = new l(this.f13776a, this, gVar);
        gVar.x(lVar);
        return lVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f13776a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f13777b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f13776a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f13776a
            boolean r3 = P.N.e(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f13779d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.b0(boolean):void");
    }

    public void c(i iVar, Context context) {
        this.f13798w.add(new WeakReference(iVar));
        iVar.i(context, this);
        this.f13786k = true;
    }

    public void c0() {
        this.f13792q = false;
        if (this.f13793r) {
            this.f13793r = false;
            K(this.f13794s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f13799x;
        if (gVar != null) {
            f(gVar);
        }
        this.f13781f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f13790o = null;
        this.f13789n = null;
        this.f13791p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f13780e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f13792q) {
            return;
        }
        this.f13792q = true;
        this.f13793r = false;
        this.f13794s = false;
    }

    public final void e(boolean z9) {
        if (this.f13796u) {
            return;
        }
        this.f13796u = true;
        for (WeakReference weakReference : this.f13798w) {
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f13798w.remove(weakReference);
            } else {
                iVar.b(this, z9);
            }
        }
        this.f13796u = false;
    }

    public boolean f(g gVar) {
        boolean zH = false;
        if (!this.f13798w.isEmpty() && this.f13799x == gVar) {
            d0();
            for (WeakReference weakReference : this.f13798w) {
                i iVar = (i) weakReference.get();
                if (iVar != null) {
                    zH = iVar.h(this, gVar);
                    if (zH) {
                        break;
                    }
                } else {
                    this.f13798w.remove(weakReference);
                }
            }
            c0();
            if (zH) {
                this.f13799x = null;
            }
        }
        return zH;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i9) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f13781f.get(i10);
            if (gVar.getItemId() == i9) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i9)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final g g(int i9, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        return new g(this, i9, i10, i11, i12, charSequence, i13);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i9) {
        return (MenuItem) this.f13781f.get(i9);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f13780e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f13801z) {
            return true;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((g) this.f13781f.get(i9)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z9) {
        if (this.f13798w.isEmpty()) {
            return;
        }
        d0();
        for (WeakReference weakReference : this.f13798w) {
            i iVar = (i) weakReference.get();
            if (iVar == null) {
                this.f13798w.remove(weakReference);
            } else {
                iVar.f(z9);
            }
        }
        c0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return p(i9, keyEvent) != null;
    }

    public final boolean j(l lVar, i iVar) {
        if (this.f13798w.isEmpty()) {
            return false;
        }
        boolean zE = iVar != null ? iVar.e(lVar) : false;
        for (WeakReference weakReference : this.f13798w) {
            i iVar2 = (i) weakReference.get();
            if (iVar2 == null) {
                this.f13798w.remove(weakReference);
            } else if (!zE) {
                zE = iVar2.e(lVar);
            }
        }
        return zE;
    }

    public boolean k(g gVar) {
        boolean zC = false;
        if (this.f13798w.isEmpty()) {
            return false;
        }
        d0();
        for (WeakReference weakReference : this.f13798w) {
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                zC = iVar.c(this, gVar);
                if (zC) {
                    break;
                }
            } else {
                this.f13798w.remove(weakReference);
            }
        }
        c0();
        if (zC) {
            this.f13799x = gVar;
        }
        return zC;
    }

    public int l(int i9) {
        return m(i9, 0);
    }

    public int m(int i9, int i10) {
        int size = size();
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < size) {
            if (((g) this.f13781f.get(i10)).getGroupId() == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int o(int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f13781f.get(i10)).getItemId() == i9) {
                return i10;
            }
        }
        return -1;
    }

    public g p(int i9, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13797v;
        arrayList.clear();
        q(arrayList, i9, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zG = G();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) arrayList.get(i10);
            char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i9 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i9, int i10) {
        return L(findItem(i9), i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        g gVarP = p(i9, keyEvent);
        boolean zL = gVarP != null ? L(gVarP, i10) : false;
        if ((i10 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    public void q(List list, int i9, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i9 == 67) {
            int size = this.f13781f.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) this.f13781f.get(i10);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i9, keyEvent);
                }
                char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zG ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i9 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f13786k) {
            boolean zG = false;
            for (WeakReference weakReference : this.f13798w) {
                i iVar = (i) weakReference.get();
                if (iVar == null) {
                    this.f13798w.remove(weakReference);
                } else {
                    zG |= iVar.g();
                }
            }
            if (zG) {
                this.f13784i.clear();
                this.f13785j.clear();
                int size = arrayListE.size();
                for (int i9 = 0; i9 < size; i9++) {
                    g gVar = (g) arrayListE.get(i9);
                    (gVar.l() ? this.f13784i : this.f13785j).add(gVar);
                }
            } else {
                this.f13784i.clear();
                this.f13785j.clear();
                this.f13785j.addAll(E());
            }
            this.f13786k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i9) {
        int iL = l(i9);
        if (iL >= 0) {
            int size = this.f13781f.size() - iL;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= size || ((g) this.f13781f.get(iL)).getGroupId() != i9) {
                    break;
                }
                N(iL, false);
                i10 = i11;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i9) {
        N(o(i9), true);
    }

    public ArrayList s() {
        r();
        return this.f13784i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i9, boolean z9, boolean z10) {
        int size = this.f13781f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f13781f.get(i10);
            if (gVar.getGroupId() == i9) {
                gVar.t(z10);
                gVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f13800y = z9;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i9, boolean z9) {
        int size = this.f13781f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f13781f.get(i10);
            if (gVar.getGroupId() == i9) {
                gVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i9, boolean z9) {
        int size = this.f13781f.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f13781f.get(i10);
            if (gVar.getGroupId() == i9 && gVar.y(z9)) {
                z10 = true;
            }
        }
        if (z10) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f13778c = z9;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f13781f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f13776a;
    }

    public g v() {
        return this.f13799x;
    }

    public Drawable w() {
        return this.f13790o;
    }

    public CharSequence x() {
        return this.f13789n;
    }

    public View y() {
        return this.f13791p;
    }

    public ArrayList z() {
        r();
        return this.f13785j;
    }
}

package k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f43378c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f43379b;

    public l0(Context context, Resources resources) {
        super(resources);
        this.f43379b = new WeakReference(context);
    }

    public static boolean b() {
        return f43378c;
    }

    public static boolean c() {
        b();
        return false;
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i9) {
        return super.getAnimation(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i9) {
        return super.getBoolean(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i9) {
        return super.getColor(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i9) {
        return super.getColorStateList(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i9) {
        return super.getDimension(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i9) {
        return super.getDimensionPixelOffset(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i9) {
        return super.getDimensionPixelSize(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i9) {
        Context context = (Context) this.f43379b.get();
        return context != null ? V.h().t(context, this, i9) : a(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i9, Resources.Theme theme) {
        return super.getDrawable(i9, theme);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i9, int i10) {
        return super.getDrawableForDensity(i9, i10);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i9, int i10, Resources.Theme theme) {
        return super.getDrawableForDensity(i9, i10, theme);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i9, int i10, int i11) {
        return super.getFraction(i9, i10, i11);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i9) {
        return super.getIntArray(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i9) {
        return super.getInteger(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i9) {
        return super.getLayout(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i9) {
        return super.getMovie(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i9, int i10) {
        return super.getQuantityString(i9, i10);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i9, int i10, Object[] objArr) {
        return super.getQuantityString(i9, i10, objArr);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i9, int i10) {
        return super.getQuantityText(i9, i10);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i9) {
        return super.getResourceEntryName(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i9) {
        return super.getResourceName(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i9) {
        return super.getResourcePackageName(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i9) {
        return super.getResourceTypeName(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i9) {
        return super.getString(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i9, Object[] objArr) {
        return super.getString(i9, objArr);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i9) {
        return super.getStringArray(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i9) {
        return super.getText(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i9, CharSequence charSequence) {
        return super.getText(i9, charSequence);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i9) {
        return super.getTextArray(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i9, TypedValue typedValue, boolean z9) {
        super.getValue(i9, typedValue, z9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z9) {
        super.getValue(str, typedValue, z9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i9, int i10, TypedValue typedValue, boolean z9) {
        super.getValueForDensity(i9, i10, typedValue, z9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i9) {
        return super.getXml(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i9) {
        return super.obtainTypedArray(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i9) {
        return super.openRawResource(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i9, TypedValue typedValue) {
        return super.openRawResource(i9, typedValue);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i9) {
        return super.openRawResourceFd(i9);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // k.W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }
}

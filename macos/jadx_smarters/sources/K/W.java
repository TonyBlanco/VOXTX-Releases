package k;

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
import g.AbstractC1791a;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f43244a;

    public W(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f43244a = resources;
    }

    public final Drawable a(int i9) {
        return super.getDrawable(i9);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i9) {
        return this.f43244a.getAnimation(i9);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i9) {
        return this.f43244a.getBoolean(i9);
    }

    @Override // android.content.res.Resources
    public int getColor(int i9) {
        return this.f43244a.getColor(i9);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i9) {
        return this.f43244a.getColorStateList(i9);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f43244a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i9) {
        return this.f43244a.getDimension(i9);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i9) {
        return this.f43244a.getDimensionPixelOffset(i9);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i9) {
        return this.f43244a.getDimensionPixelSize(i9);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f43244a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i9, Resources.Theme theme) {
        return F.h.f(this.f43244a, i9, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i9, int i10) {
        return F.h.g(this.f43244a, i9, i10, null);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i9, int i10, Resources.Theme theme) {
        return F.h.g(this.f43244a, i9, i10, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i9, int i10, int i11) {
        return this.f43244a.getFraction(i9, i10, i11);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f43244a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i9) {
        return this.f43244a.getIntArray(i9);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i9) {
        return this.f43244a.getInteger(i9);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i9) {
        return this.f43244a.getLayout(i9);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i9) {
        return this.f43244a.getMovie(i9);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i9, int i10) {
        return this.f43244a.getQuantityString(i9, i10);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i9, int i10, Object... objArr) {
        return this.f43244a.getQuantityString(i9, i10, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i9, int i10) {
        return this.f43244a.getQuantityText(i9, i10);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i9) {
        return this.f43244a.getResourceEntryName(i9);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i9) {
        return this.f43244a.getResourceName(i9);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i9) {
        return this.f43244a.getResourcePackageName(i9);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i9) {
        return this.f43244a.getResourceTypeName(i9);
    }

    @Override // android.content.res.Resources
    public String getString(int i9) {
        return this.f43244a.getString(i9);
    }

    @Override // android.content.res.Resources
    public String getString(int i9, Object... objArr) {
        return this.f43244a.getString(i9, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i9) {
        return this.f43244a.getStringArray(i9);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i9) {
        return this.f43244a.getText(i9);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i9, CharSequence charSequence) {
        return this.f43244a.getText(i9, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i9) {
        return this.f43244a.getTextArray(i9);
    }

    @Override // android.content.res.Resources
    public void getValue(int i9, TypedValue typedValue, boolean z9) {
        this.f43244a.getValue(i9, typedValue, z9);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z9) {
        this.f43244a.getValue(str, typedValue, z9);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i9, int i10, TypedValue typedValue, boolean z9) {
        AbstractC1791a.a(this.f43244a, i9, i10, typedValue, z9);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i9) {
        return this.f43244a.getXml(i9);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f43244a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i9) {
        return this.f43244a.obtainTypedArray(i9);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i9) {
        return this.f43244a.openRawResource(i9);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i9, TypedValue typedValue) {
        return this.f43244a.openRawResource(i9, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i9) {
        return this.f43244a.openRawResourceFd(i9);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f43244a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f43244a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f43244a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}

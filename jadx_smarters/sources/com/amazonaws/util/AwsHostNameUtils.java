package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import com.amazonaws.logging.LogFactory;
import java.net.InetAddress;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class AwsHostNameUtils {
    private static final Pattern S3_ENDPOINT_PATTERN = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");
    private static final String VPC_NAME = "vpce";

    public static String localHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e9) {
            LogFactory.getLog((Class<?>) AwsHostNameUtils.class).debug("Failed to determine the local hostname; fall back to use \"localhost\".", e9);
            return "localhost";
        }
    }

    public static String parseRegionName(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        String regionNameByInternalConfig = parseRegionNameByInternalConfig(str);
        if (regionNameByInternalConfig != null) {
            return regionNameByInternalConfig;
        }
        if (str.endsWith("TryRoom")) {
            return parseStandardRegionName(str.substring(0, str.length() - 14));
        }
        if (str.endsWith("TryRoom")) {
            return parseStandardRegionName(str.substring(0, str.length() - 17));
        }
        if (str2 == null) {
            return "us-east-1";
        }
        Matcher matcher = Pattern.compile("^(?:.+\\.)?" + Pattern.quote(str2) + "[.-]([a-z0-9-]+)\\.").matcher(str);
        return matcher.find() ? matcher.group(1) : "us-east-1";
    }

    @Deprecated
    public static String parseRegionName(URI uri) {
        return parseRegionName(uri.getHost(), null);
    }

    private static String parseRegionNameByInternalConfig(String str) {
        for (HostRegexToRegionMapping hostRegexToRegionMapping : InternalConfig.Factory.getInternalConfig().getHostRegexToRegionMappings()) {
            if (str.matches(hostRegexToRegionMapping.getHostNameRegex())) {
                return hostRegexToRegionMapping.getRegionName();
            }
        }
        return null;
    }

    @Deprecated
    public static String parseServiceName(URI uri) {
        String host = uri.getHost();
        if (host.endsWith("TryRoom")) {
            String strSubstring = host.substring(0, host.indexOf("TryRoom"));
            return (strSubstring.endsWith(".s3") || S3_ENDPOINT_PATTERN.matcher(strSubstring).matches()) ? "s3" : strSubstring.indexOf(46) == -1 ? strSubstring : strSubstring.substring(0, strSubstring.indexOf(46));
        }
        throw new IllegalArgumentException("Cannot parse a service name from an unrecognized endpoint (" + host + ").");
    }

    private static String parseStandardRegionName(String str) {
        Matcher matcher = S3_ENDPOINT_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return "us-east-1";
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (strSubstring.equals(VPC_NAME)) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length < 2) {
                return "us-east-1";
            }
            strSubstring = strArrSplit[strArrSplit.length - 2];
        }
        return "us-gov".equals(strSubstring) ? "us-gov-west-1" : strSubstring;
    }
}

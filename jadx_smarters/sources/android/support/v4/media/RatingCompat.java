package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i9) {
            return new RatingCompat[i9];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    public static class Api19Impl {
        private Api19Impl() {
        }

        public static float getPercentRating(Rating rating) {
            return rating.getPercentRating();
        }

        public static int getRatingStyle(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float getStarRating(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean hasHeart(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean isRated(Rating rating) {
            return rating.isRated();
        }

        public static boolean isThumbUp(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating newHeartRating(boolean z9) {
            return Rating.newHeartRating(z9);
        }

        public static Rating newPercentageRating(float f9) {
            return Rating.newPercentageRating(f9);
        }

        public static Rating newStarRating(int i9, float f9) {
            return Rating.newStarRating(i9, f9);
        }

        public static Rating newThumbRating(boolean z9) {
            return Rating.newThumbRating(z9);
        }

        public static Rating newUnratedRating(int i9) {
            return Rating.newUnratedRating(i9);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public RatingCompat(int i9, float f9) {
        this.mRatingStyle = i9;
        this.mRatingValue = f9;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = Api19Impl.getRatingStyle(rating);
            if (Api19Impl.isRated(rating)) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(Api19Impl.hasHeart(rating));
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(Api19Impl.isThumbUp(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, Api19Impl.getStarRating(rating));
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(Api19Impl.getPercentRating(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.mRatingObj = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static RatingCompat newHeartRating(boolean z9) {
        return new RatingCompat(1, z9 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f9) {
        if (f9 >= 0.0f && f9 <= 100.0f) {
            return new RatingCompat(6, f9);
        }
        Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i9, float f9) {
        float f10;
        String str;
        if (i9 == 3) {
            f10 = 3.0f;
        } else if (i9 == 4) {
            f10 = 4.0f;
        } else {
            if (i9 != 5) {
                str = "Invalid rating style (" + i9 + ") for a star rating";
                Log.e(TAG, str);
                return null;
            }
            f10 = 5.0f;
        }
        if (f9 >= 0.0f && f9 <= f10) {
            return new RatingCompat(i9, f9);
        }
        str = "Trying to set out of range star-based rating";
        Log.e(TAG, str);
        return null;
    }

    public static RatingCompat newThumbRating(boolean z9) {
        return new RatingCompat(2, z9 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i9) {
        switch (i9) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i9, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.mRatingStyle;
    }

    public float getPercentRating() {
        return (this.mRatingStyle == 6 && isRated()) ? this.mRatingValue : RATING_NOT_RATED;
    }

    public Object getRating() {
        Rating ratingNewUnratedRating;
        if (this.mRatingObj == null) {
            if (isRated()) {
                int i9 = this.mRatingStyle;
                switch (i9) {
                    case 1:
                        ratingNewUnratedRating = Api19Impl.newHeartRating(hasHeart());
                        break;
                    case 2:
                        ratingNewUnratedRating = Api19Impl.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingNewUnratedRating = Api19Impl.newStarRating(i9, getStarRating());
                        break;
                    case 6:
                        ratingNewUnratedRating = Api19Impl.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingNewUnratedRating = Api19Impl.newUnratedRating(this.mRatingStyle);
            }
            this.mRatingObj = ratingNewUnratedRating;
        }
        return this.mRatingObj;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public float getStarRating() {
        int i9 = this.mRatingStyle;
        return ((i9 == 3 || i9 == 4 || i9 == 5) && isRated()) ? this.mRatingValue : RATING_NOT_RATED;
    }

    public boolean hasHeart() {
        return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
    }

    public boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        float f9 = this.mRatingValue;
        sb.append(f9 < 0.0f ? "unrated" : String.valueOf(f9));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}

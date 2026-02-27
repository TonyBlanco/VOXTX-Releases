package com.nst.iptvsmarterstvbox.model.webrequest;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.SbpCombinedResponse;
import com.nst.iptvsmarterstvbox.model.callback.ActivationCallBack;
import com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingClearDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsEpgCallback;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerCreatePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerDeletePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerShortEPGCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.callback.VPNServersCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodStreamsCallback;
import com.nst.iptvsmarterstvbox.model.callback.XMLTVCallback;
import com.nst.iptvsmarterstvbox.model.callback.storage.GetStorageAccessCallback;
import com.nst.iptvsmarterstvbox.model.callback.storage.UpdateStorageAccessCallback;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.MobileCodeActiveCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeGenerateCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeVerifyCallBack;
import com.nst.iptvsmarterstvbox.sbpfunction.adsdatacallback.AdsDataResponse;
import com.nst.iptvsmarterstvbox.sbpfunction.callbackclientreport.ClientFeedbackCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AddDeviceFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsLastUpdateResponseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsSpeedCallBack;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.DeviceIDCallBack;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.SBPAdvertisementsCallBack;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.SBPAdvertisementsMaintanceCallBack;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.readAnnouncementFirebaseCallback;
import java.util.List;
import org.apache.http.cookie.SM;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
public interface RetrofitPost {
    @POST("api")
    Call<SbpCombinedResponse> SbpCombinedRequest(@Body JsonObject jsonObject);

    @POST("api")
    Call<AddDeviceFirebaseCallback> addDeviceFirebase(@Body JsonObject jsonObject);

    @GET("portal.php")
    Call<StalkerSetLiveFavCallback> addLiveFavStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4, @Query("fav_ch") String str5);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingAddOrderCallback> addOrder(@Field("a") String str, @Field("e") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("m") String str6, @Field("p") String str7, @Field("action") String str8, @Field("d") String str9, @Field("u") int i9, @Field("is_purchased") String str10, @Field("order_id") String str11, @Field("v") String str12);

    @GET("portal.php")
    Call<StalkerSetLiveFavCallback> addVODFavStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4, @Query("video_id") String str5);

    @GET("player_api.php")
    Call<List<GetSeriesStreamCallback>> allSeriesStreams(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4);

    @GET("player_api.php")
    Call<List<VodStreamsCallback>> allVODStreams(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingCheckGPACallback> checkGPA(@Field("a") String str, @Field("order_id") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("action") String str6);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingClearDevicesCallback> clearDevices(@Field("a") String str, @Field("e") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("m") String str6, @Field("p") String str7, @Field("action") String str8, @Field("d") String str9, @Field("u") int i9);

    @POST("api")
    Call<ClientFeedbackCallback> clientsFeedbackRequest(@Body JsonObject jsonObject);

    @POST("api")
    Call<ClientFeedbackCallback> clientsReportRequest(@Body JsonObject jsonObject);

    @GET("portal.php")
    Call<StalkerCreatePlayerLinkCallback> createPlayerLinkStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("cmd") String str4, @Query("action") String str5, @Query("series") String str6);

    @GET("portal.php")
    Call<StalkerDeletePlayerLinkCallback> deletePlayerLink(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("item") String str4, @Query("action") String str5);

    @GET("xmltv.php")
    Call<XMLTVCallback> epgXMLTV(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3);

    @GET("portal.php")
    Call<StalkerGetAdCallback> getAdStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @POST("api")
    Call<AdsDataResponse> getAdsDataFromPanelApi(@Body JsonObject jsonObject);

    @POST("api")
    Call<AdsSpeedCallBack> getAdsSpeedsControl(@Body JsonObject jsonObject);

    @GET("portal.php")
    Call<StalkerGetAllChannelsCallback> getAllChannelsStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @POST("api")
    Call<getAnnouncementsFirebaseCallback> getAnnouncementsFirebase(@Body JsonObject jsonObject);

    @POST("api")
    Call<GetStorageAccessCallback> getAppStorageAccess(@Body JsonObject jsonObject);

    @GET("movie/{movie_id}/credits")
    Call<TMDBCastsCallback> getCasts(@Path("movie_id") int i9, @Query("api_key") String str);

    @POST("api")
    Call<DeviceIDCallBack> getDeviceID(@Body JsonObject jsonObject);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingGetDevicesCallback> getDevices(@Field("a") String str, @Field("e") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("p") String str6, @Field("u") int i9, @Field("action") String str7);

    @POST("api")
    Call<DownloadResponseModel> getDownloadInfo(@Body JsonObject jsonObject);

    @POST("api")
    Call<JsonElement> getFirebaseVPNUrl(@Body JsonObject jsonObject);

    @GET("movie/{movie_id}")
    Call<TMDBGenreCallback> getGenre(@Path("movie_id") int i9, @Query("api_key") String str);

    @GET("portal.php")
    Call<StalkerGetGenresCallback> getGenresStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @POST("api")
    Call<AdsLastUpdateResponseCallback> getLastUpdateApi(@Body JsonObject jsonObject);

    @GET("portal.php")
    Call<StalkerLiveFavIdsCallback> getLiveFavIdsStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @GET("search/movie")
    Call<SearchTMDBMoviesCallback> getMoviesInfo(@Query("api_key") String str, @Query("query") String str2);

    @GET("person/{person_id}")
    Call<TMDBPersonInfoCallback> getPersonInfo(@Path("person_id") String str, @Query("api_key") String str2, @Query("append_to_response") String str3);

    @POST("api")
    Call<SBPAdvertisementsCallBack> getSBPAdvertisements(@Body JsonObject jsonObject);

    @POST("api")
    Call<SBPAdvertisementsMaintanceCallBack> getSBPAdvertisementsMaintance(@Body JsonObject jsonObject);

    @GET("portal.php")
    Call<StalkerGetVODByCatCallback> getSeasonsStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("category") String str4, @Query("p") String str5, @Query("action") String str6, @Query("movie_id") String str7);

    @GET("portal.php")
    Call<StalkerGetSeriesCategoriesCallback> getSeriesCategoriesStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @FormUrlEncoded
    @POST("/request_api.php")
    Call<VPNServersCallback> getServers(@Field("m") String str, @Field("ak") String str2, @Field("r") String str3, @Field("allowedKey") String str4, @Field("sc") String str5);

    @GET("portal.php")
    Call<StalkerShortEPGCallback> getShortEPGStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("ch_id") String str4, @Query("action") String str5);

    @GET("player_api.php")
    Call<LiveStreamsEpgCallback> getTVArchive(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4, @Query("stream_id") int i9);

    @GET("tv/{show_id}/credits")
    Call<TMDBCastsCallback> getTVShowCasts(@Path("show_id") int i9, @Query("api_key") String str);

    @GET("tv/{show_id}")
    Call<TMDBTVShowsInfoCallback> getTVShowsGenreAndDirector(@Path("show_id") int i9, @Query("api_key") String str);

    @GET("search/tv")
    Call<SearchTMDBTVShowsCallback> getTVShowsInfo(@Query("api_key") String str, @Query("query") String str2);

    @GET("movie/{movie_id}/videos")
    Call<TMDBTrailerCallback> getTrailer(@Path("movie_id") int i9, @Query("api_key") String str);

    @GET("tv/{show_id}/videos")
    Call<TMDBTrailerCallback> getTrailerTVShows(@Path("show_id") int i9, @Query("api_key") String str);

    @GET("portal.php")
    Call<StalkerGetVODByCatCallback> getVODByCatIDStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("category") String str4, @Query("p") String str5, @Query("action") String str6);

    @GET("portal.php")
    Call<StalkerGetVODByCatCallback> getVODFavStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4, @Query("fav") String str5, @Query("p") String str6);

    @GET("portal.php")
    Call<StalkerGetVodCategoriesCallback> getVodCategoriesStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingIsPurchasedCallback> isPurchasedCheck(@Field("a") String str, @Field("e") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("m") String str6, @Field("p") String str7, @Field("action") String str8, @Field("d") String str9, @Field("u") int i9, @Field("is_purchased") String str10, @Field("order_id") String str11);

    @GET("player_api.php")
    Call<List<LiveStreamCategoriesCallback>> liveStreamCategories(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4);

    @GET("player_api.php")
    Call<List<LiveStreamsCallback>> liveStreams(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4);

    @GET("player_api.php")
    Call<List<LiveStreamsCallback>> liveStreams(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4, @Query("category_id") String str5);

    @GET("player_api.php")
    Call<LiveStreamsEpgCallback> liveStreamsEpg(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4, @Query("stream_id") Integer num);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingLoginClientCallback> loginClient(@Field("a") String str, @Field("e") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("m") String str6, @Field("p") String str7, @Field("action") String str8, @Field("d") String str9);

    @POST("api")
    Call<MobileCodeActiveCallBack> mobileCodeActivate(@Body JsonObject jsonObject);

    @POST("api")
    Call<readAnnouncementFirebaseCallback> readAnnouncementFirebase(@Body JsonObject jsonObject);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<RegisterClientCallback> registerClient(@Field("e") String str, @Field("sc") String str2, @Field("a") String str3, @Field("r") String str4, @Field("p") String str5, @Field("s") String str6, @Field("action") String str7, @Field("d") String str8, @Field("m") String str9);

    @GET("portal.php")
    Call<Void> removeVODFavStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4, @Query("video_id") String str5);

    @GET("portal.php")
    Call<StalkerGetVODByCatCallback> searchVODStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4, @Query("category") String str5, @Query("search") String str6, @Query("fav") String str7, @Query("p") String str8);

    @GET("player_api.php")
    Call<JsonElement> seasonsEpisode(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4, @Query("series_id") String str5);

    @GET("play/b2c/v1/content/series/{stream_id}")
    Call<JsonElement> seasonsEpisodeOneStream(@Header("Content-Type") String str, @Path("stream_id") String str2, @Query(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT) String str3);

    @GET("player_api.php")
    Call<List<GetSeriesStreamCategoriesCallback>> seriesCategories(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4);

    @POST("api")
    Call<TVCodeGenerateCallBack> tvCodeGenerate(@Body JsonObject jsonObject);

    @POST("api")
    Call<TVCodeVerifyCallBack> tvCodeVerify(@Body JsonObject jsonObject);

    @POST("api")
    Call<UpdateStorageAccessCallback> updateAppStorageAccess(@Body JsonObject jsonObject);

    @FormUrlEncoded
    @POST("/includes/smartersapi/api.php")
    Call<BillingUpdateDevicesCallback> updateDevice(@Field("a") String str, @Field("e") String str2, @Field("sc") String str3, @Field("s") String str4, @Field("r") String str5, @Field("u") int i9, @Field("action") String str6, @Field("m") String str7, @Field("newmac") String str8, @Field("newdevicename") String str9);

    @POST("modules/addons/ActivationCoder/response.php")
    Call<ActivationCallBack> validateAct(@Body JsonObject jsonObject);

    @GET("player_api.php")
    Call<LoginCallback> validateLogin(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3);

    @GET("portal.php")
    Call<StalkerTokenCallback> validateLoginAccessTokenStalker(@Header(SM.COOKIE) String str, @Query("type") String str2, @Query("action") String str3);

    @GET("portal.php")
    Call<StalkerProfilesCallback> validateLoginProfilesStalker(@Header(SM.COOKIE) String str, @Header("Authorization") String str2, @Query("type") String str3, @Query("action") String str4);

    @GET("player_api.php")
    Call<List<VodCategoriesCallback>> vodCategories(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4);

    @GET("player_api.php")
    Call<VodInfoCallback> vodInfo(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4, @Query("vod_id") int i9);

    @GET("player_api.php")
    Call<List<VodStreamsCallback>> vodStreams(@Header("Content-Type") String str, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str2, @Query(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str3, @Query("action") String str4, @Query("category_id") String str5);
}

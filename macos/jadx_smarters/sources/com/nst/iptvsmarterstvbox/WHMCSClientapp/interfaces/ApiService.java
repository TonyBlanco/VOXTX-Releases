package com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.BuyNowModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.DepartmentClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.LoginWHMCSModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.OpenDepartmentClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.ServicesIncoiveTicketCoutModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.TickedMessageModelClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import com.nst.iptvsmarterstvbox.model.FreeTrailModelClass;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
public interface ApiService {
    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<TickedMessageModelClass> a(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("ticketid") String str5);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<TicketModelClass> b(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("clientid") int i9);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<DepartmentClass> c(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("clientid") int i9);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<ArrayList<ActiveServiceModelClass>> d(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("clientid") int i9, @Field("status") String str5);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<OpenDepartmentClass> e(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("message") String str4, @Field("deptid") String str5, @Field("clientid") int i9, @Field("subject") String str6);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<LoginWHMCSModelClass> f(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str5, @Field(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str6);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<BuyNowModelClass> g(@Field("api_username") String str, @Field("api_password") String str2, @Field(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str3, @Field(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str4, @Field("command") String str5, @Field("custom") String str6, @Field("clientid") int i9);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<ServicesIncoiveTicketCoutModelClass> h(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("clientid") int i9);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<TicketModelClass> i(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("message") String str5, @Field("clientid") int i9, @Field("ticketid") String str6);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<InvoicesModelClass> j(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("userid") int i9, @Field("status") String str5);

    @FormUrlEncoded
    @POST("modules/addons/AppProducts/response.php")
    Call<FreeTrailModelClass> k(@Field("api_username") String str, @Field("api_password") String str2, @Field("command") String str3, @Field("custom") String str4, @Field("emailaddress") String str5, @Field(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME) String str6, @Field(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) String str7, @Field("activation_code") String str8, @Field("app_package") String str9);
}

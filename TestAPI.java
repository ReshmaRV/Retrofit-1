package hotelapp.syntaxsoft.com.hotelapp;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by user22 on 7/16/2018.
 */

public interface TestAPI {
    @FormUrlEncoded
    @POST("/reshmacodes/controller.php")
    public void insertUser(
            @Field("key") String key,
            @Field("name") String name,
            @Field("username") String username,
            @Field("password") String password,
            @Field("email") String email,
            Callback<Response> callback);


}

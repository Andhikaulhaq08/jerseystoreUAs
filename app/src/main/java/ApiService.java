import com.example.myapplication.MainActivity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Field;

public interface ApiService {

    @FormUrlEncoded
    @POST("login.php")
    Call<MainActivity> login(
            @Field("email") String email,
            @Field("password") String password
    );

    // Tambah endpoint lain kalau mau
}

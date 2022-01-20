
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface FoodAPI {
    String FOOD_DATA_URL = "https://raw.githubusercontent.com/theoyuncu8/data/gh-pages/";
    @Headers("Content-Type: application/json")
    @GET("FoodLIST.json")
    Call<MyData>  getAllData();
}


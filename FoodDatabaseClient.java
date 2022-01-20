

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

@SuppressLint("StaticFieldLeak")
public class FoodDatabaseClient {
    private String DB_NAME = "FoodDatabase";
    private Context context;
    @SuppressLint("StaticFieldLeak")
    private static FoodDatabaseClient mInstance;

    public FoodDatabase appDatabase;

    public FoodDatabaseClient(Context context) {
        this.context = context;
        appDatabase = Room.databaseBuilder(context, FoodDatabase.class, DB_NAME).build();
    }

    public static synchronized FoodDatabaseClient getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new FoodDatabaseClient(context);
        }
        return mInstance;
    }

    public FoodDatabase getAppDatabase() {
        return appDatabase;
    }


}
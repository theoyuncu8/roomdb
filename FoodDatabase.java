
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Foods.class}, version = 1)
public abstract class FoodDatabase extends RoomDatabase {
    public abstract DaoAccess daoAccess();
}

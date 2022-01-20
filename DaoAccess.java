

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DaoAccess {
    @Query("SELECT * FROM food_data")
    List<Foods> getAll();

    @Insert
    void insert(Foods task);

    @Delete
    void delete(Foods task);

    @Update
    void update(Foods task);

}
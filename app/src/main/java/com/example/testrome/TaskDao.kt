import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.testrome.Task

@Dao
interface TaskDao {

    @Insert()
     fun insert(task: Task)

    // Add other CRUD operations here
}

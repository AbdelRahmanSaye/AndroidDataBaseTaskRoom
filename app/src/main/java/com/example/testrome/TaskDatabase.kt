import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testrome.Task

@Database(
    entities = [Task::class], version = 1, exportSchema = true
)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao

    companion object {
        private var database: TaskDatabase? = null
        val nameDataBase : String ="mydatabase"
        fun getdatabase(context: Context): TaskDatabase {

            try {
                if (database == null) {
                    database = Room.databaseBuilder(
                        context.applicationContext, TaskDatabase::class.java, nameDataBase
                    ).allowMainThreadQueries().build()
                }

            } catch (e: Exception) {
                Log.e("", "getdatabase: e = ", e)
            }

            return this.database!!
        }
    }
}







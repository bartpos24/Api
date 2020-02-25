package com.example.api.DAO

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.api.Model.User


@Database(entities = arrayOf(User::class), version = 2, exportSchema = false)
abstract class FarmDatabase : RoomDatabase() {
    abstract fun dao(): Dao


    companion object {
        @Volatile
        private var INSTANCE: FarmDatabase? = null

        fun getInstance(context: Context): FarmDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        FarmDatabase::class.java,
                        "farm_database"
                    )

                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
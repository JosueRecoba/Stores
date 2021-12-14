package com.cursosant.android.stores

import androidx.room.Entity
import androidx.room.PrimaryKey

/****
 * Proyecto: Stores
 *
 *
 * Daniel Fernandez Guarneros 4°A
 *
 * Desarrollo de Software Multiplataforma
 *
 * Diseño para Apps
 ***/
@Entity(tableName = "StoreEntity")
data class StoreEntity(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                       var name: String,
                       var phone: String,
                       var website: String = "",
                       var photoUrl: String,
                       var isFavorite: Boolean = false)

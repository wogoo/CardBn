package br.com.dio.busscard

import android.app.Application
import br.com.dio.busscard.data.AppDatabase
import br.com.dio.busscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}
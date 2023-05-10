package com.example.kotlinnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var navigationController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationController = Navigation.findNavController(this@MainActivity,R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this@MainActivity,navigationController)
    }
        //Geri Dönmek için yukarıda ok çıkartır -> Navigation aksiyon barı
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController,null)

    }

}
package com.workin.lftr

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private var navController: NavController? = null


    //Test before transitioning to nav fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

    }

    fun navigateToCreateNewWorkout () {
        Log.d(TAG, "Activity is navigating to new workout creation ")
        navController?.navigate(R.id.start_new_workout_from_home)
    }
}
package com.workin.lftr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    //Test before transitioning to nav fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                val homeFragment = HomeFragment.newInstance()
                add(R.id.mainFragmentContainerView, homeFragment)
            }
        }
    }

    fun transitionToCreateNewWorkout () {
        supportFragmentManager.commit {

        }
    }
}
package com.mhdridho.uasridho

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayoutMediator
import com.mhdridho.uasridho.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieFragment = MovieFragment()
        val tvFragment = TVFragment()
        val profileFragment = ProfileFragment()

        makeCurrentFragment (movieFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_movie -> makeCurrentFragment(movieFragment)
                R.id.menu_tv -> makeCurrentFragment(tvFragment)
                R.id.menu_profile -> makeCurrentFragment(profileFragment)
            }

            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }

    }
}
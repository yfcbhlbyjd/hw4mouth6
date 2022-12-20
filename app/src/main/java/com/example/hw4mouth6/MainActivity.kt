package com.example.hw4mouth6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.hw4mouth6.databinding.ActivityMainBinding
import com.example.hw4mouth6.fragments.CounterFragment
import com.example.hw4mouth6.fragments.HistoryFragment
import com.example.hw4mouth6.fragments.ResultFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
            CounterFragment(), ResultFragment(), HistoryFragment()
        )
        val adapter = HistoryAdapter(fragments,this)
        binding.viewPager.adapter = adapter
    }

    override fun onBackPressed() {
        if(binding.viewPager.currentItem == 0){
            super.onBackPressed()
        }else{
            binding.viewPager.currentItem = binding.viewPager.currentItem - 1
        }
    }
}
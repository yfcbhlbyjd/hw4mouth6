package com.example.hw4mouth6.fragments

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.hw4mouth6.MainViewModel
import com.example.hw4mouth6.base.BaseFragment
import com.example.hw4mouth6.databinding.FragmentCounterBinding


class CounterFragment : BaseFragment<FragmentCounterBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }
    override fun inflateViewBinding(): FragmentCounterBinding {
        return FragmentCounterBinding.inflate(layoutInflater)
    }
    override fun observe() {}

    override fun initClickListener() {
        binding.plus.setOnClickListener {
            viewModel.increment()
        }
        binding.minus.setOnClickListener {
            viewModel.decrement()
        }
    }
}
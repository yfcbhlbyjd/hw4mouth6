package com.example.hw4mouth6.fragments


import androidx.lifecycle.ViewModelProvider
import com.example.hw4mouth6.MainViewModel
import com.example.hw4mouth6.base.BaseFragment
import com.example.hw4mouth6.databinding.FragmentResultBinding


class ResultFragment: BaseFragment<FragmentResultBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(): FragmentResultBinding {
        return FragmentResultBinding.inflate(layoutInflater)
    }

    override fun observe() {
        viewModel.counter.observe(this){ count ->
            binding.tvCount.text = count.toString()
        }
    }

    override fun initClickListener() {}
}
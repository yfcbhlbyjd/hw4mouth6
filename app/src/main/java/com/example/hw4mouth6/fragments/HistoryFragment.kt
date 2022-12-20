package com.example.hw4mouth6.fragments

import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import com.example.hw4mouth6.MainViewModel
import com.example.hw4mouth6.base.BaseFragment
import com.example.hw4mouth6.databinding.FragmentHistoryBinding

class HistoryFragment: BaseFragment<FragmentHistoryBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun observe() {
        viewModel.mList.observe(this){
            val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
                requireContext(),android.R.layout.simple_list_item_1, it
            )
            binding.lvHistory.adapter = arrayAdapter
        }
    }

    override fun initClickListener() {}
}
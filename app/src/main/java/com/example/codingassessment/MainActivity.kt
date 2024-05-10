package com.example.codingassessment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.codingassessment.databinding.LayoutActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LayoutActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.button.setOnClickListener {
            viewModel.onOkButtonClick(binding.editText.text.toString())
            binding.editText.clearFocus()
        }
    }
}


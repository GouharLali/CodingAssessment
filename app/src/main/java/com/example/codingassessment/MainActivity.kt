package com.example.codingassessment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
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
            viewModel.onOkButtonClick()
        }

        // Find the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Make the vertical scrollbar always visible
        ViewCompat.setNestedScrollingEnabled(recyclerView, false)
        recyclerView.isVerticalScrollBarEnabled = true
    }
}

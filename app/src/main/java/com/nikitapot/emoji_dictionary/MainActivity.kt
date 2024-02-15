package com.nikitapot.emoji_dictionary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.nikitapot.emoji_dictionary.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var layoutManager : GridLayoutManager
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: EmojiAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        layoutManager = GridLayoutManager(this,4)
        binding.recyclerView.layoutManager = layoutManager
        adapter = EmojiAdapter(arrayListOf("👍","🐒","🎂","🏖","🌆"))
        binding.recyclerView.adapter = adapter
    }
}

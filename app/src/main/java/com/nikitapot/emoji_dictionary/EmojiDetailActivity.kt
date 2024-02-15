package com.nikitapot.emoji_dictionary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikitapot.emoji_dictionary.databinding.ActivityEmojiDetailBinding

class EmojiDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmojiDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmojiDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val emoji = intent.extras?.getString("emoji")
        binding.EmojiDetailTextView.text = emoji
    }
}

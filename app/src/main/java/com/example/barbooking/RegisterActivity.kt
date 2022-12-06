package com.example.barbooking

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class RegisterActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_register)

    register_text_2.setOnClickListener {
      val intent = Intent(this, MainActivity::class.java)
      startActivity(intent)
    }

    val animationDrawable = constraintLayout.background as AnimationDrawable
    animationDrawable.apply {
      setEnterFadeDuration(1000)
      setExitFadeDuration(2000)
      start()
    }
  }
}
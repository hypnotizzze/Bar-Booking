package com.example.barbooking

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  val TAG: String = "MainActivity"

  lateinit var LoginInput_1: TextInputEditText
  lateinit var PasswordInput_1: TextInputEditText

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    register_text_2.setOnClickListener {
      val intent = Intent(this, RegisterActivity::class.java)
      startActivity(intent)
    }

    enter_button_1.setOnClickListener {
      val intent = Intent(this, Search_Bar_Activity::class.java)
      startActivity(intent)
    }

    val animationDrawable = constraintLayout.background as AnimationDrawable
    animationDrawable.apply {
      setEnterFadeDuration(1000)
      setExitFadeDuration(2000)
      start()
    }
    initViews()
  }

  fun initViews() {
    //val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
    //setSupportActionBar(toolbar)

    LoginInput_1 = findViewById(R.id.text_input_edit_login_1)
    PasswordInput_1 = findViewById(R.id.text_input_edit_search)

  }
}
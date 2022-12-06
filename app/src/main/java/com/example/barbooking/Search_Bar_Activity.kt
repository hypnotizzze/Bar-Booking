package com.example.barbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_search_bar.*

class Search_Bar_Activity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_search_bar)

    personal_account_logo.setOnClickListener {
      val intent = Intent(this, Personal_Account_Activity::class.java)
      startActivity(intent)
    }
  }
}
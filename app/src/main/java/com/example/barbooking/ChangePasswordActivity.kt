package com.example.barbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_change_password.*
import kotlinx.android.synthetic.main.activity_personal_account.*

class ChangePasswordActivity : AppCompatActivity() {

  val duration = Toast.LENGTH_SHORT

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_change_password)

    button_confirm_pass_change.setOnClickListener {
      val intent = Intent(this, Search_Bar_Activity::class.java)
      startActivity(intent)

      val passwordChanged = getString(R.string.password_changed)
      val toast = Toast.makeText(applicationContext, passwordChanged, duration)
      toast.show()
    }

    button_cancel_pass_change.setOnClickListener {
      val intent = Intent(this, Personal_Account_Activity::class.java)
      startActivity(intent)
    }
  }
}
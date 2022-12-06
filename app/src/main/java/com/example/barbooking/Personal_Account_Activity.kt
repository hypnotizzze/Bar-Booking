package com.example.barbooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_personal_account.*
import kotlinx.android.synthetic.main.activity_search_bar.*

class Personal_Account_Activity : AppCompatActivity() {
  lateinit var nameView: TextView
  lateinit var surnameView: TextView
  lateinit var phoneView: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_personal_account)

    val nameString : String = getString(R.string.name)
    val surnameString : String = getString(R.string.surname)
    val phoneString : String = getString(R.string.login_string)

    val nameInfo = "Василий"
    val surnameInfo = "Петров"
    val phoneInfo = "88007775535"

    nameView = findViewById(R.id.personal_name_2)
    surnameView = findViewById(R.id.personal_surname_2)
    phoneView = findViewById(R.id.personal_phone_2)

    nameView.text = nameInfo
    surnameView.text = surnameInfo
    phoneView.text = phoneInfo

    personal_change_password.setOnClickListener {
      val intent = Intent(this, ChangePasswordActivity::class.java)
      startActivity(intent)
    }

    personal_exit.setOnClickListener {
      val intent = Intent(this, Search_Bar_Activity::class.java)
      startActivity(intent)
    }
  }
}
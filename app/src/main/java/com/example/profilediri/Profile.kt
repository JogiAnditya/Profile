package com.example.profilediri

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        ambilData()
    }

    private fun ambilData() {
        val bundle = intent.extras

        val nama = bundle?.getString("nama")
        val gender = bundle?.getString("gender")
        val email = bundle?.getString( "email")
        val telp = bundle?.getString( "telp")
        val address = bundle?.getString("address")

        txtName.text = nama
        edtGender.text = gender
        txtEmail.text = email
        txtTelp.text = telp
        txtAddress.text = address
    }

}

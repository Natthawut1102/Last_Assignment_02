package com.example.last_assignment_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.last_assignment_02.Login
import com.example.last_assignment_02.Member
import com.example.last_assignment_02.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        if (auth!!.currentUser != null){
            val it = Intent(this, Member::class.java)
            startActivity(it)
            finish()
        }

        cmdLoginWithEmail.setOnClickListener {
            val it = Intent(this, Login::class.java)
            startActivity(it)
        }
    }
}
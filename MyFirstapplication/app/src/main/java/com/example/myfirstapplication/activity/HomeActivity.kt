package com.example.myfirstapplication.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.GotoframelayoutActivity
import com.example.myfirstapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonclick()

    }

    fun framelayoutdddd(view: View) {
        val intent = Intent(this, GotoframelayoutActivity::class.java)
        startActivity(intent)

    }

    private fun buttonclick() {

        binding.gotoframelayoutBtn.setOnClickListener {
            val intent = Intent(this, GotoframelayoutActivity::class.java)
            startActivity(intent)
        }

        binding.gotoconstraintLayout.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
        }
        binding.RelativelayoutBtn.setOnClickListener {
            val intent = Intent(this, RelativelayoutActivity::class.java)
            startActivity(intent)
        }
        binding.gotolinearlayoutBtn.setOnClickListener {
            val intent = Intent(this, LinearlayoutActivity::class.java)
            startActivity(intent)
        }

    }
}
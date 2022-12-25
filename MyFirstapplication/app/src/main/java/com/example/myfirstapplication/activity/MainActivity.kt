package com.example.myfirstapplication.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.R
import com.example.myfirstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBlink.setOnClickListener {
            val animationBlink=AnimationUtils.loadAnimation(this,R.anim.blink)
            binding.Edittext.startAnimation(animationBlink)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.profile->{
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
            }
            R.id.home->{
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
            }
            R.id.setting->{
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
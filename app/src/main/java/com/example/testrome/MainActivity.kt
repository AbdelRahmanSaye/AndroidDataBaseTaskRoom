package com.example.testrome


import TaskDatabase
import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.testrome.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        stratFragment()


        }

    private fun stratFragment(){
        binding.b1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame ,BlankFragment(),"").addToBackStack("").commit()

        }
    }
/*
    private fun stratDataBase() {
        try {
            var text1= binding.tx1.text.toString().trim()
            var text2 = binding.tx2.text.toString().trim()
            if(text1.isEmpty()&& text2.isEmpty())
            {
                Toast.makeText(this, "the text1 and text2 is empty", Toast.LENGTH_SHORT).show()
            }
            else {
                TaskDatabase.getdatabase(this).taskDao()
                    .insert(Task(title = text1, description = text2))
            }} catch (e:Exception)
        {
            Log.e("", "stratDataBase: e",e )
        }

    }

 */


}


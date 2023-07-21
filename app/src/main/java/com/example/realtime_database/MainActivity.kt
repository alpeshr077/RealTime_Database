package com.example.realtime_database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realtime_database.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbRef = FirebaseDatabase.getInstance().reference




        binding.btnSubmit.setOnClickListener {

        var name = binding.txtName.text.toString()
        var address = binding.txtAddress.text.toString()
        var number = binding.Number.text.toString()
        var key = dbRef.root.push().key
        var model = DataModel(key!!,name, address, number)

            dbRef.root.child("Data").child(key!!).setValue(model)
        }

    }
}
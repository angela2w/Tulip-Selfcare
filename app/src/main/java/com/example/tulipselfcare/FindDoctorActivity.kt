package com.example.tulipselfcare

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_find_doctor.cardFDBack
import kotlinx.android.synthetic.main.activity_find_doctor.cardFDCardiologist
import kotlinx.android.synthetic.main.activity_find_doctor.cardFDDentist
import kotlinx.android.synthetic.main.activity_find_doctor.cardFDDietician
import kotlinx.android.synthetic.main.activity_find_doctor.cardFDFamilyDoctor
import kotlinx.android.synthetic.main.activity_find_doctor.cardFDSurgeon

class FindDoctorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_doctor)

        cardFDBack.setOnClickListener {
            startActivity(Intent(this,FindDoctorActivity::class.java))
        }

        cardFDFamilyDoctor.setOnClickListener {
            val intent = Intent(this, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Family Doctor")
            startActivity(intent)
        }

        cardFDDentist.setOnClickListener {
            val intent = Intent(this, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Dentist")
            startActivity(intent)
        }

        cardFDCardiologist.setOnClickListener {
            val intent = Intent(this, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Cardiologist")
            startActivity(intent)
        }

        cardFDDietician.setOnClickListener {
            val intent = Intent(this, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Dietician")
            startActivity(intent)
        }

        cardFDSurgeon.setOnClickListener {
            val intent = Intent(this, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Surgeon")
            startActivity(intent)
        }


    }
}
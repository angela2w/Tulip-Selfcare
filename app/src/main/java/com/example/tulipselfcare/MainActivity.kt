package com.example.tulipselfcare

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.cardBuyMedicine
import kotlinx.android.synthetic.main.activity_main.cardFindDoctor
import kotlinx.android.synthetic.main.activity_main.cardHealthArticles
import kotlinx.android.synthetic.main.activity_main.cardLabTest
import kotlinx.android.synthetic.main.activity_main.cardLogOut
import kotlinx.android.synthetic.main.activity_main.cardOrderDetails

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardLabTest.setOnClickListener {
            startActivity(Intent(this,LabTestActivity::class.java))
        }
        cardBuyMedicine.setOnClickListener {
            startActivity(Intent(this,BuyMedicineActivty::class.java))
        }
        cardFindDoctor.setOnClickListener {
            startActivity(Intent(this,FindDoctorActivity::class.java))
        }
        cardHealthArticles.setOnClickListener {
            startActivity(Intent(this,HealthArticlesActivity::class.java))
        }
        cardOrderDetails.setOnClickListener {
            startActivity(Intent(this,OrderDetailsActivity::class.java))
        }
        cardLogOut.setOnClickListener {
            startActivity(Intent(this,LogInActivity::class.java))
        }




    }
}

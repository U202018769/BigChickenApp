package com.grupo.bigchickenapp.activities
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.grupo.bigchickenapp.R
import com.grupo.bigchickenapp.utils.MSPTextViewBold

//import kotlinx.android.synthetic.main.activity_login.*


/**
 * Login Screen of the application.
 */
@Suppress("DEPRECATION")
class LoginActivity : AppCompatActivity() {


    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)


        //window.setFlags(
           // WindowManager.LayoutParams.FLAG_FULLSCREEN,
            //WindowManager.LayoutParams.FLAG_FULLSCREEN
        //)




        val tvregister = findViewById<MSPTextViewBold>(R.id.tv_register)

        tvregister.setOnClickListener {
           val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
         startActivity(intent)
        }


        }

    }

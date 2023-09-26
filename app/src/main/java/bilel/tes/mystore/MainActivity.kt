package bilel.tes.mystore

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import bilel.tes.mystore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //Thread.sleep(3000)
        installSplashScreen()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

             binding.registerac.setOnClickListener {
           var intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.forget.setOnClickListener {
            var intent=Intent(this,Forgetpassword::class.java)
            startActivity(intent)
        }





    }
}
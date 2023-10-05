package bilel.tes.mystore


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher

import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import bilel.tes.mystore.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //Thread.sleep(3000)
        installSplashScreen()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Snackbar.make(binding.root,"Coming soon :)", Snackbar.LENGTH_LONG).show()

             binding.registerac.setOnClickListener {
           var intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.forget.setOnClickListener {
            var intent=Intent(this,Forgetpassword::class.java)
            startActivity(intent)
        }

        binding.emaill.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textemail.error = null
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        binding.passwordd.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textpassword.error=null
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        binding.loginbut.setOnClickListener {
            val email = binding.emaill.text.toString().trim()
            val pass = binding.passwordd.text.toString().trim()

            if (email.isEmpty() && pass.isEmpty()){
                binding.textemail.error = "Must not be empty"
                binding.textpassword.error="Must not be empty"
                return@setOnClickListener
            }
            if(email.isEmpty()) {
                binding.textemail.error = "Must not be empty"
                return@setOnClickListener
            }
            if (pass.isEmpty()){
                binding.textpassword.error="Must not be empty"
                return@setOnClickListener
            }
                startActivity(Intent(this,AfterLogin::class.java));
        }

    }

}
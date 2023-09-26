package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bilel.tes.mystore.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.submit.setOnClickListener {
           startActivity(Intent(this,MainActivity::class.java))
        }

        binding.retour.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

        }

    }
}
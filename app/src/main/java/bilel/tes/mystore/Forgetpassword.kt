package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bilel.tes.mystore.databinding.ActivityForgetpasswordBinding
import bilel.tes.mystore.databinding.ActivityMainBinding

class Forgetpassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetpasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityForgetpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.retourforget.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding.submitforget.setOnClickListener {
            startActivity(Intent(this,Entrycode::class.java))
        }


    }
}
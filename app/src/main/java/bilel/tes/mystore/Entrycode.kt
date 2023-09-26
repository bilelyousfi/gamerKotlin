package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bilel.tes.mystore.databinding.ActivityEntrycodeBinding
import bilel.tes.mystore.databinding.ActivityMainBinding


class Entrycode : AppCompatActivity() {
    private lateinit var binding: ActivityEntrycodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEntrycodeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.retourcode.setOnClickListener {
            startActivity(Intent(this,Forgetpassword::class.java))
        }
        binding.verifycode.setOnClickListener {
            startActivity(Intent(this,Newpassword::class.java))
        }


    }
}
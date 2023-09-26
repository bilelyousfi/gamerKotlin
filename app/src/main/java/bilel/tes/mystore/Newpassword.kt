package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bilel.tes.mystore.databinding.ActivityMainBinding
import bilel.tes.mystore.databinding.ActivityNewpasswordBinding

class Newpassword : AppCompatActivity() {
    private lateinit var binding: ActivityNewpasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNewpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.retournewpass.setOnClickListener {
            startActivity(Intent(this,Entrycode::class.java))
        }
        binding.submitnewpass.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
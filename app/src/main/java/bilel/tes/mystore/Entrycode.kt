package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bilel.tes.mystore.databinding.ActivityEntrycodeBinding
import bilel.tes.mystore.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class Entrycode : AppCompatActivity() {
    private lateinit var binding: ActivityEntrycodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEntrycodeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.retourcode.setOnClickListener {
            startActivity(Intent(this,Forgetpassword::class.java))
        }
       // startActivity(Intent(this,Newpassword::class.java))

        binding.verifycode.setOnClickListener {
            val num1 =binding.editTextNumber1.text.toString().trim()
            val num2= binding.editTextNumber2.text.toString().trim()
            val num3 = binding.editTextNumber3.text.toString().trim()
            val num4 = binding.editTextNumber4.text.toString().trim()

            if (num1.isEmpty() && num2.isEmpty() && num3.isEmpty() && num4.isEmpty()){
                Snackbar.make(binding.root,"Wrong code!!",Snackbar.LENGTH_LONG).show()
            }
            if(num1 != "1"){
                Snackbar.make(binding.root,"Wrong code!!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (num2 != "2"){
                Snackbar.make(binding.root,"Wrong code!!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (num3 != "3"){
                Snackbar.make(binding.root,"Wrong code!!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (num4 != "4"){
                Snackbar.make(binding.root,"Wrong code!!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            startActivity(Intent(this,Newpassword::class.java))

        }


    }
}
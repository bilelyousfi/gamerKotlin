package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import bilel.tes.mystore.databinding.ActivityForgetpasswordBinding
import bilel.tes.mystore.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class Forgetpassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetpasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityForgetpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.retourforget.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding.buttonsms.setOnClickListener {
            val email =binding.send.text.toString().trim()

            if (email.isEmpty()){
                binding.textsend.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
            }else {
                startActivity(Intent(this, Entrycode::class.java))
            }
            }


        binding.send.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textsend.error=null
            }
        })




        binding.submitforget.setOnClickListener {
            val email =binding.send.text.toString().trim()

            if (email.isEmpty()){
                binding.textsend.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
            }else {
                startActivity(Intent(this, Entrycode::class.java))
            }
        }


    }
}
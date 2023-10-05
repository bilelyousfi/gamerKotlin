package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import bilel.tes.mystore.databinding.ActivityMainBinding
import bilel.tes.mystore.databinding.ActivityNewpasswordBinding
import com.google.android.material.snackbar.Snackbar

class Newpassword : AppCompatActivity() {
    private lateinit var binding: ActivityNewpasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNewpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backnewpass.setOnClickListener {
            startActivity(Intent(this,Entrycode::class.java))
        }

        binding.newpass.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textnewpass.error=null

            }

            override fun afterTextChanged(s: Editable?) {}
        })

        binding.Copass.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable?) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               binding.textcpassss.error=null
            }
        })

        binding.submitnewpass.setOnClickListener {
            val pass= binding.newpass.text.toString().trim()
            val Npass= binding.Copass.text.toString().trim()

            if (pass.isEmpty() && Npass.isEmpty()){
                binding.textnewpass.error="Must not be empty"
                binding.textcpassss.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass != Npass){
                binding.textcpassss.error="Must be the same password!!"
                binding.textnewpass.error="Must be the same password!!"
                return@setOnClickListener
            }
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
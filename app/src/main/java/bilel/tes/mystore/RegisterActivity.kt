package bilel.tes.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import bilel.tes.mystore.databinding.ActivityRegisterBinding
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Snackbar.make(binding.root,"Coming soon :)", Snackbar.LENGTH_LONG).show()
        //


        binding.retour.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

        }

        binding.fullname.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textfullname.error=null
                if (binding.fullname.length() < 6){
                    binding.textfullname.error="Must be a at least 6 characters!"
                }
            }
        })

        binding.emailll.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.Inputemail.error=null
            }
        })

        binding.passsword.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.Inputpassword.error=null

            }
        })

        binding.Cpass.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textcpass.error=null
            }
        })



        binding.submit.setOnClickListener {
            val fullname = binding.fullname.text.toString().trim()
            val email = binding.emailll.text.toString().trim()
            val pass = binding.passsword.text.toString().trim()
            val cpass = binding.Cpass.text.toString().trim()

            if (fullname.isEmpty() && email.isEmpty() && pass.isEmpty() && cpass.isEmpty()){
                binding.textfullname.error="Must not be empty"
                binding.Inputemail.error="Must not be empty"
                binding.Inputpassword.error="Must not be empty"
                binding.textcpass.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
             if (fullname.isEmpty()){
                binding.textfullname.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (email.isEmpty()){
                binding.Inputemail.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass.isEmpty()){
                binding.Inputpassword.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (cpass.isEmpty()){
                binding.textcpass.error="Must not be empty"
                Snackbar.make(binding.root,"You have some errors in your inputs!",Snackbar.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (pass != cpass){
                binding.Inputpassword.error="Must be the same password"
                binding.textcpass.error="Must be the same password"
                return@setOnClickListener
            }else {

                startActivity(Intent(this, MainActivity::class.java))
            }
        }

    }
}
package th.ac.su.karunpon.simpleloancalculator

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page.*

class PageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)

        var bath = intent.getDoubleExtra("price",0.0)
        number.text = bath.toString()

        btback.setOnClickListener{
            setResult(Activity.RESULT_OK, intent)

            finish()

        }
    }
}
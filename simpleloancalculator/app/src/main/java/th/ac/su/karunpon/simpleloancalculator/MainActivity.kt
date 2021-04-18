package th.ac.su.karunpon.simpleloancalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.contentcapture.DataShareWriteAdapter
import android.widget.ArrayAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_three.*
import th.ac.su.karunpon.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.karunpon.simpleloancalculator.data.Data
import th.ac.su.karunpon.simpleloancalculator.data.DataAdapter

class MainActivity : AppCompatActivity() {


    companion object{
        const val dt = 1000
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var price = 0.00


        bt1.setOnClickListener {
            var m = money.text.toString().toInt()
            var d = interest.text.toString().toInt()
            var y = year.text.toString().toInt()


            price = (m+(m*(d/100)*y))/(y*12).toDouble()



            var intent = Intent(this@MainActivity, PageActivity::class.java)
            intent.putExtra("price",price)

            startActivityForResult(intent, dt)
        }
        bt2.setOnClickListener {
            var intent = Intent(this@MainActivity, ThreeActivity::class.java)

            startActivityForResult(intent, dt)
        }
    }
}
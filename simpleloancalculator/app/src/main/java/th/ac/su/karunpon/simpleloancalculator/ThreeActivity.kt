package th.ac.su.karunpon.simpleloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_three.*
import th.ac.su.karunpon.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.karunpon.simpleloancalculator.data.Data
import th.ac.su.karunpon.simpleloancalculator.data.DataAdapter

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val jsonFileString =
            getJsonDataFromAsset(applicationContext, fileName = "promotion.json")

        //Log.i("ghjk", jsonFileString!!)

        val gson = Gson()
        val listItemType = object : TypeToken<ArrayList<Data>>() {}.type
        var DataList: ArrayList<Data> = gson.fromJson(jsonFileString, listItemType)

        var itemList: ArrayList<Data> = ArrayList<Data>()
        lateinit var arrayAdapter: ArrayAdapter<Data>

        itemList = DataList

        val adapter = DataAdapter(this@ThreeActivity, itemList)

        listView.adapter = adapter


    }
}
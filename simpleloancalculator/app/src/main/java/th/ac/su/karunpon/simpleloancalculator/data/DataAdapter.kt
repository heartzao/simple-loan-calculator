package th.ac.su.karunpon.simpleloancalculator.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item.view.*
import kotlinx.android.synthetic.main.list_item.view.*
import th.ac.su.karunpon.simpleloancalculator.R
import java.util.zip.Inflater
import javax.sql.CommonDataSource

class DataAdapter(private val context: Context,
                  private val dataSource: ArrayList<Data>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val rowView = inflater.inflate(R.layout.list_item, null)

        rowView.namesi.text = dataSource[position].promo_name
        rowView.namenum.text = "promotion code :"+dataSource[position].promo_code.toString()
        rowView.namede.text = dataSource[position].promo_description



        //rowView.img.setImageResource(dataSource[position].imageFile)

        val res = context.resources
        val drawableId: Int =
            res.getIdentifier(dataSource[position].imageFile, "drawable", context.packageName)

        rowView.img.setImageResource(drawableId)

        return rowView
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return dataSource.size
    }

}
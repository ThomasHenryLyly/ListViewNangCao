package teo.android.listviewnangcao

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MonAnAdapter constructor(var context: Context, var monAnList: ArrayList<MonAn>) : BaseAdapter (){

    class ViewHolder(row: View){
        var txtMonAn: TextView
        var imgHinh: ImageView

        init {
            txtMonAn = row.findViewById(R.id.txtTenMonAn)
            imgHinh = row.findViewById(R.id.imgHinh)
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder: ViewHolder

        if (convertView == null){
            var layoutInflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.dong_mon_an, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        var monAn : MonAn = getItem(position) as MonAn

        viewHolder.txtMonAn.text = monAn.ten
        viewHolder.imgHinh.setImageResource(monAn.hinh)

        return view as View

    }

    override fun getItem(position: Int): Any {
        return monAnList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return monAnList.size
    }
}
package teo.android.listviewnangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var monAnList: ArrayList<MonAn> = ArrayList()

        monAnList.add(MonAn("Cuon bun", R.drawable.m1))
        monAnList.add(MonAn("Trứng kho", R.drawable.m2))
        monAnList.add(MonAn("Gà chiên", R.drawable.m3))
        monAnList.add(MonAn("Bánh xèo", R.drawable.m4))

        listView.adapter = MonAnAdapter(this, monAnList)

    }
}

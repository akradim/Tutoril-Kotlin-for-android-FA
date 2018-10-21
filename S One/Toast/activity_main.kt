package ir.pertech.kotlinone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
        fun changePic(view: View){
//            تغییر تصویر با زدن کلیک 
            imageView.setImageResource(R.drawable.two)
//            نمایش پیغام تغییر
            Toast.makeText(this, "تصویر تغییر کرد", Toast.LENGTH_LONG).show()
        }
    
}

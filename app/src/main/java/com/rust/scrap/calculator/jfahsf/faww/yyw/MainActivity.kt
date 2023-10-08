package com.rust.scrap.calculator.jfahsf.faww.yyw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val plus3 = findViewById<Button>(R.id.plus3)
        val minus3 = findViewById<Button>(R.id.minus3)
        val text3 = findViewById<TextView>(R.id.text3)
        var scr3: Int = 0
        plus3.setOnClickListener {
            scr3+=1
            text3.text = scr3.toString()
        }
        minus3.setOnClickListener {
            scr3-=1
            text3.text = scr3.toString()
        }

        val plus4 = findViewById<Button>(R.id.plus4)
        val minus4 = findViewById<Button>(R.id.minus4)
        val text4 = findViewById<TextView>(R.id.text4)
        var scr4: Int = 0
        plus4.setOnClickListener {
            scr4+=1
            text4.text = scr4.toString()
        }
        minus4.setOnClickListener {
            scr4-=1
            text4.text = scr4.toString()
        }

        val plus5 = findViewById<Button>(R.id.plus5)
        val minus5 = findViewById<Button>(R.id.minus5)
        val text5 = findViewById<TextView>(R.id.text5)
        var scr5: Int = 0
        plus5.setOnClickListener {
            scr5+=1
            text5.text = scr5.toString()
        }
        minus5.setOnClickListener {
            scr5-=1
            text5.text = scr5.toString()
        }

        val plus6 = findViewById<Button>(R.id.plus6)
        val minus6 = findViewById<Button>(R.id.minus6)
        val text6 = findViewById<TextView>(R.id.text6)
        var scr6: Int = 0
        plus6.setOnClickListener {
            scr6+=1
            text6.text = scr6.toString()
        }
        minus6.setOnClickListener {
            scr6-=1
            text6.text = scr6.toString()
        }

        val plus7 = findViewById<Button>(R.id.plus7)
        val minus7 = findViewById<Button>(R.id.minus7)
        val text7 = findViewById<TextView>(R.id.text7)
        var scr7: Int = 0
        plus7.setOnClickListener {
            scr7+=1
            text7.text = scr7.toString()
        }
        minus7.setOnClickListener {
            scr7-=1
            text7.text = scr7.toString()
        }

        val plus8 = findViewById<Button>(R.id.plus8)
        val minus8 = findViewById<Button>(R.id.minus8)
        val text8 = findViewById<TextView>(R.id.text8)
        var scr8: Int = 0
        plus8.setOnClickListener {
            scr8+=1
            text8.text = scr8.toString()
        }
        minus8.setOnClickListener {
            scr8-=1
            text8.text = scr8.toString()
        }





        val plus11 = findViewById<Button>(R.id.plus11)
        val minus11 = findViewById<Button>(R.id.minus11)
        val text11 = findViewById<TextView>(R.id.text11)
        var scr11: Int = 0
        plus11.setOnClickListener {
            scr11+=1
            text11.text = scr11.toString()
        }
        minus11.setOnClickListener {
            scr11-=1
            text11.text = scr11.toString()
        }

        val plus12 = findViewById<Button>(R.id.plus12)
        val minus12 = findViewById<Button>(R.id.minus12)
        val text12 = findViewById<TextView>(R.id.text12)
        var scr12: Int = 0
        plus12.setOnClickListener {
            scr12+=1
            text12.text = scr12.toString()
        }
        minus12.setOnClickListener {
            scr12-=1
            text12.text = scr12.toString()
        }

        val plus13 = findViewById<Button>(R.id.plus13)
        val minus13 = findViewById<Button>(R.id.minus13)
        val text13 = findViewById<TextView>(R.id.text13)
        var scr13: Int = 0
        plus13.setOnClickListener {
            scr13+=1
            text13.text = scr13.toString()
        }
        minus13.setOnClickListener {
            scr13-=1
            text13.text = scr13.toString()
        }

        val plus14 = findViewById<Button>(R.id.plus14)
        val minus14 = findViewById<Button>(R.id.minus14)
        val text14 = findViewById<TextView>(R.id.text14)
        var scr14: Int = 0
        plus14.setOnClickListener {
            scr14+=1
            text14.text = scr14.toString()
        }
        minus14.setOnClickListener {
            scr14-=1
            text14.text = scr14.toString()
        }

        val plus15 = findViewById<Button>(R.id.plus15)
        val minus15 = findViewById<Button>(R.id.minus15)
        val text15 = findViewById<TextView>(R.id.text15)
        var scr15: Int = 0
        plus15.setOnClickListener {
            scr15+=1
            text15.text = scr15.toString()
        }
        minus15.setOnClickListener {
            scr15-=1
            text15.text = scr15.toString()
        }
        var fin:Int = 0
        val checkBtn = findViewById<Button>(R.id.checkBtn)
        val checkText = findViewById<TextView>(R.id.checkText)
        checkBtn.setOnClickListener {
            fin = scr3*10+scr4*2+scr5*5+scr6*10+scr7*5+scr8*25+scr11*15+scr12*8+scr13+scr14*15+scr15*10
            checkText.text = fin.toString()
        }
    }
}
package com.jovel.practica1_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovel.practica1_3.databinding.ActivityMainBinding
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        var band1: Int = 12
        var band2: Int = 12
        var band3: Int = 12
        var band4: Int = 12

        //BAND 1
        mainBinding.brown1ImageButton.setOnClickListener {
            band1 = 1
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.red1ImageButton.setOnClickListener {
            band1 = 2
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.orange1ImageButton.setOnClickListener {
            band1 = 3
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.yellow1ImageButton.setOnClickListener {
            band1 = 4
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.green1ImageButton.setOnClickListener {
            band1 = 5
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.blue1ImageButton.setOnClickListener {
            band1 = 6
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.purple1ImageButton.setOnClickListener {
            band1 = 7
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.gray1ImageButton.setOnClickListener {
            band1 = 8
            setResistor(band1, band2, band3, band4)
        }
        mainBinding.white1ImageButton.setOnClickListener {
            band1 = 9
            setResistor(band1, band2, band3, band4)
        }

        //BAND 2

        mainBinding.black2ImageButton.setOnClickListener {
            band2 = 0
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.brown2ImageButton.setOnClickListener {
            band2 = 1
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.red2ImageButton.setOnClickListener {
            band2 = 2
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.orange2ImageButton.setOnClickListener {
            band2 = 3
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.yellow2ImageButton.setOnClickListener {
            band2 = 4
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.green2ImageButton.setOnClickListener {
            band2 = 5
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.blue2ImageButton.setOnClickListener {
            band2 = 6
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.purple2ImageButton.setOnClickListener {
            band2 = 7
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.gray2ImageButton.setOnClickListener {
            band2 = 8
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.white2ImageButton.setOnClickListener {
            band2 = 9
            setResistor(band1, band2, band3, band4)
        }

        //BAND 3

        mainBinding.black3ImageButton.setOnClickListener {
            band3 = 0
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.brown3ImageButton.setOnClickListener {
            band3 = 1
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.red3ImageButton.setOnClickListener {
            band3 = 2
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.orange3ImageButton.setOnClickListener {
            band3 = 3
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.yellow3ImageButton.setOnClickListener {
            band3 = 4
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.green3ImageButton.setOnClickListener {
            band3 = 5
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.blue3ImageButton.setOnClickListener {
            band3 = 6
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.purple3ImageButton.setOnClickListener {
            band3 = 7
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.gray3ImageButton.setOnClickListener {
            band3 = 8
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.white3ImageButton.setOnClickListener {
            band3 = 9
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.golden3ImageButton.setOnClickListener {
            band3 = 10
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.silver3ImageButton.setOnClickListener {
            band3 = 11
            setResistor(band1, band2, band3, band4)
        }

        //BAND 4

        mainBinding.brown4ImageButton.setOnClickListener {
            band4 = 1
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.red4ImageButton.setOnClickListener {
            band4 = 2
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.green4ImageButton.setOnClickListener {
            band4 = 5
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.blue4ImageButton.setOnClickListener {
            band4 = 6
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.purple4ImageButton.setOnClickListener {
            band4 = 7
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.gray4ImageButton.setOnClickListener {
            band4 = 8
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.golden4ImageButton.setOnClickListener {
            band4 = 10
            setResistor(band1, band2, band3, band4)
        }

        mainBinding.silver4ImageButton.setOnClickListener {
            band4 = 11
            setResistor(band1, band2, band3, band4)
        }
    }


    private fun setResistor(band1: Int, band2: Int, band3: Int, band4: Int) {

        var decenas: Int = 12
        var unidades: Int = 12
        var multi: Float = 12F
        var tol: Float = 12F

        //BAND 1
        with(mainBinding.band1ImageView) {
            when (band1) {
                1 -> {
                    setImageResource(R.drawable.browncolor)
                    decenas = 1 * 10
                }
                2 -> {
                    setImageResource(R.drawable.redcolor)
                    decenas = 2 * 10
                }
                3 -> {
                    setImageResource(R.drawable.orangecolor)
                    decenas = 3 * 10
                }
                4 -> {
                    setImageResource(R.drawable.yellowcolor)
                    decenas = 4 * 10
                }
                5 -> {
                    setImageResource(R.drawable.greencolor)
                    decenas = 5 * 10
                }
                6 -> {
                    setImageResource(R.drawable.bluecolor)
                    decenas = 6 * 10
                }
                7 -> {
                    setImageResource(R.drawable.purplecolor)
                    decenas = 7 * 10
                }
                8 -> {
                    setImageResource(R.drawable.graycolor)
                    decenas = 8 * 10
                }
                9 -> {
                    setImageResource(R.drawable.whitecolor)
                    decenas = 9 * 10
                }
                10 -> {
                    setImageResource(R.drawable.goldencolor)
                    decenas = 10 * 10
                }
            }
        }

        //BAND 2
        with(mainBinding.band2ImageView) {
            when (band2) {

                0 -> {
                    setImageResource(R.drawable.blackcolor)
                    unidades = 0
                }
                1 -> {
                    setImageResource(R.drawable.browncolor)
                    unidades = 1
                }
                2 -> {
                    setImageResource(R.drawable.redcolor)
                    unidades = 2
                }
                3 -> {
                    setImageResource(R.drawable.orangecolor)
                    unidades = 3
                }

                4 -> {
                    setImageResource(R.drawable.yellowcolor)
                    unidades = 4
                }
                5 -> {
                    setImageResource(R.drawable.greencolor)
                    unidades = 5
                }
                6 -> {
                    setImageResource(R.drawable.bluecolor)
                    unidades = 6
                }
                7 -> {
                    setImageResource(R.drawable.purplecolor)
                    unidades = 7
                }
                8 -> {
                    setImageResource(R.drawable.graycolor)
                    unidades = 8
                }
                9 -> {
                    setImageResource(R.drawable.whitecolor)
                    unidades = 9
                }
            }
        }

        //BAND 3
        with(mainBinding.band3ImageView) {
            when (band3) {

                0 -> {
                    setImageResource(R.drawable.blackcolor)
                    multi = pow(10.toDouble(),0.toDouble()).toFloat()
                }
                1 -> {
                    setImageResource(R.drawable.browncolor)
                    multi = pow(10.toDouble(),1.toDouble()).toFloat()
                }
                2 -> {
                    setImageResource(R.drawable.redcolor)
                    multi = pow(10.toDouble(),2.toDouble()).toFloat()
                }
                3 -> {
                    setImageResource(R.drawable.orangecolor)
                    multi = pow(10.toDouble(),3.toDouble()).toFloat()
                }

                4 -> {
                    setImageResource(R.drawable.yellowcolor)
                    multi = pow(10.toDouble(),4.toDouble()).toFloat()
                }
                5 -> {
                    setImageResource(R.drawable.greencolor)
                    multi = pow(10.toDouble(),5.toDouble()).toFloat()
                }
                6 -> {
                    setImageResource(R.drawable.bluecolor)
                    multi = pow(10.toDouble(),6.toDouble()).toFloat()
                }
                7 -> {
                    setImageResource(R.drawable.purplecolor)
                    multi = pow(10.toDouble(),7.toDouble()).toFloat()
                }
                8 -> {
                    setImageResource(R.drawable.graycolor)
                    multi = pow(10.toDouble(),9.toDouble()).toFloat()
                }
                9 -> {
                    setImageResource(R.drawable.whitecolor)
                    multi = pow(10.toDouble(),9.toDouble()).toFloat()
                }
                10 -> {
                    setImageResource(R.drawable.goldencolor)
                    multi = 0.1.toFloat()
                }
                11 -> {
                    setImageResource(R.drawable.silvercolor)
                    multi = 0.01.toFloat()
                }
            }
        }

        //BAND 4
        with(mainBinding.band4ImageView) {
            when (band4) {

                1 -> {
                    setImageResource(R.drawable.browncolor)
                    tol = 1.toFloat()
                }
                2 -> {
                    setImageResource(R.drawable.redcolor)
                    tol = 2.toFloat()
                }

                5 -> {
                    setImageResource(R.drawable.greencolor)
                    tol = 0.5.toFloat()
                }
                6 -> {
                    setImageResource(R.drawable.bluecolor)
                    tol = 0.25.toFloat()
                }
                7 -> {
                    setImageResource(R.drawable.purplecolor)
                    tol = 0.1.toFloat()
                }
                8 -> {
                    setImageResource(R.drawable.graycolor)
                    tol = 0.05.toFloat()
                }
                10 -> {
                    setImageResource(R.drawable.goldencolor)
                    tol = 5.toFloat()
                }
                11 -> {
                    setImageResource(R.drawable.silvercolor)
                    tol = 10.toFloat()
                }
            }
        }

        if (decenas != 12 && unidades != 12 && multi != 12.toFloat() && tol != 12.toFloat() ){
            mainBinding.infoTextView.text = ((decenas.toFloat()+unidades)*multi).toString() + "Ω ± " + tol.toString() + "%"
        }
    }
}


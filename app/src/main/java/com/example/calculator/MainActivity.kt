package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit  var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ac.setOnClickListener{
            binding.input.text=""
            binding.output.text=""
        }
        binding.image0.setOnClickListener{
            binding.input.append("0")

        }
        binding.image1.setOnClickListener{
            binding.input.append("1")

        }
        binding.image2.setOnClickListener{
            binding.input.append("2")

        }
        binding.image3.setOnClickListener{
            binding.input.append("3")

        }
        binding.image4.setOnClickListener{
            binding.input.append("4")

        }
        binding.image5.setOnClickListener{
            binding.input.append("5")

        }
        binding.image6.setOnClickListener{
            binding.input.append("6")

        }
        binding.image7.setOnClickListener{
            binding.input.append("7")

        }
        binding.image8.setOnClickListener{
            binding.input.append("8")

        }
        binding.image9.setOnClickListener{
            binding.input.append("9")

        }
       binding.closeBracket.setOnClickListener{
           binding.input.append(")")
       }
        binding.openBracket.setOnClickListener{
           binding.input.append("(")
       }
        binding.minus.setOnClickListener{
           binding.input.append("-")
       }
        binding.plus.setOnClickListener{
           binding.input.append("+")
       }
        binding.product.setOnClickListener{
            binding.input.append("*")
        }
        binding.divide.setOnClickListener{
            binding.input.append("/")
        }
        binding.dot.setOnClickListener{
            binding.input.append(".")
        }
        binding.equal.setOnClickListener {
            val expression=ExpressionBuilder(binding.input.text.toString()).build()
            val result=expression.evaluate()
            val longResult=result.toLong()
            if (result==longResult.toDouble()){
                binding.output.text=longResult.toString()
            }
            else{
                binding.output.text=result.toString()
            }

        }
    }
}
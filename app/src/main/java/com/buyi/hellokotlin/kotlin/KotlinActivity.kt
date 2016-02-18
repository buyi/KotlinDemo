package com.buyi.hellokotlin.kotlin.A.B
//It is not required to match directories and packages: source files can be placed arbitrarily in the file system.

import android.app.Activity
import android.os.Bundle
import com.buyi.hellokotlin.R
import com.buyi.hellokotlin.kotlin.function
//import com.buyi.hellokotlin.R
import kotlinx.android.synthetic.main.activity_kotlin.*
import kotlinx.android.synthetic.main.content_kotlin.*

/**
 * Created by buyi on 16/2/18.
 */
class KotlinActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        this.tvvvvv.setText("jjjj");//text = ;
        this.tvvvvv.text = "kkkkk";

        val a = function();
        System.out.print(a.sum(1,2));
//        this.tv.te
    }
}
package com.niluogege.librarya

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.niluogege.libraryb.LibraryBService
import java.util.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val tv = findViewById<TextView>(R.id.tv)
        findViewById<View>(R.id.btn).setOnClickListener {
            val sl = ServiceLoader.load(LibraryBService::class.java)
            val itt = sl.iterator()
            if (itt.hasNext()) {
                val service = itt.next()
                tv.text =
                    "调用服务成功 LibrayName=${service.getLibrayName()} ApiBean=${service.getApiBean()}"

            }
        }

    }

}
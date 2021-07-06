package com.example.fragmentbestpractice_newsapp

//手机单页显示

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_news_content.*

class NewsContentActivity : AppCompatActivity() {

    companion object{
        fun actionStart(contex: Context, title: String, content: String){       /*传入上下文、标题以及内容，然后打开一个新的Activity，将titile和content附加*/
            val intent = Intent(contex, NewsContentActivity::class.java).apply{
                putExtra("news_title",title)
                putExtra("news_content",content)
            }
            contex.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)

        val title = intent.getStringExtra("news_title")
        val content = intent.getStringExtra("news_content")
        if(title!=null && content!=null){
            val fragment = newsContentFrag as NewsContentFragment   //as：类型转换
            fragment.refresh(title, content)        //获得新activity的title和content实例，将新的内容更新到这两个实例中
        }
    }
}
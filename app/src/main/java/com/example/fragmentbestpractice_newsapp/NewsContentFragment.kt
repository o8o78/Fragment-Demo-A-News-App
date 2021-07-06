package com.example.fragmentbestpractice_newsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.news_content_frag.*

class NewsContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_content_frag, container, false)
    }

    fun refresh(title: String, content: String){
        contentLayout.visibility = View.VISIBLE //contentLayout: LinearLayout的id
        newsTitle.text = title  //从onCreateView方法中加载了news_content_frag布局
        newsContent.text = content
    }

}
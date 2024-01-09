package com.example.tienapplication.tuan312

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.tienapplication.R

class Tuan312Adapter(context: Context, ls:ArrayList<Tuan312Contact>):BaseAdapter() {
    var ls:ArrayList<Tuan312Contact> =ls
    var context: Context = context

    //lay ve tong so item
    override fun getCount(): Int {
        TODO("Not yet implemented")
        return ls.size
    }

    //lay ve item hien tai
    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
        return ls.get(p0)
    }

    //lay id cua item
    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
        return p0.toLong()
    }

    //tao view
    //gan du lieu cho view
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
        var c = p1
        var vax: ViewAX
        if(p1==null){
            vax=ViewAX()

            c=LayoutInflater.from(context).inflate(R.layout.tuan321_items,null)

            vax.img_hinh = c.findViewById(R.id.tuan312Hinh)
            vax.tv_ten = c.findViewById(R.id.tuan312ItemTen)
            vax.tv_tuoi = c.findViewById(R.id.tuan312ItemTuoi)

            c.tag=vax
        }else{
            vax=c!!.tag as ViewAX
        }
        vax.img_hinh!!.setImageResource(ls[p0].hinh!!)
        vax.tv_ten!!.text=ls[p0].ten!!
        vax.tv_tuoi!!.text=ls[p0].tuoi!!


        return c!!
    }
    //khai bao lop anh xa
    inner class ViewAX{
        var img_hinh: ImageView?=null
        var tv_ten: TextView?=null
        var tv_tuoi: TextView?=null
    }
}
package com.niluogege.libraryb

class LibraryBServiceImpl : LibraryBService {
    override fun getLibrayName(): String {
        return "librayB"
    }

    override fun getApiBean(): ApiBean {
        return ApiBean("张三", "18")
    }
}
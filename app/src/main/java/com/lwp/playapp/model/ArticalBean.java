package com.lwp.playapp.model;

import android.text.TextUtils;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class ArticalBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","author":"钉某人","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3321,"link":"https://www.jianshu.com/p/20f16a4b4630","niceDate":"16小时前","origin":"","projectLink":"","publishTime":1535295575000,"superChapterId":193,"superChapterName":"5.+高新技术","tags":[],"title":"你的RecyclerView还可以这样","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"huachao1001","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3320,"link":"https://www.jianshu.com/p/08d998d047d8","niceDate":"16小时前","origin":"","projectLink":"","publishTime":1535294027000,"superChapterId":193,"superChapterName":"5.+高新技术","tags":[],"title":"打造属于你的LayoutManager","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"JerryloveEmily","chapterId":153,"chapterName":"Zygote进程启动","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3319,"link":"https://juejin.im/post/5b8294dff265da432f654244","niceDate":"19小时前","origin":"","projectLink":"","publishTime":1535284864000,"superChapterId":171,"superChapterName":"framework","tags":[],"title":"Android系统启动系列----init进程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Ganart","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"GankIO是基于干货集中营（ http://gank.io ）的开放数据API（ https://gank.io/api ）编写的一个小程序。项目作为个人对微信小程序开发框架的第一个学习项目，对开发组件有较为全面的使用，但仍然有很多不足的地方。","envelopePic":"http://www.wanandroid.com/blogimgs/11eb5bb2-33b7-47dd-8ab8-a85491399f98.png","fresh":true,"id":3317,"link":"http://www.wanandroid.com/blog/show/2312","niceDate":"22小时前","origin":"","projectLink":"https://github.com/Ganart/GankIO","publishTime":1535273569000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"干货集中营微信小程序GankIO","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"meituan","chapterId":385,"chapterName":"架构","collect":false,"courseId":13,"desc":"WMRouter是一款Android路由框架，基于组件化的设计思路，有功能灵活、使用简单的特点。 ","envelopePic":"http://www.wanandroid.com/blogimgs/9990250f-40fb-4f80-8660-bcdaca22fa44.png","fresh":true,"id":3316,"link":"http://www.wanandroid.com/blog/show/2311","niceDate":"22小时前","origin":"","projectLink":"https://github.com/meituan/WMRouter","publishTime":1535273481000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=385"}],"title":"WMRouter：美团外卖Android开源路由框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"mzlogin","chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"ADB Usage Complete / ADB 用法大全\r\n","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":true,"id":3315,"link":"http://www.wanandroid.com/blog/show/2310","niceDate":"22小时前","origin":"","projectLink":"https://github.com/mzlogin/awesome-adb","publishTime":1535273395000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],"title":"速查 | ADB 用法大全","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"工匠若水","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3314,"link":"https://www.jianshu.com/p/08efec596aab","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535215434000,"superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Android应用开发编译框架流程与IDE及Gradle概要","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"腾讯云加社区","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3313,"link":"https://juejin.im/post/5b7e7d236fb9a019b953df97","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535214970000,"superChapterId":77,"superChapterName":"热门专题","tags":[],"title":"让你的app体验更丝滑的11种方法","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"速查小编","chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3312,"link":"http://www.wanandroid.com/blog/show/2309","niceDate":"2天前","origin":"","projectLink":"","publishTime":1535163112000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],"title":"速查 | adb 常用命令","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":274,"chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3310,"link":"http://wl9739.github.io/archives/","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535031480000,"superChapterId":272,"superChapterName":"导航主Tab","tags":[{"name":"导航","url":"/navi#274"}],"title":"Eateeer的笔记屋","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Eateeer的笔记屋","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3309,"link":"http://wl9739.github.io/2017/01/13/Gson-%E4%B8%AD%E6%96%87%E6%8C%87%E5%8D%97/","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535031458000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"Gson中文指南","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3305,"link":"https://www.jianshu.com/p/3108f1e44155","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535030425000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（四）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3308,"link":"https://www.jianshu.com/p/e740196225a4","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535028470000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（一）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3307,"link":"https://www.jianshu.com/p/c88260adaf5e","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535028454000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（二）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3306,"link":"https://www.jianshu.com/p/0e40a52c0063","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535028441000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（三）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"diygreen","chapterId":121,"chapterName":"ViewPager","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3304,"link":"https://www.jianshu.com/p/266861496508","niceDate":"2018-08-22","origin":"","projectLink":"","publishTime":1534947883000,"superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"ViewPager刷新问题详解","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Kane_Wood","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3303,"link":"https://www.jianshu.com/p/fb531239cd79","niceDate":"2018-08-22","origin":"","projectLink":"","publishTime":1534941002000,"superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"Android 使用 lame wav 转 mp3 、pcm 转 mp3 (边录边转)；使用 mad mp3 转 wav、mp3 转 pcm (边播边转)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"skyCracks","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"基于鸿洋大大的wanandroid提供的API, 使用kotlin开发的备忘录APP\r\n\r\n","envelopePic":"http://wanandroid.com/blogimgs/de2de733-e304-4d3f-9cb6-9e37b939a2c7.png","fresh":false,"id":3302,"link":"http://www.wanandroid.com/blog/show/2307","niceDate":"2018-08-22","origin":"","projectLink":"https://github.com/skyCracks/skyTodo","publishTime":1534918189000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"基于Kotlin开发的Todo客户端-skyTodo","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"ywp0919","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"这是一个Flutter项目，基于Wan Android提供的api来完成的，非常感谢鸿阳大神，自己经常在这个网站上学习，做这个Flutter项目的话也可以装在自己手机上用来看一些技术文章。\r\n       已有功能：用户登录注册、首页文章列表、首页Banner、知识体系、知识体系下的文章、收藏文章管理。\r\n       待完成功能：在首页加入热门模块(包括热门搜索和热门网站)、加入搜索文章的功能。\r\n       \r\n","envelopePic":"http://wanandroid.com/blogimgs/ca28967d-a7cb-48ed-80ef-c63b544f2116.png","fresh":false,"id":3301,"link":"http://www.wanandroid.com/blog/show/2306","niceDate":"2018-08-22","origin":"","projectLink":"https://github.com/ywp0919/wan_android_flutter","publishTime":1534915840000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"玩Android Flutter 版本","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Hankkin","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"如果你是一个热衷于Android开发者，那么这款软件能帮助你阅读精品Android文章。同时Reading中还包含&quot;英文单词&quot;、&quot;账号本子&quot;、&quot;天气&quot;、&quot;查单词&quot;、&quot;快递查询&quot;等小工具。项目基于&quot;Kotlin+MVP&quot;架构开发，风格大概也许属于Material Desgin原质化风格，包含主题颜色切换、百变Logo等功能。","envelopePic":"http://wanandroid.com/blogimgs/8c1d1aba-c0c4-4392-9247-8cef299d0146.png","fresh":false,"id":3300,"link":"http://www.wanandroid.com/blog/show/2305","niceDate":"2018-08-22","origin":"","projectLink":"https://github.com/Hankkin/Reading","publishTime":1534904096000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Reading一款不错的基于WanAndroid OpenApi 开发的开源APP-Kotlin版本","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":79,"size":20,"total":1572}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }



    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","author":"钉某人","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3321,"link":"https://www.jianshu.com/p/20f16a4b4630","niceDate":"16小时前","origin":"","projectLink":"","publishTime":1535295575000,"superChapterId":193,"superChapterName":"5.+高新技术","tags":[],"title":"你的RecyclerView还可以这样","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"huachao1001","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3320,"link":"https://www.jianshu.com/p/08d998d047d8","niceDate":"16小时前","origin":"","projectLink":"","publishTime":1535294027000,"superChapterId":193,"superChapterName":"5.+高新技术","tags":[],"title":"打造属于你的LayoutManager","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"JerryloveEmily","chapterId":153,"chapterName":"Zygote进程启动","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3319,"link":"https://juejin.im/post/5b8294dff265da432f654244","niceDate":"19小时前","origin":"","projectLink":"","publishTime":1535284864000,"superChapterId":171,"superChapterName":"framework","tags":[],"title":"Android系统启动系列----init进程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Ganart","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"GankIO是基于干货集中营（ http://gank.io ）的开放数据API（ https://gank.io/api ）编写的一个小程序。项目作为个人对微信小程序开发框架的第一个学习项目，对开发组件有较为全面的使用，但仍然有很多不足的地方。","envelopePic":"http://www.wanandroid.com/blogimgs/11eb5bb2-33b7-47dd-8ab8-a85491399f98.png","fresh":true,"id":3317,"link":"http://www.wanandroid.com/blog/show/2312","niceDate":"22小时前","origin":"","projectLink":"https://github.com/Ganart/GankIO","publishTime":1535273569000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"干货集中营微信小程序GankIO","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"meituan","chapterId":385,"chapterName":"架构","collect":false,"courseId":13,"desc":"WMRouter是一款Android路由框架，基于组件化的设计思路，有功能灵活、使用简单的特点。 ","envelopePic":"http://www.wanandroid.com/blogimgs/9990250f-40fb-4f80-8660-bcdaca22fa44.png","fresh":true,"id":3316,"link":"http://www.wanandroid.com/blog/show/2311","niceDate":"22小时前","origin":"","projectLink":"https://github.com/meituan/WMRouter","publishTime":1535273481000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=385"}],"title":"WMRouter：美团外卖Android开源路由框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"mzlogin","chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"ADB Usage Complete / ADB 用法大全\r\n","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":true,"id":3315,"link":"http://www.wanandroid.com/blog/show/2310","niceDate":"22小时前","origin":"","projectLink":"https://github.com/mzlogin/awesome-adb","publishTime":1535273395000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],"title":"速查 | ADB 用法大全","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"工匠若水","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3314,"link":"https://www.jianshu.com/p/08efec596aab","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535215434000,"superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Android应用开发编译框架流程与IDE及Gradle概要","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"腾讯云加社区","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3313,"link":"https://juejin.im/post/5b7e7d236fb9a019b953df97","niceDate":"1天前","origin":"","projectLink":"","publishTime":1535214970000,"superChapterId":77,"superChapterName":"热门专题","tags":[],"title":"让你的app体验更丝滑的11种方法","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"速查小编","chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3312,"link":"http://www.wanandroid.com/blog/show/2309","niceDate":"2天前","origin":"","projectLink":"","publishTime":1535163112000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],"title":"速查 | adb 常用命令","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":274,"chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3310,"link":"http://wl9739.github.io/archives/","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535031480000,"superChapterId":272,"superChapterName":"导航主Tab","tags":[{"name":"导航","url":"/navi#274"}],"title":"Eateeer的笔记屋","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Eateeer的笔记屋","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3309,"link":"http://wl9739.github.io/2017/01/13/Gson-%E4%B8%AD%E6%96%87%E6%8C%87%E5%8D%97/","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535031458000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"Gson中文指南","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3305,"link":"https://www.jianshu.com/p/3108f1e44155","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535030425000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（四）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3308,"link":"https://www.jianshu.com/p/e740196225a4","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535028470000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（一）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3307,"link":"https://www.jianshu.com/p/c88260adaf5e","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535028454000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（二）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"怪盗kidou","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3306,"link":"https://www.jianshu.com/p/0e40a52c0063","niceDate":"2018-08-23","origin":"","projectLink":"","publishTime":1535028441000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"你真的会用Gson吗?Gson使用指南（三）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"diygreen","chapterId":121,"chapterName":"ViewPager","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3304,"link":"https://www.jianshu.com/p/266861496508","niceDate":"2018-08-22","origin":"","projectLink":"","publishTime":1534947883000,"superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"ViewPager刷新问题详解","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Kane_Wood","chapterId":97,"chapterName":"音视频","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3303,"link":"https://www.jianshu.com/p/fb531239cd79","niceDate":"2018-08-22","origin":"","projectLink":"","publishTime":1534941002000,"superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"Android 使用 lame wav 转 mp3 、pcm 转 mp3 (边录边转)；使用 mad mp3 转 wav、mp3 转 pcm (边播边转)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"skyCracks","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"基于鸿洋大大的wanandroid提供的API, 使用kotlin开发的备忘录APP\r\n\r\n","envelopePic":"http://wanandroid.com/blogimgs/de2de733-e304-4d3f-9cb6-9e37b939a2c7.png","fresh":false,"id":3302,"link":"http://www.wanandroid.com/blog/show/2307","niceDate":"2018-08-22","origin":"","projectLink":"https://github.com/skyCracks/skyTodo","publishTime":1534918189000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"基于Kotlin开发的Todo客户端-skyTodo","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"ywp0919","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"这是一个Flutter项目，基于Wan Android提供的api来完成的，非常感谢鸿阳大神，自己经常在这个网站上学习，做这个Flutter项目的话也可以装在自己手机上用来看一些技术文章。\r\n       已有功能：用户登录注册、首页文章列表、首页Banner、知识体系、知识体系下的文章、收藏文章管理。\r\n       待完成功能：在首页加入热门模块(包括热门搜索和热门网站)、加入搜索文章的功能。\r\n       \r\n","envelopePic":"http://wanandroid.com/blogimgs/ca28967d-a7cb-48ed-80ef-c63b544f2116.png","fresh":false,"id":3301,"link":"http://www.wanandroid.com/blog/show/2306","niceDate":"2018-08-22","origin":"","projectLink":"https://github.com/ywp0919/wan_android_flutter","publishTime":1534915840000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"玩Android Flutter 版本","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Hankkin","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"如果你是一个热衷于Android开发者，那么这款软件能帮助你阅读精品Android文章。同时Reading中还包含&quot;英文单词&quot;、&quot;账号本子&quot;、&quot;天气&quot;、&quot;查单词&quot;、&quot;快递查询&quot;等小工具。项目基于&quot;Kotlin+MVP&quot;架构开发，风格大概也许属于Material Desgin原质化风格，包含主题颜色切换、百变Logo等功能。","envelopePic":"http://wanandroid.com/blogimgs/8c1d1aba-c0c4-4392-9247-8cef299d0146.png","fresh":false,"id":3300,"link":"http://www.wanandroid.com/blog/show/2305","niceDate":"2018-08-22","origin":"","projectLink":"https://github.com/Hankkin/Reading","publishTime":1534904096000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Reading一款不错的基于WanAndroid OpenApi 开发的开源APP-Kotlin版本","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 79
         * size : 20
         * total : 1572
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }


        public static class DatasBean implements MultiItemEntity{
            /**
             * apkLink :
             * author : 钉某人
             * chapterId : 100
             * chapterName : RecyclerView
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : true
             * id : 3321
             * link : https://www.jianshu.com/p/20f16a4b4630
             * niceDate : 16小时前
             * origin :
             * projectLink :
             * publishTime : 1535295575000
             * superChapterId : 193
             * superChapterName : 5.+高新技术
             * tags : []
             * title : 你的RecyclerView还可以这样
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String origin;
            private String projectLink;
            private long publishTime;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }

            @Override
            public int getItemType() {
                if (TextUtils.isEmpty(getEnvelopePic())){
                    return 0;//无图
                }else {
                    return 1;//有图
                }
            }
        }
    }
}

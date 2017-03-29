/**
 * Created by bong on 2017/3/4.
 */
(function ($) {
    function Utils(){
        initGlobalBtn();
    }
    function initGlobalBtn(){
        $("#search_btn").on('click', function () {
            var value = $("#search_value").val();
            console.log(value);
            if (value != null && value!='') {
                window.location.href = "/flower_shop/search.html?search_value="+value;
            }
        })
    }
    Utils.prototype.comStr = {
        'host':'http://192.168.1.232:9999/WebManager',
        'hostUrl':'http://192.168.1.232:9999/'
    };
    Utils.prototype.ajaxP = function(obj){
        $.ajax({
            type: 'post',
            url: obj.url,
            data: JSON.stringify(obj.post_data),
            contentType: 'application/json',
            dataType: 'json',
            success: function(data){
                if(data.status == 200){
                    return obj.success(data);
                }else{
                    //alert("网络出差啦！");
                    obj.error();
                }
            },
            error: function(err){
                //alert("网络出差啦！");
                obj.error(err);
            }
        });

        return obj;
    };
    Utils.prototype.ajaxG = function(obj){
        $.ajax({
            type: 'GET',
            url: obj.url,
            data:obj.post_data,
            dataType: 'json',
            success: function(data){
                if(data.status == 200){
                    return obj.success(data);
                }else{
                    //alert("网络出差啦！");
                    obj.error();
                }
            },
            error: function(err){
                //alert("网络出差啦！");
                obj.error(err);
            }
        });

        return obj;
    };
    Utils.prototype.getCookie =  function(){
        var cookie = {};
        var all = document.cookie;
        if(all === ''){
            return cookie;
        }
        var list = all.split('; ');
        for(var i= 0,len=list.length;i<len;i++){
            var ck = list[i];
            var p = ck.indexOf('=');
            var name = ck.substring(0,p);
            var value = ck.substring(p+1);
            value = decodeURIComponent(value);
            cookie[name] = value;
        }
        return cookie;
    };
    Utils.prototype.setCookie = function(obj, exdays){
        var d = new Date();
        d.setTime(d.getTime() + (exdays*24*60*60*1000)); // 天
        var expires = "expires="+ d.toUTCString();

        for(item in obj){
            document.cookie = item + '='+ decodeURIComponent(obj[item])+";expires="+ expires + ';path=/';;
        }
        //document.cookie = "expires="+ expires + ';path=/';
    };

    Utils.prototype.clearCookie = function () {
        var d = new Date();
        var expires = "expires="+ d.toUTCString();

        var obj = this.getCookie();

        for(item in obj){
            document.cookie = item + "=;expires="+ expires + ';path=/'
        }
        //document.cookie = "expires="+ expires + ';path=/';

    };
    Utils.prototype.toast = function(str){
        var d = '<div class=".toast">'+str+'</div>';
        $('body').append( d);
    };
    Utils.prototype.log = function(tag,data){
        console.log("----------"+tag+"----------");
        console.log(data);
        console.log("----------"+tag+"----------");
    };
    Utils.prototype.url2obj = function(url){

        var obj = {};
        var arr = url.substr(url.indexOf('?') + 1).split('&');
        arr.forEach(function(item) {
            var tmp = item.split('=');
            //  boj.xx = cc , 不过只能用 obj[xx] = cc 来赋值
            obj[tmp[0]] = tmp[1];
        });
        return obj;
    };
    window.utils=new Utils();
    $.utils=function(){
        return new Utils();
    }
})($);
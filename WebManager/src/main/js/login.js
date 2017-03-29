/**
 * Created by bong on 2017/3/4.
 */
(function () {
    var cookie_data;
    (function () {
        init();
        initBtn();
    })();

    function init() {
        cookie_data = utils.getCookie();
        utils.log('cookie_data',cookie_data);
        if (cookie_data.phone == undefined || cookie_data.phone == null || cookie_data.phone == '') {
            showLoginSection('login');
        } else {
            showLoginSection('login_suc');
            $("#login_suc_name").text(cookie_data.username);
        }
    }

    function initBtn() {
        // 登录
        //http://192.168.1.232:9999/WebManager/userController/login?password=&phone=15710649170
        $('#login_log').on('click', function () {
            utils.ajaxG({
                url: utils.comStr.host+'/userController/login',
                post_data: {
                    "password":$("#login_Password").val(),
                    "phone":$("#login_Phone").val()
                },
                success: function (data) {
                    utils.setCookie(data.data[0],2);
                    var cookie_data = utils.getCookie();
                    utils.log('cookie_datacccccc',cookie_data);
                    init();
                },
                error: function () {
                    alert('登录失败,请确认用户名和密码');
                }
            });
        });
        // 注册
        $("#login_reg").on('click', function () {
            $("#register").css('display','block');
        });
        // 登出
        $("#login_suc_logout").on('click', function () {
            utils.clearCookie();
            init();
        });
        // 修改账户
        $("#login_suc_change").on('click', function () {
            $("#registerUsername2").val(cookie_data.username);
            $("#registerPhone2").val(cookie_data.phone);
            $("#registerPassword2").val('******');
            $("#registerage2").val(cookie_data.age);
            $("#registernickName2").val(cookie_data.nickName);
            $("#registerdescription2").val(cookie_data.description)

            $("#change_info").css('display','block');
        });
        // 确认注册
        // http://192.168.1.232:9999/WebManager/userController/registerNewUser?username=tttt&password=&phone=15710649170&age=33&nickName=tttt&description=dfdfd
        $('#register_btn').on('click', function () {
            utils.ajaxG({
                url:utils.comStr.host+ '/userController/registerNewUser',
                post_data: {
                    "username": $("#registerUsername").val(),
                    "password": $("#registerPassword").val(),
                    "phone": $("#registerPhone").val(),
                    "age": $("#registerage").val(),
                    "nickName": $("#registernickName").val(),
                    "description": $("#registerdescription").val()
                },
                success: function (data) {
                    alert('注册成功,请重新登录');
                    $("#register").css('display','none');
                },
                error: function () {
                    alert('注册失败,请重新注册');
                    $("#register").css('display','none');
                }
            });
        });
        // 确认修改
        $('#change_info_btn').on('click', function () {
            var login_Password2 ;
            if($("#registerPassword2").val() == '******'){
                login_Password2 = cookie_data.password;
            }else{
                login_Password2 = $("#registerPassword2").val();
            }
            console.log('login_Password2')
            console.log(login_Password2)
             utils.ajaxG({
                url:utils.comStr.host+  '/userController/updateUserInfo',
                post_data: {
                    "username": $("#registerUsername2").val(),
                    "phone": $("#registerPhone2").val(),
                    "age": $("#registerage2").val(),
                    "nickName": $("#registernickName2").val(),
                    "description": $("#registerdescription2").val(),
                    "password": login_Password2
                },
                success: function (data) {
                    alert('修改成功,请重新登录');
                    utils.clearCookie();
                    init();
                },
                error: function () {
                    alert('修改失败,请重新提交');
                }
            });
        });

    }

    function showLoginSection(div_id) {
        $('#login').css('display', 'none');
        $('#login_suc').css('display', 'none');
        $('#register').css('display', 'none');
        $('#change_info').css('display', 'none');
        $('#' + div_id).css('display', 'block');

    }
})();
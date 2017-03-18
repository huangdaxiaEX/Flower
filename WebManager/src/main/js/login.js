/**
 * Created by bong on 2017/3/4.
 */
(function () {
    (function () {
        init();
        initBtn();
    })();

    function init() {
        var cookie_data = utils.getCookie();
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
        $('#login_log').on('click', function () {
            utils.ajax({
                url: '/userController/login',
                post_data: {
                    "phone": $("#login_Username").val(),
                    "password": $("#login_Password").val()
                },
                success: function (data) {
                    utils.setCookie(data,2);
                    var cookie_data = utils.getCookie();
                    utils.log('cookie_datacccccc',cookie_data);
                    init();
                },
                error: function () {
                    var t_data = {
                        'userID': '1222121',
                        'username': '张哈哈',
                        'age': '233',
                        'address': '地址222',
                        'phone': '1212121212',
                        'nickName': 'nick',
                        'userType': '用户类型',
                        'isAvailable': '是否可用',
                        'code': '序列号',
                        'description': '说明'
                    };
                    utils.setCookie(t_data,2);
                    var cookie_data = utils.getCookie();
                    utils.log('cookie_datacccccc',cookie_data);
                    init();
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
            $("#change_info").css('display','block');
        });
        // 确认注册
        $('#register_btn').on('click', function () {
            utils.ajax({
                url: '/userController/registerNewUser',
                post_data: {
                    "phone": $("#login_Username").val(),
                    "password": $("#login_Password").val()
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
            utils.ajax({
                url: '/userController/changeUserAvailable',
                post_data: {
                    "phone": $("#login_Username").val(),
                    "password": $("#login_Password").val()
                },
                success: function (data) {
                    alert('修改成功,请重新登录');
                    utils.clearCookie();
                    init();
                },
                error: function () {
                    alert('修改失败,请重新提交');
                    utils.clearCookie();
                    init();
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
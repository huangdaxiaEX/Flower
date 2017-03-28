/**
 * Created by bong on 2017/3/5.
 */
(function () {
    var cookie_data = utils.getCookie();
    (function () {
        init();
    })();
    function init(){
        var cart_table_tpl = $("#cart_table_item").html();
        utils.ajaxG({
            url: utils.comStr.host+'/buyCarController/getBuyCarInfoByUserId',
            post_data: {
                "userId": cookie_data.userID
            },
            success: function (data) {
                utils.log('getBuyCarInfoByUserId',data);
                var tpl_data = data.data;
                tpl_data.hostUrl = utils.comStr.hostUrl;
                var tpl = ejs.render(cart_table_tpl,{data:tpl_data});
                $('#cart_table').html(tpl);
                //点击#table3 的单元格返回 单元格索引
                $("#cart_table td button").click(function () {
                    var buycarid = $(this).data('buycarid');
                    deleteFlowerFromCar(buycarid);
                })
            },
            error: function () {

            }
        });
    }
    function deleteFlowerFromCar(buycarid){
        utils.ajaxG({
            url: utils.comStr.host+'/buyCarController/deleteFlowerFromCar',
            post_data: {
                'buyCarId':buycarid,
                "userId": cookie_data.userID
            },
            success: function (data) {
                alert('删除成功!')
                init();
            },
            error: function () {
                alert('删除失败,请重试!')
            }
        });
    }

})();
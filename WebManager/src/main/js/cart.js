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

        utils.ajax({
            url: '/userController/getBuyCarInfoByUserId',
            post_data: {
                "userId": cookie_data.id
            },
            success: function (data) {
                var tpl = ejs.render(cart_table_tpl,{data:data});
                $('#cart_table').html(tpl);
            },
            error: function () {
                t_data = [
                    {
                        "flowerId":1111,
                        "flowerName":'xxxx1',
                        "price":233,
                        "count":22
                    },{
                        "flowerId":222,
                        "flowerName":'xxxx2',
                        "price":233,
                        "count":4
                    },{
                        "flowerId":33333,
                        "flowerName":'xxxx3',
                        "price":233,
                        "count":3
                    },{
                        "flowerId":4444,
                        "flowerName":'xxxx4',
                        "price":233,
                        "count":5
                    },{
                        "flowerId":4444,
                        "flowerName":'xxxx4',
                        "price":233,
                        "count":5
                    }
                ];
                var tpl = ejs.render(cart_table_tpl,{data:t_data});
                $('#cart_table').html(tpl);

                //点击#table3 的单元格返回 单元格索引
                $("#cart_table td button").click(function () {
                    var tt = $(this).data('flowid');
                    alert(tt);
                })
            }
        });
    }

})();
/**
 * Created by bong on 2017/3/4.
 */
(function () {

    (function () {
        init();
        initBtn();
    })();

    function init(){
        var product_tpl = $("#product").html();

        utils.ajax({
            url:'flowerController/getAllFlower',
            post_data:{},
            success: function (data) {
                var tpl = ejs.render(product_tpl,{data:data});
                $('#tpl').html(tpl);
            },
            error: function () {
                t_data =  [
                    {
                        "flowerId":"12",
                        "flowerName":"鲜花名称12",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"999",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    },
                    {
                        "flowerId":"22",
                        "flowerName":"鲜花名称",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"233",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    },
                    {
                        "flowerId":"34",
                        "flowerName":"鲜花名称",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"233",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    },
                    {
                        "flowerId":"342",
                        "flowerName":"鲜花名称",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"233",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    },
                    {
                        "flowerId":"23",
                        "flowerName":"鲜花名称dddd",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"233",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    }
                    ,
                    {
                        "flowerId":"432",
                        "flowerName":"鲜花名称ccccc",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"233",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    }
                    ,
                    {
                        "flowerId":"12",
                        "flowerName":"鲜花名称ccccc",
                        "price":"88",
                        "flowerType":"鲜花类型",
                        "totalCount":"233",
                        "lessCount":"12",
                        "img":"images/thumb1.gif" ,
                        "description":"说明",
                        "shopIds":"商店 id",
                        "content":"内容"
                    }
                ];
                var tpl = ejs.render(product_tpl,{data:t_data});
                $('#product_tpl').html(tpl);
            }

        });
    }

    function initBtn() {

    }

})();
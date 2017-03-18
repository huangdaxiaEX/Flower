/**
 * Created by bong on 2016/11/24.
 */
;(function(){

    /* banner  - 2 事件*/
    var url = document.referrer;
    console.log(url);

    $(document).on('change', '.file-to-upload',function(){
        var files = $(this).prop('files');
        var thisId = '#' + $(this).parents('.panel-banner').attr('id');
        if(files.length == 0){
            var bannerPic = '';
        }else{
            bannerPic = files[0];
            $(thisId).find('.banner-img').attr('src', getObjectURL(bannerPic));
        }
    });

    $(document).on('click', '.btn-change', function(){
        var thisId = '#' + $(this).parents('.panel-banner').attr('id');
        if($(thisId).find('.isDisplay').is(':checked')){
            var bannerActive = 1;
        }else{
            bannerActive = 0;
        }

        var bannerId = $(thisId).find('.banner-id').text();
        var bannerLink = $(thisId).find('.banner-link').val();
        var bannerName = $(thisId).find('.banner-name').val();
        var bannerRanking = $(thisId).find('.banner-ranking').val();

        var bannerTitle = $(thisId).find('.banner-title').val();
        var bannerSubtitle = $(thisId).find('.banner-subtitle').val();
        var bannerHits = $(thisId).find('.banner-hits').val();
        var bannerDescription = $(thisId).find('.banner-description').val();
        //获取下拉框选中项的text属性值
        var selectPid = $(thisId).find("option:selected").text();

        if (!(window.File || window.FileReader || window.FileList || window.Blob)) {
            alert('你妈喊你换Chrome浏览器啦');
        }

        var files = $(thisId).find('.file-to-upload').prop('files');
        if(files.length == 0){
            var bannerPic = '';
        }else{
            bannerPic = files[0];
        }

        var formData = new FormData();
        formData.append('fileToUpload', bannerPic);
        formData.append('id', bannerId);
        formData.append('url', bannerLink);
        formData.append('name', bannerName);
        formData.append('ranking', bannerRanking);
        formData.append('active', bannerActive);
        formData.append('image', bannerActive);

        formData.append('title', bannerTitle);
        formData.append('subtitle', bannerSubtitle);
        formData.append('hits', bannerHits);
        formData.append('description', bannerDescription);
        formData.append('pid', selectPid);
        
        var xhr = new XMLHttpRequest();
        xhr.open('POST', '/service/tale/update', true);
        xhr.onload = function () {
            if (xhr.status == 200) {
                swal({
                    title:'棒棒哒',
                    text: '修改成功',
                    type: 'success'
                }, function(){
                    location.reload();
                });
            }else{
                swal("哎呦", '出现错误', "error");
            }
        };

        //log("formData",formData);
        xhr.send(formData);
    });

    $('.btn-delete').on('click', function(){
        var thisId = '#' + $(this).parents('.panel-banner').attr('id');
        var bannerId = $(thisId).find('.banner-id').text();
        console.log(thisId);
        console.log(bannerId);


        jQuery.ajax({
            type: 'post',
            url: '/service/tale/delete',
            dataType: 'json',
            data: {
                id: bannerId
            },
            success: function(result){
                var _result = result.requestResult,
                    resultMsg = result.resultMsg;
                console.log(resultMsg);
                if(_result){
                    swal({
                        title:'棒棒哒',
                        text: '删除成功',
                        type: 'success'
                    }, function(){
                        location.reload();
                    });
                }else{

                    swal("哎呦", resultMsg, "error");
                }
            },
            error:function(){
                swal("妈蛋", "请求失败", "error");
            }
        })
    });


    $('.btn-add').on('click', function(){
        var html = '';
        html += '<div class="panel panel-primary panel-banner" id="new-add"><div class="panel-heading">新加banner</div>'+
            '<div class="panel-body"><div class="media"><div class="media-left media-middle"><a href="#"><img class="media-object banner-img" src="#" alt="看到我就出问题了吧" width="200"></a></div>'+
            '<div class="media-body"><form class="form-horizontal"><div class="form-group"><label class="col-sm-2 control-label">标题</label><div class="col-sm-10"> <input type="text" class="form-control banner-title" placeholder="填写标题" value=""> </div></div>' +
            '<div class="form-group"><label class="col-sm-2 control-label">副标题</label> <div class="col-sm-10"> <input type="text" class="form-control banner-subtitle" placeholder="填写副标题" value=""> </div> </div>'+
            '<div class="form-group"><label class="col-sm-2 control-label">名称</label><div class="col-sm-10"><input type="text" class="form-control banner-name" placeholder="填写名称" value=""></div></div>'+
            '<div class="form-group"><label class="col-sm-2 control-label">链接</label><div class="col-sm-10"><input type="text" class="form-control banner-link" placeholder="填写链接" value=""></div></div>'+
            '<div class="form-group"><label class="col-sm-2 control-label">排序</label><div class="col-sm-10"><input type="text" class="form-control banner-ranking" placeholder="填写排序" value=""></div></div>'+
            '<div class="form-group"> <label class="col-sm-2 control-label">点击数</label> <div class="col-sm-10"><input type="text" class="form-control banner-hits" placeholder="点击数" value=""></div> </div>'+
            '<div class="form-group"> <label class="col-sm-2 control-label">描述</label> <div class="col-sm-10"> <textarea  class="form-control banner-description" rows="5" cols="40" placeholder="填写描述"  value=""></textarea></div> </div>'+
            '<div class="form-group"><label class="col-sm-2 control-label">上传图片</label><div class="col-sm-10"><input type="file" class="file-to-upload"></div></div>'+
            '<div class="form-group"><div class="col-sm-offset-2 col-sm-10"><div class="checkbox"><label><input type="checkbox" checked class="isDisplay"> 是否显示</label></div></div>'+
            '<div class="form-group"><div class="col-sm-offset-2 col-sm-10"> <select class="select-id"> <option selected="selected" value="1" >1</option> <option value="2">2</option> </select> &nbsp;&nbsp;类型 </div> </div>'+
            '</div><div class="form-group"><div class="col-sm-offset-2 col-sm-10"><button type="button" class="btn btn-success btn-upload">上 传</button>'+
            '<button type="button" class="btn btn-danger btn-upload-delete">删 除</button></div></div></form></div></div></div></div>';

        $('.jumbotron-2').append(html);
    });

    $(document).on('click', '.btn-upload', function(){
        var newAddBlock = $('#new-add');
        if(newAddBlock.find('.isDisplay').attr('checked') == 'checked'){
            var bannerActive2 = 1;
        }else{
            bannerActive2 = 0;
        }

        var bannerLink2 = newAddBlock.find('.banner-link').val();
        var bannerName2 = newAddBlock.find('.banner-name').val();
        var bannerRanking2 = newAddBlock.find('.banner-ranking').val();

        var files = newAddBlock.find('.file-to-upload').prop('files');
        if(files.length == 0){
            var bannerPic2 = '';
        }else{
            bannerPic2 = files[0];
        }

        var bannerTitle = newAddBlock.find('.banner-title').val();
        var bannerSubtitle = newAddBlock.find('.banner-subtitle').val();
        var bannerHits = newAddBlock.find('.banner-hits').val();
        var bannerDescription = newAddBlock.find('.banner-description').val();
        //获取下拉框选中项的text属性值
        var selectPid = $(newAddBlock).find("option:selected").text();


        var formData2 = new FormData();
        formData2.append('fileToUpload', bannerPic2);
        formData2.append('url', bannerLink2);
        formData2.append('name', bannerName2);
        formData2.append('ranking', bannerRanking2);
        formData2.append('active', bannerActive2);
        formData2.append('image', bannerActive2);

        formData2.append('title', bannerTitle);
        formData2.append('subtitle', bannerSubtitle);
        formData2.append('hits', bannerHits);
        formData2.append('description', bannerDescription);
        formData2.append('pid', selectPid);

        var xhr = new XMLHttpRequest();
        xhr.open('POST', '/service/tale/add', true);
        xhr.onload = function () {
            if (xhr.status == 200) {
                swal({
                    title:'棒棒哒',
                    text: '添加成功',
                    type: 'success'
                }, function(){
                    location.reload();
                });
            }else{
                swal("哎呦", '添加出现错误', "error");
            }
        };

        xhr.send(formData2);
    });

    $(document).on('click', '.btn-upload-delete', function(){
        location.reload();
    });

    function getObjectURL(file) {
        var url = null ;
        if (window.createObjectURL!=undefined) { // basic
            url = window.createObjectURL(file) ;
        } else if (window.URL!=undefined) { // mozilla(firefox)
            url = window.URL.createObjectURL(file) ;
        } else if (window.webkitURL!=undefined) { // webkit or chrome
            url = window.webkitURL.createObjectURL(file) ;
        }
        return url ;
    }
    function log (tag , data){
        console.log("-------------"+tag+"--------------");
        console.log(data);
        console.log("-------------"+tag+"--------------");
    }

})();
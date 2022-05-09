<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> -->
    <!-- <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/> -->
    <title>verify插件demo</title>

    <link rel="stylesheet"  href="static/css/verify.css">
</head>

<body>




<div id="mpanel2" >
</div>




<div id="mpanel3" style="margin-top: 20px">
</div>


<h3>滑动验证码</h3>
<div id="mpanel1" >
</div>

<div id="mpanel4" style="margin-top:50px;">
</div>




<script type="text/javascript" src="static/js/jquery.min.js" ></script>
<script type="text/javascript" src="static/js/verify.js" ></script>
<!--<script type="text/javascript" src="js/verify.min.js" ></script>-->

<script>



    $('#mpanel4').slideVerify({
        type : 2,		//类型
        vOffset : 5,	//误差量，根据需求自行调整
        vSpace : 5,	//间隔
        imgName : ['1.jpg', '2.jpg'],
        imgSize : {
            width: '400px',
            height: '200px',
        },
        blockSize : {
            width: '40px',
            height: '40px',
        },
        barSize : {
            width : '400px',
            height : '40px',
        },
        ready : function() {
        },
        success : function() {
            alert('验证成功，添加你自己的代码！');
            //......后续操作
        },
        error : function() {
//		        	alert('验证失败！');
        }

    });





</script>
</body>

</html>
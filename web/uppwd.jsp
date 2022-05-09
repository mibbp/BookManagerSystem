<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/7
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/css/adm.css">
    <style>
        #book{
            width:80%;
            margin-top: 40px;
            margin-bottom: 60px;
            margin-left: 120px;
            /*border: blueviolet 2px solid;*/
        }
        #binner{
            margin-left: 100px;
            margin-top: 40px;
            font-size: 20px;
        }



    </style>
</head>
<body>
<div id="frame">
    <div style="font-size: 40px;margin-left: 400px;margin-top: 20px">个人信息修改</div>
    <div id="book">
        <div id="binner">
            你的账号:&nbsp;&nbsp;&nbsp;${user.getUid()}

            <br><br><input placeholder="请输入名称" id="name" type="text" style="height: 30px; width: 270px; border: blueviolet 2px solid;
            border-radius: 2px;font-size: 17px" value=${user.getName()}>
            <br><br><input placeholder="请输入性别" id="d" type="text" style="height: 30px; width: 270px; border: blueviolet 2px solid;
            border-radius: 2px;font-size: 17px" value=${user.getSex()}>
            <br><br><input placeholder="请输入身份证号" id="e" type="text" style="height: 30px; width: 270px; border: blueviolet 2px solid;
            border-radius: 2px;font-size: 17px" value=${user.getIdcard()}>
            <br><br><input placeholder="请输入密码" id="aa" type="password" style="height: 30px; width: 270px; border: blueviolet 2px solid;
            border-radius: 2px;font-size: 17px">
            <br><br><input placeholder="请确认密码" id="bb" type="password" style="height: 30px; width: 270px; border: blueviolet 2px solid;
            border-radius: 2px;font-size: 17px">


            <br><br><button style="margin-left: 120px;width: 240px" onclick="uppwd()">确认修改</button>
            <script>
                function uppwd(){
                    let m = document.getElementById("aa").value;
                    let n = document.getElementById("bb").value;
                    let name = document.getElementById("name").value;
                    let d = document.getElementById("d").value;
                    let e = document.getElementById("e").value;
                    // alert(m+" "+n+" "+name+" "+d+" "+e)
                    if(m!=n&&m.trim()!=""&&n.trim()!=""){
                        alert("两次密码不一致")
                        return ;
                    }
                    else if(m.trim()==""||n.trim()==""){
                        alert("密码输入为空")
                        return ;
                    }
                    else if(name.trim()==""){
                        alert("名称输入为空")
                        return ;
                    }
                    else if(d.trim()==""){
                        alert("性别输入为空")
                        return ;
                    }
                    else if(e.trim()==""){
                        alert("身份证号输入为空")
                        return ;
                    }
                    else if(d!="男"&&d!="女"){
                        alert("性别只能是男/女")
                        return ;
                    }
                    else{
                        window.location.href = "ufiledeal?action=uppwd&pwd="+n+"&myid=${user.getUid()}&name="+name+
                            "&sex="+d+"&idcard="+e;
                    }


                }

            </script>


        </div>


    </div>


</div>

</body>
</html>

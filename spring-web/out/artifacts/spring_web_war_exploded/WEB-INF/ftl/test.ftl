<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
            integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
            integrity="sha384-ep+dxp/oz2RKF89ALMPGc7Z89QFa32C8Uv1A3TcEK8sMzXVysblLA3+eJWTzPJzT"
            crossorigin="anonymous"></script>

    <style>
        /*.row {*/
        /*    display: flex;*/
        /*    flex-wrap: wrap;*/
        /*}*/
        /*.row div {*/
        /*    justify-content: center;*/
        /*    justify-items: center;*/
        /*}*/
    </style>
</head>
<body>



<div class="container marketing">

    <h1 style="margin: 30px">What Spring can do</h1>
    <div class="row">
        <#list lists as freeMarker>
            <div class="col-lg-2 "  style="border:1px solid #c1e2b3;margin: 10px" >
                <img src="${freeMarker.url}" style="width: 150px;height: 150px" >
                <h2 class="fw-normal">${freeMarker.name}</h2>
                <p>${freeMarker.content}</p>
            </div>
        </#list>
    </div><!-- /.row -->


</div>
</body>
</html>

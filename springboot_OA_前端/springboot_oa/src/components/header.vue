<template>
    <div class="container">
       <ul>
           <li class="title">职工人事管理系统</li>
           <router-link :to="{name: 'Login'}"><li class="login">登录</li></router-link>
           <router-link :to="{name: 'Register'}"><li class="register">注册</li></router-link>
        </ul>
    </div>
</template>

<script>
export default {
    data(){
        return{
           
        }
    }
}
</script>

<style scoped>
.container{
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 50px;
    border: 1px solid #263f52;
    background-color: #263f52;
    z-index: 100;
}
.title, .login, .register{
    position: absolute;
    top: 0px;
    width: 150px;
    height: 50px;
    /*border: 1px solid #fff;*/
    font-size: 18px;
    color: #fff;
    list-style: none;
    line-height: 50px;
    font-weight: bold;
    float: left;
}
.title{
    left: 50px;
}
.login{
    right: 100px;
}
.register{
    right: 50px;
}
</style>

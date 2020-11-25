<template>
    <div class="login">
        <div class="block">
    		<div class="blockTitle">欢迎登录职工人事管理系统</div>
    		<div class="line"></div>
            <img src="../assets/images/login.png" class="loginImg">
            <div class="line2"></div>
    		<div class="login2">
    			<input type="text" class="username" placeholder="账号" autocomplete="new-password" v-model="username">
    			<input type="password" class="password" placeholder="密码" autocomplete="new-password" v-model="password">
                <button class="teacherBtn" @click="loginClick">登录</button>
                <input type="reset" name="" value="重置" class="reTeacherBtn" @click="resetClick"/>
    		</div>
            <div class="forget">忘记密码？</div>
            <div class="line3"></div>
            <input type="checkbox" class="option" v-model="checked">
            <div class="option1">自动登录</div>
    	</div>
    </div>
</template>

<script>
import {login} from "../services/userService";
export default {
    data(){
        return{
			userInfo: {
				username: '',//账号
            	password: '',//密码
			}
        }
    },
    methods:{
        resetClick(){
			this.username = "";
			this.password = "";
		},
		async loginClick(){
			if (this.username == '' || this.username == null) {
				alert("请输入正确的账号");
			}else if(this.password == '' || this.password == null){
				alert("请输入正确的密码");
			}else{
				var resp = await login(this.userInfo);
				console.log(resp);
			}
		}
    }
}
</script>

<style scoped>
.login{
    position: relative;
	width: 100%;
	height: 100vh;
	background-color: #2c4a5e;
    border: 1px solid #2c4a5e;
}
.block{
	position: absolute;
	top: 90px;
	left: 37%;
	width: 420px;
	height: 550px;
	border: 1px solid #fff;
	border-radius: 10px;
	background-color: #fff;
}
.blockTitle{
	position: absolute;
	top: 40px;
	left: 115px;
	font-weight: bolder;
}
.line{
	position: absolute;
	top: 60px;
	left: 101px;
	width: 220px;
	height: 0;
	border: 1px solid #7a8c8d;
}
.loginImg{
	position: absolute;
	top: 80px;
	left: 150px;
	width: 150px;
}
.line2, .line3{
	position: absolute;
	top: 220px;
	left: 30px;
	width: 362px;
	height: 0;
	border: 0.5px solid #e74900;
}
.line3{
	top: 480px;
}
.username, .password{
	position: absolute;
	left: 35px;
    width: 347px;
    height: 50px;
    border: 1px solid #f6f6f6;
    border-radius: 6px;
    background-color: #f6f6f6;
    font-size: 17px;
    text-align: center;
    line-height: 50px;
    outline-color: #7a8c8d;
}
.username{
	top: 250px;
}
.password{
	top: 310px;
}
.teacherBtn, .reTeacherBtn{
	position: absolute;
	top: 380px;
    width: 130px;
    height: 45px;
    background-color: #2c4a5e;
    border: 1px solid #2c4a5e;
    border-radius: 6px;
    font-size: 15px;
    font-weight: bolder;
    color: #fff;
    cursor: pointer;
}
.teacherBtn{
	left: 70px;
}
.reTeacherBtn{
	left: 220px;
}
.forget{
	position: absolute;
	top: 440px;
	left: 175px;
	color: #7a8c8d;
	cursor: pointer;
}
.option{
    position: absolute;
    top: 500px;
    left: 160px;
}
.option1{
	 position: absolute;
     top: 495px;
     left: 180px;
     color: #7a8c8d;
}

</style>
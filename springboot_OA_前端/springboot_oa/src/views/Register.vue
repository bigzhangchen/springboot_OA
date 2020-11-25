<template>
    <div class="register">
        <div class="block">
            <div class="blockTitle">欢迎注册职工人事管理系统</div>
    		<div class="line"></div>
            <div class="register2">
    			<input type="text" class="userId" placeholder="工号" autocomplete="new-password" v-model="userInfo.userId">
                <input type="text" class="username" placeholder="姓名" autocomplete="new-password" v-model="userInfo.username">
    			<input type="password" class="password" placeholder="密码" autocomplete="new-password" v-model="userInfo.password">
                <input type="email" class="email" placeholder="邮箱" autocomplete="new-password" v-model="userInfo.email">
                <input type="text" class="age" placeholder="年龄" autocomplete="new-password" v-model="userInfo.age">
                <input type="text" class="address" placeholder="家庭住址" autocomplete="new-password" v-model="userInfo.address">
                <button class="teacherBtn" @click="handleRegister">注册</button>
                <input type="reset" name="" value="重置" class="reTeacherBtn" @click="handleReset">
    		</div>
        </div>
    </div>
</template>

<script>
import {register} from "../services/userService";
export default {
    data(){
        return{
            userInfo: {
                userId: "",
                username: "",
                password: "",
                email: "",
                age: "",
                address: ""
            }
        }
    },
    methods:{
        async handleRegister(){
            var resp = await register(this.userInfo);
            console.log(resp);
        },
        handleReset(){
            this.userId = "";
            this.username = "";
            this.password = "";
            this.email = "";
            this.age = "";
            this.address = "";
        }
    }
}
</script>

<style>
.register{
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
.userId, .username, .password, .email, .age, .address{
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
.userId{
    top: 100px;
}
.username{
	top: 160px;
}
.password{
	top: 220px;
}
.email{
    top: 280px;
}
.age{
    top: 340px;
}
.address{
    top: 400px;
}
.teacherBtn, .reTeacherBtn{
	position: absolute;
	top: 480px;
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
</style>
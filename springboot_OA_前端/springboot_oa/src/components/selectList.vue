<template>
  <div class="selectList">
        <dl class="dl">
            <dt class="notice" @click="handleClick(1)" @mouseover="handleMouseOver(1)" @mouseout="handleMouseOut" :class="{
                active: mouseOverNum==1 || chooseIndex==1
            }">
                发布公告
            </dt>
            <dt class="leave" @click="handleClick(2)" @mouseover="handleMouseOver(2)" @mouseout="handleMouseOut" :class="{
                active: mouseOverNum==2 || chooseIndex==2
                }">
                请假审批
            </dt>
            <dt class="salary" @click="handleClick(3)" @mouseover="handleMouseOver(3)" @mouseout="handleMouseOut" :class="{
                active: mouseOverNum==3 || chooseIndex==3
            }">
                薪资管理
            </dt>
        </dl>
  </div>
</template>

<script>
export default {
    data(){
        return{
            mouseOverNum: 0,
            chooseIndex: 1
        }
    },
    methods:{
        handleMouseOver(num){
            this.mouseOverNum = num;
        },
        handleMouseOut(){
            this.mouseOverNum = 0;
        },
        handleClick(index){
            this.chooseIndex = index;
            this.$emit("chooseIndex", index);
        }
    }
}
</script>

<style scoped>
.selectList{
    position: fixed;
	top: 50px;
	left: 0px;
	width: 14.5%;
	height: 95%;
	border: 1px solid #ccc;
	background-color: #f2f2f2;
	overflow: hidden;
}
.dl{
	width: 100%;
}
.notice, .leave, .salary{
    position: relative;
	width: 100%;
	height: 45px;
	border-bottom: 1px solid #ccc;
	background-color: #f8f8f8;
	line-height: 45px;
	color: #585858;
	font-size: 15px;
	text-align: center;
	cursor: pointer;
}
.active{
    background-color: #ccc;
    color: #fff;
}
</style>
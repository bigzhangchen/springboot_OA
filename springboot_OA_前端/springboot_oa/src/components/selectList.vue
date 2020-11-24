<template>
  <div class="selectList">
        <dl class="dl">
            <dt class="notice" @mouseover="handleMouseOver(1)" @mouseout="handleMouseOut" :class="{
                active: mouseOverNum==1
            }">
                发布公告
            </dt>
            <dt class="leave" @mouseover="handleMouseOver(2)" @mouseout="handleMouseOut" :class="{
                active: mouseOverNum==2
                }">
                请假审批
            </dt>
            <dt class="salary" @mouseover="handleMouseOver(3)" @mouseout="handleMouseOut" :class="{
                active: mouseOverNum==3
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
            mouseOverNum: 0
        }
    },
    methods:{
        handleMouseOver(num){
            this.mouseOverNum = num;
        },
        handleMouseOut(){
            this.mouseOverNum = 0;
        }
    }
}
</script>

<style scoped>
.selectList{
    position: fixed;
	top: 35px;
	left: 0px;
	width: 250px;
	height: 95%;
	border: 1px solid #ccc;
	background-color: #f2f2f2;
	overflow: hidden;
}
.dl{
	width: 200px;
}
.notice, .leave, .salary{
    position: relative;
	width: 250px;
	height: 45px;
	border: 1px solid #ccc;
	background-color: #f8f8f8;
	line-height: 45px;
	color: #585858;
	margin-top: -1px;
	margin-left: -1px;
	font-size: 15px;
	text-align: center;
	cursor: pointer;
}
.active{
    background-color: #ccc;
    color: #fff;
}
</style>
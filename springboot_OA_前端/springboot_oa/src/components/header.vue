<template>
    <div class="container">
       <ul>
           <li class="title">职工人事管理系统</li>
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
.title{
    margin-top: -17px;
    margin-left: 20px;
    width: 150px;
    height: 50px;
    /*border: 1px solid #fff;*/
    font-size: 18px;
    color: #fff;
    list-style: none;
    line-height: 50px;
    font-weight: bold;
}
</style>

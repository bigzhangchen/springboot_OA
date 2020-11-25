<template>
  <div class="notice">
      <textarea class="notice_box"></textarea>
      <br>
      <button>发布</button>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.notice{
    margin-top: 50px;
    margin-left: 14.5%;
    width: 85.5%;
    border: 1px solid #fff;
}
.notice_box{
    margin-top: 30px;
    margin-left: 20px;
    width: 55%;
    height: 200px;
    border: 1px solid #263f52;
    outline-style: none;
    font-size: 18px;
    resize: none;
}
button{
    margin-top: 20px;
    margin-left: 25%;
    width: 100px;
    height: 30px;
    border: 1px solid #ccc;
    outline-style: none;
    cursor: pointer;
}
</style>
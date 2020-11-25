import Vue  from "vue";
import VueRouter from "vue-router";
import config from "./config";

//1.安装
Vue.use(VueRouter);
//2.创建路由对象
var router = new VueRouter(config);
//3.导出
export default router;

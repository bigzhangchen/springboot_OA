import Vue from 'vue'
import App from './App.vue'
import router from "./routers";

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router//配置路由到vue框架中
}).$mount('#app')

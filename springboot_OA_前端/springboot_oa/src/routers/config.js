export default{
    //配置
    mode: "history",
    routes: [
        {
            path: "/",
            name: "Home",
            component: ()=>import("@/views/Home")
        },
        {
            path: "/login",
            name: "Login",
            component: ()=>import("@/views/Login")
        },
        {
            path: "/register",
            name: "Register",
            component: ()=>import("@/views/Register")
        }
    ]
}
import axios from 'axios';
import qs from 'qs';

//注册
export async function register(userInfo){
    var resp = await axios.post("http://localhost:8080/user/register", qs.stringify(userInfo));
    return resp;
}
//登录
export async function login(userInfo){
    var resp = await axios.post("http://localhost:8080/user/login", qs.stringify(userInfo));
    return resp;
}
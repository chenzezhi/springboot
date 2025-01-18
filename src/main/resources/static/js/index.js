//导入工具集模块
import Util from "./util.js";
let util = new Util();
//获取xhr对象
let xhr = new XMLHttpRequest();
//定义页面加载后
xhr.onload = function () {
    console.log(this.responseText);
    console.log(this.responseText.phoneNumber);
    let data = JSON.parse(this.responseText);
    processingData(data);
};
xhr.open("GET", "getuserinfo");
xhr.send();
//处理返回的数据
function processingData(data) {
    console.log(data.phoneNumber);
    console.log($("#phoneNumber"));
    //姓名
    $("#name").html(data.name);
    //应聘岗位
    $("#post").html(data.post);
    //简介
    $("#intro").html(data.intro);
    //头像
    $("#avatar").attr('src', data.avatar);
    //电话
    $("#phoneNumber").html(data.phoneNumber);
    //邮箱
    $("#email").html(data.email);
    //技能
    let head = `<li class="list-group-item">`
    let foot = `</li>`;
    let sk = util.stringCom(head,foot,data.skills);
    $("#skills").html(sk);
    //工作经验
    $("tbody").html(util.stringCom2("tr","td",data.up));
}
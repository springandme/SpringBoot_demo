new Vue({
    el: "#app",
    data: {
        user: {
            id: "",
            username: "",
            password: "",
            email: "",
            age: "",
            sex: ""
        },
        userList: []
    },
    methods: {
        findAll: function () {
            //在当前方法中定义个变量[_this],表明是Vue对象
            var _this = this;
            // Make a request for a user with a given ID
            axios.get('./user/findAll')
                .then(function (response) {
                    // handle success
                    _this.userList = response.data;  //响应数据给userList赋值
                    console.log(response);
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
                .then(function () {
                    // always executed
                });
        },
        findById: function (userId) {

        },
        update: function (user) {
        }
    },
    create() {   //当我页面加载的时候触发请求,查询所有
        this.findAll();
    }
});
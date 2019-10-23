new Vue({
    el: "#app",
    data: {
        schoolList: [],//可以接收到userList的数据
        schools: {
            sid: "",
            school: "",
            location: "",
            membership: "",
            introduction: ""
        }//可以接受到user的数据
    },

    created: function () {//当页面加载时触发请求，查询所有
        this.findAll();
    },

    methods: {
        //后面controller中的方法在这里必须全部去调用
        findAll: function () {
            var _this = this;//外面是vue，里面是axios，在axios中调this调得是axios的this
            axios.get('/demo_vue/user/findAll.do')
                .then(function (response) {
                    _this.schoolList = response.data;

                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error)
                })
        },
        findById: function (sid) {
            var _this = this;
            //第一种传参方式
            // axios.get('/demo_vue/user/findById.do?sid=2')//外面是vue，里面是axios
            //     .then(function (response) {
            //         _this.school = response.data;
            //       //$("#myModel").model('show');
            //         console.log(response);
            //     })
            //     .catch(function (error) {
            //         console.log(error)
            //     }),
            //第二种传参方式
            axios.get('/demo_vue/user/findById.do', {params: {sid: sid}})//外面是vue，里面是axios
                .then(function (response) {
                    _this.schools = response.data;
                    //$("#myModel").model('show');
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error)
                })

        },

        update: function (user) {
            var _this = this;
            axios.post('/demo_vue/user/update.do', _this.user)
                .then(function (response) {
                    _this.findAll();//更新完数据进行查询
                }).catch(function (error) {
                console.log(error);
            })
        }
    }
});
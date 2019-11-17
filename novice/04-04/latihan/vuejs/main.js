// var app = new Vue({
//     el: '#app',
//     data: {
//         product: 'Socks',
//         description : 'A pair of warm, funzzy sock',
//         message: 'You loaded this page on ' + new Date().toLocaleString()
//     }
// })

// var app1 = new Vue({
//     el: '#app1',
//     data: {
//         message: '<i>Hello World</i>'
//     }
// })

// var app3 = new Vue({
//     el: '#app2',
//     data: {
//         seen: true
//     }
// })

// var app3 = new Vue({
//     el: '#app3',
//     data: {
//         todos: [
//             {text: 'Belajar JavaScript'},
//             {text: 'Belajar Vue'},
//             {text: 'Build something awesome'}
//         ]
//     }
// })

// var app4 = new Vue({
//     el: '#app4',
//     data: {
//         message: 'Hello Vue.js'
//     },
//     methods:{
//         reverseMessage: function(){
//             this.message = this.message.split('').reverse().join('')
//         }
//     }
// })

// Vue.component('todo-item', {
//     props: ['todo'],
//     template: '<li>{{ todo.text }}</li>'
// })

// var app5 = new Vue({
//     el: '#app5',
//     data: {
//         groceryList: [
//             { id: 0, text: 'Vegetables'},
//             { id: 1, text: 'Cheese'},
//             { id: 2, text: 'Whatever else humans are supposed to eat'}
//         ]
//     }
// })

// var app6 = new Vue({
//     el: '#app6',
//     data: {
//         int1 : 1,
//         int2 : 2,
//         int3 : 3,
//         int4 : 4,
//         result1 : null,
//         result2 : null,
//     },
//     computed: {
//         sum: function(){
//             return this.result1 =  this.int1 + this.int2
//         }
//     },
//     methods: {
//         prosesSum: function() {
//             return this.result2 = this.int3 + this.int4
//         }
//     },
// })

// var app7 = new Vue({
//     el: '#app7',
//     data: {
//         kilometers: 0,
//         meters: 0
//     },
//     watch: {
//         kilometers: function (params) {
//             this.kilometers = params
//             this.meters = params * 1000
//         },
//         meters: function (params) {
//             this.meters = params
//             this.kilometers = params / 1000
//         }
//     },
// })

// var app8 = new Vue({
//     el: '#app8',
//     data: {
//         message: '',
//         textarea: ''
//     }
// })

// var app9 = new Vue({
//     el: '#app9',
//     data: {
//         radiobutton: ''
//     }
// })

// var app10 = new Vue({
//     el: '#app10',
//     data: {
//         checkbox: []
//     }
// })

// var app11 = new Vue({
//     el: '#app11',
//     data: {
//         select : []
//     }
// })

var app12 = new Vue({
    el: '#app12',
    data:{
        imageFile : 'prisma_online.png',
        hrefFacebook : 'https://facebook.com',
        styleCustom : 'color : red; font-size : 20px'
    }
})
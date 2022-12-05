
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 주문Manager from "./components/listers/주문Cards"
import 주문Detail from "./components/listers/주문Detail"

import 통합주문상태View from "./components/통합주문상태View"
import 통합주문상태ViewDetail from "./components/통합주문상태ViewDetail"
import 주문관리Manager from "./components/listers/주문관리Cards"
import 주문관리Detail from "./components/listers/주문관리Detail"

import 주문상세보기View from "./components/주문상세보기View"
import 주문상세보기ViewDetail from "./components/주문상세보기ViewDetail"
import 결제이력Manager from "./components/listers/결제이력Cards"
import 결제이력Detail from "./components/listers/결제이력Detail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/주문',
                name: '주문Manager',
                component: 주문Manager
            },
            {
                path: '/주문/:id',
                name: '주문Detail',
                component: 주문Detail
            },

            {
                path: '/통합주문상태',
                name: '통합주문상태View',
                component: 통합주문상태View
            },
            {
                path: '/통합주문상태/:id',
                name: '통합주문상태ViewDetail',
                component: 통합주문상태ViewDetail
            },
            {
                path: '/주문관리',
                name: '주문관리Manager',
                component: 주문관리Manager
            },
            {
                path: '/주문관리/:id',
                name: '주문관리Detail',
                component: 주문관리Detail
            },

            {
                path: '/주문상세보기',
                name: '주문상세보기View',
                component: 주문상세보기View
            },
            {
                path: '/주문상세보기/:id',
                name: '주문상세보기ViewDetail',
                component: 주문상세보기ViewDetail
            },
            {
                path: '/결제이력',
                name: '결제이력Manager',
                component: 결제이력Manager
            },
            {
                path: '/결제이력/:id',
                name: '결제이력Detail',
                component: 결제이력Detail
            },




    ]
})

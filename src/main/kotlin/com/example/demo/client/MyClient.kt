package com.example.demo.client

import com.example.demo.props.MyProps
import javax.annotation.PostConstruct
import org.springframework.stereotype.Component


@Component
class MyClient(
    val props: MyProps
) {

    @PostConstruct
    fun say(){
        println(props.age)
        println(props.name)
    }


}
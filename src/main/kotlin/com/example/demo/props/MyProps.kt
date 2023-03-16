package com.example.demo.props

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration


@Configuration
@RefreshScope
@ConfigurationProperties("http.my")
class MyProps : Props()


open class Props(
    var age: Int = 18,
    var name: String = "Tim"
) {
    init {
        println("Init MyProps")
    }
}
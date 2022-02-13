package com.kafka.producer.simple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringKafkaProducerSimpleApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringKafkaProducerSimpleApplication>(*args)
}

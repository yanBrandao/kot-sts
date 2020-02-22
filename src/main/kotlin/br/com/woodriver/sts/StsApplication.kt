package br.com.woodriver.sts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StsApplication

fun main(args: Array<String>) {
	runApplication<StsApplication>(*args)
}

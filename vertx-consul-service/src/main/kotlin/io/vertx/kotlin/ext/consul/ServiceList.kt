package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceList
import io.vertx.ext.consul.Service

fun ServiceList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Service>? = null): ServiceList = io.vertx.ext.consul.ServiceList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}


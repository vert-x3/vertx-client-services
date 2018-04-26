package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceEntryList
import io.vertx.ext.consul.ServiceEntry

fun ServiceEntryList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.ServiceEntry>? = null): ServiceEntryList = io.vertx.ext.consul.ServiceEntryList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}


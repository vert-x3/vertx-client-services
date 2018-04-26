package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.EventList
import io.vertx.ext.consul.Event

fun EventList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Event>? = null): EventList = io.vertx.ext.consul.EventList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}


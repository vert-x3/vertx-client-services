package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.SessionList
import io.vertx.ext.consul.Session

fun SessionList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Session>? = null): SessionList = io.vertx.ext.consul.SessionList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}


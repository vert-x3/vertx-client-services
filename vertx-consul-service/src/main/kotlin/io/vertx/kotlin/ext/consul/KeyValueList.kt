package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValueList
import io.vertx.ext.consul.KeyValue

fun KeyValueList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.KeyValue>? = null): KeyValueList = io.vertx.ext.consul.KeyValueList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

